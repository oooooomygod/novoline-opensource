/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.WorldType;
import net.aYj;
import net.ar3_0;
import net.fk_0;

public class S07PacketRespawn
implements Packet<INetHandlerPlayClient> {
    private GameType c;
    private WorldType b;
    private EnumDifficulty a;
    private int d;

    public EnumDifficulty d() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S07PacketRespawn() {
    }

    public GameType a() {
        return this.c;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.d = PacketBufferInvoker.p(packetBuffer);
        this.a = aYj.a(PacketBufferInvoker.n(packetBuffer));
        this.c = ar3_0.a(PacketBufferInvoker.n(packetBuffer));
        this.b = fk_0.a(PacketBufferInvoker.d(packetBuffer, 16));
        if (this.b == null) {
            this.b = WorldType.n;
        }
    }

    public void a(GameType gameType) {
        this.c = gameType;
    }

    public int b() {
        return this.d;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S07PacketRespawn(int n, EnumDifficulty enumDifficulty, WorldType worldType, GameType gameType) {
        this.d = n;
        this.a = enumDifficulty;
        this.c = gameType;
        this.b = worldType;
    }

    public WorldType c() {
        return this.b;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, aYj.a(this.a));
        PacketBufferInvoker.c(packetBuffer, ar3_0.a(this.c));
        PacketBufferInvoker.a(packetBuffer, fk_0.f(this.b));
    }
}

