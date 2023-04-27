/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.StatBase;
import net.aBC;
import net.aL0;
import net.aMC;
import net.aQG;

/*
 * Renamed from net.asH
 */
class ash_0
implements aQG {
    ash_0() {
    }

    @Override
    public String a(int n) {
        double d = (double)n / 20.0;
        double d2 = d / 60.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 24.0;
        double d5 = d4 / 365.0;
        return d5 > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d5)), aMC.d).toString() : (d4 > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d4)), aMC.b).toString() : (d3 > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d3)), aMC.c).toString() : (d2 > 0.5 ? aL0.a(aL0.a(new StringBuilder(), aBC.a(StatBase.d(), d2)), aMC.a).toString() : aL0.a(aL0.a(new StringBuilder(), d), aMC.e).toString())));
    }
}

