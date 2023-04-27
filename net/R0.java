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
import net.aSK;
import net.aae_1;
import net.adi_1;
import net.apw_0;
import net.rs_1;

public class R0
extends GuiContainer {
    private static ResourceLocation ai = new ResourceLocation(adi_1.a);
    private rs_1 ak;
    private aSK aj;

    @Override
    protected void b(int n, int n2) {
        String string = aBO.d(apw_0.e(this.ak));
        FontRendererInvoker.a(this.q, string, this.L / 2 - FontRendererInvoker.a(this.q, string) / 2, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(InventoryInvoker.d(this.aj)), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    public R0(aSK aSK2, rs_1 rs_12) {
        super(new aae_1(aSK2, rs_12));
        this.aj = aSK2;
        this.ak = rs_12;
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ai);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        int n5 = apw_0.a(this.ak, 0);
        int n6 = (int)(28.0f * (1.0f - (float)n5 / 400.0f));
        this.c(n3 + 97, n4 + 16, 176, 0, 9, n6);
        int n7 = n5 / 2 % 7;
        switch (n7) {
            case 0: {
                n6 = 29;
                break;
            }
            case 1: {
                n6 = 24;
                break;
            }
            case 2: {
                n6 = 20;
                break;
            }
            case 3: {
                n6 = 16;
                break;
            }
            case 4: {
                n6 = 11;
                break;
            }
            case 5: {
                n6 = 6;
                break;
            }
            case 6: {
                n6 = 0;
            }
        }
        this.c(n3 + 65, n4 + 14 + 29 - n6, 185, 29 - n6, 12, n6);
    }
}

