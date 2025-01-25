package com.rouec.crackonium;

import com.rouec.crackonium.block.ModBlocks;
import com.rouec.crackonium.item.ModItemGroups;
import com.rouec.crackonium.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crackonium implements ModInitializer {
	public static final String MOD_ID = "crackonium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Crackonium initialized successfully");
	}
}