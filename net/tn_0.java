/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Set;
import net.NBTTagCompound;

/*
 * Renamed from net.Tn
 */
public class tn_0 {
    private static ListInvoker[] b;

    public static byte e(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.b(string);
    }

    public static boolean a(NBTTagCompound nBTTagCompound, String string, int n) {
        return nBTTagCompound.a(string, n);
    }

    public static boolean b(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.m(string);
    }

    public static String m(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.k(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string) {
        nBTTagCompound.g(string);
    }

    public static NBTBase a(NBTTagCompound nBTTagCompound) {
        return nBTTagCompound.d();
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, String string2) {
        nBTTagCompound.b(string, string2);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, NBTBase nBTBase) {
        nBTTagCompound.a(string, nBTBase);
    }

    public static long f(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.o(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, short s) {
        nBTTagCompound.a(string, s);
    }

    public static void b(NBTTagCompound nBTTagCompound, String string, int n) {
        nBTTagCompound.c(string, n);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, boolean bl) {
        nBTTagCompound.a(string, bl);
    }

    public static boolean c(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.j(string);
    }

    public static NBTTagList c(NBTTagCompound nBTTagCompound, String string, int n) {
        return nBTTagCompound.b(string, n);
    }

    public static Set c(NBTTagCompound nBTTagCompound) {
        return nBTTagCompound.a();
    }

    public static NBTTagCompound d(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.e(string);
    }

    public static double n(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.n(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, byte[] byArray) {
        nBTTagCompound.a(string, byArray);
    }

    public static int g(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.h(string);
    }

    public static float k(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.i(string);
    }

    public static NBTTagCompound a(NBTTagCompound nBTTagCompound, String string, NBTTagCompound nBTTagCompound2) {
        return nBTTagCompound.a(string, nBTTagCompound2);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, double d) {
        nBTTagCompound.a(string, d);
    }

    public static short o(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.f(string);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static byte l(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.a(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, byte by) {
        nBTTagCompound.a(string, by);
    }

    public static int[] i(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.c(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, float f) {
        nBTTagCompound.a(string, f);
    }

    public static boolean b(NBTTagCompound nBTTagCompound) {
        return nBTTagCompound.b();
    }

    public static String b(NBTTagCompound nBTTagCompound, String string, String string2) {
        return nBTTagCompound.a(string, string2);
    }

    public static void a(NBTTagCompound nBTTagCompound, NBTTagCompound nBTTagCompound2) {
        nBTTagCompound.a(nBTTagCompound2);
    }

    public static NBTBase h(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.l(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, long l4) {
        nBTTagCompound.a(string, l4);
    }

    static {
        if (tn_0.b() == null) {
            tn_0.b(new ListInvoker[1]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static byte[] j(NBTTagCompound nBTTagCompound, String string) {
        return nBTTagCompound.d(string);
    }

    public static void a(NBTTagCompound nBTTagCompound, String string, int[] nArray) {
        nBTTagCompound.a(string, nArray);
    }
}

