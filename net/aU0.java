/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.misc.AutoHypixel;
import net.minecraft.network.packts.C01PacketChatMessage;

class aU0
extends FutureTask {
    AutoHypixel a;
    String f;

    @Override
    public void f() {
        AutoHypixel.a(this.a, new C01PacketChatMessage(this.f));
    }

    aU0(AutoHypixel autoHypixel, int n, ag3_0 ag3_02, String string) {
        this.a = autoHypixel;
        this.f = string;
        super(n, ag3_02);
    }

    @Override
    public void b() {
    }
}

