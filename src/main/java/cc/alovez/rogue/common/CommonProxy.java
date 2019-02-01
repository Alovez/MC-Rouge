package cc.alovez.rogue.common;

import cc.alovez.rogue.entity.EntityLoader;
import cc.alovez.rogue.item.ItemLoader;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
//        new ItemLoader(event);
        new EventLoader();
        new EntityLoader();
    }


    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}