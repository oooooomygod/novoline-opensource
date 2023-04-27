/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.Random;
import net.F0;
import net.T0;
import net.ny_1;
import net.py_0;

/*
 * Renamed from net.apt
 */
public class apt_2 {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static boolean g(ny_1 ny_12) {
        return ny_12.isInWater();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static EntityLivingBase b(ny_1 ny_12) {
        return ny_12.ak();
    }

    public static py_0 f(ny_1 ny_12) {
        return ny_12.a();
    }

    public static F0 c(ny_1 ny_12) {
        return ny_12.Z();
    }

    public static void a(ny_1 ny_12, String string, float f, float f2) {
        ny_12.a(string, f, f2);
    }

    public static boolean a() {
        apt_2.b();
        return true;
    }

    public static void a(ny_1 ny_12, Entity entity, float f, float f2) {
        ny_12.a(entity, f, f2);
    }

    public static Random i(ny_1 ny_12) {
        return ny_12.E();
    }

    static {
        if (!apt_2.a()) {
            apt_2.b(true);
        }
    }

    public static boolean e(ny_1 ny_12) {
        return ny_12.o();
    }

    public static T0 d(ny_1 ny_12) {
        return ny_12.d();
    }

    public static int h(ny_1 ny_12) {
        return ny_12.e();
    }

    public static boolean a(ny_1 ny_12) {
        return ny_12.ac();
    }
}

