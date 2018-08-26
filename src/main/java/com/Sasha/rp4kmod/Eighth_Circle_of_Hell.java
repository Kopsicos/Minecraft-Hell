package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.block.BlockObsidian;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Eighth_Circle_of_Hell extends Biome {
	
	public Eighth_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		
		this.topBlock = Blocks.OBSIDIAN.getDefaultState();
		this.fillerBlock = Blocks.OBSIDIAN.getDefaultState();
		this.fillerBlock = Blocks.LAVA.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityWitherSkeleton.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityEnderman.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityWither.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityEndermite.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityShulker.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
		this.theBiomeDecorator.generateLakes = false;
	}
	
}