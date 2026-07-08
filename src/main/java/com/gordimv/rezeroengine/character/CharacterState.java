package com.gordimv.rezeroengine.character;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterState
 *
 * Represents the generation state of a player's character.
 *
 * Character generation only happens once unless explicitly
 * reset by an administrator or future debug tools.
 * ============================================================
 */
public enum CharacterState {

    /**
     * Character has not been generated.
     */
    NOT_GENERATED,

    /**
     * Character generation is currently running.
     */
    GENERATING,

    /**
     * Character generation has completed.
     */
    GENERATED

}