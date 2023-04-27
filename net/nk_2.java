/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;

/*
 * Renamed from net.nk
 */
public class nk_2
extends nc_2 {
    public y9 am;

    @Override
    public void c(double d, double d2, double d3, float f, float f2) {
        BlockPos blockPos = amv_2.a(this.ak, d - this.posX, d2 - this.posY, d3 - this.posZ);
        this.j(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos));
    }

    @Override
    public void a(Entity entity) {
        if (J9.c(aV8.k(this.worldObj), a8R.b)) {
            if (entity instanceof EntityPlayer) {
                EntityPlayer entityPlayer = (EntityPlayer)entity;
                if (aSY.a(entityPlayer.abilities)) {
                    return;
                }
            }
            this.a(new ItemStack(Items.painting), 0.0f);
        }
    }

    @Override
    public int c() {
        return this.am.sizeX;
    }

    public nk_2(World world, BlockPos blockPos, EnumFacing enumFacing, String string) {
        this(world, blockPos, enumFacing);
        for (y9 y92 : y9.values()) {
            if (!y92.title.equals(string)) continue;
            this.am = y92;
            break;
        }
        this.a(enumFacing);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        String string = tn_0.m(nBTTagCompound, a8R.c);
        for (y9 y92 : y9.values()) {
            if (!y92.title.equals(string)) continue;
            this.am = y92;
        }
        if (this.am == null) {
            this.am = y9.KEBAB;
        }
        super.g(nBTTagCompound);
    }

    public nk_2(World world, BlockPos blockPos, EnumFacing enumFacing) {
        super(world, blockPos);
        ArrayList arrayList = my_0.c();
        y9[] y9Array = y9.values();
        int n = y9Array.length;
        for (int i = 0; i < n; ++i) {
            y9 y92;
            this.am = y92 = y9Array[i];
            this.a(enumFacing);
            if (!this.b()) continue;
            ListInvoker.add(arrayList, (Object)y92);
        }
        if (!ListInvoker.isEmpty(arrayList)) {
            this.am = (y9)((Object)ListInvoker.get(arrayList, a5_0.a(this.Q, ListInvoker.size(arrayList))));
        }
        this.a(enumFacing);
    }

    public nk_2(World world) {
        super(world);
    }

    @Override
    public int a() {
        return this.am.sizeY;
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        BlockPos blockPos = amv_2.a(this.ak, d - this.posX, d2 - this.posY, d3 - this.posZ);
        this.j(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos));
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, a8R.a, this.am.title);
        super.b(nBTTagCompound);
    }
}

