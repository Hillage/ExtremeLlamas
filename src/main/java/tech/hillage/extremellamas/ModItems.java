package tech.hillage.extremellamas;

import tech.hillage.extremellamas.items.LlamaEssence;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	@GameRegistry.ObjectHolder("extremellamas:llamaessence")
	public static LlamaEssence llamaEssence;
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		llamaEssence.initModel();
	}
}
