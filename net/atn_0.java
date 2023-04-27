/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import java.util.Collection;
import java.util.Random;

/*
 * Renamed from net.atn
 */
public class atn_0 {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(EntityLivingBase entityLivingBase, ItemStack itemStack) {
        entityLivingBase.b(itemStack);
    }

    public static ItemStack[] t(EntityLivingBase entityLivingBase) {
        return entityLivingBase.ae();
    }

    public static float y(EntityLivingBase entityLivingBase) {
        return entityLivingBase.b();
    }

    public static EntityLivingBase q(EntityLivingBase entityLivingBase) {
        return entityLivingBase.D();
    }

    public static double b(EntityLivingBase entityLivingBase, Entity entity) {
        return entityLivingBase.g(entity);
    }

    public static int e(EntityLivingBase entityLivingBase) {
        return entityLivingBase.T();
    }

    public static aH2 A(EntityLivingBase entityLivingBase) {
        return entityLivingBase.ae();
    }

    public static int h(EntityLivingBase entityLivingBase) {
        return entityLivingBase.r();
    }

    static {
        if (atn_0.b() == null) {
            atn_0.b(new int[2]);
        }
    }

    public static void a(EntityLivingBase entityLivingBase, int n, ItemStack itemStack) {
        entityLivingBase.c(n, itemStack);
    }

    public static EntityLivingBase m(EntityLivingBase entityLivingBase) {
        return entityLivingBase.U();
    }

    public static void a(EntityLivingBase entityLivingBase, int n) {
        entityLivingBase.b(n);
    }

    public static boolean d(EntityLivingBase entityLivingBase, int n) {
        return entityLivingBase.k(n);
    }

    public static boolean g(EntityLivingBase entityLivingBase) {
        return entityLivingBase.isRiding();
    }

    public static void b(EntityLivingBase entityLivingBase, float f) {
        entityLivingBase.d(f);
    }

    public static boolean E(EntityLivingBase entityLivingBase) {
        return entityLivingBase.r();
    }

    public static String L(EntityLivingBase entityLivingBase) {
        return entityLivingBase.getName();
    }

    public static float a(EntityLivingBase entityLivingBase) {
        return entityLivingBase.w();
    }

    public static Random v(EntityLivingBase entityLivingBase) {
        return entityLivingBase.E();
    }

    public static void H(EntityLivingBase entityLivingBase) {
        entityLivingBase.p();
    }

    public static void c(EntityLivingBase entityLivingBase, int n) {
        entityLivingBase.c(n);
    }

    public static Collection n(EntityLivingBase entityLivingBase) {
        return entityLivingBase.G();
    }

    public static void e(EntityLivingBase entityLivingBase, int n) {
        entityLivingBase.h(n);
    }

    public static ItemStack z(EntityLivingBase entityLivingBase) {
        return entityLivingBase.ah();
    }

    public static float d(EntityLivingBase entityLivingBase, float f) {
        return entityLivingBase.b(f);
    }

    public static ItemStack f(EntityLivingBase entityLivingBase, int n) {
        return entityLivingBase.d(n);
    }

    public static EnumFacing D(EntityLivingBase entityLivingBase) {
        return entityLivingBase.al();
    }

    public static boolean J(EntityLivingBase entityLivingBase) {
        return entityLivingBase.n();
    }

    public static void I(EntityLivingBase entityLivingBase) {
        entityLivingBase.ag();
    }

    public static void g(EntityLivingBase entityLivingBase, int n) {
        entityLivingBase.i(n);
    }

    public static Team d(EntityLivingBase entityLivingBase) {
        return entityLivingBase.getTeam();
    }

    public static EntityLivingBase F(EntityLivingBase entityLivingBase) {
        return entityLivingBase.I();
    }

    public static boolean x(EntityLivingBase entityLivingBase) {
        return entityLivingBase.isInWater();
    }

    public static a96 r(EntityLivingBase entityLivingBase) {
        return entityLivingBase.t();
    }

    public static Entity[] o(EntityLivingBase entityLivingBase) {
        return entityLivingBase.aj();
    }

    public static void c(EntityLivingBase entityLivingBase, float f) {
        entityLivingBase.b(f);
    }

    public static VO l(EntityLivingBase entityLivingBase) {
        return entityLivingBase.N();
    }

    public static void a(EntityLivingBase entityLivingBase, a2l_0 a2l_02) {
        entityLivingBase.a(a2l_02);
    }

    public static boolean a(EntityLivingBase entityLivingBase, DamageSource damageSource, float f) {
        return entityLivingBase.a(damageSource, f);
    }

    public static ItemStack b(EntityLivingBase entityLivingBase, int n) {
        return entityLivingBase.a(n);
    }

    public static float e(EntityLivingBase entityLivingBase, float f) {
        return entityLivingBase.e(f);
    }

    public static boolean a(EntityLivingBase entityLivingBase, EntityPlayer entityPlayer) {
        return entityLivingBase.e(entityPlayer);
    }

    public static float j(EntityLivingBase entityLivingBase) {
        return entityLivingBase.o();
    }

    public static boolean B(EntityLivingBase entityLivingBase) {
        return entityLivingBase.b();
    }

    public static IChatComponent C(EntityLivingBase entityLivingBase) {
        return entityLivingBase.getDisplayName();
    }

    public static int[] b() {
        return b;
    }

    public static void a(EntityLivingBase entityLivingBase, double d, double d2, double d3, float f, float f2) {
        entityLivingBase.b(d, d2, d3, f, f2);
    }

    public static boolean p(EntityLivingBase entityLivingBase) {
        return entityLivingBase.y();
    }

    public static void b(EntityLivingBase entityLivingBase) {
        entityLivingBase.Z();
    }

    public static boolean k(EntityLivingBase entityLivingBase) {
        return entityLivingBase.isSprinting();
    }

    public static rm_2 i(EntityLivingBase entityLivingBase) {
        return entityLivingBase.getEntityBoundingBox();
    }

    public static float c(EntityLivingBase entityLivingBase) {
        return entityLivingBase.a();
    }

    public static BlockPos K(EntityLivingBase entityLivingBase) {
        return entityLivingBase.e();
    }

    public static void a(EntityLivingBase entityLivingBase, float f) {
        entityLivingBase.i(f);
    }

    public static void f(EntityLivingBase entityLivingBase) {
        entityLivingBase.ac();
    }

    public static a2l_0 a(EntityLivingBase entityLivingBase, Potion potion) {
        return entityLivingBase.getActivePotionEffect(potion);
    }

    public static boolean b(EntityLivingBase entityLivingBase, Potion potion) {
        return entityLivingBase.isPotionActive(potion);
    }

    public static int G(EntityLivingBase entityLivingBase) {
        return entityLivingBase.aa();
    }

    public static double a(EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        return entityLivingBase.d(d, d2, d3);
    }

    public static boolean M(EntityLivingBase entityLivingBase) {
        return entityLivingBase.ac();
    }

    public static boolean s(EntityLivingBase entityLivingBase) {
        return entityLivingBase.isSneaking();
    }

    public static boolean u(EntityLivingBase entityLivingBase) {
        return entityLivingBase.j();
    }

    public static int w(EntityLivingBase entityLivingBase) {
        return entityLivingBase.W();
    }

    public static float a(EntityLivingBase entityLivingBase, Entity entity) {
        return entityLivingBase.a(entity);
    }
}

