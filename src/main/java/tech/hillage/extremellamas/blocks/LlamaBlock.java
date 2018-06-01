package tech.hillage.extremellamas.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tech.hillage.extremellamas.ExtremeLlamas;

public class LlamaBlock extends Block {
	public LlamaBlock() {
		super(Material.ROCK);
		setUnlocalizedName(ExtremeLlamas.MODID + ".llamablock"); //Used for localization (en_US.lang)
		setRegistryName("llamablock"); //The unique name (within the mod) that identifies this block
	}
}
