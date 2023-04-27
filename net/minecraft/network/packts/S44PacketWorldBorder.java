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
import net.agl_1;
import net.ak9_0;
import net.axs_2;

public class S44PacketWorldBorder
implements Packet<INetHandlerPlayClient> {
    private int d;
    private axs_2 f;
    private double a;
    private double g;
    private int c;
    private double e;
    private double h;
    private long i;
    private int b;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S44PacketWorldBorder() {
    }

    public void a(agl_1 agl_12) {
        switch (this.f) {
            case SET_SIZE: {
                ak9_0.b(agl_12, this.e);
                break;
            }
            case LERP_SIZE: {
                ak9_0.a(agl_12, this.g, this.e, this.i);
                break;
            }
            case SET_CENTER: {
                ak9_0.b(agl_12, this.h, this.a);
                break;
            }
            case SET_WARNING_BLOCKS: {
                ak9_0.a(agl_12, this.c);
                break;
            }
            case SET_WARNING_TIME: {
                ak9_0.c(agl_12, this.d);
                break;
            }
            case INITIALIZE: {
                ak9_0.b(agl_12, this.h, this.a);
                if (this.i > 0L) {
                    ak9_0.a(agl_12, this.g, this.e, this.i);
                } else {
                    ak9_0.b(agl_12, this.e);
                }
                ak9_0.b(agl_12, this.b);
                ak9_0.a(agl_12, this.c);
                ak9_0.c(agl_12, this.d);
            }
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.f);
        switch (this.f) {
            case SET_SIZE: {
                PacketBufferInvoker.writeDouble(packetBuffer, this.e);
                break;
            }
            case LERP_SIZE: {
                PacketBufferInvoker.writeDouble(packetBuffer, this.g);
                PacketBufferInvoker.writeDouble(packetBuffer, this.e);
                PacketBufferInvoker.b(packetBuffer, this.i);
                break;
            }
            case SET_CENTER: {
                PacketBufferInvoker.writeDouble(packetBuffer, this.h);
                PacketBufferInvoker.writeDouble(packetBuffer, this.a);
                break;
            }
            case SET_WARNING_BLOCKS: {
                PacketBufferInvoker.b(packetBuffer, this.c);
                break;
            }
            case SET_WARNING_TIME: {
                PacketBufferInvoker.b(packetBuffer, this.d);
                break;
            }
            case INITIALIZE: {
                PacketBufferInvoker.writeDouble(packetBuffer, this.h);
                PacketBufferInvoker.writeDouble(packetBuffer, this.a);
                PacketBufferInvoker.writeDouble(packetBuffer, this.g);
                PacketBufferInvoker.writeDouble(packetBuffer, this.e);
                PacketBufferInvoker.b(packetBuffer, this.i);
                PacketBufferInvoker.b(packetBuffer, this.b);
                PacketBufferInvoker.b(packetBuffer, this.c);
                PacketBufferInvoker.b(packetBuffer, this.d);
            }
        }
    }

    public S44PacketWorldBorder(agl_1 agl_12, axs_2 axs_22) {
        this.f = axs_22;
        this.h = ak9_0.g(agl_12);
        this.a = ak9_0.o(agl_12);
        this.g = ak9_0.e(agl_12);
        this.e = ak9_0.i(agl_12);
        this.i = ak9_0.n(agl_12);
        this.b = ak9_0.l(agl_12);
        this.c = ak9_0.k(agl_12);
        this.d = ak9_0.f(agl_12);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.f = (axs_2)PacketBufferInvoker.a(packetBuffer, axs_2.class);
        switch (this.f) {
            case SET_SIZE: {
                this.e = PacketBufferInvoker.s(packetBuffer);
                break;
            }
            case LERP_SIZE: {
                this.g = PacketBufferInvoker.s(packetBuffer);
                this.e = PacketBufferInvoker.s(packetBuffer);
                this.i = PacketBufferInvoker.r(packetBuffer);
                break;
            }
            case SET_CENTER: {
                this.h = PacketBufferInvoker.s(packetBuffer);
                this.a = PacketBufferInvoker.s(packetBuffer);
                break;
            }
            case SET_WARNING_BLOCKS: {
                this.c = PacketBufferInvoker.b(packetBuffer);
                break;
            }
            case SET_WARNING_TIME: {
                this.d = PacketBufferInvoker.b(packetBuffer);
                break;
            }
            case INITIALIZE: {
                this.h = PacketBufferInvoker.s(packetBuffer);
                this.a = PacketBufferInvoker.s(packetBuffer);
                this.g = PacketBufferInvoker.s(packetBuffer);
                this.e = PacketBufferInvoker.s(packetBuffer);
                this.i = PacketBufferInvoker.r(packetBuffer);
                this.b = PacketBufferInvoker.b(packetBuffer);
                this.c = PacketBufferInvoker.b(packetBuffer);
                this.d = PacketBufferInvoker.b(packetBuffer);
            }
        }
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }
}

