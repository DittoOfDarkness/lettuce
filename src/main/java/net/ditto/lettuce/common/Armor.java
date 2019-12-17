package net.ditto.lettuce.common;

import java.util.List;
import java.util.Set;

import com.google.common.collect.Multimap;

import net.ditto.lettuce.lettuce;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;


public class Armor extends ItemArmor
{
	public Armor(String item_id, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
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