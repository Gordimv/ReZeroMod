package com.gordimv.rezeroengine.character;

import com.gordimv.rezeroengine.magic.GateGenerator;
import com.gordimv.rezeroengine.race.RaceGenerator;
import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterGenerator
 *
 * Coordinates the complete character generation pipeline.
 *
 * This class never performs generation itself.
 * It delegates every generation step to dedicated systems.
 * ============================================================
 */
public final class CharacterGenerator {

    private final RaceGenerator raceGenerator;
    private final GateGenerator gateGenerator;

    public CharacterGenerator() {
        this(
                new RaceGenerator(),
                new GateGenerator()
        );
    }

    public CharacterGenerator(
            RaceGenerator raceGenerator,
            GateGenerator gateGenerator
    ) {

        this.raceGenerator =
                Objects.requireNonNull(raceGenerator, "raceGenerator");

        this.gateGenerator =
                Objects.requireNonNull(gateGenerator, "gateGenerator");
    }

    public GenerationResult generate(PlayerData playerData) {

        Objects.requireNonNull(playerData, "playerData");

        /*
         * =====================================================
         * Character Generation Pipeline
         * =====================================================
         *
         * 1. Race
         * 2. Gate
         * 3. Magic Affinities
         * 4. Physical Talent
         * 5. Divine Protection
         * 6. Future systems...
         */

        raceGenerator.generate(playerData);

        gateGenerator.generate(playerData);

        generateMagic(playerData);

        generatePhysicalTalent(playerData);

        generateDivineProtection(playerData);

        return GenerationResult.success();
    }

    /*
     * =========================================================
     * Pipeline Steps
     * =========================================================
     */

    private void generateMagic(PlayerData playerData) {

        // Future MagicAffinityGenerator
    }

    private void generatePhysicalTalent(PlayerData playerData) {

        // Future TalentGenerator
    }

    private void generateDivineProtection(PlayerData playerData) {

        // Future DivineProtectionGenerator
    }
}