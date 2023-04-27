/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.GuiContainer;
import net.ResourceLocation;
import net.aBO;
import net.aRZ;
import net.aSK;
import net.aan_0;
import net.ano_0;
import net.apw_0;
import net.rs_1;

public class Rs
extends GuiContainer {
    private rs_1 ai;
    private static ResourceLocation ak = new ResourceLocation(ano_0.a);
    private aSK aj;

    public Rs(aSK aSK2, rs_1 rs_12) {
        super(new aan_0(aSK2, rs_12));
        this.aj = aSK2;
        this.ai = rs_12;
    }

    private int b(int n) {
        int n2 = apw_0.a(this.ai, 1);
        n2 = 200;
        return apw_0.a(this.ai, 0) * n / n2;
    }

    @Override
    protected void b(int n, int n2) {
        String string = aBO.d(apw_0.e(this.ai));
        FontRendererInvoker.a(this.q, string, this.L / 2 - FontRendererInvoker.a(this.q, string) / 2, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(InventoryInvoker.d(this.aj)), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f, int n, int n2) {
        int n3;
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ak);
        int n4 = (this.n - this.L) / 2;
        int n5 = (this.f - this.Y) / 2;
        this.c(n4, n5, 0, 0, this.L, this.Y);
        if (aRZ.a(this.ai)) {
            n3 = this.b(13);
            this.c(n4 + 56, n5 + 36 + 12 - n3, 176, 12 - n3, 14, n3 + 1);
        }
        n3 = this.a(24);
        this.c(n4 + 79, n5 + 34, 176, 14, n3 + 1, 16);
    }

    private int a(int n) {
        int n2 = apw_0.a(this.ai, 2);
        int n3 = apw_0.a(this.ai, 3);
        return n2 * n / n3;
    }
}

