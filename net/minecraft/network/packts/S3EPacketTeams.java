/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import net.OB;
import net.PacketBuffer;
import net.VG;
import net.a35;
import net.aFJ;
import net.dz_0;
import net.ms_0;
import net.my_0;
import net.sd_1;
import net.tc_0;

public class S3EPacketTeams
implements Packet<INetHandlerPlayClient> {
    private String c;
    private int d;
    private String b;
    private int i;
    private String a;
    private int g;
    private Collection<String> e;
    private String f;
    private String h;

    public S3EPacketTeams() {
        this.a = OB.b;
        this.b = OB.e;
        this.h = OB.k;
        this.c = OB.g;
        this.f = aFJ.ALWAYS.field_178830_e;
        this.d = -1;
        this.e = my_0.c();
    }

    public String d() {
        return this.b;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public String i() {
        return this.c;
    }

    public int e() {
        return this.i;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.g);
        if (this.g == 0 || this.g == 2) {
            PacketBufferInvoker.a(packetBuffer, this.b);
            PacketBufferInvoker.a(packetBuffer, this.h);
            PacketBufferInvoker.a(packetBuffer, this.c);
            PacketBufferInvoker.c(packetBuffer, this.i);
            PacketBufferInvoker.a(packetBuffer, this.f);
            PacketBufferInvoker.c(packetBuffer, this.d);
        }
        if (this.g == 0 || this.g == 3 || this.g == 4) {
            PacketBufferInvoker.b(packetBuffer, ms_0.d(this.e));
            Iterator iterator = ms_0.a(this.e);
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                PacketBufferInvoker.a(packetBuffer, string);
            }
        }
    }

    public int c() {
        return this.g;
    }

    public String h() {
        return this.f;
    }

    public String g() {
        return this.a;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S3EPacketTeams(a35 a352, Collection<String> collection, int n) {
        this.a = OB.a;
        this.b = OB.f;
        this.h = OB.d;
        this.c = OB.n;
        this.f = aFJ.ALWAYS.field_178830_e;
        this.d = -1;
        this.e = my_0.c();
        if (n != 3 && n != 4) {
            throw new IllegalArgumentException(OB.m);
        }
        if (!ms_0.c(collection)) {
            this.g = n;
            this.a = sd_1.h(a352);
            ms_0.a(this.e, collection);
            return;
        }
        throw new IllegalArgumentException(OB.j);
    }

    public String a() {
        return this.h;
    }

    public S3EPacketTeams(a35 a352, int n) {
        this.a = OB.c;
        this.b = OB.l;
        this.h = OB.i;
        this.c = OB.h;
        this.f = aFJ.ALWAYS.field_178830_e;
        this.d = -1;
        this.e = my_0.c();
        this.a = sd_1.h(a352);
        this.g = n;
        if (n == 2) {
            this.b = sd_1.c(a352);
            this.h = sd_1.g(a352);
            this.c = sd_1.f(a352);
            this.i = sd_1.e(a352);
            this.f = sd_1.b((a35)a352).field_178830_e;
            this.d = tc_0.a(sd_1.i(a352));
        }
        ms_0.a(this.e, sd_1.d(a352));
    }

    public Collection<String> f() {
        return this.e;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.d(packetBuffer, 16);
        this.g = PacketBufferInvoker.l(packetBuffer);
        if (this.g == 0 || this.g == 2) {
            this.b = PacketBufferInvoker.d(packetBuffer, 32);
            this.h = PacketBufferInvoker.d(packetBuffer, 16);
            this.c = PacketBufferInvoker.d(packetBuffer, 16);
            this.i = PacketBufferInvoker.l(packetBuffer);
            this.f = PacketBufferInvoker.d(packetBuffer, 32);
            this.d = PacketBufferInvoker.l(packetBuffer);
        }
        if (this.g == 0 || this.g == 3 || this.g == 4) {
            int n = PacketBufferInvoker.b(packetBuffer);
            for (int i = 0; i < n; ++i) {
                ms_0.c(this.e, PacketBufferInvoker.d(packetBuffer, 40));
            }
        }
    }

    public int b() {
        return this.d;
    }
}

