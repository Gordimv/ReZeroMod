package com.gordimv.rezeroengine.util.random;

import com.gordimv.rezeroengine.character.PotentialTier;

/**
 * ============================================================
 * Project Lugunica
 *
 * WeightedTables
 *
 * Factory class containing reusable weighted tables.
 *
 * Future versions will become datapack-driven.
 * ============================================================
 */
public final class WeightedTables {

    private WeightedTables() {
    }

    /**
     * Default balanced aptitude table.
     */
    public static WeightedTable<PotentialTier> balancedPotential() {

        return new WeightedTable<PotentialTier>()

                .add(PotentialTier.VERY_LOW, 2)

                .add(PotentialTier.LOW, 8)

                .add(PotentialTier.BELOW_AVERAGE, 20)

                .add(PotentialTier.AVERAGE, 40)

                .add(PotentialTier.ABOVE_AVERAGE, 20)

                .add(PotentialTier.HIGH, 8)

                .add(PotentialTier.EXCEPTIONAL, 2);
    }
}