/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import net.NetHandlerPlayServer;

class aSR
implements Runnable {
    NetHandlerPlayServer a;

    @Override
    public void run() {
        NetworkManagerInvoker.a(this.a.netManager);
    }

    aSR(NetHandlerPlayServer netHandlerPlayServer) {
        this.a = netHandlerPlayServer;
    }
}

