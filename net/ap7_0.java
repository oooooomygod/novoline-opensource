/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import deobf.NetworkManager;
import net.INetHandlerHandshakeServer;
import net.aQ4;
import net.ao__0;
import net.md_0;

/*
 * Renamed from net.ap7
 */
public class ap7_0
implements INetHandlerHandshakeServer {
    private MinecraftServer a;
    private NetworkManager b;

    @Override
    public void a(IChatComponent iChatComponent) {
    }

    public ap7_0(MinecraftServer minecraftServer, NetworkManager networkManager) {
        this.a = minecraftServer;
        this.b = networkManager;
    }

    @Override
    public void a(aQ4 aQ42) {
        NetworkManagerInvoker.a(this.b, ao__0.a(aQ42));
        NetworkManagerInvoker.setNetHandler(this.b, new md_0(this.a, this.b));
    }
}

