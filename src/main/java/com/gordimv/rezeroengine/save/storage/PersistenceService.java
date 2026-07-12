package com.gordimv.rezeroengine.save.storage;

import com.gordimv.rezeroengine.save.PlayerData;
import com.gordimv.rezeroengine.save.serialization.ProfileSerializer;
import net.minecraft.nbt.CompoundTag;

public final class PersistenceService {

    private final ProfileSerializer serializer;
    private final ProfileStorage storage;

    public PersistenceService(ProfileSerializer serializer, ProfileStorage storage){
        this.serializer = serializer;
        this.storage = storage;
    }

    public void save(PlayerData data){
        CompoundTag tag = serializer.serialize(data);
        storage.save(tag);
    }

    public PlayerData load(){
        return serializer.deserialize(storage.load());
    }

    public boolean hasSave(){
        return storage.exists();
    }
}
