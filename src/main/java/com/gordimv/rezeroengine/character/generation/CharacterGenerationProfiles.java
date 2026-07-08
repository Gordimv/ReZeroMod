package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.character.CharacterPath;
import com.gordimv.rezeroengine.character.PotentialTier;
import com.gordimv.rezeroengine.util.random.WeightedTable;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterGenerationProfiles
 *
 * Contains every built-in CharacterPath generation profile.
 *
 * This class defines HOW characters are generated.
 *
 * CharacterGenerator should never contain hardcoded
 * probability values.
 * ============================================================
 */
public final class CharacterGenerationProfiles {

    private CharacterGenerationProfiles() {
    }

    /**
     * Returns the generation profile for a character path.
     */
    public static GenerationProfile get(CharacterPath path) {

        return switch (path) {

            case MAGIC_FOCUS -> magicFocus();

            case PHYSICAL_FOCUS -> physicalFocus();

            case BALANCED -> balanced();

            case FATES_CHOICE -> fate();
        };
    }

    /*
     * =========================================================
     * Built-in Profiles
     * =========================================================
     */

    private static GenerationProfile magicFocus() {

        return new GenerationProfile(

                magicTable(),

                balancedTable(),

                balancedTable(),

                balancedTable(),

                balancedTable()
        );
    }

    private static GenerationProfile physicalFocus() {

        return new GenerationProfile(

                balancedTable(),

                physicalTable(),

                balancedTable(),

                balancedTable(),

                balancedTable()
        );
    }

    private static GenerationProfile balanced() {

        return new GenerationProfile(

                balancedTable(),

                balancedTable(),

                balancedTable(),

                balancedTable(),

                balancedTable()
        );
    }

    /*
     * Temporary implementation.
     *
     * Sprint 24 will replace this with
     * the Fate generation engine.
     */
    private static GenerationProfile fate() {

        return balanced();
    }

    /*
     * =========================================================
     * Weighted Tables
     * =========================================================
     */

    private static WeightedTable<PotentialTier> balancedTable() {

        return new WeightedTable<PotentialTier>()

                .add(PotentialTier.VERY_LOW,2)

                .add(PotentialTier.LOW,8)

                .add(PotentialTier.BELOW_AVERAGE,18)

                .add(PotentialTier.AVERAGE,40)

                .add(PotentialTier.ABOVE_AVERAGE,20)

                .add(PotentialTier.HIGH,10)

                .add(PotentialTier.EXCEPTIONAL,2);
    }

    private static WeightedTable<PotentialTier> magicTable() {

        return new WeightedTable<PotentialTier>()

                .add(PotentialTier.VERY_LOW,1)

                .add(PotentialTier.LOW,3)

                .add(PotentialTier.BELOW_AVERAGE,10)

                .add(PotentialTier.AVERAGE,26)

                .add(PotentialTier.ABOVE_AVERAGE,34)

                .add(PotentialTier.HIGH,20)

                .add(PotentialTier.EXCEPTIONAL,6);
    }

    private static WeightedTable<PotentialTier> physicalTable() {

        return new WeightedTable<PotentialTier>()

                .add(PotentialTier.VERY_LOW,1)

                .add(PotentialTier.LOW,3)

                .add(PotentialTier.BELOW_AVERAGE,10)

                .add(PotentialTier.AVERAGE,26)

                .add(PotentialTier.ABOVE_AVERAGE,34)

                .add(PotentialTier.HIGH,20)

                .add(PotentialTier.EXCEPTIONAL,6);
    }

}