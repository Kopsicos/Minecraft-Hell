package com.Sasha.rp4kmod;

import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;

public class Second_Circle_of_Hell extends Biome {
	
	public Second_Circle_of_Hell(BiomeProperties properties) {
		super(properties);
		this.topBlock = RP4KMod.BouncingBlock.getDefaultState();
		this.fillerBlock = RP4KMod.BouncingBlock.getDefaultState();
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		spawnableCreatureList.add(new SpawnListEntry(Entity_Penguin.class, 17, 4, 4));
		spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, 17, 4, 4));
		
		this.theBiomeDecorator.mushroomsPerChunk = 10;
		this.theBiomeDecorator.bigMushroomsPerChunk= 10;
		this.theBiomeDecorator.mushroomsPerChunk= 10;
		this.theBiomeDecorator.generateLakes = false;
		
		
	}
	
}
