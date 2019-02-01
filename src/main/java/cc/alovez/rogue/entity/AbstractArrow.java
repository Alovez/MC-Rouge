package cc.alovez.rogue.entity;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public abstract class AbstractArrow extends EntityArrow {

    public AbstractArrow(World par1World){
        super(par1World);
    }

    public AbstractArrow(World par1World, EntityLivingBase par2EntityLivingBase) {
        super(par1World, par2EntityLivingBase);
    }

    public AbstractArrow(World par1World, double x, double y, double z) {
        super(par1World, x, y, z);
    }

    public abstract boolean onHitEntity(Entity entityHit, DamageSource source, float amount);

    public abstract void onHitGround(BlockPos pos);

    @Override
    public void onUpdate() {
        super.onUpdate();

        if(inGround && isEntityAlive()){
            onHitGround(new BlockPos(this.posX, this.posY, this.posZ));
        }
    }

    @Override
    protected void onHit(RayTraceResult raytraceResultIn){
        if(raytraceResultIn.entityHit==null){
            IBlockState iblockstate = this.world.getBlockState(raytraceResultIn.getBlockPos());
            if(iblockstate.getMaterial()!= Material.AIR){
                onHitGround(raytraceResultIn.getBlockPos());
            }
        }
        super.onHit(raytraceResultIn);
    }

    @Override
    protected ItemStack getArrowStack() {
        return new ItemStack(Items.ARROW);
    }
}