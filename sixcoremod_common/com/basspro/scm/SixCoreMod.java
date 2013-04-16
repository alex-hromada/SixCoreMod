package com.basspro.scm;

import net.minecraft.creativetab.CreativeTabs;

import com.basspro.scm.block.SixCoreModBlocks;
import com.basspro.scm.core.proxy.CommonProxy;
import com.basspro.scm.creativetab.TabSixCoreFood;
import com.basspro.scm.item.SixCoreModItems;
import com.basspro.scm.lib.Reference;
import com.basspro.scm.recipe.RecipesSixCoreMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SixCoreMod
{

    @Instance(Reference.MOD_ID)
    public static SixCoreMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    // public static CreativeTabs tabSixCoreModBlocks = new
    // TabSixCoreModBlocks(CreativeTabs.getNextID(), "Six Core Blocks");

    public static CreativeTabs tabSixCoreFood = new TabSixCoreFood(
            CreativeTabs.getNextID(), "Six Core Food Stuff");

    // public static CreativeTabs tabSixCoreModArmor = new
    // TabSixCoreModArmor(CreativeTabs.getNextID(), "Six Core Armor");
    // public static CreativeTabs tabSixCoreModTools = new
    // TabSixCoreModTools(CreativeTabs.getNextID(), "Six Core Tools");
    // public static CreativeTabs tabSixCoremodMobs = new
    // TabSixCoreModMobs(CreativeTabs.getNextID(), "SkyCraft Mobs");

    @PreInit
    public void init(FMLPreInitializationEvent event)
    {

    }

    @Init
    private void load(FMLInitializationEvent event)
    {
        // Blocks
        SixCoreModBlocks.init();

        // Items
        SixCoreModItems.init();

        // Recipes
        RecipesSixCoreMod.init();
    }
}
