/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aee_2;
import net.anl_2;
import net.dp_1;
import net.sr_1;

/*
 * Renamed from net.aNs
 */
public class ans_0 {
    private static int[] b;

    public static dp_1 a(aee_2 aee_22, int n) {
        return aee_22.b(n);
    }

    static {
        if (ans_0.b() != null) {
            ans_0.b(new int[2]);
        }
    }

    public static int b(aee_2 aee_22) {
        return aee_22.e();
    }

    public static int[] b() {
        return b;
    }

    public static void b(aee_2 aee_22, int n) {
        aee_22.a(n);
    }

    public static void a(aee_2 aee_22, anl_2 anl_22) {
        aee_22.a(anl_22);
    }

    public static dp_1 d(aee_2 aee_22) {
        return aee_22.f();
    }

    public static sr_1 a(aee_2 aee_22) {
        return aee_22.d();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void c(aee_2 aee_22) {
        aee_22.c();
    }

    public static anl_2 e(aee_2 aee_22) {
        return aee_22.b();
    }
}

