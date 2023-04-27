/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.IntHashMap;
import net.P8;
import net.aL0;
import net.as_1;

/*
 * Renamed from net.aQp
 */
class aqp_0<V> {
    aqp_0<V> a;
    V b;
    int d;
    int c;

    public boolean equals(Object object) {
        if (object instanceof aqp_0) {
            Integer n;
            aqp_0 aqp_02 = (aqp_0)object;
            Integer n2 = P8.d(this.b());
            if (n2 == (n = P8.d(aqp_02.b())) || ((Object)n2).equals(n)) {
                V v;
                V v2 = this.a();
                return v2 == (v = aqp_02.a()) || v2.equals(v);
            }
        }
        return false;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.c(new StringBuilder(), this.b()), as_1.a), this.a()).toString();
    }

    public int b() {
        return this.d;
    }

    public int hashCode() {
        return IntHashMap.c(this.d);
    }

    public V a() {
        return this.b;
    }

    aqp_0(int n, int n2, V v, aqp_0<V> aqp_02) {
        this.b = v;
        this.a = aqp_02;
        this.d = n2;
        this.c = n;
    }
}

