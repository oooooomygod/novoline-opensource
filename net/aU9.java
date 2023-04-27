/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.combat.AutoGApple;

class aU9
extends FutureTask {
    Runnable a;
    AutoGApple f;

    aU9(AutoGApple autoGApple, int n, ag3_0 ag3_02, Runnable runnable) {
        this.f = autoGApple;
        this.a = runnable;
        super(n, ag3_02);
    }

    @Override
    public void f() {
        this.a.run();
    }

    @Override
    public void b() {
    }
}

