package com.Sasha.rp4kmod;
import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenMineTrap extends WorldGenerator{
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		BlockPos aboveBlock = new BlockPos(position.getX(), position.getY()+1, position.getZ());
		if((worldIn.isAirBlock(aboveBlock) 
				&& worldIn.getBlockState(position) == Blocks.GRASS.getDefaultState()) 
				|| 
				(worldIn.isAirBlock(aboveBlock) 
						&& worldIn.getBlockState(position)== Blocks.SAND.getDefaultState()))
		 {
			worldIn.setBlockState(aboveBlock,
					Blocks.STONE_PRESSURE_PLATE.getDefaultState());
			BlockPos belowBlock = new BlockPos(position.getX(),
					position.getY()-1, position.getZ());
			worldIn.setBlockState(belowBlock, Blocks.TNT.getDefaultState());
			return true;
		}
		return false;
	}
	
}
