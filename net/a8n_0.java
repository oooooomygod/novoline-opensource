/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.broadcast.IngestServer
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import tv.twitch.broadcast.IngestServer;

/*
 * Renamed from net.a8n
 */
class a8n_0
extends aiy_1 {
    RJ x;

    @Override
    protected boolean c(int n) {
        return IStreamInvoker.c((a5f_0)MCInvoker.a((Minecraft)this.n))[n].serverUrl.equals(this.n.gameSettings.H);
    }

    @Override
    protected int f() {
        return IStreamInvoker.c(MCInvoker.a(this.n)).length;
    }

    public a8n_0(RJ rJ, Minecraft minecraft) {
        this.x = rJ;
        super(minecraft, rJ.n, rJ.f, 32, rJ.f - 35, (int)((double)FontRendererInvoker.d(minecraft.fontRendererObj) * 3.5));
        this.a(false);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        IngestServer ingestServer = IStreamInvoker.c(MCInvoker.a(this.n))[n];
        String string = StringInvoker.a(ingestServer.serverUrl, axt_0.c, axt_0.g);
        String string2 = aL0.a(aL0.c(new StringBuilder(), (int)ingestServer.bitrateKbps), axt_0.j).toString();
        String string3 = null;
        aR3 aR32 = IStreamInvoker.q(MCInvoker.a(this.n));
        if (ingestServer == iw_1.d(aR32)) {
            string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), string).toString();
            string2 = aL0.a(aL0.c(new StringBuilder(), (int)(iw_1.b(aR32) * 100.0f)), axt_0.e).toString();
        } else if (n < iw_1.a(aR32)) {
            if (ingestServer.bitrateKbps == 0.0f) {
                string2 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), axt_0.d).toString();
            }
        } else {
            string2 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.OBFUSCATED), axt_0.i), (Object)anw_0.RESET), axt_0.b).toString();
        }
        n2 -= 15;
        if (this.c(n)) {
            string3 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BLUE), axt_0.h).toString();
        } else if (ingestServer.defaultServer) {
            string3 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GREEN), axt_0.a).toString();
        }
        wa_0.a(this.x, RJ.d(this.x), ingestServer.serverName, n2 + 2, n3 + 5, 0xFFFFFF);
        wa_0.a(this.x, RJ.g(this.x), string, n2 + 2, n3 + FontRendererInvoker.d(RJ.b(this.x)) + 5 + 3, 0x303030);
        wa_0.a(this.x, RJ.a(this.x), string2, this.h() - 5 - FontRendererInvoker.a(RJ.f(this.x), string2), n3 + 5, 0x808080);
        wa_0.a(this.x, RJ.c(this.x), string3, this.h() - 5 - FontRendererInvoker.a(RJ.e(this.x), string3), n3 + 5 + 3 + FontRendererInvoker.d(RJ.h(this.x)), 0x808080);
    }

    @Override
    protected int h() {
        return super.h() + 15;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.n.gameSettings.H = IStreamInvoker.c((a5f_0)MCInvoker.a((Minecraft)this.n))[n].serverUrl;
        awu_1.c(this.n.gameSettings);
    }
}

