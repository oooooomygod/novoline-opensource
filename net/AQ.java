/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import net.AW;
import net.a73;
import net.aL0;
import net.af_0;
import net.hw_0;
import net.il_0;
import org.apache.logging.log4j.Logger;

public class AQ
extends AW {
    private AW f;
    private static Logger e = LogManagerInvoker.c();

    public AQ(long l4, AW aW10, AW aW11) {
        super(l4);
        this.d = aW10;
        this.f = aW11;
    }

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = this.f.b(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray3 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                this.a((long)(j + n), (long)(i + n2));
                int n6 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                int n7 = nArray2[j + 1 + (i + 1) * (n3 + 2)];
                boolean bl = (n7 - 2) % 29 == 0;
                if (n6 > 255) {
                    LoggerInvoker.b(e, aL0.c(aL0.a(new StringBuilder(), a73.a), n6).toString());
                }
                if (n7 >= 2 && (n7 - 2) % 29 == 1 && n6 < 128) {
                    if (hw_0.a(n6 + 128) != null) {
                        nArray3[j + i * n3] = n6 + 128;
                        continue;
                    }
                    nArray3[j + i * n3] = n6;
                    continue;
                }
                if (this.a(3) != 0) {
                    nArray3[j + i * n3] = n6;
                    continue;
                }
                int n8 = n6;
                if (n6 == il_0.V.s) {
                    n8 = il_0.c.s;
                } else if (n6 == il_0.H.s) {
                    n8 = il_0.R.s;
                } else if (n6 == il_0.b.s) {
                    n8 = il_0.ao.s;
                } else if (n6 == il_0.T.s) {
                    n8 = il_0.G.s;
                } else if (n6 == il_0.ag.s) {
                    n8 = il_0.ax.s;
                } else if (n6 == il_0.i.s) {
                    n8 = il_0.ay.s;
                } else if (n6 == il_0.N.s) {
                    n8 = il_0.M.s;
                } else if (n6 == il_0.G.s) {
                    n8 = this.a(3) == 0 ? il_0.R.s : il_0.H.s;
                } else if (n6 == il_0.n.s) {
                    n8 = il_0.X.s;
                } else if (n6 == il_0.at.s) {
                    n8 = il_0.al.s;
                } else if (n6 == il_0.u.s) {
                    n8 = il_0.r.s;
                } else if (n6 == il_0.L.s) {
                    n8 = il_0.Z.s;
                } else if (n6 == il_0.ac.s) {
                    n8 = il_0.aC.s;
                } else if (AQ.a(n6, il_0.aE.s)) {
                    n8 = il_0.av.s;
                } else if (n6 == il_0.r.s && this.a(3) == 0) {
                    n5 = this.a(2);
                    n8 = il_0.G.s;
                }
                if (n8 != n6) {
                    n8 = hw_0.a(n8 + 128) != null ? (n8 += 128) : n6;
                }
                if (n8 == n6) {
                    nArray3[j + i * n3] = n6;
                    continue;
                }
                n5 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                int n9 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                int n10 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                int n11 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                int n12 = 0;
                if (AQ.a(n5, n6)) {
                    ++n12;
                }
                if (AQ.a(n9, n6)) {
                    ++n12;
                }
                if (AQ.a(n10, n6)) {
                    ++n12;
                }
                if (AQ.a(n11, n6)) {
                    ++n12;
                }
                nArray3[j + i * n3] = n6;
            }
        }
        return nArray3;
    }
}

