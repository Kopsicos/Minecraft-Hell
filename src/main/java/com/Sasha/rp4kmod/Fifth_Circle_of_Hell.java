package com.Sasha.rp4kmod;

import java.util.Random;

import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class Fifth_Circle_of_Hell extends Biome {

	public Fifth_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		
		this.topBlock = Blocks.DIRT.getDefaultState();
		this.fillerBlock = Blocks.SOUL_SAND.getDefaultState();
		//this.fillerBlock = Blocks.LAVA.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityIronGolem.class, 17, 4, 4));
		

		this.theBiomeDecorator.bigMushroomsPerChunk= 0;
		this.theBiomeDecorator.generateLakes = true;
		this.theBiomeDecorator.mushroomsPerChunk= 10;
		this.theBiomeDecorator.waterlilyPerChunk= 50;
		this.BIG_TREE_FEATURE.setDecorationDefaults();
		Random rand = new Random();
		this.genBigTreeChance(rand);
		this.theBiomeDecorator.treesPerChunk= 50;
		
		this.theBiomeDecorator.cactiPerChunk = 5;
		
	}

}
