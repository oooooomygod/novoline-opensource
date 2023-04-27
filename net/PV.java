/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.multiplayer.WorldClient;
import java.util.concurrent.Callable;

class PV
implements Callable {
    private static String b = "CL_00000884";
    WorldClient a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Wq\u001dk3Jh$\u0005zo".toCharArray();
        int n2 = 0;
        int n3 = 97;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x75));
            n3 = n3;
        }
    }

    PV(WorldClient worldClient) {
        this.a = worldClient;
    }

    public String a() {
        return aL0.a(aL0.a(aL0.c(new StringBuilder(), aS0.d(WorldClient.a(this.a))), a8A.a), WorldClient.a(this.a).toString()).toString();
    }
}

