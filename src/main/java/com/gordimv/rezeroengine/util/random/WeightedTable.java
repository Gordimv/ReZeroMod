package com.gordimv.rezeroengine.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * WeightedTable
 *
 * Immutable-style weighted probability table.
 *
 * Used by every weighted generation system throughout the
 * engine.
 * ============================================================
 */
public final class WeightedTable<T> {

    private final List<WeightedEntry<T>> entries =
            new ArrayList<>();

    public WeightedTable<T> add(T value, int weight) {

        entries.add(new WeightedEntry<>(value, weight));

        return this;
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public int size() {
        return entries.size();
    }

    public List<WeightedEntry<T>> getEntries() {
        return Collections.unmodifiableList(entries);
    }

    public T roll(Random random) {

        Objects.requireNonNull(random, "random");

        if (entries.isEmpty()) {
            throw new IllegalStateException(
                    "Cannot roll from an empty WeightedTable."
            );
        }

        int totalWeight = 0;

        for (WeightedEntry<T> entry : entries) {
            totalWeight += entry.getWeight();
        }

        int result = random.nextInt(totalWeight);

        int current = 0;

        for (WeightedEntry<T> entry : entries) {

            current += entry.getWeight();

            if (result < current) {
                return entry.getValue();
            }
        }

        throw new IllegalStateException(
                "WeightedTable roll failed."
        );
    }
}