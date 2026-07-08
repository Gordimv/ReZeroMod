package com.gordimv.rezeroengine.magic;

import com.gordimv.rezeroengine.save.PlayerData;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * GateGenerator
 *
 * Responsible for generating a player's initial Gate.
 *
 * Future versions will support:
 * - Random gate quality
 * - Special traits
 * - Story modifiers
 * - Divine Protections
 * - Authorities
 * ============================================================
 */
public final class GateGenerator {

    /**
     * Generates the player's starting Gate.
     */
    public void generate(PlayerData playerData) {

        Objects.requireNonNull(playerData, "playerData");

        Gate gate = playerData
                .getMagicProfile()
                .getGate();

        gate.setState(GateState.HEALTHY);

        gate.setManaOutput(100);
    }
}