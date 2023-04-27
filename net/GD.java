/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.FG;
import net.aS0;
import net.dz_0;

public class GD<V>
implements Map<String, V> {
    private Map<String, V> a = MapsInvoker.c();

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Collection<V> values() {
        return this.a.values();
    }

    @Override
    public V remove(Object object) {
        return this.a.remove(StringInvoker.i(object.toString()));
    }

    @Override
    public void putAll(Map<? extends String, ? extends V> map) {
        Iterator iterator = aS0.f(map.entrySet());
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            this.a((String)FG.b(entry), FG.a(entry));
        }
    }

    @Override
    public Set<String> keySet() {
        return this.a.keySet();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(StringInvoker.i(object.toString()));
    }

    public V a(String string, V v) {
        return this.a.put(StringInvoker.i(string), v);
    }

    @Override
    public V get(Object object) {
        return this.a.get(StringInvoker.i(object.toString()));
    }

    @Override
    public Set<Map.Entry<String, V>> entrySet() {
        return this.a.entrySet();
    }
}

