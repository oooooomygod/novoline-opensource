/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontType;
import deobf.FontManager;
import net.FontFamily;

/*
 * Renamed from net.auv
 */
public class auv_2 {
    private static String[] b;

    public static FontFamily a(FontManager fontManager, FontType fontType) {
        return fontManager.a(fontType);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (auv_2.b() != null) {
            auv_2.b(new String[1]);
        }
    }

    public static String[] b() {
        return b;
    }
}

