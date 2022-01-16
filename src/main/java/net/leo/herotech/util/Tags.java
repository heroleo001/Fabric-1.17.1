package net.leo.herotech.util;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.leo.herotech.HeroTech;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Tags {
    public static class Blocks {
        public static final Tag<Block> DRILL_MINEABLES = TagRegistry.block(new Identifier(HeroTech.MOD_ID,
                "mineeble/drill"));
    }
}
