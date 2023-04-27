/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.ChestStealer;
import net.GuiContainer;
import net.ResourceLocation;
import net.a06;
import net.aBO;
import net.aaz_0;
import net.apw_0;
import net.rs_1;
import net.ty_2;

public class R_
extends GuiContainer {
    public rs_1 al;
    private int ak;
    private static ResourceLocation aj = new ResourceLocation(a06.a);
    private rs_1 ai;

    @Override
    protected void a(float f, int n, int n2) {
        ChestStealer chestStealer = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        if (!ty_2.d(chestStealer)) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), aj);
            int n3 = (this.n - this.L) / 2;
            int n4 = (this.f - this.Y) / 2;
            this.c(n3, n4, 0, 0, this.L, this.ak * 18 + 17);
            this.c(n3, n4 + this.ak * 18 + 17, 0, 126, this.L, 96);
        }
    }

    @Override
    protected void b(int n, int n2) {
        ChestStealer chestStealer = (ChestStealer)ModuleInvoker.isEnable(ModuleRegistry.CHESTSTEALER);
        if (!ty_2.d(chestStealer)) {
            FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.al)), 8.0f, 6.0f, 0x404040);
            FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.ai)), 8.0f, this.Y - 96 + 2, 0x404040);
        }
    }

    public R_(rs_1 rs_12, rs_1 rs_13) {
        super(new aaz_0(rs_12, rs_13, MCInvoker.f().player));
        this.ai = rs_12;
        this.al = rs_13;
        int n = 222;
        int n2 = n - 108;
        this.ak = apw_0.c(rs_13) / 9;
        this.Y = n2 + this.ak * 18;
    }
}

