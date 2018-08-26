package com.Sasha.rp4kmod;

import net.minecraft.item.Item;

import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class TitaniumOre extends Item { 
	 
	public TitaniumOre(){ 
		super(); 
		this.setRegistryName(RP4KMod.MODID, "titaniumOre"); 
		this.setUnlocalizedName("titaniumOre"); 
		this.setCreativeTab(RP4KMod.myCreativeTab); 
		GameRegistry.register(this); 
	}
	
}
