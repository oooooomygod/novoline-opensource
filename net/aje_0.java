/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.aje
 */
public class aje_0
extends ajf_0 {
    protected void a(long l4, int n, int n2, xb_1 xb_12, double d, double d2, double d3) {
        this.a(l4, n, n2, xb_12, d, d2, d3, 1.0f + a5_0.e(this.a) * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }

    @Override
    protected void a(World world, int n, int n2, int n3, int n4, xb_1 xb_12) {
        int n5;
        int n6 = a5_0.a(this.a, a5_0.a(this.a, a5_0.a(this.a, 10) + 1) + 1);
        if (a5_0.a(this.a, 5) != 0) {
            n6 = 0;
        }
        if ((n5 = 0) < n6) {
            double d = n * 16 + a5_0.a(this.a, 16);
            double d2 = a5_0.a(this.a, 128);
            double d3 = n2 * 16 + a5_0.a(this.a, 16);
            int n7 = 1;
            if (a5_0.a(this.a, 4) == 0) {
                this.a(a5_0.b(this.a), n3, n4, xb_12, d, d2, d3);
                n7 += a5_0.a(this.a, 4);
            }
            int n8 = 0;
            while (true) {
                float f = a5_0.e(this.a) * (float)Math.PI * 2.0f;
                float f2 = (a5_0.e(this.a) - 0.5f) * 2.0f / 8.0f;
                float f3 = a5_0.e(this.a) * 2.0f + a5_0.e(this.a);
                this.a(a5_0.b(this.a), n3, n4, xb_12, d, d2, d3, f3 * 2.0f, f, f2, 0, 0, 0.5);
                ++n8;
            }
        }
    }

    protected void a(long l4, int n, int n2, xb_1 xb_12, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        double d5 = n * 16 + 8;
        double d6 = n2 * 16 + 8;
        float f4 = 0.0f;
        float f5 = 0.0f;
        Random random = new Random(l4);
        int n5 = this.c * 16 - 16;
        n4 = n5 - a5_0.a(random, n5 / 4);
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        int n6 = a5_0.a(random, n4 / 2) + n4 / 4;
        boolean bl = a5_0.a(random, 6) == 0;
        while (n3 < n4) {
            double d7 = 1.5 + (double)(MathHelper.sin((float)n3 * (float)Math.PI / (float)n4) * f * 1.0f);
            double d8 = d7 * d4;
            float f6 = MathHelper.cos(f3);
            float f7 = MathHelper.sin(f3);
            d += (double)(MathHelper.cos(f2) * f6);
            d2 += (double)f7;
            d3 += (double)(MathHelper.sin(f2) * f6);
            f3 *= 0.92f;
            f3 += f5 * 0.1f;
            f2 += f4 * 0.1f;
            f5 *= 0.9f;
            f4 *= 0.75f;
            f5 += (a5_0.e(random) - a5_0.e(random)) * a5_0.e(random) * 2.0f;
            f4 += (a5_0.e(random) - a5_0.e(random)) * a5_0.e(random) * 4.0f;
            if (n3 == n6 && f > 1.0f) {
                this.a(a5_0.b(random), n, n2, xb_12, d, d2, d3, a5_0.e(random) * 0.5f + 0.5f, f2 - 1.5707964f, f3 / 3.0f, n3, n4, 1.0);
                this.a(a5_0.b(random), n, n2, xb_12, d, d2, d3, a5_0.e(random) * 0.5f + 0.5f, f2 + 1.5707964f, f3 / 3.0f, n3, n4, 1.0);
                return;
            }
            if (a5_0.a(random, 4) != 0) {
                double d9 = d - d5;
                double d10 = d3 - d6;
                double d11 = n4 - n3;
                double d12 = f + 2.0f + 16.0f;
                if (d9 * d9 + d10 * d10 - d11 * d11 > d12 * d12) {
                    return;
                }
                if (d >= d5 - 16.0 - d7 * 2.0 && d3 >= d6 - 16.0 - d7 * 2.0 && d <= d5 + 16.0 + d7 * 2.0 && d3 <= d6 + 16.0 + d7 * 2.0) {
                    int n7;
                    int n8 = MathHelper.floor_double(d - d7) - n * 16 - 1;
                    int n9 = MathHelper.floor_double(d + d7) - n * 16 + 1;
                    int n10 = MathHelper.floor_double(d2 - d8) - 1;
                    int n11 = MathHelper.floor_double(d2 + d8) + 1;
                    int n12 = MathHelper.floor_double(d3 - d7) - n2 * 16 - 1;
                    int n13 = MathHelper.floor_double(d3 + d7) - n2 * 16 + 1;
                    n8 = 0;
                    if (n9 > 16) {
                        n9 = 16;
                    }
                    if (n10 < 1) {
                        n10 = 1;
                    }
                    if (n11 > 120) {
                        n11 = 120;
                    }
                    n12 = 0;
                    if (n13 > 16) {
                        n13 = 16;
                    }
                    for (n7 = n8; n7 < n9; ++n7) {
                        for (int i = n12; i < n13; ++i) {
                            for (int j = n11 + 1; j >= n10 - 1; --j) {
                                if (j >= 128) continue;
                                IBlockState iBlockState = c5.a(xb_12, n7, j, i);
                                if (BlockStateInvoker.getBlock(iBlockState) == Blocks.flowing_lava || BlockStateInvoker.getBlock(iBlockState) == Blocks.lava) {
                                    // empty if block
                                }
                                if (j == n10 - 1) continue;
                            }
                        }
                    }
                    for (n7 = n8; n7 < n9; ++n7) {
                        double d13 = ((double)(n7 + n * 16) + 0.5 - d) / d7;
                        for (int i = n12; i < n13; ++i) {
                            double d14 = ((double)(i + n2 * 16) + 0.5 - d3) / d7;
                            for (int j = n11; j > n10; --j) {
                                IBlockState iBlockState;
                                double d15 = ((double)(j - 1) + 0.5 - d2) / d8;
                                if (!(d15 > -0.7) || !(d13 * d13 + d15 * d15 + d14 * d14 < 1.0) || BlockStateInvoker.getBlock(iBlockState = c5.a(xb_12, n7, j, i)) != Blocks.bu && BlockStateInvoker.getBlock(iBlockState) != Blocks.dirt && BlockStateInvoker.getBlock(iBlockState) != Blocks.grass) continue;
                                c5.a(xb_12, n7, j, i, BlocksInvoker.t(Blocks.air));
                            }
                        }
                    }
                    break;
                }
            }
            ++n3;
        }
    }
}

