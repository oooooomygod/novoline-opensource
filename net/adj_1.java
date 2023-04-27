/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import net.FontFamily;

/*
 * Renamed from net.adJ
 */
public class adj_1 {
    private static int b;

    public static int b() {
        return b;
    }

    public static FontRenderer a(FontFamily fontFamily, int n) {
        return fontFamily.a(n);
    }

    public static void b(int n) {
        b = n;
    }

    public static int a() {
        adj_1.b();
        return 11;
    }

    static {
        if (adj_1.a() == 0) {
            adj_1.b(40);
        }
    }
}

