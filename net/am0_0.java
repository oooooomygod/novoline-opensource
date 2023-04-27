/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import net.FG;
import net.FP;
import net.UY;
import net.a7d_0;
import net.aL0;
import net.aS0;
import net.aS1;
import net.aVH;
import net.aas_0;
import net.ajk_0;
import net.amh_0;
import net.dz_0;
import net.ms_0;
import net.xt_2;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.am0
 */
class am0_0
extends amh_0 {
    volatile ConcurrentMap<Object, xt_2> b = this.a();

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    aS1 d() {
        return aS1.MAP;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private ConcurrentMap<Object, xt_2> a() {
        return ajk_0.a(aVH.e(FP.a(this.a)));
    }

    public am0_0(xt_2 xt_22) {
        super(xt_22);
    }

    @Override
    public @Nullable xt_2 a(@Nullable Object object) {
        return (xt_2)a7d_0.a(this.b, object);
    }

    @Override
    @Nullable xt_2 b(@NonNull Object object, @Nullable xt_2 xt_22) {
        aS1.b();
        if (xt_22 == null) {
            return (xt_2)a7d_0.b(this.b, object);
        }
        return (xt_2)a7d_0.b(this.b, object, xt_22);
    }

    @Override
    @NonNull am0_0 a(@NonNull xt_2 xt_22) {
        aS1.b();
        am0_0 am0_02 = new am0_0(xt_22);
        Iterator iterator = aS0.f(a7d_0.a(this.b));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            a7d_0.b(am0_02.b, FG.b(entry), ((xt_2)entry.getValue()).c(xt_22));
        }
        return am0_02;
    }

    @Override
    public @Nullable Object b() {
        aS1.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator iterator = aS0.f(a7d_0.a(this.b));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            MapInvoker.c(linkedHashMap, FG.b(entry), ((xt_2)entry.getValue()).r());
        }
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(@Nullable Object object) {
        aS1.b();
        if (object instanceof Map) {
            Object object2;
            ConcurrentMap<Object, xt_2> concurrentMap = this.a();
            Object object3 = aS0.f(MapInvoker.b((Map)object));
            if (dz_0.c((Iterator)object3)) {
                object2 = (Map.Entry)dz_0.b((Iterator)object3);
                if (object2.getValue() == null) {
                    // empty if block
                }
                Object object4 = this.a.b(FG.b((Map.Entry)object2));
                a7d_0.b(concurrentMap, FG.b((Map.Entry)object2), object4);
                ((xt_2)object4).d = true;
                FP.a((xt_2)object4, object2.getValue());
            }
            object3 = this;
            synchronized (object3) {
                object2 = this.b;
                this.b = concurrentMap;
                am0_0.a((Map<Object, xt_2>)object2);
            }
        }
        throw new IllegalArgumentException(aas_0.a);
    }

    @Override
    public @NonNull Iterable<xt_2> c() {
        return this.b.values();
    }

    @Override
    @Nullable xt_2 a(@NonNull Object object, @Nullable xt_2 xt_22) {
        aS1.b();
        if (xt_22 == null) {
            return (xt_2)a7d_0.b(this.b, object);
        }
        return (xt_2)a7d_0.a(this.b, object, xt_22);
    }

    private static void a(Map<Object, xt_2> map) {
        aS1.b();
        Iterator iterator = ms_0.a(map.values());
        if (dz_0.c(iterator)) {
            xt_2 xt_22 = (xt_2)dz_0.b(iterator);
            xt_22.d = false;
            xt_22.f();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        am0_0 am0_02 = this;
        synchronized (am0_02) {
            ConcurrentMap<Object, xt_2> concurrentMap = this.b;
            this.b = this.a();
            am0_0.a(concurrentMap);
            return;
        }
    }

    public boolean equals(Object object) {
        aS1.b();
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        am0_0 am0_02 = (am0_0)object;
        return UY.a(this.b, am0_02.b);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), aas_0.b), this.b), '}').toString();
    }
}

