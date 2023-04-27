/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.apD
 */
public class apd_1 {
    private int b;
    private boolean a;
    private Object d;
    private int c;

    public apd_1(int n, int n2, Object object) {
        this.b = n2;
        this.d = object;
        this.c = n;
        this.a = true;
    }

    public void a(Object object) {
        this.d = object;
    }

    public void a(boolean bl) {
        this.a = bl;
    }

    public boolean b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    static boolean a(apd_1 apd_12, boolean bl) {
        apd_12.a = bl;
        return apd_12.a;
    }

    public Object a() {
        return this.d;
    }

    public int d() {
        return this.c;
    }
}

