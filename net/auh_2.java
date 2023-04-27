/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.P8;
import net.UY;
import net.a76;
import net.aL0;
import net.ae6_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.auh
 */
public class auh_2
implements ae6_0 {
    private static ListInvoker[] b;
    private int a;

    static {
        if (auh_2.b() == null) {
            auh_2.b(new ListInvoker[2]);
        }
    }

    public String toString() {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), a76.a), this.a), '}').toString();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public int hashCode() {
        return UY.a(new Object[]{P8.d(this.a)});
    }

    public boolean equals(Object object) {
        auh_2.b();
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        auh_2 auh_22 = (auh_2)object;
        return this.a == auh_22.a;
    }

    public static ListInvoker[] b() {
        return b;
    }

    private auh_2(int n) {
        this.a = n;
    }

    public static @NonNull auh_2 a(int n) {
        return new auh_2(n);
    }

    public void b(int n) {
        this.a = n;
    }

    @Override
    public int a() {
        return this.a;
    }
}

