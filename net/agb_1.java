/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.P8;
import net.UY;
import net.aL0;
import net.aMK;
import net.adw_0;

/*
 * Renamed from net.agb
 */
public class agb_1 {
    private int c;
    private int b;
    private int a;

    public int c() {
        return this.a;
    }

    public String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), adw_0.a), this.a), adw_0.c), this.b), adw_0.b), this.c), '}').toString();
    }

    public void a(int n) {
        this.c = n;
    }

    public agb_1(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    public int a() {
        return this.b;
    }

    public int hashCode() {
        return UY.a(new Object[]{P8.d(this.a), P8.d(this.b), P8.d(this.c)});
    }

    public void b(int n) {
        this.a = n;
    }

    public int b() {
        return this.c;
    }

    public void c(int n) {
        this.b = n;
    }

    public boolean equals(Object object) {
        aMK.f();
        if (this == object) {
            return true;
        }
        if (!(object instanceof agb_1)) {
            return false;
        }
        agb_1 agb_12 = (agb_1)object;
        return this.a == agb_12.a && this.b == agb_12.b && this.c == agb_12.c;
    }
}

