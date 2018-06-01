package tech.hillage.extremellamas;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tech.hillage.extremellamas.proxy.CommonProxy;

import org.apache.logging.log4j.Logger;

@Mod(modid = ExtremeLlamas.MODID, name = ExtremeLlamas.NAME, version = ExtremeLlamas.VERSION)
public class ExtremeLlamas {
    public static final String MODID = "extremellamas";
    public static final String NAME = "Extreme Llamas";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide = "tech.hillage.extremellamas.proxy.ClientProxy", serverSide = "tech.hillage.extremellamas.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Mod.Instance
    public static ExtremeLlamas instance;

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();
        proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	proxy.postInit(e);
    }
}
