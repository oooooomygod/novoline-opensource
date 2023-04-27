/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import net.R1;

/*
 * Renamed from net.aw9
 */
public class aw9_0 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(int n, int n2, int n3, float f, float f2, EntityLivingBase entityLivingBase) {
        R1.a(n, n2, n3, f, f2, entityLivingBase);
    }

    static {
        if (aw9_0.b() != null) {
            aw9_0.b(new ListInvoker[1]);
        }
    }
}

