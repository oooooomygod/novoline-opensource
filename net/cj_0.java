/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.Cj
 */
public class cj_0
extends BT {
    private float b;
    private boolean c;
    private ItemStack d;

    public cj_0 a() {
        this.c = true;
        return this;
    }

    public cj_0 a(float f) {
        this.b = f;
        return this;
    }

    public ItemStack a(Random random) {
        ItemStack itemStack = act_2.C(this.d);
        if (this.b > 0.0f) {
            int n = (int)(this.b * (float)act_2.u(this.d));
            int n2 = act_2.u(itemStack) - a5_0.a(random, a5_0.a(random, n) + 1);
            if (n2 > n) {
                n2 = n;
            }
            if (n2 < 1) {
                n2 = 1;
            }
            act_2.a(itemStack, n2);
        }
        if (this.c) {
            alf_0.b(random, itemStack, 30);
        }
        return itemStack;
    }

    public cj_0(ItemStack itemStack, int n) {
        super(n);
        this.d = itemStack;
    }
}

