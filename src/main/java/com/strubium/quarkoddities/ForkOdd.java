package com.strubium.quarkoddities;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import java.util.HashMap;
import java.util.Map;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION, dependencies = "after:quark")
public class ForkOdd {


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Map<ResourceLocation, Integer> stackSizes = new HashMap<>();

        stackSizes.put(new ResourceLocation("quark", "tiny_potato"),
                ModConfig.tinyPotatoMaxStackSize);

        stackSizes.put(new ResourceLocation("quark", "pipe"),
                ModConfig.pipeMaxStackSize);


        for (Map.Entry<ResourceLocation, Integer> entry : stackSizes.entrySet()) {
            Item item = Item.REGISTRY.getObject(entry.getKey());

            if (item != null) {
                item.setMaxStackSize(entry.getValue());
            }
        }
    }
}