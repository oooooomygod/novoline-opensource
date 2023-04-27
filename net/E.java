/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Map;
import net.FA;
import net.amn_1;
import net.auz_0;
import net.xy_2;

class E
implements amn_1 {
    Map a;

    E(Map map) {
        this.a = map;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(xy_2 xy_22, FA fA) {
        Map map = this.a;
        synchronized (map) {
            MapInvoker.c(this.a, auz_0.b, fA);
            this.a.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(xy_2 xy_22, Exception exception) {
        Map map = this.a;
        synchronized (map) {
            MapInvoker.c(this.a, auz_0.a, exception);
            this.a.notifyAll();
            return;
        }
    }
}

