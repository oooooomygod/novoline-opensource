/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.TileEntity;

/*
 * Renamed from net.a6q
 */
public class a6q_0
extends TileEntity {
    public byte j;
    public boolean i;

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.j = tn_0.e(nBTTagCompound, yg_0.a);
        this.j = (byte)MathHelper.a(this.j, 0, 24);
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, yg_0.b, this.j);
    }

    public void a() {
        this.j = (byte)((this.j + 1) % 25);
        this.d();
    }

    public void a(World world, BlockPos blockPos) {
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos)))) == Material.air) {
            Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
            int n = 0;
            if (material == Material.y) {
                n = 1;
            }
            if (material == Material.a) {
                n = 2;
            }
            if (material == Material.w) {
                n = 3;
            }
            if (material == Material.wood) {
                n = 4;
            }
            aV8.b(world, blockPos, Blocks.q, n, this.j);
        }
    }
}

