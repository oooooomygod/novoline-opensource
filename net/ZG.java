/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZG
extends ZA {
    private int e;

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, cq_2.b, this.e);
    }

    public static HF a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing) {
        HF hF = aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, 4, enumFacing);
        Y_ y_ = Y_.a(list, hF);
        if (y_.d().c == hF.c) {
            int n4 = 3;
            while (true) {
                hF = aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, n4 - 1, enumFacing);
                if (!aqu_2.b(y_.d(), hF)) {
                    return aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, n4, enumFacing);
                }
                --n4;
            }
        }
        return null;
    }

    public ZG() {
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        int n = 0;
        if (n < this.e) {
            this.b(world, BlocksInvoker.t(Blocks.z), 0, 0, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 1, 0, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 2, 0, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 3, 0, n, hF);
            this.b(world, BlocksInvoker.t(Blocks.z), 4, 0, n, hF);
            int n2 = 1;
            while (true) {
                this.b(world, BlocksInvoker.t(Blocks.z), 0, n2, n, hF);
                this.b(world, BlocksInvoker.t(Blocks.air), 1, n2, n, hF);
                this.b(world, BlocksInvoker.t(Blocks.air), 2, n2, n, hF);
                this.b(world, BlocksInvoker.t(Blocks.air), 3, n2, n, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), 4, n2, n, hF);
                ++n2;
            }
        }
        return true;
    }

    public ZG(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
        this.e = enumFacing != EnumFacing.NORTH && enumFacing != EnumFacing.SOUTH ? aqu_2.e(hF) : aqu_2.d(hF);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.g(nBTTagCompound, cq_2.a);
    }
}

