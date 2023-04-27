/*
 * Decompiled with CFR 0.152.
 */
package  cc.novoline.utils.fonts.api;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.utils.fonts.api.FontType;
import net.FontFamily;
import net.adj_1;

@FunctionalInterface
public interface FontManager {
    public FontFamily a(FontType var1);

    default public FontRenderer a(FontType fontType, int n) {
        return adj_1.a(this.a(fontType), n);
    }
}

