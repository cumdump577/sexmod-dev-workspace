package net.mcreator.sexmod;

import net.minecraft.world.World;

@Elementssexmod.ModElement.Tag
public class MCreatorSexCommandExecuted extends Elementssexmod.ModElement {
	public MCreatorSexCommandExecuted(Elementssexmod instance) {
		super(instance, 6);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorSexCommandExecuted!");
			return;
		}
		World world = (World) dependencies.get("world");
		world.setWorldTime((int) 1);
	}
}
