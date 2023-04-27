/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Chunk;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class aV8 {
    private static String b = "P1DE0b";

    public static int a(World world, BlockPos blockPos, int n) {
        return world.a(blockPos, n);
    }

    public static boolean b(World world, BlockPos blockPos, int n) {
        return world.a(blockPos, n);
    }

    public static boolean a(World world, Block block, BlockPos blockPos, boolean bl, EnumFacing enumFacing, Entity entity, ItemStack itemStack) {
        return world.a(block, blockPos, bl, enumFacing, entity, itemStack);
    }

    public static BlockPos a(World world, String string, BlockPos blockPos) {
        return world.a(string, blockPos);
    }

    public static void a(World world, TileEntity tileEntity) {
        world.a(tileEntity);
    }

    public static void b(World world) {
        world.s();
    }

    public static void a(World world, Entity entity, byte by) {
        world.a(entity, by);
    }

    public static void a(World world, Entity entity, double d, double d2, double d3, float f, boolean bl, boolean bl2) {
        world.a(entity, d, d2, d3, f, bl, bl2);
    }

    public static boolean s(World world, BlockPos blockPos) {
        return world.w(blockPos);
    }

    public static EnumDifficulty p(World world) {
        return world.H();
    }

    public static boolean a(World world, EntityPlayer entityPlayer, BlockPos blockPos, EnumFacing enumFacing) {
        return world.a(entityPlayer, blockPos, enumFacing);
    }

    public static Chunk x(World world, BlockPos blockPos) {
        return world.f(blockPos);
    }

    public static void a(World world, B7 b7, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        world.a(b7, bl, d, d2, d3, d4, d5, d6, nArray);
    }

    public static String b() {
        return b;
    }

    public static List e(World world) {
        return world.e();
    }

    public static Entity a(World world, Class clazz, rm_2 rm_22, Entity entity) {
        return world.a(clazz, rm_22, entity);
    }

    public static boolean a(World world, YG yG, BlockPos blockPos) {
        return world.a(yG, blockPos);
    }

    public static Random a(World world, int n, int n2, int n3) {
        return world.b(n, n2, n3);
    }

    public static Chunk a(World world, int n, int n2) {
        return world.c(n, n2);
    }

    public static void b(World world, int n, BlockPos blockPos, int n2) {
        world.b(n, blockPos, n2);
    }

    public static float c(World world, float f) {
        return world.d(f);
    }

    public static boolean a(World world, Entity entity) {
        return world.g(entity);
    }

    public static boolean a(World world, rm_2 rm_22, Material material, Entity entity) {
        return world.a(rm_22, material, entity);
    }

    public static ach_0 b(World world, BlockPos blockPos) {
        return world.k(blockPos);
    }

    public static boolean e(World world, BlockPos blockPos) {
        return world.y(blockPos);
    }

    public static void c(World world, int n) {
        world.c(n);
    }

    public static wo_0 a(World world, Class clazz, String string) {
        return world.a(clazz, string);
    }

    public static void c(World world, BlockPos blockPos, Block block) {
        world.a(blockPos, block);
    }

    public static BlockPos a(World world, BlockPos blockPos) {
        return world.q(blockPos);
    }

    public static void c(World world, Collection collection) {
        world.c(collection);
    }

    public static boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return World.a(iBlockAccess, blockPos);
    }

    public static List b(World world, Class clazz, Predicate predicate) {
        return world.b(clazz, predicate);
    }

    public static IBlockState q(World world, BlockPos blockPos) {
        return world.b(blockPos);
    }

    public static boolean f(World world, BlockPos blockPos) {
        return world.j(blockPos);
    }

    public static List a(World world, Chunk chunk, boolean bl) {
        return world.a(chunk, bl);
    }

    public static boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        return world.a(blockPos, iBlockState);
    }

    public static void a(World world, BlockPos blockPos, TileEntity tileEntity) {
        world.a(blockPos, tileEntity);
    }

    public static void a(World world, Entity entity, String string, float f, float f2) {
        world.a(entity, string, f, f2);
    }

    public static boolean a(World world, BlockPos blockPos, Block block) {
        return world.b(blockPos, block);
    }

    static {
        if (aV8.b() == null) {
            aV8.b("P1DE0b");
        }
    }

    public static int f(World world) {
        return world.l();
    }

    public static int g(World world, BlockPos blockPos) {
        return world.z(blockPos);
    }

    public static void c(World world, BlockPos blockPos, Block block, int n, int n2) {
        world.b(blockPos, block, n, n2);
    }

    public static WorldInfo s(World world) {
        return world.w();
    }

    public static boolean a(World world, rm_2 rm_22) {
        return world.c(rm_22);
    }

    public static boolean b(World world, rm_2 rm_22, Material material) {
        return world.a(rm_22, material);
    }

    public static boolean l(World world) {
        return world.D();
    }

    public static void a(World world, Entity entity, double d, double d2, double d3, float f, boolean bl) {
        world.a(entity, d, d2, d3, f, bl);
    }

    public static boolean k(World world, BlockPos blockPos) {
        return world.a(blockPos);
    }

    public static boolean c(World world, BlockPos blockPos) {
        return world.A(blockPos);
    }

    public static EntityPlayer a(World world, Entity entity, double d) {
        return world.a(entity, d);
    }

    public static boolean B(World world, BlockPos blockPos) {
        return world.e(blockPos);
    }

    public static void e(World world, BlockPos blockPos, Block block) {
        world.c(blockPos, block);
    }

    public static void b(String string) {
        b = string;
    }

    public static void a(World world, String string, wo_0 wo_02) {
        world.a(string, wo_02);
    }

    public static void a(World world, B7 b7, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        world.a(b7, d, d2, d3, d4, d5, d6, nArray);
    }

    public static boolean b(World world, rm_2 rm_22) {
        return world.d(rm_22);
    }

    public static boolean a(World world, EntityPlayer entityPlayer, BlockPos blockPos) {
        return world.a(entityPlayer, blockPos);
    }

    public static List a(World world, Class clazz, rm_2 rm_22) {
        return world.a(clazz, rm_22);
    }

    public static boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        return world.a(blockPos, iBlockState, n);
    }

    public static int b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return world.b(blockPos, enumFacing);
    }

    public static List a(World world, Class clazz, Predicate predicate) {
        return world.a(clazz, predicate);
    }

    public static il_0 o(World world, BlockPos blockPos) {
        return world.d(blockPos);
    }

    public static boolean c(World world, BlockPos blockPos, boolean bl) {
        return world.a(blockPos, bl);
    }

    public static MovingObjectPosition a(World world, Vec3 vec3, Vec3 vec32, boolean bl) {
        return world.a(vec3, vec32, bl);
    }

    public static void a(World world, int n, int n2, int n3, int n4) {
        world.a(n, n2, n3, n4);
    }

    public static void a(World world, boolean bl, boolean bl2) {
        world.a(bl, bl2);
    }

    public static Calendar r(World world) {
        return world.j();
    }

    public static w__0 k(World world) {
        return world.K();
    }

    public static boolean c(World world, rm_2 rm_22) {
        return world.e(rm_22);
    }

    public static void p(World world, BlockPos blockPos) {
        world.o(blockPos);
    }

    public static long w(World world) {
        return world.F();
    }

    public static void a(World world, BlockPos blockPos, BlockPos blockPos2) {
        world.a(blockPos, blockPos2);
    }

    public static BlockPos y(World world, BlockPos blockPos) {
        return world.t(blockPos);
    }

    public static int a(World world, String string) {
        return world.a(string);
    }

    public static List a(World world, Entity entity, rm_2 rm_22) {
        return world.a(entity, rm_22);
    }

    public static float b(World world, float f) {
        return world.g(f);
    }

    public static void b(World world, BlockPos blockPos, Block block) {
        world.d(blockPos, block);
    }

    public static boolean a(World world, BlockPos blockPos, boolean bl) {
        return world.b(blockPos, bl);
    }

    public static void a(World world, double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        world.a(d, d2, d3, string, f, f2, bl);
    }

    public static boolean a(World world, rm_2 rm_22, Material material) {
        return world.b(rm_22, material);
    }

    public static WorldType i(World world) {
        return world.e();
    }

    public static void a(World world, double d, double d2, double d3, String string, float f, float f2) {
        world.a(d, d2, d3, string, f, f2);
    }

    public static long g(World world) {
        return world.E();
    }

    public static void c(World world, int n, BlockPos blockPos, int n2) {
        world.c(n, blockPos, n2);
    }

    public static List u(World world) {
        return world.V();
    }

    public static em_1 h(World world) {
        return world.o();
    }

    public static List a(World world, Class clazz, rm_2 rm_22, Predicate predicate) {
        return world.a(clazz, rm_22, predicate);
    }

    public static void d(World world, int n) {
        world.d(n);
    }

    public static boolean w(World world, BlockPos blockPos) {
        return world.B(blockPos);
    }

    public static List a(World world, Entity entity, rm_2 rm_22, Predicate predicate) {
        return world.a(entity, rm_22, (Predicate<? super Entity>)predicate);
    }

    public static void a(World world, BlockPos blockPos, Block block, int n, int n2) {
        world.c(blockPos, block, n, n2);
    }

    public static void a(World world, BlockPos blockPos, Block block, EnumFacing enumFacing) {
        world.a(blockPos, block, enumFacing);
    }

    public static int b(World world, int n, int n2) {
        return world.a(n, n2);
    }

    public static int l(World world, BlockPos blockPos) {
        return world.x(blockPos);
    }

    public static List a(World world, HF hF, boolean bl) {
        return world.a(hF, bl);
    }

    public static boolean a(World world, double d, double d2, double d3, double d4) {
        return world.b(d, d2, d3, d4);
    }

    public static List d(World world, rm_2 rm_22) {
        return world.a(rm_22);
    }

    public static int z(World world) {
        return world.c();
    }

    public static agl_1 x(World world) {
        return world.R();
    }

    public static za_2 v(World world) {
        return world.m();
    }

    public static long d(World world) {
        return world.B();
    }

    public static boolean b(World world, BlockPos blockPos, BlockPos blockPos2) {
        return world.b(blockPos, blockPos2);
    }

    public static float i(World world, BlockPos blockPos) {
        return world.g(blockPos);
    }

    public static int c(World world) {
        return world.v();
    }

    public static void a(World world, EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
        world.a(entityPlayer, n, blockPos, n2);
    }

    public static void a(World world, BlockPos blockPos, Block block, int n) {
        world.a(blockPos, block, n);
    }

    public static MovingObjectPosition a(World world, Vec3 vec3, Vec3 vec32) {
        return world.a(vec3, vec32);
    }

    public static boolean h(World world, BlockPos blockPos) {
        return world.n(blockPos);
    }

    public static TileEntity z(World world, BlockPos blockPos) {
        return world.c(blockPos);
    }

    public static void b(World world, Collection collection) {
        world.a(collection);
    }

    public static void b(World world, BlockPos blockPos, TileEntity tileEntity) {
        world.b(blockPos, tileEntity);
    }

    public static MovingObjectPosition a(World world, Vec3 vec3, Vec3 vec32, boolean bl, boolean bl2, boolean bl3) {
        return world.a(vec3, vec32, bl, bl2, bl3);
    }

    public static void c(World world, Entity entity) {
        world.c(entity);
    }

    public static boolean b(World world, BlockPos blockPos, boolean bl) {
        return world.f(blockPos, bl);
    }

    public static boolean j(World world, BlockPos blockPos) {
        return world.p(blockPos);
    }

    public static boolean a(World world, HF hF) {
        return world.a(hF);
    }

    public static boolean b(World world, Entity entity) {
        return world.a(entity);
    }

    public static void t(World world, BlockPos blockPos) {
        world.l(blockPos);
    }

    public static float j(World world) {
        return world.T();
    }

    public static int y(World world) {
        return world.b();
    }

    public static void n(World world, BlockPos blockPos) {
        world.s(blockPos);
    }

    public static void a(World world, double d, double d2, double d3, double d4, double d5, double d6, NBTTagCompound nBTTagCompound) {
        world.a(d, d2, d3, d4, d5, d6, nBTTagCompound);
    }

    public static void a(World world, Block block, BlockPos blockPos, Random random) {
        world.a(block, blockPos, random);
    }

    public static boolean a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return world.c(blockPos, enumFacing);
    }

    public static wf_1 o(World world) {
        return world.p();
    }

    public static BlockPos r(World world, BlockPos blockPos) {
        return world.h(blockPos);
    }

    public static int v(World world, BlockPos blockPos) {
        return world.u(blockPos);
    }

    public static boolean a(World world, rm_2 rm_22, Entity entity) {
        return world.a(rm_22, entity);
    }

    public static void a(World world, Collection collection) {
        world.b(collection);
    }

    public static boolean isBlockLoaded(World world, BlockPos blockPos) {
        return world.i(blockPos);
    }

    public static ct_2 q(World world) {
        return world.S();
    }

    public static List b(World world, Entity entity, rm_2 rm_22) {
        return world.b(entity, rm_22);
    }

    public static int b(World world, YG yG, BlockPos blockPos) {
        return world.b(yG, blockPos);
    }

    public static EntityPlayer b(World world, double d, double d2, double d3, double d4) {
        return world.a(d, d2, d3, d4);
    }

    public static EntityPlayer a(World world, UUID uUID) {
        return world.a(uUID);
    }

    public static float a(World world, Vec3 vec3, rm_2 rm_22) {
        return world.a(vec3, rm_22);
    }

    public static boolean n(World world) {
        return world.h();
    }

    public static float a(World world, float f) {
        return world.j(f);
    }

    public static Entity b(World world, int n) {
        return world.b(n);
    }

    public static void a(World world, int n) {
        world.a(n);
    }

    public static void a(World world, EntityPlayer entityPlayer, String string, float f, float f2) {
        world.a(entityPlayer, string, f, f2);
    }

    public static boolean d(World world, BlockPos blockPos) {
        return world.v(blockPos);
    }

    public static EntityPlayer b(World world, String string) {
        return world.c(string);
    }

    public static void b(World world, BlockPos blockPos, Block block, int n, int n2) {
        world.a(blockPos, block, n, n2);
    }

    public static boolean t(World world) {
        return world.P();
    }

    public static BlockPos m(World world) {
        return world.r();
    }

    public static void a(World world, int n, BlockPos blockPos, int n2) {
        world.a(n, blockPos, n2);
    }

    public static void d(World world, BlockPos blockPos, Block block) {
        world.e(blockPos, block);
    }

    public static Block m(World world, BlockPos blockPos) {
        return world.r(blockPos);
    }

    public static void a(World world) {
        world.U();
    }

    public static void a(World world, BlockPos blockPos, String string) {
        world.a(blockPos, string);
    }

    public static void A(World world, BlockPos blockPos) {
        world.c(blockPos);
    }
}

