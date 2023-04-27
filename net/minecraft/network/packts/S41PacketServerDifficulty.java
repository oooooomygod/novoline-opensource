/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EnumDifficulty;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.aYj;

public class S41PacketServerDifficulty
implements Packet<INetHandlerPlayClient> {
    private boolean a;
    private EnumDifficulty b;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = aYj.a(PacketBufferInvoker.n(packetBuffer));
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public EnumDifficulty a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public S41PacketServerDifficulty() {
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, aYj.a(this.b));
    }

    public S41PacketServerDifficulty(EnumDifficulty enumDifficulty, boolean bl) {
        this.b = enumDifficulty;
        this.a = bl;
    }
}

