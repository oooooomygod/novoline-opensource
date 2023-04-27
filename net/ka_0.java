/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C03PacketPlayer;

/*
 * Renamed from net.Ka
 */
public class ka_0 {
    private static int[] b;

    public static void a(C03PacketPlayer c03PacketPlayer, boolean bl) {
        c03PacketPlayer.setRotating(bl);
    }

    public static float f(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.getPitch();
    }

    public static boolean g(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.isOnGround();
    }

    public static int[] b() {
        return b;
    }

    static {
        if (ka_0.b() == null) {
            ka_0.b(new int[5]);
        }
    }

    public static void a(C03PacketPlayer c03PacketPlayer, float[] fArray) {
        c03PacketPlayer.setRotation(fArray);
    }

    public static boolean h(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.isMoving();
    }

    public static double c(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.getZ();
    }

    public static double a(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.getY();
    }

    public static void a(C03PacketPlayer c03PacketPlayer, double d) {
        c03PacketPlayer.setY(d);
    }

    public static float e(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.getYaw();
    }

    public static double d(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.getX();
    }

    public static void b(C03PacketPlayer c03PacketPlayer, boolean bl) {
        c03PacketPlayer.setOnGround(bl);
    }

    public static boolean b(C03PacketPlayer c03PacketPlayer) {
        return c03PacketPlayer.isRotating();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

