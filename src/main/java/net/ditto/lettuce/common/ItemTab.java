package net.ditto.lettuce.common;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraft.item.ItemStack;
import net.ditto.lettuce.lettuce;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

public class ItemTab
{
	public static CreativeTabs tab = new CreativeTabs("itemtablettuce") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.EMERALD);
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}