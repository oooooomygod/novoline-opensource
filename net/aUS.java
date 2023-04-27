/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SoundHandlerInvoker;
import deobf.MCInvoker;
import net.FutureTask;
import net.ResourceLocation;
import net.ag3_0;
import net.aih_1;
import net.anf_2;
import net.at_1;
import net.kq_1;

class aUS
extends FutureTask {
    at_1 a;

    aUS(at_1 at_12, int n, ag3_0 ag3_02) {
        this.a = at_12;
        super(n, ag3_02);
    }

    @Override
    public void f() {
        SoundHandlerInvoker.c(MCInvoker.l(MCInvoker.f()), aih_1.a(new ResourceLocation(kq_1.a), (float)anf_2.a(anf_2.c(), 0.95, 1.0)));
    }

    @Override
    public void b() {
    }
}

