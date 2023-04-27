/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import net.FP;
import net.P8;
import net.UY;
import net.a7c_0;
import net.aL0;
import net.aS1;
import net.amh_0;
import net.any_0;
import net.asg_0;
import net.avs_2;
import net.axz_2;
import net.dz_0;
import net.ms_0;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.amm
 */
class amm_2
extends amh_0 {
    AtomicReference<List<xt_2>> b = new AtomicReference(new ArrayList());

    amm_2(xt_2 xt_22, Object object) {
        super(xt_22);
        Object object2 = xt_22.b(P8.d(0));
        ((xt_2)object2).d = true;
        FP.a((xt_2)object2, object);
        ListInvoker.add((List)any_0.a(this.b), object2);
    }

    @Override
    aS1 d() {
        return aS1.LIST;
    }

    public int hashCode() {
        return ((List)any_0.a(this.b)).hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public @Nullable Object b() {
        aS1.b();
        List list = (List)any_0.a(this.b);
        List list2 = list;
        synchronized (list2) {
            ArrayList arrayList = new ArrayList(ListInvoker.size(list));
            Iterator iterator = ListInvoker.iterator(list);
            if (dz_0.c(iterator)) {
                xt_2 xt_22 = (xt_2)dz_0.b(iterator);
                ListInvoker.add(arrayList, xt_22.r());
            }
            return arrayList;
        }
    }

    amm_2(xt_2 xt_22) {
        super(xt_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private xt_2 a(int n, @Nullable xt_2 xt_22, boolean bl) {
        List list;
        aS1.b();
        xt_2 xt_23 = null;
        do {
            List list2 = list = (List)any_0.a(this.b);
            synchronized (list2) {
                if (n < ListInvoker.size(list)) {
                    xt_23 = (xt_2)ListInvoker.remove(list, n);
                    int n2 = n;
                    if (n2 < ListInvoker.size(list)) {
                        ((xt_2)ListInvoker.get((List)list, (int)n2)).c = P8.d(n);
                        ++n2;
                    }
                    if (n >= 0 && n < ListInvoker.size(list)) {
                        return (xt_2)ListInvoker.get(list, n);
                    }
                    if (n == -1) {
                        ListInvoker.add(list, xt_22);
                        xt_22.c = P8.d(ListInvoker.lastIndexOf(list, xt_22));
                    }
                    ListInvoker.add(list, n, xt_22);
                }
            }
        } while (!any_0.a(this.b, list, list));
        return xt_23;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public @Nullable xt_2 a(@Nullable Object object) {
        List list;
        aS1.b();
        Integer n = avs_2.a(object);
        if (n == null || P8.b(n) < 0) {
            return null;
        }
        List list2 = list = (List)any_0.a(this.b);
        synchronized (list2) {
            if (P8.b(n) >= ListInvoker.size(list)) {
                return null;
            }
            return (xt_2)ListInvoker.get(list, P8.b(n));
        }
    }

    @Override
    public void a() {
        List list = (List)any_0.b(this.b, new ArrayList());
        amm_2.a(list);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), axz_2.a), ((List)any_0.a(this.b)).toString()), '}').toString();
    }

    public boolean equals(Object object) {
        aS1.b();
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        amm_2 amm_22 = (amm_2)object;
        return UY.a(any_0.a(this.b), any_0.a(amm_22.b));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull amm_2 a(@NonNull xt_2 xt_22) {
        ArrayList arrayList;
        List list;
        aS1.b();
        amm_2 amm_22 = new amm_2(xt_22);
        List list2 = list = (List)any_0.a(this.b);
        synchronized (list2) {
            arrayList = new ArrayList(ListInvoker.size(list));
            Iterator iterator = ListInvoker.iterator(list);
            if (dz_0.c(iterator)) {
                xt_2 xt_23 = (xt_2)dz_0.b(iterator);
                ListInvoker.add(arrayList, xt_23.c(xt_22));
                ListInvoker.b(new ListInvoker[1]);
            }
        }
        any_0.a(amm_22.b, arrayList);
        return amm_22;
    }

    @Override
    public @Nullable xt_2 b(@NonNull Object object, @Nullable xt_2 xt_22) {
        return this.a(P8.b((Integer)object), xt_22, false);
    }

    @Override
    @Nullable xt_2 a(@NonNull Object object, @Nullable xt_2 xt_22) {
        return this.a(P8.b((Integer)object), xt_22, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public @NonNull Iterable<xt_2> c() {
        List list;
        List list2 = list = (List)any_0.a(this.b);
        // MONITORENTER : list2
        // MONITOREXIT : list2
        return a7c_0.a(list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(List<xt_2> list) {
        aS1.b();
        List<xt_2> list2 = list;
        synchronized (list2) {
            Iterator iterator = ListInvoker.iterator(list);
            if (dz_0.c(iterator)) {
                xt_2 xt_22 = (xt_2)dz_0.b(iterator);
                xt_22.d = false;
                xt_22.f();
            }
            return;
        }
    }

    @Override
    public void b(@Nullable Object object) {
        aS1.b();
        if (!(object instanceof Collection)) {
            object = asg_0.a(object);
        }
        Collection collection = (Collection)object;
        ArrayList arrayList = new ArrayList(ms_0.d(collection));
        int n = 0;
        Iterator iterator = ms_0.a(collection);
        if (dz_0.c(iterator)) {
            Object object2 = dz_0.b(iterator);
            if (object2 == null) {
                // empty if block
            }
            Object object3 = this.a.b(P8.d(n));
            ListInvoker.add(arrayList, n, object3);
            ((xt_2)object3).d = true;
            FP.a((xt_2)object3, object2);
            ++n;
        }
        amm_2.a((List)any_0.b(this.b, arrayList));
    }
}

