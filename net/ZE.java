/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZE
extends ZA {
    private boolean h;
    private boolean g;
    private boolean f;
    private boolean e;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.h = tn_0.c(nBTTagCompound, agl_2.e);
        this.g = tn_0.c(nBTTagCompound, agl_2.b);
        this.e = tn_0.c(nBTTagCompound, agl_2.c);
        this.f = tn_0.c(nBTTagCompound, agl_2.d);
    }

    public static ZE a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -4, -3, 0, 10, 9, 11, enumFacing);
        return ZE.a(hF) && Y_.a(list, hF) == null ? new ZE(n4, random, hF, enumFacing) : null;
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        int n = 3;
        int n2 = 5;
        if (this.c == EnumFacing.WEST || this.c == EnumFacing.NORTH) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.c((ze_0)y_, list, random, 5, 1);
        if (this.h) {
            this.b((ze_0)y_, list, random, n, 1);
        }
        if (this.g) {
            this.b((ze_0)y_, list, random, n2, 7);
        }
        if (this.e) {
            this.a((ze_0)y_, list, random, n, 1);
        }
        if (this.f) {
            this.a((ze_0)y_, list, random, n2, 7);
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, agl_2.h, this.h);
        tn_0.a(nBTTagCompound, agl_2.g, this.g);
        tn_0.a(nBTTagCompound, agl_2.f, this.e);
        tn_0.a(nBTTagCompound, agl_2.a, this.f);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 9, 8, 10, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 4, 3, 0);
        if (this.h) {
            this.a(world, hF, 0, 3, 1, 0, 5, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        if (this.e) {
            this.a(world, hF, 9, 3, 1, 9, 5, 3, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        if (this.g) {
            this.a(world, hF, 0, 5, 7, 0, 7, 9, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        if (this.f) {
            this.a(world, hF, 9, 5, 7, 9, 7, 9, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        this.a(world, hF, 5, 1, 10, 7, 3, 10, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 1, 2, 1, 8, 2, 6, false, random, aPZ.c());
        this.a(world, hF, 4, 1, 5, 4, 4, 9, false, random, aPZ.c());
        this.a(world, hF, 8, 1, 5, 8, 4, 9, false, random, aPZ.c());
        this.a(world, hF, 1, 4, 7, 3, 4, 9, false, random, aPZ.c());
        this.a(world, hF, 1, 3, 5, 3, 3, 6, false, random, aPZ.c());
        this.a(world, hF, 1, 3, 4, 3, 3, 4, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 1, 4, 6, 3, 4, 6, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 5, 1, 7, 7, 1, 8, false, random, aPZ.c());
        this.a(world, hF, 5, 1, 9, 7, 1, 9, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 5, 2, 7, 7, 2, 7, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 4, 5, 7, 4, 5, 9, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 8, 5, 7, 8, 5, 9, abv_0.a(Blocks.bA), abv_0.a(Blocks.bA), false);
        this.a(world, hF, 5, 5, 7, 7, 5, 9, abv_0.a(Blocks.X), abv_0.a(Blocks.X), false);
        this.b(world, BlocksInvoker.t(Blocks.bD), 6, 5, 6, hF);
        return true;
    }

    public ZE() {
    }

    public ZE(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
        this.h = a5_0.a(random);
        this.g = a5_0.a(random);
        this.e = a5_0.a(random);
        this.f = a5_0.a(random, 3) > 0;
    }
}

