/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.IBlockAccess;
import net.aps_1;

public class UA {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (UA.b() != null) {
            UA.b("HYJQd");
        }
    }

    public static int a(IBlockAccess iBlockAccess, Entity entity, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, boolean bl3) {
        UA.b();
        int n7 = aps_1.a(iBlockAccess, entity, n, n2, n3, n4, n5, n6, bl, bl2, bl3);
        ListInvoker.b(new ListInvoker[3]);
        return n7;
    }
}

