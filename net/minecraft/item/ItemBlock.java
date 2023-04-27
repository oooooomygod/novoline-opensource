/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.item;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.EntityPlayer;
import deobf.MinecraftServer;
import deobf.TileEntity;
import net.minecraft.init.Blocks;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;
import deobf.EnumFacing;
import net.Item;
import net.NBTTagCompound;
import net.World;
import net.a44;
import net.a6w_0;
import net.aV8;
import net.act_2;
import net.aek_1;
import net.amv_2;
import net.axl_0;
import net.tn_0;

public class ItemBlock
extends Item {
    protected Block m;

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        return a44.a(this, itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3);
    }

    public Block a() {
        return this.m;
    }

    @Override
    public ItemBlock a(String string) {
        super.b(string);
        return this;
    }

    @Override
    public CreativeTabs g() {
        return BlocksInvoker.H(this.m);
    }

    @Override
    public String d() {
        return this.m.J();
    }

    public static boolean a(World world, EntityPlayer entityPlayer, BlockPos blockPos, ItemStack itemStack) {
        MinecraftServer minecraftServer = ServerInvoker.d();
        if (act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), axl_0.e, 10)) {
            TileEntity tileEntity = aV8.z(world, blockPos);
            if (!world.isRemote && NBTInvoker.f(tileEntity) && !aek_1.a(ServerInvoker.R(minecraftServer), a6w_0.G(entityPlayer))) {
                return false;
            }
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            NBTTagCompound nBTTagCompound2 = (NBTTagCompound)tn_0.a(nBTTagCompound);
            NBTInvoker.a(tileEntity, nBTTagCompound);
            NBTTagCompound nBTTagCompound3 = (NBTTagCompound)tn_0.h(act_2.a(itemStack), axl_0.d);
            tn_0.a(nBTTagCompound, nBTTagCompound3);
            tn_0.b(nBTTagCompound, axl_0.a, amv_2.j(blockPos));
            tn_0.b(nBTTagCompound, axl_0.c, amv_2.h(blockPos));
            tn_0.b(nBTTagCompound, axl_0.b, amv_2.i(blockPos));
            if (!nBTTagCompound.equals(nBTTagCompound2)) {
                NBTInvoker.b(tileEntity, nBTTagCompound);
                NBTInvoker.k(tileEntity);
                return true;
            }
        }
        return false;
    }

    public ItemBlock(Block block) {
        this.m = block;
    }

    @Override
    public String a(ItemStack itemStack) {
        return this.m.J();
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        BlocksInvoker.a(this.m, item, creativeTabs, list);
    }

    public boolean a(World world, BlockPos blockPos, EnumFacing enumFacing, EntityPlayer entityPlayer, ItemStack itemStack) {
        Block block = aV8.q(world, blockPos).b();
        if (block == Blocks.cm) {
            enumFacing = EnumFacing.UP;
        } else if (!BlocksInvoker.d(block, world, blockPos)) {
            blockPos = amv_2.a(blockPos, enumFacing);
        }
        return aV8.a(world, this.m, blockPos, false, enumFacing, null, itemStack);
    }
}

