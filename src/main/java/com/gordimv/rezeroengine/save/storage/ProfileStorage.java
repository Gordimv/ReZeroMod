package com.gordimv.rezeroengine.save.storage;

import net.minecraft.nbt.CompoundTag;

public interface ProfileStorage {

    CompoundTag load();

    void save(CompoundTag tag);

    boolean exists();
}
