/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontType;
import java.awt.Font;
import net.FontFamily;
import net.aGE;

/*
 * Renamed from net.ae7
 */
public class ae7_0 {
    private static boolean b;

    public static boolean c() {
        ae7_0.b();
        return true;
    }

    static {
        if (ae7_0.b()) {
            ae7_0.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static FontFamily a(FontType fontType, Font font) {
        return aGE.a(fontType, font);
    }
}

