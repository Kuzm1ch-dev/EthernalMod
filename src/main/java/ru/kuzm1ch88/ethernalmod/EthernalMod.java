package ru.kuzm1ch88.ethernalmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.kuzm1ch88.ethernalmod.block.EthernalBlocks;
import ru.kuzm1ch88.ethernalmod.item.EthernalItems;

public class EthernalMod implements ModInitializer {
	public static final String MOD_ID = "ethernalmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EthernalItems.registerEthernalItems();
		EthernalBlocks.registerEthernalBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
