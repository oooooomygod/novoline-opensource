/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qa
 */
public class qa_0
extends QD {
    protected int m;

    public int a() {
        return this.m;
    }

    @Override
    public void a(Minecraft minecraft, int n, int n2) {
        HZ.b();
        if (this.h) {
            return;
        }
        a1V.a((float)this.j, (float)this.g, (float)this.k, (float)this.i, 0.0f, new Color(0, 0, 0, 120));
        if (this.l != null) {
            a7l_0.a(this.f, (CharSequence)this.l, (float)this.j + (float)(this.k - a7l_0.a(this.f, this.l)) / 2.0f, this.g + 4, aol_1.b(new Color(198, 198, 198)));
        }
    }

    public qa_0(String string, int n, int n2, int n3, int n4, int n5, FontRenderer fontRenderer) {
        super(string, n, n2, n3, n4, fontRenderer);
        this.m = n5;
    }

    public qa_0(String string, int n, int n2, int n3, int n4, int n5) {
        super(string, n, n2, n3, n4);
        this.m = n5;
    }
}

