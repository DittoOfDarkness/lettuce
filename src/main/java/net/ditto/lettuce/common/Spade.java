package net.ditto.lettuce.common;

import net.ditto.lettuce.lettuce;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Spade extends ItemSpade
{
	public Spade(String item_id, ToolMaterial materialIn)
	{
		super(materialIn);
		
		this.setCreativeTab(ItemTab.tab);
		
		this.setRegistryName(new ResourceLocation(lettuce.MOD_ID, item_id));
		this.setUnlocalizedName(this.getRegistryName().toString());
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack)
	{
		return super.getItemStackDisplayName(stack);
	}

}