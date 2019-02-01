package cc.alovez.rogue.item;

import cc.alovez.rogue.Rogue;
import cc.alovez.rogue.client.ModelRegisterCallback;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.logging.Logger;

@Mod.EventBusSubscriber(modid = Rogue.ID, value = Side.CLIENT)
public class RogueRegisterItemRenderEvent {

    static Logger logger = Logger.getLogger(Rogue.ID);

    @SubscribeEvent
    public static void onModelRegistryReady(ModelRegistryEvent event) {
        logger.info("Enter ModelRegistry");
        for (ModelRegisterCallback i : RogueRegisterItemEvent.ItemRegistryHelper.getItemModels()){
            logger.info("Registering " + i.getClass().getName());
            i.registerModel();
        }
    }
}
