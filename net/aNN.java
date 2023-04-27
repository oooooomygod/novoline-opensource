/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Properties;
import net.a0D;
import net.aL0;
import net.ayq_2;
import net.dk_1;
import net.ys_2;

public class aNN {
    private String g = null;
    private String d = null;
    private int[] a = null;
    private int b = 0;
    private String[] c = null;
    private int e = 0;
    private String[] f = null;

    public boolean a(Properties properties) {
        a0D.k();
        this.b();
        if (properties == null) {
            return false;
        }
        String string = dk_1.a(properties, this.g);
        return this.a(string);
    }

    public int c() {
        return this.e;
    }

    public void b() {
        this.e = this.b;
    }

    public boolean a(String string) {
        a0D.r();
        this.e = this.b;
        return false;
    }

    public String d() {
        return this.c[this.e];
    }

    public String f() {
        return this.d;
    }

    public void e() {
        a0D.r();
        ++this.e;
        if (this.e < 0 || this.e >= this.c.length) {
            this.e = 0;
        }
    }

    public String g() {
        return this.g;
    }

    public void b(Properties properties) {
        a0D.k();
        if (properties != null) {
            dk_1.a(properties, this.g(), this.d());
        }
    }

    public aNN(String string, String[] stringArray, String string2, String[] stringArray2, int n) {
        this.g = string;
        this.c = stringArray;
        this.d = string2;
        this.f = stringArray2;
        this.b = n;
        if (stringArray.length != stringArray2.length) {
            throw new IllegalArgumentException(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ayq_2.f), stringArray.length), ayq_2.e), stringArray2.length).toString());
        }
        if (n < stringArray.length) {
            this.e = n;
            return;
        }
        throw new IllegalArgumentException(aL0.c(aL0.a(new StringBuilder(), ayq_2.g), n).toString());
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public String a() {
        return this.f[this.e];
    }

    public String toString() {
        return aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ayq_2.c), this.g), ayq_2.b), this.d()), ayq_2.a), ys_2.a(this.c)), ayq_2.d), this.e).toString();
    }

    public void a(int n) {
        a0D.k();
        this.e = n;
        if (this.e < 0 || this.e >= this.c.length) {
            this.e = this.b;
        }
    }
}

