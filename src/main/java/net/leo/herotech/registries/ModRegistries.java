package net.leo.herotech.registries;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.leo.herotech.HeroTech;

public class ModRegistries {
    public static void registerModFuels() {
        System.out.println("registering fuels for " + HeroTech.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
    }
}
