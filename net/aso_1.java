/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.CancellableEvent;
import cc.novoline.events.Event;
import cc.novoline.invoke.ListInvoker;
import net.a5_;

/*
 * Renamed from net.asO
 */
public abstract class aso_1
implements Event,
a5_ {
    private byte a;

    @Override
    public byte a() {
        return this.a;
    }

    protected aso_1(byte by) {
        CancellableEvent.a();
        this.a = by;
        ListInvoker.b(new ListInvoker[4]);
    }
}

