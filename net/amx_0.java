/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.TileEntity;
import java.util.List;

import deobf.EnumFacing;

/*
 * Renamed from net.aMx
 */
public class amx_0 {
    private Cn e;
    private boolean[] c;
    public static amx_0 d = new aM7();
    private boolean b = true;
    private aEO f;
    private List<TileEntity> g;
    private boolean[] a = new boolean[a5w_0.values().length];

    public boolean c() {
        return this.b;
    }

    public List<TileEntity> b() {
        return this.g;
    }

    public void a(TileEntity tileEntity) {
        ListInvoker.add(this.g, tileEntity);
    }

    protected void b(a5w_0 a5w_02) {
        this.b = false;
        this.a[a5w_02.ordinal()] = true;
    }

    public amx_0() {
        this.c = new boolean[a5w_0.values().length];
        this.g = my_0.c();
        this.f = new aEO();
    }

    public boolean d(a5w_0 a5w_02) {
        return !this.a[a5w_02.ordinal()];
    }

    public Cn a() {
        return this.e;
    }

    public void a(Cn cn) {
        this.e = cn;
    }

    public boolean a(EnumFacing enumFacing, EnumFacing enumFacing2) {
        return this.f.a(enumFacing, enumFacing2);
    }

    public void a(a5w_0 a5w_02) {
        this.c[a5w_02.ordinal()] = true;
    }

    public void a(aEO aEO2) {
        this.f = aEO2;
    }

    public boolean c(a5w_0 a5w_02) {
        return this.c[a5w_02.ordinal()];
    }
}

