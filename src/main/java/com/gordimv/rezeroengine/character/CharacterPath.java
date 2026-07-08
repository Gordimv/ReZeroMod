package com.gordimv.rezeroengine.character;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterPath
 *
 * Represents the player's desired starting path.
 *
 * This is NOT a class system.
 *
 * The chosen path only influences generation probabilities.
 * It never guarantees outcomes.
 * ============================================================
 */
public enum CharacterPath {

    /**
     * Favors magical aptitude.
     */
    MAGIC_FOCUS("magic_focus"),

    /**
     * Favors physical aptitude.
     */
    PHYSICAL_FOCUS("physical_focus"),

    /**
     * Attempts to create a hybrid character.
     */
    BALANCED("balanced"),

    /**
     * Leaves everything entirely to fate.
     */
    FATES_CHOICE("fates_choice");

    private final String id;

    CharacterPath(String id) {
        this.id = id;
    }

    /**
     * Unique serialization id.
     */
    public String getId() {
        return id;
    }

    /**
     * Converts an id back into a CharacterPath.
     */
    public static CharacterPath fromId(String id) {

        if (id == null) {
            return FATES_CHOICE;
        }

        for (CharacterPath path : values()) {
            if (path.id.equalsIgnoreCase(id)) {
                return path;
            }
        }

        return FATES_CHOICE;
    }
}