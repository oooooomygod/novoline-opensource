/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.EntityLivingBase;
import net.KB;
import net.ResourceLocation;
import net.YZ;
import net.aFM;
import net.ajT;
import net.anr_0;
import net.au_1;
import net.jw_2;
import net.my_2;
import net.ne_1;
import net.qw_0;
import net.rb_1;
import net.ys_2;

/*
 * Renamed from net.Fj
 */
public class fj_0
implements KB {
    private jw_2 a;
    private rb_1 d = new rb_1();
    private static String b = "CL_00002413";
    private static ResourceLocation c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0000\u0004ANNa#q|/M".toCharArray();
        int n2 = 0;
        int n3 = 22;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x55));
            n3 = n3;
        }
    }

    public void a(ne_1 ne_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!au_1.d(ne_12) && !au_1.f(ne_12)) {
            qw_0.a(this.a, c);
            if (au_1.a(ne_12) && anr_0.b.equals(au_1.b(ne_12))) {
                boolean bl = true;
                int n = ne_12.ticksExisted / 25 + au_1.c(ne_12);
                int n2 = YZ.values().length;
                int n3 = n % n2;
                int n4 = (n + 1) % n2;
                float f8 = ((float)(ne_12.ticksExisted % 25) + f3) / 25.0f;
                float[] fArray = au_1.a(my_2.a(n3));
                float[] fArray2 = au_1.a(my_2.a(n4));
                if (ys_2.aF()) {
                    fArray = ajT.a(my_2.a(n3), fArray);
                    fArray2 = ajT.a(my_2.a(n4), fArray2);
                }
                GlStateManagerInvoker.b(fArray[0] * (1.0f - f8) + fArray2[0] * f8, fArray[1] * (1.0f - f8) + fArray2[1] * f8, fArray[2] * (1.0f - f8) + fArray2[2] * f8);
            } else {
                float[] fArray = au_1.a(au_1.e(ne_12));
                if (ys_2.aF()) {
                    fArray = ajT.a(au_1.e(ne_12), fArray);
                }
                GlStateManagerInvoker.b(fArray[0], fArray[1], fArray[2]);
            }
            aFM.a(this.d, qw_0.a(this.a));
            aFM.a(this.d, ne_12, f, f2, f3);
            aFM.a(this.d, ne_12, f, f2, f4, f5, f6, f7);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    public fj_0(jw_2 jw_22) {
        this.a = jw_22;
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((ne_1)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }
}

