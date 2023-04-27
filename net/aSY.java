/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.NBTTagCompound;
import net.tx_2;

public class aSY {
    private static ListInvoker[] b;

    public static void b(tx_2 tx_22, float f) {
        tx_22.b(f);
    }

    public static boolean g(tx_2 tx_22) {
        return tx_22.b();
    }

    public static void b(tx_2 tx_22, boolean bl) {
        tx_22.b(bl);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static boolean a(tx_2 tx_22) {
        return tx_22.e();
    }

    static {
        if (aSY.b() == null) {
            aSY.b(new ListInvoker[2]);
        }
    }

    public static float c(tx_2 tx_22) {
        return tx_22.g();
    }

    public static void b(tx_2 tx_22, NBTTagCompound nBTTagCompound) {
        tx_22.b(nBTTagCompound);
    }

    public static void a(tx_2 tx_22, float f) {
        tx_22.a(f);
    }

    public static boolean d(tx_2 tx_22) {
        return tx_22.a();
    }

    public static float e(tx_2 tx_22) {
        return tx_22.c();
    }

    public static void c(tx_2 tx_22, boolean bl) {
        tx_22.e(bl);
    }

    public static boolean b(tx_2 tx_22) {
        return tx_22.d();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static boolean f(tx_2 tx_22) {
        return tx_22.f();
    }

    public static void a(tx_2 tx_22, boolean bl) {
        tx_22.d(bl);
    }

    public static void e(tx_2 tx_22, boolean bl) {
        tx_22.c(bl);
    }

    public static void a(tx_2 tx_22, NBTTagCompound nBTTagCompound) {
        tx_22.a(nBTTagCompound);
    }

    public static void d(tx_2 tx_22, boolean bl) {
        tx_22.a(bl);
    }
}

