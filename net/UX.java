/*
 * Decompiled with CFR 0.152.
 */
package net;

public class UX {
    private int c;
    private String a;
    private String d;
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public UX b(String string) {
        this.a = string;
        return this;
    }

    public int e() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public static UX f() {
        return new UX();
    }

    public UX a(int n) {
        this.c = n;
        return this;
    }

    public static boolean d() {
        UX.b();
        return true;
    }

    public static boolean b() {
        return b;
    }

    public UX a(String string) {
        this.d = string;
        return this;
    }

    public String a() {
        return this.d;
    }

    static {
        if (UX.b()) {
            UX.b(true);
        }
    }
}

