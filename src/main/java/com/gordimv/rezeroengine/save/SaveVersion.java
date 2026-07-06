package com.gordimv.rezeroengine.save;

/**
 * Current save format version.
 *
 * Increasing this number allows future migration
 * of player saves without breaking compatibility.
 */
public final class SaveVersion {

    /**
     * Current save version.
     */
    public static final int CURRENT = 1;

    private SaveVersion() {
    }
}