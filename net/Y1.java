/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import deobf.NBTTagList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Y1
extends Y_ {
    private List<HF> d = my_0.b();

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = new NBTTagList();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            HF hF = (HF)dz_0.b(iterator);
            kv_0.a(nBTTagList, aqu_2.a(hF));
        }
        tn_0.a(nBTTagCompound, aOI.a, nBTTagList);
    }

    public Y1() {
    }

    public Y1(int n, Random random, int n2, int n3) {
        super(n);
        this.b = new HF(n2, 50, n3, n2 + 7 + a5_0.a(random, 6), 54 + a5_0.a(random, 6), n3 + 7 + a5_0.a(random, 6));
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aOI.b, 11);
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            ListInvoker.add(this.d, new HF(kv_0.c(nBTTagList, i)));
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            HF hF = (HF)dz_0.b(iterator);
            aqu_2.a(hF, n, n2, n3);
        }
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        HF hF;
        Y_ y_2;
        int n;
        int n2 = this.a();
        int n3 = aqu_2.c(this.b) - 3 - 1;
        n3 = 1;
        for (n = 0; n < aqu_2.e(this.b) && (n += a5_0.a(random, aqu_2.e(this.b))) + 3 <= aqu_2.e(this.b); n += 4) {
            y_2 = acq_0.a(y_, list, random, this.b.f + n, this.b.c + a5_0.a(random, n3) + 1, this.b.b - 1, EnumFacing.NORTH, n2);
            hF = y_2.d();
            ListInvoker.add(this.d, new HF(hF.f, hF.c, this.b.b, hF.d, hF.a, this.b.b + 1));
        }
        for (n = 0; n < aqu_2.e(this.b) && (n += a5_0.a(random, aqu_2.e(this.b))) + 3 <= aqu_2.e(this.b); n += 4) {
            y_2 = acq_0.a(y_, list, random, this.b.f + n, this.b.c + a5_0.a(random, n3) + 1, this.b.e + 1, EnumFacing.SOUTH, n2);
            hF = y_2.d();
            ListInvoker.add(this.d, new HF(hF.f, hF.c, this.b.e - 1, hF.d, hF.a, this.b.e));
        }
        for (n = 0; n < aqu_2.d(this.b) && (n += a5_0.a(random, aqu_2.d(this.b))) + 3 <= aqu_2.d(this.b); n += 4) {
            y_2 = acq_0.a(y_, list, random, this.b.f - 1, this.b.c + a5_0.a(random, n3) + 1, this.b.b + n, EnumFacing.WEST, n2);
            hF = y_2.d();
            ListInvoker.add(this.d, new HF(this.b.f, hF.c, hF.b, this.b.f + 1, hF.a, hF.e));
        }
        for (n = 0; n < aqu_2.d(this.b) && (n += a5_0.a(random, aqu_2.d(this.b))) + 3 <= aqu_2.d(this.b); n += 4) {
            y_2 = acq_0.a(y_, list, random, this.b.d + 1, this.b.c + a5_0.a(random, n3) + 1, this.b.b + n, EnumFacing.EAST, n2);
            hF = y_2.d();
            ListInvoker.add(this.d, new HF(this.b.d - 1, hF.c, hF.b, this.b.d, hF.a, hF.e));
        }
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, this.b.f, this.b.c, this.b.b, this.b.d, this.b.c, this.b.e, BlocksInvoker.t(Blocks.dirt), BlocksInvoker.t(Blocks.air), true);
        this.a(world, hF, this.b.f, this.b.c + 1, this.b.b, this.b.d, MathInvoker.b(this.b.c + 3, this.b.a), this.b.e, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            HF hF2 = (HF)dz_0.b(iterator);
            this.a(world, hF, hF2.f, hF2.a - 2, hF2.b, hF2.d, hF2.a, hF2.e, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        }
        this.a(world, hF, this.b.f, this.b.c + 4, this.b.b, this.b.d, this.b.a, this.b.e, BlocksInvoker.t(Blocks.air), false);
        return true;
    }
}

