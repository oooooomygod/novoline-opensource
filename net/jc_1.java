/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.FY;
import net.RenderManager;
import net.ResourceLocation;
import net.ang_2;
import net.jo_0;
import net.ng_1;
import net.q1_0;
import net.tc_0;

/*
 * Renamed from net.jC
 */
public class jc_1
extends jo_0<ng_1> {
    private static ResourceLocation t;
    private static ResourceLocation n;
    private static ResourceLocation o;
    private static ResourceLocation s;
    private static ResourceLocation m;
    private static ResourceLocation p;
    private static ResourceLocation r;
    private static ResourceLocation q;

    @Override
    protected ResourceLocation a(ng_1 ng_12) {
        String string = tc_0.b(FY.d(ng_12));
        if (string.equals(ang_2.d)) {
            return o;
        }
        switch (FY.c(ng_12)) {
            default: {
                return s;
            }
            case 1: {
                return r;
            }
            case 2: {
                return p;
            }
            case 3: {
                return n;
            }
            case 4: {
                return t;
            }
            case 5: {
                return m;
            }
            case 99: 
        }
        return q;
    }

    public jc_1(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }

    static {
        s = new ResourceLocation(ang_2.e);
        r = new ResourceLocation(ang_2.b);
        p = new ResourceLocation(ang_2.a);
        t = new ResourceLocation(ang_2.h);
        m = new ResourceLocation(ang_2.c);
        n = new ResourceLocation(ang_2.f);
        o = new ResourceLocation(ang_2.i);
        q = new ResourceLocation(ang_2.g);
    }
}

