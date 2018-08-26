package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.block.BlockObsidian;
import net.minecraft.block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Sixth_Circle_of_Hell extends Biome {
	
	public Sixth_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		
		
		this.topBlock = Blocks.NETHERRACK.getDefaultState();
		this.fillerBlock = Blocks.NETHERRACK.getDefaultState();
		this.fillerBlock = Blocks.LAVA.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityMagmaCube.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityWitch.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityEvoker.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
		this.theBiomeDecorator.generateLakes = false;
	}
	
}
