package com.gordimv.rezeroengine.character;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterPotential
 *
 * Stores every innate aptitude belonging to a player.
 *
 * Each aptitude is represented by a PotentialValue.
 *
 * This class intentionally knows nothing about gameplay.
 * It only stores generated character potential.
 * ============================================================
 */
public final class CharacterPotential {

    /**
     * Every generated aptitude.
     */
    private final EnumMap<PotentialType, PotentialValue> potentials =
            new EnumMap<>(PotentialType.class);

    public CharacterPotential() {

        for (PotentialType type : PotentialType.values()) {

            potentials.put(type, new PotentialValue());

        }
    }

    /**
     * Returns a potential.
     */
    public PotentialValue get(PotentialType type) {

        return potentials.get(
                Objects.requireNonNull(type, "type")
        );
    }

    /**
     * Replaces a generated potential.
     */
    public void set(
            PotentialType type,
            PotentialValue value
    ) {

        potentials.put(
                Objects.requireNonNull(type, "type"),
                Objects.requireNonNull(value, "value")
        );
    }

    /**
     * Returns every potential.
     */
    public Map<PotentialType, PotentialValue> getPotentials() {
        return Collections.unmodifiableMap(potentials);
    }
}