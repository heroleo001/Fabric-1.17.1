package net.leo.herotech.item.custom;

import net.leo.herotech.util.Tags;
import net.minecraft.item.MiningToolItem;

public class DrillItem extends MiningToolItem {
    public DrillItem(Settings settings) {
        super(0, 100f, ModItemMaterial.DRILL, Tags.Blocks.DRILL_MINEABLES, settings);
    }
}
