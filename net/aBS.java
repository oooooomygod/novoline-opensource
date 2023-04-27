/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;

public class aBS
extends Exception {
    private static int b;

    public aBS(String string, Throwable throwable) {
        super(string, throwable);
    }

    public static void b(int n) {
        b = n;
    }

    public aBS(String string) {
        super(string);
    }

    public static int b() {
        return b;
    }

    public aBS(String string, Throwable throwable, boolean bl, boolean bl2) {
        aBS.b();
        super(string, throwable, bl, bl2);
        ListInvoker.b(new ListInvoker[5]);
    }

    public static int c() {
        aBS.b();
        return 70;
    }

    public aBS() {
    }

    static {
        if (aBS.b() == 0) {
            aBS.b(78);
        }
    }

    public aBS(Throwable throwable) {
        super(throwable);
    }
}

