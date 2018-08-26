package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Titanium_Axe extends ItemHoe {
	
	public Titanium_Axe(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4KMod.MODID, "titaniumAxe");
		this.setUnlocalizedName("titaniumAxe");
		GameRegistry.register(this);
	}
}