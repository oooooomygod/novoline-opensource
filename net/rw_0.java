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
import net.a9u_0;
import net.aBO;
import net.aSK;
import net.aat_1;
import net.apw_0;
import net.rs_1;

/*
 * Renamed from net.Rw
 */
public class rw_0
extends GuiContainer {
    private aSK ak;
    private static ResourceLocation aj = new ResourceLocation(a9u_0.a);
    public rs_1 ai;

    public rw_0(aSK aSK2, rs_1 rs_12) {
        super(new aat_1(aSK2, rs_12));
        this.ak = aSK2;
        this.ai = rs_12;
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), aj);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
    }

    @Override
    protected void b(int n, int n2) {
        String string = aBO.d(apw_0.e(this.ai));
        FontRendererInvoker.a(this.q, string, this.L / 2 - FontRendererInvoker.a(this.q, string) / 2, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(InventoryInvoker.d(this.ak)), 8.0f, this.Y - 96 + 2, 0x404040);
    }
}

