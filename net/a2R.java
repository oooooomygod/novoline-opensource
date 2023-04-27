/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumConnectionState;
import deobf.MCInvoker;
import net.minecraft.network.packts.C00PacketLoginStart;
import java.net.InetAddress;
import java.net.UnknownHostException;

class a2R
extends Thread {
    int a;
    String c;
    Wh b;

    a2R(Wh wh, String string, String string2, int n) {
        this.b = wh;
        this.c = string2;
        this.a = n;
        super(string);
    }

    private static UnknownHostException a(UnknownHostException unknownHostException) {
        return unknownHostException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        InetAddress inetAddress = null;
        try {
            block13: {
                block12: {
                    try {
                        inetAddress = akt_0.a(this.c);
                        if (Wh.a(this.b)) {
                            return;
                        }
                        Wh.a(this.b, NetworkManagerInvoker.a(inetAddress, this.a, awu_1.e(MCInvoker.f().gameSettings)));
                        if (Wh.a(this.b)) {
                            return;
                        }
                        NetworkManagerInvoker.setNetHandler(Wh.b(this.b), new NetHandlerLoginClient(Wh.b(this.b), MCInvoker.f(), dz_1.c(Wh.c(this.b))));
                        if (!Wh.a(this.b)) break block12;
                        return;
                    }
                    catch (UnknownHostException unknownHostException) {
                        aGK.d();
                        if (Wh.a(this.b)) {
                            return;
                        }
                        LoggerInvoker.a(Wh.b(), aq_0.b, unknownHostException);
                        mf_1.c(MCInvoker.D(MCInvoker.f()));
                        aGK.a(new yk_2(Wh.c(this.b), aq_0.e, new aoz_1(aq_0.j, aL0.a(aL0.a(aL0.a(new StringBuilder(), aq_0.d), this.c), aq_0.f).toString())));
                        return;
                    }
                }
                NetworkManagerInvoker.sendPacket(Wh.b(this.b), new aQ4(47, this.c, this.a, EnumConnectionState.LOGIN));
                if (!Wh.a(this.b)) break block13;
                return;
            }
            NetworkManagerInvoker.sendPacket(Wh.b(this.b), new C00PacketLoginStart(SessionInvoker.a(MCInvoker.y(MCInvoker.f()))));
            return;
        }
        catch (Exception exception) {
            aGK.d();
            if (Wh.a(this.b)) {
                return;
            }
            LoggerInvoker.a(Wh.b(), aq_0.i, exception);
            String string = exception.toString();
            String string2 = aL0.c(aL0.a(aL0.a(new StringBuilder(), inetAddress.toString()), aq_0.h), this.a).toString();
            string = StringInvoker.a(string, string2, aq_0.c);
            aGK.a(new yk_2(Wh.c(this.b), aq_0.g, new aoz_1(aq_0.a, string)));
        }
    }
}

