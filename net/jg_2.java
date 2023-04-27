/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.RenderManager;
import net.ResourceLocation;
import net.ayj_0;
import net.j7_0;

/*
 * Renamed from net.jg
 */
public class jg_2
extends j7_0<Entity> {
    @Override
    public void b(Entity entity, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        jg_2.a(ayj_0.u(entity), d - entity.lastTickPosX, d2 - entity.lastTickPosY, d3 - entity.lastTickPosZ);
        GlStateManagerInvoker.popMatrix();
        super.b(entity, d, d2, d3, f, f2);
    }

    @Override
    protected ResourceLocation a(Entity entity) {
        return null;
    }

    public jg_2(RenderManager renderManager) {
        super(renderManager);
    }
}

