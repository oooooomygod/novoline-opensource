/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import java.lang.ref.WeakReference;
import java.util.function.Supplier;
import net.UY;
import net.UZ;
import net.aL0;
import net.aNW;
import net.qf_2;
import net.ss_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.am2
 */
public class am2_0<@NotNull T>
implements qf_2<T> {
    @NotNull
    protected Supplier<T> a;
    @NotNull
    protected WeakReference<T> b = ss_1.a();

    public int hashCode() {
        return UY.a(new Object[]{this.a, this.b});
    }

    @NotNull
    public WeakReference<T> a() {
        return this.b;
    }

    public boolean equals(Object object) {
        aNW.g();
        if (this == object) {
            return true;
        }
        if (!(object instanceof am2_0)) {
            return false;
        }
        am2_0 am2_02 = (am2_0)object;
        return this.a.equals(am2_02.a) && this.b.equals(am2_02.b);
    }

    @NotNull
    public Supplier<T> b() {
        return this.a;
    }

    public void a(@NotNull WeakReference<T> weakReference) {
        this.b = weakReference;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), UZ.a), this.a), UZ.b), this.b), '}').toString();
    }

    @Override
    public boolean a() {
        return this.b.get() != null;
    }

    @Override
    public T get() {
        aNW.g();
        if (this.b.get() == null) {
            T t = this.a.get();
            this.b = new WeakReference<T>(t);
            return t;
        }
        return this.b.get();
    }

    protected am2_0(@NotNull Supplier<T> supplier) {
        this.a = supplier;
    }
}

