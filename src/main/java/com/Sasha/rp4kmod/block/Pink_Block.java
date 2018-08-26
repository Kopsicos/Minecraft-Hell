package com.Sasha.rp4kmod.block;

import java.util.Random;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.block.BlockOre;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Pink_Block extends BlockOre {
	
		public Pink_Block(){
		super();
		this.setRegistryName(RP4KMod.MODID, "Pink_Block");
		this.setUnlocalizedName("Pink_Block");
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		ItemBlock PinkItemBlock = new ItemBlock(this);
		PinkItemBlock.setRegistryName(RP4KMod.MODID, "Pink_Block");
		PinkItemBlock.setUnlocalizedName("Pink_Block");
		GameRegistry.register(this);
		GameRegistry.register(PinkItemBlock);
		this.setCreativeTab(RP4KMod.myCreativeTab);
		
		}
}