package net.mcreator.sexmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

@Elementssexmod.ModElement.Tag
public class MCreatorCum extends Elementssexmod.ModElement {
	@GameRegistry.ObjectHolder("sexmod:cum")
	public static final Block block = null;
	@GameRegistry.ObjectHolder("sexmod:cum")
	public static final Item item = null;
	private Fluid fluid;

	public MCreatorCum(Elementssexmod instance) {
		super(instance, 1);
		fluid = new Fluid("cum", new ResourceLocation("sexmod:blocks/fluid_cum"), new ResourceLocation("sexmod:blocks/fluid_cum")).setLuminosity(0)
				.setDensity(1000).setViscosity(1150).setGaseous(false);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockFluidClassic(fluid, Material.WATER) {
			@Override
			public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
				super.onEntityCollidedWithBlock(world, pos, state, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				Block block = this;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					MCreatorCumMobplayerCollidesBlock.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("cum").setRegistryName("cum"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName("cum"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomMeshDefinition(item, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("sexmod:cum", "cum");
			}
		});
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("sexmod:cum", "cum");
			}
		});
	}
}
