/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.O6;
import net.aL0;
import net.aV2;
import net.anz_0;
import net.ara_2;
import net.axe_2;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.Qx
 */
public class qx_0<T>
extends AbstractSet<T> {
    private Class<T> b;
    private Map<Class<?>, List<T>> e = MapsInvoker.a();
    private Set<Class<?>> d = axe_2.d();
    private static Set<Class<?>> c = axe_2.a();
    private List<T> a = my_0.c();

    static Map a(qx_0 qx_02) {
        return qx_02.e;
    }

    public qx_0(Class<T> clazz) {
        this.b = clazz;
        this.d.add(clazz);
        MapInvoker.c(this.e, clazz, this.a);
        Iterator<Class<?>> iterator = c.iterator();
        while (dz_0.c(iterator)) {
            Class clazz2 = (Class)dz_0.b(iterator);
            this.c(clazz2);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public boolean contains(Object object) {
        return anz_0.a(this.a(object.getClass()).iterator(), object);
    }

    @Override
    public boolean remove(Object object) {
        Object object2 = object;
        boolean bl = false;
        Iterator<Class<?>> iterator = this.d.iterator();
        while (dz_0.c(iterator)) {
            List list;
            Class clazz = (Class)dz_0.b(iterator);
            if (!ara_2.a(clazz, object2.getClass()) || !(list = (List)MapInvoker.c(this.e, clazz)).remove(object2)) continue;
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean add(T t) {
        Iterator<Class<?>> iterator = this.d.iterator();
        while (dz_0.c(iterator)) {
            Class clazz = (Class)dz_0.b(iterator);
            if (!ara_2.a(clazz, t.getClass())) continue;
            this.a(t, clazz);
        }
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return ListInvoker.isEmpty(this.a) ? anz_0.a() : anz_0.a(this.a.iterator());
    }

    protected Class<?> b(Class<?> clazz) {
        if (ara_2.a(this.b, clazz)) {
            if (!this.d.contains(clazz)) {
                this.c(clazz);
            }
            return clazz;
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(new StringBuilder(), aV2.a), clazz).toString());
    }

    @Override
    public int size() {
        return this.a.size();
    }

    private void a(T t, Class<?> clazz) {
        List cfr_ignored_0 = (List)MapInvoker.c(this.e, clazz);
        MapInvoker.c(this.e, clazz, my_0.a(new Object[]{t}));
    }

    public <S> Iterable<S> a(Class<S> clazz) {
        return new O6(this, clazz);
    }

    protected void c(Class<?> clazz) {
        c.add(clazz);
        Iterator<T> iterator = this.a.iterator();
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!ara_2.a(clazz, object.getClass())) continue;
            this.a(object, clazz);
        }
        this.d.add(clazz);
    }
}

