/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import deobf.IChatComponent;
import deobf.INetHandlerStatusClient;
import deobf.Packet;
import deobf.ServerStatusResponse;
import java.io.IOException;
import net.ChatStyle;
import net.PacketBuffer;
import net.V4;
import net.a4W;
import net.aB4;
import net.aB9;
import net.aEW;
import net.aee_1;
import net.afg_0;
import net.alb_0;
import net.aqr_0;
import net.as4_0;
import net.t6_0;

public class S00PacketServerInfo
implements Packet<INetHandlerStatusClient> {
    private static Gson b = aB9.b(aB9.a(aB9.a(aB9.a(aB9.a(aB9.a(aB9.a(new GsonBuilder(), aEW.class, (Object)new afg_0()), t6_0.class, (Object)new aqr_0()), ServerStatusResponse.class, (Object)new aee_1()), IChatComponent.class, (Object)new V4()), ChatStyle.class, (Object)new aB4()), new alb_0()));
    private ServerStatusResponse a;

    public void a(INetHandlerStatusClient iNetHandlerStatusClient) {
        as4_0.a(iNetHandlerStatusClient, this);
    }

    public S00PacketServerInfo(ServerStatusResponse serverStatusResponse) {
        this.a = serverStatusResponse;
    }

    public ServerStatusResponse a() {
        return this.a;
    }

    public S00PacketServerInfo() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = (ServerStatusResponse)a4W.a(b, PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE), ServerStatusResponse.class);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, a4W.a(b, this.a));
    }
}

