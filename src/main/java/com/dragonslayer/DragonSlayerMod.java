package com.dragonslayer;

import com.dragonslayer.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DragonSlayerMod implements ModInitializer {
	public static final String MOD_ID = "dragonslayer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			dispatcher.register(CommandManager.literal("dragonslayer")
				.executes(context -> {
					context.getSource().sendFeedback(() -> Text.literal("Dragon Slayer Mod Active!"), false);
					return 1;
				}));
		});
		LOGGER.info("DragonSlayerMod Initialized");
	}
}