/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;

/*
 * Renamed from net.aqu
 */
public class aqu_2 {
    private static int[] b;

    public static HF a(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, EnumFacing enumFacing) {
        aqu_2.b();
        HF hF = HF.a(n, n2, n3, n4, n5, n6, n7, n8, n9, enumFacing);
        ListInvoker.b(new ListInvoker[2]);
        return hF;
    }

    public static boolean a(HF hF, int n, int n2, int n3, int n4) {
        return hF.a(n, n2, n3, n4);
    }

    public static int d(HF hF) {
        return hF.e();
    }

    public static HF a(int n, int n2, int n3, int n4, int n5, int n6) {
        return HF.a(n, n2, n3, n4, n5, n6);
    }

    public static boolean b(HF hF, HF hF2) {
        return hF.a(hF2);
    }

    public static int c(HF hF) {
        return hF.g();
    }

    public static boolean a(HF hF, zl_2 zl_22) {
        return hF.a(zl_22);
    }

    public static zl_2 b(HF hF) {
        return hF.f();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static HF a() {
        return HF.d();
    }

    public static zl_2 f(HF hF) {
        return hF.c();
    }

    public static int e(HF hF) {
        return hF.b();
    }

    static {
        if (aqu_2.b() != null) {
            aqu_2.b(new int[4]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static aDO a(HF hF) {
        return hF.a();
    }

    public static void a(HF hF, int n, int n2, int n3) {
        hF.a(n, n2, n3);
    }

    public static void a(HF hF, HF hF2) {
        hF.b(hF2);
    }
}

