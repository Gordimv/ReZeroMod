package com.gordimv.rezeroengine.character;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterPotential
 *
 * Represents a player's innate natural aptitudes.
 *
 * These values are hidden from the player and are used by
 * generation systems to create coherent characters.
 *
 * Potential is NOT skill.
 * Potential is what a player is born with.
 *
 * Skill is earned through gameplay.
 * ============================================================
 */
public final class CharacterPotential {

    /**
     * Natural magical aptitude.
     */
    private PotentialTier magicalAptitude = PotentialTier.AVERAGE;

    /**
     * Natural physical aptitude.
     */
    private PotentialTier physicalAptitude = PotentialTier.AVERAGE;

    /**
     * Natural mental aptitude.
     */
    private PotentialTier mentalAptitude = PotentialTier.AVERAGE;

    /**
     * Natural crafting aptitude.
     */
    private PotentialTier craftingAptitude = PotentialTier.AVERAGE;

    /**
     * Natural social aptitude.
     */
    private PotentialTier socialAptitude = PotentialTier.AVERAGE;

    public PotentialTier getMagicalAptitude() {
        return magicalAptitude;
    }

    public void setMagicalAptitude(PotentialTier aptitude) {
        magicalAptitude = Objects.requireNonNull(aptitude, "aptitude");
    }

    public PotentialTier getPhysicalAptitude() {
        return physicalAptitude;
    }

    public void setPhysicalAptitude(PotentialTier aptitude) {
        physicalAptitude = Objects.requireNonNull(aptitude, "aptitude");
    }

    public PotentialTier getMentalAptitude() {
        return mentalAptitude;
    }

    public void setMentalAptitude(PotentialTier aptitude) {
        mentalAptitude = Objects.requireNonNull(aptitude, "aptitude");
    }

    public PotentialTier getCraftingAptitude() {
        return craftingAptitude;
    }

    public void setCraftingAptitude(PotentialTier aptitude) {
        craftingAptitude = Objects.requireNonNull(aptitude, "aptitude");
    }

    public PotentialTier getSocialAptitude() {
        return socialAptitude;
    }

    public void setSocialAptitude(PotentialTier aptitude) {
        socialAptitude = Objects.requireNonNull(aptitude, "aptitude");
    }
}