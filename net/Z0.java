/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class Z0
extends zm_0 {
    private int g;

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        Y_ y_2;
        int n;
        for (n = a5_0.a(random, 5); n < this.g - 8; n += 2 + a5_0.a(random, 5)) {
            y_2 = this.b((zw_0)y_, list, random, 0, n);
            n += MathInvoker.max(aqu_2.e(y_2.b), aqu_2.d(y_2.b));
        }
        for (n = a5_0.a(random, 5); n < this.g - 8; n += 2 + a5_0.a(random, 5)) {
            y_2 = this.a((zw_0)y_, list, random, 0, n);
            n += MathInvoker.max(aqu_2.e(y_2.b), aqu_2.d(y_2.b));
        }
        if (a5_0.a(random, 3) > 0 && this.c != null) {
            switch (aaj_1.a[this.c.ordinal()]) {
                case 1: {
                    aAU.e((zw_0)y_, list, random, this.b.f - 1, this.b.c, this.b.b, EnumFacing.WEST, this.a());
                    break;
                }
                case 2: {
                    aAU.e((zw_0)y_, list, random, this.b.f - 1, this.b.c, this.b.e - 2, EnumFacing.WEST, this.a());
                    break;
                }
                case 3: {
                    aAU.e((zw_0)y_, list, random, this.b.f, this.b.c, this.b.b - 1, EnumFacing.NORTH, this.a());
                    break;
                }
                case 4: {
                    aAU.e((zw_0)y_, list, random, this.b.d - 2, this.b.c, this.b.b - 1, EnumFacing.NORTH, this.a());
                }
            }
        }
        if (a5_0.a(random, 3) > 0 && this.c != null) {
            switch (aaj_1.a[this.c.ordinal()]) {
                case 1: {
                    aAU.e((zw_0)y_, list, random, this.b.d + 1, this.b.c, this.b.b, EnumFacing.EAST, this.a());
                    break;
                }
                case 2: {
                    aAU.e((zw_0)y_, list, random, this.b.d + 1, this.b.c, this.b.e - 2, EnumFacing.EAST, this.a());
                    break;
                }
                case 3: {
                    aAU.e((zw_0)y_, list, random, this.b.f, this.b.c, this.b.e + 1, EnumFacing.SOUTH, this.a());
                    break;
                }
                case 4: {
                    aAU.e((zw_0)y_, list, random, this.b.d - 2, this.b.c, this.b.e + 1, EnumFacing.SOUTH, this.a());
                }
            }
        }
    }

    public Z0() {
    }

    public static HF a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        for (int i = 7 * MathHelper.a(random, 3, 5); i >= 7; i -= 7) {
            HF hF = aqu_2.a(n, n2, n3, 0, 0, 0, 3, 3, i, enumFacing);
            if (Y_.a(list, hF) != null) continue;
            return hF;
        }
        return null;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, ce_1.a, this.g);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        IBlockState iBlockState = this.a(BlocksInvoker.t(Blocks.gravel));
        IBlockState iBlockState2 = this.a(BlocksInvoker.t(Blocks.cobblestone));
        for (int i = this.b.f; i <= this.b.d; ++i) {
            for (int j = this.b.b; j <= this.b.e; ++j) {
                BlockPos blockPos = new BlockPos(i, 64, j);
                if (!aqu_2.a(hF, blockPos)) continue;
                blockPos = amv_2.g(aV8.a(world, blockPos));
                aV8.a(world, blockPos, iBlockState, 2);
                aV8.a(world, amv_2.g(blockPos), iBlockState2, 2);
            }
        }
        return true;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.g = tn_0.g(nBTTagCompound, ce_1.b);
    }

    public Z0(zw_0 zw_02, int n, Random random, HF hF, EnumFacing enumFacing) {
        super(zw_02, n);
        this.c = enumFacing;
        this.b = hF;
        this.g = MathInvoker.max(aqu_2.e(hF), aqu_2.d(hF));
    }
}

