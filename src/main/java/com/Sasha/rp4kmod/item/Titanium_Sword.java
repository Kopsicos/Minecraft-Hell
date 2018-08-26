package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Titanium_Sword extends ItemHoe {
	
	public Titanium_Sword(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4KMod.MODID, "titaniumSword");
		this.setUnlocalizedName("titaniumSword");
		GameRegistry.register(this);
	}
}