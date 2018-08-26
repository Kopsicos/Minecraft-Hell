package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Seventh_Circle_of_Hell extends Biome {
	
	public Seventh_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		
		this.topBlock = Blocks.SAND.getDefaultState();
		this.fillerBlock = Blocks.SAND.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityVindicator.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityHusk.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntitySkeletonHorse.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
		
	}
	
}