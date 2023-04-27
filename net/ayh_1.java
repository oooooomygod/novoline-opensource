/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import java.util.Random;
import net.F0;
import net.ach_0;
import net.amk_0;
import net.n4_0;
import net.nz_0;
import net.rm_2;
import net.tj_0;
import net.wu_0;

/*
 * Renamed from net.ayH
 */
public class ayh_1 {
    private static String[] b;

    public static boolean n(nz_0 nz_02) {
        return nz_02.I();
    }

    public static boolean d(nz_0 nz_02) {
        return nz_02.isInWater();
    }

    public static void a(nz_0 nz_02, boolean bl) {
        nz_02.n(bl);
    }

    public static int a(nz_0 nz_02) {
        return nz_02.ag();
    }

    public static wu_0 b(nz_0 nz_02) {
        return nz_02.v();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Random q(nz_0 nz_02) {
        return nz_02.E();
    }

    public static void a(nz_0 nz_02, EntityPlayer entityPlayer) {
        nz_02.a(entityPlayer);
    }

    public static void c(nz_0 nz_02, boolean bl) {
        nz_02.l(bl);
    }

    public static void d(nz_0 nz_02, boolean bl) {
        nz_02.m(bl);
    }

    public static boolean r(nz_0 nz_02) {
        return nz_02.n();
    }

    public static amk_0 a(nz_0 nz_02, ach_0 ach_02, amk_0 amk_02) {
        return nz_02.a(ach_02, amk_02);
    }

    public static EntityPlayer h(nz_0 nz_02) {
        return nz_02.a();
    }

    static {
        if (ayh_1.b() == null) {
            ayh_1.b(new String[2]);
        }
    }

    public static boolean f(nz_0 nz_02) {
        return nz_02.F();
    }

    public static void a(nz_0 nz_02, int n) {
        nz_02.k(n);
    }

    public static int c(nz_0 nz_02) {
        return nz_02.e();
    }

    public static float i(nz_0 nz_02) {
        return nz_02.w();
    }

    public static int m(nz_0 nz_02) {
        return nz_02.E();
    }

    public static nz_0 a(nz_0 nz_02, n4_0 n4_02) {
        return nz_02.a(n4_02);
    }

    public static boolean s(nz_0 nz_02) {
        return nz_02.u();
    }

    public static tj_0 l(nz_0 nz_02) {
        return nz_02.C();
    }

    public static void a(nz_0 nz_02, double d, double d2, double d3, float f, float f2) {
        nz_02.c(d, d2, d3, f, f2);
    }

    public static F0 o(nz_0 nz_02) {
        return nz_02.Z();
    }

    public static boolean e(nz_0 nz_02) {
        return nz_02.H();
    }

    public static String[] b() {
        return b;
    }

    public static rm_2 k(nz_0 nz_02) {
        return nz_02.getEntityBoundingBox();
    }

    public static boolean p(nz_0 nz_02) {
        return nz_02.J();
    }

    public static double a(nz_0 nz_02, Entity entity) {
        return nz_02.g(entity);
    }

    public static void b(nz_0 nz_02, int n) {
        nz_02.l(n);
    }

    public static void j(nz_0 nz_02) {
        nz_02.i();
    }

    public static boolean g(nz_0 nz_02) {
        return nz_02.D();
    }

    public static boolean b(nz_0 nz_02, boolean bl) {
        return nz_02.o(bl);
    }
}

