package com.gordimv.rezeroengine.character.generation;

import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;
import java.util.Random;

/**
 * ============================================================
 * Project Lugunica
 *
 * GenerationContext
 *
 * Shared context passed through the entire character
 * generation pipeline.
 *
 * Every generation system receives the same context object.
 *
 * This keeps generator method signatures small while making
 * future expansion simple.
 * ============================================================
 */
public final class GenerationContext {

    private final PlayerData playerData;

    private final GenerationProfile generationProfile;

    private final Random random;

    public GenerationContext(
            PlayerData playerData,
            GenerationProfile generationProfile,
            Random random
    ) {

        this.playerData =
                Objects.requireNonNull(playerData, "playerData");

        this.generationProfile =
                Objects.requireNonNull(generationProfile, "generationProfile");

        this.random =
                Objects.requireNonNull(random, "random");
    }

    public PlayerData getPlayerData() {
        return playerData;
    }

    public GenerationProfile getGenerationProfile() {
        return generationProfile;
    }

    public Random getRandom() {
        return random;
    }
}