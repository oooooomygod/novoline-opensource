/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;

public class QO
extends QG {
    private FontRenderer p;
    private int q;

    @Override
    public void a(@NotNull SoundHandler soundHandler) {
        super.a(soundHandler);
    }

    public QO(String string, int n, int n2, int n3, int n4, int n5, int n6, @NotNull FontRenderer fontRenderer) {
        super(n, n2, n3, n4, n5, string);
        this.q = n6;
        this.p = fontRenderer;
    }

    public int b() {
        return this.q;
    }

    public QO(String string, int n, int n2, int n3, int n4, @NotNull FontRenderer fontRenderer) {
        this(string, n, n2, n3, 200, 20, n4, fontRenderer);
    }

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        ant_0.b();
        if (!this.j) {
            return;
        }
        double d = this.n;
        double d2 = this.h;
        int n3 = this.o;
        int n4 = this.i;
        this.f = (double)n >= d && (double)n2 >= d2 && (double)n < d + (double)n3 && (double)n2 < d2 + (double)n4;
        int n5 = this.f ? 150 : 120;
        a1V.a((float)((int)d), (float)((int)d2 + 1), (float)n3, (float)n4, 0.0f, new Color(0, 0, 0, n5));
        this.a(minecraft, n, n2);
        a7l_0.b(this.p, this.k, (float)((int)d) + (float)(n3 - a7l_0.a(this.p, this.k)) / 2.0f, (float)((int)d2 + 2) + (float)(n4 - this.p.b()) / 2.0f, aol_1.b(new Color(198, 198, 198)), false);
    }
}

