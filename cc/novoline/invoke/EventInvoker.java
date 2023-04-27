/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.events.events.MotionUpdateEvent;
import cc.novoline.events.type.State;
import net.minecraft.network.packts.C03PacketPlayer;

public class EventInvoker {
    private static boolean b;

    public static void b(MotionUpdateEvent motionUpdateEvent, float f) {
        motionUpdateEvent.setPitch(f);
    }

    public static double c(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.getZ();
    }

    public static float b(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.getYaw();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean a(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.isCancelled();
    }

    public static State getState(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.e();
    }

    public static float i(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.getPitch();
    }

    public static double e(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.getY();
    }

    public static void c(MotionUpdateEvent motionUpdateEvent, double d) {
        motionUpdateEvent.setX(d);
    }

    public static void b(MotionUpdateEvent motionUpdateEvent, boolean bl) {
        motionUpdateEvent.setOnGround(bl);
    }

    public static void a(MotionUpdateEvent motionUpdateEvent, double d) {
        motionUpdateEvent.setZ(d);
    }

    public static C03PacketPlayer d(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.a();
    }

    public static boolean b() {
        return b;
    }

    public static void a(MotionUpdateEvent motionUpdateEvent, boolean bl) {
        motionUpdateEvent.setCancelled(bl);
    }

    public static void a(MotionUpdateEvent motionUpdateEvent, float f) {
        motionUpdateEvent.setYaw(f);
    }

    public static boolean c() {
        EventInvoker.b();
        return true;
    }

    public static double h(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.getX();
    }

    public static void b(MotionUpdateEvent motionUpdateEvent, double d) {
        motionUpdateEvent.setY(d);
    }

    static {
        if (!EventInvoker.b()) {
            EventInvoker.b(true);
        }
    }

    public static boolean g(MotionUpdateEvent motionUpdateEvent) {
        return motionUpdateEvent.isOnGround();
    }
}

