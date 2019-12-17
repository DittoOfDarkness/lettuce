package net.ditto.lettuce.config;

import net.ditto.lettuce.lettuce;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;

/* Horse armor values
 * NONE		0
 * IRON		5
 * GOLD		7
 * DIAMOND	11
 * EMERALD	11
 * 
 * Default values of tools
 * 
 * Material		HarvestLevel	MaxUses			Efficiency		attackDamage		Enchant
 * WOOD			0				59				2.0F			0.0F				15
 * STONE		1				131				4.0F			1.0F				5
 * IRON			2				250				6.0F			2.0F				14
 * DIAMOND		3				1561			8.0F			3.0F				10
 * GOLD			0				32				12.0F			0.0F				22
 * EMERALD		3				2033			12.0F			0.0F				22
 * 
 * Default values of Armor
 * 
 * Name			maxDamageFactor	damageReductionAmountArray	Enchant			SoundEvents								toughness
 * leather 		5 				{1, 2, 3, 1}				15				SoundEvents.ITEM_ARMOR_EQUIP_LEATHER		0.0F
 * chainmail	15				{1, 4, 5, 2}				12				SoundEvents.ITEM_ARMOR_EQUIP_CHAIN			0.0F
 * iron			15				{2, 5, 6, 2}				9				SoundEvents.ITEM_ARMOR_EQUIP_IRON			0.0F
 * gold			7				{1, 3, 5, 2}				25				SoundEvents.ITEM_ARMOR_EQUIP_GOLD			0.0F
 * diamond		33				{3, 6, 8, 3}				10				SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND		2.0F
 * emerald		-				{3, 6, 8, 3}				25				SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND		2.0F
*/

@Config(modid = lettuce.MOD_ID)
public class ConfigLettuce {
	public static int ARMORENCHANTABILITY = 25;
	public static int TOOLENCHANTABILITY = 22;	
	
	public static float ARMORTOUGHNESS = 2.0F;
	public static int[] ARMORDAMAGEREDUCTION = {3, 6, 8, 3};
	
	public static int TOOLHARVESTLEVEL = 3;
	
	public static int HORSEARMORSTRENGTH = 11;
	
	public static float DAMAGE = 3.0F;
	public static float EFFICIENCY = 12.0F;
	public static int DURABILITY = 2033;
	
	public static float AXEATTACKSPEED = -3.0F;
}
