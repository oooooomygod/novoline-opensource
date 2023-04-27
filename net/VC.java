/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.IBlockAccess;
import java.util.BitSet;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

public class VC {
    private int[] c;
    private static String a = "CL_00002515";
    private float[] b = new float[4];

    private int a(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> 16 & 0xFF) * f + (float)(n2 >> 16 & 0xFF) * f2 + (float)(n3 >> 16 & 0xFF) * f3 + (float)(n4 >> 16 & 0xFF) * f4) & 0xFF;
        int n6 = (int)((float)(n & 0xFF) * f + (float)(n2 & 0xFF) * f2 + (float)(n3 & 0xFF) * f3 + (float)(n4 & 0xFF) * f4) & 0xFF;
        return n5 << 16 | n6;
    }

    static int[] b(VC vC) {
        return vC.c;
    }

    public void a(IBlockAccess iBlockAccess, Block block, BlockPos blockPos, EnumFacing enumFacing, float[] fArray, BitSet bitSet) {
        BlockPos blockPos2 = aM_.a(bitSet, 0) ? amv_2.a(blockPos, enumFacing) : blockPos;
        aDz aDz2 = J6.a(enumFacing);
        BlockPos blockPos3 = amv_2.a(blockPos2, aDz2.d[0]);
        BlockPos blockPos4 = amv_2.a(blockPos2, aDz2.d[1]);
        BlockPos blockPos5 = amv_2.a(blockPos2, aDz2.d[2]);
        BlockPos blockPos6 = amv_2.a(blockPos2, aDz2.d[3]);
        int n = BlocksInvoker.c(block, iBlockAccess, blockPos3);
        int n2 = BlocksInvoker.c(block, iBlockAccess, blockPos4);
        int n3 = BlocksInvoker.c(block, iBlockAccess, blockPos5);
        int n4 = BlocksInvoker.c(block, iBlockAccess, blockPos6);
        float f = mq_1.a(BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos3))));
        float f2 = mq_1.a(BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos4))));
        float f3 = mq_1.a(BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos5))));
        float f4 = mq_1.a(BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos6))));
        BlocksInvoker.F(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos3, enumFacing))));
        BlocksInvoker.F(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos4, enumFacing))));
        BlocksInvoker.F(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos5, enumFacing))));
        BlocksInvoker.F(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos6, enumFacing))));
        float f5 = f;
        int n5 = n;
        float f6 = f;
        int n6 = n;
        float f7 = f2;
        int n7 = n2;
        float f8 = f2;
        int n8 = n2;
        int n9 = BlocksInvoker.c(block, iBlockAccess, blockPos);
        if (aM_.a(bitSet, 0) || !BlocksInvoker.L(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos, enumFacing))))) {
            n9 = BlocksInvoker.c(block, iBlockAccess, amv_2.a(blockPos, enumFacing));
        }
        float f9 = aM_.a(bitSet, 0) ? BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos2))) : BlocksInvoker.D(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)));
        f9 = mq_1.a(f9);
        gc_0 gc_02 = gc_0.a(enumFacing);
        float f10 = (f4 + f + f6 + f9) * 0.25f;
        float f11 = (f3 + f + f5 + f9) * 0.25f;
        float f12 = (f3 + f2 + f7 + f9) * 0.25f;
        float f13 = (f4 + f2 + f8 + f9) * 0.25f;
        if (aM_.a(bitSet, 1) && aDz2.a) {
            float f14 = fArray[aDz2.h[0].b] * fArray[aDz2.h[1].b];
            float f15 = fArray[aDz2.h[2].b] * fArray[aDz2.h[3].b];
            float f16 = fArray[aDz2.h[4].b] * fArray[aDz2.h[5].b];
            float f17 = fArray[aDz2.h[6].b] * fArray[aDz2.h[7].b];
            float f18 = fArray[aDz2.i[0].b] * fArray[aDz2.i[1].b];
            float f19 = fArray[aDz2.i[2].b] * fArray[aDz2.i[3].b];
            float f20 = fArray[aDz2.i[4].b] * fArray[aDz2.i[5].b];
            float f21 = fArray[aDz2.i[6].b] * fArray[aDz2.i[7].b];
            float f22 = fArray[aDz2.c[0].b] * fArray[aDz2.c[1].b];
            float f23 = fArray[aDz2.c[2].b] * fArray[aDz2.c[3].b];
            float f24 = fArray[aDz2.c[4].b] * fArray[aDz2.c[5].b];
            float f25 = fArray[aDz2.c[6].b] * fArray[aDz2.c[7].b];
            float f26 = fArray[aDz2.g[0].b] * fArray[aDz2.g[1].b];
            float f27 = fArray[aDz2.g[2].b] * fArray[aDz2.g[3].b];
            float f28 = fArray[aDz2.g[4].b] * fArray[aDz2.g[5].b];
            float f29 = fArray[aDz2.g[6].b] * fArray[aDz2.g[7].b];
            this.b[gc_0.a((gc_0)gc_02)] = f10 * f14 + f11 * f15 + f12 * f16 + f13 * f17;
            this.b[gc_0.d((gc_0)gc_02)] = f10 * f18 + f11 * f19 + f12 * f20 + f13 * f21;
            this.b[gc_0.c((gc_0)gc_02)] = f10 * f22 + f11 * f23 + f12 * f24 + f13 * f25;
            this.b[gc_0.b((gc_0)gc_02)] = f10 * f26 + f11 * f27 + f12 * f28 + f13 * f29;
            int n10 = this.a(n4, n, n6, n9);
            int n11 = this.a(n3, n, n5, n9);
            int n12 = this.a(n3, n2, n7, n9);
            int n13 = this.a(n4, n2, n8, n9);
            this.c[gc_0.a((gc_0)gc_02)] = this.a(n10, n11, n12, n13, f14, f15, f16, f17);
            this.c[gc_0.d((gc_0)gc_02)] = this.a(n10, n11, n12, n13, f18, f19, f20, f21);
            this.c[gc_0.c((gc_0)gc_02)] = this.a(n10, n11, n12, n13, f22, f23, f24, f25);
            this.c[gc_0.b((gc_0)gc_02)] = this.a(n10, n11, n12, n13, f26, f27, f28, f29);
        } else {
            this.c[gc_0.a((gc_0)gc_02)] = this.a(n4, n, n6, n9);
            this.c[gc_0.d((gc_0)gc_02)] = this.a(n3, n, n5, n9);
            this.c[gc_0.c((gc_0)gc_02)] = this.a(n3, n2, n7, n9);
            this.c[gc_0.b((gc_0)gc_02)] = this.a(n4, n2, n8, n9);
            this.b[gc_0.a((gc_0)gc_02)] = f10;
            this.b[gc_0.d((gc_0)gc_02)] = f11;
            this.b[gc_0.c((gc_0)gc_02)] = f12;
            this.b[gc_0.b((gc_0)gc_02)] = f13;
        }
    }

    private int a(int n, int n2, int n3, int n4) {
        n = n4;
        n2 = n4;
        n3 = n4;
        return n + n2 + n3 + n4 >> 2 & 0xFF00FF;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0001|t-[\thp\u0005\u001a(".toCharArray();
        int n2 = 0;
        int n3 = 20;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x56));
            n3 = n3;
        }
    }

    static float[] a(VC vC) {
        return vC.b;
    }

    public VC(X6 x6) {
        this.c = new int[4];
    }

    public VC() {
        this.c = new int[4];
    }
}

