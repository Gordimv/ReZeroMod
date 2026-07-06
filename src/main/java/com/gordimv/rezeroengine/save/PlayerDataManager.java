package com.gordimv.rezeroengine.save;

import net.minecraft.server.level.ServerPlayer;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ============================================================
 * ReZero Engine
 *
 * PlayerDataManager
 *
 * Owns every PlayerData currently loaded into memory.
 *
 * Saving/loading will be added later without changing
 * this public API.
 * ============================================================
 */
public final class PlayerDataManager {

    private static final Map<UUID, PlayerData> PLAYER_DATA =
            new ConcurrentHashMap<>();

    private PlayerDataManager() {
    }

    /**
     * Returns the player's data.
     * Creates it if necessary.
     */
    public static PlayerData get(ServerPlayer player) {

        return PLAYER_DATA.computeIfAbsent(
                player.getUUID(),
                uuid -> new PlayerData(
                        uuid,
                        player.getGameProfile().getName()
                )
        );
    }

    /**
     * Returns player data if loaded.
     */
    public static PlayerData get(UUID uuid) {
        return PLAYER_DATA.get(uuid);
    }

    /**
     * Returns whether a player is loaded.
     */
    public static boolean isLoaded(UUID uuid) {
        return PLAYER_DATA.containsKey(uuid);
    }

    /**
     * Removes a player from memory.
     */
    public static void unload(UUID uuid) {
        PLAYER_DATA.remove(uuid);
    }

    /**
     * Clears every loaded player.
     */
    public static void clear() {
        PLAYER_DATA.clear();
    }

    /**
     * Number of loaded players.
     */
    public static int getLoadedPlayerCount() {
        return PLAYER_DATA.size();
    }

    /**
     * Read-only collection of loaded players.
     */
    public static Collection<PlayerData> getLoadedPlayers() {
        return PLAYER_DATA.values();
    }
}