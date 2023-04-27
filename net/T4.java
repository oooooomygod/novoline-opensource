/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.nio.FloatBuffer;
import net.aY_;

public class T4 {
    public String a;
    private int b;
    private static ListInvoker[] c;

    public void a(int n) {
        aY_.d(this.b, n);
    }

    public void a(int n, int n2, int n3) {
        aY_.a(this.b, n, n2, n3);
    }

    public void b(int n) {
        this.b = n;
    }

    public void a(float f) {
        aY_.a(this.b, f);
    }

    public void a(FloatBuffer floatBuffer) {
        aY_.a(this.b, floatBuffer);
    }

    public T4(String string) {
        this.a = string;
    }

    static {
        if (T4.b() == null) {
            T4.b(new ListInvoker[3]);
        }
    }

    public void a(boolean bl) {
        T4.b();
        aY_.d(this.b, bl ? 1 : 0);
        ListInvoker.b(new ListInvoker[4]);
    }

    public void a(float f, float f2) {
        aY_.a(this.b, f, f2);
    }

    public void a(float f, float f2, float f3, float f4) {
        T4.b();
        aY_.a(this.b, f, f2, f3, f4);
        if (ListInvoker.b() != null) {
            T4.b(new ListInvoker[5]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        c = listInvokerArray;
    }

    public void a(float f, float f2, float f3) {
        aY_.a(this.b, f, f2, f3);
    }

    public void a(int n, int n2) {
        aY_.a(this.b, n, n2);
    }

    public static ListInvoker[] b() {
        return c;
    }
}

