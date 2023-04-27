/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.Y5;
import net.aBO;
import net.adf_0;
import net.atn_0;
import net.aw1_0;

public class S42PacketCombatEvent
implements Packet<INetHandlerPlayClient> {
    public int b;
    public adf_0 e;
    public int c;
    public int a;
    public String d;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S42PacketCombatEvent() {
    }

    public int a() {
        return this.a;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.e);
        if (this.e == adf_0.END_COMBAT) {
            PacketBufferInvoker.b(packetBuffer, this.b);
            PacketBufferInvoker.e(packetBuffer, this.a);
        } else if (this.e == adf_0.ENTITY_DIED) {
            PacketBufferInvoker.b(packetBuffer, this.c);
            PacketBufferInvoker.e(packetBuffer, this.a);
            PacketBufferInvoker.a(packetBuffer, this.d);
        }
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.e = (adf_0)PacketBufferInvoker.a(packetBuffer, adf_0.class);
        if (this.e == adf_0.END_COMBAT) {
            this.b = PacketBufferInvoker.b(packetBuffer);
            this.a = PacketBufferInvoker.p(packetBuffer);
        } else if (this.e == adf_0.ENTITY_DIED) {
            this.c = PacketBufferInvoker.b(packetBuffer);
            this.a = PacketBufferInvoker.p(packetBuffer);
            this.d = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public int b() {
        return this.c;
    }

    public S42PacketCombatEvent(Y5 y5, adf_0 adf_02) {
        this.e = adf_02;
        aw1_0.a(y5);
        switch (adf_02) {
            case END_COMBAT: {
                this.b = aw1_0.b(y5);
                this.a = -1;
                break;
            }
            case ENTITY_DIED: {
                this.c = atn_0.h(aw1_0.d(y5));
                this.a = -1;
                this.d = aBO.d(aw1_0.e(y5));
            }
        }
    }
}

