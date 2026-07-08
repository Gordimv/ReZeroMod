package com.gordimv.rezeroengine.util.random;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * WeightedEntry
 *
 * Represents a value and its associated weight.
 *
 * Used by weighted generation systems throughout the engine.
 * ============================================================
 */
public final class WeightedEntry<T> {

    private final T value;

    private final int weight;

    public WeightedEntry(T value, int weight) {

        this.value = Objects.requireNonNull(value, "value");

        if (weight <= 0) {
            throw new IllegalArgumentException("weight must be positive");
        }

        this.weight = weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}