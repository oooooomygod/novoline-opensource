/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.Lt
 */
public class lt_0
extends Item {
    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        Iterator iterator = ms_0.a(ai7_0.d.values());
        while (dz_0.c(iterator)) {
            a9Q a9Q2 = (a9Q)dz_0.b(iterator);
            ListInvoker.add(list, new ItemStack(item, 1, a9Q2.c));
        }
    }

    public lt_0() {
        this.a(true);
        this.a(CreativeTabs.b);
    }

    public static Entity a(World world, int n, double d, double d2, double d3) {
        if (!MapInvoker.b(ai7_0.d, P8.d(n))) {
            return null;
        }
        Entity entity = null;
        int n2 = 0;
        while (true) {
            if ((entity = ub_1.a(n, world)) instanceof EntityLivingBase) {
                nl_1 nl_12 = (nl_1)entity;
                ayj_0.b(entity, d, d2, d3, MathHelper.a(a5_0.e(world.o) * 360.0f), 0.0f);
                nl_12.aP = nl_12.rotationYaw;
                nl_12.aD = nl_12.rotationYaw;
                CG.a(nl_12, aV8.b(world, new BlockPos(nl_12)), null);
                aV8.b(world, entity);
                CG.y(nl_12);
            }
            ++n2;
        }
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        a9Q a9Q2 = (a9Q)MapInvoker.c(ai7_0.d, P8.d(act_2.c(itemStack)));
        return a9Q2.a;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (world.isRemote) {
            return itemStack;
        }
        MovingObjectPosition movingObjectPosition = this.a(world, entityPlayer, true);
        if (movingObjectPosition.typeOfHit == I.BLOCK) {
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            if (!aV8.a(world, entityPlayer, blockPos)) {
                return itemStack;
            }
            if (!a6w_0.a(entityPlayer, blockPos, movingObjectPosition.facing, itemStack)) {
                return itemStack;
            }
            if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) instanceof BlockLiquid) {
                Entity entity = lt_0.a(world, act_2.c(itemStack), (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5);
                if (entity instanceof EntityLivingBase && act_2.g(itemStack)) {
                    ayj_0.a(entity, act_2.w(itemStack));
                }
                if (!aSY.a(entityPlayer.abilities)) {
                    --itemStack.a;
                }
                a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
            }
        }
        return itemStack;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        Entity entity;
        TileEntity tileEntity;
        if (world.isRemote) {
            return true;
        }
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == Blocks.p && (tileEntity = aV8.z(world, blockPos)) instanceof a6f_0) {
            OP oP = kk_1.a((a6f_0)tileEntity);
            apq_1.a(oP, ub_1.a(act_2.c(itemStack)));
            NBTInvoker.k(tileEntity);
            aV8.p(world, blockPos);
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            return true;
        }
        blockPos = amv_2.a(blockPos, enumFacing);
        double d = 0.0;
        if (enumFacing == EnumFacing.UP && iBlockState instanceof g2_0) {
            d = 0.5;
        }
        if ((entity = lt_0.a(world, act_2.c(itemStack), (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + d, (double)amv_2.i(blockPos) + 0.5)) instanceof EntityLivingBase && act_2.g(itemStack)) {
            ayj_0.a(entity, act_2.w(itemStack));
        }
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        return true;
    }

    @Override
    public String e(ItemStack itemStack) {
        String string = StringInvoker.h(aL0.a(aL0.a(new StringBuilder(), C.c), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), this.d()), C.a).toString())).toString());
        String string2 = ub_1.a(act_2.c(itemStack));
        string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), C.e), ahq_0.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), C.d), string2), C.b).toString())).toString();
        return string;
    }
}

