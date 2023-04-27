/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.utils.notifications;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NotificationManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.utils.Timer;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.utils.notifications.NotificationManager;
import deobf.TimerUtil;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class Notification {
    public double u;
    public double j;
    public String e;
    public long n;
    private TimerUtil m;
    private NotificationManager r;
    public double w;
    public double c;
    public double t;
    public String p;
    public NotificationType g;
    private double f;
    private double q;
    public double d;
    public double s;
    private Timer l = new Timer();
    FontRenderer b;
    private double o;
    public ax4_0 a;
    private FontRenderer v;
    private Minecraft k;
    public double h;
    private boolean i;

    public void b() {
        NotificationType.b();
        double d = MathInvoker.b(this.n, qh_1.a(this.m));
        double d2 = MathHelper.a(d / 1000.0, 1);
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        String string = auk_2.a((Boolean)Ba.b(cw_2.l(hUD))) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), aub_1.A), d2), aub_1.p).toString() : aub_1.g;
        String string2 = aL0.a(aL0.a(new StringBuilder(), this.p), string).toString();
        FontRenderer fontRenderer = adj_1.a(apk_2.a, 50);
        String string3 = this.k();
        int n = a7l_0.a(fontRenderer, string3) + 3;
        double d3 = this.a(aL0.a(aL0.a(new StringBuilder(), this.p), auk_2.a((Boolean)Ba.b(cw_2.l(hUD))) ? aub_1.w : aub_1.z).toString()) + n;
        double d4 = 32.0;
        double d5 = this.t - d3;
        ScaledResolution scaledResolution = new ScaledResolution(this.k);
        double d6 = ScaledResolutionInvoker.g(scaledResolution) - 42 * (ListInvoker.indexOf(NotificationManagerInvoker.a(this.r), this) + 1) - 6;
        double d7 = 2000 / MCInvoker.O(this.k);
        if (this.c > d6) {
            this.c = MathHelper.b(this.c - 0.125 * d7, d6, 999.0);
        }
        if (this.c < d6) {
            this.c = MathHelper.b(this.c + 0.125 * d7, 0.0, d6);
        }
        this.u = d5 + d3 / 2.0;
        this.s = this.c + d4 / 2.0;
        this.d = d5 - 4.0;
        this.j = this.c;
        this.h = d3 + 8.0;
        this.w = d4;
        _j_0.a(this.a, this.u, this.s, 0.05, () -> this.lambda$draw$0(hUD, fontRenderer, string3, d5, d4, n, string2, d3, d), 200L);
        if (qh_1.c(this.m, this.n) && !this.i) {
            _j_0.c(this.a);
            this.i = true;
        }
        if (qh_1.c(this.m, this.n + 400L)) {
            ListInvoker.remove(NotificationManagerInvoker.a(this.r), this);
        }
        if (ListInvoker.b() != null) {
            NotificationType.b(new ListInvoker[5]);
        }
    }

    public double g() {
        return this.n;
    }

    public Color a() {
        switch (aOR.a[this.g.ordinal()]) {
            case 1: {
                return new Color(255, 182, 0);
            }
            case 2: {
                return new Color(85, 255, 53);
            }
            case 3: {
                return new Color(255, 72, 72);
            }
        }
        return new Color(0, 120, 200);
    }

    public Notification(NotificationType notificationType, String string, String string2, long l4) {
        this.m = new TimerUtil();
        this.g = notificationType;
        this.e = string;
        this.p = string2;
        qh_1.b(this.m);
        this.n = l4;
        NotificationType.b();
        this.a = new ax4_0();
        this.k = MCInvoker.f();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (StringPropertyInvoker.isMode(cw_2.s(hUD), aub_1.u)) {
            this.b = adj_1.a(pI.a, 19);
            this.v = adj_1.a(pI.a, 22);
        }
        this.b = adj_1.a(pI.a, 22);
        this.v = adj_1.a(pI.a, 25);
        abl_1.b(this.l);
        this.u = 0.0;
    }

    public String h() {
        return this.p;
    }

    public Notification(Notification notification, NotificationManager notificationManager) {
        this(notification.g, notification.e, notification.p, notification.n);
        this.r = notificationManager;
        _j_0.a(this.a, 0.0);
    }

    public void j() {
        NotificationType.b();
        new ScaledResolution(this.k);
        double d = 42 * (ListInvoker.indexOf(NotificationManagerInvoker.a(this.r), this) + 1) - 24;
        double d2 = 2000 / MCInvoker.O(this.k);
        if (this.c > d) {
            this.c = MathHelper.b(this.c - 0.125 * d2, d, 999.0);
        }
        if (this.c < d) {
            this.c = MathHelper.b(this.c + 0.125 * d2, 0.0, d);
        }
        double d3 = 32.0;
        _j_0.a(this.a, this.t, _j_0.b(this.a) ? this.c + d3 / 2.0 : 0.0, 0.1, () -> this.lambda$drawOnePlus$1(d3), 300L);
        if (qh_1.c(this.m, this.n) && !this.i) {
            _j_0.c(this.a);
            this.i = true;
        }
        if (qh_1.c(this.m, this.n + 600L)) {
            ListInvoker.remove(NotificationManagerInvoker.a(this.r), this);
        }
    }

    private void b(String string, double d, double d2) {
        NotificationType.b();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (StringPropertyInvoker.isMode(cw_2.b(hUD), aub_1.G)) {
            a7l_0.b(this.v, string, d, d2, 0xFFFFFF, true);
        }
        FontRendererInvoker.a(this.k.fontRendererObj, string, (float)d, (float)d2, 0xFFFFFF, true);
    }

    public void e() {
        NotificationType.b();
        GL11.glPushMatrix();
        ScaledResolution scaledResolution = new ScaledResolution(this.k);
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        boolean bl = this.g == NotificationType.WARNING;
        boolean bl2 = StringPropertyInvoker.isMode(cw_2.b(hUD), aub_1.q);
        boolean bl3 = auk_2.a((Boolean)Ba.b(cw_2.l(hUD)));
        boolean bl4 = StringPropertyInvoker.isMode(cw_2.a(hUD), aub_1.v);
        FontRenderer fontRenderer = adj_1.a(DV.a, 72);
        FontRenderer fontRenderer2 = adj_1.a(ng_0.a, 20);
        FontRenderer fontRenderer3 = adj_1.a(pI.a, 20);
        String string = this.c();
        Color color = this.a();
        float[] fArray = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
        int n = bl4 ? hb_2.a(0L) : aol_1.b(aol_1.b(fArray[0], 0.55f, fArray[2]));
        double d = MathHelper.a((double)(this.n - qh_1.a(this.m)) * 0.001, 1);
        String string2 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aub_1.C), (Object)anw_0.GRAY), StringInvoker.a(StringInvoker.a(aub_1.r, new Object[]{db_0.a(d)}), (CharSequence)aub_1.B, (CharSequence)aub_1.F)), (Object)anw_0.RESET).toString();
        int n2 = bl2 ? a7l_0.a(fontRenderer2, this.p) : FontRendererInvoker.a(this.k.fontRendererCrack, this.p);
        int n3 = a7l_0.a(fontRenderer, string);
        double d2 = (double)StringInvoker.c(aL0.a(aL0.a(new StringBuilder(), this.e), string2).toString()) * 4.25;
        double d3 = MathInvoker.d(n2 + (bl3 ? 0 : 4), d2);
        double d4 = this.t - d3 - 6.0;
        double d5 = d3 + (double)n3 + 14.0;
        double d6 = d4 - (double)n3 - 8.0;
        double d7 = ScaledResolutionInvoker.g(scaledResolution) - 48 * (ListInvoker.indexOf(NotificationManagerInvoker.a(this.r), this) + 1);
        double d8 = 2000 / MCInvoker.O(this.k);
        if (this.c > d7) {
            this.c = MathHelper.b(this.c - 0.125 * d8, d7, 999.0);
            ListInvoker.b(new ListInvoker[2]);
        }
        if (this.c < d7) {
            this.c = MathHelper.b(this.c + 0.125 * d8, 0.0, d7);
        }
        double d9 = ScaledResolutionInvoker.f(scaledResolution) - d6;
        if (d > 0.0) {
            this.u = abl_1.a(this.l, 200L, d9);
        }
        if (d == 0.0) {
            abl_1.b(this.l);
        }
        this.u = d9 - abl_1.a(this.l, 200L, d9);
        GL11.glTranslated((double)(d9 - this.u), (double)0.0, (double)0.0);
        a1V.b(d6, this.c - 22.0, d6 + d5, this.c + 17.0, hb_2.a(0, 0, 0, 100));
        a1V.b(d6, this.c + 15.0, d6 + d5 / (double)this.n * (double)qh_1.a(this.m), this.c + 17.0, n);
        if (bl2) {
            a7l_0.b(fontRenderer3, aL0.a(aL0.a(new StringBuilder(), this.e), string2).toString(), (float)d4, (float)(this.c - 14.0), 0xFFFFFF, true);
            a7l_0.b(fontRenderer2, this.p, (float)d4, (float)(this.c + 1.0), hb_2.a(225, 225, 225), true);
        }
        FontRendererInvoker.a(this.k.fontRendererCrack, aL0.a(aL0.a(new StringBuilder(), this.e), string2).toString(), (float)d4, (float)(this.c - 14.0), 0xFFFFFF, true);
        FontRendererInvoker.a(this.k.fontRendererCrack, this.p, (float)d4, (float)(this.c + 1.0), hb_2.a(225, 225, 225), true);
        a7l_0.b(fontRenderer, string, d4 - 36.0 - 1.5, this.c - 16.0, n, false);
        if (this.u <= 0.0) {
            ListInvoker.remove(NotificationManagerInvoker.a(this.r), this);
        }
        GL11.glPopMatrix();
    }

    public String d() {
        return this.e;
    }

    public String k() {
        NotificationType.b();
        String string = aub_1.l;
        switch (aOR.a[this.g.ordinal()]) {
            case 4: {
                string = aub_1.y;
            }
            case 3: {
                string = aub_1.a;
            }
            case 2: {
                string = aub_1.D;
            }
            case 1: {
                string = aub_1.i;
            }
        }
        return string;
    }

    public NotificationType f() {
        return this.g;
    }

    public TimerUtil i() {
        return this.m;
    }

    private void a(String string, double d, double d2) {
        NotificationType.b();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        if (StringPropertyInvoker.isMode(cw_2.b(hUD), aub_1.x)) {
            a7l_0.b(this.b, string, d, d2, 0xFFFFFF, true);
        }
        FontRendererInvoker.a(this.k.fontRendererObj, string, (float)d, (float)d2, 0xFFFFFF, true);
    }

    private void lambda$drawOnePlus$1(double d) {
        FontRenderer fontRenderer = adj_1.a(apk_2.a, 50);
        int n = a7l_0.a(fontRenderer, this.k());
        double d2 = MathInvoker.max(150, a7l_0.a(this.b, this.p) + n + 5);
        Color color = this.a();
        aV3.a(aV3.a(), this.t - d2 / 2.0 - 6.0, this.c, d2 + 12.0, d, d - 2.0, 5.0, new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), 190), true);
        this.b(this.e, this.t - (double)(a7l_0.a(this.v, this.e) / 2), this.c + d / 2.0 - (double)a7l_0.a(this.v) - 1.0);
        a7l_0.b(fontRenderer, this.k(), this.t - d2 / 2.0, this.c + d / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), 0xFFFFFF, true);
        this.a(this.p, this.t - (double)(a7l_0.a(this.b, this.p) / 2) + (double)(n / 2) - 1.0, this.c + d - (double)a7l_0.a(this.b) - 5.0);
    }

    private int a(String string) {
        NotificationType.b();
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        return StringPropertyInvoker.isMode(cw_2.b(hUD), aub_1.o) ? a7l_0.a(this.b, string) : FontRendererInvoker.a(this.k.fontRendererObj, string);
    }

    private void lambda$draw$0(HUD hUD, FontRenderer fontRenderer, String string, double d, double d2, int n, String string2, double d3, double d4) {
        NotificationType.b();
        Color color = StringPropertyInvoker.isMode(cw_2.f(hUD), aub_1.s) ? new Color(65, 65, 65, 255) : new Color(0, 0, 0, P8.b((Integer)adt_2.a(cw_2.i(hUD))));
        aV3.a(aV3.a(), this.d, this.j, this.h, this.w, 0.0, ava_0.b(cw_2.t(hUD), aub_1.E) ? 3.0 : 0.0, color, true);
        a7l_0.b(fontRenderer, string, d, this.c + d2 / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), 0xFFFFFF, true);
        this.b(this.e, d + (double)n, this.c + 5.0);
        this.a(string2, d + (double)n, this.c + 18.5);
        double d5 = (d3 + 4.0) / (double)this.n * d4;
        if (StringPropertyInvoker.isMode(cw_2.a(hUD), aub_1.c)) {
            StringProperty stringProperty = cw_2.g(hUD);
            if (StringPropertyInvoker.isMode(stringProperty, aub_1.b)) {
                a1V.b(d + (double)(n / 2) - 1.0, this.c + d2 / 2.0 - 1.0, 11.0, 3.0f, 360, hb_2.a(0));
            }
            a1V.a(d + (double)(n / 2) - 1.0, this.c + d2 / 2.0 - 1.0, 11.0, 3.0f, 360, 12L);
            if (StringPropertyInvoker.isMode(stringProperty, aub_1.e)) {
                a1V.b(d - 4.0, this.c + d2 - 2.0, d5, 2.0, P8.b(aUL.f(cw_2.q(hUD))), P8.b(aUL.f(cw_2.p(hUD))));
            }
            if (StringPropertyInvoker.isMode(stringProperty, aub_1.f)) {
                a1V.a(d - 4.0, this.c + d2 - 2.0, d + d5, this.c + d2);
            }
            if (StringPropertyInvoker.isMode(stringProperty, aub_1.j)) {
                a1V.b(d - 4.0, this.c + d2 - 2.0, d + d5, this.c + d2, hb_2.a(0));
            }
            a1V.b(d - 4.0, this.c + d2 - 2.0, d + d5, this.c + d2, P8.b(aUL.f(cw_2.k(hUD))));
        }
        a1V.b(d + (double)(n / 2) - 1.0, this.c + d2 / 2.0 - 1.0, 11.0, 3.0f, 360, aol_1.b(this.a()));
        a1V.b(d - 4.0, this.c + d2 - 2.0, d + d5, this.c + d2, aol_1.b(this.a()));
    }

    public String c() {
        NotificationType.b();
        String string = aub_1.k;
        switch (aOR.a[this.g.ordinal()]) {
            case 4: {
                string = aub_1.n;
            }
            case 3: {
                string = aub_1.h;
            }
            case 2: {
                string = aub_1.d;
            }
            case 1: {
                string = aub_1.m;
            }
        }
        return string;
    }
}

