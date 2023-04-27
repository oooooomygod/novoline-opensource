/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import deobf.MCInvoker;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.sG
 */
public abstract class sg_1
implements avh_2 {
    protected Minecraft c;
    private static ResourceLocation b = new ResourceLocation(t0_0.d);
    protected RB a;
    private static IChatComponent d = new aoz_1(t0_0.e, new Object[0]);
    private static IChatComponent f;
    private static IChatComponent e;

    protected abstract String i();

    protected abstract String d();

    public sg_1(RB rB) {
        this.a = rB;
        this.c = MCInvoker.f();
    }

    protected boolean b() {
        return true;
    }

    protected abstract void f();

    protected boolean h() {
        List list = ml_1.a(this.a, this);
        int n = ListInvoker.indexOf(list, this);
        return n < ListInvoker.size(list) - 1 && ((sg_1)ListInvoker.get(list, n + 1)).b();
    }

    protected boolean g() {
        return !ml_1.b(this.a, this);
    }

    protected boolean c() {
        int n;
        List list = ml_1.a(this.a, this);
        return ((sg_1)ListInvoker.get(list, (n = ListInvoker.indexOf(list, this)) - 1)).b();
    }

    protected boolean a() {
        return ml_1.b(this.a, this);
    }

    static {
        e = new aoz_1(t0_0.h, new Object[0]);
        f = new aoz_1(t0_0.i, new Object[0]);
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    protected abstract int e();

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8;
        int n9 = this.e();
        if (n9 != 1) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GW.a(this.c.ingameGUI, n2 - 1, n3 - 1, n2 + n4 - 9, n3 + n5 + 1, -8978432);
        }
        this.f();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        wh_1.a(n2, n3, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        String string = this.i();
        String string2 = this.d();
        if (!this.c.gameSettings.Y) {
            // empty if block
        }
        if (this.b()) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.c), b);
            GW.a(this.c.ingameGUI, n2, n3, n2 + 32, n3 + 32, -1601138544);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            n8 = n6 - n2;
            int n10 = n7 - n3;
            if (n9 < 1) {
                string = aBO.a(d);
                string2 = aBO.a(e);
            } else if (n9 > 1) {
                string = aBO.a(d);
                string2 = aBO.a(f);
            }
            if (this.g()) {
                if (n8 < 32) {
                    wh_1.a(n2, n3, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                } else {
                    wh_1.a(n2, n3, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            } else {
                if (this.a()) {
                    if (n8 < 16) {
                        wh_1.a(n2, n3, 32.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        wh_1.a(n2, n3, 32.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.c()) {
                    if (n8 < 32 && n8 > 16 && n10 < 16) {
                        wh_1.a(n2, n3, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        wh_1.a(n2, n3, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
                if (this.h()) {
                    if (n8 < 32 && n8 > 16 && n10 > 16) {
                        wh_1.a(n2, n3, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                    } else {
                        wh_1.a(n2, n3, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                    }
                }
            }
        }
        if ((n8 = FontRendererInvoker.a(this.c.fontRendererObj, string)) > 157) {
            string = aL0.a(aL0.a(new StringBuilder(), FontRendererInvoker.a(this.c.fontRendererObj, string, 157 - FontRendererInvoker.a(this.c.fontRendererObj, t0_0.c))), t0_0.b).toString();
        }
        FontRendererInvoker.drawStringWithShadow(this.c.fontRendererObj, string, n2 + 32 + 2, n3 + 1, 0xFFFFFF);
        List list = FontRendererInvoker.b(this.c.fontRendererObj, string2, 157);
        for (int i = 0; i < ListInvoker.size(list); ++i) {
            FontRendererInvoker.drawStringWithShadow(this.c.fontRendererObj, (String)ListInvoker.get(list, i), n2 + 32 + 2, n3 + 12 + 10 * i, 0x808080);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        if (this.b() && n5 <= 32) {
            if (this.g()) {
                ml_1.b(this.a);
                int n7 = this.e();
                if (n7 != 1) {
                    String string = I18n.format(t0_0.g, new Object[0]);
                    String string2 = I18n.format(aL0.a(aL0.a(new StringBuilder(), t0_0.f), n7 > 1 ? t0_0.j : t0_0.a).toString(), new Object[0]);
                    MCInvoker.displayGuiScreen(this.c, new GuiYesNo(new tr_0(this), string, string2, 0));
                } else {
                    ListInvoker.remove(ml_1.a(this.a, this), this);
                    ListInvoker.add(ml_1.c(this.a), 0, this);
                }
                return true;
            }
            if (n5 < 16 && this.a()) {
                ListInvoker.remove(ml_1.a(this.a, this), this);
                ListInvoker.add(ml_1.a(this.a), 0, this);
                ml_1.b(this.a);
                return true;
            }
            if (n5 > 16 && n6 < 16 && this.c()) {
                List list = ml_1.a(this.a, this);
                int n8 = ListInvoker.indexOf(list, this);
                ListInvoker.remove(list, this);
                ListInvoker.add(list, n8 - 1, this);
                ml_1.b(this.a);
                return true;
            }
            if (n5 > 16 && n6 > 16 && this.h()) {
                List list = ml_1.a(this.a, this);
                int n9 = ListInvoker.indexOf(list, this);
                ListInvoker.remove(list, this);
                ListInvoker.add(list, n9 + 1, this);
                ml_1.b(this.a);
                return true;
            }
        }
        return false;
    }
}

