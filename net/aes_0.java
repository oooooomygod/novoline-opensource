/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import java.util.List;
import net.GN;
import net.IX;
import net.aac_1;
import net.acg_1;
import net.ct_2;
import net.il_0;
import net.my_0;

/*
 * Renamed from net.aEs
 */
public class aes_0 {
    private long b;
    private ct_2 c;
    private List<GN> d;
    private aac_1 a = new aac_1();

    public aes_0(ct_2 ct_22) {
        this.d = my_0.c();
        this.c = ct_22;
    }

    public il_0 a(int n, int n2, il_0 il_02) {
        acg_1.a(this.a(n, n2), n, n2);
        return il_02;
    }

    public void a() {
        long l4 = ServerInvoker.c();
        long l5 = l4 - this.b;
        if (l5 > 7500L || l5 < 0L) {
            this.b = l4;
            for (int i = 0; i < ListInvoker.size(this.d); ++i) {
                GN gN = (GN)ListInvoker.get(this.d, i);
                long l6 = l4 - gN.a;
                if (l6 <= 30000L && l6 >= 0L) continue;
                ListInvoker.remove(this.d, i--);
                long l7 = (long)gN.e & 0xFFFFFFFFL | ((long)gN.f & 0xFFFFFFFFL) << 32;
                IX.a(this.a, l7);
            }
        }
    }

    public GN a(int n, int n2) {
        long l4 = (long)(n >>= 4) & 0xFFFFFFFFL | ((long)(n2 >>= 4) & 0xFFFFFFFFL) << 32;
        GN gN = (GN)IX.c(this.a, l4);
        gN = new GN(this, n, n2);
        IX.a(this.a, l4, gN);
        ListInvoker.add(this.d, gN);
        gN.a = ServerInvoker.c();
        return gN;
    }

    public il_0[] b(int n, int n2) {
        return this.a((int)n, (int)n2).b;
    }

    static ct_2 a(aes_0 aes_02) {
        return aes_02.c;
    }
}

