package cc.alovez.rogue.item;

import cc.alovez.rogue.client.ModelRegisterCallback;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;

public class ItemTimingArrow extends ItemArrow implements ModelRegisterCallback {
    public ItemTimingArrow()
    {
        super();
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.entity.player.EntityPlayer player)
    {
        return true;
    }
}
