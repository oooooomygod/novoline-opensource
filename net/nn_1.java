/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Iterator;

/*
 * Renamed from net.nn
 */
public class nn_1
extends nc_2 {
    @Override
    public int c() {
        return 9;
    }

    @Override
    public void a(Entity entity) {
    }

    @Override
    public boolean b(double d) {
        return d < 1024.0;
    }

    public nn_1(World world, BlockPos blockPos) {
        super(world, blockPos);
        this.j((double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5);
        this.a(new rm_2(this.posX - 0.1875, this.posY - 0.25 + 0.125, this.posZ - 0.1875, this.posX + 0.1875, this.posY + 0.25 + 0.125, this.posZ + 0.1875));
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        nl_1 nl_12;
        Iterator iterator;
        double d;
        ItemStack itemStack = a6w_0.d(entityPlayer);
        if (act_2.k(itemStack) == Items.lead && !this.worldObj.isRemote) {
            d = 7.0;
            iterator = ListInvoker.iterator(aV8.a(this.worldObj, nl_1.class, new rm_2(this.posX - d, this.posY - d, this.posZ - d, this.posX + d, this.posY + d, this.posZ + d)));
            while (dz_0.c(iterator)) {
                nl_12 = (nl_1)dz_0.b(iterator);
                if (!CG.t(nl_12) || CG.j(nl_12) != entityPlayer) continue;
                CG.a(nl_12, this, true);
            }
        }
        if (!this.worldObj.isRemote) {
            this.E();
            if (aSY.a(entityPlayer.abilities)) {
                d = 7.0;
                iterator = ListInvoker.iterator(aV8.a(this.worldObj, nl_1.class, new rm_2(this.posX - d, this.posY - d, this.posZ - d, this.posX + d, this.posY + d, this.posZ + d)));
                while (dz_0.c(iterator)) {
                    nl_12 = (nl_1)dz_0.b(iterator);
                    if (!CG.t(nl_12) || CG.j(nl_12) != this) continue;
                    CG.a(nl_12, true, false);
                }
            }
        }
        return true;
    }

    public static nn_1 a(World world, BlockPos blockPos) {
        nn_1 nn_12 = new nn_1(world, blockPos);
        nn_12.ah = true;
        aV8.b(world, nn_12);
        return nn_12;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    protected void g() {
        super.g();
    }

    @Override
    public int a() {
        return 9;
    }

    public static nn_1 b(World world, BlockPos blockPos) {
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        Iterator iterator = ListInvoker.iterator(aV8.a(world, nn_1.class, new rm_2((double)n - 1.0, (double)n2 - 1.0, (double)n3 - 1.0, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0)));
        while (dz_0.c(iterator)) {
            nn_1 nn_12 = (nn_1)dz_0.b(iterator);
            if (!nn_12.d().equals(blockPos)) continue;
            return nn_12;
        }
        return null;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public boolean f(NBTTagCompound nBTTagCompound) {
        return false;
    }

    @Override
    public void a(EnumFacing enumFacing) {
    }

    @Override
    public float w() {
        return -0.0625f;
    }

    public nn_1(World world) {
        super(world);
    }

    @Override
    public boolean b() {
        return BlockStateInvoker.getBlock(aV8.q(this.worldObj, this.ak)) instanceof g2_0;
    }
}

