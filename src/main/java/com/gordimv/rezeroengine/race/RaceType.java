package com.gordimv.rezeroengine.race;

/**
 * Every playable race.
 *
 * Additional races can be added later without
 * modifying the player system.
 */
public enum RaceType {

    HUMAN("human");

    private final String id;

    RaceType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static RaceType fromId(String id) {

        for (RaceType type : values()) {
            if (type.id.equalsIgnoreCase(id)) {
                return type;
            }
        }

        return HUMAN;
    }
}