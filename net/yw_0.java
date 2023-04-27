/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Yw
 */
public class yw_0
extends YC {
    private boolean[] h = new boolean[4];
    private static List<C6> i = my_0.a(new C6[]{new C6(Items.diamond, 0, 1, 3, 3), new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 2, 7, 15), new C6(Items.emerald, 0, 1, 3, 2), new C6(Items.bone, 0, 4, 6, 20), new C6(Items.rotten_flesh, 0, 3, 7, 16), new C6(Items.saddle, 0, 1, 1, 3), new C6(Items.iron_horse_armor, 0, 1, 1, 1), new C6(Items.golden_horse_armor, 0, 1, 1, 1), new C6(Items.diamond_horse_armor, 0, 1, 1, 1)});

    @Override
    public boolean a(World world, Random random, HF hF) {
        this.a(world, hF, 0, -4, 0, this.g - 1, 0, this.f - 1, BlocksInvoker.t(Blocks.bG), BlocksInvoker.t(Blocks.bG), false);
        int n = 1;
        while (true) {
            this.a(world, hF, n, n, n, this.g - 1 - n, n, this.f - 1 - n, BlocksInvoker.t(Blocks.bG), BlocksInvoker.t(Blocks.bG), false);
            this.a(world, hF, n + 1, n, n + 1, this.g - 2 - n, n, this.f - 2 - n, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
            ++n;
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, azx_2.c, this.h[0]);
        tn_0.a(nBTTagCompound, azx_2.f, this.h[1]);
        tn_0.a(nBTTagCompound, azx_2.g, this.h[2]);
        tn_0.a(nBTTagCompound, azx_2.a, this.h[3]);
    }

    public yw_0(Random random, int n, int n2) {
        super(random, n, 64, n2, 21, 15, 21);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.h[0] = tn_0.c(nBTTagCompound, azx_2.d);
        this.h[1] = tn_0.c(nBTTagCompound, azx_2.h);
        this.h[2] = tn_0.c(nBTTagCompound, azx_2.b);
        this.h[3] = tn_0.c(nBTTagCompound, azx_2.e);
    }

    public yw_0() {
    }
}

