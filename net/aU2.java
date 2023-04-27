/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import net.minecraft.client.Minecraft;

class aU2
implements Callable {
    private static String a = "CL_00001131";
    IntegratedServer b;

    public String a() {
        String string = pm_1.a();
        if (!string.equals(yk_1.c)) {
            return aL0.a(aL0.a(aL0.a(new StringBuilder(), yk_1.d), string), yk_1.a).toString();
        }
        string = this.b.e();
        return !string.equals(yk_1.h) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), yk_1.g), string), yk_1.b).toString() : (ara_2.o(Minecraft.class) == null ? yk_1.f : yk_1.e);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "1nC\u0011W\u0019\u0011C\u0013/\u0010".toCharArray();
        int n2 = 0;
        int n3 = 110;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x1C));
            n3 = n3;
        }
    }

    aU2(IntegratedServer integratedServer) {
        this.b = integratedServer;
    }
}

