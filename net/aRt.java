/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.B1;
import net.P8;
import net.UY;
import net.aL0;
import net.ae6_0;
import net.auh_2;
import org.checkerframework.checker.nullness.qual.NonNull;


public class aRt
implements ae6_0 {
    private int b;
    private long a;

    @Override
    public int a() {
        return this.b;
    }

    public static @NonNull aRt b(int n) {
        return new aRt(n);
    }

    public String toString() {
        auh_2.b();
        String string = aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), B1.a), this.b), B1.b), this.a), '}').toString();
        if (ListInvoker.b() != null) {
            auh_2.b(new ListInvoker[5]);
        }
        return string;
    }

    public boolean a() {
        auh_2.b();
        if (SystemInvoker.f() > this.a + 200L) {
            this.a = SystemInvoker.f();
            return true;
        }
        return false;
    }

    public void a(int n) {
        this.b = n;
    }

    public void a(long l4) {
        this.a = l4;
    }

    public int hashCode() {
        return UY.a(new Object[]{P8.d(this.b)});
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object object) {
        auh_2.b();
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        aRt aRt2 = (aRt)object;
        return this.b == aRt2.b;
    }

    private aRt(int n) {
        this.b = n;
    }
}

