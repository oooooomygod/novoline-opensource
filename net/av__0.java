/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.PlayerInvoker;
import net.minecraft.multiplayer.WorldClient;
import java.util.concurrent.Callable;

/*
 * Renamed from net.av_
 */
class av__0
implements Callable {
    WorldClient a;
    private static String b = "CL_00000885";

    av__0(WorldClient worldClient) {
        this.a = worldClient;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "b<\bg^Rs\u0011Hob".toCharArray();
        int n2 = 0;
        int n3 = 84;
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

    public String a() {
        return PlayerInvoker.y(WorldClient.c((WorldClient)this.a).player);
    }
}

