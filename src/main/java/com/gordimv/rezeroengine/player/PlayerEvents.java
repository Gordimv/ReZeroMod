package com.gordimv.rezeroengine.player;

import com.gordimv.rezeroengine.ReZeroEngine;
import com.gordimv.rezeroengine.save.PlayerData;
import com.gordimv.rezeroengine.save.PlayerDataManager;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * Handles player login/logout events.
 */
@Mod.EventBusSubscriber(modid = ReZeroEngine.MOD_ID)
public final class PlayerEvents {

    private PlayerEvents() {
    }

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }

        PlayerData data = PlayerDataManager.get(player);

        ReZeroEngine.LOGGER.info(
                "Loaded PlayerData for {} (Level {})",
                data.getPlayerProfile().getPlayerName(),
                data.getPlayerProfile().getLevel()
        );
    }

    @SubscribeEvent
    public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }

        PlayerDataManager.unload(player.getUUID());

        ReZeroEngine.LOGGER.info(
                "Unloaded PlayerData for {}",
                player.getGameProfile().getName()
        );
    }
}