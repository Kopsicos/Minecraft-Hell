package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.block.BlockObsidian;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Third_Circle_of_Hell extends Biome {
	
	public Third_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		
		this.topBlock = Blocks.PINK_SHULKER_BOX.getDefaultState();
		this.fillerBlock = Blocks.WATER.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
	}
	
}