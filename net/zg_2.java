/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.NZ;
import net.aL0;
import net.ag4_0;
import net.asg_0;
import net.qo_1;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.zg
 */
public class zg_2<K, V>
implements NZ<K, V> {
    protected Map<K, V> b = this.a();
    private static Logger a = LogManagerInvoker.c();

    @Override
    public boolean a(K k) {
        return this.b.containsKey(k);
    }

    protected Map<K, V> a() {
        return MapsInvoker.a();
    }

    @Override
    public void a(K k, V v) {
        ag4_0.a(k);
        ag4_0.a(v);
        if (this.b.containsKey(k)) {
            LoggerInvoker.b(a, aL0.a(aL0.a(aL0.a(new StringBuilder(), qo_1.b), k), qo_1.a).toString());
        }
        MapInvoker.c(this.b, k, v);
    }

    public Set<K> b() {
        return asg_0.a(MapInvoker.c(this.b));
    }

    @Override
    public Iterator<V> iterator() {
        return this.b.values().iterator();
    }

    @Override
    public V a(K k) {
        return (V)MapInvoker.c(this.b, k);
    }
}

