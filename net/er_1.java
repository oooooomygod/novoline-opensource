/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.GuiLogin;
import net.akn_0;

/*
 * Renamed from net.er
 */
public class er_1 {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (er_1.b() == null) {
            er_1.b(new int[2]);
        }
    }

    public static long b(GuiLogin guiLogin) {
        return guiLogin.a();
    }

    public static akn_0 a(GuiLogin guiLogin) {
        return guiLogin.b();
    }
}

