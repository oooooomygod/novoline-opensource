/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.util.concurrent.ListenableFuture;
import deobf.Chunk;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.EnumDifficulty;
import deobf.ISaveHandler;
import deobf.MinecraftServer;
import deobf.TileEntity;
import net.minecraft.world.WorldSettings;
import java.util.List;
import java.util.UUID;

public class a3V {
    private static ListInvoker[] b;

    public static World o(WorldServer worldServer) {
        return worldServer.Q();
    }

    public static void b(WorldServer worldServer, Entity entity) {
        worldServer.b(entity);
    }

    public static boolean x(WorldServer worldServer) {
        return worldServer.h();
    }

    public static boolean a(WorldServer worldServer, int n, int n2) {
        return worldServer.b(n, n2);
    }

    public static List a(WorldServer worldServer, Entity entity, rm_2 rm_22) {
        return worldServer.b(entity, rm_22);
    }

    public static boolean j(WorldServer worldServer) {
        return worldServer.g();
    }

    public static long q(WorldServer worldServer) {
        return worldServer.F();
    }

    public static boolean a(WorldServer worldServer, rm_2 rm_22) {
        return worldServer.b(rm_22);
    }

    public static void v(WorldServer worldServer) {
        worldServer.q();
    }

    public static za_2 b(WorldServer worldServer) {
        return worldServer.m();
    }

    public static ach_0 b(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.k(blockPos);
    }

    public static List t(WorldServer worldServer) {
        return worldServer.e();
    }

    public static Chunk b(WorldServer worldServer, int n, int n2) {
        return worldServer.c(n, n2);
    }

    public static boolean c(WorldServer worldServer, Entity entity) {
        return worldServer.a(entity);
    }

    public static int a(WorldServer worldServer, Class clazz) {
        return worldServer.a(clazz);
    }

    public static void a(WorldServer worldServer, B7 b7, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int[] nArray) {
        aV8.b();
        worldServer.a(b7, d, d2, d3, n, d4, d5, d6, d7, nArray);
        if (ListInvoker.b() != null) {
            aV8.b("vEIYnc");
        }
    }

    public static w__0 z(WorldServer worldServer) {
        return worldServer.K();
    }

    static {
        if (a3V.b() == null) {
            a3V.b(new ListInvoker[1]);
        }
    }

    public static float a(WorldServer worldServer, float f) {
        return worldServer.a(f);
    }

    public static boolean c(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.a(blockPos);
    }

    public static cp_0 a(WorldServer worldServer, a40 a402, BlockPos blockPos) {
        return worldServer.a(a402, blockPos);
    }

    public static List a(WorldServer worldServer, int n, int n2, int n3, int n4, int n5, int n6) {
        return worldServer.a(n, n2, n3, n4, n5, n6);
    }

    public static long y(WorldServer worldServer) {
        return worldServer.E();
    }

    public static ListenableFuture a(WorldServer worldServer, Runnable runnable) {
        return worldServer.addScheduledTask(runnable);
    }

    public static void a(WorldServer worldServer, B7 b7, boolean bl, double d, double d2, double d3, int n, double d4, double d5, double d6, double d7, int[] nArray) {
        aV8.b();
        worldServer.a(b7, bl, d, d2, d3, n, d4, d5, d6, d7, nArray);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static avV f(WorldServer worldServer) {
        return worldServer.c();
    }

    public static void n(WorldServer worldServer) {
        worldServer.m();
    }

    public static WorldInfo d(WorldServer worldServer) {
        return worldServer.w();
    }

    public static em_1 g(WorldServer worldServer) {
        return worldServer.o();
    }

    public static void a(WorldServer worldServer, WorldSettings worldSettings) {
        worldServer.a(worldSettings);
    }

    public static void g(WorldServer worldServer, BlockPos blockPos) {
        worldServer.o(blockPos);
    }

    public static void a(WorldServer worldServer, boolean bl, IProgressUpdate iProgressUpdate) {
        worldServer.a(bl, iProgressUpdate);
    }

    public static boolean a(WorldServer worldServer, BlockPos blockPos, IBlockState iBlockState, int n) {
        return worldServer.a(blockPos, iBlockState, n);
    }

    public static BlockPos c(WorldServer worldServer) {
        return worldServer.r();
    }

    public static Entity a(WorldServer worldServer, UUID uUID) {
        return worldServer.a(uUID);
    }

    public static void a(WorldServer worldServer, BlockPos blockPos, Block block) {
        worldServer.a(blockPos, block);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void u(WorldServer worldServer) {
        worldServer.p();
    }

    public static boolean a(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.i(blockPos);
    }

    public static int e(WorldServer worldServer) {
        return worldServer.z();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static TileEntity d(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.c(blockPos);
    }

    public static IBlockState f(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.b(blockPos);
    }

    public static long k(WorldServer worldServer) {
        return worldServer.B();
    }

    public static boolean a(WorldServer worldServer, a40 a402, cp_0 cp_02, BlockPos blockPos) {
        return worldServer.a(a402, cp_02, blockPos);
    }

    public static agl_1 l(WorldServer worldServer) {
        return worldServer.R();
    }

    public static aQT a(WorldServer worldServer) {
        return worldServer.h();
    }

    public static void a(WorldServer worldServer, IWorldAccess iWorldAccess) {
        worldServer.a(iWorldAccess);
    }

    public static float b(WorldServer worldServer, float f) {
        return worldServer.f(f);
    }

    public static boolean a(WorldServer worldServer, double d, double d2, double d3, double d4) {
        return worldServer.b(d, d2, d3, d4);
    }

    public static void a(WorldServer worldServer, Entity entity, boolean bl) {
        worldServer.a(entity, bl);
    }

    public static CrashReportCategory a(WorldServer worldServer, CrashReport crashReport) {
        return worldServer.a(crashReport);
    }

    public static MinecraftServer m(WorldServer worldServer) {
        return worldServer.e();
    }

    public static Entity a(WorldServer worldServer, int n) {
        return worldServer.b(n);
    }

    public static void a(WorldServer worldServer, long l4) {
        worldServer.a(l4);
    }

    public static boolean r(WorldServer worldServer) {
        return worldServer.I();
    }

    public static BlockPos e(WorldServer worldServer, BlockPos blockPos) {
        return worldServer.q(blockPos);
    }

    public static ISaveHandler h(WorldServer worldServer) {
        return worldServer.q();
    }

    public static void d(WorldServer worldServer, Entity entity) {
        worldServer.c(entity);
    }

    public static boolean a(WorldServer worldServer, BlockPos blockPos, IBlockState iBlockState) {
        return worldServer.a(blockPos, iBlockState);
    }

    public static avp_1 i(WorldServer worldServer) {
        return worldServer.l();
    }

    public static EnumDifficulty w(WorldServer worldServer) {
        return worldServer.H();
    }

    public static void s(WorldServer worldServer) {
        worldServer.J();
    }

    public static BlockPos p(WorldServer worldServer) {
        return worldServer.i();
    }

    public static void a(WorldServer worldServer, Entity entity) {
        worldServer.f(entity);
    }
}

