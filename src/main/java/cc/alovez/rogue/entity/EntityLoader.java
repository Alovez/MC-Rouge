package cc.alovez.rogue.entity;

import cc.alovez.rogue.client.entity.EntityRenderFactory;
import cc.alovez.rogue.client.entity.render.RenderTimingArrow;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.swing.border.EtchedBorder;

public class EntityLoader
{
    private static int nextID = 0;

    public EntityLoader()
    {
        registerEntity(EntityTimingArrow.class, "TimingArrow",  "timing_arrow",300,
                1, true);
    }



    private static void registerEntity(Class<? extends Entity> entityClass, String name, String sourceName, int trackingRange,
                                       int updateFrequency, boolean sendsVelocityUpdates)
    {
        EntityEntry entry = EntityEntryBuilder.create()
                .entity(entityClass)
                .id(new ResourceLocation(sourceName), nextID++)
                .name(name)
                .tracker(trackingRange, updateFrequency, sendsVelocityUpdates)
            .build();
        ForgeRegistries.ENTITIES.register(entry);
    }


    @SideOnly(Side.CLIENT)
    private static <T extends Entity> void registerEntityRender(Class<T> entityClass, Class<? extends Render<T>> render)
    {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderFactory<T>(render));
    }


    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerEntityRender(EntityTimingArrow.class, RenderTimingArrow.class);
    }
}