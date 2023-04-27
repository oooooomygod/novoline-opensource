/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.WorldType;
import net.af_0;
import net.cd_0;
import net.fl_2;
import net.il_0;

/*
 * Renamed from net.Au
 */
public class au_0
extends AW {
    private il_0[] g = new il_0[]{il_0.V, il_0.V, il_0.V, il_0.ac, il_0.ac, il_0.G};
    private il_0[] i;
    private cd_0 e;
    private il_0[] f = new il_0[]{il_0.H, il_0.T, il_0.L, il_0.G, il_0.b, il_0.aw};
    private il_0[] h = new il_0[]{il_0.H, il_0.L, il_0.ag, il_0.G};

    public au_0(long l4, AW aW10, WorldType worldType, String string) {
        super(l4);
        this.i = new il_0[]{il_0.n, il_0.n, il_0.n, il_0.N};
        this.d = aW10;
        if (worldType == WorldType.g) {
            this.g = new il_0[]{il_0.V, il_0.H, il_0.L, il_0.aw, il_0.G, il_0.ag};
            this.e = null;
        } else {
            this.e = worldType == WorldType.i ? fl_2.a(fl_2.a(string)) : null;
        }
    }

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n, n2, n3, n4);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(j + n), (long)(i + n2));
                int n5 = nArray[j + i * n3];
                int cfr_ignored_0 = (n5 & 0xF00) >> 8;
                n5 &= 0xFFFFF0FF;
                if (this.e != null && this.e.O >= 0) {
                    nArray2[j + i * n3] = this.e.O;
                    continue;
                }
                if (au_0.b(n5)) {
                    nArray2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == il_0.y.s) {
                    nArray2[j + i * n3] = n5;
                    continue;
                }
                if (n5 == 1) {
                    if (this.a(3) == 0) {
                        nArray2[j + i * n3] = il_0.ap.s;
                        continue;
                    }
                    nArray2[j + i * n3] = il_0.aE.s;
                    continue;
                }
                nArray2[j + i * n3] = n5 == 2 ? il_0.at.s : (n5 == 3 ? il_0.i.s : (n5 == 4 ? this.i[this.a((int)this.i.length)].s : il_0.y.s));
            }
        }
        return nArray2;
    }
}

