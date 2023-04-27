/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.ClickTeleport;
import net.FutureTask;
import net.ag3_0;
import net.qh_1;

class aUH
extends FutureTask {
    ClickTeleport a;

    @Override
    public void f() {
        ListInvoker.clear(ClickTeleport.c(this.a));
        qh_1.b(ClickTeleport.a(this.a));
        ClickTeleport.b(this.a);
    }

    aUH(ClickTeleport clickTeleport, int n, ag3_0 ag3_02) {
        this.a = clickTeleport;
        super(n, ag3_02);
    }

    @Override
    public void b() {
    }
}

