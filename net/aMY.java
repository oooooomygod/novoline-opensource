/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IAttribute;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Random;

public class aMY {
    private static ListInvoker[] b;

    public static EntityLivingBase j(nu_1 nu_12) {
        return nu_12.ak();
    }

    public static float c(nu_1 nu_12, BlockPos blockPos) {
        return nu_12.b(blockPos);
    }

    public static rm_2 c(nu_1 nu_12) {
        return nu_12.getEntityBoundingBox();
    }

    public static boolean q(nu_1 nu_12) {
        return nu_12.ag();
    }

    public static void n(nu_1 nu_12) {
        nu_12.Z();
    }

    public static Team r(nu_1 nu_12) {
        return nu_12.getTeam();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static BlockPos f(nu_1 nu_12) {
        return nu_12.u();
    }

    public static float k(nu_1 nu_12) {
        return nu_12.n();
    }

    public static float g(nu_1 nu_12) {
        return nu_12.d();
    }

    public static int d(nu_1 nu_12) {
        return nu_12.x();
    }

    public static boolean e(nu_1 nu_12) {
        return nu_12.k();
    }

    public static int m(nu_1 nu_12) {
        return nu_12.aa();
    }

    public static double a(nu_1 nu_12, Entity entity) {
        return nu_12.g(entity);
    }

    public static double a(nu_1 nu_12, BlockPos blockPos) {
        return nu_12.a(blockPos);
    }

    public static EntityLivingBase h(nu_1 nu_12) {
        return nu_12.U();
    }

    static {
        if (aMY.b() == null) {
            aMY.b(new ListInvoker[3]);
        }
    }

    public static Random o(nu_1 nu_12) {
        return nu_12.E();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static float a(nu_1 nu_12, float f) {
        return nu_12.b(f);
    }

    public static ItemStack t(nu_1 nu_12) {
        return nu_12.ah();
    }

    public static boolean i(nu_1 nu_12) {
        return nu_12.a();
    }

    public static double d(nu_1 nu_12, BlockPos blockPos) {
        return nu_12.c(blockPos);
    }

    public static boolean b(nu_1 nu_12, EntityLivingBase entityLivingBase) {
        return nu_12.c(entityLivingBase);
    }

    public static double a(nu_1 nu_12, double d, double d2, double d3) {
        return nu_12.d(d, d2, d3);
    }

    public static ahw_2 a(nu_1 nu_12, IAttribute iAttribute) {
        return nu_12.a(iAttribute);
    }

    public static int s(nu_1 nu_12) {
        return nu_12.ag();
    }

    public static boolean b(nu_1 nu_12, BlockPos blockPos) {
        return nu_12.a(blockPos);
    }

    public static F0 a(nu_1 nu_12) {
        return nu_12.Z();
    }

    public static T0 b(nu_1 nu_12) {
        return nu_12.d();
    }

    public static void a(nu_1 nu_12, EntityLivingBase entityLivingBase) {
        nu_12.c(entityLivingBase);
    }

    public static boolean b(nu_1 nu_12, Entity entity) {
        return nu_12.d(entity);
    }

    public static ana_1 l(nu_1 nu_12) {
        return nu_12.af();
    }

    public static tj_0 p(nu_1 nu_12) {
        return nu_12.C();
    }
}

