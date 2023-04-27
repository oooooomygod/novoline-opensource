/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.StatBase;
import net.aBC;
import net.aL0;
import net.aQG;
import net.aRE;

/*
 * Renamed from net.dW
 */
class dw_1
implements aQG {
    @Override
    public String a(int n) {
        double d = (double)n / 100.0;
        double d2 = d / 1000.0;
        return d2 > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d2)), aRE.c).toString() : (d > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d)), aRE.b).toString() : aL0.a(aL0.c(new StringBuilder(), n), aRE.a).toString());
    }

    dw_1() {
    }
}

