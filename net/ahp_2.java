/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

/*
 * Renamed from net.ahp
 */
public abstract class ahp_2<T> {
    private boolean c;
    private static boolean b;
    private float f;
    private T d;
    private float e;

    public abstract void a(char var1, int var2);

    public abstract void c(int var1, int var2);

    public static boolean d() {
        ahp_2.f();
        return true;
    }

    public abstract void a(int var1, int var2);

    public boolean b() {
        return this.c;
    }

    public static boolean f() {
        return b;
    }

    public abstract void a(int var1, int var2, int var3);

    public T c() {
        return this.d;
    }

    public double a() {
        return this.e;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public double e() {
        return this.f;
    }

    public ahp_2(T t) {
        ahp_2.d();
        this.d = t;
        ListInvoker.b(new ListInvoker[2]);
    }

    static {
        if (ahp_2.d()) {
            ahp_2.b(true);
        }
    }

    public abstract void b(int var1, int var2);
}

