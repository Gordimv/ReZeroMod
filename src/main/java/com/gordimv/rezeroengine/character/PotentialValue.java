package com.gordimv.rezeroengine.character;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * PotentialValue
 *
 * Represents a single innate aptitude.
 *
 * The Tier is used by lore, NPCs and appraisal systems.
 *
 * The hidden score is used internally by gameplay systems to
 * generate nuanced values within the same tier.
 * ============================================================
 */
public final class PotentialValue {

    /**
     * Human-readable aptitude tier.
     */
    private PotentialTier tier;

    /**
     * Hidden engine score.
     *
     * Range:
     * 0-100
     */
    private int score;

    public PotentialValue() {
        this(PotentialTier.AVERAGE, 50);
    }

    public PotentialValue(PotentialTier tier, int score) {

        this.tier = Objects.requireNonNull(tier, "tier");

        setScore(score);
    }

    public PotentialTier getTier() {
        return tier;
    }

    public void setTier(PotentialTier tier) {
        this.tier = Objects.requireNonNull(tier, "tier");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {

        this.score = Math.max(0, Math.min(100, score));
    }
}