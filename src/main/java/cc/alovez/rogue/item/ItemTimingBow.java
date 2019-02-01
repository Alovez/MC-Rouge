package cc.alovez.rogue.item;

import cc.alovez.rogue.Rogue;
import cc.alovez.rogue.entity.EntityTimingArrow;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTimingBow extends ItemBowBase {
    public ItemTimingBow()
    {
        super();
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    protected EntityArrow getArrow(World world, ItemStack stack, EntityPlayer entityPlayer) {
        return new EntityTimingArrow(world, entityPlayer);
    }
}
