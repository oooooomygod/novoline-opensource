/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import java.util.concurrent.Callable;
import deobf.EntityRenderer;

/*
 * Renamed from net.Ue
 */
class ue_0
implements Callable {
    EntityRenderer a;
    private static String b = "CL_00000948";

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "&x\bc\u0004\u0005PU\rck".toCharArray();
        int n2 = 0;
        int n3 = 56;
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

    ue_0(EntityRenderer entityRenderer) {
        this.a = entityRenderer;
    }

    public String a() throws Exception {
        return ara_2.k(MCInvoker.f().currentScreen.getClass());
    }
}

