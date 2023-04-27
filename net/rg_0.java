/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.GuiConnecting;
import deobf.GuiScreen;
import deobf.IChatComponent;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import net.skidunion.Protection;

/*
 * Renamed from net.Rg
 */
public class rg_0
extends GuiScreen {
    private List<String> D;
    private QG A;
    private GuiScreen y;
    private String C;
    private aky_0 z = new aky_0();
    private ServerData w;
    private QG v;
    private IChatComponent x;
    private int B;

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        int n4 = ua_2.a(n);
        int n5 = ua_2.b(n2);
        avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), n4, n5, n3);
        super.b(n, n2, n3);
    }

    @Override
    protected void a(int n, int n2, int n3) {
        int n4 = ua_2.a(n);
        int n5 = ua_2.b(n2);
        avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), n4, n5);
    }

    @Override
    protected void a(QG qG) throws IOException {
        Novoline novoline = MCInvoker.z(this.t);
        AltRepositoryGUI altRepositoryGUI = NovolineInvoker.z(novoline);
        switch (qG.m) {
            case 0: {
                MCInvoker.displayGuiScreen(this.t, this.y);
                break;
            }
            case 1: {
                this.d();
                break;
            }
            case 2: {
                if (zd_2.c(altRepositoryGUI) == null) break;
                zd_2.a(altRepositoryGUI, zd_2.c(altRepositoryGUI));
                break;
            }
            case 3: {
                zd_2.a(altRepositoryGUI);
                NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(NovolineInvoker.getInstance()), hd_2.h, NotificationType.ERROR);
                return;
            }
        }
    }

    public List<String> a() {
        return this.D;
    }

    @Override
    public void l() {
        block9: {
            ClickGui cfr_ignored_0 = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
            Novoline novoline = NovolineInvoker.getInstance();
            ListInvoker.clear(NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(novoline)));
            ListInvoker.clear(this.l);
            this.D = FontRendererInvoker.b(this.q, aBO.a(this.x), this.n - 50);
            this.B = ListInvoker.size(this.D) * FontRendererInvoker.d(this.q);
            int n = this.n / 2 - 100;
            int n2 = this.f / 2 + this.B / 2 + FontRendererInvoker.d(this.q);
            ListInvoker.add(this.l, new QG(0, n, n2, I18n.format(hd_2.u, new Object[0])));
            this.v = new QG(1, n, n2 + 25, hd_2.t);
            ListInvoker.add(this.l, this.v);
            this.w = NovolineInvoker.k(MCInvoker.z(this.t));
            this.v.g = this.w != null;
            String string = (String)ListInvoker.get(this.D, 0);
            if (StringInvoker.e(string, hd_2.f)) {
                String[] stringArray;
                String[] stringArray2 = StringInvoker.g(string, hd_2.m);
                if (stringArray2.length > 1 && (stringArray = StringInvoker.g(stringArray2[1], hd_2.k)).length > 1) {
                    long l4;
                    block10: {
                        String string2 = StringInvoker.a(stringArray[1], hd_2.l, hd_2.y);
                        String string3 = StringInvoker.a(StringInvoker.a(StringInvoker.a(string2, (CharSequence)hd_2.r, (CharSequence)hd_2.q), (CharSequence)hd_2.x, (CharSequence)hd_2.v), (CharSequence)hd_2.n, (CharSequence)hd_2.j);
                        String[] stringArray3 = StringInvoker.g(string3, hd_2.e);
                        String string4 = stringArray3[0];
                        String string5 = stringArray3[1];
                        String string6 = stringArray3[2];
                        try {
                            long l5 = X8.a(TimeUnit.DAYS, P8.a(string4));
                            long l6 = X8.a(TimeUnit.HOURS, P8.a(string5));
                            long l7 = X8.a(TimeUnit.MINUTES, P8.a(string6));
                            l4 = SystemInvoker.f() + l5 + l6 + l7;
                            if (zd_2.c(NovolineInvoker.z(novoline)) == null) break block9;
                            if (at1.h(zd_2.c(NovolineInvoker.z(novoline))) != 0L) break block10;
                        }
                        catch (NumberFormatException numberFormatException) {}
                        NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(novoline), hd_2.z, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), hd_2.p), apz_1.a(at1.e(zd_2.c(NovolineInvoker.z(novoline))))), hd_2.w), string2).toString(), 3000, NotificationType.WARNING);
                    }
                    at1.a(zd_2.c(NovolineInvoker.z(novoline)), l4);
                }
            } else if (StringInvoker.e(string, hd_2.s) && zd_2.c(NovolineInvoker.z(novoline)) != null) {
                if (at1.h(zd_2.c(NovolineInvoker.z(novoline))) == 0L) {
                    NotificationManagerInvoker.a(NovolineInvoker.getNotificationManager(novoline), hd_2.b, aL0.a(aL0.a(aL0.a(new StringBuilder(), hd_2.i), apz_1.a(at1.e(zd_2.c(NovolineInvoker.z(novoline))))), hd_2.a).toString(), 3000, NotificationType.WARNING);
                }
                at1.a(zd_2.c(NovolineInvoker.z(novoline)), -1L);
            }
        }
        avf_2.f(NovolineInvoker.f(NovolineInvoker.getInstance()));
    }

    private void d() {
        MCInvoker.displayGuiScreen(this.t, new GuiConnecting(this.y, this.t, this.w));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public rg_0(GuiScreen guiScreen, String string, IChatComponent iChatComponent) {
        this.y = guiScreen;
        this.C = I18n.format(string, new Object[0]);
        this.x = iChatComponent;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.C, this.n / 2, this.f / 2 - this.B / 2 - FontRendererInvoker.d(this.q) * 2, 0xAAAAAA);
        int n3 = this.f / 2 - this.B / 2;
        if (this.D != null) {
            Iterator iterator = ListInvoker.iterator(this.D);
            while (dz_0.c(iterator)) {
                String string = (String)dz_0.b(iterator);
                this.b(this.q, string, this.n / 2, n3, 0xFFFFFF);
                n3 += FontRendererInvoker.d(this.q);
            }
        }
        int n4 = this.f / 2 + this.B / 2 + FontRendererInvoker.d(this.q);
        if (this.t.session != null && this.w != null) {
            FontRendererInvoker.a(this.q, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), hd_2.o), SessionInvoker.getUsername(this.t.session)), hd_2.g), this.w.k).toString(), this.n / 2 - FontRendererInvoker.a(this.q, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), hd_2.c), SessionInvoker.getUsername(this.t.session)), hd_2.d), this.w.k).toString()) / 2, n4 + 51, -1);
        }
        double d = ua_2.a(true);
        int n5 = ua_2.a(n);
        int n6 = ua_2.b(n2);
        avf_2.b(NovolineInvoker.f(NovolineInvoker.getInstance()), n5, n6);
        ua_2.a(d);
        super.a(n, n2, f);
    }

    private void a(boolean bl) {
        this.v.g = bl;
        this.A.g = bl;
    }

    public boolean b() {
        int n = P8.a(Protection.q);
        return n == 1 || n == 2 || n == 4 || n == 5;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), c, n);
    }
}

