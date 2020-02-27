package net.mcreator.sexmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementssexmod.ModElement.Tag
public class MCreatorBondagegear extends Elementssexmod.ModElement {
	@GameRegistry.ObjectHolder("sexmod:bondagegearhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("sexmod:bondagegearbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("sexmod:bondagegearlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("sexmod:bondagegearboots")
	public static final Item boots = null;

	public MCreatorBondagegear(Elementssexmod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BONDAGEGEAR", "sexmod:bondage-gear", 25, new int[]{2, 5, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bondagegearhelmet")
				.setRegistryName("bondagegearhelmet").setCreativeTab(MCreatorSexMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bondagegearbody")
				.setRegistryName("bondagegearbody").setCreativeTab(MCreatorSexMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("bondagegearlegs")
				.setRegistryName("bondagegearlegs").setCreativeTab(MCreatorSexMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("bondagegearboots")
				.setRegistryName("bondagegearboots").setCreativeTab(MCreatorSexMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("sexmod:bondagegearhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("sexmod:bondagegearbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("sexmod:bondagegearlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("sexmod:bondagegearboots", "inventory"));
	}
}
