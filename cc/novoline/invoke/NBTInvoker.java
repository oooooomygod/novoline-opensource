/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.crash.CrashReportCategory;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.NBTTagCompound;
import net.World;

public class NBTInvoker {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static TileEntity a(NBTTagCompound nBTTagCompound) {
        return TileEntity.b(nBTTagCompound);
    }

    public static boolean b(TileEntity tileEntity) {
        return tileEntity.n();
    }

    public static void b(TileEntity tileEntity, NBTTagCompound nBTTagCompound) {
        tileEntity.a(nBTTagCompound);
    }

    public static void a(TileEntity tileEntity, NBTTagCompound nBTTagCompound) {
        tileEntity.c(nBTTagCompound);
    }

    public static void a(TileEntity tileEntity, CrashReportCategory crashReportCategory) {
        tileEntity.a(crashReportCategory);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void i(TileEntity tileEntity) {
        tileEntity.j();
    }

    public static void d(TileEntity tileEntity) {
        tileEntity.l();
    }

    public static void a(TileEntity tileEntity, World world) {
        tileEntity.a(world);
    }

    public static Block h(TileEntity tileEntity) {
        return tileEntity.k();
    }

    public static double a(TileEntity tileEntity, double d, double d2, double d3) {
        return tileEntity.a(d, d2, d3);
    }

    public static boolean e(TileEntity tileEntity) {
        return tileEntity.c();
    }

    public static boolean a(TileEntity tileEntity, int n, int n2) {
        return tileEntity.a(n, n2);
    }

    public static void k(TileEntity tileEntity) {
        tileEntity.d();
    }

    static {
        if (NBTInvoker.b()) {
            NBTInvoker.b(true);
        }
    }

    public static void a(TileEntity tileEntity, BlockPos blockPos) {
        tileEntity.a(blockPos);
    }

    public static BlockPos g(TileEntity tileEntity) {
        return tileEntity.i();
    }

    public static void a(TileEntity tileEntity) {
        tileEntity.e();
    }

    public static Packet c(TileEntity tileEntity) {
        return tileEntity.g();
    }

    public static double j(TileEntity tileEntity) {
        return tileEntity.f();
    }

    public static boolean c() {
        NBTInvoker.b();
        return true;
    }

    public static boolean f(TileEntity tileEntity) {
        return tileEntity.h();
    }
}

