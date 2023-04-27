/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.NetHandlerPlayClient;
import net.minecraft.network.packts.C12PacketUpdateSign;
import java.io.IOException;

public class RT
extends GuiScreen {
    private int v;
    private a6z_0 x;
    private int y;
    private QG w;

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        KeyboardInvoker.a(true);
        this.w = new QG(0, this.n / 2 - 100, this.f / 4 + 120, I18n.format(SP.a, new Object[0]));
        ListInvoker.add(this.l, this.w);
        aIE.a(this.x, false);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void g() {
        ++this.v;
    }

    public RT(a6z_0 a6z_02) {
        this.x = a6z_02;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (n == 200) {
            this.y = this.y - 1 & 3;
        }
        if (n == 208 || n == 28 || n == 156) {
            this.y = this.y + 1 & 3;
        }
        String string = aBO.d(this.x.i[this.y]);
        if (n == 14 && !StringInvoker.g(string)) {
            string = StringInvoker.b(string, 0, StringInvoker.c(string) - 1);
        }
        if (KF.a(c) && FontRendererInvoker.a(this.q, aL0.a(aL0.a(new StringBuilder(), string), c).toString()) <= 90) {
            string = aL0.a(aL0.a(new StringBuilder(), string), c).toString();
        }
        this.x.i[this.y] = new ChatComponentText(string);
        if (n == 1) {
            this.a(this.w);
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g && qG.m == 0) {
            aIE.e(this.x);
            MCInvoker.displayGuiScreen(this.t, null);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(SP.b, new Object[0]), this.n / 2, 40, 0xFFFFFF);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(this.n / 2, 0.0f, 50.0f);
        float f2 = 93.75f;
        GlStateManagerInvoker.c(-f2, -f2, -f2);
        GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
        Block block = aIE.g(this.x);
        if (block == Blocks.bp) {
            float f3 = (float)(aIE.b(this.x) * 360) / 16.0f;
            GlStateManagerInvoker.b(f3, 0.0f, 1.0f, 0.0f);
        } else {
            int n3 = aIE.b(this.x);
            float f4 = 0.0f;
            if (n3 == 2) {
                f4 = 180.0f;
            }
            if (n3 == 4) {
                f4 = 90.0f;
            }
            if (n3 == 5) {
                f4 = -90.0f;
            }
            GlStateManagerInvoker.b(f4, 0.0f, 1.0f, 0.0f);
        }
        GlStateManagerInvoker.translate(0.0f, -1.0625f, 0.0f);
        if (this.v / 6 % 2 == 0) {
            this.x.j = this.y;
        }
        aFR.a(hq_0.d, this.x, -0.5, -0.75, -0.5, 0.0f);
        this.x.j = -1;
        GlStateManagerInvoker.popMatrix();
        super.a(n, n2, f);
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
        NetHandlerPlayClient netHandlerPlayClient = MCInvoker.aa(this.t);
        aDM.a(netHandlerPlayClient, new C12PacketUpdateSign(aIE.c(this.x), this.x.i));
        aIE.a(this.x, true);
    }
}

