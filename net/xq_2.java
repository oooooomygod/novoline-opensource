/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.List;

import deobf.EnumFacing;

/*
 * Renamed from net.xq
 */
public class xq_2
implements JE {
    private List<BJ> b;
    private JE a;
    private int c;

    public xq_2(List<BJ> list) {
        this.b = list;
        this.c = mp_1.a(list);
        this.a = ((BJ)ListInvoker.get(list, (int)0)).b;
    }

    @Override
    public HL b() {
        return this.a.b();
    }

    @Override
    public boolean d() {
        return this.a.d();
    }

    public JE a(long l4) {
        return ((BJ)mp_1.a(this.b, (int)(MathInvoker.a((int)((int)l4 >> 16)) % this.c))).b;
    }

    @Override
    public List<a9Z> c() {
        return this.a.c();
    }

    @Override
    public boolean a() {
        return this.a.a();
    }

    @Override
    public List<a9Z> a(EnumFacing enumFacing) {
        return this.a.a(enumFacing);
    }

    @Override
    public KM e() {
        return this.a.e();
    }

    @Override
    public boolean f() {
        return this.a.f();
    }
}

