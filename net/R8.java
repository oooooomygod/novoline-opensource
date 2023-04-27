/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.FontRenderer;
import deobf.GuiScreen;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;
import java.io.IOException;


public class R8
extends GuiScreen
implements a4i_0 {
    private StatFileWriter A;
    private a8Q C;
    private aiy_1 y;
    private a8I x;
    private a8g_0 w;
    protected String D = ah_1.c;
    private boolean B = true;
    protected GuiScreen v;
    private a8c z;

    static FontRenderer a(R8 r8) {
        return r8.q;
    }

    public R8(GuiScreen guiScreen, StatFileWriter statFileWriter) {
        this.v = guiScreen;
        this.A = statFileWriter;
    }

    @Override
    public void a(int n, int n2, float f) {
        if (this.B) {
            this.h();
            this.b(this.q, I18n.format(ah_1.d, new Object[0]), this.n / 2, this.f / 2, 0xFFFFFF);
            this.b(this.q, a[(int)(MCInvoker.a() / 150L % (long)a.length)], this.n / 2, this.f / 2 + FontRendererInvoker.d(this.q) * 2, 0xFFFFFF);
        } else {
            this.y.a(n, n2, f);
            this.b(this.q, this.D, this.n / 2, 20, 0xFFFFFF);
            super.a(n, n2, f);
        }
    }

    static FontRenderer i(R8 r8) {
        return r8.q;
    }

    @Override
    public boolean d() {
        return !this.B;
    }

    static FontRenderer b(R8 r8) {
        return r8.q;
    }

    @Override
    public void l() {
        this.D = I18n.format(ah_1.h, new Object[0]);
        this.B = true;
        aDM.a(MCInvoker.aa(this.t), new C16PacketClientStatus(C16PacketClientStatus$EnumState.REQUEST_STATS));
    }

    static FontRenderer n(R8 r8) {
        return r8.q;
    }

    static FontRenderer s(R8 r8) {
        return r8.q;
    }

    static FontRenderer r(R8 r8) {
        return r8.q;
    }

    @Override
    public void c() throws IOException {
        super.c();
        if (this.y != null) {
            this.y.g();
        }
    }

    static FontRenderer e(R8 r8) {
        return r8.q;
    }

    static StatFileWriter k(R8 r8) {
        return r8.A;
    }

    private void a(int n, int n2, Item item) {
        this.a(n + 1, n2 + 1);
        GlStateManagerInvoker.c();
        ne_0.f();
        DU.a(this.i, new ItemStack(item, 1, 0), n + 2, n2 + 2);
        ne_0.e();
        GlStateManagerInvoker.y();
    }

    private void c(int n, int n2, int n3, int n4) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), e);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + 18, zLevel), (float)n3 * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2 + 18, zLevel), (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2, zLevel), (float)(n3 + 18) * 0.0078125f, (float)n4 * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, zLevel), (float)n3 * 0.0078125f, (float)n4 * 0.0078125f));
        TessellatorInvoker.draw(tessellator);
    }

    public void b() {
        ListInvoker.add(this.l, new QG(0, this.n / 2 + 4, this.f - 28, 150, 20, I18n.format(ah_1.e, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 160, this.f - 52, 80, 20, I18n.format(ah_1.a, new Object[0])));
        QG qG = new QG(2, this.n / 2 - 80, this.f - 52, 80, 20, I18n.format(ah_1.g, new Object[0]));
        ListInvoker.add(this.l, qG);
        QG qG2 = new QG(3, this.n / 2, this.f - 52, 80, 20, I18n.format(ah_1.b, new Object[0]));
        ListInvoker.add(this.l, qG2);
        QG qG3 = new QG(4, this.n / 2 + 80, this.f - 52, 80, 20, I18n.format(ah_1.f, new Object[0]));
        ListInvoker.add(this.l, qG3);
        if (this.C.f() == 0) {
            qG.g = false;
        }
        if (this.x.f() == 0) {
            qG2.g = false;
        }
        if (this.z.f() == 0) {
            qG3.g = false;
        }
    }

    static FontRenderer q(R8 r8) {
        return r8.q;
    }

    static FontRenderer m(R8 r8) {
        return r8.q;
    }

    static FontRenderer o(R8 r8) {
        return r8.q;
    }

    private void a(int n, int n2) {
        this.c(n, n2, 0, 0);
    }

    static void a(R8 r8, int n, int n2, int n3, int n4) {
        r8.c(n, n2, n3, n4);
    }

    static FontRenderer d(R8 r8) {
        return r8.q;
    }

    static void b(R8 r8, int n, int n2, int n3, int n4, int n5, int n6) {
        r8.b(n, n2, n3, n4, n5, n6);
    }

    static FontRenderer h(R8 r8) {
        return r8.q;
    }

    static FontRenderer g(R8 r8) {
        return r8.q;
    }

    static FontRenderer l(R8 r8) {
        return r8.q;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a() {
        if (this.B) {
            this.d();
            this.b();
            this.y = this.w;
            this.B = false;
        }
    }

    static void a(R8 r8, int n, int n2, int n3, int n4, int n5, int n6) {
        r8.b(n, n2, n3, n4, n5, n6);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 0) {
                MCInvoker.displayGuiScreen(this.t, this.v);
            } else if (qG.m == 1) {
                this.y = this.w;
            } else if (qG.m == 3) {
                this.y = this.x;
            } else if (qG.m == 2) {
                this.y = this.C;
            } else if (qG.m == 4) {
                this.y = this.z;
            } else {
                this.y.a(qG);
            }
        }
    }

    static void a(R8 r8, int n, int n2, Item item) {
        r8.a(n, n2, item);
    }

    static FontRenderer p(R8 r8) {
        return r8.q;
    }

    static FontRenderer c(R8 r8) {
        return r8.q;
    }

    static FontRenderer j(R8 r8) {
        return r8.q;
    }

    static FontRenderer f(R8 r8) {
        return r8.q;
    }

    public void d() {
        this.w = new a8g_0(this, this.t);
        this.w.c(1, 1);
        this.x = new a8I(this, this.t);
        this.x.c(1, 1);
        this.C = new a8Q(this, this.t);
        this.C.c(1, 1);
        this.z = new a8c(this, this.t);
        this.z.c(1, 1);
    }
}

