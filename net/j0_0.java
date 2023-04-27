/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.avq_1;
import net.ayq_1;
import net.jo_0;
import net.nb_1;
import net.q1_0;

/*
 * Renamed from net.j0
 */
public class j0_0
extends jo_0<nb_1> {
    private static ResourceLocation n = new ResourceLocation(avq_1.b);
    private static ResourceLocation o = new ResourceLocation(avq_1.c);
    private static ResourceLocation m;
    private static ResourceLocation p;

    static {
        p = new ResourceLocation(avq_1.a);
        m = new ResourceLocation(avq_1.d);
    }

    @Override
    protected void a(nb_1 nb_12, float f) {
        super.c(nb_12, f);
        if (ayq_1.d(nb_12)) {
            GlStateManagerInvoker.c(0.8f, 0.8f, 0.8f);
        }
    }

    @Override
    protected ResourceLocation a(nb_1 nb_12) {
        switch (ayq_1.e(nb_12)) {
            default: {
                return o;
            }
            case 1: {
                return n;
            }
            case 2: {
                return p;
            }
            case 3: 
        }
        return m;
    }

    public j0_0(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }
}

