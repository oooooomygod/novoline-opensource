/*
 * Decompiled with CFR 0.152.
 */
package net;

public class PT
extends IllegalArgumentException {
    private static boolean b;

    public PT(String string, Throwable throwable) {
        super(string, throwable);
    }

    public PT(String string) {
        super(string);
    }

    public static boolean b() {
        return b;
    }

    public static boolean c() {
        PT.b();
        return true;
    }

    private static PT a(PT pT) {
        return pT;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public PT() {
    }

    public PT(Throwable throwable) {
        super(throwable);
    }

    static {
        if (!PT.c()) {
            PT.b(true);
        }
    }
}

