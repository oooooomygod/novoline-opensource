/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import net.MV;
import net.UY;
import net.a3f_0;
import net.aL0;
import net.w2_0;
import net.xp_0;

/*
 * Renamed from net.aAf
 */
class aaf_0<K, V>
implements ConcurrentMap<K, V> {
    private Map<K, V> a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public V remove(Object object) {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.remove(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean replace(K k, V v, V v2) {
        w2_0.d();
        Map<K, V> map = this.a;
        synchronized (map) {
            if (UY.a(v, this.a.get(k))) {
                this.a.put(k, v2);
                return true;
            }
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return MV.a(this.a.entrySet());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean containsValue(Object object) {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.containsKey(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean remove(Object object, Object object2) {
        w2_0.e();
        Map<K, V> map = this.a;
        synchronized (map) {
            if (!UY.a(object2, this.a.get(object))) {
                return false;
            }
            if (this.a.remove(object) == null) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public Set<K> keySet() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return MV.a(this.a.keySet());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public int hashCode() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.hashCode();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public String toString() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), xp_0.a), this.a.toString()), '}').toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public Collection<V> values() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return MV.a(this.a.values());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean isEmpty() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.isEmpty();
    }

    aaf_0(Map map, a3f_0 a3f_02) {
        this(map);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public V replace(K k, V v) {
        w2_0.d();
        Map<K, V> map = this.a;
        synchronized (map) {
            if (this.a.containsKey(k)) {
                return this.a.put(k, v);
            }
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean containsKey(Object object) {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.containsKey(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void clear() {
        Map<K, V> map = this.a;
        synchronized (map) {
            this.a.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public int size() {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public V putIfAbsent(K k, V v) {
        w2_0.e();
        Map<K, V> map = this.a;
        synchronized (map) {
            if (!this.a.containsKey(k)) {
                this.a.put(k, v);
            }
            return this.a.get(k);
        }
    }

    private aaf_0(Map<K, V> map) {
        this.a = map;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        Map<K, V> map2 = this.a;
        synchronized (map2) {
            this.a.putAll(map);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public V get(Object object) {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.get(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public V put(K k, V v) {
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.put(k, v);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        Map<K, V> map = this.a;
        // MONITORENTER : map
        // MONITOREXIT : map
        return this.a.equals(object);
    }
}

