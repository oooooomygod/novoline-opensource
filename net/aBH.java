/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import deobf.EntityPlayerMP;

class aBH
implements Runnable {
    IntegratedServer a;
    private static String b = "CL_00002380";

    aBH(IntegratedServer integratedServer) {
        this.a = integratedServer;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "V\u001c+\u0006X^\u0006'cL\u0006".toCharArray();
        int n2 = 0;
        int n3 = 70;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x53));
            n3 = n3;
        }
    }

    @Override
    public void run() {
        Iterator iterator = akr_1.a(my_0.a((Iterable)aek_1.l(this.a.an())));
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            aek_1.b(this.a.an(), entityPlayerMP);
        }
    }
}

