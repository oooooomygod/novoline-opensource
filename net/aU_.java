/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.visual.ClickGui;
import net.minecraft.network.packts.C01PacketChatMessage;

class aU_
extends FutureTask {
    ClickGui a;

    @Override
    public void b() {
    }

    @Override
    public void f() {
        ClickGui.a(this.a, new C01PacketChatMessage(t4_0.a));
    }

    aU_(ClickGui clickGui, int n, ag3_0 ag3_02) {
        this.a = clickGui;
        super(n, ag3_02);
    }
}

