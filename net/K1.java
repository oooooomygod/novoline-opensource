/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import deobf.TileEntity;
import java.util.List;

public class K1
extends ItemBlock {
    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, am4_0.h, false);
        if (tn_0.b(nBTTagCompound, am4_0.j)) {
            NBTTagList nBTTagList = tn_0.c(nBTTagCompound, am4_0.d, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
                YZ yZ = my_2.b(tn_0.g(nBTTagCompound2, am4_0.e));
                qv_2 qv_22 = aib_0.a(tn_0.m(nBTTagCompound2, am4_0.m));
                ListInvoker.add(list, ahq_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), am4_0.l), aib_0.f(qv_22)), am4_0.b), yZ.b()).toString()));
            }
        }
    }

    @Override
    public String e(ItemStack itemStack) {
        String string = am4_0.f;
        YZ yZ = this.a(itemStack);
        string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), yZ.b()), am4_0.g).toString();
        return ahq_0.b(string);
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return 0xFFFFFF;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (YZ yZ : YZ.values()) {
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            aez_2.a(nBTTagCompound, my_2.c(yZ), null);
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, am4_0.k, (NBTBase)nBTTagCompound);
            ItemStack itemStack = new ItemStack(item, 1, my_2.c(yZ));
            act_2.b(itemStack, nBTTagCompound2);
            ListInvoker.add(list, itemStack);
        }
    }

    @Override
    public CreativeTabs g() {
        return CreativeTabs.l;
    }

    public K1() {
        super(Blocks.cs);
        this.c = 16;
        this.a(CreativeTabs.l);
        this.a(true);
        this.setMaxDamage(0);
    }

    private YZ a(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, am4_0.c, false);
        YZ yZ = null;
        yZ = tn_0.b(nBTTagCompound, am4_0.a) ? my_2.b(tn_0.g(nBTTagCompound, am4_0.i)) : my_2.b(act_2.c(itemStack));
        return yZ;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing == EnumFacing.DOWN) {
            return false;
        }
        if (!akm_1.i(BlocksInvoker.getBlockState(aV8.q(world, blockPos).b()))) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, blockPos = amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (!BlocksInvoker.g(Blocks.cs, world, blockPos)) {
            return false;
        }
        if (world.isRemote) {
            return true;
        }
        if (enumFacing == EnumFacing.UP) {
            int n = MathHelper.floor_double((double)((entityPlayer.rotationYaw + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            aV8.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.cs), gl_2.P, P8.d(n)), 3);
        } else {
            aV8.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.aH), gy_2.P, (Comparable)((Object)enumFacing)), 3);
        }
        --itemStack.a;
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6L) {
            aez_2.a((a6L)tileEntity, itemStack);
        }
        return true;
    }
}

