/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.RenderManager;
import net.ResourceLocation;
import net.aq9_0;
import net.jo_0;
import net.nq_2;
import net.rt_1;
import net.zt_2;

/*
 * Renamed from net.jK
 */
public class jk_0
extends jo_0<nq_2> {
    private static ResourceLocation m = new ResourceLocation(zt_2.a);

    @Override
    protected ResourceLocation a(nq_2 nq_22) {
        return m;
    }

    public rt_1 a() {
        return (rt_1)super.d();
    }

    public jk_0(RenderManager renderManager) {
        super(renderManager, new rt_1(), 0.5f);
        this.b(new aq9_0(this));
    }
}

