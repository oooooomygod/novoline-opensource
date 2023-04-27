/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.NT;
import net.aGK;

/*
 * Renamed from net.ls
 */
public class ls_2 {
    public static void a(NT nT, int n, boolean bl, int n2, int n3) {
        nT.a(n, bl, n2, n3);
    }

    public static void a(NT nT, int n, int n2, int n3, int n4, int n5, int n6) {
        aGK.e();
        nT.a(n, n2, n3, n4, n5, n6);
        if (ListInvoker.b() != null) {
            aGK.b(false);
        }
    }

    public static void c(NT nT) {
        nT.h();
    }

    public static int a(NT nT) {
        return nT.b();
    }

    public static boolean a(NT nT, int n) {
        return nT.a(n);
    }

    public static int d(NT nT) {
        return nT.f();
    }

    public static int b(NT nT) {
        return nT.e();
    }
}

