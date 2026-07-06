/*
 * ============================================================
 * ReZero Engine
 *
 * File:
 *     ModuleState.java
 *
 * Version:
 *     1.0.0
 *
 * Purpose:
 *     Defines every lifecycle state an Engine Module can occupy.
 *
 * Responsibilities:
 *     - Standardize module lifecycle progression.
 *     - Provide a common language for all engine modules.
 *     - Ensure every future module follows the same lifecycle.
 *
 * Does NOT:
 *     - Load modules.
 *     - Register modules.
 *     - Execute gameplay logic.
 *
 * Used By:
 *     EngineModule
 *     ModuleManager
 *     Every future gameplay module.
 *
 * ============================================================
 */

package com.gordimv.rezeroengine.api;

/**
 * Represents the lifecycle state of an Engine Module.
 *
 * Every module in ReZero Engine progresses through these states
 * in exactly the same order. This guarantees predictable startup,
 * runtime behavior, and shutdown across the entire engine.
 */
public enum ModuleState {

    /**
     * Module has been created but has not yet begun initialization.
     */
    CREATED,

    /**
     * Module is currently initializing its resources.
     */
    INITIALIZING,

    /**
     * Module has completed initialization successfully.
     */
    INITIALIZED,

    /**
     * Module is actively running.
     */
    RUNNING,

    /**
     * Module has begun shutting down.
     */
    STOPPING,

    /**
     * Module has completely shut down.
     */
    STOPPED
}