/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayerMP;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.UUID;

/*
 * Renamed from net.ayJ
 */
public class ayj_0 {
    private static int b;

    public static EnumFacing r(Entity entity) {
        return entity.ai();
    }

    public static boolean s(Entity entity) {
        return entity.M();
    }

    public static void a(Entity entity, String string) {
        entity.a(string);
    }

    public static float d(Entity entity, Entity entity2) {
        return entity.a(entity2);
    }

    public static void a(Entity entity, String string, float f, float f2) {
        entity.a(string, f, f2);
    }

    public static UUID R(Entity entity) {
        return entity.J();
    }

    public static int a() {
        ayj_0.b();
        return 91;
    }

    public static void a(Entity entity, float f, float f2) {
        entity.b(f, f2);
    }

    public static boolean G(Entity entity) {
        return entity.aa();
    }

    public static boolean a(Entity entity, EntityPlayer entityPlayer, Vec3 vec3) {
        return entity.a(entityPlayer, vec3);
    }

    public static rm_2 c(Entity entity) {
        return entity.as();
    }

    public static Entity[] E(Entity entity) {
        return entity.aj();
    }

    public static boolean L(Entity entity) {
        return entity.ac();
    }

    public static void c(Entity entity, int n) {
        entity.b(n);
    }

    public static a96 N(Entity entity) {
        return entity.t();
    }

    public static float t(Entity entity) {
        return entity.C();
    }

    public static void Q(Entity entity) {
        entity.onUpdate();
    }

    public static int b() {
        return b;
    }

    public static float F(Entity entity) {
        return entity.A();
    }

    public static void b(Entity entity, int n) {
        entity.f(n);
    }

    public static boolean d(Entity entity, NBTTagCompound nBTTagCompound) {
        return entity.f(nBTTagCompound);
    }

    public static NBTTagCompound k(Entity entity) {
        return entity.au();
    }

    public static void a(Entity entity, byte by) {
        entity.a(by);
    }

    public static void b(Entity entity, Entity entity2) {
        entity.mountEntity(entity2);
    }

    public static void a(Entity entity, CrashReportCategory crashReportCategory) {
        entity.a(crashReportCategory);
    }

    public static void d(Entity entity, double d, double d2, double d3) {
        entity.a(d, d2, d3);
    }

    public static boolean o(Entity entity) {
        return entity.aw();
    }

    public static void g(Entity entity) {
        entity.b();
    }

    public static int B(Entity entity) {
        return entity.r();
    }

    public static EnumFacing I(Entity entity) {
        return entity.al();
    }

    public static void b(Entity entity, double d, double d2, double d3, float f, float f2) {
        entity.c(d, d2, d3, f, f2);
    }

    public static boolean q(Entity entity) {
        return entity.isInWater();
    }

    public static boolean e(Entity entity) {
        return entity.isSprinting();
    }

    public static void h(Entity entity) {
        entity.ab();
    }

    public static boolean A(Entity entity) {
        return entity.f();
    }

    public static boolean a(Entity entity) {
        return entity.n();
    }

    public static void a(Entity entity, boolean bl) {
        entity.f(bl);
    }

    public static Vec3 O(Entity entity) {
        return entity.B();
    }

    public static boolean v(Entity entity) {
        return entity.ag();
    }

    public static float n(Entity entity) {
        return entity.w();
    }

    public static boolean a(Entity entity, DamageSource damageSource, float f) {
        return entity.a(damageSource, f);
    }

    public static double c(Entity entity, double d, double d2, double d3) {
        return entity.h(d, d2, d3);
    }

    public static boolean l(Entity entity) {
        return entity.isSneaking();
    }

    public static void c(Entity entity, NBTTagCompound nBTTagCompound) {
        entity.e(nBTTagCompound);
    }

    public static double c(Entity entity, BlockPos blockPos) {
        return entity.a(blockPos);
    }

    public static void b(int n) {
        b = n;
    }

    public static MovingObjectPosition a(Entity entity, double d, float f) {
        return entity.a(d, f);
    }

    public static World b(Entity entity) {
        return entity.d();
    }

    public static Vec3 d(Entity entity, float f) {
        return entity.c(f);
    }

    public static boolean a(Entity entity, EntityPlayerMP entityPlayerMP) {
        return entity.a(entityPlayerMP);
    }

    public static boolean J(Entity entity) {
        return entity.o();
    }

    public static String x(Entity entity) {
        return entity.getName();
    }

    public static void K(Entity entity) {
        entity.ar();
    }

    public static void a(Entity entity, float f) {
        entity.f(f);
    }

    public static void a(Entity entity, double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        ayj_0.b();
        entity.a(d, d2, d3, f, f2, n, bl);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static double b(Entity entity, BlockPos blockPos) {
        return entity.c(blockPos);
    }

    public static void b(Entity entity, NBTTagCompound nBTTagCompound) {
        entity.c(nBTTagCompound);
    }

    public static void m(Entity entity) {
        entity.u();
    }

    public static boolean a(Entity entity, aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState, float f) {
        return entity.a(aw0_02, world, blockPos, iBlockState, f);
    }

    public static void a(Entity entity, World world) {
        entity.a(world);
    }

    public static boolean f(Entity entity) {
        return entity.af();
    }

    public static void f(Entity entity, double d, double d2, double d3) {
        entity.e(d, d2, d3);
    }

    public static void i(Entity entity) {
        entity.K();
    }

    public static void a(Entity entity, double d, double d2, double d3, float f, float f2) {
        entity.b(d, d2, d3, f, f2);
    }

    static {
        if (ayj_0.a() == 0) {
            ayj_0.b(102);
        }
    }

    public static boolean b(Entity entity, int n, ItemStack itemStack) {
        return entity.b(n, itemStack);
    }

    public static boolean p(Entity entity) {
        return entity.isRiding();
    }

    public static boolean a(Entity entity, Material material) {
        return entity.isInsideOfMaterial(material);
    }

    public static void a(Entity entity, int n, ItemStack itemStack) {
        entity.c(n, itemStack);
    }

    public static int d(Entity entity) {
        return entity.ah();
    }

    public static boolean j(Entity entity) {
        return entity.e();
    }

    public static void a(Entity entity, NBTTagCompound nBTTagCompound) {
        entity.d(nBTTagCompound);
    }

    public static void D(Entity entity) {
        entity.E();
    }

    public static double a(Entity entity, double d, double d2, double d3) {
        return entity.d(d, d2, d3);
    }

    public static boolean e(Entity entity, double d, double d2, double d3) {
        return entity.i(d, d2, d3);
    }

    public static Vec3 c(Entity entity, float f) {
        return entity.a(f);
    }

    public static IChatComponent P(Entity entity) {
        return entity.getDisplayName();
    }

    public static rm_2 c(Entity entity, Entity entity2) {
        return entity.l(entity2);
    }

    public static ItemStack[] w(Entity entity) {
        return entity.ae();
    }

    public static boolean y(Entity entity) {
        return entity.R();
    }

    public static rm_2 u(Entity entity) {
        return entity.getEntityBoundingBox();
    }

    public static ab1_0 C(Entity entity) {
        return entity.Z();
    }

    public static int b(Entity entity, float f) {
        return entity.d(f);
    }

    public static double a(Entity entity, Entity entity2) {
        return entity.g(entity2);
    }

    public static void M(Entity entity) {
        entity.ao();
    }

    public static void b(Entity entity, double d, double d2, double d3) {
        entity.moveEntity(d, d2, d3);
    }

    public static float a(Entity entity, aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState) {
        return entity.a(aw0_02, world, blockPos, iBlockState);
    }

    public static void a(Entity entity, BlockPos blockPos) {
        entity.d(blockPos);
    }

    public static void a(Entity entity, int n) {
        entity.g(n);
    }

    public static int H(Entity entity) {
        return entity.L();
    }

    public static boolean z(Entity entity) {
        return entity.N();
    }
}

