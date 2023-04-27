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
import net.aO4;
import net.aV7;
import net.aax_2;
import net.apl_1;
import net.jn_0;
import net.nn_0;
import net.ys_2;

/*
 * Renamed from net.auL
 */
public class aul_1
implements KB {
    private static String a = "CL_00002418";
    private static ResourceLocation b;
    private jn_0 c;

    public void a(nn_0 nn_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        aO4.a(this.c, b);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.b(1, 1);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.c(!aax_2.a(nn_02));
        int n = 61680;
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        if (ys_2.aC()) {
            a3c_0.t();
        }
        aV7.a(aO4.a(this.c), nn_02, f, f2, f4, f5, f6, f7);
        aO4.a(this.c, nn_02, f3);
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.enableAlpha();
    }

    @Override
    public boolean a() {
        return false;
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((nn_0)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = ">F\u001fc<>GO>qk".toCharArray();
        int n2 = 0;
        int n3 = 13;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x70));
            n3 = n3;
        }
    }

    public aul_1(jn_0 jn_02) {
        this.c = jn_02;
    }
}

