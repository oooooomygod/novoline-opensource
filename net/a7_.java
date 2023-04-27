/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.a7M;
import net.ws_1;

public class a7_
extends a7M {
    private static String f;

    @Override
    protected double a(double d) {
        double d2 = d / (double)this.d;
        return -2.0 * MathInvoker.b(d2, 3.0) + 3.0 * MathInvoker.b(d2, 2.0);
    }

    static {
        if (a7_.a() != null) {
            a7_.b("s3xTr");
        }
    }

    public a7_(int n, double d, ws_1 ws_12) {
        super(n, d, ws_12);
    }

    public a7_(int n, double d) {
        super(n, d);
    }

    public static String a() {
        return f;
    }

    public static void b(String string) {
        f = string;
    }
}

