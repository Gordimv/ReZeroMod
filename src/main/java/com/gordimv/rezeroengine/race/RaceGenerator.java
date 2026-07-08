package com.gordimv.rezeroengine.race;

import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * RaceGenerator
 *
 * Responsible for assigning a player's initial race.
 *
 * This class only handles generation.
 * It does not implement race gameplay.
 * ============================================================
 */
public final class RaceGenerator {

    /**
     * Generates the player's starting race.
     *
     * Current implementation:
     * - Human (default)
     *
     * Future implementations may use:
     * - Character creation choices
     * - Server configuration
     * - World rules
     * - Datapacks
     * - Custom races
     */
    public void generate(PlayerData playerData) {

        Objects.requireNonNull(playerData, "playerData");

        RaceProfile profile = playerData.getRaceProfile();

        RaceType startingRace = determineStartingRace(playerData);

        profile.setRace(startingRace);
    }

    /**
     * Determines which race the player should begin with.
     *
     * Future versions will contain the complete
     * race generation algorithm.
     */
    private RaceType determineStartingRace(PlayerData playerData) {

        Objects.requireNonNull(playerData, "playerData");

        /*
         * Future logic:
         *
         * - Character creation
         * - Server configuration
         * - World generation rules
         * - Datapacks
         * - Custom race registration
         */

        return RaceType.HUMAN;
    }
}