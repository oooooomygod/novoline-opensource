/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.il_0;

/*
 * Renamed from net.Ak
 */
public class ak_0
extends AW {
    private AW f;
    private AW e;

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.e.b(n, n2, n3, n4);
        int[] nArray2 = this.f.b(n, n2, n3, n4);
        int[] nArray3 = af_0.c(n3 * n4);
        for (int i = 0; i < n3 * n4; ++i) {
            if (nArray[i] != il_0.u.s && nArray[i] != il_0.r.s) {
                if (nArray2[i] == il_0.am.s) {
                    if (nArray[i] == il_0.n.s) {
                        nArray3[i] = il_0.an.s;
                        continue;
                    }
                    if (nArray[i] != il_0.y.s && nArray[i] != il_0.O.s) {
                        nArray3[i] = nArray2[i] & 0xFF;
                        continue;
                    }
                    nArray3[i] = il_0.O.s;
                    continue;
                }
                nArray3[i] = nArray[i];
                continue;
            }
            nArray3[i] = nArray[i];
        }
        return nArray3;
    }

    public ak_0(long l4, AW aW10, AW aW11) {
        super(l4);
        this.e = aW10;
        this.f = aW11;
    }

    @Override
    public void a(long l4) {
        this.e.a(l4);
        this.f.a(l4);
        super.a(l4);
    }
}

