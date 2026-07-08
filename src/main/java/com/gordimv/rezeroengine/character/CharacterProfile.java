package com.gordimv.rezeroengine.character;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterProfile
 *
 * Stores persistent character generation data.
 * ============================================================
 */
public final class CharacterProfile {

    /**
     * Current generation state.
     */
    private CharacterState state = CharacterState.NOT_GENERATED;

    /**
     * Player-selected starting path.
     */
    private CharacterPath path = CharacterPath.FATES_CHOICE;

    /**
     * Hidden innate character potential.
     */
    private final CharacterPotential potential =
            new CharacterPotential();

    public CharacterState getState() {
        return state;
    }

    public void setState(CharacterState state) {
        this.state = Objects.requireNonNull(state, "state");
    }

    public CharacterPath getPath() {
        return path;
    }

    public void setPath(CharacterPath path) {
        this.path = Objects.requireNonNull(path, "path");
    }

    public CharacterPotential getPotential() {
        return potential;
    }
}