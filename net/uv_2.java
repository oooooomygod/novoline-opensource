/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.WorldSettings;

/*
 * Renamed from net.uv
 */
public class uv_2 {
    private static int b;

    public static void e(WorldInfo worldInfo, boolean bl) {
        worldInfo.d(bl);
    }

    static {
        if (uv_2.b() == 0) {
            uv_2.b(33);
        }
    }

    public static long A(WorldInfo worldInfo) {
        return worldInfo.e();
    }

    public static boolean g(WorldInfo worldInfo) {
        return worldInfo.x();
    }

    public static int d(WorldInfo worldInfo) {
        return worldInfo.z();
    }

    public static long B(WorldInfo worldInfo) {
        return worldInfo.c();
    }

    public static int v(WorldInfo worldInfo) {
        return worldInfo.a();
    }

    public static void i(WorldInfo worldInfo, int n) {
        worldInfo.b(n);
    }

    public static void b(WorldInfo worldInfo, long l4) {
        worldInfo.a(l4);
    }

    public static int b() {
        return b;
    }

    public static void h(WorldInfo worldInfo, int n) {
        worldInfo.c(n);
    }

    public static int x(WorldInfo worldInfo) {
        return worldInfo.r();
    }

    public static int F(WorldInfo worldInfo) {
        return worldInfo.C();
    }

    public static void a(WorldInfo worldInfo, GameType gameType) {
        worldInfo.a(gameType);
    }

    public static void b(int n) {
        b = n;
    }

    public static boolean i(WorldInfo worldInfo) {
        return worldInfo.h();
    }

    public static void d(WorldInfo worldInfo, int n) {
        worldInfo.i(n);
    }

    public static int y(WorldInfo worldInfo) {
        return worldInfo.I();
    }

    public static w__0 s(WorldInfo worldInfo) {
        return worldInfo.p();
    }

    public static void c(WorldInfo worldInfo, int n) {
        worldInfo.e(n);
    }

    public static int a() {
        uv_2.b();
        return 84;
    }

    public static void g(WorldInfo worldInfo, boolean bl) {
        worldInfo.a(bl);
    }

    public static void c(WorldInfo worldInfo, double d) {
        worldInfo.b(d);
    }

    public static double u(WorldInfo worldInfo) {
        return worldInfo.b();
    }

    public static NBTTagCompound E(WorldInfo worldInfo) {
        return worldInfo.w();
    }

    public static double a(WorldInfo worldInfo) {
        return worldInfo.u();
    }

    public static double l(WorldInfo worldInfo) {
        return worldInfo.k();
    }

    public static boolean t(WorldInfo worldInfo) {
        return worldInfo.E();
    }

    public static long f(WorldInfo worldInfo) {
        return worldInfo.m();
    }

    public static WorldType r(WorldInfo worldInfo) {
        return worldInfo.j();
    }

    public static double G(WorldInfo worldInfo) {
        return worldInfo.f();
    }

    public static void f(WorldInfo worldInfo, int n) {
        worldInfo.h(n);
    }

    public static void e(WorldInfo worldInfo, int n) {
        worldInfo.g(n);
    }

    public static void a(WorldInfo worldInfo, CrashReportCategory crashReportCategory) {
        worldInfo.a(crashReportCategory);
    }

    public static void a(WorldInfo worldInfo, boolean bl) {
        worldInfo.e(bl);
    }

    public static int o(WorldInfo worldInfo) {
        return worldInfo.q();
    }

    public static int h(WorldInfo worldInfo) {
        return worldInfo.y();
    }

    public static boolean b(WorldInfo worldInfo) {
        return worldInfo.t();
    }

    public static NBTTagCompound a(WorldInfo worldInfo, NBTTagCompound nBTTagCompound) {
        return worldInfo.a(nBTTagCompound);
    }

    public static void g(WorldInfo worldInfo, int n) {
        worldInfo.a(n);
    }

    public static boolean w(WorldInfo worldInfo) {
        return worldInfo.n();
    }

    public static void d(WorldInfo worldInfo, double d) {
        worldInfo.c(d);
    }

    public static void d(WorldInfo worldInfo, boolean bl) {
        worldInfo.c(bl);
    }

    public static void f(WorldInfo worldInfo, boolean bl) {
        worldInfo.b(bl);
    }

    public static long p(WorldInfo worldInfo) {
        return worldInfo.o();
    }

    public static void a(WorldInfo worldInfo, long l4) {
        worldInfo.b(l4);
    }

    public static void b(WorldInfo worldInfo, boolean bl) {
        worldInfo.g(bl);
    }

    public static String n(WorldInfo worldInfo) {
        return worldInfo.H();
    }

    public static void b(WorldInfo worldInfo, int n) {
        worldInfo.f(n);
    }

    public static void e(WorldInfo worldInfo, double d) {
        worldInfo.f(d);
    }

    public static void f(WorldInfo worldInfo, double d) {
        worldInfo.a(d);
    }

    public static void a(WorldInfo worldInfo, double d) {
        worldInfo.d(d);
    }

    public static void b(WorldInfo worldInfo, double d) {
        worldInfo.e(d);
    }

    public static NBTTagCompound H(WorldInfo worldInfo) {
        return worldInfo.i();
    }

    public static void a(WorldInfo worldInfo, int n) {
        worldInfo.d(n);
    }

    public static void a(WorldInfo worldInfo, BlockPos blockPos) {
        worldInfo.a(blockPos);
    }

    public static void a(WorldInfo worldInfo, WorldType worldType) {
        worldInfo.a(worldType);
    }

    public static String z(WorldInfo worldInfo) {
        return worldInfo.l();
    }

    public static void a(WorldInfo worldInfo, WorldSettings worldSettings) {
        worldInfo.a(worldSettings);
    }

    public static void c(WorldInfo worldInfo, boolean bl) {
        worldInfo.f(bl);
    }

    public static double k(WorldInfo worldInfo) {
        return worldInfo.D();
    }

    public static boolean c(WorldInfo worldInfo) {
        return worldInfo.v();
    }

    public static GameType C(WorldInfo worldInfo) {
        return worldInfo.s();
    }

    public static void a(WorldInfo worldInfo, EnumDifficulty enumDifficulty) {
        worldInfo.a(enumDifficulty);
    }

    public static long j(WorldInfo worldInfo) {
        return worldInfo.g();
    }

    public static double D(WorldInfo worldInfo) {
        return worldInfo.B();
    }

    public static long e(WorldInfo worldInfo) {
        return worldInfo.d();
    }

    public static int q(WorldInfo worldInfo) {
        return worldInfo.A();
    }

    public static EnumDifficulty m(WorldInfo worldInfo) {
        return worldInfo.G();
    }
}

