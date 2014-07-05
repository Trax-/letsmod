package com.ocsnet.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by tlo on 7/5/14.
 */

@Mod(modid = "LetsModReboot", name = "Lets Mod Reboot", version = "1.7.2-1.0")
public class LetsModReboot {

    @Mod.Instance("letsmodreboot")
    public static LetsModReboot instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

}