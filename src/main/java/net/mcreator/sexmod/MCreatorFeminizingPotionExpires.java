package net.mcreator.sexmod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

@Elementssexmod.ModElement.Tag
public class MCreatorFeminizingPotionExpires extends Elementssexmod.ModElement {
	public MCreatorFeminizingPotionExpires(Elementssexmod instance) {
		super(instance, 14);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorFeminizingPotionExpires!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorFeminizingPotionExpires!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorFeminizingPotionExpires!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorFeminizingPotionExpires!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorCum.block.getDefaultState(), 3);
	}
}
