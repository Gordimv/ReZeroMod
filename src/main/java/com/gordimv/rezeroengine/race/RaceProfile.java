package com.gordimv.rezeroengine.race;

/**
 * Holds race-specific information.
 *
 * Every race will have its own bonuses,
 * passive abilities, weaknesses,
 * and progression rules.
 *
 * This keeps race logic completely
 * separate from PlayerProfile.
 */
public final class RaceProfile {

    private RaceType race;

    public RaceProfile() {
        this.race = RaceType.HUMAN;
    }

    public RaceType getRace() {
        return race;
    }

    public void setRace(RaceType race) {
        if (race != null) {
            this.race = race;
        }
    }

    public boolean isHuman() {
        return race == RaceType.HUMAN;
    }
}