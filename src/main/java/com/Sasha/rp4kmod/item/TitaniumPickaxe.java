package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumPickaxe extends ItemPickaxe {
	
	public TitaniumPickaxe(ToolMaterial material) {
		super(material);
		this.setRegistryName(RP4KMod.MODID, "titaniumPickaxe");
		this.setUnlocalizedName("titaniumPickaxe");
		this.setCreativeTab(RP4KMod.myCreativeTab);
		GameRegistry.register(this); 
	}
}
