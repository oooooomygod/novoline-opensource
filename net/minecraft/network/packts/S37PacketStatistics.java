/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.StatListInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import deobf.StatBase;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.P8;
import net.PacketBuffer;
import net.VG;
import net.aS0;
import net.dz_0;

public class S37PacketStatistics
implements Packet<INetHandlerPlayClient> {
    private Map<StatBase, Integer> a;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S37PacketStatistics() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, MapInvoker.a(this.a));
        Iterator iterator = aS0.f(MapInvoker.b(this.a));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            PacketBufferInvoker.a(packetBuffer, ((StatBase)FG.b((Map.Entry)entry)).l);
            PacketBufferInvoker.b(packetBuffer, P8.b((Integer)FG.a(entry)));
        }
    }

    public S37PacketStatistics(Map<StatBase, Integer> map) {
        this.a = map;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        int n = PacketBufferInvoker.b(packetBuffer);
        this.a = MapsInvoker.a();
        for (int i = 0; i < n; ++i) {
            StatBase statBase = StatListInvoker.a(PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE));
            int n2 = PacketBufferInvoker.b(packetBuffer);
            MapInvoker.c(this.a, statBase, P8.d(n2));
        }
    }

    public Map<StatBase, Integer> a() {
        return this.a;
    }
}

