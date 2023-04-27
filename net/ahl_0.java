/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import net.aQP;
import net.anj_2;

/*
 * Renamed from net.aHl
 */
public class ahl_0 {
    private aQP[] a = new aQP[1024];
    private int b;

    private void a(int n) {
        aQP aQP2 = this.a[n];
        float f = aQP2.i;
        while (true) {
            int n2 = n - 1 >> 1;
            aQP aQP3 = this.a[n2];
            if (f >= aQP3.i) {
                this.a[n] = aQP2;
                aQP2.f = n;
                return;
            }
            this.a[n] = aQP3;
            aQP3.f = n;
            n = n2;
        }
    }

    public aQP a(aQP aQP2) {
        if (aQP2.f >= 0) {
            throw new IllegalStateException(anj_2.a);
        }
        if (this.b == this.a.length) {
            aQP[] aQPArray = new aQP[this.b << 1];
            SystemInvoker.a(this.a, 0, aQPArray, 0, this.b);
            this.a = aQPArray;
        }
        this.a[this.b] = aQP2;
        aQP2.f = this.b;
        this.a(this.b++);
        return aQP2;
    }

    private void b(int n) {
        aQP aQP2 = this.a[n];
        float f = aQP2.i;
        while (true) {
            float f2;
            aQP aQP3;
            int n2 = 1 + (n << 1);
            int n3 = n2 + 1;
            if (n2 >= this.b) break;
            aQP aQP4 = this.a[n2];
            float f3 = aQP4.i;
            if (n3 >= this.b) {
                aQP3 = null;
                f2 = Float.POSITIVE_INFINITY;
            } else {
                aQP3 = this.a[n3];
                f2 = aQP3.i;
            }
            if (f3 < f2) {
                if (f3 >= f) break;
                this.a[n] = aQP4;
                aQP4.f = n;
                n = n2;
                continue;
            }
            if (f2 >= f) break;
            this.a[n] = aQP3;
            aQP3.f = n;
            n = n3;
        }
        this.a[n] = aQP2;
        aQP2.f = n;
    }

    public void a() {
        this.b = 0;
    }

    public void a(aQP aQP2, float f) {
        float f2 = aQP2.i;
        aQP2.i = f;
        if (f < f2) {
            this.a(aQP2.f);
        } else {
            this.b(aQP2.f);
        }
    }

    public boolean c() {
        return this.b == 0;
    }

    public aQP b() {
        aQP aQP2 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        aQP2.f = -1;
        return aQP2;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }
}

