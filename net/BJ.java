/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;

class BJ
extends BT
implements Comparable<BJ> {
    protected JE b;

    public int a(BJ bJ) {
        return v9_0.a(v9_0.a(v9_0.a(v9_0.a(), bJ.a, this.a), this.a(), bJ.a()));
    }

    public BJ(JE jE, int n) {
        super(n);
        this.b = jE;
    }

    protected int a() {
        int n = ListInvoker.size(aND.d(this.b));
        for (EnumFacing enumFacing : EnumFacing.values()) {
            n += ListInvoker.size(aND.a(this.b, enumFacing));
        }
        return n;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), aE5.b), this.a), aE5.a), this.b), '}').toString();
    }
}

