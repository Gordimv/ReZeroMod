package com.gordimv.rezeroengine.save;

import com.gordimv.rezeroengine.character.CharacterProfile;
import com.gordimv.rezeroengine.magic.MagicProfile;
import com.gordimv.rezeroengine.player.PlayerProfile;
import com.gordimv.rezeroengine.race.RaceProfile;

import java.util.UUID;

/**
 * ============================================================
 * Project Lugunica
 *
 * PlayerData
 *
 * Root container for every gameplay system that belongs
 * to a single player.
 *
 * Every gameplay system owns its own Profile.
 * ============================================================
 */
public final class PlayerData {

    /*
     * =========================================================
     * Identity
     * =========================================================
     */

    private final UUID uuid;

    /*
     * =========================================================
     * Core Profiles
     * =========================================================
     */

    private final PlayerProfile playerProfile;

    private final CharacterProfile characterProfile;

    private final RaceProfile raceProfile;

    private final MagicProfile magicProfile;

    /*
     * =========================================================
     * Future Profiles
     * =========================================================
     *
     * CombatProfile
     * AuthorityProfile
     * DivineProtectionProfile
     * SpiritProfile
     * QuestProfile
     * ReputationProfile
     * RelationshipProfile
     * InventoryProfile
     * ReturnByDeathProfile
     */

    public PlayerData(UUID uuid, String playerName) {

        this.uuid = uuid;

        this.playerProfile = new PlayerProfile(uuid, playerName);

        this.characterProfile = new CharacterProfile();

        this.raceProfile = new RaceProfile();

        this.magicProfile = new MagicProfile();
    }

    /*
     * =========================================================
     * Identity
     * =========================================================
     */

    public UUID getUuid() {
        return uuid;
    }

    /*
     * =========================================================
     * Profiles
     * =========================================================
     */

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public CharacterProfile getCharacterProfile() {
        return characterProfile;
    }

    public RaceProfile getRaceProfile() {
        return raceProfile;
    }

    public MagicProfile getMagicProfile() {
        return magicProfile;
    }
}