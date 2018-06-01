package tech.hillage.extremellamas.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import tech.hillage.extremellamas.ModBlocks;
import tech.hillage.extremellamas.ModItems;
import tech.hillage.extremellamas.blocks.LlamaBlock;
import tech.hillage.extremellamas.items.LlamaEssence;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	//event.getRegistry().register(new LlamaBlock());
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new LlamaEssence());
    	
    	//event.getRegistry().register(new ItemBlock(ModBlocks.llamaBlock).setRegistryName(ModBlocks.llamaBlock.getRegistryName()));
    }
}
