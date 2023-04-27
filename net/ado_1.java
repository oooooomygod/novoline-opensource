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

/*
 * Renamed from net.adO
 */
public class ado_1
implements KB<EntityLivingBase> {
    private a5Y a;

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        ItemStack itemStack = atn_0.b(entityLivingBase, 3);
        if (act_2.k(itemStack) != null) {
            float f8;
            Item item = act_2.k(itemStack);
            Minecraft minecraft = MCInvoker.f();
            GlStateManagerInvoker.pushMatrix();
            if (atn_0.s(entityLivingBase)) {
                GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
            }
            boolean bl = entityLivingBase instanceof nz_0 || entityLivingBase instanceof n0_0 && aKN.b((n0_0)entityLivingBase);
            if (atn_0.u(entityLivingBase)) {
                f8 = 2.0f;
                float f9 = 1.4f;
                GlStateManagerInvoker.c(f9 / f8, f9 / f8, f9 / f8);
                GlStateManagerInvoker.translate(0.0f, 16.0f * f7, 0.0f);
            }
            up_0.a(this.a, 0.0625f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (item instanceof ItemBlock) {
                f8 = 0.625f;
                GlStateManagerInvoker.translate(0.0f, -0.25f, 0.0f);
                GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
                GlStateManagerInvoker.c(f8, -f8, -f8);
                GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
                aq__0.a(MCInvoker.S(minecraft), entityLivingBase, itemStack, go_0.HEAD);
            } else if (item == Items.skull) {
                f8 = 1.1875f;
                GlStateManagerInvoker.c(f8, -f8, -f8);
                GlStateManagerInvoker.translate(0.0f, 0.0625f, 0.0f);
                GameProfile gameProfile = null;
                if (act_2.b(itemStack)) {
                    String string;
                    NBTTagCompound nBTTagCompound = act_2.a(itemStack);
                    if (tn_0.a(nBTTagCompound, xr_0.d, 10)) {
                        gameProfile = S1.a(tn_0.d(nBTTagCompound, xr_0.b));
                    } else if (tn_0.a(nBTTagCompound, xr_0.e, 8) && !aod_2.a(string = tn_0.m(nBTTagCompound, xr_0.c))) {
                        gameProfile = gk_0.a(new GameProfile((UUID)null, string));
                        tn_0.a(nBTTagCompound, xr_0.a, (NBTBase)S1.a(new NBTTagCompound(), gameProfile));
                    }
                }
                agh_0.a(ez_2.i, -0.5f, 0.0f, -0.5f, EnumFacing.UP, 180.0f, act_2.c(itemStack), gameProfile, -1);
            }
            GlStateManagerInvoker.popMatrix();
        }
    }

    public ado_1(a5Y a5Y2) {
        this.a = a5Y2;
    }

    @Override
    public boolean a() {
        return true;
    }
}

