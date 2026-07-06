package com.gordimv.rezeroengine.magic;

/**
 * Represents a player's Gate.
 *
 * The Gate regulates mana flow and determines
 * how much mana can safely be released.
 */
public final class Gate {

    private GateState state;

    /**
     * Maximum safe mana output.
     */
    private int outputCapacity;

    /**
     * Maximum mana storage.
     */
    private int storageCapacity;

    public Gate() {
        this.state = GateState.HEALTHY;
        this.outputCapacity = 100;
        this.storageCapacity = 100;
    }

    public GateState getState() {
        return state;
    }

    public void setState(GateState state) {
        this.state = state;
    }

    public int getOutputCapacity() {
        return outputCapacity;
    }

    public void setOutputCapacity(int outputCapacity) {
        this.outputCapacity = Math.max(0, outputCapacity);
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = Math.max(0, storageCapacity);
    }
}