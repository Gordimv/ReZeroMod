package com.gordimv.rezeroengine.util;

/**
 * ============================================================
 * ReZero Engine
 * Version.java
 * ------------------------------------------------------------
 * Stores engine version information.
 *
 * This class should never contain gameplay logic.
 * ============================================================
 */
public final class Version {

    public static final String ENGINE_NAME = "ReZero Engine";

    public static final int MAJOR = 1;
    public static final int MINOR = 0;
    public static final int PATCH = 0;

    private Version() {
    }

    public static String getVersion() {
        return MAJOR + "." + MINOR + "." + PATCH;
    }

    public static String getFullVersion() {
        return ENGINE_NAME + " v" + getVersion();
    }
}