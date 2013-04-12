package com.basspro.scm;

import net.minecraft.creativetab.CreativeTabs;
import com.basspro.scm.lib.Reference;
import com.basspro.scm.core.proxy.CommonProxySixCoreMod;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class SixCoreMod {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxySixCoreMod proxy;

    // public static CreativeTabs tabSixCoreModBlocks = new
    // TabSixCoreModBlocks(CreativeTabs.getNextID(), "Six Core Blocks");
    // public static CreativeTabs tabSSixCoreModItems = new
    // TabSixCoreModItems(CreativeTabs.getNextID(), "Six Core Items");
    // public static CreativeTabs tabSixCoreModArmor = new
    // TabSixCoreModArmor(CreativeTabs.getNextID(), "Six Core Armor");
    // public static CreativeTabs tabSixCoreModTools = new
    // TabSixCoreModTools(CreativeTabs.getNextID(), "Six Core Tools");
    // public static CreativeTabs tabSixCoremodMobs = new
    // TabSixCoreModMobs(CreativeTabs.getNextID(), "SkyCraft Mobs");

    @PreInit
    public void init(FMLPreInitializationEvent event) {

    }

    @Init
    private void load(FMLInitializationEvent event) {
        // SkyCraftBlocks contains all the blocks + block code
        SixCoreModBlocks.loadBlocks();

        // SkyCraftItems contains all the items + item code
        SixCoreModItems.loadItems();

        // SkyCraftOres contains all the ores + ore code
        SixCoreModOres.loadOres();

        // SkyCraftItems contains all the recipes + recipe code
        SixCoreModRecipes.loadRecipies();

    }
}
