/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.acQ
 */
public class acq_0 {
    private static List<C6> a = my_0.a(new C6[]{new C6(Items.iron_ingot, 0, 1, 5, 10), new C6(Items.gold_ingot, 0, 1, 3, 5), new C6(Items.redstone, 0, 4, 9, 5), new C6(Items.dye, my_2.c(YZ.BLUE), 4, 9, 5), new C6(Items.diamond, 0, 1, 2, 3), new C6(Items.coal, 0, 3, 8, 10), new C6(Items.bread, 0, 1, 3, 15), new C6(Items.iron_pickaxe, 0, 1, 1, 1), new C6(px_0.a(Blocks.bQ), 0, 4, 8, 1), new C6(Items.melon_seeds, 0, 2, 4, 10), new C6(Items.pumpkin_seeds, 0, 2, 4, 10), new C6(Items.saddle, 0, 1, 1, 3), new C6(Items.iron_horse_armor, 0, 1, 1, 1)});

    public static void b() {
        _6.b(YK.class, O7.c);
        _6.b(yb_0.class, O7.d);
        _6.b(Y1.class, O7.b);
        _6.b(YT.class, O7.a);
    }

    private static Y_ b(Y_ y_, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        if (n4 > 8) {
            return null;
        }
        if (MathInvoker.a(n - any_2.c((Y_)y_).f) <= 80 && MathInvoker.a(n3 - any_2.c((Y_)y_).b) <= 80) {
            Y_ y_2 = acq_0.a(list, random, n, n2, n3, enumFacing, n4 + 1);
            ListInvoker.add(list, y_2);
            any_2.a(y_2, y_, list, random);
            return y_2;
        }
        return null;
    }

    private static Y_ a(List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        int n5 = a5_0.a(random, 100);
        if (n5 >= 80) {
            HF hF = afs_0.a(list, random, n, n2, n3, enumFacing);
            return new yb_0(n4, random, hF, enumFacing);
        }
        if (n5 >= 70) {
            HF hF = ajv_0.a(list, random, n, n2, n3, enumFacing);
            return new YT(n4, random, hF, enumFacing);
        }
        HF hF = yc_0.a(list, random, n, n2, n3, enumFacing);
        return new YK(n4, random, hF, enumFacing);
    }

    static List a() {
        return a;
    }

    static Y_ a(Y_ y_, List list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        return acq_0.b(y_, list, random, n, n2, n3, enumFacing, n4);
    }
}

