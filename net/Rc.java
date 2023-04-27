/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.NetHandlerPlayClient;
import net.minecraft.network.packts.C00PacketKeepAlive;
import java.io.IOException;

public class Rc
extends GuiScreen {
    private NetHandlerPlayClient v;
    private int w;

    @Override
    public void a(int n, int n2, float f) {
        this.e(0);
        this.b(this.q, I18n.format(avw_0.a, new Object[0]), this.n / 2, this.f / 2 - 50, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void g() {
        ++this.w;
        if (this.w % 20 == 0) {
            aDM.a(this.v, new C00PacketKeepAlive());
        }
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    protected void a(char c, int n) throws IOException {
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
    }

    public Rc(NetHandlerPlayClient netHandlerPlayClient) {
        this.v = netHandlerPlayClient;
    }
}

