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
import deobf.TileEntity;
import java.util.List;
import java.util.Map;
import java.util.Random;

import net.ChunkCoordIntPair;
import deobf.EnumCreateEntityType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aqp
 */
public class aqp_2 {
    private static boolean b;

    public static void a(Chunk chunk, ano_2[] ano_2Array) {
        chunk.a(ano_2Array);
    }

    public static void d(Chunk chunk, boolean bl) {
        chunk.h(bl);
    }

    public static int a(Chunk chunk, BlockPos blockPos, int n) {
        return chunk.a(blockPos, n);
    }

    public static boolean a(Chunk chunk, boolean bl) {
        return chunk.e(bl);
    }

    public static void p(Chunk chunk) {
        chunk.c();
    }

    public static void e(Chunk chunk, boolean bl) {
        chunk.b(bl);
    }

    public static Block b(Chunk chunk, int n, int n2, int n3) {
        return chunk.a(n, n2, n3);
    }

    public static boolean o(Chunk chunk) {
        return chunk.r();
    }

    public static void t(Chunk chunk) {
        chunk.a();
    }

    public static boolean c() {
        aqp_2.b();
        return true;
    }

    public static boolean f(Chunk chunk) {
        return chunk.p();
    }

    public static void j(Chunk chunk) {
        chunk.h();
    }

    public static boolean c(Chunk chunk, int n, int n2) {
        return chunk.e(n, n2);
    }

    public static World r(Chunk chunk) {
        return chunk.m();
    }

    public static void a(Chunk chunk, BlockPos blockPos, TileEntity tileEntity) {
        chunk.a(blockPos, tileEntity);
    }

    public static boolean a(Chunk chunk, BlockPos blockPos) {
        return chunk.g(blockPos);
    }

    public static void c(Chunk chunk) {
        chunk.b();
    }

    public static TileEntity a(Chunk chunk, BlockPos blockPos, EnumCreateEntityType enumCreateEntityType) {
        return chunk.a(blockPos, enumCreateEntityType);
    }

    public static void c(Chunk chunk, long l4) {
        chunk.b(l4);
    }

    public static Random b(Chunk chunk, long l4) {
        return chunk.a(l4);
    }

    public static void a(Chunk chunk, int[] nArray) {
        chunk.a(nArray);
    }

    public static int k(Chunk chunk) {
        return chunk.k();
    }

    public static int a(Chunk chunk, YG yG, BlockPos blockPos) {
        return chunk.a(yG, blockPos);
    }

    public static boolean a(Chunk chunk) {
        return chunk.s();
    }

    public static void a(Chunk chunk, Entity entity, rm_2 rm_22, List list, Predicate predicate) {
        chunk.a(entity, rm_22, list, (Predicate<? super Entity>)predicate);
    }

    public static int c(Chunk chunk, BlockPos blockPos) {
        return chunk.f(blockPos);
    }

    public static void a(Chunk chunk, em_1 em_12, em_1 em_13, int n, int n2) {
        chunk.a(em_12, em_13, n, n2);
    }

    public static IBlockState a(Chunk chunk, BlockPos blockPos, IBlockState iBlockState) {
        return chunk.a(blockPos, iBlockState);
    }

    public static boolean b(Chunk chunk) {
        return chunk.x();
    }

    public static void a(Chunk chunk, Class clazz, rm_2 rm_22, List list, Predicate predicate) {
        chunk.a(clazz, rm_22, list, predicate);
    }

    public static void f(Chunk chunk, boolean bl) {
        chunk.a(bl);
    }

    public static void a(Chunk chunk, byte[] byArray, int n, boolean bl) {
        chunk.a(byArray, n, bl);
    }

    public static int q(Chunk chunk) {
        return chunk.f();
    }

    public static int[] d(Chunk chunk) {
        return chunk.u();
    }

    public static Map g(Chunk chunk) {
        return chunk.t();
    }

    public static void a(Chunk chunk, long l4) {
        chunk.c(l4);
    }

    public static long e(Chunk chunk) {
        return chunk.w();
    }

    public static void b(Chunk chunk, boolean bl) {
        chunk.d(bl);
    }

    public static ano_2[] m(Chunk chunk) {
        return chunk.i();
    }

    public static void a(Chunk chunk, Entity entity, int n) {
        chunk.a(entity, n);
    }

    public static int b(Chunk chunk, int n, int n2) {
        return chunk.d(n, n2);
    }

    public static ChunkCoordIntPair v(Chunk chunk) {
        return chunk.v();
    }

    public static void g(Chunk chunk, boolean bl) {
        chunk.f(bl);
    }

    public static void u(Chunk chunk) {
        chunk.g();
    }

    static {
        if (!aqp_2.c()) {
            aqp_2.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static il_0 a(Chunk chunk, BlockPos blockPos, ct_2 ct_22) {
        return chunk.a(blockPos, ct_22);
    }

    public static byte[] i(Chunk chunk) {
        return chunk.q();
    }

    public static void a(Chunk chunk, TileEntity tileEntity) {
        chunk.a(tileEntity);
    }

    public static void a(Chunk chunk, Entity entity) {
        chunk.a(entity);
    }

    public static Block a(Chunk chunk, int n, int n2, int n3) {
        return chunk.f(n, n2, n3);
    }

    public static void a(Chunk chunk, byte[] byArray) {
        chunk.a(byArray);
    }

    public static void c(Chunk chunk, boolean bl) {
        chunk.c(bl);
    }

    public static boolean n(Chunk chunk) {
        return chunk.e();
    }

    public static void h(Chunk chunk) {
        chunk.l();
    }

    public static Block d(Chunk chunk, BlockPos blockPos) {
        return chunk.c(blockPos);
    }

    public static boolean a(Chunk chunk, int n, int n2) {
        return chunk.a(n, n2);
    }

    public static IBlockState b(Chunk chunk, BlockPos blockPos) {
        return chunk.d(blockPos);
    }

    public static qx_0[] s(Chunk chunk) {
        return chunk.n();
    }

    public static void l(Chunk chunk) {
        chunk.j();
    }

    public static void b(boolean bl) {
        b = bl;
    }
}

