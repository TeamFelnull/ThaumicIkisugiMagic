package red.felnull.tim;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import red.felnull.tim.proxy.CommonProxy;

@Mod(modid = ThaumicIkisugiMagic.MODID, version = ThaumicIkisugiMagic.VERSION)
public class ThaumicIkisugiMagic {
    public static final String MODID = "thaumicikisugimagic";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "red.felnull.tim.proxy.ClientProxy", serverSide = "red.felnull.tim.proxy.CommonProxy")
    public static CommonProxy Proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        Proxy.preInit();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        Proxy.postInit();
    }
}
