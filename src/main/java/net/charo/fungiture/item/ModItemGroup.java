package net.charo.fungiture.item;

import net.charo.fungiture.Fungiture;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FUNGITURE = FabricItemGroupBuilder.build(new Identifier(Fungiture.MOD_ID, "fungiture"),
            () -> new ItemStack(ModItems.FUNGAL_TEST));
}
