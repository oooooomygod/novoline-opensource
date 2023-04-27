/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.JumpEvent;

public class SU {
    public static double b(JumpEvent jumpEvent) {
        return jumpEvent.getMotion();
    }

    public static void a(JumpEvent jumpEvent, boolean bl) {
        jumpEvent.setCancelled(bl);
    }

    public static void a(JumpEvent jumpEvent, double d) {
        jumpEvent.setJumpMotion(d);
    }

    public static boolean a(JumpEvent jumpEvent) {
        return jumpEvent.isCancelled();
    }
}

