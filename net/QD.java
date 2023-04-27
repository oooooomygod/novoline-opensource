/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.minecraft.client.Minecraft;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class QD
extends Gui {
    protected int g;
    protected FontRenderer f;
    protected int k;
    protected boolean h;
    protected int j;
    protected int i;
    protected String l;

    public void a(Minecraft minecraft, int n, int n2) {
        HZ.c();
        if (this.h) {
            return;
        }
        a1V.c(this.j, this.g, this.k, this.i, -754974721);
        if (this.l != null) {
            a7l_0.a(this.f, (CharSequence)this.l, (float)this.j + (float)(this.k - a7l_0.a(this.f, this.l)) / 2.0f, this.g + 4, 0);
        }
    }

    protected QD(@Nullable String string, int n, int n2, int n3, int n4, @NotNull FontRenderer fontRenderer) {
        HZ.b();
        this.l = string != null && !StringInvoker.g(string = StringInvoker.h(string)) ? string : null;
        this.j = n;
        this.g = n2;
        this.k = n3;
        this.i = n4;
        this.f = fontRenderer;
    }

    protected QD(String string, int n, int n2, int n3, int n4) {
        this(string, n, n2, n3, n4, kx_2.a);
    }
}

