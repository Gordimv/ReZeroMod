package com.gordimv.rezeroengine.save.serialization;

import net.minecraft.server.level.ServerPlayer;

/**
 * ============================================================
 * Project Lugunica
 *
 * Serialization Context
 *
 * Carries useful information during save/load.
 * Additional fields will be added later without
 * changing serializer signatures.
 * ============================================================
 */
public final class ProfileSerializationContext {

    private final ServerPlayer player;

    public ProfileSerializationContext(ServerPlayer player) {
        this.player = player;
    }

    public ServerPlayer getPlayer() {
        return player;
    }

}