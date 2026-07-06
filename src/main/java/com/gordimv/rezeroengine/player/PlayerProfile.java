package com.gordimv.rezeroengine.player;

import java.util.UUID;

/**
 * Universal player data only.
 *
 * This class intentionally contains no subsystem data.
 * Every gameplay system (Race, Magic, Combat, Spirits,
 * Authorities, Divine Protections, etc.) owns its own
 * profile and manager.
 */
public final class PlayerProfile {

    private final UUID uuid;

    private String playerName;

    private int level;

    private long experience;

    private int skillPoints;

    private int deaths;

    public PlayerProfile(UUID uuid, String playerName) {

        this.uuid = uuid;
        this.playerName = playerName;

        this.level = 1;
        this.experience = 0L;
        this.skillPoints = 0;
        this.deaths = 0;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = Math.max(1, level);
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = Math.max(0L, experience);
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public void setSkillPoints(int skillPoints) {
        this.skillPoints = Math.max(0, skillPoints);
    }

    public int getDeaths() {
        return deaths;
    }

    public void addDeath() {
        deaths++;
    }
}