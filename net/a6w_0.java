/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.world.GameType;
import deobf.IAttribute;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.StatBase;
import deobf.Vec3;
import java.util.Random;
import java.util.UUID;

/*
 * Renamed from net.a6w
 */
public class a6w_0 {
    private static String[] b;

    public static ItemStack n(EntityPlayer entityPlayer) {
        return entityPlayer.S();
    }

    public static UUID a(GameProfile gameProfile) {
        return EntityPlayer.b(gameProfile);
    }

    public static Vec3 c(EntityPlayer entityPlayer, float f) {
        return entityPlayer.a(f);
    }

    public static boolean a(EntityPlayer entityPlayer, DamageSource damageSource, float f) {
        return entityPlayer.a(damageSource, f);
    }

    public static void a(EntityPlayer entityPlayer, NBTTagCompound nBTTagCompound) {
        entityPlayer.c(nBTTagCompound);
    }

    public static void a(EntityPlayer entityPlayer, StatBase statBase) {
        entityPlayer.b(statBase);
    }

    public static void a(EntityPlayer entityPlayer, Entity entity, int n) {
        entityPlayer.b(entity, n);
    }

    public static int F(EntityPlayer entityPlayer) {
        return entityPlayer.g();
    }

    public static boolean i(EntityPlayer entityPlayer) {
        return entityPlayer.ac();
    }

    public static boolean a(EntityPlayer entityPlayer, Block block) {
        return entityPlayer.b(block);
    }

    public static World M(EntityPlayer entityPlayer) {
        return entityPlayer.d();
    }

    public static double b(EntityPlayer entityPlayer, Entity entity) {
        return entityPlayer.g(entity);
    }

    public static float O(EntityPlayer entityPlayer) {
        return entityPlayer.b();
    }

    public static String[] b() {
        return b;
    }

    public static ItemStack J(EntityPlayer entityPlayer) {
        return entityPlayer.ai();
    }

    public static boolean c(EntityPlayer entityPlayer) {
        return entityPlayer.n();
    }

    public static og_0 a(EntityPlayer entityPlayer, ItemStack itemStack, boolean bl, boolean bl2) {
        return entityPlayer.a(itemStack, bl, bl2);
    }

    public static boolean a(EntityPlayer entityPlayer, EntityPlayer entityPlayer2) {
        return entityPlayer.a(entityPlayer2);
    }

    public static void a(EntityPlayer entityPlayer, a2l_0 a2l_02) {
        entityPlayer.a(a2l_02);
    }

    public static void a(EntityPlayer entityPlayer, ItemStack itemStack, int n) {
        entityPlayer.a(itemStack, n);
    }

    public static boolean a(EntityPlayer entityPlayer) {
        return entityPlayer.z();
    }

    public static void a(EntityPlayer entityPlayer, a6z_0 a6z_02) {
        entityPlayer.a(a6z_02);
    }

    public static void a(EntityPlayer entityPlayer, StatBase statBase, int n) {
        entityPlayer.addStat(statBase, n);
    }

    public static boolean s(EntityPlayer entityPlayer) {
        return entityPlayer.d();
    }

    public static void a(EntityPlayer entityPlayer, double d, double d2, double d3) {
        entityPlayer.j(d, d2, d3);
    }

    public static double b(EntityPlayer entityPlayer, double d, double d2, double d3) {
        return entityPlayer.d(d, d2, d3);
    }

    public static int r(EntityPlayer entityPlayer) {
        return entityPlayer.r();
    }

    public static og_0 a(EntityPlayer entityPlayer, ItemStack itemStack, boolean bl) {
        return entityPlayer.a(itemStack, bl);
    }

    public static String C(EntityPlayer entityPlayer) {
        return entityPlayer.getName();
    }

    public static ItemStack d(EntityPlayer entityPlayer) {
        return entityPlayer.ah();
    }

    public static void a(EntityPlayer entityPlayer, GameType gameType) {
        entityPlayer.a(gameType);
    }

    public static void a(EntityPlayer entityPlayer, a7K a7K2) {
        entityPlayer.a(a7K2);
    }

    public static void a(EntityPlayer entityPlayer, awn_1 awn_12) {
        entityPlayer.a(awn_12);
    }

    public static IChatComponent w(EntityPlayer entityPlayer) {
        return entityPlayer.getDisplayName();
    }

    public static void a(EntityPlayer entityPlayer, rs_1 rs_12) {
        entityPlayer.a(rs_12);
    }

    public static float b(EntityPlayer entityPlayer, float f) {
        return entityPlayer.e(f);
    }

    public static boolean y(EntityPlayer entityPlayer) {
        return entityPlayer.isSprinting();
    }

    public static void d(EntityPlayer entityPlayer, int n) {
        entityPlayer.n(n);
    }

    public static void D(EntityPlayer entityPlayer) {
        entityPlayer.ao();
    }

    public static aX4 u(EntityPlayer entityPlayer) {
        return entityPlayer.O();
    }

    public static rm_2 E(EntityPlayer entityPlayer) {
        return entityPlayer.getEntityBoundingBox();
    }

    public static int A(EntityPlayer entityPlayer) {
        return entityPlayer.R();
    }

    public static void d(EntityPlayer entityPlayer, float f) {
        entityPlayer.j(f);
    }

    public static ItemStack b(EntityPlayer entityPlayer, int n) {
        return entityPlayer.a(n);
    }

    public static void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        entityPlayer.a(itemStack);
    }

    public static float q(EntityPlayer entityPlayer) {
        return entityPlayer.w();
    }

    public static boolean N(EntityPlayer entityPlayer) {
        return entityPlayer.isSneaking();
    }

    public static void c(EntityPlayer entityPlayer, int n) {
        entityPlayer.m(n);
    }

    public static boolean a(EntityPlayer entityPlayer, aea_1 aea_12) {
        return entityPlayer.a(aea_12);
    }

    public static float b(EntityPlayer entityPlayer) {
        return entityPlayer.V();
    }

    public static void e(EntityPlayer entityPlayer) {
        entityPlayer.n();
    }

    public static wr_1 o(EntityPlayer entityPlayer) {
        return entityPlayer.b();
    }

    public static float k(EntityPlayer entityPlayer) {
        return entityPlayer.o();
    }

    public static boolean l(EntityPlayer entityPlayer) {
        return entityPlayer.k();
    }

    public static GameProfile G(EntityPlayer entityPlayer) {
        return entityPlayer.X();
    }

    public static boolean a(EntityPlayer entityPlayer, Material material) {
        return entityPlayer.isInsideOfMaterial(material);
    }

    public static void d(EntityPlayer entityPlayer, Entity entity) {
        entityPlayer.m(entity);
    }

    public static float z(EntityPlayer entityPlayer) {
        return entityPlayer.a();
    }

    public static Team j(EntityPlayer entityPlayer) {
        return entityPlayer.getTeam();
    }

    public static boolean a(EntityPlayer entityPlayer, Potion potion) {
        return entityPlayer.isPotionActive(potion);
    }

    public static ahw_2 a(EntityPlayer entityPlayer, IAttribute iAttribute) {
        return entityPlayer.a(iAttribute);
    }

    public static boolean p(EntityPlayer entityPlayer) {
        return entityPlayer.isUsingItem();
    }

    public static boolean v(EntityPlayer entityPlayer) {
        return entityPlayer.y();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static int I(EntityPlayer entityPlayer) {
        return entityPlayer.O();
    }

    public static boolean a(EntityPlayer entityPlayer, boolean bl) {
        return entityPlayer.a(bl);
    }

    public static Random H(EntityPlayer entityPlayer) {
        return entityPlayer.E();
    }

    public static void a(EntityPlayer entityPlayer, na_1 na_12, rs_1 rs_12) {
        entityPlayer.a(na_12, rs_12);
    }

    public static int h(EntityPlayer entityPlayer) {
        return entityPlayer.Q();
    }

    public static void a(EntityPlayer entityPlayer, dv_1 dv_12) {
        entityPlayer.displayGui(dv_12);
    }

    static {
        if (a6w_0.b() == null) {
            a6w_0.b(new String[4]);
        }
    }

    public static void K(EntityPlayer entityPlayer) {
        entityPlayer.ac();
    }

    public static float x(EntityPlayer entityPlayer) {
        return entityPlayer.C();
    }

    public static aox_1 a(EntityPlayer entityPlayer, BlockPos blockPos) {
        return entityPlayer.a(blockPos);
    }

    public static a96 f(EntityPlayer entityPlayer) {
        return entityPlayer.t();
    }

    public static void a(EntityPlayer entityPlayer, double d, double d2, double d3, float f, float f2) {
        entityPlayer.b(d, d2, d3, f, f2);
    }

    public static void L(EntityPlayer entityPlayer) {
        entityPlayer.Z();
    }

    public static boolean m(EntityPlayer entityPlayer) {
        return entityPlayer.A();
    }

    public static void a(EntityPlayer entityPlayer, int n) {
        entityPlayer.k(n);
    }

    public static boolean a(EntityPlayer entityPlayer, BlockPos blockPos, EnumFacing enumFacing, ItemStack itemStack) {
        return entityPlayer.a(blockPos, enumFacing, itemStack);
    }

    public static UUID g(EntityPlayer entityPlayer) {
        return entityPlayer.J();
    }

    public static void a(EntityPlayer entityPlayer, boolean bl, boolean bl2, boolean bl3) {
        entityPlayer.a(bl, bl2, bl3);
    }

    public static float b(EntityPlayer entityPlayer, Block block) {
        return entityPlayer.getToolDigEfficiency(block);
    }

    public static boolean c(EntityPlayer entityPlayer, Entity entity) {
        return entityPlayer.n(entity);
    }

    public static void b(EntityPlayer entityPlayer, NBTTagCompound nBTTagCompound) {
        entityPlayer.e(nBTTagCompound);
    }

    public static void t(EntityPlayer entityPlayer) {
        entityPlayer.W();
    }

    public static void a(EntityPlayer entityPlayer, int n, ItemStack itemStack) {
        entityPlayer.c(n, itemStack);
    }

    public static BlockPos a(World world, BlockPos blockPos, boolean bl) {
        return EntityPlayer.a(world, blockPos, bl);
    }

    public static float a(EntityPlayer entityPlayer, Entity entity) {
        return entityPlayer.a(entity);
    }

    public static void a(EntityPlayer entityPlayer, float f) {
        entityPlayer.d(f);
    }

    public static boolean B(EntityPlayer entityPlayer) {
        return entityPlayer.isRiding();
    }

    public static void a(EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        entityPlayer.addChatComponentMessage(iChatComponent);
    }
}

