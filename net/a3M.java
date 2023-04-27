/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.NBTTagCompound;
import net.a2l_0;

public class a3M {
    private static int[] b;

    public static void b(a2l_0 a2l_02, boolean bl) {
        a2l_02.c(bl);
    }

    public static NBTTagCompound a(a2l_0 a2l_02, NBTTagCompound nBTTagCompound) {
        return a2l_02.b(nBTTagCompound);
    }

    static {
        if (a3M.b() != null) {
            a3M.b(new int[5]);
        }
    }

    public static String d(a2l_0 a2l_02) {
        return a2l_02.c();
    }

    public static void c(a2l_0 a2l_02, boolean bl) {
        a2l_02.b(bl);
    }

    public static boolean f(a2l_0 a2l_02) {
        return a2l_02.e();
    }

    public static boolean a(a2l_0 a2l_02, EntityLivingBase entityLivingBase) {
        return a2l_02.a(entityLivingBase);
    }

    public static int c(a2l_0 a2l_02) {
        return a2l_02.d();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(a2l_0 a2l_02, a2l_0 a2l_03) {
        a2l_02.a(a2l_03);
    }

    public static int g(a2l_0 a2l_02) {
        return a2l_02.b();
    }

    public static boolean e(a2l_0 a2l_02) {
        return a2l_02.h();
    }

    public static int[] b() {
        return b;
    }

    public static boolean a(a2l_0 a2l_02) {
        return a2l_02.g();
    }

    public static int b(a2l_0 a2l_02) {
        return a2l_02.f();
    }

    public static void a(a2l_0 a2l_02, boolean bl) {
        a2l_02.a(bl);
    }

    public static a2l_0 a(NBTTagCompound nBTTagCompound) {
        return a2l_0.a(nBTTagCompound);
    }
}

