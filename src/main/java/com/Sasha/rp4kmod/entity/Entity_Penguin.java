package com.Sasha.rp4kmod.entity;

import com.Sasha.rp4kmod.RP4KMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

public class Entity_Penguin  extends EntityAnimal{
	public Entity_Penguin(World worldIn) {
		super(worldIn);
		this.setSize(this.width * 0.8F * 10F, this.height * 0.8F * 10F);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAILeapAtTarget(this,0.4F));
		this.tasks.addTask(3, new EntityAIAttackMelee(this,1.0D, true));
		this.tasks.addTask(4, new EntityAIMate(this, 0.6D));
		this.tasks.addTask(5, new EntityAITempt(this, 0.5D, Items.FISH, false));
		this.tasks.addTask(6, new EntityAIFollowParent(this, 0.3D));
		this.tasks.addTask(7, new EntityAIWander(this, 0.4D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
	}
	@Override
	public EntityAgeable createChild(EntityAgeable ageable) {
		return new Entity_Penguin(this.world);
	}
		@Override
		protected void applyEntityAttributes()
		{
			super.applyEntityAttributes();
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
			this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
			this.getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
			this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(1.0D);;
		}
		@Override
		public boolean isBreedingItem(ItemStack itemstack) {
			return itemstack == null ? false : itemstack.getItem() == Items.FISH;
		}
		@Override
		protected Item getDropItem ()
		{
			return RP4KMod.bomb;
		}
		@Override
		public boolean attackEntityAsMob(Entity entityTarget) {
			float attackDamage = (float)getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
			
			boolean isTargetHurt = entityTarget.attackEntityFrom(DamageSource.causeMobDamage(this), attackDamage);
			
			return isTargetHurt;
		}
		
		
	
}
