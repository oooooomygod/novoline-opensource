/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.minecraft.network.packts.C17PacketCustomPayload;
import java.io.IOException;

public class Ru
extends GuiScreen {
    private QG B;
    private sc_0 z;
    private QG x;
    private sc_0 A;
    private QG y;
    private awn_1 v;
    private boolean w;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private void a() {
        if (awo_0.g(this.v)) {
            this.B.k = N9.h;
            if (awo_0.f(this.v) != null) {
                hc_1.b(this.z, aBO.d(awo_0.f(this.v)));
            }
        } else {
            this.B.k = N9.j;
            hc_1.b(this.z, N9.c);
        }
    }

    @Override
    public void g() {
        hc_1.c(this.A);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        hc_1.a(this.A, c, n);
        hc_1.a(this.z, c, n);
        boolean bl = this.x.g = !StringInvoker.g(StringInvoker.h(hc_1.a(this.A)));
        if (n != 28 && n != 156) {
            if (n == 1) {
                this.a(this.y);
            }
        } else {
            this.a(this.x);
        }
    }

    public Ru(awn_1 awn_12) {
        this.v = awn_12;
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        this.x = new QG(0, this.n / 2 - 4 - 150, this.f / 4 + 120 + 12, 150, 20, I18n.format(N9.b, new Object[0]));
        ListInvoker.add(this.l, this.x);
        this.y = new QG(1, this.n / 2 + 4, this.f / 4 + 120 + 12, 150, 20, I18n.format(N9.d, new Object[0]));
        ListInvoker.add(this.l, this.y);
        this.B = new QG(4, this.n / 2 + 150 - 20, 150, 20, 20, N9.i);
        ListInvoker.add(this.l, this.B);
        this.A = new sc_0(2, this.q, this.n / 2 - 150, 50, 300, 20);
        hc_1.a(this.A, Short.MAX_VALUE);
        hc_1.c(this.A, true);
        hc_1.b(this.A, awo_0.c(this.v));
        this.z = new sc_0(3, this.q, this.n / 2 - 150, 150, 276, 20);
        hc_1.a(this.z, Short.MAX_VALUE);
        hc_1.d(this.z, false);
        hc_1.b(this.z, N9.l);
        this.w = awo_0.g(this.v);
        this.a();
        this.x.g = !StringInvoker.g(StringInvoker.h(hc_1.a(this.A)));
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        this.A.a(n, n2, n3);
        this.z.a(n, n2, n3);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            switch (qG.m) {
                case 1: {
                    awo_0.a(this.v, this.w);
                    MCInvoker.displayGuiScreen(this.t, null);
                    break;
                }
                case 0: {
                    PacketBuffer packetBuffer = new PacketBuffer(FH.d());
                    PacketBufferInvoker.c(packetBuffer, awo_0.b(this.v));
                    awo_0.a(this.v, packetBuffer);
                    PacketBufferInvoker.a(packetBuffer, hc_1.a(this.A));
                    PacketBufferInvoker.a(packetBuffer, awo_0.g(this.v));
                    aDM.a(MCInvoker.aa(this.t), new C17PacketCustomPayload(N9.m, packetBuffer));
                    if (!awo_0.g(this.v)) {
                        awo_0.a(this.v, null);
                    }
                    MCInvoker.displayGuiScreen(this.t, null);
                    break;
                }
                case 4: {
                    awo_0.a(this.v, !awo_0.g(this.v));
                    this.a();
                }
            }
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(N9.p, new Object[0]), this.n / 2, 20, 0xFFFFFF);
        this.a(this.q, I18n.format(N9.a, new Object[0]), this.n / 2 - 150, 37, 0xA0A0A0);
        hc_1.d(this.A);
        int n3 = 75;
        int n4 = 0;
        this.a(this.q, I18n.format(N9.g, new Object[0]), this.n / 2 - 150, n3 + n4++ * FontRendererInvoker.d(this.q), 0xA0A0A0);
        this.a(this.q, I18n.format(N9.f, new Object[0]), this.n / 2 - 150, n3 + n4++ * FontRendererInvoker.d(this.q), 0xA0A0A0);
        this.a(this.q, I18n.format(N9.o, new Object[0]), this.n / 2 - 150, n3 + n4++ * FontRendererInvoker.d(this.q), 0xA0A0A0);
        this.a(this.q, I18n.format(N9.k, new Object[0]), this.n / 2 - 150, n3 + n4++ * FontRendererInvoker.d(this.q), 0xA0A0A0);
        this.a(this.q, N9.n, this.n / 2 - 150, n3 + n4++ * FontRendererInvoker.d(this.q), 0xA0A0A0);
        if (!StringInvoker.g(hc_1.a(this.z))) {
            n3 = n3 + n4 * FontRendererInvoker.d(this.q) + 16;
            this.a(this.q, I18n.format(N9.e, new Object[0]), this.n / 2 - 150, n3, 0xA0A0A0);
            hc_1.d(this.z);
        }
        super.a(n, n2, f);
    }
}

