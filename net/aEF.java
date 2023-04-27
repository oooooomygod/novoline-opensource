/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EntityLivingBase;
import deobf.EnumFacing;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.NBTBase;
import java.util.UUID;
import net.minecraft.client.Minecraft;

public class aEF
implements KB {
    private static String[] b;
    private rr_1 c;

    public static String[] b() {
        return b;
    }

    @Override
    public boolean a() {
        return true;
    }

    public aEF(rr_1 rr_12) {
        this.c = rr_12;
    }

    static {
        if (aEF.b() != null) {
            aEF.b(new String[4]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        aEF.b();
        ItemStack itemStack = atn_0.b(entityLivingBase, 3);
        if (itemStack != null && act_2.k(itemStack) != null) {
            float f8;
            Item item = act_2.k(itemStack);
            Minecraft minecraft = MCInvoker.f();
            GlStateManagerInvoker.pushMatrix();
            if (atn_0.s(entityLivingBase)) {
                GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
            }
            boolean bl = entityLivingBase instanceof nz_0 || entityLivingBase instanceof n0_0 && aKN.b((n0_0)entityLivingBase);
            up_0.a(this.c.q, 0.0625f);
            up_0.a(this.c.r, 0.0625f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (item instanceof ItemBlock) {
                f8 = 0.625f;
                GlStateManagerInvoker.translate(0.0f, -0.25f, 0.0f);
                GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
                GlStateManagerInvoker.c(f8, -f8, -f8);
                GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
                aq__0.a(MCInvoker.S(minecraft), entityLivingBase, itemStack, go_0.HEAD);
            }
            if (item == Items.skull) {
                f8 = 1.1875f;
                GlStateManagerInvoker.c(f8, -f8, -f8);
                GlStateManagerInvoker.translate(0.0f, 0.0625f, 0.0f);
                GameProfile gameProfile = null;
                if (act_2.b(itemStack)) {
                    NBTTagCompound nBTTagCompound = act_2.a(itemStack);
                    if (tn_0.a(nBTTagCompound, uo_2.a, 10)) {
                        gameProfile = S1.a(tn_0.d(nBTTagCompound, uo_2.b));
                    } else if (tn_0.a(nBTTagCompound, uo_2.d, 8)) {
                        gameProfile = gk_0.a(new GameProfile((UUID)null, tn_0.m(nBTTagCompound, uo_2.c)));
                        tn_0.a(nBTTagCompound, uo_2.e, (NBTBase)S1.a(new NBTTagCompound(), gameProfile));
                    }
                }
                agh_0.a(ez_2.i, -0.5f, 0.0f, -0.5f, EnumFacing.UP, 180.0f, act_2.c(itemStack), gameProfile, -1);
            }
            GlStateManagerInvoker.popMatrix();
        }
    }
}

