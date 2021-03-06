package net.leo.herotech.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.leo.herotech.HeroTech;
import net.leo.herotech.item.custom.DrillItem;
import net.leo.herotech.util.ModItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {


    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.HEROTECH_GROUP)));

    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.HEROTECH_GROUP)));

    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(ModItemGroup.HEROTECH_GROUP)));

    public static final Item DRILL = registerItem("drill",
            new DrillItem(new FabricItemSettings().group(ModItemGroup.HEROTECH_GROUP)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(HeroTech.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + HeroTech.MOD_ID);
    }
}
