/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.GuiContainer;
import net.I18n;
import net.Potion;
import net.QS;
import net.TD;
import net.aL0;
import net.ari_0;
import net.rm_0;

class QH
extends QS {
    private int u;
    private int t;
    rm_0 v;

    public QH(rm_0 rm_02, int n, int n2, int n3, int n4, int n5) {
        this.v = rm_02;
        super(n, n2, n3, GuiContainer.ae, ari_0.i(Potion.potionTypes[n4]) % 8 * 18, 198 + ari_0.i(Potion.potionTypes[n4]) / 8 * 18);
        this.u = n4;
        this.t = n5;
    }

    @Override
    public void b(int n, int n2) {
        String string = I18n.format(ari_0.d(Potion.potionTypes[this.u]), new Object[0]);
        if (this.t >= 3 && this.u != ari_0.f(Potion.regeneration)) {
            string = aL0.a(aL0.a(new StringBuilder(), string), TD.a).toString();
        }
        rm_0.b(this.v, string, n, n2);
    }
}

