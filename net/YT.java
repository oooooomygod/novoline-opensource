/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class YT
extends Y_ {
    public static HF a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        HF hF = new HF(n, n2 - 5, n3, n, n2 + 2, n3);
        switch (aRI.a[enumFacing.ordinal()]) {
            case 1: {
                hF.d = n + 2;
                hF.b = n3 - 8;
                break;
            }
            case 2: {
                hF.d = n + 2;
                hF.e = n3 + 8;
                break;
            }
            case 3: {
                hF.f = n - 8;
                hF.e = n3 + 2;
                break;
            }
            case 4: {
                hF.d = n + 8;
                hF.e = n3 + 2;
            }
        }
        return Y_.a(list, hF) != null ? null : hF;
    }

    public YT() {
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 5, 0, 2, 7, 1, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 0, 7, 2, 2, 8, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        int n = 0;
        while (true) {
            this.a(world, hF, 0, 5 - n - 1, 2 + n, 2, 7 - n, 2 + n, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            ++n;
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        int n = this.a();
        if (this.c != null) {
            switch (aRI.a[this.c.ordinal()]) {
                case 1: {
                    acq_0.a(y_, list, random, this.b.f, this.b.c, this.b.b - 1, EnumFacing.NORTH, n);
                    break;
                }
                case 2: {
                    acq_0.a(y_, list, random, this.b.f, this.b.c, this.b.e + 1, EnumFacing.SOUTH, n);
                    break;
                }
                case 3: {
                    acq_0.a(y_, list, random, this.b.f - 1, this.b.c, this.b.b, EnumFacing.WEST, n);
                    break;
                }
                case 4: {
                    acq_0.a(y_, list, random, this.b.d + 1, this.b.c, this.b.b, EnumFacing.EAST, n);
                }
            }
        }
    }

    public YT(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }
}

