/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import net.KB;

/*
 * Renamed from net.apR
 */
public class apr_1 {
    private static String b;

    static {
        if (apr_1.b() != null) {
            apr_1.b("ZUr3o");
        }
    }

    public static void a(KB kB, EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        apr_1.b();
        kB.a(entityLivingBase, f, f2, f3, f4, f5, f6, f7);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static boolean a(KB kB) {
        return kB.a();
    }
}

