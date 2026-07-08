package com.gordimv.rezeroengine.character;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * GenerationResult
 *
 * Immutable result returned after attempting
 * character generation.
 *
 * The engine communicates reason codes instead of
 * user-facing text so localization stays outside
 * the gameplay layer.
 * ============================================================
 */
public final class GenerationResult {

    private final boolean success;

    private final String reason;

    private GenerationResult(boolean success, String reason) {
        this.success = success;
        this.reason = Objects.requireNonNull(reason);
    }

    public static GenerationResult success() {
        return new GenerationResult(true, "SUCCESS");
    }

    public static GenerationResult failure(String reason) {
        return new GenerationResult(false, reason);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getReason() {
        return reason;
    }
}