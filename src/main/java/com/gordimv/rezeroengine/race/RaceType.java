package com.gordimv.rezeroengine.race;

/**
 * Identifies a playable race.
 *
 * This enum currently defines the built-in races
 * shipped with Project Lugunica.
 *
 * Future engine versions may migrate race definitions
 * to a registry for data-driven expansion.
 */
public enum RaceType {

    HUMAN("human");

    private static final RaceType DEFAULT = HUMAN;

    private final String id;

    RaceType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static RaceType fromId(String id) {

        if (id == null) {
            return DEFAULT;
        }

        for (RaceType type : values()) {
            if (type.id.equalsIgnoreCase(id)) {
                return type;
            }
        }

        return DEFAULT;
    }
}