/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.FontRenderer;
import net.R8;

/*
 * Renamed from net.anJ
 */
public class anj_1 {
    private static int[] b;

    public static void a(R8 r8, FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        r8.a(fontRenderer, string, n, n2, n3);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    static {
        if (anj_1.b() == null) {
            anj_1.b(new int[2]);
        }
    }

    public static void a(R8 r8) {
        r8.h();
    }
}

