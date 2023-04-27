/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.P8;
import net.UY;
import net.a2N;
import net.aIM;
import net.aL0;
import net.ue_1;

public abstract class a2X
extends a2N
implements ue_1 {
    private static int[] h;
    protected int g;

    static {
        if (a2X.a() != null) {
            a2X.b(new int[3]);
        }
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), P8.d(this.g)});
    }

    @Override
    public int e() {
        return this.g;
    }

    public a2X(int n, int n2, int n3, int n4, int n5) {
        super(n2, n3, n4, n5);
        this.g = n;
    }

    @Override
    public boolean equals(Object object) {
        a2X.a();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2X)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a2X a2X2 = (a2X)object;
        return this.g == a2X2.g;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.c(aL0.a(new StringBuilder(), aIM.a), this.g), '}').toString();
    }

    @Override
    public void f(int n) {
        this.g = n;
    }

    public static int[] a() {
        return h;
    }

    public static void b(int[] nArray) {
        h = nArray;
    }
}

