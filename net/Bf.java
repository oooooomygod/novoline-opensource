/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.CancellableEvent;
import deobf.Entity;

public class Bf
extends CancellableEvent {
    Entity c;

    public Bf(Entity entity) {
        this.c = entity;
    }

    public Entity a() {
        return this.c;
    }
}

