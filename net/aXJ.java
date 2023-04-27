/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.Iterator;
import net.a7r_0;
import net.a8Z;
import net.ad__0;
import net.anz_0;
import net.azm_0;
import org.checkerframework.checker.nullness.qual.NonNull;


class aXJ<T extends ad__0>
implements a8Z<T>,
azm_0 {
    private Object[] a;
    private T b;

    @Override
    public int a() {
        return this.a.length;
    }

    @Override
    public @NonNull T b() {
        return this.b;
    }

    @Override
    public @NonNull Iterator<Object> iterator() {
        return anz_0.a(this.a);
    }

    @Override
    public Object a(int n) {
        return this.a[n];
    }

    aXJ(Object[] objectArray, T t) {
        this.a = objectArray;
        this.b = t;
    }

    @Override
    public @NonNull azm_0 a() {
        return this;
    }

    Object[] a() {
        return this.a;
    }

    @Override
    public Object[] b() {
        return a7r_0.a(this.a, this.a.length);
    }
}

