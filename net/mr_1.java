/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.mR
 */
public class mr_1
implements KB<EntityLivingBase> {
    private jg_1<?> a;

    public mr_1(jg_1<?> jg_12) {
        this.a = jg_12;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        ItemStack itemStack = atn_0.z(entityLivingBase);
        GlStateManagerInvoker.pushMatrix();
        if (fl_0.a(this.a).g) {
            float f8 = 0.5f;
            GlStateManagerInvoker.translate(0.0f, 0.625f, 0.0f);
            GlStateManagerInvoker.b(-20.0f, -1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.c(f8, f8, f8);
        }
        ew_0.a((ry_1)fl_0.a(this.a), 0.0625f);
        GlStateManagerInvoker.translate(-0.0625f, 0.4375f, 0.0625f);
        if (entityLivingBase instanceof EntityPlayer && ((EntityPlayer)entityLivingBase).bk != null) {
            itemStack = new ItemStack(Items.fishing_rod, 0);
        }
        Item item = act_2.k(itemStack);
        Minecraft minecraft = MCInvoker.f();
        if (item instanceof ItemBlock && BlocksInvoker.y(BlocksInvoker.a(item)) == 2) {
            GlStateManagerInvoker.translate(0.0f, 0.1875f, -0.3125f);
            GlStateManagerInvoker.b(20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(45.0f, 0.0f, 1.0f, 0.0f);
            float f9 = 0.375f;
            GlStateManagerInvoker.c(-f9, -f9, f9);
        }
        if (atn_0.s(entityLivingBase)) {
            GlStateManagerInvoker.translate(0.0f, 0.203125f, 0.0f);
        }
        aq__0.a(MCInvoker.S(minecraft), entityLivingBase, itemStack, go_0.THIRD_PERSON);
        GlStateManagerInvoker.popMatrix();
    }

    @Override
    public boolean a() {
        return false;
    }
}

