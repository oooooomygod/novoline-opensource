/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.du_1;
import net.jb_2;
import net.nh_0;

/*
 * Renamed from net.j1
 */
public class j1_0
extends jb_2<nh_0> {
    private static ResourceLocation n = new ResourceLocation(du_1.a);

    @Override
    protected void a(nh_0 nh_02, float f) {
        GlStateManagerInvoker.c(0.7f, 0.7f, 0.7f);
    }

    @Override
    protected ResourceLocation a(nh_0 nh_02) {
        return n;
    }

    public j1_0(RenderManager renderManager) {
        super(renderManager);
        this.c *= 0.7f;
    }
}

