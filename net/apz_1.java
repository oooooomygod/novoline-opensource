/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import net.ResourceLocation;
import net.op_2;

/*
 * Renamed from net.apZ
 */
public class apz_1 {
    private static int b;

    static {
        if (apz_1.a() == 0) {
            apz_1.b(102);
        }
    }

    public static int a() {
        apz_1.b();
        return 60;
    }

    public static int b() {
        return b;
    }

    public static GameProfile b(op_2 op_22) {
        return op_22.X();
    }

    public static ResourceLocation d(op_2 op_22) {
        return op_22.f();
    }

    public static String a(op_2 op_22) {
        return op_22.getName();
    }

    public static float c(op_2 op_22) {
        return op_22.w();
    }

    public static void b(int n) {
        b = n;
    }
}

