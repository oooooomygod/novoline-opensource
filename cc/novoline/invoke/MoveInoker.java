/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.events.events.MoveEvent;

public class MoveInoker {
    public static double setZ(MoveEvent moveEvent) {
        return moveEvent.getZ();
    }

    public static void setSpeed(MoveEvent moveEvent, double d) {
        moveEvent.setSpeed(d);
    }

    public static double getY(MoveEvent moveEvent) {
        return moveEvent.getY();
    }

    public static void a(MoveEvent moveEvent, float f, double d) {
        moveEvent.a(f, d);
    }

    public static double getX(MoveEvent moveEvent) {
        return moveEvent.getX();
    }

    public static void setY(MoveEvent moveEvent, double d) {
        moveEvent.setY(d);
    }
}

