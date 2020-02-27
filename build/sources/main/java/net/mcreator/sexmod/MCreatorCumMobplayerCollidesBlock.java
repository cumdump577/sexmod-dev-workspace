package net.mcreator.sexmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

@Elementssexmod.ModElement.Tag
public class MCreatorCumMobplayerCollidesBlock extends Elementssexmod.ModElement {
	public MCreatorCumMobplayerCollidesBlock(Elementssexmod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCumMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 60, (int) 1));
		else {
			if (entity instanceof EntityPlayerMP) {
				Advancement _adv = ((MinecraftServer) ((EntityPlayerMP) entity).mcServer).getAdvancementManager().getAdvancement(
						new ResourceLocation("sexmod:enlightenment"));
				AdvancementProgress _ap = ((EntityPlayerMP) entity).getAdvancements().getProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemaningCriteria().iterator();
					while (_iterator.hasNext()) {
						String _criterion = (String) _iterator.next();
						((EntityPlayerMP) entity).getAdvancements().grantCriterion(_adv, _criterion);
					}
				}
			}
		}
	}
}
