/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package net;

import java.util.function.Supplier;
import net.UY;
import net.aL0;
import net.aNW;
import net.aws_1;
import net.qf_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ED<T>
implements qf_2<T> {
    @Nullable
    protected volatile Supplier<T> a;
    protected volatile T b;
    @NotNull
    protected Object c = new Object[0];

    protected ED(@NotNull Supplier<T> supplier) {
        this.a = supplier;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean a() {
        aNW.g();
        if (this.a == null) {
            return true;
        }
        Object object = this.c;
        synchronized (object) {
            if (this.a != null) return false;
            return true;
        }
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aws_1.c), this.c), aws_1.b), this.a), aws_1.a), this.b), '}').toString();
    }

    public void a(@Nullable Supplier<T> supplier) {
        this.a = supplier;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public T get() {
        aNW.g();
        if (this.a == null) return this.b;
        Object object = this.c;
        synchronized (object) {
            if (this.a == null) return this.b;
            this.b = this.a.get();
            this.a = null;
            return this.b;
        }
    }

    public int hashCode() {
        return UY.a(new Object[]{this.c, this.a, this.b});
    }

    public T a() {
        return this.b;
    }

    public boolean equals(Object object) {
        aNW.g();
        if (this == object) {
            return true;
        }
        if (!(object instanceof ED)) {
            return false;
        }
        ED eD = (ED)object;
        return this.c.equals(eD.c) && UY.a(this.a, eD.a) && UY.a(this.b, eD.b);
    }

    public void a(T t) {
        this.b = t;
    }

    @Nullable
    public Supplier<T> b() {
        return this.a;
    }

    @NotNull
    public Object c() {
        return this.c;
    }
}

