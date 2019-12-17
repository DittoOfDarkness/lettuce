package net.ditto.lettuce;

import java.util.ArrayList;
import java.util.List;

import net.ditto.lettuce.client.*;
import net.ditto.lettuce.common.*;
import net.ditto.lettuce.config.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.passive.HorseArmorType;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



@Mod(modid = lettuce.MOD_ID, name = lettuce.MOD_NAME, version = lettuce.VERSION)
public class lettuce {
	
	public static final String MOD_ID = "lettuce";
	public static final String MOD_NAME = "Lasy Emerald Tools Trying to Understand Complete Existence";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static lettuce instance;
	
	@SidedProxy(
			clientSide = "net.ditto.lettuce.client.ClientProxy",
			serverSide = "net.ditto.lettuce.common.ServerProxy"
	)
	public static IProxy proxy;
	
	public static Item emerald_sword;
	public static Item emerald_axe;
	public static Item emerald_pickaxe;
	public static Item emerald_shovel;
	public static Item emerald_hoe;
	public static Item emerald_helmet;
	public static Item emerald_chestplate;
	public static Item emerald_leggings;
	public static Item emerald_boots;
	public static Item emerald_horse_armor;
	
	public static HorseArmorType HORSEARMOREMERALD;
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		HORSEARMOREMERALD = EnumHelper.addHorseArmor("EMERALD", MOD_ID + ":textures/entity/horse/armor/horse_armor_emerald.png", ConfigLettuce.HORSEARMORSTRENGTH);
    }
	
	@EventBusSubscriber
	public static class RegistryHandler
	{
		public static final ArmorMaterial ARMOREMERALD = EnumHelper.addArmorMaterial("armor_emerald", MOD_ID +":emerald", ConfigLettuce.DURABILITY, ConfigLettuce.ARMORDAMAGEREDUCTION, ConfigLettuce.ARMORENCHANTABILITY, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, ConfigLettuce.ARMORTOUGHNESS);
		public static final ToolMaterial TOOLEMERALD = EnumHelper.addToolMaterial("tool_emerald", ConfigLettuce.TOOLHARVESTLEVEL, ConfigLettuce.DURABILITY, ConfigLettuce.EFFICIENCY, ConfigLettuce.DAMAGE, ConfigLettuce.TOOLENCHANTABILITY);
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event)
		{
			event.getRegistry().register(emerald_sword = new Sword("emerald_sword", TOOLEMERALD));
			event.getRegistry().register(emerald_axe = new Axe("emerald_axe", TOOLEMERALD));
			event.getRegistry().register(emerald_pickaxe = new Pickaxe("emerald_pickaxe", TOOLEMERALD));
			event.getRegistry().register(emerald_shovel = new Spade("emerald_shovel", TOOLEMERALD));
			event.getRegistry().register(emerald_hoe = new Hoe("emerald_hoe", TOOLEMERALD));
			event.getRegistry().register(emerald_helmet = new Armor("emerald_helmet", ARMOREMERALD, 0, EntityEquipmentSlot.HEAD));
			event.getRegistry().register(emerald_chestplate = new Armor("emerald_chestplate", ARMOREMERALD, 0, EntityEquipmentSlot.CHEST));
			event.getRegistry().register(emerald_leggings = new Armor("emerald_leggings", ARMOREMERALD, 0, EntityEquipmentSlot.LEGS));
			event.getRegistry().register(emerald_boots = new Armor("emerald_boots", ARMOREMERALD, 0, EntityEquipmentSlot.FEET));
			event.getRegistry().register(emerald_horse_armor = new HorseArmor("emerald_horse_armor"));
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event)
		{
			ModelLoader.setCustomModelResourceLocation(emerald_sword, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_sword"));
			ModelLoader.setCustomModelResourceLocation(emerald_axe, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_axe"));
			ModelLoader.setCustomModelResourceLocation(emerald_pickaxe, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_pickaxe"));
			ModelLoader.setCustomModelResourceLocation(emerald_shovel, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_shovel"));
			ModelLoader.setCustomModelResourceLocation(emerald_hoe, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_hoe"));
			ModelLoader.setCustomModelResourceLocation(emerald_helmet, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_helmet"));
			ModelLoader.setCustomModelResourceLocation(emerald_chestplate, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_chestplate"));
			ModelLoader.setCustomModelResourceLocation(emerald_leggings, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_leggings"));
			ModelLoader.setCustomModelResourceLocation(emerald_boots, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_boots"));
			ModelLoader.setCustomModelResourceLocation(emerald_horse_armor, 0, new ModelResourceLocation(lettuce.MOD_ID + ":emerald_horse_armor"));
		}
	}
}
