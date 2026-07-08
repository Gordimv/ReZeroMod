package com.gordimv.rezeroengine.save;

import net.minecraftforge.common.capabilities.AutoRegisterCapability;

/**
 * ============================================================
 * Project Lugunica
 *
 * PlayerCapability
 *
 * Root capability exposed by Forge.
 *
 * The capability owns a single PlayerData instance for the
 * lifetime of the player.
 *
 * Gameplay code should never interact with Forge capabilities
 * directly.
 * ============================================================
 */
@AutoRegisterCapability
public interface PlayerCapability {

    /**
     * Returns the player's persistent data.
     */
    PlayerData getPlayerData();
}