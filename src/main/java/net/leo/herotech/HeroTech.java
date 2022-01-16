package net.leo.herotech;

import net.fabricmc.api.ModInitializer;
import net.leo.herotech.block.ModBlocks;
import net.leo.herotech.item.ModItems;
import net.leo.herotech.registries.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HeroTech implements ModInitializer {

	public static final String MOD_ID = "herotech";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModFuels();
	}
}
