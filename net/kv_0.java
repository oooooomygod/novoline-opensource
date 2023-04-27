/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import deobf.NBTTagList;
import net.NBTTagCompound;

/*
 * Renamed from net.Kv
 */
public class kv_0 {
    private static String b;

    public static NBTBase b(NBTTagList nBTTagList) {
        return nBTTagList.d();
    }

    public static NBTBase a(NBTTagList nBTTagList, int n) {
        return nBTTagList.f(n);
    }

    public static float b(NBTTagList nBTTagList, int n) {
        return nBTTagList.e(n);
    }

    public static String f(NBTTagList nBTTagList, int n) {
        return nBTTagList.d(n);
    }

    public static int c(NBTTagList nBTTagList) {
        return nBTTagList.a();
    }

    public static double d(NBTTagList nBTTagList, int n) {
        return nBTTagList.c(n);
    }

    public static int[] c(NBTTagList nBTTagList, int n) {
        return nBTTagList.b(n);
    }

    public static int d(NBTTagList nBTTagList) {
        return nBTTagList.b();
    }

    static {
        if (kv_0.b() != null) {
            kv_0.b("lNplCc");
        }
    }

    public static void a(NBTTagList nBTTagList, NBTBase nBTBase) {
        nBTTagList.a(nBTBase);
    }

    public static NBTBase e(NBTTagList nBTTagList, int n) {
        return nBTTagList.g(n);
    }

    public static NBTTagCompound g(NBTTagList nBTTagList, int n) {
        return nBTTagList.a(n);
    }

    public static String b() {
        return b;
    }

    public static void a(NBTTagList nBTTagList, int n, NBTBase nBTBase) {
        nBTTagList.a(n, nBTBase);
    }

    public static boolean a(NBTTagList nBTTagList) {
        return nBTTagList.b();
    }

    public static void b(String string) {
        b = string;
    }
}

