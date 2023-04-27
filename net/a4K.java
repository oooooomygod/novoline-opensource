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
import net.aua_2;
import net.qf_2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class a4K<T>
implements qf_2<T> {
    protected Supplier<T> b;
    T a;

    public void a(@Nullable Supplier<T> supplier) {
        this.b = supplier;
    }

    public boolean equals(Object object) {
        aNW.g();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a4K)) {
            return false;
        }
        a4K a4K2 = (a4K)object;
        return UY.a(this.b, a4K2.b) && UY.a(this.a, a4K2.a);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aua_2.b), this.b), aua_2.a), this.a), '}').toString();
    }

    public void a(T t) {
        this.a = t;
    }

    protected a4K(@NotNull Supplier<T> supplier) {
        this.b = supplier;
    }

    @Override
    public boolean a() {
        return this.b == null;
    }

    @Override
    public T get() {
        aNW.g();
        if (this.b != null) {
            this.a = this.b.get();
            this.b = null;
        }
        return this.a;
    }

    @Nullable
    public Supplier<T> b() {
        return this.b;
    }

    public T a() {
        return this.a;
    }

    public int hashCode() {
        return UY.a(new Object[]{this.b, this.a});
    }
}

