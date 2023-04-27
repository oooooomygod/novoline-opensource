/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import net.AltRepositoryGUI;
import net.NBTTagCompound;
import net.aAG;
import net.ais_0;
import net.op_2;

public class at1 {
    private static boolean b;

    public static void f(aAG aAG2) {
        aAG2.d();
    }

    public static boolean d(aAG aAG2) {
        return aAG2.e();
    }

    public static void a(aAG aAG2, float f, int n, int n2, int n3) {
        aAG2.a(f, n, n2, n3);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static double g(aAG aAG2) {
        return aAG2.n();
    }

    public static void a(aAG aAG2) {
        aAG2.i();
    }

    public static op_2 e(aAG aAG2) {
        return aAG2.m();
    }

    public static boolean a() {
        at1.b();
        return true;
    }

    static {
        if (!at1.a()) {
            at1.b(true);
        }
    }

    public static void a(aAG aAG2, long l4) {
        aAG2.a(l4);
    }

    public static aAG a(AltRepositoryGUI altRepositoryGUI, NBTTagCompound nBTTagCompound) {
        return aAG.a(altRepositoryGUI, nBTTagCompound);
    }

    public static ais_0 i(aAG aAG2) {
        return aAG2.j();
    }

    public static String b(aAG aAG2) {
        return aAG2.c();
    }

    public static long h(aAG aAG2) {
        return aAG2.b();
    }

    public static boolean b() {
        return b;
    }

    public static NBTBase c(aAG aAG2) {
        return aAG2.k();
    }

    public static void a(aAG aAG2, int n, int n2) {
        aAG2.a(n, n2);
    }
}

