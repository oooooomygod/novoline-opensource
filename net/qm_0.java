/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.I18n;
import net.M7;
import net.QG;
import net.XG;
import net.a3c_0;
import net.aL0;
import net.aLR;
import net.aVE;
import net.axm_2;
import net.lf_1;
import net.lo_2;

/*
 * Renamed from net.Qm
 */
public class qm_0
extends QG {
    private axm_2 p;

    public qm_0(axm_2 axm_22, int n, int n2, int n3, int n4) {
        super(axm_22.ordinal(), n, n2, n3, n4, qm_0.a(axm_22));
        this.p = axm_22;
    }

    public void a() {
        this.k = qm_0.a(this.p);
    }

    private static String a(axm_2 axm_22) {
        String string = aL0.a(aL0.a(new StringBuilder(), I18n.format(lo_2.c(axm_22), new Object[0])), XG.a).toString();
        switch (lf_1.a[axm_22.ordinal()]) {
            case 1: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.c1)).toString();
            }
            case 2: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.ci)).toString();
            }
            case 3: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.r)).toString();
            }
            case 4: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.b(aVE.aB)).toString();
            }
            case 5: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.b(aVE.bA)).toString();
            }
            case 6: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.bV)).toString();
            }
            case 7: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.bE)).toString();
            }
            case 8: {
                return aL0.a(aL0.a(new StringBuilder(), string), aLR.b(aVE.cn)).toString();
            }
            case 9: {
                return aL0.a(aL0.a(new StringBuilder(), string), aLR.b(aVE.dg)).toString();
            }
            case 10: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.bS)).toString();
            }
            case 11: {
                return aL0.a(aL0.a(new StringBuilder(), string), M7.a(aVE.ea)).toString();
            }
        }
        return aL0.a(aL0.a(new StringBuilder(), string), a3c_0.a(axm_22)).toString();
    }

    public axm_2 b() {
        return this.p;
    }
}

