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

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.xenia.thigh_high_socks.ThighHighSocks_Mod;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ThighHighSocks_ArmorMaterials {
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_WHITE     = register("sock_white",     "white");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_BLACK     = register("sock_black",     "black");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_BLUE      = register("sock_blue",      "blue");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_BROWN     = register("sock_brown",     "brown");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_CYAN      = register("sock_cyan",      "cyan");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_GREEN     = register("sock_green",     "green");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_GRAY      = register("sock_gray",      "gray");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_LIGHTBLUE = register("sock_lightblue", "lightblue");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_LIGHTGRAY = register("sock_lightgray", "lightgray");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_LIME      = register("sock_lime",      "lime");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_MAGENTA   = register("sock_magenta",   "magenta");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_ORANGE    = register("sock_orange",    "orange");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_PINK      = register("sock_pink",      "pink");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_PURPLE    = register("sock_purple",    "purple");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_RED       = register("sock_red",       "red");
    public static final Holder<ArmorMaterial> SOCK_MATERIAL_YELLOW    = register("sock_yellow",    "yellow");

    private static EnumMap<ArmorItem.Type, Integer> socksProtection() {
        return Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
            for (ArmorItem.Type type : ArmorItem.Type.values()) {
                attribute.put(type, 0);
            }
            attribute.put(ArmorItem.Type.LEGGINGS, 7);
        });
    }

    private static Holder<ArmorMaterial> register(String name, String textureColor) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(ThighHighSocks_Mod.MODID, name);
        ResourceLocation armorTexture = ResourceLocation.fromNamespaceAndPath(ThighHighSocks_Mod.MODID, "socks_solid/sock_" + textureColor);
        Holder<SoundEvent> equipSound = Holder.direct(SoundEvents.WOOL_PLACE);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(((Supplier<Item>) ThighHighSocks_Items.COTTON).get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(armorTexture));

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(socksProtection(), 16, equipSound, ingredient, layers, 2f, 0.1f));
    }
}