/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class C6
extends BT {
    private int c;
    private int b;
    private ItemStack d;

    public C6(ItemStack itemStack, int n, int n2, int n3) {
        super(n3);
        this.d = itemStack;
        this.c = n;
        this.b = n2;
    }

    public C6(Item item, int n, int n2, int n3, int n4) {
        super(n4);
        this.d = new ItemStack(item, 1, n);
        this.c = n2;
        this.b = n3;
    }

    public static void a(Random random, List<C6> list, rs_1 rs_12, int n) {
        for (int i = 0; i < n; ++i) {
            C6 c6 = (C6)mp_1.a(random, list);
            int n2 = c6.c + a5_0.a(random, c6.b - c6.c + 1);
            if (act_2.f(c6.d) >= n2) {
                ItemStack itemStack = act_2.C(c6.d);
                itemStack.a = n2;
                apw_0.a(rs_12, a5_0.a(random, apw_0.c(rs_12)), itemStack);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                ItemStack itemStack = act_2.C(c6.d);
                itemStack.a = 1;
                apw_0.a(rs_12, a5_0.a(random, apw_0.c(rs_12)), itemStack);
            }
        }
    }

    public static List<C6> a(List<C6> list, C6 ... c6Array) {
        ArrayList arrayList = my_0.a(list);
        asg_0.a((Collection)arrayList, c6Array);
        return arrayList;
    }

    public static void a(Random random, List<C6> list, a6B a6B2, int n) {
        for (int i = 0; i < n; ++i) {
            C6 c6 = (C6)mp_1.a(random, list);
            int n2 = c6.c + a5_0.a(random, c6.b - c6.c + 1);
            if (act_2.f(c6.d) >= n2) {
                ItemStack itemStack = act_2.C(c6.d);
                itemStack.a = n2;
                a24.a(a6B2, a5_0.a(random, a24.a(a6B2)), itemStack);
                continue;
            }
            for (int j = 0; j < n2; ++j) {
                ItemStack itemStack = act_2.C(c6.d);
                itemStack.a = 1;
                a24.a(a6B2, a5_0.a(random, a24.a(a6B2)), itemStack);
            }
        }
    }
}

