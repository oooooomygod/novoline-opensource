/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Font;
import java.io.InputStream;

/*
 * Renamed from net.Wq
 */
public class wq_0 {
    public static String a(Font font) {
        return font.getFamily();
    }

    public static Font a(int n, InputStream inputStream) {
        return Font.createFont(n, inputStream);
    }

    public static Font a(Font font, int n, float f) {
        return font.deriveFont(n, f);
    }

    public static Font a(Font font, int n) {
        return font.deriveFont(n);
    }
}

