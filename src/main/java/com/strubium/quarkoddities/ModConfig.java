package com.strubium.quarkoddities;



import net.minecraftforge.common.config.Config;



@Config(modid = Tags.MOD_ID, name = "forkoddities")
public class ModConfig {

    @Config.Comment("Maximum stack size for Tiny Potato.")
    @Config.RangeInt(min = 1, max = 64)
    @Config.RequiresMcRestart
    public static int tinyPotatoMaxStackSize = 64;

    @Config.Comment("Maximum stack size for Pipe.")
    @Config.RangeInt(min = 1, max = 64)
    @Config.RequiresMcRestart
    public static int pipeMaxStackSize = 64;


}
