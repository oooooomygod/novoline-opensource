/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

abstract class YJ
extends Y_ {
    protected static List<C6> d = my_0.a(new C6[]{new C6(Items.diamond, 0, 1, 3, 5), new C6(Items.iron_ingot, 0, 1, 5, 5), new C6(Items.gold_ingot, 0, 1, 3, 15), new C6(Items.golden_sword, 0, 1, 1, 5), new C6(Items.golden_chestplate, 0, 1, 1, 5), new C6(Items.flint_and_steel, 0, 1, 1, 5), new C6(Items.nether_wart, 0, 3, 7, 5), new C6(Items.saddle, 0, 1, 1, 10), new C6(Items.golden_horse_armor, 0, 1, 1, 8), new C6(Items.iron_horse_armor, 0, 1, 1, 5), new C6(Items.diamond_horse_armor, 0, 1, 1, 3), new C6(px_0.a(Blocks.O), 0, 2, 4, 2)});

    protected static boolean a(HF hF) {
        return hF.c > 10;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
    }

    protected YJ(int n) {
        super(n);
    }

    protected Y_ b(zr_0 zr_02, List<Y_> list, Random random, int n, int n2, boolean bl) {
        if (this.c != null) {
            switch (a8e_0.a[this.c.ordinal()]) {
                case 1: {
                    return this.a(zr_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a(), bl);
                }
                case 2: {
                    return this.a(zr_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a(), bl);
                }
                case 3: {
                    return this.a(zr_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a(), bl);
                }
                case 4: {
                    return this.a(zr_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a(), bl);
                }
            }
        }
        return null;
    }

    protected Y_ c(zr_0 zr_02, List<Y_> list, Random random, int n, int n2, boolean bl) {
        if (this.c != null) {
            switch (a8e_0.a[this.c.ordinal()]) {
                case 1: {
                    return this.a(zr_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a(), bl);
                }
                case 2: {
                    return this.a(zr_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a(), bl);
                }
                case 3: {
                    return this.a(zr_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a(), bl);
                }
                case 4: {
                    return this.a(zr_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a(), bl);
                }
            }
        }
        return null;
    }

    public YJ() {
    }

    private int a(List<aga_0> list) {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            aga_0 aga_02 = (aga_0)dz_0.b(iterator);
            if (aga_02.d <= 0 || aga_02.e < aga_02.d) {
                // empty if block
            }
            n += aga_02.a;
        }
        return n;
    }

    private YJ a(zr_0 zr_02, List<aga_0> list, List<Y_> list2, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        aga_0 aga_02;
        int n5 = this.a(list);
        boolean bl = n4 <= 30;
        int n6 = 0;
        while (true) {
            ++n6;
            int n7 = a5_0.a(random, n5);
            Iterator iterator = ListInvoker.iterator(list);
            if (!dz_0.c(iterator)) continue;
            aga_02 = (aga_0)dz_0.b(iterator);
            n7 -= aga_02.a;
            if (aga_02.a(n4) && (aga_02 != zr_02.g || aga_02.b)) break;
        }
        YJ yJ = a7v_0.b(aga_02, list2, random, n, n2, n3, enumFacing, n4);
        ++aga_02.e;
        zr_02.g = aga_02;
        if (!aga_02.a()) {
            ListInvoker.remove(list, aga_02);
        }
        return yJ;
    }

    protected Y_ a(zr_0 zr_02, List<Y_> list, Random random, int n, int n2, boolean bl) {
        if (this.c != null) {
            switch (a8e_0.a[this.c.ordinal()]) {
                case 1: {
                    return this.a(zr_02, list, random, this.b.f + n, this.b.c + n2, this.b.b - 1, this.c, this.a(), bl);
                }
                case 2: {
                    return this.a(zr_02, list, random, this.b.f + n, this.b.c + n2, this.b.e + 1, this.c, this.a(), bl);
                }
                case 3: {
                    return this.a(zr_02, list, random, this.b.f - 1, this.b.c + n2, this.b.b + n, this.c, this.a(), bl);
                }
                case 4: {
                    return this.a(zr_02, list, random, this.b.d + 1, this.b.c + n2, this.b.b + n, this.c, this.a(), bl);
                }
            }
        }
        return null;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    private Y_ a(zr_0 zr_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4, boolean bl) {
        if (MathInvoker.a(n - zr_02.d().f) <= 112 && MathInvoker.a(n3 - zr_02.d().b) <= 112) {
            List<aga_0> list2 = zr_02.f;
            list2 = zr_02.h;
            YJ yJ = this.a(zr_02, list2, list, random, n, n2, n3, enumFacing, n4 + 1);
            ListInvoker.add(list, yJ);
            ListInvoker.add(zr_02.e, yJ);
            return yJ;
        }
        return acd_2.a(list, random, n, n2, n3, enumFacing, n4);
    }
}

