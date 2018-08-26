package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Titanium_Spade extends ItemHoe {
	
	public Titanium_Spade(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4KMod.MODID, "titaniumSpade");
		this.setUnlocalizedName("titaniumSpade");
		GameRegistry.register(this);
	}
}
