/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import java.util.UUID;

public class a53 {
    private a6t_0 b;
    private a6O e;
    private a6L f;
    private a6O a = new a6O(0);
    public static a53 c = new a53();
    private a6R d;

    public void a(ItemStack itemStack) {
        if (act_2.k(itemStack) == Items.banner) {
            aez_2.a(this.f, itemStack);
            aFR.a(hq_0.d, this.f, 0.0, 0.0, 0.0, 0.0f);
        } else if (act_2.k(itemStack) == Items.skull) {
            GameProfile gameProfile = null;
            if (act_2.b(itemStack)) {
                NBTTagCompound nBTTagCompound = act_2.a(itemStack);
                if (tn_0.a(nBTTagCompound, axm_0.c, 10)) {
                    gameProfile = S1.a(tn_0.d(nBTTagCompound, axm_0.e));
                } else if (tn_0.a(nBTTagCompound, axm_0.f, 8) && !StringInvoker.g(tn_0.m(nBTTagCompound, axm_0.d))) {
                    gameProfile = new GameProfile((UUID)null, tn_0.m(nBTTagCompound, axm_0.g));
                    gameProfile = gk_0.a(gameProfile);
                    tn_0.a(nBTTagCompound, axm_0.a);
                    tn_0.a(nBTTagCompound, axm_0.b, (NBTBase)S1.a(new NBTTagCompound(), gameProfile));
                }
            }
            if (ez_2.i != null) {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate(-0.5f, 0.0f, -0.5f);
                GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
                GlStateManagerInvoker.A();
                agh_0.a(ez_2.i, 0.0f, 0.0f, 0.0f, EnumFacing.UP, 0.0f, act_2.c(itemStack), gameProfile, -1);
                GlStateManagerInvoker.b();
                GlStateManagerInvoker.popMatrix();
            }
        } else {
            Block block = BlocksInvoker.a(act_2.k(itemStack));
            if (block == Blocks.g) {
                aFR.a(hq_0.d, this.d, 0.0, 0.0, 0.0, 0.0f);
            } else if (block == Blocks.aA) {
                aFR.a(hq_0.d, this.e, 0.0, 0.0, 0.0, 0.0f);
            } else {
                aFR.a(hq_0.d, this.a, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }

    public a53() {
        this.e = new a6O(1);
        this.d = new a6R();
        this.f = new a6L();
        this.b = new a6t_0();
    }
}

