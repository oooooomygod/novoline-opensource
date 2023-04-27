/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.BJ;
import net.JE;
import net.asg_0;
import net.my_0;
import net.xq_2;

/*
 * Renamed from net.Qp
 */
public class qp_0 {
    private List<BJ> a = my_0.c();

    public JE a() {
        return ((BJ)ListInvoker.get(this.a, (int)0)).b;
    }

    public qp_0 a(JE jE, int n) {
        ListInvoker.add(this.a, new BJ(jE, n));
        return this;
    }

    public xq_2 b() {
        asg_0.d(this.a);
        return new xq_2(this.a);
    }
}

