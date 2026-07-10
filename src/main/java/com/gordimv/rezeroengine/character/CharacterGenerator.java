package com.gordimv.rezeroengine.character;

import com.gordimv.rezeroengine.character.generation.CharacterGenerationProfiles;
import com.gordimv.rezeroengine.character.generation.CharacterPotentialGenerator;
import com.gordimv.rezeroengine.character.generation.GenerationContext;
import com.gordimv.rezeroengine.character.generation.GenerationProfile;
import com.gordimv.rezeroengine.magic.GateGenerator;
import com.gordimv.rezeroengine.race.RaceGenerator;
import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;
import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterGenerator
 *
 * Coordinates the complete character generation pipeline.
 *
 * This class performs no gameplay generation itself.
 * It only orchestrates specialized generators.
 * ============================================================
 */
public final class CharacterGenerator {

    private final RaceGenerator raceGenerator;

    private final CharacterPotentialGenerator potentialGenerator;

    private final GateGenerator gateGenerator;

    public CharacterGenerator() {

        this(
                new RaceGenerator(),
                new CharacterPotentialGenerator(),
                new GateGenerator()
        );
    }

    public CharacterGenerator(

            RaceGenerator raceGenerator,

            CharacterPotentialGenerator potentialGenerator,

            GateGenerator gateGenerator
    ) {

        this.raceGenerator =
                Objects.requireNonNull(raceGenerator);

        this.potentialGenerator =
                Objects.requireNonNull(potentialGenerator);

        this.gateGenerator =
                Objects.requireNonNull(gateGenerator);
    }

    public GenerationResult generate(PlayerData playerData) {

        Objects.requireNonNull(playerData);

        CharacterPath path =
                playerData
                        .getCharacterProfile()
                        .getPath();

        GenerationProfile profile =
                CharacterGenerationProfiles.get(path);

        GenerationContext context =
                new GenerationContext(
                        playerData,
                        profile,
                        new Random()
                );

        /*
         * =====================================================
         * Generation Pipeline
         * =====================================================
         */

        raceGenerator.generate(playerData);

        potentialGenerator.generate(context);

        gateGenerator.generate(playerData);

        generateMagic(playerData);

        generatePhysicalTalent(playerData);

        generateDivineProtection(playerData);

        return GenerationResult.success();
    }

    /*
     * =========================================================
     * Future Pipeline
     * =========================================================
     */

    private void generateMagic(PlayerData playerData) {

        // Future MagicGenerator
    }

    private void generatePhysicalTalent(PlayerData playerData) {

        // Future TalentGenerator
    }

    private void generateDivineProtection(PlayerData playerData) {

        // Future DivineProtectionGenerator
    }
}