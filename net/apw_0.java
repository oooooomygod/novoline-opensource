/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.apW
 */
public class apw_0 {
    private static String b;

    public static boolean b(rs_1 rs_12, EntityPlayer entityPlayer) {
        return rs_12.a(entityPlayer);
    }

    public static int c(rs_1 rs_12) {
        return rs_12.e();
    }

    public static ItemStack b(rs_1 rs_12, int n) {
        return rs_12.a(n);
    }

    static {
        if (apw_0.b() != null) {
            apw_0.b("ZgeHqc");
        }
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static void a(rs_1 rs_12, EntityPlayer entityPlayer) {
        rs_12.b(entityPlayer);
    }

    public static void f(rs_1 rs_12) {
        rs_12.d();
    }

    public static int a(rs_1 rs_12) {
        return rs_12.c();
    }

    public static int a(rs_1 rs_12, int n) {
        return rs_12.c(n);
    }

    public static void a(rs_1 rs_12, int n, int n2) {
        rs_12.a(n, n2);
    }

    public static void a(rs_1 rs_12, int n, ItemStack itemStack) {
        rs_12.b(n, itemStack);
    }

    public static void d(rs_1 rs_12) {
        rs_12.a();
    }

    public static IChatComponent e(rs_1 rs_12) {
        return rs_12.getDisplayName();
    }

    public static void c(rs_1 rs_12, EntityPlayer entityPlayer) {
        rs_12.c(entityPlayer);
    }

    public static ItemStack b(rs_1 rs_12, int n, int n2) {
        return rs_12.b(n, n2);
    }

    public static int b(rs_1 rs_12) {
        return rs_12.b();
    }

    public static ItemStack c(rs_1 rs_12, int n) {
        return rs_12.b(n);
    }
}

