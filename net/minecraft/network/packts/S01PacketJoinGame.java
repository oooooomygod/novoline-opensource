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

public class S01PacketJoinGame
implements Packet<INetHandlerPlayClient> {
    private int maxPlayers;
    private EnumDifficulty difficulty;
    private boolean reducedDebugInfo;
    private int entityId;
    private boolean hardcoreMode;
    private GameType gameType;
    private int dimension;
    private WorldType worldType;

    public GameType c() {
        return this.gameType;
    }

    public int e() {
        return this.entityId;
    }

    public int a() {
        return this.maxPlayers;
    }

    public S01PacketJoinGame() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.entityId = PacketBufferInvoker.p(packetBuffer);
        int n = PacketBufferInvoker.n(packetBuffer);
        this.hardcoreMode = (n & 8) == 8;
        this.gameType = ar3_0.a(n &= 0xFFFFFFF7);
        this.dimension = PacketBufferInvoker.l(packetBuffer);
        this.difficulty = aYj.a(PacketBufferInvoker.n(packetBuffer));
        this.maxPlayers = PacketBufferInvoker.n(packetBuffer);
        this.worldType = fk_0.a(PacketBufferInvoker.d(packetBuffer, 16));
        if (this.worldType == null) {
            this.worldType = WorldType.n;
        }
        this.reducedDebugInfo = PacketBufferInvoker.i(packetBuffer);
    }

    public WorldType b() {
        return this.worldType;
    }

    public S01PacketJoinGame(int n, GameType gameType, boolean bl, int n2, EnumDifficulty enumDifficulty, int n3, WorldType worldType, boolean bl2) {
        this.entityId = n;
        this.dimension = n2;
        this.difficulty = enumDifficulty;
        this.gameType = gameType;
        this.maxPlayers = n3;
        this.hardcoreMode = bl;
        this.worldType = worldType;
        this.reducedDebugInfo = bl2;
    }

    public boolean f() {
        return this.hardcoreMode;
    }

    public EnumDifficulty d() {
        return this.difficulty;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public int g() {
        return this.dimension;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.entityId);
        int n = ar3_0.a(this.gameType);
        if (this.hardcoreMode) {
            n |= 8;
        }
        PacketBufferInvoker.c(packetBuffer, n);
        PacketBufferInvoker.c(packetBuffer, this.dimension);
        PacketBufferInvoker.c(packetBuffer, aYj.a(this.difficulty));
        PacketBufferInvoker.c(packetBuffer, this.maxPlayers);
        PacketBufferInvoker.a(packetBuffer, fk_0.f(this.worldType));
        PacketBufferInvoker.a(packetBuffer, this.reducedDebugInfo);
    }

    public boolean h() {
        return this.reducedDebugInfo;
    }
}

