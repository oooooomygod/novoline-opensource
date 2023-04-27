/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;

/*
 * Renamed from net.ab3
 */
class ab3_0
extends aKT {
    private boolean b = true;

    @Override
    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        World world = tb_2.a(aYE2);
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        BlockPos blockPos = amv_2.a(tb_2.f(aYE2), enumFacing);
        g6_0 g6_02 = Blocks.ck;
        if (aV8.k(world, blockPos) && P2.a(g6_02, world, blockPos, itemStack)) {
            if (!world.isRemote) {
                aV8.a(world, blockPos, BlockStateInvoker.a(P2.a(g6_02), g6_0.Q, (Comparable)((Object)EnumFacing.UP)), 3);
                TileEntity tileEntity = aV8.z(world, blockPos);
                if (tileEntity instanceof a6t_0) {
                    if (act_2.c(itemStack) == 3) {
                        GameProfile gameProfile = null;
                        if (act_2.b(itemStack)) {
                            String string;
                            NBTTagCompound nBTTagCompound = act_2.a(itemStack);
                            if (tn_0.a(nBTTagCompound, a6j_0.a, 10)) {
                                gameProfile = S1.a(tn_0.d(nBTTagCompound, a6j_0.b));
                            } else if (tn_0.a(nBTTagCompound, a6j_0.d, 8) && !aod_2.a(string = tn_0.m(nBTTagCompound, a6j_0.c))) {
                                gameProfile = new GameProfile(null, string);
                            }
                        }
                        gk_0.a((a6t_0)tileEntity, gameProfile);
                    } else {
                        gk_0.a((a6t_0)tileEntity, act_2.c(itemStack));
                    }
                    gk_0.b((a6t_0)tileEntity, SJ.j(SJ.b(enumFacing)) * 4);
                    P2.a(Blocks.ck, world, blockPos, (a6t_0)tileEntity);
                }
                --itemStack.a;
            }
        } else {
            this.b = false;
        }
        return itemStack;
    }

    @Override
    protected void a(aYE aYE2) {
        if (this.b) {
            aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
        } else {
            aV8.c(tb_2.a(aYE2), 1001, tb_2.f(aYE2), 0);
        }
    }

    ab3_0() {
    }
}

