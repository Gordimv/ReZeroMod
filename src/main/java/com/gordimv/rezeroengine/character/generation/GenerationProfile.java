package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.character.PotentialTier;
import com.gordimv.rezeroengine.util.random.WeightedTable;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * GenerationProfile
 *
 * Defines how a character should be generated.
 *
 * Every CharacterPath owns one GenerationProfile.
 *
 * This keeps generation logic completely separate from
 * gameplay data.
 * ============================================================
 */
public final class GenerationProfile {

    private final WeightedTable<PotentialTier> magicalTable;

    private final WeightedTable<PotentialTier> physicalTable;

    private final WeightedTable<PotentialTier> mentalTable;

    private final WeightedTable<PotentialTier> craftingTable;

    private final WeightedTable<PotentialTier> socialTable;

    public GenerationProfile(
            WeightedTable<PotentialTier> magicalTable,
            WeightedTable<PotentialTier> physicalTable,
            WeightedTable<PotentialTier> mentalTable,
            WeightedTable<PotentialTier> craftingTable,
            WeightedTable<PotentialTier> socialTable
    ) {

        this.magicalTable =
                Objects.requireNonNull(magicalTable);

        this.physicalTable =
                Objects.requireNonNull(physicalTable);

        this.mentalTable =
                Objects.requireNonNull(mentalTable);

        this.craftingTable =
                Objects.requireNonNull(craftingTable);

        this.socialTable =
                Objects.requireNonNull(socialTable);
    }

    public WeightedTable<PotentialTier> getMagicalTable() {
        return magicalTable;
    }

    public WeightedTable<PotentialTier> getPhysicalTable() {
        return physicalTable;
    }

    public WeightedTable<PotentialTier> getMentalTable() {
        return mentalTable;
    }

    public WeightedTable<PotentialTier> getCraftingTable() {
        return craftingTable;
    }

    public WeightedTable<PotentialTier> getSocialTable() {
        return socialTable;
    }
}