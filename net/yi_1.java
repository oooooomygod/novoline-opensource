/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.yI
 */
public class yi_1
extends yl_2 {
    public yi_1(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.ARMOR_TORSO);
        this.a(aA_.b);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) instanceof ItemArmor || super.a(itemStack);
    }

    public static boolean b(int n, Random random) {
        return a5_0.e(random) < 0.15f * (float)n;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, Entity entity, int n) {
        Random random = atn_0.v(entityLivingBase);
        ItemStack itemStack = alf_0.a(yl_2.h, entityLivingBase);
        if (yi_1.b(n, random)) {
            ayj_0.a(entity, aDJ.a((Entity)entityLivingBase), (float)yi_1.a(n, random));
            ayj_0.a(entity, aA_.a, 0.5f, 1.0f);
            act_2.damageItem(itemStack, 3, entityLivingBase);
        } else {
            act_2.damageItem(itemStack, 1, entityLivingBase);
        }
    }

    @Override
    public int c() {
        return 3;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }

    @Override
    public int a(int n) {
        return 10 + 20 * (n - 1);
    }

    public static int a(int n, Random random) {
        return n > 10 ? n - 10 : 1 + a5_0.a(random, 4);
    }
}

