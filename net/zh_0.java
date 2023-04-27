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
 * Renamed from net.Zh
 */
public class zh_0
extends ZA {
    private boolean f;
    private static List<C6> e = my_0.a(new C6[]{new C6(Items.ender_pearl, 0, 1, 1, 10), new C6(Items.diamond, 0, 1, 3, 3), new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 1, 3, 5), new C6(Items.redstone, 0, 4, 9, 5), new C6(Items.bread, 0, 1, 3, 15), new C6(Items.apple, 0, 1, 3, 15), new C6(Items.iron_pickaxe, 0, 1, 1, 5), new C6(Items.iron_sword, 0, 1, 1, 5), new C6(Items.iron_chestplate, 0, 1, 1, 5), new C6(Items.iron_helmet, 0, 1, 1, 5), new C6(Items.iron_leggings, 0, 1, 1, 5), new C6(Items.iron_boots, 0, 1, 1, 5), new C6(Items.golden_apple, 0, 1, 1, 1), new C6(Items.saddle, 0, 1, 1, 1), new C6(Items.iron_horse_armor, 0, 1, 1, 1), new C6(Items.golden_horse_armor, 0, 1, 1, 1), new C6(Items.diamond_horse_armor, 0, 1, 1, 1)});

    @Override
    public void a(Y_ y_, List<Y_> list, Random random) {
        this.c((ze_0)y_, list, random, 1, 1);
    }

    public zh_0() {
    }

    public zh_0(int n, Random random, HF hF, EnumFacing enumFacing) {
        super(n);
        this.c = enumFacing;
        this.d = this.a(random);
        this.b = hF;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        tn_0.a(nBTTagCompound, AH.b, this.f);
    }

    @Override
    public boolean a(World world, Random random, HF hF) {
        if (this.a(world, hF)) {
            return false;
        }
        this.a(world, hF, 0, 0, 0, 4, 4, 6, true, random, aPZ.c());
        this.a(world, random, hF, this.d, 1, 1, 0);
        this.a(world, random, hF, aB6.OPENING, 1, 1, 6);
        this.a(world, hF, 3, 1, 2, 3, 1, 4, BlocksInvoker.t(Blocks.z), BlocksInvoker.t(Blocks.z), false);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK)), 3, 1, 1, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK)), 3, 1, 5, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK)), 3, 2, 2, hF);
        this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK)), 3, 2, 4, hF);
        int n = 2;
        while (true) {
            this.b(world, abv_0.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK)), 2, 1, n, hF);
            ++n;
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        this.f = tn_0.c(nBTTagCompound, AH.a);
    }

    public static zh_0 a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        HF hF = aqu_2.a(n, n2, n3, -1, -1, 0, 5, 5, 7, enumFacing);
        return zh_0.a(hF) && Y_.a(list, hF) == null ? new zh_0(n4, random, hF, enumFacing) : null;
    }
}

