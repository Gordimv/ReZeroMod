package com.gordimv.rezeroengine.util.random;

import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * RandomSource
 *
 * Central random provider used by gameplay systems.
 *
 * This prevents Random objects from being scattered
 * throughout the codebase.
 * ============================================================
 */
public final class RandomSource {

    private static final Random RANDOM = new Random();

    private RandomSource() {
    }

    public static Random get() {
        return RANDOM;
    }
}