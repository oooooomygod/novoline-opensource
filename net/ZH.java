/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZH
extends zd_0 {
    private boolean g;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = tn_0.c(nBTTagCompound, avn_1.b);
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, avn_1.a, this.g);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        int n;
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 6 - 1, 0);
        }
        this.a(world, hF, 0, 0, 0, 4, 0, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 4, 0, 4, 4, 4, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 1, 4, 1, 3, 4, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 1, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 2, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 3, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 1, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 2, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 3, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 1, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 2, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 0, 3, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 1, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 2, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 4, 3, 4, hF);
        this.a(world, hF, 0, 1, 1, 0, 3, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 4, 1, 1, 4, 3, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 1, 1, 4, 3, 3, 4, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 2, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 1, 1, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 1, 2, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 1, 3, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 2, 3, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 3, 3, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 3, 2, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 3, 1, 0, hF);
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, 2, 0, -1, hF))) == Material.air && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, 2, -1, -1, hF))) != Material.air) {
            this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), 2, 0, -1, hF);
        }
        this.a(world, hF, 1, 1, 1, 3, 3, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        if (this.g) {
            this.b(world, BlocksInvoker.t(Blocks.Z), 0, 5, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 1, 5, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 2, 5, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 3, 5, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 4, 5, 0, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 0, 5, 4, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 1, 5, 4, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 2, 5, 4, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 3, 5, 4, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 4, 5, 4, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 4, 5, 1, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 4, 5, 2, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 4, 5, 3, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 0, 5, 1, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 0, 5, 2, hF);
            this.b(world, BlocksInvoker.t(Blocks.Z), 0, 5, 3, hF);
        }
        if (this.g) {
            n = this.a(Blocks.bm, 3);
            this.b(world, BlocksInvoker.a(Blocks.bm, n), 3, 1, 3, hF);
            this.b(world, BlocksInvoker.a(Blocks.bm, n), 3, 2, 3, hF);
            this.b(world, BlocksInvoker.a(Blocks.bm, n), 3, 3, 3, hF);
            this.b(world, BlocksInvoker.a(Blocks.bm, n), 3, 4, 3, hF);
        }
        this.b(world, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bD), hl_1.P, (Comparable)((Object)this.c)), 2, 3, 1, hF);
        n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, n2, 6, n, hF);
            this.a(world, BlocksInvoker.t(Blocks.cobblestone), n2, -1, n, hF);
            ++n2;
        }
    }

    public ZH() {
    }

    public static ZH a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 5, 6, 5, enumFacing);
        return Y_.a(list, hF) != null ? null : new ZH(zw_02, n4, random, hF, enumFacing);
    }

    public ZH(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
        this.g = a5_0.a(random);
    }
}

