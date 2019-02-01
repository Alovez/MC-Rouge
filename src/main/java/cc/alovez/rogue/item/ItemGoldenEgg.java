package cc.alovez.rogue.item;

import cc.alovez.rogue.Rogue;
import net.minecraft.item.Item;

public class ItemGoldenEgg extends Item
{
    public ItemGoldenEgg()
    {
        super();
        this.setUnlocalizedName("goldenEgg");
        this.setRegistryName(Rogue.ID,"golden_egg");
    }
}