/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import net.minecraft.network.packts.C0EPacketClickWindow;

public class aVZ {
    public static void a(C0EPacketClickWindow c0EPacketClickWindow, ItemStack itemStack) {
        c0EPacketClickWindow.a(itemStack);
    }

    public static boolean d(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.f();
    }

    public static ItemStack c(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.h();
    }

    public static int a(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.k();
    }

    public static int f(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.l();
    }

    public static int g(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.j();
    }

    public static short e(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.i();
    }

    public static int b(C0EPacketClickWindow c0EPacketClickWindow) {
        return c0EPacketClickWindow.a();
    }
}

