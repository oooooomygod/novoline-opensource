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

/*
 * Renamed from net.Zs
 */
public class zs_0
extends zd_0 {
    private boolean h;
    private int g;

    public zs_0(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
        this.h = a5_0.a(random);
        this.g = a5_0.a(random, 3);
    }

    public static zs_0 a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 4, 6, 5, enumFacing);
        return zs_0.a(hF) && Y_.a(list, hF) == null ? new zs_0(zw_02, n4, random, hF, enumFacing) : null;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, l5_0.b, this.g);
        tn_0.a(nBTTagCompound, l5_0.d, this.h);
    }

    public zs_0() {
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = tn_0.g(nBTTagCompound, l5_0.a);
        this.h = tn_0.c(nBTTagCompound, l5_0.c);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.f < 0) {
            this.f = this.a(world, hF);
            if (this.f < 0) {
                return true;
            }
            aqu_2.a(this.b, 0, this.f - this.b.a + 6 - 1, 0);
        }
        this.a(world, hF, 1, 1, 1, 3, 5, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 0, 0, 3, 0, 4, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 1, 0, 1, 2, 0, 3, BlocksInvoker.t(Blocks.dirt), BlocksInvoker.t(Blocks.dirt), false);
        if (this.h) {
            this.a(world, hF, 1, 4, 1, 2, 4, 3, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        } else {
            this.a(world, hF, 1, 5, 1, 2, 5, 3, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        }
        this.b(world, BlocksInvoker.t(Blocks.b2), 1, 4, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 2, 4, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 1, 4, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 2, 4, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 0, 4, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 0, 4, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 0, 4, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 3, 4, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 3, 4, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.b2), 3, 4, 3, hF);
        this.a(world, hF, 0, 1, 0, 0, 3, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 3, 1, 0, 3, 3, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 0, 1, 4, 0, 3, 4, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 3, 1, 4, 3, 3, 4, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 0, 1, 1, 0, 3, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 3, 1, 1, 3, 3, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 1, 1, 0, 2, 3, 0, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 1, 1, 4, 2, 3, 4, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 3, 2, 2, hF);
        if (this.g > 0) {
            this.b(world, BlocksInvoker.t(Blocks.Z), this.g, 1, 3, hF);
            this.b(world, BlocksInvoker.t(Blocks.ae), this.g, 2, 3, hF);
        }
        this.b(world, BlocksInvoker.t(Blocks.air), 1, 1, 0, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 1, 2, 0, hF);
        this.a(world, hF, random, 1, 1, 0, SJ.b(this.a(Blocks.bh, 1)));
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, 1, 0, -1, hF))) == Material.air && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, 1, -1, -1, hF))) != Material.air) {
            this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), 1, 0, -1, hF);
        }
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(world, n2, 6, n, hF);
            this.a(world, BlocksInvoker.t(Blocks.cobblestone), n2, -1, n, hF);
            ++n2;
        }
    }
}

