package com.gordimv.rezeroengine.save;

import com.gordimv.rezeroengine.magic.MagicProfile;
import com.gordimv.rezeroengine.player.PlayerProfile;
import com.gordimv.rezeroengine.race.RaceProfile;

import java.util.UUID;

/**
 * ============================================================
 * ReZero Engine
 *
 * PlayerData
 *
 * Master container for every player's data.
 *
 * Every gameplay system owns its own Profile class.
 * PlayerData simply groups them together under one UUID.
 *
 * Future additions:
 *
 * CombatProfile
 * AuthorityProfile
 * DivineProtectionProfile
 * SpiritProfile
 * QuestProfile
 * RelationshipProfile
 * ReputationProfile
 * InventoryProfile
 * ReturnByDeathProfile
 *
 * None of those systems should know about each other.
 * ============================================================
 */
public final class PlayerData {

    /**
     * Player UUID.
     */
    private final UUID uuid;

    /**
     * Universal player information.
     */
    private final PlayerProfile playerProfile;

    /**
     * Race system.
     */
    private final RaceProfile raceProfile;

    /**
     * Magic system.
     */
    private final MagicProfile magicProfile;

    public PlayerData(UUID uuid, String playerName) {

        this.uuid = uuid;

        this.playerProfile = new PlayerProfile(uuid, playerName);

        this.raceProfile = new RaceProfile();

        this.magicProfile = new MagicProfile();
    }

    public UUID getUuid() {
        return uuid;
    }

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public RaceProfile getRaceProfile() {
        return raceProfile;
    }

    public MagicProfile getMagicProfile() {
        return magicProfile;
    }
}