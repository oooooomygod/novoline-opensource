/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumConnectionState;
import deobf.NetworkManager;
import net.minecraft.network.packts.C00PacketServerQuery;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import net.ChatComponentText;
import org.apache.logging.log4j.Logger;

public class aBQ {
    private static Logger b = LogManagerInvoker.c();
    private List<NetworkManager> a = asg_0.c(my_0.c());

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a() {
        List<NetworkManager> list = this.a;
        synchronized (list) {
            Iterator iterator = ListInvoker.iterator(this.a);
            while (dz_0.c(iterator)) {
                NetworkManager networkManager = (NetworkManager)((Object)dz_0.b(iterator));
                if (NetworkManagerInvoker.d(networkManager)) {
                    NetworkManagerInvoker.h(networkManager);
                    continue;
                }
                dz_0.a(iterator);
                NetworkManagerInvoker.a(networkManager);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        List<NetworkManager> list = this.a;
        synchronized (list) {
            Iterator iterator = ListInvoker.iterator(this.a);
            while (dz_0.c(iterator)) {
                NetworkManager networkManager = (NetworkManager)((Object)dz_0.b(iterator));
                if (!NetworkManagerInvoker.d(networkManager)) continue;
                dz_0.a(iterator);
                NetworkManagerInvoker.a(networkManager, new ChatComponentText(apc_1.a));
            }
            return;
        }
    }

    static Logger c() {
        return b;
    }

    public void a(String string, aY5 aY52) throws UnknownHostException {
        if (!StringInvoker.e(string, apc_1.b) && !StringInvoker.g(string)) {
            aox_0 aox_02 = cn_0.a(string);
            NetworkManager networkManager = NetworkManagerInvoker.a(akt_0.a(cn_0.b(aox_02)), cn_0.a(aox_02), false);
            ListInvoker.add(this.a, (Object)networkManager);
            NetworkManagerInvoker.setNetHandler(networkManager, new vz_0(this, aY52, networkManager, string));
            try {
                NetworkManagerInvoker.sendPacket(networkManager, new aQ4(aQU.b, cn_0.b(aox_02), cn_0.a(aox_02), EnumConnectionState.STATUS));
                NetworkManagerInvoker.sendPacket(networkManager, new C00PacketServerQuery());
            }
            catch (Throwable throwable) {
                LoggerInvoker.a(b, throwable);
            }
        }
    }
}

