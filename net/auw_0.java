/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.visual.HUD;

/*
 * Renamed from net.aUw
 */
class auw_0
extends FutureTask {
    HUD a;

    auw_0(HUD hUD, int n, ag3_0 ag3_02) {
        this.a = hUD;
        super(n, ag3_02);
    }

    @Override
    public void b() {
        this.a.b();
    }

    @Override
    public void f() {
    }
}

