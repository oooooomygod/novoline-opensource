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
 * Renamed from net.Zf
 */
public class zf_0
extends ZA {
    private static List<C6> e = my_0.a(new C6[]{new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 1, 3, 5), new C6(Items.redstone, 0, 4, 9, 5), new C6(Items.coal, 0, 3, 8, 10), new C6(Items.bread, 0, 1, 3, 15), new C6(Items.apple, 0, 1, 3, 15), new C6(Items.iron_pickaxe, 0, 1, 1, 1)});
    protected int f;

    public zf_0() {
    }

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((ze_0)y_, list, random, 4, 1);
        this.b((ze_0)y_, list, random, 1, 4);
        this.a((ze_0)y_, list, random, 1, 4);
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.b(nBTTagCompound, axy_2.b, this.f);
    }

    public static zf_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -4, -1, 0, 11, 7, 11, enumFacing);
        return zf_0.a(hF) && Y_.a(list, hF) == null ? new zf_0(n4, random, hF, enumFacing) : null;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.f = tn_0.g(nBTTagCompound, axy_2.a);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 10, 6, 10, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 4, 1, 0);
        this.a(world, hF, 4, 1, 10, 6, 3, 10, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 0, 1, 4, 0, 3, 6, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        this.a(world, hF, 10, 1, 4, 10, 3, 6, BlocksInvoker.t(Blocks.air), BlocksInvoker.t(Blocks.air), false);
        switch (this.f) {
            case 0: {
                this.b(world, BlocksInvoker.t(Blocks.z), 5, 1, 5, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), 5, 2, 5, hF);
                this.b(world, BlocksInvoker.t(Blocks.z), 5, 3, 5, hF);
                this.b(world, BlocksInvoker.t(Blocks.bD), 4, 3, 5, hF);
                this.b(world, BlocksInvoker.t(Blocks.bD), 6, 3, 5, hF);
                this.b(world, BlocksInvoker.t(Blocks.bD), 5, 3, 4, hF);
                this.b(world, BlocksInvoker.t(Blocks.bD), 5, 3, 6, hF);
                this.b(world, abv_0.a(Blocks.bA), 4, 1, 4, hF);
                this.b(world, abv_0.a(Blocks.bA), 4, 1, 5, hF);
                this.b(world, abv_0.a(Blocks.bA), 4, 1, 6, hF);
                this.b(world, abv_0.a(Blocks.bA), 6, 1, 4, hF);
                this.b(world, abv_0.a(Blocks.bA), 6, 1, 5, hF);
                this.b(world, abv_0.a(Blocks.bA), 6, 1, 6, hF);
                this.b(world, abv_0.a(Blocks.bA), 5, 1, 4, hF);
                this.b(world, abv_0.a(Blocks.bA), 5, 1, 6, hF);
                break;
            }
            case 1: {
                int n = 0;
                while (true) {
                    this.b(world, BlocksInvoker.t(Blocks.z), 3, 1, 3 + n, hF);
                    this.b(world, BlocksInvoker.t(Blocks.z), 7, 1, 3 + n, hF);
                    this.b(world, BlocksInvoker.t(Blocks.z), 3 + n, 1, 3, hF);
                    this.b(world, BlocksInvoker.t(Blocks.z), 3 + n, 1, 7, hF);
                    ++n;
                }
            }
            case 2: {
                int n = 1;
                while (true) {
                    this.b(world, BlocksInvoker.t(Blocks.cobblestone), 1, 3, n, hF);
                    this.b(world, BlocksInvoker.t(Blocks.cobblestone), 9, 3, n, hF);
                    ++n;
                }
            }
        }
        return true;
    }

    public zf_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
        this.f = a5_0.a(random, 5);
    }
}

