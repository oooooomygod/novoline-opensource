/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.I18n;
import net.QS;
import net.axi_2;
import net.rm_0;

class Q9
extends QS {
    rm_0 t;

    @Override
    public void b(int n, int n2) {
        rm_0.c(this.t, I18n.format(axi_2.a, new Object[0]), n, n2);
    }

    public Q9(rm_0 rm_02, int n, int n2, int n3) {
        this.t = rm_02;
        super(n, n2, n3, rm_0.a(), 90, 220);
    }
}

