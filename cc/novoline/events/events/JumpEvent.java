/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;

public class JumpEvent
extends CancellableEvent {
    private double jumpMotion;

    public void setJumpMotion(double d) {
        this.jumpMotion = d;
    }

    public double getMotion() {
        return this.jumpMotion;
    }

    public JumpEvent(double d) {
        this.jumpMotion = d;
    }
}

