package tech.hillage.extremellamas.items;

import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import tech.hillage.extremellamas.ExtremeLlamas;

public class LlamaEssence extends Item {
	
	public LlamaEssence() {
		setRegistryName("llamaessence"); //The unique name (within the mod) that identifies this item
		setUnlocalizedName(ExtremeLlamas.MODID + ".llamaessence"); //Used for localization (en_us.lang)
		this.setCreativeTab(CreativeTabs.MISC);
	}
	
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this,  0,  new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
