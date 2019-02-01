package cc.alovez.rogue.item;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import cc.alovez.rogue.Rogue;

import java.util.UUID;

@GameRegistry.ObjectHolder(Rogue.ID)
public class RogueItems {
    static final UUID GIANT_REACH_MODIFIER = UUID.fromString("7f10172d-de69-49d7-81bd-9594286a6827");

    @GameRegistry.ObjectHolder("timing_bow")
    public static final Item timing_bow;

    @GameRegistry.ObjectHolder("timing_arrow")
    public static final Item timing_arrow;

    static {
        timing_bow = null;
        timing_arrow = null;
    }
}
