/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from net.aLf
 */
public class alf_0 {
    private static String b;

    public static boolean d(EntityLivingBase entityLivingBase) {
        return ER.f(entityLivingBase);
    }

    public static void b(String string) {
        b = string;
    }

    static {
        if (alf_0.b() != null) {
            alf_0.b("OCTqTb");
        }
    }

    public static void a(Map map, ItemStack itemStack) {
        ER.a(map, itemStack);
    }

    public static String b() {
        return b;
    }

    public static int h(EntityLivingBase entityLivingBase) {
        return ER.c(entityLivingBase);
    }

    public static ItemStack b(Random random, ItemStack itemStack, int n) {
        return ER.b(random, itemStack, n);
    }

    public static int e(EntityLivingBase entityLivingBase) {
        return ER.e(entityLivingBase);
    }

    public static int b(Entity entity) {
        return ER.a(entity);
    }

    public static ItemStack a(yl_2 yl_22, EntityLivingBase entityLivingBase) {
        return ER.a(yl_22, entityLivingBase);
    }

    public static int b(EntityLivingBase entityLivingBase) {
        return ER.a(entityLivingBase);
    }

    public static Map a(ItemStack itemStack) {
        return ER.a(itemStack);
    }

    public static int a(int n, ItemStack itemStack) {
        return ER.a(n, itemStack);
    }

    public static void b(EntityLivingBase entityLivingBase, Entity entity) {
        ER.b(entityLivingBase, entity);
    }

    public static boolean c(EntityLivingBase entityLivingBase) {
        return ER.i(entityLivingBase);
    }

    public static int getEfficiencyModifier(EntityLivingBase entityLivingBase) {
        return ER.d(entityLivingBase);
    }

    public static int a(int n, ItemStack[] itemStackArray) {
        return ER.a(n, itemStackArray);
    }

    public static int a(Entity entity) {
        return ER.b(entity);
    }

    public static void a(EntityLivingBase entityLivingBase, Entity entity) {
        ER.a(entityLivingBase, entity);
    }

    public static int f(EntityLivingBase entityLivingBase) {
        return ER.h(entityLivingBase);
    }

    public static float a(ItemStack itemStack, aH2 aH22) {
        return ER.a(itemStack, aH22);
    }

    public static int a(Random random, int n, int n2, ItemStack itemStack) {
        return ER.a(random, n, n2, itemStack);
    }

    public static int a(ItemStack[] itemStackArray, DamageSource damageSource) {
        return ER.a(itemStackArray, damageSource);
    }

    public static int a(EntityLivingBase entityLivingBase) {
        return ER.b(entityLivingBase);
    }

    public static int i(EntityLivingBase entityLivingBase) {
        return ER.g(entityLivingBase);
    }

    public static List a(Random random, ItemStack itemStack, int n) {
        return ER.a(random, itemStack, n);
    }
}

