/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.IntegratedServer;
import net.mg_1;

/*
 * Renamed from net.arC
 */
class arc_1
implements Callable {
    IntegratedServer a;
    private static String b = "CL_00001130";

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = ")>OD\u0017UX[C#D".toCharArray();
        int n2 = 0;
        int n3 = 34;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x48));
            n3 = n3;
        }
    }

    public String a() {
        return mg_1.a;
    }

    arc_1(IntegratedServer integratedServer) {
        this.a = integratedServer;
    }
}

