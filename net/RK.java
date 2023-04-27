/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.inventory.Container;
import deobf.MCInvoker;
import java.util.Collection;
import java.util.Iterator;

public abstract class RK
extends GuiContainer {
    private boolean ai;

    protected void b() {
        this.P = (this.n - this.L) / 2;
        this.ai = false;
    }

    @Override
    public void l() {
        super.l();
        this.b();
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        this.d();
    }

    public static void a(int n, int n2) {
        int n3 = n - 124;
        int n4 = n2;
        Collection collection = PlayerInvoker.E(MCInvoker.f().player);
        if (!ms_0.c(collection)) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableLighting();
            int n5 = 33;
            if (ms_0.d(collection) > 5) {
                n5 = 132 / (ms_0.d(collection) - 1);
            }
            Iterator iterator = ms_0.a(PlayerInvoker.E(MCInvoker.f().player));
            while (dz_0.c(iterator)) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                Potion potion = Potion.potionTypes[a3M.b(a2l_02)];
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), ae);
                Gui.a(n3, n4, 0, 166, 140, 32);
                if (ari_0.e(potion)) {
                    int n6 = ari_0.i(potion);
                    Gui.a(n3 + 6, n4 + 7, n6 % 8 * 18, 198 + n6 / 8 * 18, 18, 18);
                }
                String string = I18n.format(ari_0.d(potion), new Object[0]);
                if (a3M.g(a2l_02) == 1) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.f), I18n.format(aDg.l, new Object[0])).toString();
                } else if (a3M.g(a2l_02) == 2) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.d), I18n.format(aDg.j, new Object[0])).toString();
                } else if (a3M.g(a2l_02) == 3) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.a), I18n.format(aDg.h, new Object[0])).toString();
                }
                FontRendererInvoker.drawStringWithShadow(MCInvoker.f().fontRendererObj, string, n3 + 10 + 18, n4 + 6, 0xFFFFFF);
                String string2 = ari_0.a(a2l_02);
                FontRendererInvoker.drawStringWithShadow(MCInvoker.f().fontRendererObj, string2, n3 + 10 + 18, n4 + 6 + 10, 0x7F7F7F);
                n4 += n5;
            }
        }
    }

    public RK(Container container) {
        super(container);
    }

    private void d() {
        int n = this.P - 124;
        int n2 = this.A;
        Collection collection = PlayerInvoker.E(this.t.player);
        if (!ms_0.c(collection)) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableLighting();
            int n3 = 33;
            if (ms_0.d(collection) > 5) {
                n3 = 132 / (ms_0.d(collection) - 1);
            }
            Iterator iterator = ms_0.a(PlayerInvoker.E(this.t.player));
            while (dz_0.c(iterator)) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                Potion potion = Potion.potionTypes[a3M.b(a2l_02)];
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ae);
                this.c(n, n2, 0, 166, 140, 32);
                if (ari_0.e(potion)) {
                    int n4 = ari_0.i(potion);
                    this.c(n + 6, n2 + 7, n4 % 8 * 18, 198 + n4 / 8 * 18, 18, 18);
                }
                String string = I18n.format(ari_0.d(potion), new Object[0]);
                if (a3M.g(a2l_02) == 1) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.g), I18n.format(aDg.i, new Object[0])).toString();
                } else if (a3M.g(a2l_02) == 2) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.c), I18n.format(aDg.k, new Object[0])).toString();
                } else if (a3M.g(a2l_02) == 3) {
                    string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aDg.e), I18n.format(aDg.b, new Object[0])).toString();
                }
                FontRendererInvoker.drawStringWithShadow(this.q, string, n + 10 + 18, n2 + 6, 0xFFFFFF);
                String string2 = ari_0.a(a2l_02);
                FontRendererInvoker.drawStringWithShadow(this.q, string2, n + 10 + 18, n2 + 6 + 10, 0x7F7F7F);
                n2 += n3;
            }
        }
    }
}

