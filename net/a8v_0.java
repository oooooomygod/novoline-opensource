/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a8v
 */
public class a8v_0
extends aij_1 {
    private int z = -1;
    private List<aYU> B = my_0.c();
    private avh_2 x;
    private R5 y;
    private List<aga_2> A = my_0.c();

    public a8v_0(R5 r5, Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        super(minecraft, n, n2, n3, n4, n5);
        this.x = new aHO();
        this.y = r5;
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.B) + 1 + ListInvoker.size(this.A);
    }

    @Override
    public int d() {
        return super.d() + 85;
    }

    public int a() {
        return this.z;
    }

    public void a(V8 v8) {
        ListInvoker.clear(this.B);
        for (int i = 0; i < a3A.c(v8); ++i) {
            ListInvoker.add(this.B, new aYU(this.y, a3A.a(v8, i)));
        }
    }

    @Override
    protected int h() {
        return super.h() + 30;
    }

    @Override
    protected boolean c(int n) {
        return n == this.z;
    }

    public void c(int n) {
        this.z = n;
    }

    @Override
    public avh_2 a(int n) {
        if (n < ListInvoker.size(this.B)) {
            return (avh_2)ListInvoker.get(this.B, n);
        }
        n -= ListInvoker.size(this.B);
        return this.x;
    }

    public void a(List<dt_1> list) {
        ListInvoker.clear(this.A);
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            dt_1 dt_12 = (dt_1)dz_0.b(iterator);
            ListInvoker.add(this.A, new aga_2(this.y, dt_12));
        }
    }
}

