package net.mcreator.sexmod;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementssexmod.ModElement.Tag
public class MCreatorChaliceRightClickedOnBlock extends Elementssexmod.ModElement {
	public MCreatorChaliceRightClickedOnBlock(Elementssexmod instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorChaliceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorChaliceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorChaliceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorChaliceRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorChaliceRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == new ItemStack(
				MCreatorChalice.block, (int) (1)).getItem())) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MCreatorCum.block.getDefaultState(), 3);
		}
	}
}
