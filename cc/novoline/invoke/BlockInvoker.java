/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package cc.novoline.invoke;

import com.google.common.base.Predicate;
import deobf.Chunk;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.util.MovingObjectPosition;
import deobf.TileEntity;
import deobf.Vec3;
import net.minecraft.multiplayer.WorldClient;
import java.util.List;
import java.util.UUID;
import net.B7;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CrashReport;
import deobf.EnumFacing;
import net.IBlockState;
import net.IWorldAccess;
import net.WorldInfo;
import net.WorldType;
import net.ach_0;
import net.agl_1;
import net.ct_2;
import net.il_0;
import net.rm_2;
import net.za_2;

public class BlockInvoker {
    private static boolean b;

    public static void b(WorldClient worldClient, int n, BlockPos blockPos, int n2) {
        worldClient.b(n, blockPos, n2);
    }

    public static void a(WorldClient worldClient, BlockPos blockPos, IBlockState iBlockState) {
        worldClient.a(blockPos, iBlockState);
    }

    public static EntityPlayer a(WorldClient worldClient, String string) {
        return worldClient.b(string);
    }

    public static CrashReportCategory a(WorldClient worldClient, CrashReport crashReport) {
        return worldClient.a(crashReport);
    }

    public static List m(WorldClient worldClient) {
        return worldClient.x();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(WorldClient worldClient, boolean bl, boolean bl2) {
        worldClient.a(bl, bl2);
    }

    public static boolean c() {
        BlockInvoker.b();
        return true;
    }

    static {
        if (!BlockInvoker.b()) {
            BlockInvoker.b(true);
        }
    }

    public static void c(WorldClient worldClient, int n, BlockPos blockPos, int n2) {
        worldClient.a(n, blockPos, n2);
    }

    public static boolean a(WorldClient worldClient, EntityPlayer entityPlayer, BlockPos blockPos, EnumFacing enumFacing) {
        return worldClient.a(entityPlayer, blockPos, enumFacing);
    }

    public static void c(WorldClient worldClient, int n) {
        worldClient.b(n);
    }

    public static void a(WorldClient worldClient, za_2 za_22) {
        worldClient.a(za_22);
    }

    public static WorldType n(WorldClient worldClient) {
        return worldClient.e();
    }

    public static void a(WorldClient worldClient, Entity entity, String string, float f, float f2) {
        worldClient.a(entity, string, f, f2);
    }

    public static Vec3 e(WorldClient worldClient, float f) {
        return worldClient.k(f);
    }

    public static IBlockState getMaterial(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.b(blockPos);
    }

    public static agl_1 i(WorldClient worldClient) {
        return worldClient.R();
    }

    public static void a(WorldClient worldClient, int n, int n2, boolean bl) {
        worldClient.a(n, n2, bl);
    }

    public static Block a(WorldClient worldClient, int n, int n2, int n3) {
        return worldClient.a(n, n2, n3);
    }

    public static boolean c(WorldClient worldClient, Entity entity) {
        return worldClient.g(entity);
    }

    public static TileEntity e(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.c(blockPos);
    }

    public static Vec3 a(WorldClient worldClient, Entity entity, float f) {
        return worldClient.a(entity, f);
    }

    public static EntityPlayer a(WorldClient worldClient, UUID uUID) {
        return worldClient.a(uUID);
    }

    public static void t(WorldClient worldClient) {
        worldClient.G();
    }

    public static MovingObjectPosition a(WorldClient worldClient, Vec3 vec3, Vec3 vec32) {
        return worldClient.a(vec3, vec32);
    }

    public static float f(WorldClient worldClient, float f) {
        return worldClient.a(f);
    }

    public static long f(WorldClient worldClient) {
        return worldClient.E();
    }

    public static void a(WorldClient worldClient, double d, double d2, double d3, String string, float f, float f2, boolean bl) {
        worldClient.a(d, d2, d3, string, f, f2, bl);
    }

    public static void b(WorldClient worldClient, int n, int n2, int n3) {
        worldClient.a(n, n2, n3);
    }

    public static String v(WorldClient worldClient) {
        return worldClient.t();
    }

    public static ach_0 f(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.k(blockPos);
    }

    public static void d(WorldClient worldClient, Entity entity) {
        worldClient.d(entity);
    }

    public static List b(WorldClient worldClient, Entity entity, rm_2 rm_22) {
        return worldClient.b(entity, rm_22);
    }

    public static List s(WorldClient worldClient) {
        return worldClient.e();
    }

    public static void h(WorldClient worldClient) {
        worldClient.O();
    }

    public static List a(WorldClient worldClient, Entity entity, rm_2 rm_22, Predicate predicate) {
        return worldClient.a(entity, rm_22, (Predicate<? super Entity>)predicate);
    }

    public static MovingObjectPosition a(WorldClient worldClient, Vec3 vec3, Vec3 vec32, boolean bl, boolean bl2, boolean bl3) {
        return worldClient.a(vec3, vec32, bl, bl2, bl3);
    }

    public static void a(WorldClient worldClient, int n, BlockPos blockPos, int n2) {
        worldClient.c(n, blockPos, n2);
    }

    public static boolean a(WorldClient worldClient, Entity entity) {
        return worldClient.a(entity);
    }

    public static il_0 i(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.d(blockPos);
    }

    public static float i(WorldClient worldClient, float f) {
        return worldClient.f(f);
    }

    public static float d(WorldClient worldClient, float f) {
        return worldClient.g(f);
    }

    public static List a(WorldClient worldClient, Entity entity, rm_2 rm_22) {
        return worldClient.a(entity, rm_22);
    }

    public static void a(WorldClient worldClient, BlockPos blockPos, Block block, int n, int n2) {
        worldClient.a(blockPos, block, n, n2);
    }

    public static void j(WorldClient worldClient, float f) {
        worldClient.b(f);
    }

    public static void b(WorldClient worldClient, int n, int n2, int n3, int n4, int n5, int n6) {
        worldClient.b(n, n2, n3, n4, n5, n6);
    }

    public static float c(WorldClient worldClient, float f) {
        return worldClient.j(f);
    }

    public static void p(WorldClient worldClient) {
        worldClient.f();
    }

    public static Chunk a(WorldClient worldClient, int n, int n2) {
        return worldClient.c(n, n2);
    }

    public static Vec3 h(WorldClient worldClient, float f) {
        return worldClient.h(f);
    }

    public static void a(WorldClient worldClient, long l4) {
        worldClient.a(l4);
    }

    public static long l(WorldClient worldClient) {
        return worldClient.B();
    }

    public static WorldInfo q(WorldClient worldClient) {
        return worldClient.w();
    }

    public static List c(WorldClient worldClient) {
        return worldClient.f();
    }

    public static boolean g(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.i(blockPos);
    }

    public static BlockPos d(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.t(blockPos);
    }

    public static boolean a(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.p(blockPos);
    }

    public static void g(WorldClient worldClient, float f) {
        worldClient.e(f);
    }

    public static int g(WorldClient worldClient) {
        return worldClient.N();
    }

    public static void a(WorldClient worldClient, BlockPos blockPos, String string) {
        worldClient.a(blockPos, string);
    }

    public static Entity b(WorldClient worldClient, int n) {
        return worldClient.b(n);
    }

    public static List e(WorldClient worldClient) {
        return worldClient.V();
    }

    public static EnumDifficulty d(WorldClient worldClient) {
        return worldClient.H();
    }

    public static void j(WorldClient worldClient) {
        worldClient.i();
    }

    public static int a(WorldClient worldClient, BlockPos blockPos, int n) {
        return worldClient.a(blockPos, n);
    }

    public static void b(WorldClient worldClient, Entity entity) {
        worldClient.c(entity);
    }

    public static void a(WorldClient worldClient, B7 b7, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        BlockInvoker.c();
        worldClient.a(b7, bl, d, d2, d3, d4, d5, d6, nArray);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static void b(WorldClient worldClient) {
        worldClient.J();
    }

    public static void a(WorldClient worldClient, int n, int n2, int n3, int n4, int n5, int n6) {
        worldClient.a(n, n2, n3, n4, n5, n6);
    }

    public static double u(WorldClient worldClient) {
        return worldClient.d();
    }

    public static void b(WorldClient worldClient, long l4) {
        worldClient.b(l4);
    }

    public static void a(WorldClient worldClient, B7 b7, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        BlockInvoker.c();
        worldClient.a(b7, d, d2, d3, d4, d5, d6, nArray);
        if (ListInvoker.b() != null) {
            BlockInvoker.b(false);
        }
    }

    public static float b(WorldClient worldClient, float f) {
        return worldClient.i(f);
    }

    public static Chunk b(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.f(blockPos);
    }

    public static void a(WorldClient worldClient, int n) {
        worldClient.d(n);
    }

    public static void b(WorldClient worldClient, IWorldAccess iWorldAccess) {
        worldClient.a(iWorldAccess);
    }

    public static za_2 o(WorldClient worldClient) {
        return worldClient.m();
    }

    public static void a(WorldClient worldClient, BlockPos blockPos, String string, float f, float f2, boolean bl) {
        worldClient.a(blockPos, string, f, f2, bl);
    }

    public static boolean b() {
        return b;
    }

    public static String k(WorldClient worldClient) {
        return worldClient.u();
    }

    public static ct_2 a(WorldClient worldClient) {
        return worldClient.S();
    }

    public static float a(WorldClient worldClient, float f) {
        return worldClient.d(f);
    }

    public static void a(WorldClient worldClient, int n, Entity entity) {
        worldClient.a(n, entity);
    }

    public static float c(WorldClient worldClient, BlockPos blockPos) {
        return worldClient.g(blockPos);
    }

    public static void a(WorldClient worldClient, IWorldAccess iWorldAccess) {
        worldClient.b(iWorldAccess);
    }

    public static int r(WorldClient worldClient) {
        return worldClient.c();
    }
}

