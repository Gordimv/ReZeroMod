package com.gordimv.rezeroengine.character;

import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * CharacterManager
 *
 * Public entry point for the character system.
 *
 * Responsible for ensuring character generation only occurs
 * when appropriate.
 * ============================================================
 */
public final class CharacterManager {

    private final CharacterGenerator generator;

    public CharacterManager() {
        this(new CharacterGenerator());
    }

    public CharacterManager(CharacterGenerator generator) {
        this.generator = Objects.requireNonNull(generator, "generator");
    }

    /**
     * Generates a character if one has not already been created.
     */
    public GenerationResult initialize(PlayerData playerData,
                                       CharacterState state) {

        Objects.requireNonNull(playerData, "playerData");
        Objects.requireNonNull(state, "state");

        if (state == CharacterState.GENERATED) {
            return GenerationResult.failure("ALREADY_GENERATED");
        }

        return generator.generate(playerData);
    }
}