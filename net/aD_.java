/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.EventState;
import cc.novoline.events.events.ClickWindowEvent;
import net.minecraft.network.packts.C0EPacketClickWindow;

public class aD_ {
    public static EventState b(ClickWindowEvent clickWindowEvent) {
        return clickWindowEvent.b();
    }

    public static void a(ClickWindowEvent clickWindowEvent, boolean bl) {
        clickWindowEvent.setCancelled(bl);
    }

    public static C0EPacketClickWindow a(ClickWindowEvent clickWindowEvent) {
        return clickWindowEvent.a();
    }

    public static boolean c(ClickWindowEvent clickWindowEvent) {
        return clickWindowEvent.isCancelled();
    }
}

