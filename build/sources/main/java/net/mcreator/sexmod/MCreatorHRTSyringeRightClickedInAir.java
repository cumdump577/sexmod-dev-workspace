package net.mcreator.sexmod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementssexmod.ModElement.Tag
public class MCreatorHRTSyringeRightClickedInAir extends Elementssexmod.ModElement {
	public MCreatorHRTSyringeRightClickedInAir(Elementssexmod instance) {
		super(instance, 19);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorHRTSyringeRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.isSneaking())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory
						.clearMatchingItems(new ItemStack(MCreatorHRT_Syringe.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(MCreatorSyringe.block, (int) (1)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MCreatorFeminizing.potion, (int) 60, (int) 1, (false), (false)));
		}
	}

	@SubscribeEvent
	public void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		Entity entity = event.getTarget();
		int i = event.getPos().getX();
		int j = event.getPos().getY();
		int k = event.getPos().getZ();
		World world = event.getWorld();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
