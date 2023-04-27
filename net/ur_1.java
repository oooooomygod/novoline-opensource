/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.UnmodifiableIterator
 */
package net;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.OV;
import net.a7r_0;
import net.ai2_0;
import net.ua_1;

/*
 * Renamed from net.uR
 */
class ur_1<T>
extends UnmodifiableIterator<T[]> {
    private Iterable<? extends T>[] b;
    private Iterator<? extends T>[] c;
    private int d = -2;
    private T[] a;

    public boolean hasNext() {
        if (this.d == -2) {
            this.d = 0;
            for (Iterator<T> iterator : this.c) {
                if (iterator.hasNext()) continue;
                this.a();
                break;
            }
            return true;
        }
        if (this.d >= this.c.length) {
            Iterator iterator;
            this.d = this.c.length - 1;
            while (this.d >= 0 && !(iterator = this.c[this.d]).hasNext()) {
                if (this.d == 0) {
                    this.a();
                    break;
                }
                this.c[this.d] = iterator = OV.a(this.b[this.d]);
                if (!iterator.hasNext()) {
                    this.a();
                    break;
                }
                --this.d;
            }
        }
        return this.d >= 0;
    }

    public T[] b() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        while (this.d < this.c.length) {
            this.a[this.d] = this.c[this.d].next();
            ++this.d;
        }
        return (Object[])this.a.clone();
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }

    ur_1(Class clazz, Iterable[] iterableArray, ai2_0 ai2_02) {
        this(clazz, iterableArray);
    }

    private void a() {
        this.d = -1;
        a7r_0.b(this.c, null);
        a7r_0.b(this.a, null);
    }

    private ur_1(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        this.b = iterableArray;
        this.c = (Iterator[])ua_1.a(Iterator.class, this.b.length);
        for (int i = 0; i < this.b.length; ++i) {
            this.c[i] = OV.a(iterableArray[i]);
        }
        this.a = ua_1.a(clazz, this.c.length);
    }
}

