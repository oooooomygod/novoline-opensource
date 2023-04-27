/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.JM;
import net.aS0;
import net.agx_2;
import net.dz_0;
import net.ms_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aNW<T, F>
implements Iterable<F> {
    private List<F> e;
    private Supplier<Comparator<F>> b;
    private Function<? super T, ? extends F> c;
    private static ListInvoker[] d;
    private Collection<T> a;

    public boolean d() {
        aNW.g();
        return this.f() < 1;
    }

    public void a() {
        aNW.g();
        this.e = new ObjectArrayList(this.a.size());
        Iterator<T> iterator = this.a.iterator();
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            Object object2 = agx_2.a(this.c, object);
            ListInvoker.add(this.e, object2);
        }
        this.i();
    }

    public int f() {
        return this.e.size();
    }

    @NotNull
    private Set<F> a(@NotNull Collection<? extends T> collection) {
        aNW.g();
        ObjectOpenHashSet objectOpenHashSet = new ObjectOpenHashSet(collection.size());
        Iterator<? extends T> iterator = collection.iterator();
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            Object object2 = agx_2.a(this.c, object);
            aS0.b((Set)objectOpenHashSet, object2);
        }
        return objectOpenHashSet;
    }

    public F a(int n) {
        return this.e.get(n);
    }

    public void c(T t) {
        aNW.g();
        if (!ms_0.b(this.a, t)) {
            ms_0.c(this.a, t);
            Object object = agx_2.a(this.c, t);
            ListInvoker.add(this.e, object);
            this.i();
        }
    }

    public void c() {
        this.a.clear();
        this.e.clear();
    }

    public int a(@NotNull T t) {
        Object object = agx_2.a(this.c, t);
        return this.e.indexOf(object);
    }

    @NotNull
    public List<F> a(int n, int n2) {
        return this.e.subList(n, n2);
    }

    @NotNull
    public Collection<T> e() {
        return this.a;
    }

    @NotNull
    public List<F> h() {
        return this.e;
    }

    public boolean b(T t) {
        aNW.g();
        if (this.a.remove(t)) {
            Object object = agx_2.a(this.c, t);
            this.e.remove(object);
            return true;
        }
        return false;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        d = listInvokerArray;
    }

    public static ListInvoker[] g() {
        return d;
    }

    @NotNull
    public Stream<F> b() {
        return this.e.stream();
    }

    public aNW(@NotNull Collection<T> collection, @NotNull Function<? super T, ? extends F> function, @Nullable Supplier<Comparator<F>> supplier) {
        this.c = function;
        this.b = supplier;
        this.a = collection;
        this.a();
    }

    static {
        if (aNW.g() == null) {
            aNW.b(new ListInvoker[2]);
        }
    }

    private void i() {
        aNW.g();
        if (this.b != null) {
            ListInvoker.sort(this.e, (Comparator)JM.a(this.b));
        }
    }

    @Override
    @NotNull
    public Iterator<F> iterator() {
        return this.e.iterator();
    }
}

