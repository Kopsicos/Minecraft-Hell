package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumArmor extends ItemArmor {
	
	public TitaniumArmor(ArmorMaterial materialIn, 
			EntityEquipmentSlot equipmentSlotIn, String name) {	
		
	super(materialIn, 0, equipmentSlotIn);
	this.setRegistryName(RP4KMod.MODID, name);
	this.setUnlocalizedName(name);
	GameRegistry.register(this);
	
	this.setCreativeTab(RP4KMod.myCreativeTab);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot
			slot, String type){
		if(stack.getItem() == RP4KMod.titaniumLegs){
			return RP4KMod.MODID + ":textures/armor/titanium_layers_2.jpg";
			
		}else{
			return RP4KMod.MODID + ":textures/models/armor/titanium_layer_1.png";
		}
	}
}
