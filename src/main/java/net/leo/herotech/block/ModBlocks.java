package net.leo.herotech.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.leo.herotech.HeroTech;
import net.leo.herotech.util.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2)));

    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(7.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(HeroTech.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(HeroTech.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.HEROTECH_GROUP)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + HeroTech.MOD_ID);
    }
}