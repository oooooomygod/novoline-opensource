/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.EntityLivingBase;
import net.KB;
import net.QV;
import net.ResourceLocation;
import net.YZ;
import net.aQH;
import net.aV7;
import net.ajT;
import net.au_1;
import net.k6_0;
import net.my_2;
import net.nf_1;
import net.ys_2;

/*
 * Renamed from net.aIk
 */
public class aik_0
implements KB {
    private static ResourceLocation c;
    private k6_0 a;
    private static String b = "CL_00002405";

    public void a(nf_1 nf_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (QV.d(nf_12) && !QV.b(nf_12)) {
            aQH.a(this.a, c);
            YZ yZ = my_2.a(my_2.a(QV.j(nf_12)));
            float[] fArray = au_1.a(yZ);
            if (ys_2.aF()) {
                fArray = ajT.b(yZ, fArray);
            }
            GlStateManagerInvoker.b(fArray[0], fArray[1], fArray[2]);
            aV7.a(aQH.a(this.a), nf_12, f, f2, f4, f5, f6, f7);
        }
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((nf_1)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }

    @Override
    public boolean a() {
        return true;
    }

    public aik_0(k6_0 k6_02) {
        this.a = k6_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "PD0N:\u0010Y!<_K".toCharArray();
        int n2 = 0;
        int n3 = 4;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x17));
            n3 = n3;
        }
    }
}

