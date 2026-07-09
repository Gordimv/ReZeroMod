package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.character.PotentialTier;

import java.util.Objects;
import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * PotentialScoreGenerator
 *
 * Generates the hidden score associated with a PotentialTier.
 *
 * The score is never shown directly to players.
 *
 * Gameplay systems use this value for fine-grained calculations
 * within the same visible tier.
 * ============================================================
 */
public final class PotentialScoreGenerator {

    /**
     * Generates a hidden score.
     */
    public int generate(
            PotentialTier tier,
            Random random
    ) {

        Objects.requireNonNull(tier, "tier");
        Objects.requireNonNull(random, "random");

        return switch (tier) {

            case VERY_LOW ->
                    random.nextInt(10);

            case LOW ->
                    10 + random.nextInt(15);

            case BELOW_AVERAGE ->
                    25 + random.nextInt(15);

            case AVERAGE ->
                    40 + random.nextInt(20);

            case ABOVE_AVERAGE ->
                    60 + random.nextInt(15);

            case HIGH ->
                    75 + random.nextInt(15);

            case EXCEPTIONAL ->
                    90 + random.nextInt(11);
        };
    }
}