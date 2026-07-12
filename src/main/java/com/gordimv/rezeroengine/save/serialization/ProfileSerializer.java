package com.gordimv.rezeroengine.save.serialization;

import com.gordimv.rezeroengine.save.PlayerData;
import net.minecraft.nbt.CompoundTag;

/**
 * ============================================================
 * Project Lugunica
 *
 * ProfileSerializer
 *
 * Responsible ONLY for converting PlayerData
 * to and from NBT.
 *
 * No disk IO.
 * No networking.
 * No caching.
 * ============================================================
 */
public interface ProfileSerializer {

    /**
     * Converts PlayerData into NBT.
     */
    CompoundTag serialize(PlayerData playerData);

    /**
     * Rebuilds PlayerData from NBT.
     */
    PlayerData deserialize(CompoundTag tag);

}