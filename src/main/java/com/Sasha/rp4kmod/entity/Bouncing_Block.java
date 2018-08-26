package com.Sasha.rp4kmod.entity;

import java.util.Random;

import com.Sasha.rp4kmod.RP4KMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

	public class Bouncing_Block extends Block
	{
		public Bouncing_Block()
		{
			super(Material.ROCK);
			this.setRegistryName(RP4KMod.MODID, "bouncyBlock");
			this.setUnlocalizedName("bouncyBlock");
			this.setHardness(3.0f);
			this.setResistance(5.0f);
			ItemBlock Bouncing_BlockItemBlock = new ItemBlock(this);
			Bouncing_BlockItemBlock.setRegistryName(RP4KMod.MODID, "bouncyBlock");
			Bouncing_BlockItemBlock.setUnlocalizedName("bouncyBlock");
			GameRegistry.register(this);
			GameRegistry.register(Bouncing_BlockItemBlock);
			this.setCreativeTab(RP4KMod.myCreativeTab);
		}
		@Override
		public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
		{
			//lit
		}
		
		@Override
		public void onLanded(World worldIn, Entity entityIn)
		{
			entityIn.motionY = 2.0D;
		}
	}

