/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.atT;
import net.q1_0;

/*
 * Renamed from net.a9k
 */
public abstract class a9k_0 {
    private static int[] b;

    public abstract void a(EntityLivingBase var1, q1_0 var2, atT var3);

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (a9k_0.b() == null) {
            a9k_0.b(new int[5]);
        }
    }

    public abstract String a();
}

