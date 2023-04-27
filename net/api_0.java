/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Supplier;
import net.UY;
import net.a0g_0;
import net.aL0;
import net.aNW;
import net.aUO;
import net.qf_2;
import net.ss_1;
import net.xl_2;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.aPi
 */
public class api_0<@NotNull T>
implements qf_2<T> {
    @NotNull
    protected Lock b;
    @NotNull
    protected Supplier<T> c;
    @NotNull
    protected volatile WeakReference<T> a = ss_1.a();
    @NotNull
    protected Lock d;

    @NotNull
    public WeakReference<T> d() {
        return this.a;
    }

    @Override
    public T get() {
        aNW.g();
        xl_2.a(this.b);
        try {
            Object t = this.a.get();
            if (t == null) {
                xl_2.a(this.d);
                try {
                    t = this.c.get();
                    this.a = new WeakReference<T>(t);
                }
                finally {
                    xl_2.b(this.d);
                }
            }
            Object t2 = t;
            return t2;
        }
        finally {
            xl_2.b(this.b);
        }
    }

    protected api_0(@NotNull Supplier<T> supplier) {
        this.c = supplier;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = a0g_0.b(reentrantReadWriteLock);
        this.d = a0g_0.a(reentrantReadWriteLock);
    }

    @Override
    public boolean a() {
        xl_2.a(this.b);
        try {
            boolean bl = this.a.get() != null;
            return bl;
        }
        finally {
            xl_2.b(this.b);
        }
    }

    @NotNull
    public Lock c() {
        return this.b;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aUO.d), this.b), aUO.a), this.d), aUO.b), this.c), aUO.c), this.a), '}').toString();
    }

    public void a(@NotNull WeakReference<T> weakReference) {
        this.a = weakReference;
    }

    public boolean equals(Object object) {
        aNW.g();
        if (this == object) {
            return true;
        }
        if (!(object instanceof api_0)) {
            return false;
        }
        api_0 api_02 = (api_0)object;
        return this.b.equals(api_02.b) && this.d.equals(api_02.d) && this.c.equals(api_02.c) && this.a.equals(api_02.a);
    }

    public int hashCode() {
        return UY.a(new Object[]{this.b, this.d, this.c, this.a});
    }

    @NotNull
    public Supplier<T> a() {
        return this.c;
    }

    @NotNull
    public Lock b() {
        return this.d;
    }
}

