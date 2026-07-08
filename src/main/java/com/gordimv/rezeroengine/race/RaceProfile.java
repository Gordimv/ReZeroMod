package com.gordimv.rezeroengine.race;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * RaceProfile
 *
 * Stores the player's current race.
 *
 * Race-specific gameplay is implemented by dedicated
 * race systems, not by this profile.
 * ============================================================
 */
public final class RaceProfile {

    private RaceType race = RaceType.HUMAN;

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        this.race = Objects.requireNonNull(race, "race");
    }
}