package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.character.PotentialTier;
import com.gordimv.rezeroengine.character.PotentialType;
import com.gordimv.rezeroengine.util.random.WeightedTable;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * GenerationProfile
 *
 * Stores the weighted generation tables for every
 * PotentialType.
 * ============================================================
 */
public final class GenerationProfile {

    private final EnumMap<PotentialType, WeightedTable<PotentialTier>> tables =
            new EnumMap<>(PotentialType.class);

    /**
     * Associates a weighted table with a potential type.
     */
    public GenerationProfile put(
            PotentialType type,
            WeightedTable<PotentialTier> table
    ) {

        tables.put(
                Objects.requireNonNull(type, "type"),
                Objects.requireNonNull(table, "table")
        );

        return this;
    }

    /**
     * Returns the weighted table for a potential.
     */
    public WeightedTable<PotentialTier> getTable(PotentialType type) {

        WeightedTable<PotentialTier> table =
                tables.get(Objects.requireNonNull(type, "type"));

        if (table == null) {
            throw new IllegalStateException(
                    "No generation table registered for " + type
            );
        }

        return table;
    }

    /**
     * Read-only view of all generation tables.
     */
    public Map<PotentialType, WeightedTable<PotentialTier>> getTables() {
        return Map.copyOf(tables);
    }
}