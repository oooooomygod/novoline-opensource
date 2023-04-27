/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.yV
 */
public class yv_1
extends yl_2 {
    @Override
    public int c() {
        return 3;
    }

    @Override
    public int a(int n) {
        return 5 + (n - 1) * 8;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }

    protected yv_1(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.BREAKABLE);
        this.a(ahv_0.a);
    }

    public static boolean a(ItemStack itemStack, int n, Random random) {
        return !(act_2.k(itemStack) instanceof ItemArmor && a5_0.e(random) < 0.6f || a5_0.a(random, n + 1) <= 0);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.y(itemStack) || super.a(itemStack);
    }
}

