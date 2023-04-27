/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EntityPlayerSP;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.StatFileWriter;
import net.World;
import net.anh_1;

public class PlayerControllerInvoker {
    private static int b;

    public static boolean m(anh_1 anh_12) {
        return anh_12.b();
    }

    public static boolean f(anh_1 anh_12) {
        return anh_12.j();
    }

    public static void a(anh_1 anh_12, int n, int n2, int n3, int n4, EntityPlayer entityPlayer) {
        anh_12.b(n, n2, n3, n4, entityPlayer);
    }

    public static boolean j(anh_1 anh_12) {
        return anh_12.i();
    }

    public static boolean c(anh_1 anh_12, BlockPos blockPos, EnumFacing enumFacing) {
        return anh_12.b(blockPos, enumFacing);
    }

    public static boolean a(anh_1 anh_12) {
        return anh_12.k();
    }

    public static boolean c(anh_1 anh_12) {
        return anh_12.m();
    }

    public static boolean isNotCreative(anh_1 anh_12) {
        return anh_12.e();
    }

    public static void b(anh_1 anh_12, EntityPlayer entityPlayer) {
        anh_12.c(entityPlayer);
    }

    public static int a() {
        PlayerControllerInvoker.b();
        return 88;
    }

    public static void l(anh_1 anh_12) {
        anh_12.c();
    }

    public static void a(anh_1 anh_12, BlockPos blockPos, EnumFacing enumFacing) {
        anh_12.c(blockPos, enumFacing);
    }

    public static float b(anh_1 anh_12) {
        return anh_12.l();
    }

    public static void a(anh_1 anh_12, ItemStack itemStack) {
        anh_12.a(itemStack);
    }

    public static void b(int n) {
        b = n;
    }

    public static void c(anh_1 anh_12, EntityPlayer entityPlayer) {
        anh_12.b(entityPlayer);
    }

    public static void a(anh_1 anh_12, EntityPlayer entityPlayer, Entity entity) {
        anh_12.b(entityPlayer, entity);
    }

    public static boolean d(anh_1 anh_12) {
        return anh_12.f();
    }

    public static int b() {
        return b;
    }

    public static boolean e(anh_1 anh_12) {
        return anh_12.a();
    }

    public static boolean h(anh_1 anh_12) {
        return anh_12.n();
    }

    public static boolean b(anh_1 anh_12, EntityPlayer entityPlayer, Entity entity) {
        return anh_12.a(entityPlayer, entity);
    }

    public static void a(anh_1 anh_12, EntityPlayer entityPlayer) {
        anh_12.a(entityPlayer);
    }

    public static boolean a(anh_1 anh_12, EntityPlayerSP entityPlayerSP, WorldClient worldClient, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, Vec3 vec3) {
        return anh_12.b(entityPlayerSP, worldClient, itemStack, blockPos, enumFacing, vec3);
    }

    public static boolean a(anh_1 anh_12, EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        return anh_12.a(entityPlayer, world, itemStack);
    }

    public static void n(anh_1 anh_12) {
        anh_12.h();
    }

    public static void a(anh_1 anh_12, ItemStack itemStack, int n) {
        anh_12.a(itemStack, n);
    }

    public static boolean g(anh_1 anh_12) {
        return anh_12.d();
    }

    public static boolean a(anh_1 anh_12, EntityPlayer entityPlayer, Entity entity, MovingObjectPosition movingObjectPosition) {
        return anh_12.a(entityPlayer, entity, movingObjectPosition);
    }

    public static void b(anh_1 anh_12, int n, int n2, int n3, int n4, EntityPlayer entityPlayer) {
        anh_12.a(n, n2, n3, n4, entityPlayer);
    }

    public static EntityPlayerSP a(anh_1 anh_12, World world, StatFileWriter statFileWriter) {
        return anh_12.a(world, statFileWriter);
    }

    static {
        if (PlayerControllerInvoker.a() != 0) {
            PlayerControllerInvoker.b(6);
        }
    }

    public static void a(anh_1 anh_12, GameType gameType) {
        anh_12.a(gameType);
    }

    public static boolean clickBlock(anh_1 anh_12, BlockPos blockPos, EnumFacing enumFacing) {
        return anh_12.a(blockPos, enumFacing);
    }

    public static GameType k(anh_1 anh_12) {
        return anh_12.g();
    }

    public static void a(anh_1 anh_12, int n, int n2) {
        anh_12.c(n, n2);
    }
}

