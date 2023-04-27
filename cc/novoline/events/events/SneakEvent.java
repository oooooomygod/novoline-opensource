/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;

public class SneakEvent
implements Event {
    private boolean a;

    public boolean a() {
        return this.a;
    }

    public SneakEvent(boolean bl) {
        this.a = bl;
    }

    public void a(boolean bl) {
        this.a = bl;
    }
}

