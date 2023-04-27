/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.ado_1;
import net.ayh_1;
import net.jo_0;
import net.ki_1;
import net.nz_0;
import net.ri_2;

/*
 * Renamed from net.jJ
 */
public class jj_1
extends jo_0<nz_0> {
    private static ResourceLocation o;
    private static ResourceLocation m;
    private static ResourceLocation r;
    private static ResourceLocation n;
    private static ResourceLocation p;
    private static ResourceLocation q;

    public ri_2 a() {
        return (ri_2)super.d();
    }

    static {
        n = new ResourceLocation(ki_1.c);
        p = new ResourceLocation(ki_1.e);
        o = new ResourceLocation(ki_1.f);
        q = new ResourceLocation(ki_1.d);
        m = new ResourceLocation(ki_1.a);
        r = new ResourceLocation(ki_1.b);
    }

    public jj_1(RenderManager renderManager) {
        super(renderManager, new ri_2(0.0f), 0.5f);
        this.b(new ado_1(this.a().k));
    }

    @Override
    protected void a(nz_0 nz_02, float f) {
        float f2 = 0.9375f;
        if (ayh_1.c(nz_02) < 0) {
            f2 = (float)((double)f2 * 0.5);
            this.c = 0.25f;
        } else {
            this.c = 0.5f;
        }
        GlStateManagerInvoker.c(f2, f2, f2);
    }

    @Override
    protected ResourceLocation a(nz_0 nz_02) {
        switch (ayh_1.m(nz_02)) {
            case 0: {
                return p;
            }
            case 1: {
                return o;
            }
            case 2: {
                return q;
            }
            case 3: {
                return m;
            }
            case 4: {
                return r;
            }
        }
        return n;
    }
}

