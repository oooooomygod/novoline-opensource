/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.Material;
import net.P8;
import net.aG3;
import net.ys_2;

import java.util.IdentityHashMap;
import java.util.Map;

/*
 * Renamed from net.gR
 */
public class BlockLeavesBase
extends Block {
    private static Map<Block, Integer> Q = new IdentityHashMap<Block, Integer>();
    protected boolean P;

    public static void a(Block block) {
        if (MapInvoker.b(Q, block)) {
            int n = P8.b((Integer)MapInvoker.c(Q, block));
            BlockLeavesBase.a(block, n);
        }
    }

    protected BlockLeavesBase(Material material, boolean bl) {
        super(material);
        this.P = bl;
    }

    public static void a(Block block, int n) {
        if (!MapInvoker.b(Q, block)) {
            MapInvoker.c(Q, block, P8.d(block.H()));
        }
        block.a(n);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return (!ys_2.ad() || BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)) != this) && super.b(iBlockAccess, blockPos, enumFacing);
    }
}

