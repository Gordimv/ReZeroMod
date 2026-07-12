package com.gordimv.rezeroengine.save.serialization;

import com.gordimv.rezeroengine.save.PlayerData;
import net.minecraft.nbt.CompoundTag;

import java.util.UUID;

/**
 * Initial serializer implementation.
 * Additional profile serialization will be added in later packs.
 */
public final class PlayerDataSerializer extends AbstractProfileSerializer {

    @Override
    public CompoundTag serialize(PlayerData playerData) {

        CompoundTag root = createRootTag();

        root.putUUID("UUID", playerData.getUuid());
        root.putString("PlayerName",
                playerData.getPlayerProfile().getPlayerName());

        return root;
    }

    @Override
    public PlayerData deserialize(CompoundTag tag) {

        UUID uuid = tag.getUUID("UUID");
        String playerName = tag.getString("PlayerName");

        return new PlayerData(uuid, playerName);
    }
}
