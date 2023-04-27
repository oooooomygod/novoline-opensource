/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.IBlockAccess;
import java.util.BitSet;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aXq
 */
public class axq_0 {
    public static void a(VC vC, IBlockAccess iBlockAccess, Block block, BlockPos blockPos, EnumFacing enumFacing, float[] fArray, BitSet bitSet) {
        GlStateManagerInvoker.s();
        vC.a(iBlockAccess, block, blockPos, enumFacing, fArray, bitSet);
        if (ListInvoker.b() != null) {
            GlStateManagerInvoker.b(new String[5]);
        }
    }
}

