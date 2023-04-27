/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.Ml
 */
public enum ml_0 {
    UP,
    DOWN;

    private static int b;

    public static int a() {
        ml_0.b();
        return 42;
    }

    public static void b(int n) {
        b = n;
    }

    static {
        ml_0.b(0);
    }

    public static int b() {
        return b;
    }
}

