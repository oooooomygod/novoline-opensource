/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.block.BlockPos;

public class P3 {
    public static P3 a;

    private static double lambda$getPath$0(aor_2 aor_22) {
        return aou_0.c(aor_22);
    }

    private static boolean a(int n, int n2, List<aor_2> list) {
        aMK.f();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            aor_2 aor_22 = (aor_2)dz_0.b(iterator);
            if (aor_22.b == n && aor_22.d == n2) {
                return true;
            }
        }
        return false;
    }

    public static List<aor_2> a(BlockPos blockPos, BlockPos blockPos2) {
        CopyOnWriteArrayList<aor_2> copyOnWriteArrayList = new CopyOnWriteArrayList<aor_2>();
        aMK.f();
        CopyOnWriteArrayList<aor_2> copyOnWriteArrayList2 = new CopyOnWriteArrayList<aor_2>();
        aor_2 aor_22 = new aor_2(amv_2.j(blockPos), amv_2.i(blockPos), 0, 0);
        aor_2 aor_23 = new aor_2(amv_2.j(blockPos), amv_2.i(blockPos), 0, P3.a(new aor_2(amv_2.j(blockPos), amv_2.i(blockPos), 0, 0), blockPos2));
        aor_2 aor_24 = new aor_2(amv_2.j(blockPos2), amv_2.i(blockPos2), P3.a(new aor_2(amv_2.j(blockPos2), amv_2.i(blockPos2), 0, 0), blockPos), 0);
        int n = 0;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        int n2 = -1;
        int n3 = 1;
        if (!P3.a(aor_22.b + n2, aor_22.d + n3, copyOnWriteArrayList2)) {
            ListInvoker.add(copyOnWriteArrayList3, new aor_2(aor_22.b + n2, aor_22.d + n3, P3.a(aor_23, new BlockPos(aor_22.b + n2, 0, aor_22.d + n3)), P3.a(aor_24, new BlockPos(aor_22.b + n2, 0, aor_22.d + n3))));
        }
        --n3;
        ++n2;
        ListInvoker.addAll(copyOnWriteArrayList2, copyOnWriteArrayList3);
        aor_22 = (aor_2)ListInvoker.get((List)aMF.a(aMF.a(ListInvoker.stream(copyOnWriteArrayList3), aN_.a(P3::lambda$getPath$0)), aB0.a()), 0);
        ListInvoker.add(copyOnWriteArrayList, aor_22);
        if (aor_22.e == 0) {
            // empty if block
        }
        ++n;
        if (ListInvoker.b() != null) {
            aMK.b("KDrqnc");
        }
        return copyOnWriteArrayList;
    }

    public static P3 a() {
        return a;
    }

    /*
     * WARNING - void declaration
     */
    private static int a(aor_2 aor_22, BlockPos blockPos) {
        int n = MathInvoker.a(aou_0.a(aor_22) - amv_2.j(blockPos));
        aMK.f();
        int n2 = MathInvoker.a(aou_0.b(aor_22) - amv_2.i(blockPos));
        int n3 = 0;
        if (n > 0) {
            void var6_5;
            n3 += 14;
            --var6_5;
            if (n2 > 1) {
                n3 += 10 * --n2;
            }
            return n3;
        }
        if (n2 > 0) {
            void var6_6;
            n3 += 14;
            --var6_6;
            if (n > 1) {
                n3 += 10 * --n;
            }
            return n3;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    private int a(aor_2 aor_22, aor_2 aor_23) {
        aMK.f();
        int n = MathInvoker.a(aou_0.a(aor_22) - aou_0.a(aor_23));
        int n2 = MathInvoker.a(aou_0.b(aor_22) - aou_0.b(aor_23));
        int n3 = 0;
        if (n > 0) {
            void var7_6;
            n3 += 14;
            --var7_6;
            if (n2 > 1) {
                n3 += 10 * --n2;
            }
            return n3;
        }
        if (n2 > 0) {
            void var7_7;
            n3 += 14;
            --var7_7;
            if (n > 1) {
                n3 += 10 * --n;
            }
            return n3;
        }
        return 0;
    }
}

