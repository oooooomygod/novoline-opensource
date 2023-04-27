/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.GuiContainer;
import net.HT;
import net.ResourceLocation;
import net.aBO;
import net.aa8_0;
import net.apw_0;
import net.avq_0;
import net.aw9_0;
import net.na_1;
import net.rs_1;

public class RY
extends GuiContainer {
    private rs_1 aj;
    private rs_1 al;
    private static ResourceLocation an = new ResourceLocation(HT.a);
    private float ai;
    private float ak;
    private na_1 am;

    @Override
    protected void b(int n, int n2) {
        FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.al)), 8.0f, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.aj)), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.ak = n;
        this.ai = n2;
        super.a(n, n2, f);
    }

    public RY(rs_1 rs_12, rs_1 rs_13, na_1 na_12) {
        super(new aa8_0(rs_12, rs_13, na_12, MCInvoker.f().player));
        this.aj = rs_12;
        this.al = rs_13;
        this.am = na_12;
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), an);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        if (avq_0.n(this.am)) {
            this.c(n3 + 79, n4 + 17, 0, this.Y, 90, 54);
        }
        if (avq_0.e(this.am)) {
            this.c(n3 + 7, n4 + 35, 0, this.Y + 54, 18, 18);
        }
        aw9_0.a(n3 + 51, n4 + 60, 17, (float)(n3 + 51) - this.ak, (float)(n4 + 75 - 50) - this.ai, this.am);
    }
}

