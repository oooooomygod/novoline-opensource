/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Packet;

/*
 * Renamed from net.sl
 */
public class sl_2 {
    public static Packet a(wp_1 wp_12, ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return wp_12.a(itemStack, world, entityPlayer);
    }

    public static aBN a(wp_1 wp_12, EntityPlayer entityPlayer) {
        return wp_12.a(entityPlayer);
    }

    public static void a(wp_1 wp_12) {
        wp_12.a();
    }

    public static void a(wp_1 wp_12, EntityPlayer entityPlayer, ItemStack itemStack) {
        wp_12.a(entityPlayer, itemStack);
    }

    public static void a(wp_1 wp_12, int n, int n2) {
        wp_12.a(n, n2);
    }

    public static void a(wp_1 wp_12, double d, double d2, int n) {
        wp_12.a(d, d2, n);
    }
}

