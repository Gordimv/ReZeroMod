package com.gordimv.rezeroengine.character;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterPotentialGenerator
 *
 * Generates a player's hidden natural potential.
 *
 * Character Potential represents what a player is naturally
 * gifted at. It is NOT skill and is never shown directly to
 * the player.
 *
 * Every future gameplay system derives from this generation.
 * ============================================================
 */
public final class CharacterPotentialGenerator {

    /**
     * Generates a player's hidden potential.
     */
    public void generate(CharacterProfile characterProfile) {

        Objects.requireNonNull(characterProfile, "characterProfile");

        CharacterPotential potential = characterProfile.getPotential();

        switch (characterProfile.getPath()) {

            case MAGIC_FOCUS ->
                    generateMagicFocus(potential);

            case PHYSICAL_FOCUS ->
                    generatePhysicalFocus(potential);

            case BALANCED ->
                    generateBalanced(potential);

            case FATES_CHOICE ->
                    generateFatesChoice(potential);
        }
    }

    /*
     * =========================================================
     * Path Generators
     * =========================================================
     */

    private void generateMagicFocus(CharacterPotential potential) {

        potential.setMagicalAptitude(PotentialTier.HIGH);

        potential.setPhysicalAptitude(PotentialTier.AVERAGE);

        potential.setMentalAptitude(PotentialTier.ABOVE_AVERAGE);

        potential.setCraftingAptitude(PotentialTier.AVERAGE);

        potential.setSocialAptitude(PotentialTier.AVERAGE);
    }

    private void generatePhysicalFocus(CharacterPotential potential) {

        potential.setMagicalAptitude(PotentialTier.AVERAGE);

        potential.setPhysicalAptitude(PotentialTier.HIGH);

        potential.setMentalAptitude(PotentialTier.AVERAGE);

        potential.setCraftingAptitude(PotentialTier.AVERAGE);

        potential.setSocialAptitude(PotentialTier.AVERAGE);
    }

    private void generateBalanced(CharacterPotential potential) {

        potential.setMagicalAptitude(PotentialTier.ABOVE_AVERAGE);

        potential.setPhysicalAptitude(PotentialTier.ABOVE_AVERAGE);

        potential.setMentalAptitude(PotentialTier.ABOVE_AVERAGE);

        potential.setCraftingAptitude(PotentialTier.AVERAGE);

        potential.setSocialAptitude(PotentialTier.AVERAGE);
    }

    private void generateFatesChoice(CharacterPotential potential) {

        /*
         * Temporary implementation.
         *
         * Sprint 23 will replace this with the complete
         * weighted generation algorithm.
         */

        generateBalanced(potential);
    }
}