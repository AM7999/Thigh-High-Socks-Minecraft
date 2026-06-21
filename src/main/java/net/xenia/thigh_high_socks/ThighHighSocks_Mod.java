/*
Thigh High Socks Mod for Minecraft Java Edition
Copyright (C) 2026  Xenia Nash

This file is part of the Thigh High Socks Mod for Minecraft Java Edition.

RST is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/

package net.xenia.thigh_high_socks;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLModContainer;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

import net.xenia.thigh_high_socks.Item.ThighHighSocks_Items;
import net.xenia.thigh_high_socks.Tabs.ThighHighSocks_SocksModTab;

@Mod("thigh_high_socks")
public class ThighHighSocks_Mod {
    public static final String MOD_ID = "thigh_high_socks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MODID = "thigh_high_socks";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public ThighHighSocks_Mod(FMLModContainer container, IEventBus modBus, Dist dist) {
        modBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        ThighHighSocks_SocksModTab.register(modBus);
        ThighHighSocks_Items.register(modBus);
        LOGGER.info("Items Registered.");

        modBus.addListener(this::addCreative);

        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ThighHighSocks_Items.COTTON);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}