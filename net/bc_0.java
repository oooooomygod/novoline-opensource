/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.H7;
import net.IMetadataSection;
import net.P8;
import net.aS0;
import net.aby_1;
import net.axe_2;
import net.dz_0;

/*
 * Renamed from net.Bc
 */
public class bc_0
implements IMetadataSection {
    private List<aby_1> d;
    private int b;
    private int c;
    private int e;
    private boolean a;

    public int d(int n) {
        aby_1 aby_12 = this.a(n);
        return H7.b(aby_12) ? this.b : aby_12.b();
    }

    public boolean b(int n) {
        return !H7.b((aby_1)ListInvoker.get(this.d, n));
    }

    public int e() {
        return this.b;
    }

    public bc_0(List<aby_1> list, int n, int n2, int n3, boolean bl) {
        this.d = list;
        this.c = n;
        this.e = n2;
        this.b = n3;
        this.a = bl;
    }

    public int c() {
        return this.c;
    }

    public int c(int n) {
        return H7.a((aby_1)ListInvoker.get(this.d, n));
    }

    public Set<Integer> a() {
        HashSet hashSet = axe_2.a();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            aby_1 aby_12 = (aby_1)dz_0.b(iterator);
            aS0.b((Set)hashSet, P8.d(H7.a(aby_12)));
        }
        return hashSet;
    }

    public int d() {
        return ListInvoker.size(this.d);
    }

    public boolean f() {
        return this.a;
    }

    public int b() {
        return this.e;
    }

    private aby_1 a(int n) {
        return (aby_1)ListInvoker.get(this.d, n);
    }
}

