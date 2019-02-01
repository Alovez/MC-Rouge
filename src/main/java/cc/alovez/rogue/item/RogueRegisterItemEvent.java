package cc.alovez.rogue.item;

import cc.alovez.rogue.Rogue;
import cc.alovez.rogue.client.ModelRegisterCallback;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.*;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Arrays.stream;
import static net.minecraft.init.MobEffects.REGENERATION;
import static net.minecraft.inventory.EntityEquipmentSlot.*;
import static net.minecraft.item.Item.ToolMaterial.DIAMOND;
import static net.minecraft.item.Item.ToolMaterial.GOLD;
import static cc.alovez.rogue.item.RogueItems.*;

@Mod.EventBusSubscriber(modid = Rogue.ID)
public class RogueRegisterItemEvent {
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        ItemRegistryHelper items = new ItemRegistryHelper(event.getRegistry());

        items.register("timing_bow", "timingBow", new ItemTimingBow().setMaxStackSize(1));
        items.register("timing_arrow", "timingArrow", new ItemTimingArrow().setMaxStackSize(1));
    }

    public static class ItemRegistryHelper {

        static Logger logger = Logger.getLogger(Rogue.ID);

        private final IForgeRegistry<Item> registry;

        private static List<ModelRegisterCallback> itemModels = new ArrayList<>();

        static List<ModelRegisterCallback> getItemModels() {
            return ImmutableList.copyOf(itemModels);
        }


        ItemRegistryHelper(IForgeRegistry<Item> registry) {
            this.registry = registry;
        }



        <T extends Item> void register(String registryName, String translationKey, T item) {
            item.setUnlocalizedName(translationKey);
            register(registryName, item);
        }

        public <T extends Item> Item register(String registryName, T item) {
            item.setRegistryName(Rogue.ID, registryName);
            if (item instanceof ModelRegisterCallback) {
                itemModels.add((ModelRegisterCallback) item);
            }
            registry.register(item);

            return item;
        }
    }
}
