/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import net.P8;
import net.PlayerUsageSnooper;
import net.aok_0;
import net.md_1;
import net.p1_0;

/*
 * Renamed from net.aNk
 */
class ank_0
extends TimerTask {
    PlayerUsageSnooper a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        if (aok_0.a(PlayerUsageSnooper.g(this.a))) {
            HashMap hashMap;
            Object object = PlayerUsageSnooper.d(this.a);
            synchronized (object) {
                hashMap = MapsInvoker.a(PlayerUsageSnooper.h(this.a));
                if (PlayerUsageSnooper.e(this.a) == 0) {
                    MapInvoker.a((Map)hashMap, PlayerUsageSnooper.c(this.a));
                }
                MapInvoker.c(hashMap, md_1.a, P8.d(PlayerUsageSnooper.b(this.a)));
                MapInvoker.c(hashMap, md_1.b, PlayerUsageSnooper.a(this.a));
            }
            p1_0.a(PlayerUsageSnooper.f(this.a), hashMap, true);
        }
    }

    ank_0(PlayerUsageSnooper playerUsageSnooper) {
        this.a = playerUsageSnooper;
    }
}

