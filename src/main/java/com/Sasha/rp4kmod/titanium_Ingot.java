package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class titanium_Ingot extends Item{
	
	public titanium_Ingot(){
		super();
		this.setRegistryName(RP4KMod.MODID, "titaniumIngot");
		this.setUnlocalizedName("titaniumIngot");
		GameRegistry.register(this);
		this.setCreativeTab(RP4KMod.myCreativeTab);
		
	}
}
