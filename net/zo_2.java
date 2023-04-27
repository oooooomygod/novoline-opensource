/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 */
package net;

import cc.novoline.invoke.MapInvoker;
import com.google.common.collect.BiMap;
import java.util.Iterator;
import java.util.Map;
import net.CQ;
import net.aZv;
import net.ahi_0;
import net.au6_0;
import net.q7_0;
import net.zg_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.zo
 */
public class zo_2<K, V>
extends zg_2<K, V>
implements CQ<V> {
    protected Map<V, K> c;
    protected q7_0 d = new q7_0();

    @Override
    public V a(int n) {
        return (V)aZv.a(this.d, n);
    }

    public K b(V v) {
        return (K)MapInvoker.c(this.c, v);
    }

    @Override
    protected Map<K, V> a() {
        return au6_0.a();
    }

    @Override
    public Iterator<V> iterator() {
        return this.d.iterator();
    }

    @Override
    public V a(K k) {
        return super.a(k);
    }

    @Override
    public int a(V v) {
        return aZv.a(this.d, v);
    }

    public void a(int n, K k, V v) {
        aZv.a(this.d, v, n);
        this.a(k, v);
    }

    @Override
    public boolean a(K k) {
        return (boolean)super.a(k);
    }

    public zo_2() {
        this.c = ahi_0.a((BiMap)this.b);
    }
}

