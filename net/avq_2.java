/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.avq
 */
public class avq_2
implements KB<nm_0> {
    private kl_2 a;

    public avq_2(kl_2 kl_22) {
        this.a = kl_22;
    }

    @Override
    public void a(nm_0 nm_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        ItemStack itemStack = tu_0.a(nm_02);
        GlStateManagerInvoker.b(1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.pushMatrix();
        if (aky_2.a((kl_2)this.a).g) {
            GlStateManagerInvoker.translate(0.0f, 0.625f, 0.0f);
            GlStateManagerInvoker.b(-20.0f, -1.0f, 0.0f, 0.0f);
            float f8 = 0.5f;
            GlStateManagerInvoker.c(f8, f8, f8);
        }
        up_0.a(((r8_0)aky_2.a((kl_2)this.a)).h, 0.0625f);
        GlStateManagerInvoker.translate(-0.0625f, 0.53125f, 0.21875f);
        Item item = act_2.k(itemStack);
        Minecraft minecraft = MCInvoker.f();
        if (item instanceof ItemBlock && xd_0.a(MCInvoker.Y(minecraft), BlocksInvoker.a(item), act_2.c(itemStack))) {
            GlStateManagerInvoker.translate(0.0f, 0.0625f, -0.25f);
            GlStateManagerInvoker.b(30.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-5.0f, 0.0f, 1.0f, 0.0f);
            float f9 = 0.375f;
            GlStateManagerInvoker.c(f9, -f9, f9);
        } else if (item == Items.bow) {
            GlStateManagerInvoker.translate(0.0f, 0.125f, -0.125f);
            GlStateManagerInvoker.b(-45.0f, 0.0f, 1.0f, 0.0f);
            float f10 = 0.625f;
            GlStateManagerInvoker.c(f10, -f10, f10);
            GlStateManagerInvoker.b(-100.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-20.0f, 0.0f, 1.0f, 0.0f);
        } else if (px_0.d(item)) {
            if (px_0.o(item)) {
                GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
                GlStateManagerInvoker.translate(0.0f, -0.0625f, 0.0f);
            }
            aky_2.b(this.a);
            GlStateManagerInvoker.translate(0.0625f, -0.125f, 0.0f);
            float f11 = 0.625f;
            GlStateManagerInvoker.c(f11, -f11, f11);
            GlStateManagerInvoker.b(0.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(0.0f, 0.0f, 1.0f, 0.0f);
        } else {
            GlStateManagerInvoker.translate(0.1875f, 0.1875f, 0.0f);
            float f12 = 0.875f;
            GlStateManagerInvoker.c(f12, f12, f12);
            GlStateManagerInvoker.b(-20.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(-60.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-30.0f, 0.0f, 0.0f, 1.0f);
        }
        GlStateManagerInvoker.b(-15.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(40.0f, 0.0f, 0.0f, 1.0f);
        aq__0.a(MCInvoker.S(minecraft), nm_02, itemStack, go_0.THIRD_PERSON);
        GlStateManagerInvoker.popMatrix();
    }

    @Override
    public boolean a() {
        return false;
    }
}

