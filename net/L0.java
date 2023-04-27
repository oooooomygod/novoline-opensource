/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.TileEntity;
import java.util.List;

public class L0
extends Item {
    private static String[] m = new String[]{CF.p, CF.h, CF.r, CF.u, CF.c};

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing == EnumFacing.DOWN) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        BlocksInvoker.d(block, world, blockPos);
        if (!akm_1.i(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))))) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, blockPos = amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (!P2.a(Blocks.ck, world, blockPos)) {
            return false;
        }
        if (!world.isRemote) {
            TileEntity tileEntity;
            aV8.a(world, blockPos, BlockStateInvoker.a(P2.a(Blocks.ck), g6_0.Q, (Comparable)((Object)enumFacing)), 3);
            int n = 0;
            if (enumFacing == EnumFacing.UP) {
                n = MathHelper.floor_double((double)(entityPlayer.rotationYaw * 16.0f / 360.0f) + 0.5) & 0xF;
            }
            if ((tileEntity = aV8.z(world, blockPos)) instanceof a6t_0) {
                a6t_0 a6t_02 = (a6t_0)tileEntity;
                if (act_2.c(itemStack) == 3) {
                    GameProfile gameProfile = null;
                    if (act_2.b(itemStack)) {
                        NBTTagCompound nBTTagCompound = act_2.a(itemStack);
                        if (tn_0.a(nBTTagCompound, CF.f, 10)) {
                            gameProfile = S1.a(tn_0.d(nBTTagCompound, CF.w));
                        } else if (tn_0.a(nBTTagCompound, CF.s, 8) && !StringInvoker.g(tn_0.m(nBTTagCompound, CF.m))) {
                            gameProfile = new GameProfile(null, tn_0.m(nBTTagCompound, CF.g));
                        }
                    }
                    gk_0.a(a6t_02, gameProfile);
                } else {
                    gk_0.a(a6t_02, act_2.c(itemStack));
                }
                gk_0.b(a6t_02, n);
                P2.a(Blocks.ck, world, blockPos, a6t_02);
            }
            --itemStack.a;
        }
        return true;
    }

    @Override
    public String e(ItemStack itemStack) {
        if (act_2.c(itemStack) == 3 && act_2.b(itemStack)) {
            NBTTagCompound nBTTagCompound;
            if (tn_0.a(act_2.a(itemStack), CF.o, 8)) {
                return ahq_0.a(CF.d, new Object[]{tn_0.m(act_2.a(itemStack), CF.i)});
            }
            if (tn_0.a(act_2.a(itemStack), CF.b, 10) && tn_0.a(nBTTagCompound = tn_0.d(act_2.a(itemStack), CF.k), CF.t, 8)) {
                return ahq_0.a(CF.v, new Object[]{tn_0.m(nBTTagCompound, CF.n)});
            }
        }
        return super.e(itemStack);
    }

    @Override
    public String a(ItemStack itemStack) {
        int n = act_2.c(itemStack);
        if (n >= m.length) {
            n = 0;
        }
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.d()), CF.a), m[n]).toString();
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (int i = 0; i < m.length; ++i) {
            ListInvoker.add(list, new ItemStack(item, 1, i));
        }
    }

    public L0() {
        this.a(CreativeTabs.l);
        this.setMaxDamage(0);
        this.a(true);
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, CF.j, 8) && !StringInvoker.g(tn_0.m(nBTTagCompound, CF.q))) {
            GameProfile gameProfile = new GameProfile(null, tn_0.m(nBTTagCompound, CF.l));
            gameProfile = gk_0.a(gameProfile);
            tn_0.a(nBTTagCompound, CF.e, (NBTBase)S1.a(new NBTTagCompound(), gameProfile));
        }
    }

    @Override
    public int c(int n) {
        return n;
    }
}

