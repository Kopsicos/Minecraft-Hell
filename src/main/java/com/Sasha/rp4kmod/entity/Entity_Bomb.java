package com.Sasha.rp4kmod.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Entity_Bomb  extends EntityThrowable
{
	double bounceFactor = 0.2;
	int fuse = 50;
	boolean stopped = false;
	public Entity_Bomb(World worldIn) {
		super(worldIn);
		this.setSize(0.98F, 0.7F);
	}
	public Entity_Bomb(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
		this.setSize(0.98F,  0.7F);
	}
	public Entity_Bomb(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
		this.setSize(0.98F,  0.7F);
	}
	@Override
	protected void onImpact(RayTraceResult result){
		if(!this.world.isRemote) {
			this.explode();
		}
		this.setDead();
	}
	@Override
	public void onUpdate(){
		if(fuse-- <= 0 ) { 
			if (!this.world.isRemote) {
			this.explode();
			}
			this.setDead();
		}
		if (!stopped && !this.isDead){
		double prevVelX = motionX;
		double prevVelY = motionY;
		double prevVelZ = motionZ;
		move(MoverType.PLAYER, motionX, motionY, motionZ);
		boolean collided = false;
		if(motionX != prevVelX) {
			motionX = -prevVelX;
			collided = true;
		}
		if(motionZ != prevVelZ) {
			motionZ = -prevVelZ;
			collided = true;
		}
		if(motionY != prevVelY) {
			motionY = -prevVelY;
			collided = true;
		} else {
			motionY -= 0.04; 	
		}
		
		motionX *= 0.99;
		motionY *= 0.99;
		motionZ *= 0.99;
		if(collided)
		{
			motionX *= bounceFactor;
			motionY *= bounceFactor;
			motionZ *= bounceFactor;
			
		}
		if (this.onGround && (Math.abs(motionX)+  Math.abs(motionY) + Math.abs(motionZ)) <0.2){
			stopped = true;
			motionX *= 0;
			motionX *= 0;
			motionX *= 0;
		}
		}
	}
	private void explode()
	{
		float f = 4.0F;
		this.world.createExplosion(this, this.posX, this.posY + 
				(double)(this.height / 16.0F), this.posZ, 4.0F, true);
	}
	
}
