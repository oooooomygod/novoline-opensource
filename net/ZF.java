/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

public class ZF
extends ZA {
    private static List<C6> f = my_0.a(new C6[]{new C6(Items.book, 0, 1, 3, 20), new C6(Items.paper, 0, 2, 7, 20), new C6(Items.map, 0, 1, 1, 1), new C6(Items.compass, 0, 1, 1, 1)});
    private boolean e;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.e = tn_0.c(nBTTagCompound, aqq_2.b);
    }

    public static ZF a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -4, -1, 0, 14, 11, 15, enumFacing);
        if (!(ZF.a(hF) && Y_.a(list, hF) == null || ZF.a(hF = aqu_2.a(n, n2, n3, -4, -1, 0, 14, 6, 15, enumFacing)) && Y_.a(list, hF) == null)) {
            return null;
        }
        return new ZF(n4, random, hF, enumFacing);
    }

    public ZF() {
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, aqq_2.a, this.e);
    }

    public ZF(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
        this.e = aqu_2.c(hF) > 6;
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        int n = 11;
        if (!this.e) {
            n = 6;
        }
        this.a(world, hF, 0, 0, 0, 13, n - 1, 14, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 4, 1, 0);
        this.a(world, hF, random, 0.07f, 2, 1, 1, 11, 4, 13, BlocksInvoker.t(Blocks.bI), BlocksInvoker.t(Blocks.bI), false);
        int n2 = 1;
        while (true) {
            int cfr_ignored_0 = (n2 - 1) % 4;
            this.a(world, hF, 1, 1, n2, 1, 4, n2, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
            this.a(world, hF, 12, 1, n2, 12, 4, n2, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
            this.b(world, BlocksInvoker.t(Blocks.bD), 2, 3, n2, hF);
            this.b(world, BlocksInvoker.t(Blocks.bD), 11, 3, n2, hF);
            if (this.e) {
                this.a(world, hF, 1, 6, n2, 1, 9, n2, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
                this.a(world, hF, 12, 6, n2, 12, 9, n2, BlocksInvoker.t(Blocks.planks), BlocksInvoker.t(Blocks.planks), false);
            }
            ++n2;
        }
    }
}

