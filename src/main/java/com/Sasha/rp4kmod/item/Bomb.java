package com.Sasha.rp4kmod.item;

import com.Sasha.rp4kmod.RP4KMod;
import com.Sasha.rp4kmod.entity.Entity_Bomb;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class Bomb extends Item {
public Bomb(){
	super();
	this.setRegistryName(RP4KMod.MODID, "bomb");
	setUnlocalizedName("bomb");
	GameRegistry.register(this);
	this.setCreativeTab(RP4KMod.myCreativeTab);
}
@Override
public ActionResult<ItemStack>onItemRightClick(World worldIn, EntityPlayer
		playerIn, EnumHand handIn){
	ItemStack itemstack = playerIn.getHeldItem(handIn);
	if(!playerIn.capabilities.isCreativeMode)
	{
		itemstack.shrink(1);
	}
	if(!worldIn.isRemote)
	{
		Entity_Bomb entitybomb = new Entity_Bomb(worldIn, playerIn);
		entitybomb.setHeadingFromThrower(playerIn,playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
		worldIn.spawnEntity(entitybomb);
	}
	
	playerIn.addStat(StatList.getObjectUseStats(this));
	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
}
}
