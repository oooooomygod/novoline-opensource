/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.events.SlowdownEvent;

/*
 * Renamed from net.alL
 */
public class all_1 {
    public static boolean a(SlowdownEvent slowdownEvent) {
        return slowdownEvent.isCancelled();
    }

    public static void a(SlowdownEvent slowdownEvent, boolean bl) {
        slowdownEvent.setCancelled(bl);
    }
}

