package com.Sasha.rp4kmod;

import java.util.Random;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Ninth_Circle_of_Hell extends Biome {
	
	public Ninth_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		this.topBlock = Blocks.ICE.getDefaultState();
		this.fillerBlock =Blocks.PACKED_ICE.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityStray.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityVex.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
	}
	
}