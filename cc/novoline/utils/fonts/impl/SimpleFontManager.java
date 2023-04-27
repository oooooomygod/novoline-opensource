/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.fonts.impl;

import cc.novoline.utils.fonts.api.FontType;
import deobf.FontManager;
import net.FontFamily;
import net.FontRegistry;

public class SimpleFontManager
implements FontManager {
    private static int[] b;
    private static String FONT_DIRECTORY = "novoline/fonts/";
    private FontRegistry c = new FontRegistry(null);

    public static int[] b() {
        return b;
    }


    public static void b(int[] nArray) {
        b = nArray;
    }

    private SimpleFontManager() {
    }

    @Override
    public FontFamily a(FontType fontType) {
        return FontRegistry.a(this.c, fontType);
    }

    public static FontManager c() {
        return new SimpleFontManager();
    }
}

