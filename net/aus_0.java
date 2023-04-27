/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.visual.HUD;

/*
 * Renamed from net.aUs
 */
class aus_0
extends FutureTask {
    HUD a;

    @Override
    public void f() {
        this.a.b();
    }

    @Override
    public void b() {
    }

    aus_0(HUD hUD, int n, ag3_0 ag3_02) {
        this.a = hUD;
        super(n, ag3_02);
    }
}

