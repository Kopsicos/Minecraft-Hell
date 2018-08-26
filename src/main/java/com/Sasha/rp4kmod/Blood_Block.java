package com.Sasha.rp4kmod;

import java.util.Random;

import net.minecraft.block.BlockMagma;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blood_Block extends BlockMagma{
	
	public Blood_Block() {
		super();
		this.setRegistryName(RP4KMod.MODID, "Blood_Block");
		this.setUnlocalizedName("Blood_Block");
		ItemBlock BloodItemBlock = new ItemBlock(this);
		BloodItemBlock.setRegistryName(RP4KMod.MODID, "Blood_Block");
		BloodItemBlock.setUnlocalizedName("Blood_Block");
		GameRegistry.register(this);
		GameRegistry.register(BloodItemBlock);
		this.setCreativeTab(RP4KMod.myCreativeTab);
}}
