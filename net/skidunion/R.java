/*
 * Decompiled with CFR 0.152.
 */
package net.skidunion;

import cc.novoline.invoke.ListInvoker;

public class R
extends RuntimeException {
    private static int b;

    public R(String string) {
        int n = R.c();
        super(string);
        this.setStackTrace(new StackTraceElement[0]);
        int n2 = n;
        if (ListInvoker.b() != null) {
            R.b(++n2);
        }
    }

    public static int b() {
        return b;
    }

    static {
        if (R.c() == 0) {
            R.b(1);
        }
    }

    public R(Throwable throwable) {
        R.b();
        super(throwable);
        this.setStackTrace(new StackTraceElement[0]);
        ListInvoker.b(new ListInvoker[5]);
    }

    private static R a(R r) {
        return r;
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        R.b();
        return 99;
    }
}

