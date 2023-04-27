/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.AttributeModifier;
import net.Ma;
import net.PacketBuffer;
import net.VG;
import net.a66;
import net.aZW;
import net.ahw_2;
import net.dc_0;
import net.dz_0;
import net.ms_0;
import net.my_0;
import net.ow_0;
import net.up_1;

public class S20PacketEntityProperties
implements Packet<INetHandlerPlayClient> {
    private int b;
    private List<a66> a = my_0.c();

    public List<a66> b() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S20PacketEntityProperties(int n, Collection<ahw_2> collection) {
        this.b = n;
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            ahw_2 ahw_22 = (ahw_2)dz_0.b(iterator);
            ListInvoker.add(this.a, new a66(this, dc_0.c(Ma.c(ahw_22)), Ma.b(ahw_22), Ma.a(ahw_22)));
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.e(packetBuffer, ListInvoker.size(this.a));
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            a66 a662 = (a66)dz_0.b(iterator);
            PacketBufferInvoker.a(packetBuffer, aZW.a(a662));
            PacketBufferInvoker.writeDouble(packetBuffer, aZW.c(a662));
            PacketBufferInvoker.b(packetBuffer, ms_0.d(aZW.b(a662)));
            Iterator iterator2 = ms_0.a(aZW.b(a662));
            while (dz_0.c(iterator2)) {
                AttributeModifier attributeModifier = (AttributeModifier)dz_0.b(iterator2);
                PacketBufferInvoker.a(packetBuffer, ow_0.a(attributeModifier));
                PacketBufferInvoker.writeDouble(packetBuffer, ow_0.d(attributeModifier));
                PacketBufferInvoker.c(packetBuffer, ow_0.b(attributeModifier));
            }
        }
    }

    public int a() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        int n = PacketBufferInvoker.p(packetBuffer);
        for (int i = 0; i < n; ++i) {
            String string = PacketBufferInvoker.d(packetBuffer, 64);
            double d = PacketBufferInvoker.s(packetBuffer);
            ArrayList arrayList = my_0.c();
            int n2 = PacketBufferInvoker.b(packetBuffer);
            for (int j = 0; j < n2; ++j) {
                UUID uUID = PacketBufferInvoker.h(packetBuffer);
                ListInvoker.add(arrayList, new AttributeModifier(uUID, up_1.a, PacketBufferInvoker.s(packetBuffer), PacketBufferInvoker.l(packetBuffer)));
            }
            ListInvoker.add(this.a, new a66(this, string, d, arrayList));
        }
    }

    public S20PacketEntityProperties() {
    }
}

