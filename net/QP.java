/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.Minecraft;

public class QP
extends QG {
    private boolean r;
    private aYM q;
    private String p;

    private String a() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(this.p, new Object[0])), EZ.c), this.r ? I18n.format(EZ.b, new Object[0]) : I18n.format(EZ.d, new Object[0])).toString();
    }

    public QP(aYM aYM2, int n, int n2, int n3, String string, boolean bl) {
        super(n, n2, n3, 150, 20, EZ.a);
        this.p = string;
        this.r = bl;
        this.k = this.a();
        this.q = aYM2;
    }

    public void a(boolean bl) {
        this.r = bl;
        this.k = this.a();
        UQ.a(this.q, this.m, bl);
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        if (super.b(minecraft, n, n2)) {
            this.r = !this.r;
            this.k = this.a();
            UQ.a(this.q, this.m, this.r);
            return true;
        }
        return false;
    }
}

