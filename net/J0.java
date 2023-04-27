/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a4_0;
import net.aWU;
import net.avz_2;
import net.k0_0;
import net.mg_2;

public abstract class J0<T extends Comparable<T>>
implements a4_0<T> {
    private Class<T> a;
    private String b;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            J0 j0 = (J0)object;
            return this.a.equals(j0.a) && this.b.equals(j0.b);
        }
        return false;
    }

    @Override
    public String b() {
        return this.b;
    }

    protected J0(String string, Class<T> clazz) {
        this.a = clazz;
        this.b = string;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(aWU.a(this), avz_2.b, this.b), avz_2.c, this.a), avz_2.a, k0_0.a(this)).toString();
    }

    @Override
    public Class<T> a() {
        return this.a;
    }
}

