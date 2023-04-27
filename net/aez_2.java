/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.List;

/*
 * Renamed from net.aez
 */
public class aez_2 {
    public static List d(a6L a6L2) {
        return a6L2.c();
    }

    public static NBTTagList f(a6L a6L2) {
        return a6L2.a();
    }

    public static Block c(a6L a6L2) {
        return a6L2.k();
    }

    public static void a(a6L a6L2, ItemStack itemStack) {
        a6L2.c(itemStack);
    }

    public static List a(a6L a6L2) {
        return a6L2.e();
    }

    public static int a(ItemStack itemStack) {
        return a6L.a(itemStack);
    }

    public static int c(ItemStack itemStack) {
        return a6L.b(itemStack);
    }

    public static int h(a6L a6L2) {
        return a6L2.d();
    }

    public static void b(ItemStack itemStack) {
        a6L.d(itemStack);
    }

    public static String g(a6L a6L2) {
        return a6L2.f();
    }

    public static void a(NBTTagCompound nBTTagCompound, int n, NBTTagList nBTTagList) {
        a6L.a(nBTTagCompound, n, nBTTagList);
    }

    public static int e(a6L a6L2) {
        return a6L2.m();
    }

    public static BlockPos b(a6L a6L2) {
        return a6L2.i();
    }
}

