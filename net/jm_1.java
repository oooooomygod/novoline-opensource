/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import java.util.Map;
import net.JU;
import net.RenderManager;
import net.ResourceLocation;
import net.aal_0;
import net.avq_0;
import net.jo_0;
import net.na_1;
import net.r5_0;

/*
 * Renamed from net.jM
 */
public class jm_1
extends jo_0<na_1> {
    private static ResourceLocation r;
    private static ResourceLocation p;
    private static ResourceLocation o;
    private static ResourceLocation m;
    private static Map<String, ResourceLocation> q;
    private static ResourceLocation n;

    private ResourceLocation b(na_1 na_12) {
        String string = avq_0.a(na_12);
        if (!avq_0.c(na_12)) {
            return null;
        }
        ResourceLocation resourceLocation = (ResourceLocation)MapInvoker.c(q, string);
        resourceLocation = new ResourceLocation(string);
        TextureManagerInvoker.a(MCInvoker.E(MCInvoker.f()), resourceLocation, new JU(avq_0.d(na_12)));
        MapInvoker.c(q, string, resourceLocation);
        return resourceLocation;
    }

    @Override
    protected void a(na_1 na_12, float f) {
        float f2 = 1.0f;
        int n = avq_0.o(na_12);
        if (n == 1) {
            f2 *= 0.87f;
        } else if (n == 2) {
            f2 *= 0.92f;
        }
        GlStateManagerInvoker.c(f2, f2, f2);
        super.c(na_12, f);
    }

    public jm_1(RenderManager renderManager, r5_0 r5_02, float f) {
        super(renderManager, r5_02, f);
    }

    static {
        q = MapsInvoker.a();
        p = new ResourceLocation(aal_0.c);
        n = new ResourceLocation(aal_0.e);
        o = new ResourceLocation(aal_0.a);
        r = new ResourceLocation(aal_0.d);
        m = new ResourceLocation(aal_0.b);
    }

    @Override
    protected ResourceLocation a(na_1 na_12) {
        if (!avq_0.g(na_12)) {
            switch (avq_0.o(na_12)) {
                default: {
                    return p;
                }
                case 1: {
                    return o;
                }
                case 2: {
                    return n;
                }
                case 3: {
                    return r;
                }
                case 4: 
            }
            return m;
        }
        return this.b(na_12);
    }
}

