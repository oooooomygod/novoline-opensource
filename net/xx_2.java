/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import java.util.List;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.xx
 */
public class xx_2 {
    private static int[] b;

    public static int i(aym_1 aym_12) {
        return aym_12.k();
    }

    public static boolean a(aym_1 aym_12, BlockPos blockPos) {
        return aym_12.e(blockPos);
    }

    public static void a(aym_1 aym_12, NBTTagCompound nBTTagCompound) {
        aym_12.b(nBTTagCompound);
    }

    public static aY6 c(aym_1 aym_12, BlockPos blockPos) {
        return aym_12.b(blockPos);
    }

    public static int e(aym_1 aym_12) {
        return aym_12.f();
    }

    public static aY6 b(aym_1 aym_12, BlockPos blockPos) {
        return aym_12.d(blockPos);
    }

    public static void a(aym_1 aym_12, EntityLivingBase entityLivingBase) {
        aym_12.b(entityLivingBase);
    }

    public static aY6 d(aym_1 aym_12, BlockPos blockPos) {
        return aym_12.a(blockPos);
    }

    public static EntityPlayer c(aym_1 aym_12, EntityLivingBase entityLivingBase) {
        return aym_12.a(entityLivingBase);
    }

    static {
        if (xx_2.b() == null) {
            xx_2.b(new int[2]);
        }
    }

    public static void b(aym_1 aym_12) {
        aym_12.e();
    }

    public static void b(aym_1 aym_12, NBTTagCompound nBTTagCompound) {
        aym_12.a(nBTTagCompound);
    }

    public static List d(aym_1 aym_12) {
        return aym_12.a();
    }

    public static int a(aym_1 aym_12) {
        return aym_12.i();
    }

    public static BlockPos c(aym_1 aym_12) {
        return aym_12.m();
    }

    public static boolean h(aym_1 aym_12) {
        return aym_12.n();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static boolean g(aym_1 aym_12) {
        return aym_12.c();
    }

    public static void b(aym_1 aym_12, int n) {
        aym_12.a(n);
    }

    public static void a(aym_1 aym_12, aY6 aY62) {
        aym_12.a(aY62);
    }

    public static int f(aym_1 aym_12) {
        return aym_12.h();
    }

    public static void a(aym_1 aym_12, int n) {
        aym_12.b(n);
    }

    public static EntityLivingBase b(aym_1 aym_12, EntityLivingBase entityLivingBase) {
        return aym_12.c(entityLivingBase);
    }

    public static int[] b() {
        return b;
    }

    public static void a(aym_1 aym_12, World world) {
        aym_12.a(world);
    }

    public static int a(aym_1 aym_12, String string, int n) {
        return aym_12.a(string, n);
    }
}

