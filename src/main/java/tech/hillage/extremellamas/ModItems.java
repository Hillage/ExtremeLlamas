package tech.hillage.extremellamas;

import tech.hillage.extremellamas.items.LlamaEssence;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	//@GameRegistry.ObjectHolder("extremellamas:llamaessence")
	public static LlamaEssence llamaEssence;
	
	public static void init() {
		llamaEssence = new LlamaEssence();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		ModelLoader.setCustomModelResourceLocation(llamaEssence,  0,  new ModelResourceLocation(llamaEssence.getRegistryName(), "inventory"));
	}
}
