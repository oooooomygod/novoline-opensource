/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;
import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.iF
 */
public class if_1
extends i7_0 {
    private static Logger b = LogManagerInvoker.c();
    private static String[] d = new String[]{amw_0.a, amw_0.b, amw_0.h, amw_0.d};
    private static List<C6> c = my_0.a(new C6[]{new C6(Items.saddle, 0, 1, 1, 10), new C6(Items.iron_ingot, 0, 1, 4, 10), new C6(Items.bread, 0, 1, 1, 10), new C6(Items.wheat, 0, 1, 4, 10), new C6(Items.gunpowder, 0, 1, 4, 10), new C6(Items.string, 0, 1, 4, 10), new C6(Items.bucket, 0, 1, 1, 10), new C6(Items.golden_apple, 0, 1, 1, 1), new C6(Items.redstone, 0, 1, 4, 10), new C6(Items.record_13, 0, 1, 1, 4), new C6(Items.record_cat, 0, 1, 1, 4), new C6(Items.name_tag, 0, 1, 1, 10), new C6(Items.golden_horse_armor, 0, 1, 1, 2), new C6(Items.iron_horse_armor, 0, 1, 1, 5), new C6(Items.diamond_horse_armor, 0, 1, 1, 1)});

    private String a(Random random) {
        return d[a5_0.a(random, d.length)];
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 2) + 2;
        int n2 = -n - 1;
        int n3 = n + 1;
        int n4 = a5_0.a(random, 2) + 2;
        int n5 = -n4 - 1;
        int n6 = n4 + 1;
        boolean bl = false;
        int n7 = n2;
        if (n7 <= n3) {
            int n8 = -1;
            while (true) {
                int n9;
                if ((n9 = n5) <= n6) {
                    BlockPos blockPos2 = amv_2.a(blockPos, n7, n8, n9);
                    Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos2)));
                    akm_1.i(material);
                    return false;
                }
                ++n8;
            }
        }
        return false;
    }
}

