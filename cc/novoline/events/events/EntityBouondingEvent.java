/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;
import net.aW9;

public class EntityBouondingEvent
extends CancellableEvent {
    private aW9 c;

    public aW9 a() {
        return this.c;
    }

    public EntityBouondingEvent(aW9 aW92) {
        this.c = aW92;
    }
}

