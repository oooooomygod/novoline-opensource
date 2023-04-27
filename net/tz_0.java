/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.EntityLivingBase;
import deobf.OpenGlHelper;
import net.KB;
import net.ResourceLocation;
import net.a3c_0;
import net.aV7;
import net.apl_1;
import net.jd_1;
import net.ns_2;
import net.xu_2;
import net.ys_2;

/*
 * Renamed from net.Tz
 */
public class tz_0
implements KB {
    private static String c = "CL_00002419";
    private static ResourceLocation a;
    private jd_1 b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "$i>\u000fR\u0014<U\u0011P\u0006".toCharArray();
        int n2 = 0;
        int n3 = 76;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x2B));
            n3 = n3;
        }
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((ns_2)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public boolean a() {
        return false;
    }

    public void a(ns_2 ns_22, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        xu_2.a(this.b, a);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.b(1, 1);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.depthFunc(514);
        int n = 61680;
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        if (ys_2.aC()) {
            a3c_0.t();
        }
        aV7.a(xu_2.a(this.b), ns_22, f, f2, f4, f5, f6, f7);
        xu_2.a(this.b, ns_22, f3);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.depthFunc(515);
    }

    public tz_0(jd_1 jd_12) {
        this.b = jd_12;
    }
}

