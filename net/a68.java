/*
 * Decompiled with CFR 0.152.
 */
package net;

public class a68
extends Exception {
    private static String[] b;

    protected a68(String string, Throwable throwable, boolean bl, boolean bl2) {
        super(string, throwable, bl, bl2);
    }

    public a68() {
    }

    public a68(Throwable throwable) {
        super(throwable);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public a68(String string) {
        super(string);
    }

    public static String[] b() {
        return b;
    }

    static {
        if (a68.b() != null) {
            a68.b(new String[2]);
        }
    }

    public a68(String string, Throwable throwable) {
        super(string, throwable);
    }
}

