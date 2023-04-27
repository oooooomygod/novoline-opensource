/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Zt
 */
public class zt_0
extends ZA {
    private boolean f;
    private boolean e;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.f = tn_0.c(nBTTagCompound, as5_0.b);
        this.e = tn_0.c(nBTTagCompound, as5_0.a);
    }

    public zt_0() {
    }

    public static zt_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, 7, enumFacing);
        return zt_0.a(hF) && Y_.a(list, hF) == null ? new zt_0(n4, random, hF, enumFacing) : null;
    }

    public zt_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
        this.f = a5_0.a(random, 2) == 0;
        this.e = a5_0.a(random, 2) == 0;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 4, 4, 6, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 1, 0);
        this.a(world, random, hF, aB6.OPENING, 1, 1, 6);
        this.a(world, hF, random, 0.1f, 1, 2, 1, BlocksInvoker.t(Blocks.bD));
        this.a(world, hF, random, 0.1f, 3, 2, 1, BlocksInvoker.t(Blocks.bD));
        this.a(world, hF, random, 0.1f, 1, 2, 5, BlocksInvoker.t(Blocks.bD));
        this.a(world, hF, random, 0.1f, 3, 2, 5, BlocksInvoker.t(Blocks.bD));
        if (this.f) {
            this.a(world, hF, 0, 1, 2, 0, 3, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        if (this.e) {
            this.a(world, hF, 4, 1, 2, 4, 3, 4, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        return true;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((ze_0)y_, list, random, 1, 1);
        if (this.f) {
            this.b((ze_0)y_, list, random, 1, 2);
        }
        if (this.e) {
            this.a((ze_0)y_, list, random, 1, 2);
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, as5_0.d, this.f);
        tn_0.a(nBTTagCompound, as5_0.c, this.e);
    }
}

