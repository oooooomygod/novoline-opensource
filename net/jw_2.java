/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.aEA;
import net.fj_0;
import net.jo_0;
import net.ne_1;
import net.q1_0;

/*
 * Renamed from net.jw
 */
public class jw_2
extends jo_0<ne_1> {
    private static ResourceLocation m = new ResourceLocation(aEA.a);

    public jw_2(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
        this.b(new fj_0(this));
    }

    @Override
    protected ResourceLocation a(ne_1 ne_12) {
        return m;
    }
}

