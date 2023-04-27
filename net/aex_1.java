/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aeX
 */
public class aex_1
extends TreeSet {
    private int a;
    private aac_1 d = new aac_1();
    private int b;
    private int e = Integer.MIN_VALUE;
    private int c;
    private static int f = Integer.MIN_VALUE;

    @Override
    public boolean add(Object object) {
        aP2.b();
        if (!(object instanceof a5D)) {
            return false;
        }
        a5D cfr_ignored_0 = (a5D)object;
        return false;
    }

    private Set a(int n, int n2, boolean bl) {
        aP2.b();
        long l4 = aV0.a(n, n2);
        HashSet hashSet = (HashSet)IX.c(this.d, l4);
        if (hashSet == null) {
            hashSet = new HashSet();
            IX.a(this.d, l4, hashSet);
        }
        return hashSet;
    }

    public aex_1(Set set) {
        aP2.b();
        this.a = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        Iterator iterator = set.iterator();
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            this.add(object);
        }
    }

    @Override
    public boolean remove(Object object) {
        boolean bl;
        aP2.b();
        if (!(object instanceof a5D)) {
            return false;
        }
        a5D a5D2 = (a5D)object;
        Set set = this.a(a5D2, false);
        if (set == null) {
            return false;
        }
        boolean bl2 = set.remove(a5D2);
        if (bl2 != (bl = super.remove(a5D2))) {
            throw new IllegalStateException(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ve_1.d), bl2), ve_1.c), bl).toString());
        }
        return bl;
    }

    @Override
    public boolean contains(Object object) {
        aP2.b();
        if (!(object instanceof a5D)) {
            return false;
        }
        a5D a5D2 = (a5D)object;
        Set set = this.a(a5D2, false);
        return set == null ? false : set.contains(a5D2);
    }

    public void a(int n, int n2, int n3, int n4) {
        this.e = MathInvoker.b(n, n3);
        this.a = MathInvoker.b(n2, n4);
        this.c = MathInvoker.max(n, n3);
        this.b = MathInvoker.max(n2, n4);
    }

    @Override
    public Iterator iterator() {
        aP2.b();
        if (this.e == Integer.MIN_VALUE) {
            return super.iterator();
        }
        if (this.size() <= 0) {
            return anz_0.a();
        }
        int n = this.e >> 4;
        int n2 = this.a >> 4;
        int n3 = this.c >> 4;
        int n4 = this.b >> 4;
        ArrayList arrayList = new ArrayList();
        int n5 = n;
        if (n5 <= n3) {
            int n6 = n2;
            if (n6 <= n4) {
                Set set = this.a(n5, n6, false);
                if (set != null) {
                    arrayList.add(set.iterator());
                }
                ++n6;
            }
            ++n5;
        }
        if (ListInvoker.size(arrayList) <= 0) {
            return anz_0.a();
        }
        if (ListInvoker.size(arrayList) == 1) {
            return (Iterator)ListInvoker.get(arrayList, 0);
        }
        return anz_0.b(arrayList.iterator());
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private Set a(a5D a5D2, boolean bl) {
        aP2.b();
        if (a5D2 == null) {
            return null;
        }
        BlockPos blockPos = a5D2.b;
        int n = amv_2.j(blockPos) >> 4;
        int n2 = amv_2.i(blockPos) >> 4;
        return this.a(n, n2, bl);
    }

    public void a() {
        this.e = Integer.MIN_VALUE;
        this.a = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }
}

