/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.WorldRenderer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.abG
 */
public class abg_1 {
    int e;
    int b = 0;
    boolean a;
    boolean f;
    int i;
    boolean c;
    int g;
    int j;
    boolean d;
    long[] h = new long[10];

    public static void a(IBlockState iBlockState, BlockPos blockPos, IBlockAccess iBlockAccess, WorldRenderer worldRenderer) {
        int n;
        int n2;
        a0D.k();
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (iBlockState instanceof afn_0) {
            afn_0 afn_02 = (afn_0)iBlockState;
            n2 = aqc_1.c(afn_02);
            n = aqc_1.a(afn_02);
        }
        n2 = BlocksInvoker.v(block);
        n = BlocksInvoker.c(block, iBlockState);
        n2 = mz_2.a(n2, n);
        int n3 = BlocksInvoker.y(block);
        int n4 = ((n3 & 0xFFFF) << 16) + (n2 & 0xFFFF);
        int n5 = n & 0xFFFF;
        worldRenderer.c.a(((long)n5 << 32) + (long)n4);
    }

    public static void f(WorldRenderer worldRenderer) {
        a0D.r();
        abg_1 abg_12 = worldRenderer.c;
        if (abg_12.j == 14 && worldRenderer.d == 7 && worldRenderer.g % 4 == 0) {
            abg_12.a(worldRenderer, WorldRendererInvoker.e(worldRenderer) - 4 * abg_12.j);
        }
    }

    public static void a(WorldRenderer worldRenderer) {
        abg_1 abg_12 = worldRenderer.c;
        a0D.r();
        VertexFormat aqn_02 = WorldRendererInvoker.f(worldRenderer);
        abg_12.j = zv_2.a(aqn_02) / 4;
        abg_12.a = abg_12.d = zv_2.f(aqn_02);
        abg_12.f = zv_2.d(aqn_02, 0);
        abg_12.e = abg_12.d ? zv_2.c(aqn_02) / 4 : 0;
        abg_12.g = abg_12.f ? zv_2.b(aqn_02, 0) / 4 : 0;
        abg_12.i = 8;
    }

    public static void g(WorldRenderer worldRenderer) {
        a0D.r();
        if (zv_2.f(WorldRendererInvoker.f(worldRenderer)) && worldRenderer.d == 7 && worldRenderer.g % 4 == 0) {
            abg_1 abg_12 = worldRenderer.c;
            abg_1.a(worldRenderer);
            int n = worldRenderer.g * abg_12.j;
            int n2 = 0;
            if (n2 < n) {
                abg_12.a(worldRenderer, n2);
                n2 += abg_12.j * 4;
            }
        }
    }

    public static void a(int n, int n2, int n3, WorldRenderer worldRenderer) {
        a0D.r();
        VertexFormat aqn_02 = WorldRendererInvoker.f(worldRenderer);
        int n4 = zv_2.a(aqn_02);
        if (n4 == 56) {
            ByteBuffer byteBuffer = WorldRendererInvoker.l(worldRenderer);
            a8q_0.c(byteBuffer, 32);
            aY_.a(aVE.aO, 2, 5126, false, n4, byteBuffer);
            a8q_0.c(byteBuffer, 40);
            aY_.a(aVE.at, 4, 5122, false, n4, byteBuffer);
            a8q_0.c(byteBuffer, 48);
            aY_.a(aVE.af, 3, 5122, false, n4, byteBuffer);
            a8q_0.c(byteBuffer, 0);
            aY_.f(aVE.aO);
            aY_.f(aVE.at);
            aY_.f(aVE.af);
            GL11.glDrawArrays((int)n, (int)n2, (int)n3);
            aY_.g(aVE.aO);
            aY_.g(aVE.at);
            aY_.g(aVE.af);
        }
        GL11.glDrawArrays((int)n, (int)n2, (int)n3);
    }

    public static void c(WorldRenderer worldRenderer) {
        worldRenderer.c = new abg_1();
    }

    public abg_1() {
        this.h[this.b] = 0L;
    }

    public static boolean a(boolean bl, WorldRenderer worldRenderer) {
        worldRenderer.c.a();
        return bl;
    }

    public void a(long l4) {
        ++this.b;
        this.h[this.b] = l4;
    }

    public void a() {
        this.h[this.b] = 0L;
        --this.b;
    }

    public static void a(WorldRenderer worldRenderer, int[] nArray) {
        a0D.r();
        if (worldRenderer.g == 0) {
            abg_1.a(worldRenderer);
        }
        abg_1 abg_12 = worldRenderer.c;
        if (abg_12.j == 14) {
            long l4 = abg_12.h[abg_12.b];
            int n = 12;
            if (n + 1 < nArray.length) {
                nArray[n] = (int)l4;
                nArray[n + 1] = (int)(l4 >> 32);
                n += 14;
            }
        }
    }

    public static void e(WorldRenderer worldRenderer) {
        a0D.r();
        if (worldRenderer.g == 0) {
            abg_1.a(worldRenderer);
        }
    }

    public static void b(WorldRenderer worldRenderer) {
        worldRenderer.c.a();
    }

    public void a(WorldRenderer worldRenderer, int n) {
        FloatBuffer floatBuffer = worldRenderer.k;
        IntBuffer intBuffer = worldRenderer.s;
        WorldRendererInvoker.e(worldRenderer);
        float f = aHB.b(floatBuffer, n + 0 * this.j);
        float f2 = aHB.b(floatBuffer, n + 0 * this.j + 1);
        float f3 = aHB.b(floatBuffer, n + 0 * this.j + 2);
        float f4 = aHB.b(floatBuffer, n + 0 * this.j + this.g);
        float f5 = aHB.b(floatBuffer, n + 0 * this.j + this.g + 1);
        float f6 = aHB.b(floatBuffer, n + 1 * this.j);
        float f7 = aHB.b(floatBuffer, n + 1 * this.j + 1);
        float f8 = aHB.b(floatBuffer, n + 1 * this.j + 2);
        float f9 = aHB.b(floatBuffer, n + 1 * this.j + this.g);
        float f10 = aHB.b(floatBuffer, n + 1 * this.j + this.g + 1);
        float f11 = aHB.b(floatBuffer, n + 2 * this.j);
        float f12 = aHB.b(floatBuffer, n + 2 * this.j + 1);
        float f13 = aHB.b(floatBuffer, n + 2 * this.j + 2);
        float f14 = aHB.b(floatBuffer, n + 2 * this.j + this.g);
        float f15 = aHB.b(floatBuffer, n + 2 * this.j + this.g + 1);
        float f16 = aHB.b(floatBuffer, n + 3 * this.j);
        float f17 = aHB.b(floatBuffer, n + 3 * this.j + 1);
        float f18 = aHB.b(floatBuffer, n + 3 * this.j + 2);
        float f19 = aHB.b(floatBuffer, n + 3 * this.j + this.g);
        int n2 = a0D.k();
        float f20 = aHB.b(floatBuffer, n + 3 * this.j + this.g + 1);
        float f21 = f11 - f;
        float f22 = f12 - f2;
        float f23 = f13 - f3;
        float f24 = f16 - f6;
        float f25 = f17 - f7;
        float f26 = f18 - f8;
        float f27 = f22 * f26 - f25 * f23;
        float f28 = f23 * f24 - f26 * f21;
        float f29 = f21 * f25 - f24 * f22;
        float f30 = f27 * f27 + f28 * f28 + f29 * f29;
        float f31 = (double)f30 != 0.0 ? (float)(1.0 / MathInvoker.d(f30)) : 1.0f;
        f27 *= f31;
        f28 *= f31;
        f29 *= f31;
        f21 = f6 - f;
        f22 = f7 - f2;
        f23 = f8 - f3;
        float f32 = f9 - f4;
        float f33 = f10 - f5;
        f24 = f11 - f;
        f25 = f12 - f2;
        f26 = f13 - f3;
        float f34 = f14 - f4;
        float f35 = f15 - f5;
        float f36 = f32 * f35 - f34 * f33;
        float f37 = f36 != 0.0f ? 1.0f / f36 : 1.0f;
        float f38 = (f35 * f21 - f33 * f24) * f37;
        float f39 = (f35 * f22 - f33 * f25) * f37;
        float f40 = (f35 * f23 - f33 * f26) * f37;
        float f41 = (f32 * f24 - f34 * f21) * f37;
        float f42 = (f32 * f25 - f34 * f22) * f37;
        float f43 = (f32 * f26 - f34 * f23) * f37;
        f30 = f38 * f38 + f39 * f39 + f40 * f40;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / MathInvoker.d(f30)) : 1.0f;
        f38 *= f31;
        f39 *= f31;
        f40 *= f31;
        f30 = f41 * f41 + f42 * f42 + f43 * f43;
        f31 = (double)f30 != 0.0 ? (float)(1.0 / MathInvoker.d(f30)) : 1.0f;
        float f44 = f29 * f39 - f28 * f40;
        float f45 = f27 * f40 - f29 * f38;
        float f46 = f28 * f38 - f27 * f39;
        float f47 = (f41 *= f31) * f44 + (f42 *= f31) * f45 + (f43 *= f31) * f46 < 0.0f ? -1.0f : 1.0f;
        int n3 = (int)(f27 * 127.0f) & 0xFF;
        int n4 = (int)(f28 * 127.0f) & 0xFF;
        int n5 = (int)(f29 * 127.0f) & 0xFF;
        int n6 = (n5 << 16) + (n4 << 8) + n3;
        HD.a(intBuffer, n + 0 * this.j + this.e, n6);
        HD.a(intBuffer, n + 1 * this.j + this.e, n6);
        HD.a(intBuffer, n + 2 * this.j + this.e, n6);
        HD.a(intBuffer, n + 3 * this.j + this.e, n6);
        int n7 = ((int)(f38 * 32767.0f) & 0xFFFF) + (((int)(f39 * 32767.0f) & 0xFFFF) << 16);
        int n8 = ((int)(f40 * 32767.0f) & 0xFFFF) + (((int)(f47 * 32767.0f) & 0xFFFF) << 16);
        HD.a(intBuffer, n + 0 * this.j + 10, n7);
        HD.a(intBuffer, n + 0 * this.j + 10 + 1, n8);
        HD.a(intBuffer, n + 1 * this.j + 10, n7);
        HD.a(intBuffer, n + 1 * this.j + 10 + 1, n8);
        HD.a(intBuffer, n + 2 * this.j + 10, n7);
        HD.a(intBuffer, n + 2 * this.j + 10 + 1, n8);
        HD.a(intBuffer, n + 3 * this.j + 10, n7);
        HD.a(intBuffer, n + 3 * this.j + 10 + 1, n8);
        float f48 = (f4 + f9 + f14 + f19) / 4.0f;
        float f49 = (f5 + f10 + f15 + f20) / 4.0f;
        aHB.a(floatBuffer, n + 0 * this.j + 8, f48);
        aHB.a(floatBuffer, n + 0 * this.j + 8 + 1, f49);
        aHB.a(floatBuffer, n + 1 * this.j + 8, f48);
        aHB.a(floatBuffer, n + 1 * this.j + 8 + 1, f49);
        aHB.a(floatBuffer, n + 2 * this.j + 8, f48);
        aHB.a(floatBuffer, n + 2 * this.j + 8 + 1, f49);
        aHB.a(floatBuffer, n + 3 * this.j + 8, f48);
        aHB.a(floatBuffer, n + 3 * this.j + 8 + 1, f49);
        if (ListInvoker.b() != null) {
            a0D.b(++n2);
        }
    }

    public static void d(WorldRenderer worldRenderer) {
        a0D.k();
        abg_1 abg_12 = worldRenderer.c;
        if (abg_12.j == 14) {
            if (worldRenderer.d == 7 && worldRenderer.g % 4 == 0) {
                abg_12.a(worldRenderer, WorldRendererInvoker.e(worldRenderer) - 4 * abg_12.j);
            }
            long l4 = abg_12.h[abg_12.b];
            int n = WorldRendererInvoker.e(worldRenderer) - 14 + 12;
            HD.a(worldRenderer.s, n, (int)l4);
            HD.a(worldRenderer.s, n + 1, (int)(l4 >> 32));
        }
    }
}

