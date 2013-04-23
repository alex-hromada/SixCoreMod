package com.basspro.scm.block;

import java.util.Random;

import net.minecraft.block.Block;

import com.basspro.scm.SixCoreMod;
import com.basspro.scm.lib.ItemIds;
import com.basspro.scm.lib.Strings;

public class OreSapphire extends BlockOreSCM
{
    public OreSapphire(int id)
    {
        super(id);
        setStepSound(Block.soundStoneFootstep);
        setCreativeTab(SixCoreMod.tabSixCoreModOre);
        setHardness(3.0F);
        setUnlocalizedName(Strings.SAPPHIRE_ORE_NAME);
    }

    @Override
    public int idDropped(int par1, Random random, int par2)
    {
        return ItemIds.SAPPHIRE;
    }

    @Override
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(2) + 1;
    }


}
