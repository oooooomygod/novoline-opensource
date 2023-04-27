/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.Event;
import deobf.Entity;
import net.yd_2;

public class SpawnCheckEvent
implements Event {
    private Entity b;
    private yd_2 a;

    public SpawnCheckEvent(Entity entity, yd_2 yd_22) {
        this.b = entity;
        this.a = yd_22;
    }

    public Entity a() {
        return this.b;
    }

    public yd_2 b() {
        return this.a;
    }
}

