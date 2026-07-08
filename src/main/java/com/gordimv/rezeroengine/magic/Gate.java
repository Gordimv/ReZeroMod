package com.gordimv.rezeroengine.magic;

import java.util.Objects;

/**
 * ============================================================
 * Project Lugunica
 *
 * Gate
 *
 * Represents a player's Gate.
 *
 * The Gate is the organ responsible for regulating the flow
 * of mana throughout the body.
 *
 * It does not store mana itself.
 * ============================================================
 */
public final class Gate {

    /**
     * Current condition of the Gate.
     */
    private GateState state = GateState.HEALTHY;

    /**
     * Maximum amount of mana that can safely flow through the
     * Gate at one time.
     */
    private int manaOutput = 100;

    public Gate() {
    }

    public GateState getState() {
        return state;
    }

    public void setState(GateState state) {
        this.state = Objects.requireNonNull(state, "state");
    }

    public int getManaOutput() {
        return manaOutput;
    }

    public void setManaOutput(int manaOutput) {
        this.manaOutput = Math.max(0, manaOutput);
    }
}