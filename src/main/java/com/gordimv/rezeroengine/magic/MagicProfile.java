package com.gordimv.rezeroengine.magic;

import java.util.EnumMap;
import java.util.Map;

/**
 * Stores all magic-related player data.
 */
public final class MagicProfile {

    private MagicType magicType;

    /**
     * Current Gate condition.
     */
    private GateState gateState;

    /**
     * Current Gate capacity.
     */
    private int gateCapacity;

    /**
     * Current Mana.
     */
    private int mana;

    /**
     * Maximum Mana.
     */
    private int maxMana;

    /**
     * Current Od.
     */
    private int od;

    /**
     * Maximum Od.
     */
    private int maxOd;

    private final EnumMap<MagicAffinity, Integer> affinities;

    private final EnumMap<MagicElement, Integer> masteries;

    public MagicProfile() {

        magicType = MagicType.NONE;

        gateState = GateState.HEALTHY;

        gateCapacity = 100;

        maxMana = 100;
        mana = maxMana;

        maxOd = 100;
        od = maxOd;

        affinities = new EnumMap<>(MagicAffinity.class);

        for (MagicAffinity affinity : MagicAffinity.values()) {
            affinities.put(affinity, 0);
        }

        masteries = new EnumMap<>(MagicElement.class);

        for (MagicElement element : MagicElement.values()) {
            masteries.put(element, 0);
        }
    }

    public MagicType getMagicType() {
        return magicType;
    }

    public void setMagicType(MagicType magicType) {
        this.magicType = magicType;
    }

    public GateState getGateState() {
        return gateState;
    }

    public void setGateState(GateState gateState) {
        this.gateState = gateState;
    }

    public int getGateCapacity() {
        return gateCapacity;
    }

    public void setGateCapacity(int gateCapacity) {
        this.gateCapacity = Math.max(0, gateCapacity);
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
        return affinities.get(affinity);
    }

    public void setAffinity(MagicAffinity affinity, int value) {
        affinities.put(affinity, Math.max(0, value));
    }

    public int getMastery(MagicElement element) {
        return masteries.get(element);
    }

    public void setMastery(MagicElement element, int value) {
        masteries.put(element, Math.max(0, value));
    }

    public Map<MagicAffinity, Integer> getAffinities() {
        return Map.copyOf(affinities);
    }

    public Map<MagicElement, Integer> getMasteries() {
        return Map.copyOf(masteries);
    }
}