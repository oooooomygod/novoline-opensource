/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZZ
extends ZA {
    private boolean e;

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, a5v.c, this.e);
    }

    public ZZ(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.b = hF;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, 0, 0, 10, 7, 15, false, random, aPZ.c());
        this.a(world, random, hF, aB6.GRATES, 4, 1, 0);
        int n = 6;
        this.a(world, hF, 1, n, 1, 1, n, 14, false, random, aPZ.c());
        this.a(world, hF, 9, n, 1, 9, n, 14, false, random, aPZ.c());
        this.a(world, hF, 2, n, 1, 8, n, 2, false, random, aPZ.c());
        this.a(world, hF, 2, n, 14, 8, n, 14, false, random, aPZ.c());
        this.a(world, hF, 1, 1, 1, 2, 1, 4, false, random, aPZ.c());
        this.a(world, hF, 8, 1, 1, 9, 1, 4, false, random, aPZ.c());
        this.a(world, hF, 1, 1, 1, 1, 1, 3, db_2.a(Blocks.flowing_lava), db_2.a(Blocks.flowing_lava), false);
        this.a(world, hF, 9, 1, 1, 9, 1, 3, db_2.a(Blocks.flowing_lava), db_2.a(Blocks.flowing_lava), false);
        this.a(world, hF, 3, 1, 8, 7, 1, 12, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 9, 6, 1, 11, db_2.a(Blocks.flowing_lava), db_2.a(Blocks.flowing_lava), false);
        int n2 = 3;
        while (true) {
            this.a(world, hF, 0, 3, n2, 0, 4, n2, BlocksInvoker.t(Blocks.by), BlocksInvoker.t(Blocks.by), false);
            this.a(world, hF, 10, 3, n2, 10, 4, n2, BlocksInvoker.t(Blocks.by), BlocksInvoker.t(Blocks.by), false);
            n2 += 2;
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, a5v.b);
    }

    public ZZ() {
    }

    public static ZZ a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -4, -1, 0, 11, 8, 16, enumFacing);
        return ZZ.a(hF) && Y_.a(list, hF) == null ? new ZZ(n4, random, hF, enumFacing) : null;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        ((ze_0)y_).f = this;
    }
}

