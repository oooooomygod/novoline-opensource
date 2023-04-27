/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.utils.fonts.api.FontType;
import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
import java.awt.Font;
import net.FontFamily;
import net.nb_0;
import net.wq_0;

public class aGE
extends Int2ObjectAVLTreeMap<FontRenderer>
implements FontFamily {
    private Font b;
    private FontType a;

    private aGE(FontType fontType, Font font) {
        this.a = fontType;
        this.b = font;
    }

    private FontRenderer lambda$ofSize$0(int n, int n2) {
        return nb_0.a(wq_0.a(this.b, 0, n));
    }

    @Override
    public FontRenderer a(int n) {
        return (FontRenderer)this.computeIfAbsent(n, arg_0 -> this.lambda$ofSize$0(n, arg_0));
    }

    public static FontFamily a(FontType fontType, Font font) {
        return new aGE(fontType, font);
    }

    @Override
    public FontType a() {
        return this.a;
    }
}

