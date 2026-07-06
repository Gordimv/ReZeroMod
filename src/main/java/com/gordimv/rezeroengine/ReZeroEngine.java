package com.gordimv.rezeroengine;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * Main entry point for ReZero Engine.
 */
@Mod(ReZeroEngine.MOD_ID)
public final class ReZeroEngine {

    public static final String MOD_ID = "rezeroengine";

    public static final Logger LOGGER = LogUtils.getLogger();

    public ReZeroEngine() {

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        // Register this class to the Forge event bus.
        // PlayerEvents is registered automatically by
        // @Mod.EventBusSubscriber.
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("========================================");
        LOGGER.info("Initializing ReZero Engine");
        LOGGER.info("========================================");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        LOGGER.info("Common setup complete.");

    }
}