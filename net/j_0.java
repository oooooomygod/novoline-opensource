/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.JI;
import net.OW;
import net.xl_2;

/*
 * Renamed from net.j
 */
public class j_0<T> {
    private T[] a;
    private ReadWriteLock d = new ReentrantReadWriteLock();
    private int e;
    private int b;
    private Class<? extends T> c;

    public j_0(Class<? extends T> clazz, int n) {
        this.c = clazz;
        this.a = (Object[])JI.a(clazz, n);
    }

    public T[] b() {
        Object[] objectArray = (Object[])JI.a(this.c, this.e);
        xl_2.a(OW.b(this.d));
        for (int i = 0; i < this.e; ++i) {
            int n = (this.b - this.e + i) % this.a();
            objectArray[i] = this.a[n += this.a()];
        }
        xl_2.b(OW.b(this.d));
        return objectArray;
    }

    public int a() {
        xl_2.a(OW.b(this.d));
        int n = this.a.length;
        xl_2.b(OW.b(this.d));
        return n;
    }

    public T a(T t) {
        xl_2.a(OW.a(this.d));
        this.a[this.b] = t;
        this.b = (this.b + 1) % this.a();
        if (this.e < this.a()) {
            ++this.e;
        }
        xl_2.b(OW.a(this.d));
        return t;
    }
}

