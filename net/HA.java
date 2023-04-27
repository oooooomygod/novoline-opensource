/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.Bf;

public class HA {
    public static Entity b(Bf bf) {
        return bf.a();
    }

    public static void a(Bf bf, boolean bl) {
        bf.setCancelled(bl);
    }

    public static boolean a(Bf bf) {
        return bf.isCancelled();
    }
}

