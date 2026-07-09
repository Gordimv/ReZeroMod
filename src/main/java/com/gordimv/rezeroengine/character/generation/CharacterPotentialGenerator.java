package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.character.CharacterPotential;
import com.gordimv.rezeroengine.character.PotentialTier;
import com.gordimv.rezeroengine.character.PotentialType;
import com.gordimv.rezeroengine.character.PotentialValue;
import com.gordimv.rezeroengine.save.PlayerData;
import com.gordimv.rezeroengine.util.random.WeightedTable;

import java.util.Objects;
import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterPotentialGenerator
 *
 * Generates every innate aptitude for a new character.
 *
 * This class ONLY performs generation.
 *
 * Validation and balancing belong to GenerationResolver.
 * ============================================================
 */
public final class CharacterPotentialGenerator {

    private final PotentialScoreGenerator scoreGenerator;

    public CharacterPotentialGenerator() {
        this(new PotentialScoreGenerator());
    }

    public CharacterPotentialGenerator(
            PotentialScoreGenerator scoreGenerator
    ) {

        this.scoreGenerator =
                Objects.requireNonNull(
                        scoreGenerator,
                        "scoreGenerator"
                );
    }

    /**
     * Generates every character potential.
     */
    public void generate(GenerationContext context) {

        Objects.requireNonNull(context, "context");

        PlayerData playerData =
                context.getPlayerData();

        CharacterPotential potential =
                playerData
                        .getCharacterProfile()
                        .getPotential();

        GenerationProfile profile =
                context.getGenerationProfile();

        Random random =
                context.getRandom();

        for (PotentialType type : PotentialType.values()) {

            generatePotential(
                    type,
                    profile,
                    potential,
                    random
            );
        }
    }

    /*
     * =========================================================
     * Internal Generation
     * =========================================================
     */

    private void generatePotential(

            PotentialType type,

            GenerationProfile profile,

            CharacterPotential potential,

            Random random
    ) {

        WeightedTable<PotentialTier> table =
                profile.getTable(type);

        PotentialTier tier =
                rollTier(
                        table,
                        random
                );

        int score =
                rollScore(
                        tier,
                        random
                );

        potential.set(

                type,

                new PotentialValue(
                        tier,
                        score
                )
        );
    }

    /*
     * =========================================================
     * Helpers
     * =========================================================
     */

    private PotentialTier rollTier(

            WeightedTable<PotentialTier> table,

            Random random
    ) {

        return table.roll(random);
    }

    private int rollScore(

            PotentialTier tier,

            Random random
    ) {

        return scoreGenerator.generate(
                tier,
                random
        );
    }
}