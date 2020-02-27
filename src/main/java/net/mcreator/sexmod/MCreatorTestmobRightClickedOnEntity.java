package net.mcreator.sexmod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementssexmod.ModElement.Tag
public class MCreatorTestmobRightClickedOnEntity extends Elementssexmod.ModElement {
	public MCreatorTestmobRightClickedOnEntity(Elementssexmod instance) {
		super(instance, 16);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorTestmobRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
				MCreatorHRT_Syringe.block, (int) (1)).getItem())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory
						.clearMatchingItems(new ItemStack(MCreatorHRT_Syringe.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorSyringe.block, (int) (1)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorFeminizing.potion, (int) 60, (int) 1, (false), (false)));
		}
	}
}
