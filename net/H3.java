/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.minecraft.multiplayer.WorldClient;
import java.util.concurrent.Callable;

class H3
implements Callable {
    WorldClient b;
    private static String a = "CL_00000886";

    public String a() {
        return MCInvoker.q(WorldClient.c(this.b)) == null ? ale_0.a : ale_0.b;
    }

    H3(WorldClient worldClient) {
        this.b = worldClient;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "&>\u000el/\u001f<UJij".toCharArray();
        int n2 = 0;
        int n3 = 17;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x74));
            n3 = n3;
        }
    }
}

