/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.DefaultVertexFormats;
import net.minecraft.util.ReportedException;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import cc.novoline.modules.visual.XRay;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class X6 {
    private static float a;
    public static CopyOnWriteArrayList c;
    private static String b = "CL_00002518";

    public X6() {
        if (aSG.a(ail_0.af)) {
            aDb.a(ail_0.af, Boolean.FALSE);
        }
    }

    public boolean a(IBlockAccess iBlockAccess, JE jE, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        BlocksInvoker.a(block, iBlockAccess, blockPos);
        return this.a(iBlockAccess, jE, iBlockState, blockPos, worldRenderer, true);
    }

    public void a(JE jE, float f, float f2, float f3, float f4) {
        for (EnumFacing enumFacing : EnumFacing.VALUES) {
            this.a(f, f2, f3, f4, aND.a(jE, enumFacing));
        }
        this.a(f, f2, f3, f4, aND.d(jE));
    }

    public boolean a(IBlockAccess iBlockAccess, JE jE, Block block, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        boolean bl2 = false;
        atV atV2 = null;
        for (EnumFacing enumFacing : EnumFacing.VALUES) {
            BlockPos blockPos2;
            List list = aND.a(jE, enumFacing);
            if (ListInvoker.isEmpty(list) || !BlocksInvoker.a(block, iBlockAccess, blockPos2 = amv_2.a(blockPos, enumFacing), enumFacing)) continue;
            atV2 = en_0.a(iBlockAccess, iBlockState, blockPos);
            if (!en_0.a(atV2, list) && ys_2.ag()) {
                list = QL.a(iBlockAccess, block, blockPos, enumFacing, list);
            }
            int n = BlocksInvoker.c(block, iBlockAccess, blockPos2);
            this.a(iBlockAccess, block, blockPos, enumFacing, n, false, worldRenderer, list, atV2);
            bl2 = true;
        }
        List list = aND.d(jE);
        if (!ListInvoker.isEmpty(list)) {
            atV2 = en_0.a(iBlockAccess, iBlockState, blockPos);
            this.a(iBlockAccess, block, blockPos, null, -1, true, worldRenderer, list, atV2);
            bl2 = true;
        }
        if (ys_2.V() && !en_0.f(atV2) && eV.a(iBlockAccess, block, iBlockState, blockPos) && eV.a(iBlockAccess, block, iBlockState, blockPos)) {
            JE jE2 = eV.a();
            IBlockState iBlockState2 = eV.b();
            this.a(iBlockAccess, jE2, BlockStateInvoker.getBlock(iBlockState2), iBlockState2, blockPos, worldRenderer, true);
        }
        return bl2;
    }

    public boolean a(IBlockAccess iBlockAccess, JE jE, Block block, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        return this.b(iBlockAccess, jE, block, aG3.c(iBlockAccess, blockPos), blockPos, worldRenderer, bl);
    }

    public void a(JE jE, IBlockState iBlockState, float f, boolean bl) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        BlocksInvoker.q(block);
        GlStateManagerInvoker.b(90.0f, 0.0f, 1.0f, 0.0f);
        int n = BlocksInvoker.e(block, BlocksInvoker.d(block, iBlockState));
        if (EntityRenderer.c) {
            n = aiv_2.b(n);
        }
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GlStateManagerInvoker.color(f, f, f, 1.0f);
        this.a(jE, f, f2, f3, f4);
    }

    public static float a(float f) {
        return f == 0.2f ? a : f;
    }

    public static void a() {
        a = 1.0f - ys_2.c() * 0.8f;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private void a(IBlockAccess iBlockAccess, Block block, BlockPos blockPos, EnumFacing enumFacing, int n, boolean bl, WorldRenderer worldRenderer, List list, atV atV2) {
        BitSet bitSet = en_0.e(atV2);
        IBlockState iBlockState = en_0.c(atV2);
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        qn_2 qn_22 = BlocksInvoker.f(block);
        if (qn_22 != qn_2.NONE) {
            int n2 = amv_2.j(blockPos);
            int n3 = amv_2.i(blockPos);
            long l4 = (long)(n2 * 3129871) ^ (long)n3 * 116129781L;
            l4 = l4 * l4 * 42317861L + l4 * 11L;
            d += ((double)((float)(l4 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d3 += ((double)((float)(l4 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (qn_22 == qn_2.XYZ) {
                d2 += ((double)((float)(l4 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            a9Z a9Z2 = (a9Z)object;
            if (!en_0.a(atV2, a9Z2)) {
                a9Z a9Z3 = a9Z2;
                if (ys_2.u()) {
                    a9Z2 = ii_0.a(iBlockAccess, iBlockState, blockPos, a9Z2, atV2);
                }
                if (a9Z2 == a9Z3 && ys_2.B()) {
                    a9Z2 = aMX.a(blockPos, a9Z2);
                }
            }
            this.a(block, aX3.d(a9Z2), aX3.f(a9Z2), null, bitSet);
            int n4 = n = aM_.a(bitSet, 0) ? BlocksInvoker.c(block, iBlockAccess, amv_2.a(blockPos, aX3.f(a9Z2))) : BlocksInvoker.c(block, iBlockAccess, blockPos);
            if (WorldRendererInvoker.d(worldRenderer)) {
                WorldRendererInvoker.a(worldRenderer, aX3.c(a9Z2));
                WorldRendererInvoker.a(worldRenderer, aX3.a(a9Z2));
            } else {
                WorldRendererInvoker.a(worldRenderer, aX3.d(a9Z2));
            }
            WorldRendererInvoker.a(worldRenderer, n, n, n, n);
            int n5 = ajT.a(a9Z2, block, iBlockAccess, blockPos, atV2);
            if (aX3.b(a9Z2) || n5 != -1) {
                int n6 = n5 != -1 ? n5 : BlocksInvoker.a(block, iBlockAccess, blockPos, aX3.e(a9Z2));
                if (EntityRenderer.c) {
                    n6 = aiv_2.b(n6);
                }
                float f = (float)(n6 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n6 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n6 & 0xFF) / 255.0f;
                WorldRendererInvoker.b(worldRenderer, f, f2, f3, 4);
                WorldRendererInvoker.b(worldRenderer, f, f2, f3, 3);
                WorldRendererInvoker.b(worldRenderer, f, f2, f3, 2);
                WorldRendererInvoker.b(worldRenderer, f, f2, f3, 1);
            }
            WorldRendererInvoker.c(worldRenderer, d, d2, d3);
        }
    }

    private void a(float f, float f2, float f3, float f4, List list) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            a9Z a9Z2 = (a9Z)object;
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.n);
            WorldRendererInvoker.a(worldRenderer, aX3.d(a9Z2));
            if (aX3.b(a9Z2)) {
                WorldRendererInvoker.c(worldRenderer, f2 * f, f3 * f, f4 * f);
            } else {
                WorldRendererInvoker.c(worldRenderer, f, f, f);
            }
            zl_2 zl_22 = SJ.g(aX3.f(a9Z2));
            WorldRendererInvoker.a(worldRenderer, FJ.a(zl_22), FJ.b(zl_22), FJ.c(zl_22));
            TessellatorInvoker.draw(tessellator);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "G3g'\u0001?\u00106J\t/".toCharArray();
        int n2 = 0;
        int n3 = 57;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3D));
            n3 = n3;
        }
    }

    private void a(Block block, int[] nArray, EnumFacing enumFacing, float[] fArray, BitSet bitSet) {
        float f = 32.0f;
        float f2 = 32.0f;
        float f3 = 32.0f;
        float f4 = -32.0f;
        float f5 = -32.0f;
        float f6 = -32.0f;
        int n = nArray.length / 4;
        int n2 = 0;
        while (true) {
            float f7 = axx_1.a(nArray[n2 * n]);
            float f8 = axx_1.a(nArray[n2 * n + 1]);
            float f9 = axx_1.a(nArray[n2 * n + 2]);
            f = MathInvoker.a(f, f7);
            f2 = MathInvoker.a(f2, f8);
            f3 = MathInvoker.a(f3, f9);
            f4 = MathInvoker.b(f4, f7);
            f5 = MathInvoker.b(f5, f8);
            f6 = MathInvoker.b(f6, f9);
            ++n2;
        }
    }

    public boolean b(IBlockAccess iBlockAccess, JE jE, Block block, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        return this.a(iBlockAccess, jE, block, aG3.c(iBlockAccess, blockPos), blockPos, worldRenderer, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(IBlockAccess iBlockAccess, JE jE, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        Block block;
        boolean bl2 = MCInvoker.b() && BlocksInvoker.G(BlockStateInvoker.getBlock(iBlockState)) == 0 && aND.b(jE);
        try {
            block = BlockStateInvoker.getBlock(iBlockState);
            if (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY))) {
                return this.b(iBlockAccess, jE, block, iBlockState, blockPos, worldRenderer, bl);
            }
            if (!ys_2.U() || !(BlockStateInvoker.getBlock(iBlockState) instanceof BlockLeavesBase)) return this.b(iBlockAccess, jE, block, iBlockState, blockPos, worldRenderer, bl);
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, at7.d);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, at7.b);
            CrashReportCategoryInvoker.a(crashReportCategory, blockPos, iBlockState);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, at7.a, auk_2.b(bl2));
            throw new ReportedException(crashReport);
        }
        jE = rj_1.a(jE);
        return this.b(iBlockAccess, jE, block, iBlockState, blockPos, worldRenderer, bl);
    }

    public boolean b(IBlockAccess iBlockAccess, JE jE, Block block, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        boolean bl2 = false;
        atV atV2 = null;
        for (EnumFacing enumFacing : EnumFacing.VALUES) {
            Block block2;
            XRay xRay;
            BlockPos blockPos2;
            List list = aND.a(jE, enumFacing);
            if (ListInvoker.isEmpty(list) || !BlocksInvoker.a(block, iBlockAccess, blockPos2 = amv_2.a(blockPos, enumFacing), enumFacing)) continue;
            if (wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) && pc_1.b(xRay = (XRay)ModuleInvoker.isEnable(ModuleRegistry.XRAY)) && ((block2 = BlockStateInvoker.getBlock(BlockInvoker.getMaterial(MCInvoker.f().world, blockPos))) instanceof gz_2 || block2 instanceof gw_2)) {
                double d = amv_2.j(blockPos);
                double d2 = amv_2.h(blockPos);
                double d3 = amv_2.i(blockPos);
                double d4 = PlayerInvoker.a(MCInvoker.f().player, d, d3);
                if ((StringPropertyInvoker.isMode(pc_1.c(xRay), at7.c) || d4 > 7.0) && d4 <= (double)pc_1.f(xRay)) {
                    BlockPos blockPos3 = new BlockPos(d, d2, d3);
                    if (!ListInvoker.contains(pc_1.e(xRay), blockPos3)) {
                        ListInvoker.add(pc_1.e(xRay), blockPos3);
                    }
                }
            }
            if (!en_0.a(atV2 = en_0.a(iBlockAccess, iBlockState, blockPos), list) && ys_2.ag()) {
                list = QL.a(iBlockAccess, block, blockPos, enumFacing, list);
            }
            this.a(iBlockAccess, block, blockPos, worldRenderer, list, atV2);
            bl2 = true;
        }
        List list = aND.d(jE);
        if (!ListInvoker.isEmpty(list)) {
            atV2 = en_0.a(iBlockAccess, iBlockState, blockPos);
            this.a(iBlockAccess, block, blockPos, worldRenderer, list, atV2);
            bl2 = true;
        }
        if (ys_2.V() && !en_0.f(atV2) && eV.a(iBlockAccess, block, iBlockState, blockPos)) {
            JE jE2 = eV.a();
            IBlockState iBlockState2 = eV.b();
            this.b(iBlockAccess, jE2, BlockStateInvoker.getBlock(iBlockState2), iBlockState2, blockPos, worldRenderer, true);
        }
        return bl2;
    }

    private void a(IBlockAccess iBlockAccess, Block block, BlockPos blockPos, WorldRenderer worldRenderer, List list, atV atV2) {
        float[] fArray = en_0.g(atV2);
        BitSet bitSet = en_0.e(atV2);
        VC vC = en_0.i(atV2);
        IBlockState iBlockState = en_0.c(atV2);
        double d = amv_2.j(blockPos);
        double d2 = amv_2.h(blockPos);
        double d3 = amv_2.i(blockPos);
        qn_2 qn_22 = BlocksInvoker.f(block);
        if (qn_22 != qn_2.NONE) {
            long l4 = MathHelper.a(blockPos);
            d += ((double)((float)(l4 >> 16 & 0xFL) / 15.0f) - 0.5) * 0.5;
            d3 += ((double)((float)(l4 >> 24 & 0xFL) / 15.0f) - 0.5) * 0.5;
            if (qn_22 == qn_2.XYZ) {
                d2 += ((double)((float)(l4 >> 20 & 0xFL) / 15.0f) - 1.0) * 0.2;
            }
        }
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            a9Z a9Z2 = (a9Z)object;
            if (!en_0.a(atV2, a9Z2)) {
                a9Z a9Z3 = a9Z2;
                if (ys_2.u()) {
                    a9Z2 = ii_0.a(iBlockAccess, iBlockState, blockPos, a9Z2, atV2);
                }
                if (a9Z2 == a9Z3 && ys_2.B()) {
                    a9Z2 = aMX.a(blockPos, a9Z2);
                }
            }
            this.a(block, aX3.d(a9Z2), aX3.f(a9Z2), fArray, bitSet);
            axq_0.a(vC, iBlockAccess, block, blockPos, aX3.f(a9Z2), fArray, bitSet);
            if (WorldRendererInvoker.d(worldRenderer)) {
                WorldRendererInvoker.a(worldRenderer, aX3.c(a9Z2));
                WorldRendererInvoker.a(worldRenderer, aX3.a(a9Z2));
            } else {
                WorldRendererInvoker.a(worldRenderer, aX3.d(a9Z2));
            }
            WorldRendererInvoker.a(worldRenderer, VC.b(vC)[0], VC.b(vC)[1], VC.b(vC)[2], VC.b(vC)[3]);
            int n = ajT.a(a9Z2, block, iBlockAccess, blockPos, atV2);
            if (!aX3.b(a9Z2) && n == -1) {
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[0], VC.a(vC)[0], VC.a(vC)[0], 4);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[1], VC.a(vC)[1], VC.a(vC)[1], 3);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[2], VC.a(vC)[2], VC.a(vC)[2], 2);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[3], VC.a(vC)[3], VC.a(vC)[3], 1);
            } else {
                int n2 = n != -1 ? n : BlocksInvoker.a(block, iBlockAccess, blockPos, aX3.e(a9Z2));
                if (EntityRenderer.c) {
                    n2 = aiv_2.b(n2);
                }
                float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n2 & 0xFF) / 255.0f;
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[0] * f, VC.a(vC)[0] * f2, VC.a(vC)[0] * f3, 4);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[1] * f, VC.a(vC)[1] * f2, VC.a(vC)[1] * f3, 3);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[2] * f, VC.a(vC)[2] * f2, VC.a(vC)[2] * f3, 2);
                WorldRendererInvoker.b(worldRenderer, VC.a(vC)[3] * f, VC.a(vC)[3] * f2, VC.a(vC)[3] * f3, 1);
            }
            WorldRendererInvoker.c(worldRenderer, d, d2, d3);
        }
    }
}

