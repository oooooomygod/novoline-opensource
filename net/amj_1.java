/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.multiplayer.WorldClient;
import java.util.concurrent.Callable;

/*
 * Renamed from net.amJ
 */
class amj_1
implements Callable {
    WorldClient b;
    private static String a = "CL_00000883";

    public String a() {
        return aL0.a(aL0.a(aL0.c(new StringBuilder(), aS0.d(WorldClient.b(this.b))), a9l_0.a), WorldClient.b(this.b).toString()).toString();
    }

    amj_1(WorldClient worldClient) {
        this.b = worldClient;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u00132\"\ru)!`FE\u000e".toCharArray();
        int n2 = 0;
        int n3 = 70;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x16));
            n3 = n3;
        }
    }
}

