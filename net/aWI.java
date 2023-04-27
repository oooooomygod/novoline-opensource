/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.IChatComponent;
import deobf.MinecraftServer;
import deobf.NetworkManager;
import net.minecraft.network.packts.C00PacketServerQuery;
import net.minecraft.network.packts.C01PacketPing;
import net.minecraft.network.packts.S00PacketServerInfo;
import net.minecraft.network.packts.S01PacketPong;
import net.ChatComponentText;

public class aWI
implements INetHandlerStatusServer {
    private NetworkManager c;
    private boolean a;
    private static IChatComponent d = new ChatComponentText(axd_2.a);
    private MinecraftServer b;

    @Override
    public void a(C01PacketPing c01PacketPing) {
        NetworkManagerInvoker.sendPacket(this.c, new S01PacketPong(adx_1.a(c01PacketPing)));
        NetworkManagerInvoker.a(this.c, d);
    }

    @Override
    public void a(IChatComponent iChatComponent) {
    }

    @Override
    public void a(C00PacketServerQuery c00PacketServerQuery) {
        if (this.a) {
            NetworkManagerInvoker.a(this.c, d);
        } else {
            this.a = true;
            NetworkManagerInvoker.sendPacket(this.c, new S00PacketServerInfo(ServerInvoker.m(this.b)));
        }
    }

    public aWI(MinecraftServer minecraftServer, NetworkManager networkManager) {
        this.b = minecraftServer;
        this.c = networkManager;
    }
}

