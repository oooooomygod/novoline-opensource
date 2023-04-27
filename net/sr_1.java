/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.aWU;
import net.aee_2;
import net.anl_2;
import net.dp_1;

/*
 * Renamed from net.sR
 */
public class sr_1 {
    private int c;
    private anl_2 a;
    private List<dp_1> b;

    public sr_1(anl_2 anl_22, List<dp_1> list, int n) {
        this.a = anl_22;
        this.b = list;
        this.c = n;
    }

    public dp_1 a(int n) {
        return n < ListInvoker.size(this.b) ? (dp_1)aWU.a(ListInvoker.get(this.b, n), aee_2.g) : aee_2.g;
    }

    public int a() {
        return this.c;
    }
}

