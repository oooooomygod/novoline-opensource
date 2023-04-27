/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import deobf.MCInvoker;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;

public class MU {
    private KM[] b = new KM[2];
    private static String c = "CL_00002519";
    private KM[] a = new KM[2];

    public MU() {
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "T\u0013+\u001cW]D%jE\u0015".toCharArray();
        int n2 = 0;
        int n3 = 96;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x77));
            n3 = n3;
        }
    }

    public boolean a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        BlockLiquid go_12 = (BlockLiquid)BlockStateInvoker.getBlock(iBlockState);
        mu_1.a(go_12, iBlockAccess, blockPos);
        KM[] kMArray = mu_1.a(go_12) == Material.e ? this.b : this.a;
        atV atV2 = en_0.a(iBlockAccess, iBlockState, blockPos);
        int n = ajT.a(iBlockAccess, iBlockState, blockPos, atV2);
        float f9 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f10 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f11 = (float)(n & 0xFF) / 255.0f;
        mu_1.a(go_12, iBlockAccess, amv_2.e(blockPos), EnumFacing.UP);
        mu_1.a(go_12, iBlockAccess, amv_2.g(blockPos), EnumFacing.DOWN);
        boolean[] blArray = en_0.b(atV2);
        blArray[0] = mu_1.a(go_12, iBlockAccess, amv_2.a(blockPos), EnumFacing.NORTH);
        blArray[1] = mu_1.a(go_12, iBlockAccess, amv_2.b(blockPos), EnumFacing.SOUTH);
        blArray[2] = mu_1.a(go_12, iBlockAccess, amv_2.d(blockPos), EnumFacing.WEST);
        blArray[3] = mu_1.a(go_12, iBlockAccess, amv_2.f(blockPos), EnumFacing.EAST);
        if (!(blArray[0] || blArray[1] || blArray[2] || blArray[3])) {
            return false;
        }
        float f12 = 0.5f;
        float f13 = 1.0f;
        float f14 = 0.8f;
        Material material = mu_1.a(go_12);
        float f15 = this.a(iBlockAccess, blockPos, material);
        float f16 = this.a(iBlockAccess, amv_2.b(blockPos), material);
        float f17 = this.a(iBlockAccess, amv_2.b(amv_2.f(blockPos)), material);
        float f18 = this.a(iBlockAccess, amv_2.f(blockPos), material);
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        float f19 = 0.001f;
        KM kM = kMArray[0];
        float f20 = (float)mu_1.a(iBlockAccess, blockPos, material);
        if (f20 > -999.0f) {
            kM = kMArray[1];
        }
        WorldRendererInvoker.b(worldRenderer, kM);
        f15 -= f19;
        f16 -= f19;
        f17 -= f19;
        f18 -= f19;
        if (f20 < -999.0f) {
            f8 = qg_2.a(kM, 0.0);
            f7 = qg_2.b(kM, 0.0);
            f6 = f8;
            f5 = qg_2.b(kM, 16.0);
            f4 = qg_2.a(kM, 16.0);
            f3 = f5;
            f2 = f4;
            f = f7;
        } else {
            float f21 = MathHelper.sin(f20) * 0.25f;
            float f22 = MathHelper.cos(f20) * 0.25f;
            float f23 = 8.0f;
            f8 = qg_2.a(kM, (double)(8.0f + (-f22 - f21) * 16.0f));
            f7 = qg_2.b(kM, (double)(8.0f + (-f22 + f21) * 16.0f));
            f6 = qg_2.a(kM, (double)(8.0f + (-f22 + f21) * 16.0f));
            f5 = qg_2.b(kM, (double)(8.0f + (f22 + f21) * 16.0f));
            f4 = qg_2.a(kM, (double)(8.0f + (f22 + f21) * 16.0f));
            f3 = qg_2.b(kM, (double)(8.0f + (f22 - f21) * 16.0f));
            f2 = qg_2.a(kM, (double)(8.0f + (f22 - f21) * 16.0f));
            f = qg_2.b(kM, (double)(8.0f + (-f22 - f21) * 16.0f));
        }
        int n2 = mu_1.b(go_12, iBlockAccess, blockPos);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        float f24 = f13 * f9;
        float f25 = f13 * f10;
        float f26 = f13 * f11;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + (double)f15, d3 + 0.0), f24, f25, f26, 1.0f), f8, f7), n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + (double)f16, d3 + 1.0), f24, f25, f26, 1.0f), f6, f5), n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f17, d3 + 1.0), f24, f25, f26, 1.0f), f4, f3), n3, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f18, d3 + 0.0), f24, f25, f26, 1.0f), f2, f), n3, n4));
        if (mu_1.c(go_12, iBlockAccess, amv_2.e(blockPos))) {
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + (double)f15, d3 + 0.0), f24, f25, f26, 1.0f), f8, f7), n3, n4));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f18, d3 + 0.0), f24, f25, f26, 1.0f), f2, f), n3, n4));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f17, d3 + 1.0), f24, f25, f26, 1.0f), f4, f3), n3, n4));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + (double)f16, d3 + 1.0), f24, f25, f26, 1.0f), f6, f5), n3, n4));
        }
        float f27 = qg_2.a(kMArray[0]);
        f20 = qg_2.m(kMArray[0]);
        f8 = qg_2.f(kMArray[0]);
        f6 = qg_2.k(kMArray[0]);
        int n5 = mu_1.b(go_12, iBlockAccess, amv_2.g(blockPos));
        int n6 = n5 >> 16 & 0xFFFF;
        int n7 = n5 & 0xFFFF;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d2, d3 + 1.0), f12, f12, f12, 1.0f), f27, f6), n6, n7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d2, d3), f12, f12, f12, 1.0f), f27, f8), n6, n7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2, d3), f12, f12, f12, 1.0f), f20, f8), n6, n7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2, d3 + 1.0), f12, f12, f12, 1.0f), f20, f6), n6, n7));
        int n8 = 0;
        while (true) {
            int n9 = 0;
            int n10 = 0;
            BlockPos blockPos2 = amv_2.a(blockPos, n9, 0, --n10);
            KM kM2 = kMArray[1];
            WorldRendererInvoker.b(worldRenderer, kM2);
            if (blArray[n8]) {
                f = f15;
                float f28 = f18;
                double d4 = d;
                double d5 = d + 1.0;
                double d6 = d3 + (double)f19;
                double d7 = d3 + (double)f19;
                f26 = qg_2.a(kM2, 0.0);
                float f29 = qg_2.a(kM2, 8.0);
                float f30 = qg_2.b(kM2, (double)((1.0f - f) * 16.0f * 0.5f));
                float f31 = qg_2.b(kM2, (double)((1.0f - f28) * 16.0f * 0.5f));
                float f32 = qg_2.b(kM2, 8.0);
                int n11 = mu_1.b(go_12, iBlockAccess, blockPos2);
                int n12 = n11 >> 16 & 0xFFFF;
                int n13 = n11 & 0xFFFF;
                float f33 = f14;
                float f34 = f13 * f33 * f9;
                float f35 = f13 * f33 * f10;
                float f36 = f13 * f33 * f11;
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d4, d2 + (double)f, d6), f34, f35, f36, 1.0f), f26, f30), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d5, d2 + (double)f28, d7), f34, f35, f36, 1.0f), f29, f31), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d5, d2 + 0.0, d7), f34, f35, f36, 1.0f), f29, f32), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d4, d2 + 0.0, d6), f34, f35, f36, 1.0f), f26, f32), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d4, d2 + 0.0, d6), f34, f35, f36, 1.0f), f26, f32), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d5, d2 + 0.0, d7), f34, f35, f36, 1.0f), f29, f32), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d5, d2 + (double)f28, d7), f34, f35, f36, 1.0f), f29, f31), n12, n13));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d4, d2 + (double)f, d6), f34, f35, f36, 1.0f), f26, f30), n12, n13));
            }
            ++n8;
        }
    }

    protected void a() {
        TextureMap textureMap = MCInvoker.f(MCInvoker.f());
        this.b[0] = h9.b(textureMap, a5T.c);
        this.b[1] = h9.b(textureMap, a5T.a);
        this.a[0] = h9.b(textureMap, a5T.d);
        this.a[1] = h9.b(textureMap, a5T.b);
    }

    /*
     * WARNING - void declaration
     */
    private float a(IBlockAccess iBlockAccess, BlockPos blockPos, Material material) {
        float f = 0.0f;
        int n = 0;
        BlockPos blockPos2;
        while (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos2 = amv_2.a(blockPos, -(n & 1), 0, -(n >> 1 & 1)))))) != material) {
            void var4_6;
            IBlockState iBlockState = aG3.c(iBlockAccess, blockPos2);
            Material material2 = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState));
            if (material2 != material) {
                if (!akm_1.i(material2)) {
                    f += 1.0f;
                    ++var4_6;
                }
            } else {
                int n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P));
                if (n2 < 8) {
                    // empty if block
                }
                f += mu_1.a(n2) * 10.0f;
                var4_6 += 10;
                f += mu_1.a(n2);
                ++var4_6;
            }
            ++n;
        }
        return 1.0f;
    }
}

