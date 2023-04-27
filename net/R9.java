/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.network.packts.C17PacketCustomPayload;
import java.io.IOException;
import java.util.ArrayList;

public class R9
extends GuiContainer {
    private IChatComponent aj;
    private a7K ai;
    private int al;
    private qq_0 am;
    private static ResourceLocation an = new ResourceLocation(B4.c);
    private qq_0 ak;

    public R9(aSK aSK2, a7K a7K2, World world) {
        super(new aax_1(aSK2, a7K2, world));
        this.ai = a7K2;
        this.aj = ze_1.b(a7K2);
    }

    @Override
    protected void b(int n, int n2) {
        String string = aBO.d(this.aj);
        FontRendererInvoker.a(this.q, string, this.L / 2 - FontRendererInvoker.a(this.q, string) / 2, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, I18n.format(B4.b, new Object[0]), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        F8 f8 = ze_1.b(this.ai, this.t.player);
        if (!f8.isEmpty()) {
            int n3 = (this.n - this.L) / 2;
            int n4 = (this.f - this.Y) / 2;
            int n5 = this.al;
            ahh_0 ahh_02 = (ahh_0)f8.get(n5);
            ItemStack itemStack = aEU.e(ahh_02);
            ItemStack itemStack2 = aEU.f(ahh_02);
            ItemStack itemStack3 = aEU.g(ahh_02);
            GlStateManagerInvoker.pushMatrix();
            ne_0.f();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.D();
            this.i.e = 100.0f;
            DU.b(this.i, itemStack, n3 + 36, n4 + 24);
            DU.a(this.i, this.q, itemStack, n3 + 36, n4 + 24);
            DU.b(this.i, itemStack2, n3 + 62, n4 + 24);
            DU.a(this.i, this.q, itemStack2, n3 + 62, n4 + 24);
            DU.b(this.i, itemStack3, n3 + 120, n4 + 24);
            DU.a(this.i, this.q, itemStack3, n3 + 120, n4 + 24);
            this.i.e = 0.0f;
            GlStateManagerInvoker.disableLighting();
            if (this.a(36, 24, 16, 16, n, n2)) {
                this.a(itemStack, n, n2);
            } else if (this.a(62, 24, 16, 16, n, n2)) {
                this.a(itemStack2, n, n2);
            } else if (this.a(120, 24, 16, 16, n, n2)) {
                this.a(itemStack3, n, n2);
            } else if (aEU.c(ahh_02) && (this.a(83, 21, 28, 21, n, n2) || this.a(83, 51, 28, 21, n, n2))) {
                this.a(I18n.format(B4.a, new Object[0]), n, n2);
            }
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.enableDepth();
            ne_0.a();
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        Object object;
        if (qG == this.am) {
            ++this.al;
            object = ze_1.b(this.ai, this.t.player);
            if (this.al >= ((ArrayList)object).size()) {
                this.al = ((ArrayList)object).size() - 1;
            }
        } else if (qG == this.ak) {
            --this.al;
            if (this.al < 0) {
                this.al = 0;
            }
        }
        amk_1.a((aax_1)this.F, this.al);
        object = new PacketBuffer(FH.d());
        PacketBufferInvoker.e((PacketBuffer)((Object)object), this.al);
        aDM.a(MCInvoker.aa(this.t), new C17PacketCustomPayload(B4.d, (PacketBuffer)((Object)object)));
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), an);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        F8 f8 = ze_1.b(this.ai, this.t.player);
        if (!f8.isEmpty()) {
            int n5 = this.al;
            if (n5 >= f8.size()) {
                return;
            }
            ahh_0 ahh_02 = (ahh_0)f8.get(n5);
            if (aEU.c(ahh_02)) {
                TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), an);
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManagerInvoker.disableLighting();
                this.c(this.P + 83, this.A + 21, 212, 0, 28, 21);
                this.c(this.P + 83, this.A + 51, 212, 0, 28, 21);
            }
        }
    }

    @Override
    public void l() {
        super.l();
        int n = (this.n - this.L) / 2;
        int n2 = (this.f - this.Y) / 2;
        this.am = new qq_0(1, n + 120 + 27, n2 + 24 - 1, true);
        ListInvoker.add(this.l, this.am);
        this.ak = new qq_0(2, n + 36 - 19, n2 + 24 - 1, false);
        ListInvoker.add(this.l, this.ak);
        this.am.g = false;
        this.ak.g = false;
    }

    public a7K a() {
        return this.ai;
    }

    @Override
    public void g() {
        super.g();
        F8 f8 = ze_1.b(this.ai, this.t.player);
        this.am.g = this.al < f8.size() - 1;
        this.ak.g = this.al > 0;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static ResourceLocation b() {
        return an;
    }
}

