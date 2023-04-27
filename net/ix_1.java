/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iX
 */
public class ix_1
extends i7_0 {
    private Predicate<IBlockState> d;
    private int c;
    private IBlockState b;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        float f = a5_0.e(random) * (float)Math.PI;
        double d = (float)(amv_2.j(blockPos) + 8) + MathHelper.sin(f) * (float)this.c / 8.0f;
        double d2 = (float)(amv_2.j(blockPos) + 8) - MathHelper.sin(f) * (float)this.c / 8.0f;
        double d3 = (float)(amv_2.i(blockPos) + 8) + MathHelper.cos(f) * (float)this.c / 8.0f;
        double d4 = (float)(amv_2.i(blockPos) + 8) - MathHelper.cos(f) * (float)this.c / 8.0f;
        double d5 = amv_2.h(blockPos) + a5_0.a(random, 3) - 2;
        double d6 = amv_2.h(blockPos) + a5_0.a(random, 3) - 2;
        for (int i = 0; i < this.c; ++i) {
            float f2 = (float)i / (float)this.c;
            double d7 = d + (d2 - d) * (double)f2;
            double d8 = d5 + (d6 - d5) * (double)f2;
            double d9 = d3 + (d4 - d3) * (double)f2;
            double d10 = a5_0.c(random) * (double)this.c / 16.0;
            double d11 = (double)(MathHelper.sin((float)Math.PI * f2) + 1.0f) * d10 + 1.0;
            double d12 = (double)(MathHelper.sin((float)Math.PI * f2) + 1.0f) * d10 + 1.0;
            int n = MathHelper.floor_double(d7 - d11 / 2.0);
            int n2 = MathHelper.floor_double(d8 - d12 / 2.0);
            int n3 = MathHelper.floor_double(d9 - d11 / 2.0);
            int n4 = MathHelper.floor_double(d7 + d11 / 2.0);
            int n5 = MathHelper.floor_double(d8 + d12 / 2.0);
            int n6 = MathHelper.floor_double(d9 + d11 / 2.0);
            for (int j = n; j <= n4; ++j) {
                double d13 = ((double)j + 0.5 - d7) / (d11 / 2.0);
                if (!(d13 * d13 < 1.0)) continue;
                for (int k = n2; k <= n5; ++k) {
                    double d14 = ((double)k + 0.5 - d8) / (d12 / 2.0);
                    if (!(d13 * d13 + d14 * d14 < 1.0)) continue;
                    for (int i2 = n3; i2 <= n6; ++i2) {
                        BlockPos blockPos2;
                        double d15 = ((double)i2 + 0.5 - d9) / (d11 / 2.0);
                        if (!(d13 * d13 + d14 * d14 + d15 * d15 < 1.0) || !aqv_2.a(this.d, aV8.q(world, blockPos2 = new BlockPos(j, k, i2)))) continue;
                        aV8.a(world, blockPos2, this.b, 2);
                    }
                }
            }
        }
        return true;
    }

    public ix_1(IBlockState iBlockState, int n, Predicate<IBlockState> predicate) {
        this.b = iBlockState;
        this.c = n;
        this.d = predicate;
    }

    public ix_1(IBlockState iBlockState, int n) {
        this(iBlockState, n, ass_2.a(Blocks.stone));
    }
}

