/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;

public class KeyPressEvent
extends CancellableEvent {
    private int c;

    public KeyPressEvent(int n) {
        this.c = n;
    }

    public int c() {
        return this.c;
    }
}

