/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumConnectionState;
import deobf.GuiConnecting;
import deobf.MCInvoker;
import net.minecraft.network.packts.C00PacketLoginStart;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;

class TX
extends Thread {
    int b;
    GuiConnecting a;
    String c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            try {
                if (GuiConnecting.d(this.a)) {
                    return;
                }
                inetAddress = akt_0.a(this.c);
                if (StringInvoker.c(this.c, aqb_0.h) || StringInvoker.c(this.c, aqb_0.f)) {
                    boolean bl = false;
                    Iterator iterator = aS0.f(ds_2.a(GuiConnecting.b()));
                    while (dz_0.c(iterator)) {
                        int n;
                        Map.Entry entry = (Map.Entry)dz_0.b(iterator);
                        String string = (String)FG.b(entry);
                        if (!GuiConnecting.a(this.a, this.c, string, n = P8.b((Integer)FG.a(entry)))) continue;
                        bl = true;
                        break;
                    }
                    LoggerInvoker.b(GuiConnecting.a(), aqb_0.a, new Object[]{inetAddress});
                    aCM.a(true);
                }
                aCM.a(MCInvoker.W(GuiConnecting.a(this.a)));
                GuiConnecting.a(this.a, NetworkManagerInvoker.a(inetAddress, this.b, awu_1.e(GuiConnecting.f((GuiConnecting)this.a).gameSettings)));
                NetworkManagerInvoker.setNetHandler(GuiConnecting.g(this.a), new NetHandlerLoginClient(GuiConnecting.g(this.a), GuiConnecting.c(this.a), GuiConnecting.e(this.a)));
                NetworkManagerInvoker.sendPacket(GuiConnecting.g(this.a), new aQ4(47, this.c, this.b, EnumConnectionState.LOGIN));
                NetworkManagerInvoker.sendPacket(GuiConnecting.g(this.a), new C00PacketLoginStart(SessionInvoker.a(MCInvoker.y(GuiConnecting.h(this.a)))));
                return;
            }
            catch (UnknownHostException unknownHostException) {
                if (GuiConnecting.d(this.a)) {
                    return;
                }
                LoggerInvoker.a(GuiConnecting.a(), aqb_0.d, unknownHostException);
                MCInvoker.displayGuiScreen(GuiConnecting.b(this.a), new rg_0(GuiConnecting.e(this.a), aqb_0.k, new aoz_1(aqb_0.c, aqb_0.l)));
                return;
            }
        }
        catch (Exception exception) {
            if (GuiConnecting.d(this.a)) {
                return;
            }
            LoggerInvoker.a(GuiConnecting.a(), aqb_0.g, exception);
            String string = exception.toString();
            String string2 = aL0.c(aL0.a(aL0.a(new StringBuilder(), inetAddress.toString()), aqb_0.e), this.b).toString();
            string = StringInvoker.a(string, string2, aqb_0.b);
            MCInvoker.displayGuiScreen(GuiConnecting.i(this.a), new rg_0(GuiConnecting.e(this.a), aqb_0.j, new aoz_1(aqb_0.i, string)));
        }
    }

    TX(GuiConnecting guiConnecting, String string, String string2, int n) {
        this.a = guiConnecting;
        this.c = string2;
        this.b = n;
        super(string);
    }

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }
}

