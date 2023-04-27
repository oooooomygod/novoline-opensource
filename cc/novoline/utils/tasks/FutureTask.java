/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils.tasks;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.ag3_0;

public abstract class FutureTask {
    private ag3_0 c;
    private long e;
    private static boolean b;
    private int d;

    protected FutureTask(int n, ag3_0 ag3_02) {
        FutureTask.c();
        this.c = ag3_02;
        this.d = n;
        this.e = SystemInvoker.nanoTime() / 1000000L;
        ListInvoker.b(new ListInvoker[4]);
    }

    public static boolean d() {
        return b;
    }

    public abstract void f();

    public ag3_0 e() {
        return this.c;
    }

    public boolean a() {
        FutureTask.c();
        boolean bl = SystemInvoker.nanoTime() / 1000000L - this.e >= (long)this.d;
        if (ListInvoker.b() != null) {
            FutureTask.b(false);
        }
        return bl;
    }

    public static boolean c() {
        FutureTask.d();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public abstract void b();

    static {
        if (FutureTask.d()) {
            FutureTask.b(true);
        }
    }
}

