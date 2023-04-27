/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.inventory.Container;
import deobf.ICrafting;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.network.packts.C17PacketCustomPayload;
import java.io.IOException;
import java.util.List;

public class GuiRepair
extends GuiContainer
implements ICrafting {
    private aam_1 ai;
    private sc_0 aj;
    private static ResourceLocation ak = new ResourceLocation(aq0_0.f);
    private aSK al;

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        this.aj.a(n, n2, n3);
    }

    @Override
    public void a(Container container, rs_1 rs_12) {
    }

    @Override
    public void i() {
        super.i();
        KeyboardInvoker.a(false);
        afy_2.b(this.F, this);
    }

    @Override
    public void a(Container container, int n, ItemStack itemStack) {
        hc_1.b(this.aj, aq0_0.g);
        hc_1.d(this.aj, true);
        this.b();
    }

    @Override
    public void a(Container container, int n, int n2) {
    }

    @Override
    public void a(int n, int n2, float f) {
        super.a(n, n2, f);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableBlend();
        hc_1.d(this.aj);
    }

    public GuiRepair(aSK aSK2, World world) {
        super(new aam_1(aSK2, world, MCInvoker.f().player));
        this.al = aSK2;
        this.ai = (aam_1)this.F;
    }

    private void b() {
        String string = hc_1.a(this.aj);
        Slot slot = YA.a(this.ai, 0);
        if (ItemStackInvoker.e(slot) && !act_2.g(ItemStackInvoker.a(slot)) && string.equals(act_2.w(ItemStackInvoker.a(slot)))) {
            string = aq0_0.b;
        }
        YA.a(this.ai, string);
        aDM.a(this.t.player.connection, new C17PacketCustomPayload(aq0_0.d, PacketBufferInvoker.a(new PacketBuffer(FH.d()), string)));
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ak);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
        this.c(n3 + 59, n4 + 20, 0, this.Y + (ItemStackInvoker.e(YA.a(this.ai, 0)) ? 0 : 16), 110, 16);
        if ((ItemStackInvoker.e(YA.a(this.ai, 0)) || ItemStackInvoker.e(YA.a(this.ai, 1))) && !ItemStackInvoker.e(YA.a(this.ai, 2))) {
            this.c(n3 + 99, n4 + 45, this.L, 0, 28, 21);
        }
    }

    @Override
    public void l() {
        super.l();
        KeyboardInvoker.a(true);
        int n = (this.n - this.L) / 2;
        int n2 = (this.f - this.Y) / 2;
        this.aj = new sc_0(0, this.q, n + 62, n2 + 24, 103, 12);
        hc_1.c(this.aj, -1);
        hc_1.d(this.aj, -1);
        hc_1.e(this.aj, false);
        hc_1.a(this.aj, 30);
        afy_2.b(this.F, this);
        afy_2.a(this.F, this);
    }

    @Override
    public void a(Container container, List<ItemStack> list) {
        this.a(container, 0, ItemStackInvoker.a(afy_2.a(container, 0)));
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (hc_1.a(this.aj, c, n)) {
            this.b();
        } else {
            super.a(c, n);
        }
    }

    @Override
    protected void b(int n, int n2) {
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableBlend();
        FontRendererInvoker.a(this.q, I18n.format(aq0_0.c, new Object[0]), 60.0f, 6.0f, 0x404040);
        if (this.ai.q > 0) {
            int n3 = 8453920;
            String string = I18n.format(aq0_0.a, new Object[]{P8.d(this.ai.q)});
            if (this.ai.q >= 40 && !aSY.a(this.t.player.abilities)) {
                string = I18n.format(aq0_0.e, new Object[0]);
                n3 = 0xFF6060;
            } else if (ItemStackInvoker.e(YA.a(this.ai, 2)) && !ItemStackInvoker.a(YA.a(this.ai, 2), this.al.f)) {
                n3 = 0xFF6060;
            }
            int n4 = 0xFF000000 | (n3 & 0xFCFCFC) >> 2 | n3 & 0xFF000000;
            int n5 = this.L - 8 - FontRendererInvoker.a(this.q, string);
            int n6 = 67;
            if (FontRendererInvoker.b(this.q)) {
                this.a(n5 - 3, n6 - 2, this.L - 7, n6 + 10, -16777216);
                this.a(n5 - 2, n6 - 1, this.L - 8, n6 + 9, -12895429);
            } else {
                FontRendererInvoker.a(this.q, string, n5, n6 + 1, n4);
                FontRendererInvoker.a(this.q, string, n5 + 1, n6, n4);
                FontRendererInvoker.a(this.q, string, n5 + 1, n6 + 1, n4);
            }
            FontRendererInvoker.a(this.q, string, n5, n6, n3);
        }
        GlStateManagerInvoker.D();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

