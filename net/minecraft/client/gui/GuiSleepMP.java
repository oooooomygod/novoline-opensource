/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.NetHandlerPlayClient;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0BPacketEntityAction$Action;
import java.io.IOException;

public class GuiSleepMP
extends GuiChat {
    @Override
    protected void a(char c, int n) throws IOException {
        if (n == 1) {
            this.b();
        } else if (n != 28 && n != 156) {
            super.a(c, n);
        } else {
            String string = StringInvoker.h(hc_1.a(this.x));
            if (!StringInvoker.g(string)) {
                this.t.player.b(string);
            }
            hc_1.b(this.x, qi_1.b);
            kp_1.a(GW.f(this.t.ingameGUI));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 1) {
            this.b();
        } else {
            super.a(qG);
        }
    }

    @Override
    public void l() {
        super.l();
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f - 40, I18n.format(qi_1.a, new Object[0])));
    }

    private void b() {
        NetHandlerPlayClient netHandlerPlayClient = this.t.player.connection;
        aDM.a(netHandlerPlayClient, new C0BPacketEntityAction(this.t.player, C0BPacketEntityAction$Action.STOP_SLEEPING));
    }
}

