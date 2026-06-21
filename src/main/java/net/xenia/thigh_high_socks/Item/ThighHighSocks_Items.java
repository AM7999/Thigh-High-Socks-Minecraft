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

package net.xenia.thigh_high_socks.Item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xenia.thigh_high_socks.ThighHighSocks_Mod;

public class ThighHighSocks_Items {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ThighHighSocks_Mod.MODID);

    public static final DeferredItem<Item> COTTON = ITEMS.register("cotton",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<ArmorItem> SOCKS         = ITEMS.register("sock_white",     () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_WHITE,     ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_BLACK   = ITEMS.register("sock_black",     () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_BLACK,     ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_BLUE    = ITEMS.register("sock_blue",      () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_BLUE,      ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_BROWN   = ITEMS.register("sock_brown",     () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_BROWN,     ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_CYAN    = ITEMS.register("sock_cyan",      () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_CYAN,      ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_GREEN   = ITEMS.register("sock_green",     () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_GREEN,     ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_GRAY    = ITEMS.register("sock_gray",      () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_GRAY,      ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_LIGHTBLUE = ITEMS.register("sock_lightblue", () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_LIGHTBLUE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_LIGHTGRAY = ITEMS.register("sock_lightgray", () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_LIGHTGRAY, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_LIME    = ITEMS.register("sock_lime",      () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_LIME,      ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_MAGENTA = ITEMS.register("sock_magenta",   () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_MAGENTA,   ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_ORANGE  = ITEMS.register("sock_orange",    () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_ORANGE,    ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_PINK    = ITEMS.register("sock_pink",      () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_PINK,      ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_PURPLE  = ITEMS.register("sock_purple",    () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_PURPLE,    ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_RED     = ITEMS.register("sock_red",       () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_RED,       ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));
    public static final DeferredItem<ArmorItem> SOCKS_YELLOW  = ITEMS.register("sock_yellow",    () -> new ArmorItem(ThighHighSocks_ArmorMaterials.SOCK_MATERIAL_YELLOW,    ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(100))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
