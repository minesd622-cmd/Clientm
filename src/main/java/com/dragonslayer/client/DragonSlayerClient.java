package com.dragonslayer.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class DragonSlayerClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
			MinecraftClient client = MinecraftClient.getInstance();
			if (client != null && client.player != null) {
				drawContext.drawTextWithShadow(client.textRenderer, "DragonSlayer FPS: " + client.getCurrentFps(), 10, 10, 0xFFFFFF);
			}
		});
	}
}