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
import net.aSX;
import net.aV7;
import net.apl_1;
import net.jb_2;
import net.lg_1;
import net.n9_0;
import net.ys_2;

/*
 * Renamed from net.az5
 */
public class az5_0
implements KB {
    private static String b = "CL_00002410";
    private jb_2 a;
    private static ResourceLocation c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Y\u0000d\u0007{6\u0005(x\n\u0007".toCharArray();
        int n2 = 0;
        int n3 = 71;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x5D));
            n3 = n3;
        }
    }

    public az5_0(jb_2 jb_22) {
        this.a = jb_22;
    }

    @Override
    public boolean a() {
        return false;
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((n9_0)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }

    public void a(n9_0 n9_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        lg_1.a(this.a, c);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.b(1, 1);
        if (aSX.a(n9_02)) {
            GlStateManagerInvoker.c(false);
        } else {
            GlStateManagerInvoker.c(true);
        }
        int n = 61680;
        int n2 = n % 65536;
        int n3 = n / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        if (ys_2.aC()) {
            a3c_0.t();
        }
        aV7.a(lg_1.a(this.a), n9_02, f, f2, f4, f5, f6, f7);
        int n4 = aSX.a(n9_02, f3);
        n2 = n4 % 65536;
        n3 = n4 / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
        lg_1.a(this.a, n9_02, f3);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.enableAlpha();
    }
}

