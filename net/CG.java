/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IAttribute;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Random;
import java.util.UUID;

public class CG {
    private static int b;

    public static boolean D(nl_1 nl_12) {
        return nl_12.i();
    }

    public static boolean x(nl_1 nl_12) {
        return nl_12.ae();
    }

    public static boolean a(nl_1 nl_12, Class clazz) {
        return nl_12.a(clazz);
    }

    public static float A(nl_1 nl_12) {
        return nl_12.w();
    }

    public static void H(nl_1 nl_12) {
        nl_12.x();
    }

    public static int l(nl_1 nl_12) {
        return nl_12.al();
    }

    static {
        if (CG.c() != 0) {
            CG.b(11);
        }
    }

    public static void a(nl_1 nl_12, Entity entity, boolean bl) {
        nl_12.a(entity, bl);
    }

    public static boolean w(nl_1 nl_12) {
        return nl_12.U();
    }

    public static py_0 i(nl_1 nl_12) {
        return nl_12.a();
    }

    public static boolean m(nl_1 nl_12) {
        return nl_12.isRiding();
    }

    public static double b(nl_1 nl_12, BlockPos blockPos) {
        return nl_12.a(blockPos);
    }

    public static void a(nl_1 nl_12, boolean bl, boolean bl2) {
        nl_12.a(bl, bl2);
    }

    public static boolean p(nl_1 nl_12) {
        return nl_12.o();
    }

    public static boolean B(nl_1 nl_12) {
        return nl_12.Y();
    }

    public static boolean h(nl_1 nl_12) {
        return nl_12.R();
    }

    public static boolean r(nl_1 nl_12) {
        return nl_12.e();
    }

    public static boolean b(nl_1 nl_12, Entity entity) {
        return nl_12.a(entity);
    }

    public static void a(nl_1 nl_12, float f) {
        nl_12.a(f);
    }

    public static double a(nl_1 nl_12, Entity entity) {
        return nl_12.g(entity);
    }

    public static ahw_2 a(nl_1 nl_12, IAttribute iAttribute) {
        return nl_12.a(iAttribute);
    }

    public static int z(nl_1 nl_12) {
        return nl_12.r();
    }

    public static boolean c(nl_1 nl_12, Entity entity) {
        return nl_12.d(entity);
    }

    public static double a(nl_1 nl_12, double d, double d2, double d3) {
        return nl_12.d(d, d2, d3);
    }

    public static boolean q(nl_1 nl_12) {
        return nl_12.j();
    }

    public static F0 e(nl_1 nl_12) {
        return nl_12.Z();
    }

    public static float u(nl_1 nl_12) {
        return nl_12.c();
    }

    public static EntityLivingBase o(nl_1 nl_12) {
        return nl_12.ak();
    }

    public static void a(nl_1 nl_12, EntityLivingBase entityLivingBase) {
        nl_12.c(entityLivingBase);
    }

    public static boolean t(nl_1 nl_12) {
        return nl_12.O();
    }

    public static void a(nl_1 nl_12, double d, double d2, double d3, float f, float f2) {
        nl_12.c(d, d2, d3, f, f2);
    }

    public static void b(int n) {
        b = n;
    }

    public static boolean g(nl_1 nl_12) {
        return nl_12.n();
    }

    public static int b() {
        return b;
    }

    public static void G(nl_1 nl_12) {
        nl_12.n();
    }

    public static void y(nl_1 nl_12) {
        nl_12.N();
    }

    public static amk_0 a(nl_1 nl_12, ach_0 ach_02, amk_0 amk_02) {
        return nl_12.a(ach_02, amk_02);
    }

    public static void f(nl_1 nl_12) {
        nl_12.y();
    }

    public static int C(nl_1 nl_12) {
        return nl_12.ag();
    }

    public static Random a(nl_1 nl_12) {
        return nl_12.E();
    }

    public static Team n(nl_1 nl_12) {
        return nl_12.getTeam();
    }

    public static boolean c(nl_1 nl_12) {
        return nl_12.B();
    }

    public static tj_0 F(nl_1 nl_12) {
        return nl_12.C();
    }

    public static ana_1 k(nl_1 nl_12) {
        return nl_12.af();
    }

    public static int c() {
        CG.b();
        return 89;
    }

    public static UUID E(nl_1 nl_12) {
        return nl_12.J();
    }

    public static rm_2 v(nl_1 nl_12) {
        return nl_12.getEntityBoundingBox();
    }

    public static void b(nl_1 nl_12, float f) {
        nl_12.j(f);
    }

    public static BlockPos d(nl_1 nl_12) {
        return nl_12.e();
    }

    public static void a(nl_1 nl_12, boolean bl) {
        nl_12.h(bl);
    }

    public static void a(nl_1 nl_12, int n, float f) {
        nl_12.a(n, f);
    }

    public static int a(ItemStack itemStack) {
        return nl_1.b(itemStack);
    }

    public static Entity j(nl_1 nl_12) {
        return nl_12.V();
    }

    public static double a(nl_1 nl_12, BlockPos blockPos) {
        return nl_12.c(blockPos);
    }

    public static void a(nl_1 nl_12, float f, float f2) {
        nl_12.f(f, f2);
    }

    public static void a(nl_1 nl_12, String string) {
        nl_12.a(string);
    }

    public static T0 b(nl_1 nl_12) {
        return nl_12.d();
    }

    public static boolean s(nl_1 nl_12) {
        return nl_12.isInWater();
    }

    public static int c(nl_1 nl_12, float f) {
        return nl_12.d(f);
    }
}

