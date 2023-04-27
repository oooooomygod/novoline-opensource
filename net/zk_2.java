/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ag4_0;
import net.zo_2;

/*
 * Renamed from net.zk
 */
public class zk_2<K, V>
extends zo_2<K, V> {
    private K e;
    private V f;

    public zk_2(K k) {
        this.e = k;
    }

    @Override
    public void a(int n, K k, V v) {
        if (this.e.equals(k)) {
            this.f = v;
        }
        super.a(n, k, v);
    }

    @Override
    public V a(int n) {
        super.a(n);
        return this.f;
    }

    public void a() {
        ag4_0.a(this.e);
    }

    @Override
    public V a(K k) {
        super.a(k);
        return this.f;
    }
}

