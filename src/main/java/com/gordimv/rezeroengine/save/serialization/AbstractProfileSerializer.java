package com.gordimv.rezeroengine.save.serialization;

import com.gordimv.rezeroengine.save.PlayerData;
import net.minecraft.nbt.CompoundTag;

public abstract class AbstractProfileSerializer implements ProfileSerializer {

    protected CompoundTag createRootTag() {
        return new CompoundTag();
    }

    @Override
    public abstract CompoundTag serialize(PlayerData playerData);

    @Override
    public abstract PlayerData deserialize(CompoundTag tag);
}
