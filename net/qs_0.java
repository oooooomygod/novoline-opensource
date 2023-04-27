/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.HUD;
import deobf.EnumChatVisibility;
import deobf.IChatComponent;
import deobf.ModuleRegistry;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.Qs
 */
public class qs_0
extends Gui {
    private int g;
    private List<String> i = my_0.c();
    private boolean l;
    private List<atQ> h;
    private List<atQ> f = my_0.c();
    private static Logger k = LogManagerInvoker.c();
    private Minecraft m;
    private int j;

    public void b(int n) {
        if (this.m.gameSettings.b2 != EnumChatVisibility.HIDDEN) {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            ScaledResolution scaledResolution = new ScaledResolution(this.m);
            int n7 = this.j();
            int n8 = 0;
            int n9 = ListInvoker.size(this.h);
            float f = this.m.gameSettings.I * 0.9f + 0.1f;
            if (this.i()) {
                // empty if block
            }
            if (this.g > 0) {
                float f2 = this.m.gameSettings.z == 3 ? 1.5f : 1.0f;
                double d = ScaledResolutionInvoker.i(scaledResolution) - 27 - this.g * 9 - P8.b((Integer)adt_2.a(cw_2.r(this.b())));
                n6 = this.g * 9;
                aV3.a(aV3.a(), -10.0, (double)((float)(d * (double)f2)), (double)((float)this.c() * f2 + 10.0f), (double)((float)n6 * f2), (double)((float)cw_2.o(this.b())), (double)cw_2.x(this.b()), new Color(0, 0, 0, P8.b((Integer)adt_2.a(cw_2.v(this.b())))), 1.0f);
            }
            this.g = 0;
            GlStateManagerInvoker.pushMatrix();
            for (n5 = 0; n5 + this.j < ListInvoker.size(this.h) && n5 < n7; ++n5) {
                atQ atQ2 = (atQ)ListInvoker.get(this.h, n5 + this.j);
                n4 = n - d5_0.a(atQ2);
                if (n4 >= 200) {
                    // empty if block
                }
                double d = (double)n4 / 200.0;
                d = 1.0 - d;
                d *= 10.0;
                d = MathHelper.b(d, 0.0, 1.0);
                d *= d;
                n3 = (int)(255.0 * d);
                n3 = 255;
                n3 = (int)((float)n3 * f);
                ++n8;
                if (n3 <= 3) continue;
                n2 = 0;
                double d2 = ScaledResolutionInvoker.i(scaledResolution) - 27 - n5 * 9 - P8.b((Integer)adt_2.a(cw_2.r(this.b())));
                String string = aBO.a(d5_0.b(atQ2));
                GlStateManagerInvoker.enableBlend();
                if (StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.f)) {
                    FontRendererInvoker.drawStringWithShadow(this.m.fontRendererObj, string, (float)n2 + 1.0f, (float)(d2 - 8.0), 0xFFFFFF + (n3 << 24));
                } else {
                    cw_2.b(this.b(), 18, string, n2 + 1, d2 - 8.0, 0xFFFFFF + (n3 << 24));
                }
                GlStateManagerInvoker.C();
                GlStateManagerInvoker.disableBlend();
                ++this.g;
            }
            n5 = StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.c) ? this.m.fontRendererObj.r : cw_2.a(this.b(), 18);
            GlStateManagerInvoker.translate(-3.0f, 0.0f, 0.0f);
            int n10 = n9 * n5 + n9;
            n4 = n8 * n5 + n8;
            n6 = this.j * n4 / n9;
            int n11 = n4 * n4 / n10;
            if (n10 != n4) {
                n3 = 170;
                n2 = this.l ? 0xCC3333 : 0x3333AA;
                this.a(0, -n6, 2, -n6 - n11, n2 + (n3 << 24));
                this.a(2, -n6, 1, -n6 - n11, 0xCCCCCC + (n3 << 24));
            }
            GlStateManagerInvoker.popMatrix();
        }
    }

    public void f() {
        ListInvoker.clear(this.h);
        ListInvoker.clear(this.f);
        ListInvoker.clear(this.i);
    }

    private void a(IChatComponent iChatComponent, int n, int n2, boolean bl) {
        this.a(n);
        int n3 = MathHelper.f((float)this.c() / this.d());
        List list = new ArrayList();
        list = StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.a) ? rc_0.a(iChatComponent, n3, this.m.fontRendererObj, false, false) : rc_0.a(iChatComponent, n3, cw_2.b(this.b(), 18), false, false);
        this.i();
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            IChatComponent iChatComponent2 = (IChatComponent)dz_0.b(iterator);
            if (this.j > 0) {
                this.l = true;
                this.c(1);
            }
            ListInvoker.add(this.h, 0, new atQ(n2, iChatComponent2, n));
        }
        while (ListInvoker.size(this.h) > cw_2.w(this.b())) {
            ListInvoker.remove(this.h, ListInvoker.size(this.h) - 1);
        }
        ListInvoker.add(this.f, 0, new atQ(n2, iChatComponent, n));
        while (ListInvoker.size(this.f) > cw_2.w(this.b())) {
            ListInvoker.remove(this.f, ListInvoker.size(this.f) - 1);
        }
    }

    public IChatComponent a(int n, int n2) {
        if (this.i()) {
            int n3;
            int n4;
            ScaledResolution scaledResolution = new ScaledResolution(this.m);
            int n5 = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
            float f = this.d();
            int n6 = n / n5 - 3;
            int n7 = n2 / n5 - (StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.g) ? 27 : 40) - P8.b((Integer)adt_2.a(cw_2.r(this.b())));
            n6 = MathHelper.f((float)n6 / f);
            n7 = MathHelper.f((float)n7 / f);
            int n8 = MathInvoker.b(this.j(), ListInvoker.size(this.h));
            int n9 = n4 = StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.e) ? this.m.fontRendererObj.r : cw_2.a(this.b(), 18);
            if (n6 <= MathHelper.f((float)this.c() / this.d()) && n7 < n4 * n8 + n8 && (n3 = n7 / n4 + this.j) < ListInvoker.size(this.h)) {
                atQ atQ2 = (atQ)ListInvoker.get(this.h, n3);
                int n10 = 0;
                Iterator iterator = d5_0.b(atQ2).iterator();
                while (dz_0.c(iterator)) {
                    IChatComponent iChatComponent = (IChatComponent)dz_0.b(iterator);
                    if (!(iChatComponent instanceof ChatComponentText)) continue;
                    n10 = StringPropertyInvoker.isMode(cw_2.y(this.b()), je_0.b) ? (n10 += FontRendererInvoker.a(this.m.fontRendererObj, rc_0.a(axq_2.a((ChatComponentText)iChatComponent), false))) : (n10 += a7l_0.a(cw_2.b(this.b(), 18), rc_0.a(axq_2.a((ChatComponentText)iChatComponent), false)));
                    if (n10 <= n6) continue;
                    return iChatComponent;
                }
            }
        }
        return null;
    }

    public void c(int n) {
        this.j += n;
        int n2 = ListInvoker.size(this.h);
        if (this.j > n2 - this.j()) {
            this.j = n2 - this.j();
        }
        if (this.j <= 0) {
            this.j = 0;
            this.l = false;
        }
    }

    public int e() {
        return qs_0.b(this.i() ? this.m.gameSettings.ai : this.m.gameSettings.av);
    }

    public static int a(float f) {
        int n = 320;
        int n2 = 40;
        return MathHelper.f(f * (float)(n - n2) + (float)n2);
    }

    public HUD b() {
        return NovolineInvoker.b(NovolineInvoker.getInstance()) ? null : (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
    }

    public void a(int n) {
        atQ atQ2;
        Iterator iterator = ListInvoker.iterator(this.h);
        while (dz_0.c(iterator)) {
            atQ2 = (atQ)dz_0.b(iterator);
            if (d5_0.c(atQ2) != n) continue;
            dz_0.a(iterator);
        }
        iterator = ListInvoker.iterator(this.f);
        while (dz_0.c(iterator)) {
            atQ2 = (atQ)dz_0.b(iterator);
            if (d5_0.c(atQ2) != n) continue;
            dz_0.a(iterator);
            break;
        }
    }

    public void a() {
        ListInvoker.clear(this.h);
        this.g();
        int n = ListInvoker.size(this.f) - 1;
        while (true) {
            atQ atQ2 = (atQ)ListInvoker.get(this.f, n);
            this.a(d5_0.b(atQ2), d5_0.c(atQ2), d5_0.a(atQ2), true);
            --n;
        }
    }

    public void a(IChatComponent iChatComponent, int n) {
        this.a(iChatComponent, n, GW.a(this.m.ingameGUI), false);
        LoggerInvoker.info(k, aL0.a(aL0.a(new StringBuilder(), je_0.d), aBO.d(iChatComponent)).toString());
    }

    public qs_0(Minecraft minecraft) {
        this.h = my_0.c();
        this.m = minecraft;
    }

    public void g() {
        this.j = 0;
        this.l = false;
    }

    public void a(String string) {
        if (ListInvoker.isEmpty(this.i) || !((String)ListInvoker.get(this.i, ListInvoker.size(this.i) - 1)).equals(string)) {
            ListInvoker.add(this.i, string);
        }
    }

    public static int b(float f) {
        int n = 180;
        int n2 = 20;
        return MathHelper.f(f * (float)(n - n2) + (float)n2);
    }

    public int c() {
        return qs_0.a(this.m.gameSettings.ao);
    }

    public int j() {
        return this.e() / 9;
    }

    public float d() {
        return this.m.gameSettings.af;
    }

    public List<String> h() {
        return this.i;
    }

    public void a(IChatComponent iChatComponent) {
        this.a(iChatComponent, 0);
    }

    public boolean i() {
        return this.m.currentScreen instanceof GuiChat;
    }
}

