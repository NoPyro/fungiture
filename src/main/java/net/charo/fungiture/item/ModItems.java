package net.charo.fungiture.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.charo.fungiture.Fungiture;

public class ModItems {

    public static final Item FUNGAL_TEST = registerItem("fungal_test",
            new Item(new FabricItemSettings().group(ModItemGroup.FUNGITURE)));

    private static Item registerItem(String name, Item item){

        return Registry.register(Registry.ITEM, new Identifier(Fungiture.MOD_ID, name), item);

    }

    public static void registerModItems(){

        Fungiture.LOGGER.info("Registering mod items for " + Fungiture.MOD_ID);

    }

}
