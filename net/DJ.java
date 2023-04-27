/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.a9k_0;
import net.atT;
import net.q1_0;

public class DJ {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(a9k_0 a9k_02, EntityLivingBase entityLivingBase, q1_0 q1_02, atT atT2) {
        a9k_02.a(entityLivingBase, q1_02, atT2);
    }

    public static String a(a9k_0 a9k_02) {
        return a9k_02.a();
    }

    static {
        if (DJ.b() != null) {
            DJ.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }
}

