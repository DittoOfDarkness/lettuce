package net.ditto.lettuce.common;

import net.ditto.lettuce.lettuce;
import net.ditto.lettuce.config.ConfigLettuce;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class Axe extends ItemAxe
{
	public Axe(String item_id, ToolMaterial materialIn)
	{
		super(materialIn, 5.0F + ConfigLettuce.DAMAGE, ConfigLettuce.AXEATTACKSPEED);
		
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