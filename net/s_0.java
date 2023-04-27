/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;

/*
 * Renamed from net.s
 */
public class s_0 {
    protected int e;
    protected int d;
    protected World b;
    public RenderChunk[] c;
    protected int f;
    private static String g = "CL_00002531";
    protected RenderGlobal a;

    protected void a(int n) {
        int n2;
        this.f = n2 = n * 2 + 1;
        this.d = 16;
        this.e = n2;
    }

    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = MathHelper.e(n, 16);
        int n8 = MathHelper.e(n2, 16);
        int n9 = MathHelper.e(n3, 16);
        int n10 = MathHelper.e(n4, 16);
        int n11 = MathHelper.e(n5, 16);
        int n12 = MathHelper.e(n6, 16);
        for (int i = n7; i <= n10; ++i) {
            int n13 = i % this.f;
            n13 += this.f;
            for (int j = n8; j <= n11; ++j) {
                int n14 = j % this.d;
                n14 += this.d;
                for (int k = n9; k <= n12; ++k) {
                    int n15 = k % this.e;
                    int n16 = ((n15 += this.e) * this.d + n14) * this.f + n13;
                    RenderChunk renderChunk = this.c[n16];
                    afq_2.a(renderChunk, true);
                }
            }
        }
    }

    protected void a(a2J a2J2) {
        int n = this.f * this.d * this.e;
        this.c = new RenderChunk[n];
        int n2 = 0;
        for (int i = 0; i < this.f; ++i) {
            for (int j = 0; j < this.d; ++j) {
                for (int k = 0; k < this.e; ++k) {
                    int n3 = (k * this.d + j) * this.f + i;
                    BlockPos blockPos = new BlockPos(i * 16, j * 16, k * 16);
                    this.c[n3] = U3.a(a2J2, this.b, this.a, blockPos, n2++);
                }
            }
        }
    }

    public void a() {
        for (RenderChunk renderChunk : this.c) {
            renderChunk.h();
        }
    }

    public s_0(World world, int n, RenderGlobal renderGlobal, a2J a2J2) {
        this.a = renderGlobal;
        this.b = world;
        this.a(n);
        this.a(a2J2);
    }

    public void a(double d, double d2) {
        int n = MathHelper.floor_double(d) - 8;
        int n2 = MathHelper.floor_double(d2) - 8;
        int n3 = this.f * 16;
        for (int i = 0; i < this.f; ++i) {
            int n4 = this.a(n, n3, i);
            for (int j = 0; j < this.e; ++j) {
                int n5 = this.a(n2, n3, j);
                for (int k = 0; k < this.d; ++k) {
                    BlockPos blockPos;
                    int n6 = k * 16;
                    RenderChunk renderChunk = this.c[(j * this.d + k) * this.f + i];
                    BlockPos blockPos2 = afq_2.d(renderChunk);
                    if (amv_2.j(blockPos2) == n4 && amv_2.h(blockPos2) == n6 && amv_2.i(blockPos2) == n5 || (blockPos = new BlockPos(n4, n6, n5)).equals(afq_2.d(renderChunk))) continue;
                    afq_2.a(renderChunk, blockPos);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\tt]c3K\u0019x\r1b".toCharArray();
        int n2 = 0;
        int n3 = 46;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x64));
            n3 = n3;
        }
    }

    public RenderChunk a(BlockPos blockPos) {
        int n = amv_2.j(blockPos) >> 4;
        int n2 = amv_2.h(blockPos) >> 4;
        int n3 = amv_2.i(blockPos) >> 4;
        if (n2 < this.d) {
            n %= this.f;
            n3 %= this.e;
            int n4 = ((n3 += this.e) * this.d + n2) * this.f + (n += this.f);
            return this.c[n4];
        }
        return null;
    }

    private int a(int n, int n2, int n3) {
        int n4 = n3 * 16;
        int n5 = n4 - n + n2 / 2;
        return n4 - (n5 -= n2 - 1) / n2 * n2;
    }
}

