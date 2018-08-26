package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Fourth_Circle_of_Hell extends Biome {
	
	public Fourth_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		this.topBlock = Blocks.GOLD_BLOCK.getDefaultState();
		this.fillerBlock = Blocks.GOLD_ORE.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntityBlaze.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 0;
		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.mushroomsPerChunk= 0;
	}
	
}
