package com.gordimv.rezeroengine.magic;

import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * MagicProfile
 *
 * Stores all persistent magic-related player data.
 *
 * This class owns a player's magical resources and progression.
 *
 * The Gate itself is represented by the Gate class.
 * ============================================================
 */
public final class MagicProfile {

    /**
     * Player's primary magic specialization.
     */
    private MagicType magicType = MagicType.NONE;

    /**
     * The player's Gate.
     */
    private final Gate gate = new Gate();

    /**
     * Current Mana.
     */
    private int mana = 100;

    /**
     * Maximum Mana.
     */
    private int maxMana = 100;

    /**
     * Current Od (life force).
     */
    private int od = 100;

    /**
     * Maximum Od.
     */
    private int maxOd = 100;

    /**
     * Affinity with each magical attribute.
     */
    private final EnumMap<MagicAffinity, Integer> affinities =
            new EnumMap<>(MagicAffinity.class);

    /**
     * Mastery level for each magic element.
     */
    private final EnumMap<MagicElement, Integer> masteries =
            new EnumMap<>(MagicElement.class);

    public MagicProfile() {

        for (MagicAffinity affinity : MagicAffinity.values()) {
            affinities.put(affinity, 0);
        }

        for (MagicElement element : MagicElement.values()) {
            masteries.put(element, 0);
        }
    }

    public MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(MagicType magicType) {
        this.magicType = Objects.requireNonNull(magicType, "magicType");
    }

    /**
     * Returns the player's Gate.
     */
    public Gate getGate() {
        return gate;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, Math.min(maxMana, mana));
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {

        this.maxMana = Math.max(0, maxMana);

        if (mana > this.maxMana) {
            mana = this.maxMana;
        }
    }

    public int getOd() {
        return od;
    }

    public void setOd(int od) {
        this.od = Math.max(0, Math.min(maxOd, od));
    }

    public int getMaxOd() {
        return maxOd;
    }

    public void setMaxOd(int maxOd) {

        this.maxOd = Math.max(0, maxOd);

        if (od > this.maxOd) {
            od = this.maxOd;
        }
    }

    public int getAffinity(MagicAffinity affinity) {
        return affinities.getOrDefault(
                Objects.requireNonNull(affinity, "affinity"),
                0
        );
    }

    public void setAffinity(MagicAffinity affinity, int value) {
        affinities.put(
                Objects.requireNonNull(affinity, "affinity"),
                Math.max(0, value)
        );
    }

    public int getMastery(MagicElement element) {
        return masteries.getOrDefault(
                Objects.requireNonNull(element, "element"),
                0
        );
    }

    public void setMastery(MagicElement element, int value) {
        masteries.put(
                Objects.requireNonNull(element, "element"),
                Math.max(0, value)
        );
    }

    public Map<MagicAffinity, Integer> getAffinities() {
        return Map.copyOf(affinities);
    }

    public Map<MagicElement, Integer> getMasteries() {
        return Map.copyOf(masteries);
    }
}