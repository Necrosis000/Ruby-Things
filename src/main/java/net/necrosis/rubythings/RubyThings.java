package net.necrosis.rubythings;

import net.fabricmc.api.ModInitializer;

import net.necrosis.rubythings.block.ModBlocks;
import net.necrosis.rubythings.item.ModItemGroups;
import net.necrosis.rubythings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyThings implements ModInitializer {
	public static final String MOD_ID = "rubythings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModItemGroups.registerItemGroups();
	}
}