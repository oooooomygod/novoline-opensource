/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.EntityBouondingEvent;
import net.aW9;

public class SD {
    public static aW9 b(EntityBouondingEvent entityBouondingEvent) {
        return entityBouondingEvent.a();
    }

    public static boolean a(EntityBouondingEvent entityBouondingEvent) {
        return entityBouondingEvent.isCancelled();
    }
}

