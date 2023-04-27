/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.jo_0;
import net.nd_1;
import net.q1_0;
import net.vb_2;

/*
 * Renamed from net.je
 */
public class je_2
extends jo_0<nd_1> {
    private static ResourceLocation m = new ResourceLocation(vb_2.a);

    @Override
    protected float a(nd_1 nd_12, float f) {
        float f2 = nd_12.bQ + (nd_12.bS - nd_12.bQ) * f;
        float f3 = nd_12.bP + (nd_12.bT - nd_12.bP) * f;
        return (MathHelper.sin(f2) + 1.0f) * f3;
    }

    @Override
    protected ResourceLocation a(nd_1 nd_12) {
        return m;
    }

    public je_2(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }
}

