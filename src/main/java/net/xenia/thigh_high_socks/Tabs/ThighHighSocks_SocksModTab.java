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

package net.xenia.thigh_high_socks.Tabs;

import java.util.function.Supplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.xenia.thigh_high_socks.Item.ThighHighSocks_Items;
import net.xenia.thigh_high_socks.ThighHighSocks_Mod;

public class ThighHighSocks_SocksModTab {
    public static final DeferredRegister<CreativeModeTab> SOCKS_MOD_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThighHighSocks_Mod.MODID);

    public static Supplier<CreativeModeTab> SOCKS_TAB = SOCKS_MOD_TAB.register("socks_items_tab",
        () -> CreativeModeTab.builder()
        .icon(() -> new ItemStack(ThighHighSocks_Items.COTTON.get()))
        .title(Component.translatable("creativetab.thighhighsocks.thighhighsocks_items"))
        .displayItems((itemDisplayParameters, output) -> {
            output.accept(ThighHighSocks_Items.COTTON.get());
            output.accept(ThighHighSocks_Items.SOCKS.get());
            output.accept(ThighHighSocks_Items.SOCKS_BLACK.get());
            output.accept(ThighHighSocks_Items.SOCKS_BLUE.get());
            output.accept(ThighHighSocks_Items.SOCKS_BROWN.get());
            output.accept(ThighHighSocks_Items.SOCKS_CYAN.get());
            output.accept(ThighHighSocks_Items.SOCKS_GREEN.get());
            output.accept(ThighHighSocks_Items.SOCKS_GRAY.get());
            output.accept(ThighHighSocks_Items.SOCKS_LIGHTBLUE.get());
            output.accept(ThighHighSocks_Items.SOCKS_LIGHTGRAY.get());
            output.accept(ThighHighSocks_Items.SOCKS_LIME.get());
            output.accept(ThighHighSocks_Items.SOCKS_MAGENTA.get());
            output.accept(ThighHighSocks_Items.SOCKS_ORANGE.get());
            output.accept(ThighHighSocks_Items.SOCKS_PINK.get());
            output.accept(ThighHighSocks_Items.SOCKS_PURPLE.get());
            output.accept(ThighHighSocks_Items.SOCKS_RED.get());
            output.accept(ThighHighSocks_Items.SOCKS_YELLOW.get());
        })
        .build()
    );

    public static void register(IEventBus modBus) {
        SOCKS_MOD_TAB.register(modBus);
    }
}
