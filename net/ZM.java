/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZM
extends zd_0 {
    private static List<C6> h = my_0.a(new C6[]{new C6(Items.diamond, 0, 1, 3, 3), new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 1, 3, 5), new C6(Items.bread, 0, 1, 3, 15), new C6(Items.apple, 0, 1, 3, 15), new C6(Items.iron_pickaxe, 0, 1, 1, 5), new C6(Items.iron_sword, 0, 1, 1, 5), new C6(Items.iron_chestplate, 0, 1, 1, 5), new C6(Items.iron_helmet, 0, 1, 1, 5), new C6(Items.iron_leggings, 0, 1, 1, 5), new C6(Items.iron_boots, 0, 1, 1, 5), new C6(px_0.a(Blocks.O), 0, 3, 7, 5), new C6(px_0.a(Blocks.sapling), 0, 3, 7, 5), new C6(Items.saddle, 0, 1, 1, 3), new C6(Items.iron_horse_armor, 0, 1, 1, 1), new C6(Items.golden_horse_armor, 0, 1, 1, 1), new C6(Items.diamond_horse_armor, 0, 1, 1, 1)});
    private boolean g;

    public static ZM a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 10, 6, 7, enumFacing);
        return ZM.a(hF) && Y_.a(list, hF) == null ? new ZM(zw_02, n4, random, hF, enumFacing) : null;
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
        this.a(world, hF, 0, 1, 0, 9, 4, 6, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 0, 0, 9, 0, 6, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 4, 0, 9, 4, 6, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.a(world, hF, 0, 5, 0, 9, 5, 6, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 1, 5, 1, 8, 5, 5, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 1, 0, 2, 3, 0, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 1, 0, 0, 4, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 3, 1, 0, 3, 4, 0, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.a(world, hF, 0, 1, 6, 0, 4, 6, BlocksInvoker.t(Blocks.b2), BlocksInvoker.t(Blocks.b2), false);
        this.b(world, BlocksInvoker.t(Blocks.planks), 3, 3, 1, hF);
        this.a(world, hF, 3, 1, 2, 3, 3, 2, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 4, 1, 3, 5, 3, 3, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 0, 1, 1, 0, 3, 5, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 1, 1, 6, 5, 3, 6, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
        this.a(world, hF, 5, 1, 0, 5, 3, 0, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.Z), false);
        this.a(world, hF, 9, 1, 0, 9, 3, 0, BlocksInvoker.t(Blocks.Z), BlocksInvoker.t(Blocks.Z), false);
        this.a(world, hF, 6, 1, 4, 9, 4, 6, BlocksInvoker.t(Blocks.cobblestone), BlocksInvoker.t(Blocks.cobblestone), false);
        this.b(world, db_2.a(Blocks.flowing_lava), 7, 1, 5, hF);
        this.b(world, db_2.a(Blocks.flowing_lava), 8, 1, 5, hF);
        this.b(world, BlocksInvoker.t(Blocks.by), 9, 2, 5, hF);
        this.b(world, BlocksInvoker.t(Blocks.by), 9, 2, 4, hF);
        this.a(world, hF, 7, 2, 4, 8, 2, 5, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.b(world, BlocksInvoker.t(Blocks.cobblestone), 6, 1, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.ab), 6, 2, 3, hF);
        this.b(world, BlocksInvoker.t(Blocks.ab), 6, 3, 3, hF);
        this.b(world, abv_0.a(Blocks.X), 8, 1, 1, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 2, 2, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 0, 2, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 2, 2, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.cd), 4, 2, 6, hF);
        this.b(world, BlocksInvoker.t(Blocks.Z), 2, 1, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.ae), 2, 2, 4, hF);
        this.b(world, BlocksInvoker.t(Blocks.planks), 1, 1, 5, hF);
        this.b(world, BlocksInvoker.a(Blocks.a7, this.a(Blocks.a7, 3)), 2, 1, 5, hF);
        this.b(world, BlocksInvoker.a(Blocks.a7, this.a(Blocks.a7, 1)), 1, 1, 4, hF);
        if (!this.g && aqu_2.a(hF, new BlockPos(this.b(5, 5), this.a(1), this.a(5, 5)))) {
            this.g = true;
            this.a(world, hF, random, 5, 1, 5, h, 3 + a5_0.a(random, 6));
        }
        int n = 6;
        while (true) {
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, n, 0, -1, hF))) == Material.air && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, n, -1, -1, hF))) != Material.air) {
                this.b(world, BlocksInvoker.a(Blocks.U, this.a(Blocks.U, 3)), n, 0, -1, hF);
            }
            ++n;
        }
    }

    public ZM(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, a2T.a, this.g);
    }

    public ZM() {
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = tn_0.c(nBTTagCompound, a2T.b);
    }

    @Override
    protected int c(int n, int n2) {
        return 3;
    }
}

