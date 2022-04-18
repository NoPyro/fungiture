package net.charo.fungiture;

import net.charo.fungiture.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fungiture implements ModInitializer {
	public static final String MOD_ID = "fungiture";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}

}
