package net.ditto.lettuce.common;

import net.ditto.lettuce.lettuce;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class HorseArmor extends Item
{
	public HorseArmor(String item_id)
	{
		super();
		
		this.setCreativeTab(ItemTab.tab);
		
		this.setRegistryName(new ResourceLocation(lettuce.MOD_ID, item_id));
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack)
	{
		return super.getItemStackDisplayName(stack);
	}
	
	@Override
    public HorseArmorType getHorseArmorType(ItemStack stack) 
    {
        return lettuce.HORSEARMOREMERALD;
    }
}