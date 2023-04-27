/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import net.DU;
import net.j7_0;

public class CP {
    public static void a(j7_0 j7_02, Entity entity, double d, double d2, double d3, float f, float f2) {
        DU.b();
        j7_02.b(entity, d, d2, d3, f, f2);
        if (ListInvoker.b() != null) {
            DU.b(new String[5]);
        }
    }

    public static void b(j7_0 j7_02, Entity entity, double d, double d2, double d3, float f, float f2) {
        DU.b();
        j7_02.a(entity, d, d2, d3, f, f2);
        ListInvoker.b(new ListInvoker[3]);
    }
}

