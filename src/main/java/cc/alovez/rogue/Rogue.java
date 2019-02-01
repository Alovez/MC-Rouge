package cc.alovez.rogue;

import cc.alovez.rogue.common.CommonProxy;
import cc.alovez.rogue.item.ItemGoldenEgg;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.logging.Logger;


@Mod(modid = Rogue.ID, name = Rogue.NAME, version = Rogue.VERSION, acceptedMinecraftVersions = "1.12")
public class Rogue {

    public Logger logger = Logger.getLogger("Rogue");

    public static final String ID = "rogue";
    public static final String NAME = "Rogue";
    public static final String VERSION = "0.1.0";
    @SidedProxy(clientSide = "cc.alovez.rogue.client.ClientProxy",
            serverSide = "cc.alovez.rogue.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(Rogue.ID)
    public static Rogue instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger.info("Enter Pre Init");
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }


}
