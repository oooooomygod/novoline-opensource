/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EnumDifficulty;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.ou
 */
public class ou_2
extends or_1 {
    private int ak;
    private int al;
    public long aj;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.al == 2) {
            aV8.a(this.worldObj, this.posX, this.posY, this.posZ, arg_2.d, 10000.0f, 0.8f + a5_0.e(this.Q) * 0.2f);
            aV8.a(this.worldObj, this.posX, this.posY, this.posZ, arg_2.b, 2.0f, 0.5f + a5_0.e(this.Q) * 0.2f);
        }
        --this.al;
        if (this.al < 0) {
            if (this.ak == 0) {
                this.E();
            } else if (this.al < -a5_0.a(this.Q, 10)) {
                --this.ak;
                this.al = 1;
                this.aj = a5_0.b(this.Q);
                BlockPos blockPos = new BlockPos(this);
                if (!this.worldObj.isRemote && J9.c(aV8.k(this.worldObj), arg_2.a) && aV8.b(this.worldObj, blockPos, 10) && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos))) == Material.air && abb_1.a(Blocks.c, this.worldObj, blockPos)) {
                    aV8.a(this.worldObj, blockPos, abb_1.a(Blocks.c));
                }
            }
        }
        if (this.al >= 0) {
            if (this.worldObj.isRemote) {
                aV8.d(this.worldObj, 2);
            } else {
                double d = 3.0;
                List list = aV8.a(this.worldObj, (Entity)this, new rm_2(this.posX - d, this.posY - d, this.posZ - d, this.posX + d, this.posY + 6.0 + d, this.posZ + d));
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    Entity entity;
                    Entity entity2 = entity = (Entity)dz_0.b(iterator);
                    entity2.a(this);
                }
            }
        }
    }

    public ou_2(World world, double d, double d2, double d3) {
        super(world);
        this.c(d, d2, d3, 0.0f, 0.0f);
        this.al = 2;
        this.aj = a5_0.b(this.Q);
        this.ak = a5_0.a(this.Q, 3) + 1;
        BlockPos blockPos = new BlockPos(this);
        if (!world.isRemote && J9.c(aV8.k(world), arg_2.c) && (aV8.p(world) == EnumDifficulty.NORMAL || aV8.p(world) == EnumDifficulty.HARD) && aV8.b(world, blockPos, 10)) {
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air && abb_1.a(Blocks.c, world, blockPos)) {
                aV8.a(world, blockPos, abb_1.a(Blocks.c));
            }
            int n = 0;
            while (true) {
                BlockPos blockPos2;
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, a5_0.a(this.Q, 3) - 1, a5_0.a(this.Q, 3) - 1, a5_0.a(this.Q, 3) - 1)))) == Material.air && abb_1.a(Blocks.c, world, blockPos2)) {
                    aV8.a(world, blockPos2, abb_1.a(Blocks.c));
                }
                ++n;
            }
        }
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    protected void g() {
    }
}

