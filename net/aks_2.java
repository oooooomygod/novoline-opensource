/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import deobf.EnumFacing;

/*
 * Renamed from net.aks
 */
public class aks_2
implements JE {
    protected KM d;
    protected List<a9Z> a;
    protected List<List<a9Z>> f;
    protected boolean b;
    protected HL e;
    protected boolean c;

    @Override
    public boolean a() {
        return this.b;
    }

    public aks_2(List<a9Z> list, List<List<a9Z>> list2, boolean bl, boolean bl2, KM kM, HL hL) {
        this.a = list;
        this.f = list2;
        this.b = bl;
        this.c = bl2;
        this.d = kM;
        this.e = hL;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public KM e() {
        return this.d;
    }

    @Override
    public List<a9Z> c() {
        return this.a;
    }

    @Override
    public HL b() {
        return this.e;
    }

    @Override
    public boolean d() {
        return this.c;
    }

    @Override
    public List<a9Z> a(EnumFacing enumFacing) {
        return (List)ListInvoker.get(this.f, enumFacing.ordinal());
    }
}

