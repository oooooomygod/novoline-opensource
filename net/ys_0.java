/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Ys
 */
public class ys_0
extends YC {
    private boolean j;
    private static List<C6> h;
    private boolean i;
    private boolean m;
    private boolean k;
    private static td_1 n;
    private static List<C6> l;

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, aph_2.d, this.k);
        tn_0.a(nBTTagCompound, aph_2.h, this.m);
        tn_0.a(nBTTagCompound, aph_2.c, this.i);
        tn_0.a(nBTTagCompound, aph_2.b, this.j);
    }

    public ys_0(Random random, int n, int n2) {
        super(random, n, 64, n2, 12, 10, 15);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.k = tn_0.c(nBTTagCompound, aph_2.g);
        this.m = tn_0.c(nBTTagCompound, aph_2.e);
        this.i = tn_0.c(nBTTagCompound, aph_2.f);
        this.j = tn_0.c(nBTTagCompound, aph_2.a);
    }

    public ys_0() {
    }

    static {
        l = my_0.a(new C6[]{new C6(Items.diamond, 0, 1, 3, 3), new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 2, 7, 15), new C6(Items.emerald, 0, 1, 3, 2), new C6(Items.bone, 0, 4, 6, 20), new C6(Items.rotten_flesh, 0, 3, 7, 16), new C6(Items.saddle, 0, 1, 1, 3), new C6(Items.iron_horse_armor, 0, 1, 1, 1), new C6(Items.golden_horse_armor, 0, 1, 1, 1), new C6(Items.diamond_horse_armor, 0, 1, 1, 1)});
        h = my_0.a(new C6[]{new C6(Items.arrow, 0, 2, 7, 30)});
        n = new td_1(null);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (!this.a(world, hF, 0)) {
            return false;
        }
        this.a(Blocks.U, 3);
        this.a(Blocks.U, 2);
        this.a(Blocks.U, 0);
        this.a(Blocks.U, 1);
        this.a(world, hF, 0, -4, 0, this.g - 1, 0, this.f - 1, false, random, n);
        this.a(world, hF, 2, 1, 2, 9, 2, 2, false, random, n);
        this.a(world, hF, 2, 1, 12, 9, 2, 12, false, random, n);
        this.a(world, hF, 2, 1, 3, 2, 2, 11, false, random, n);
        this.a(world, hF, 9, 1, 3, 9, 2, 11, false, random, n);
        this.a(world, hF, 1, 3, 1, 10, 6, 1, false, random, n);
        this.a(world, hF, 1, 3, 13, 10, 6, 13, false, random, n);
        this.a(world, hF, 1, 3, 2, 1, 6, 12, false, random, n);
        this.a(world, hF, 10, 3, 2, 10, 6, 12, false, random, n);
        this.a(world, hF, 2, 3, 2, 9, 3, 12, false, random, n);
        this.a(world, hF, 2, 6, 2, 9, 6, 12, false, random, n);
        this.a(world, hF, 3, 7, 3, 8, 7, 11, false, random, n);
        this.a(world, hF, 4, 8, 4, 7, 8, 10, false, random, n);
        this.a(world, hF, 3, 1, 3, 8, 2, 11);
        this.a(world, hF, 4, 3, 6, 7, 3, 9);
        this.a(world, hF, 2, 4, 2, 9, 5, 12);
        this.a(world, hF, 4, 6, 5, 7, 6, 9);
        this.a(world, hF, 5, 7, 6, 6, 7, 8);
        this.a(world, hF, 5, 1, 2, 6, 2, 2);
        this.a(world, hF, 5, 2, 12, 6, 2, 12);
        this.a(world, hF, 5, 5, 1, 6, 5, 1);
        this.a(world, hF, 5, 5, 13, 6, 5, 13);
        this.b(world, BlocksInvoker.t(Blocks.air), 1, 5, 5, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 10, 5, 5, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 1, 5, 9, hF);
        this.b(world, BlocksInvoker.t(Blocks.air), 10, 5, 9, hF);
        int n = 0;
        while (true) {
            this.a(world, hF, 2, 4, n, 2, 5, n, false, random, ys_0.n);
            this.a(world, hF, 4, 4, n, 4, 5, n, false, random, ys_0.n);
            this.a(world, hF, 7, 4, n, 7, 5, n, false, random, ys_0.n);
            this.a(world, hF, 9, 4, n, 9, 5, n, false, random, ys_0.n);
            n += 14;
        }
    }
}

