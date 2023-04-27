/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.a_0;
import net.jo_0;
import net.nr_1;
import net.q1_0;
import net.zf_1;

/*
 * Renamed from net.jm
 */
public class jm_2
extends jo_0<nr_1> {
    private static ResourceLocation m = new ResourceLocation(zf_1.a);

    @Override
    protected ResourceLocation a(nr_1 nr_12) {
        return m;
    }

    public jm_2(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
        this.b(new a_0(this));
    }
}

