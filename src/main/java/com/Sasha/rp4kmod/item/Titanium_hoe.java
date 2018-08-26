package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Titanium_hoe extends ItemHoe {
	
	public Titanium_hoe(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4KMod.MODID, "titaniumHoe");
		this.setUnlocalizedName("titaniumHoe");
		GameRegistry.register(this);
	}
}