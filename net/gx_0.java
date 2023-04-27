/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import deobf.MapFactory;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import net.HI;
import net.a3f_0;
import net.aL0;
import net.w2_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.Gx
 */
class gx_0
implements MapFactory {
    private Comparator<Object> a;

    @Override
    public <K, V> @NonNull ConcurrentMap<K, V> create() {
        return new ConcurrentSkipListMap(this.a);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), HI.a), this.a), '}').toString();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object object) {
        w2_0.e();
        return object instanceof gx_0 && this.a.equals(((gx_0)object).a);
    }

    gx_0(Comparator comparator, a3f_0 a3f_02) {
        this(comparator);
    }

    private gx_0(Comparator<Object> comparator) {
        this.a = comparator;
    }
}

