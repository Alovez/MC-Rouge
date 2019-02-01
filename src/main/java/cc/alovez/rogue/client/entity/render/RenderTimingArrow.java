package cc.alovez.rogue.client.entity.render;

import cc.alovez.rogue.entity.EntityTimingArrow;
import cc.alovez.rogue.item.ItemLoader;
import cc.alovez.rogue.item.ItemTimingArrow;
import cc.alovez.rogue.item.RogueItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class RenderTimingArrow extends RenderSnowball<EntityTimingArrow> {

    public RenderTimingArrow(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new RogueItems().timing_arrow, Minecraft.getMinecraft().getRenderItem());
    }
}
