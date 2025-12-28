package com.dragonslayer.item;

import com.dragonslayer.DragonSlayerMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	public static final Item DRAGON_SOUL = registerItem("dragon_soul", new Item(new Item.Settings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(DragonSlayerMod.MOD_ID, name), item);
	}

	public static void registerModItems() {
		DragonSlayerMod.LOGGER.info("Registering Items for " + DragonSlayerMod.MOD_ID);
	}
}