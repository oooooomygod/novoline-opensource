/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package deobf;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.Minecraft;
import net.ChatComponentText;
import net.E8;
import net.I18n;
import net.P8;
import net.QG;
import net.ServerData;
import net.TX;
import net.aBx;
import net.aL0;
import net.akt_0;
import net.ayp_2;
import net.ds_2;
import net.ee_0;
import net.fo_0;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;

public class GuiConnecting
extends GuiScreen {
    private NetworkManager v;
    private static HashMap<String, Integer> y;
    private static AtomicInteger w;
    private boolean x;
    private static Logger A;
    private GuiScreen z;

    static Minecraft b(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    private boolean a(String string, String string2, int n) {
        int n2;
        int n3;
        byte[] byArray;
        byte[] byArray2;
        try {
            byArray2 = akt_0.a(akt_0.a(string));
            byArray = akt_0.a(akt_0.a(string2));
            if (byArray2.length != byArray.length) {
                return false;
            }
            n3 = 0;
        }
        catch (Throwable throwable) {
            return false;
        }
        for (n2 = n; n2 >= 8; n2 -= 8) {
            if (byArray2[n3] != byArray[n3]) {
                return false;
            }
            ++n3;
        }
        int n4 = 65280 >> n2 & 0xFF;
        return (byArray2[n3] & n4) == (byArray[n3] & n4);
    }

    static Minecraft a(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    static {
        A = LogManagerInvoker.c();
        w = new AtomicInteger(0);
        y = new HashMap();
        ds_2.a(y, ayp_2.v, P8.d(23));
        ds_2.a(y, ayp_2.s, P8.d(20));
        ds_2.a(y, ayp_2.p, P8.d(22));
        ds_2.a(y, ayp_2.u, P8.d(22));
        ds_2.a(y, ayp_2.b, P8.d(22));
        ds_2.a(y, ayp_2.l, P8.d(18));
        ds_2.a(y, ayp_2.k, P8.d(20));
        ds_2.a(y, ayp_2.e, P8.d(20));
        ds_2.a(y, ayp_2.t, P8.d(20));
        ds_2.a(y, ayp_2.n, P8.d(22));
        ds_2.a(y, ayp_2.a, P8.d(17));
        ds_2.a(y, ayp_2.r, P8.d(15));
        ds_2.a(y, ayp_2.q, P8.d(12));
        ds_2.a(y, ayp_2.d, P8.d(13));
        ds_2.a(y, ayp_2.i, P8.d(22));
    }

    public GuiConnecting(GuiScreen guiScreen, @NonNull Minecraft minecraft, String string, int n) {
        this.t = minecraft;
        this.z = guiScreen;
        MCInvoker.a(minecraft, null);
        this.a(string, n);
    }

    public void a(String string, int n) {
        fo_0.a(fo_0.a(), aL0.c(aL0.a(aL0.a(new StringBuilder(), string), ayp_2.h), n).toString());
        LoggerInvoker.e(A, ayp_2.g, new Object[]{string, P8.d(n)});
        new TX(this, aL0.c(aL0.a(new StringBuilder(), ayp_2.c), ee_0.a(w)).toString(), string, n).start();
    }

    static Logger a() {
        return A;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        if (this.v == null) {
            this.b(this.q, I18n.format(ayp_2.o, new Object[0]), this.n / 2, this.f / 2 - 20, 0xFFFFFF);
        } else {
            this.b(this.q, I18n.format(ayp_2.j, new Object[0]), this.n / 2, this.f / 2 - 20, 0xFFFFFF);
        }
        super.a(n, n2, f);
    }

    static Minecraft h(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    static Minecraft c(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    static boolean d(GuiConnecting guiConnecting) {
        return guiConnecting.x;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static GuiScreen e(GuiConnecting guiConnecting) {
        return guiConnecting.z;
    }

    static NetworkManager a(GuiConnecting guiConnecting, NetworkManager networkManager) {
        guiConnecting.v = networkManager;
        return guiConnecting.v;
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 2, I18n.format(ayp_2.m, new Object[0])));
        super.l();
    }

    @Override
    protected void a(char c, int n) throws IOException {
    }

    static boolean a(GuiConnecting guiConnecting, String string, String string2, int n) {
        return guiConnecting.a(string, string2, n);
    }

    static NetworkManager g(GuiConnecting guiConnecting) {
        return guiConnecting.v;
    }

    @Override
    public void g() {
        if (this.v != null) {
            if (NetworkManagerInvoker.d(this.v)) {
                NetworkManagerInvoker.h(this.v);
            } else {
                NetworkManagerInvoker.a(this.v);
            }
        }
    }

    static Minecraft f(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    public GuiConnecting(GuiScreen guiScreen, @NonNull Minecraft minecraft, @NonNull ServerData serverData) {
        this.t = minecraft;
        this.z = guiScreen;
        aBx aBx2 = E8.a(serverData.k);
        MCInvoker.a(minecraft, null);
        MCInvoker.a(minecraft, serverData);
        this.a(E8.a(aBx2), E8.b(aBx2));
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 0) {
            this.x = true;
            if (this.v != null) {
                NetworkManagerInvoker.a(this.v, new ChatComponentText(ayp_2.f));
            }
            MCInvoker.displayGuiScreen(this.t, this.z);
        }
    }

    static Minecraft i(GuiConnecting guiConnecting) {
        return guiConnecting.t;
    }

    static HashMap b() {
        return y;
    }
}

