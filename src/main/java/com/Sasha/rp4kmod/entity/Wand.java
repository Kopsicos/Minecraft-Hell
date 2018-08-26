package com.Sasha.rp4kmod.entity;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Wand extends Item {
	RayTraceResult rtr = null;
public Wand(){
	super();
	this.setRegistryName(RP4KMod.MODID, "wand");
	this.setUnlocalizedName("wand");
	GameRegistry.register(this);
	this.setCreativeTab(RP4KMod.myCreativeTab);
}
@Override
public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer
		playerIn, EnumHand handIn)
{
	ItemStack itemstack = playerIn.getHeldItem(handIn);
	if(worldIn.isRemote) {
		rtr = playerIn.rayTrace(100.0D, 1.0f);
		
	}
	if(rtr != null) {
		Vec3d vec3d = rtr.hitVec;
		int x = MathHelper.floor(vec3d.xCoord);
		int y = MathHelper.floor(vec3d.yCoord);
		int z = MathHelper.floor(vec3d.zCoord);
	
	EntityLightningBolt lightningbolt = new EntityLightningBolt(worldIn, x, 
			y, z, false);
	worldIn.spawnEntity(lightningbolt);
	}
	return new ActionResult(EnumActionResult.SUCCESS, itemstack);
}
}

