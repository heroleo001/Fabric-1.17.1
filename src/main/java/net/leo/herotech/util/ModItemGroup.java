package net.leo.herotech.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.leo.herotech.HeroTech;
import net.leo.herotech.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup HEROTECH_GROUP = FabricItemGroupBuilder.build(new Identifier(HeroTech.MOD_ID, "herotech_group"),
            () -> new ItemStack(ModItems.TIN_INGOT));
}
