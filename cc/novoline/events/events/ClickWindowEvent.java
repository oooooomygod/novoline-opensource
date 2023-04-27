/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.events.events;

import cc.novoline.events.CancellableEvent;
import cc.novoline.events.EventState;
import net.minecraft.network.packts.C0EPacketClickWindow;

public class ClickWindowEvent
extends CancellableEvent {
    private C0EPacketClickWindow c;
    private EventState d;

    public C0EPacketClickWindow a() {
        return this.c;
    }

    public EventState b() {
        return this.d;
    }

    public ClickWindowEvent(C0EPacketClickWindow c0EPacketClickWindow, EventState eventState) {
        this.c = c0EPacketClickWindow;
        this.d = eventState;
    }
}

