package cc.alovez.rogue.item;

import cc.alovez.rogue.Rogue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemWand extends Item
{

    public ItemWand()
    {
        super();
        this.setUnlocalizedName("wand");
        this.setRegistryName(Rogue.ID, "wand");
    }



    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
    {
        try {
            EntityPlayer livingEntity = (EntityPlayer)entity;
            livingEntity.setHealth(livingEntity.getHealth() + 3);
            player.setHealth(player.getHealth() - 1);
        }
        catch (Exception e){

        }
        return false;
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        playerIn.setHealth(playerIn.getHealth() + 3);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

}
