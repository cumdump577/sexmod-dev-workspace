package net.mcreator.sexmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementssexmod.ModElement.Tag
public class MCreatorSexMod extends Elementssexmod.ModElement {
	public MCreatorSexMod(Elementssexmod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabsexmod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorCum.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
