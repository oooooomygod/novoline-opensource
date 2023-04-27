/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EnumFacing;

/*
 * Renamed from net.ez
 */
public class ez_2
extends eg_0<a6t_0> {
    private rq_2 g;
    private static ResourceLocation h;
    private static ResourceLocation f;
    private rq_2 e = new rq_2(0, 0, 64, 32);
    public static ez_2 i;
    private static ResourceLocation c;
    private static ResourceLocation d;

    public void a(float f, float f2, float f3, EnumFacing enumFacing, float f4, int n, GameProfile gameProfile, int n2) {
        rq_2 rq_22 = this.e;
        this.a(a[n2]);
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(4.0f, 2.0f, 1.0f);
        GlStateManagerInvoker.translate(0.0625f, 0.0625f, 0.0625f);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.A();
        if (enumFacing != EnumFacing.UP) {
            switch (enumFacing) {
                case NORTH: {
                    GlStateManagerInvoker.translate(f + 0.5f, f2 + 0.25f, f3 + 0.74f);
                    break;
                }
                case SOUTH: {
                    GlStateManagerInvoker.translate(f + 0.5f, f2 + 0.25f, f3 + 0.26f);
                    f4 = 180.0f;
                    break;
                }
                case WEST: {
                    GlStateManagerInvoker.translate(f + 0.74f, f2 + 0.25f, f3 + 0.5f);
                    f4 = 270.0f;
                    break;
                }
                default: {
                    GlStateManagerInvoker.translate(f + 0.26f, f2 + 0.25f, f3 + 0.5f);
                    f4 = 90.0f;
                    break;
                }
            }
        } else {
            GlStateManagerInvoker.translate(f + 0.5f, f2, f3 + 0.5f);
        }
        float f5 = 0.0625f;
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
        GlStateManagerInvoker.enableAlpha();
        aV7.a((q1_0)rq_22, null, 0.0f, 0.0f, 0.0f, f4, 0.0f, f5);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5888);
    }

    @Override
    public void a(hq_0 hq_02) {
        super.a(hq_02);
        i = this;
    }

    public ez_2() {
        this.g = new re_2();
    }

    @Override
    public void a(a6t_0 a6t_02, double d, double d2, double d3, float f, int n) {
        EnumFacing enumFacing = SJ.a(gk_0.b(a6t_02) & 7);
        this.a((float)d, (float)d2, (float)d3, enumFacing, (float)(gk_0.d(a6t_02) * 360) / 16.0f, gk_0.c(a6t_02), gk_0.a(a6t_02), n);
    }

    static {
        d = new ResourceLocation(qp_1.a);
        f = new ResourceLocation(qp_1.b);
        h = new ResourceLocation(qp_1.d);
        c = new ResourceLocation(qp_1.c);
    }
}

