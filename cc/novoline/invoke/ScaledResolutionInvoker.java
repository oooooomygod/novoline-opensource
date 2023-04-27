/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.ScaledResolution;

public class ScaledResolutionInvoker {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static int getScaleFactor(ScaledResolution scaledResolution) {
        return scaledResolution.h();
    }

    public static int getScaledWidth(ScaledResolution scaledResolution) {
        return scaledResolution.b();
    }

    public static double e(ScaledResolution scaledResolution) {
        return scaledResolution.g();
    }

    public static double c(ScaledResolution scaledResolution) {
        return scaledResolution.f();
    }

    public static double d(ScaledResolution scaledResolution) {
        return scaledResolution.e();
    }

    public static int i(ScaledResolution scaledResolution) {
        return scaledResolution.a();
    }

    static {
        if (!ScaledResolutionInvoker.b()) {
            ScaledResolutionInvoker.b(true);
        }
    }

    public static double f(ScaledResolution scaledResolution) {
        return scaledResolution.i();
    }

    public static int a(ScaledResolution scaledResolution) {
        return scaledResolution.c();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static int g(ScaledResolution scaledResolution) {
        return scaledResolution.d();
    }

    public static boolean a() {
        ScaledResolutionInvoker.b();
        return true;
    }
}

