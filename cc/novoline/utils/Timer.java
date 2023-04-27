/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.utils;

import cc.novoline.invoke.SystemInvoker;
import net.MathHelper;

public class Timer {
    private static String c = "gtiGoc";
    private long b = 0L;
    private long a = -1L;

    public void a() {
        this.a = SystemInvoker.f();
        this.b = this.f();
    }

    public void a(long l4) {
        this.b = l4;
    }

    public long c() {
        return this.f() - this.b();
    }

    public static String e() {
        return c;
    }

    public boolean d(long l4) {
        Timer.e();
        return SystemInvoker.f() - this.a >= l4;
    }

    public long b() {
        return this.b;
    }

    static {
        if (Timer.e() == null) {
            Timer.b("gtiGoc");
        }
    }

    public long f() {
        return SystemInvoker.nanoTime() / 1000000L;
    }

    public boolean b(long l4) {
        Timer.e();
        if (this.d() >= l4) {
            this.a();
            return true;
        }
        return false;
    }

    public boolean a(float f) {
        Timer.e();
        return MathHelper.b(this.f() - this.b, 0.0f, f) >= f;
    }

    public boolean c(long l4) {
        Timer.e();
        return MathHelper.b(this.f() - this.b, 0.0f, l4) >= (float)l4;
    }

    public long d() {
        return SystemInvoker.nanoTime() / 1000000L - this.b;
    }

    public static void b(String string) {
        c = string;
    }

    public boolean a(double d) {
        Timer.e();
        return MathHelper.b((double)(this.f() - this.b), 0.0, d) >= d;
    }
}

