package net.mcreator.sexmod;

import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementssexmod.ModElement.Tag
public class MCreatorSexitemRightClickedInAir extends Elementssexmod.ModElement {
	public MCreatorSexitemRightClickedInAir(Elementssexmod instance) {
		super(instance, 12);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorSexitemRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorSexitemRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorSexitemRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorSexitemRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSexitemRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer && !world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("Opening Sex GUI"), (false));
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(sexmod.instance, MCreatorSexgui.GUIID, world, x, y, z);
	}
}
