package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.block.BlockTitanium;
import com.Sasha.rp4kmod.block.Pink_Block;
import com.Sasha.rp4kmod.entity.Bouncing_Block;

import com.Sasha.rp4kmod.entity.Entity_Bomb;
import com.Sasha.rp4kmod.entity.Entity_Penguin;
import com.Sasha.rp4kmod.entity.Wand;
import com.Sasha.rp4kmod.item.Bomb;
import com.Sasha.rp4kmod.item.TitaniumArmor;
import com.Sasha.rp4kmod.item.TitaniumPickaxe;
import com.Sasha.rp4kmod.item.Titanium_Axe;
import com.Sasha.rp4kmod.item.Titanium_Spade;
import com.Sasha.rp4kmod.item.Titanium_Sword;
import com.Sasha.rp4kmod.item.Titanium_hoe;
import com.Sasha.rp4kmod.model.ModelPenguin;
import com.Sasha.rp4kmod.renderer.RenderPenguin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.BlockIce;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.BlockSand;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = RP4KMod.MODID, version = RP4KMod.VERSION) 

public class RP4KMod {
	public static final String MODID = "rp4kmod";
	public static final String VERSION = "1.0";
	public static Item titaniumOre;
	public static ToolMaterial titaniumMaterial;
	public static Block BouncingBlock;
	public static Block titaniumBlock;
	public static com.Sasha.rp4kmod.block.Pink_Block Pink_Block;
	public static Block gold_block;
	public static Block ice;
	public static Block obsidian;
	public static Block blood;
	public static Block sand;
	public static Item titaniumPickaxe;
	public static Item titanium_hoe;
	public static Item titanium_Spade;
	public static Item titanium_Axe;
	public static Item titanium_Sword;
	public static Item titaniumIngot;
	public static Item titaniumHelmet;
	public static Item titaniumPlate;
	public static Item titaniumLegs;
	public static Item titaniumBoots;
	public static ArmorMaterial titaniumArmorMaterial;
	public static Item bomb;
	public static Item wand;
	public static Biome bouncyBiome;
	public static Biome disgustingBiome;
	public static Biome goldenBiome;
	public static Biome acidBiome;
	public static Biome burningBiome;
	public static Biome desertBiome;
	public static Biome darkBiome;
	public static Biome coldBiome;
	public static WorldGenMineTrap mineTrap;

	Generator generator;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		titaniumArmorMaterial = EnumHelper.addArmorMaterial("Titanium", "titanium", 25
				, new int []{3, 8, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
		generator = new Generator();
		GameRegistry.registerWorldGenerator(generator, 0);
		titaniumMaterial = EnumHelper.addToolMaterial("Titanium", 3, 1561, 20f, 10f, 10);
		titaniumBlock = new BlockTitanium();
		Pink_Block = new Pink_Block();
		blood = new Blood_Block();
		sand = new BlockSand();
		BouncingBlock = new Bouncing_Block();
		titaniumPickaxe = new TitaniumPickaxe(Item.ToolMaterial.STONE);
		titanium_hoe = new Titanium_hoe(Item.ToolMaterial.STONE);
		titanium_Spade = new Titanium_Spade(Item.ToolMaterial.STONE);
		titanium_Axe = new Titanium_Axe(Item.ToolMaterial.STONE);
		titanium_Sword = new Titanium_Sword(Item.ToolMaterial.STONE);
		titaniumOre = new TitaniumOre();
		titaniumIngot = new titanium_Ingot();
		titaniumHelmet = new TitaniumArmor(titaniumArmorMaterial, 
				EntityEquipmentSlot.HEAD, "titaniumHelmet");
		titaniumPlate = new TitaniumArmor(titaniumArmorMaterial, 
				EntityEquipmentSlot.CHEST, "titaniumPlate");
		titaniumLegs = new TitaniumArmor(titaniumArmorMaterial, 
				EntityEquipmentSlot.LEGS, "titaniumLegs");
		titaniumBoots = new TitaniumArmor(titaniumArmorMaterial, 
				EntityEquipmentSlot.FEET, "titaniumBoots");
		wand = new Wand();
		bomb = new Bomb();
		mineTrap = new WorldGenMineTrap();
		{
			BiomeProperties bbProperties = new BiomeProperties("Bouncy Biome").setWaterColor(0xff0000);
			bbProperties.setBaseHeight(10);
			bbProperties.setHeightVariation(1);
			bouncyBiome = new Second_Circle_of_Hell(bbProperties);
			Biome.registerBiome(40, "Bouncy Biome" ,bouncyBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(bouncyBiome, 255));

			BiomeProperties dbProperties = new BiomeProperties("Disgusting Biome").setWaterColor(0xff0000);
			dbProperties.setBaseHeight(9);
			dbProperties.setHeightVariation(0);
			disgustingBiome = new Third_Circle_of_Hell(dbProperties);
			Biome.registerBiome(41, "Disgusting Biome" ,disgustingBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(disgustingBiome, 255));

			BiomeProperties gbProperties = new BiomeProperties("Golden Biome").setWaterColor(0xffff00);
			gbProperties.setBaseHeight(8);
			gbProperties.setHeightVariation(0);
			goldenBiome = new Fourth_Circle_of_Hell(gbProperties);
			Biome.registerBiome(42, "Golden Biome" ,goldenBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(goldenBiome, 255));
			
			BiomeProperties abProperties = new BiomeProperties("Acid Biome").setWaterColor(0x00ff00);
			abProperties.setBaseHeight(7);
			abProperties.setHeightVariation(0);
			acidBiome = new Fifth_Circle_of_Hell(abProperties);
			Biome.registerBiome(43, "Acid Biome" ,acidBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(acidBiome, 255));

			BiomeProperties bubProperties = new BiomeProperties("Burning Biome");
			bubProperties.setBaseHeight(6);
			bubProperties.setHeightVariation(0);
			burningBiome = new Sixth_Circle_of_Hell(bubProperties);
			Biome.registerBiome(43, "Burning Biome" ,burningBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(burningBiome, 255));
			
			BiomeProperties debProperties = new BiomeProperties("Desert Biome").setWaterColor(0xff0000);
			dbProperties.setBaseHeight(5);
			dbProperties.setHeightVariation(0);
			desertBiome = new Seventh_Circle_of_Hell(debProperties);
			Biome.registerBiome(44, "Desert Biome" ,desertBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(desertBiome, 255));

			BiomeProperties dabProperties = new BiomeProperties("Dark Biome").setWaterColor(0x000000); 
			dabProperties.setBaseHeight(2);
			dabProperties.setHeightVariation(0);
			darkBiome = new Eighth_Circle_of_Hell(dabProperties);
			Biome.registerBiome(45, "Dark Biome" ,darkBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(darkBiome, 255));

			BiomeProperties cbProperties = new BiomeProperties("Cold Biome").setWaterColor(0x00000a);
			cbProperties.setBaseHeight(0);
			cbProperties.setHeightVariation(0);
			coldBiome = new Ninth_Circle_of_Hell(cbProperties);
			Biome.registerBiome(46, "Cold Biome" ,coldBiome);
			BiomeManager.addBiome(BiomeType.WARM ,new BiomeEntry(coldBiome, 255));
			
		}
		ResourceLocation rloc2 = new ResourceLocation(MODID, "Entity_Penguin");
		EntityRegistry.registerModEntity(rloc2, Entity_Penguin.class, "penguin", 2,this, 80, 3, true, 230, 78);
		ResourceLocation rloc = new ResourceLocation(MODID, "Entity_Bomb");
		EntityRegistry.registerModEntity(rloc, Entity_Bomb.class, "bomb", 1, this, 80,3, true);

		for(Biome biome : Biome.REGISTRY) {
			if(biome != null) {
				EntityRegistry.addSpawn(Entity_Penguin.class, 20, 30, 35, EnumCreatureType.CREATURE, biome);
			}
		}


		if (event.getSide() == Side.CLIENT) {
			registerItem(titaniumPickaxe);
			registerItem(titaniumOre);
			registerItem(titanium_hoe);
			registerItem(titanium_Spade);
			registerItem(titanium_Axe);
			registerItem(titanium_Sword);			
			registerBlock(titaniumBlock);
			registerBlock(Pink_Block);
			registerBlock(BouncingBlock);
			registerItem(titaniumIngot);			
			registerItem(titaniumHelmet);
			registerItem(titaniumPlate);
			registerItem(titaniumLegs);
			registerItem(titaniumBoots);
			registerItem(bomb);
			registerItem(wand);
			RenderingRegistry.registerEntityRenderingHandler(Entity_Bomb.class, new IRenderFactory<Entity_Bomb>()
			{
				@Override
				public Render<? super Entity_Bomb> createRenderFor(RenderManager manager) {
					return new RenderSnowball(manager, bomb, Minecraft.getMinecraft().getRenderItem());
				}
			});


			RenderingRegistry.registerEntityRenderingHandler(Entity_Penguin.class, new IRenderFactory<Entity_Penguin>()
			{
				@Override
				public Render<? super Entity_Penguin> createRenderFor(RenderManager manager) {
					return new RenderPenguin(manager, new ModelPenguin(), 0.5F, 5);
				}
			});

		}

		addRecipes();


	}

	public void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(titaniumPickaxe, 1), new Object[] { 
				"ttt", " s ", " s ",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK 
		});
		GameRegistry.addRecipe(new ItemStack(titanium_hoe, 1), new Object[] { 
				"tt ", " s", " s",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK 
		});
		GameRegistry.addRecipe(new ItemStack(titanium_Spade, 1), new Object[] { 
				"t", "s", "s",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK 
		});
		GameRegistry.addRecipe(new ItemStack(titanium_Axe, 1), new Object[] { 
				"tt ", "ts ", " s ",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK 
		});
		GameRegistry.addRecipe(new ItemStack(titanium_Sword, 1), new Object[] { 
				"t", "t", "s",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK 
		});
		GameRegistry.addSmelting(titaniumOre, new ItemStack(titaniumIngot, 1), 5);
		GameRegistry.addRecipe(new ItemStack(titaniumHelmet, 1), new Object[] { 
				"ttt", "t t", 
				Character.valueOf('t'), titaniumIngot,  
		});
		GameRegistry.addRecipe(new ItemStack(titaniumPlate, 1), new Object[] { 
				"t t", "ttt", "ttt",
				Character.valueOf('t'), titaniumIngot, 
		});
		GameRegistry.addRecipe(new ItemStack(titaniumLegs, 1), new Object[] { 
				"ttt", "t t", "t t",
				Character.valueOf('t'), titaniumIngot, 
		});
		GameRegistry.addRecipe(new ItemStack(titaniumBoots, 1), new Object[] { 
				"t t", "t t", 
				Character.valueOf('t'), titaniumIngot, 
		});
		GameRegistry.addRecipe(new ItemStack(bomb, 64), new Object[] { 
				"***", "*t*", "***",
				Character.valueOf('*'), Blocks.COBBLESTONE, 
				Character.valueOf('t'), titaniumIngot 

		});
		GameRegistry.addRecipe(new ItemStack(wand, 64), new Object[] { 
				"t", "s",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Items.STICK

		});
		GameRegistry.addRecipe(new ItemStack(BouncingBlock, 1), new Object[] { 
				"ttt", "sss",
				Character.valueOf('t'), titaniumIngot, 
				Character.valueOf('s'), Blocks.COBBLESTONE

		});
	}

	public void registerItem(Item i) {

		ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
	}

	private void registerBlock(Block b){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0,
				new ModelResourceLocation(b.getRegistryName(), "inventory"));
	}

	public static CreativeTabs myCreativeTab = new CreativeTabs("RP4KMtab") {
		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(RP4KMod.titaniumPickaxe);
		}
	};
}
