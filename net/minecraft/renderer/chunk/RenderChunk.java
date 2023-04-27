/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.renderer.chunk;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.Freecam;
import net.IBlockState;
import net.K3;
import net.N4;
import net.OV;
import net.RenderGlobal;
import net.SJ;
import net.World;
import net.a49;
import net.a5w_0;
import net.aAI;
import net.aC8;
import net.aDb;
import net.aFR;
import net.aH5;
import net.aS0;
import net.aav_0;
import net.ail_0;
import net.akg_2;
import net.amv_2;
import net.amx_0;
import net.ar2_0;
import net.aut_1;
import net.avo_0;
import net.axc_1;
import net.axe_2;
import net.ayi_0;
import net.ayy_0;
import net.azb_1;
import net.dg_1;
import net.dz_0;
import net.eg_0;
import net.ff_1;
import net.gs_1;
import net.hq_0;
import net.jv_0;
import net.lp_2;
import net.qy_0;
import net.rm_2;
import net.ud_2;
import net.uf_0;
import net.wc_1;
import net.yp_0;
import net.ys_2;
import net.zw_1;

public class RenderChunk {
    private static String i = "CL_00002452";
    private ReentrantLock w;
    private Set u;
    private static a5w_0[] o;
    private boolean a;
    private RenderGlobal j;
    private boolean r = false;
    private lp_2 p = null;
    private World g;
    private EnumMap f;
    private int k = -1;
    private int q;
    public rm_2 l;
    private boolean c;
    private boolean b = true;
    private BlockPos e;
    public amx_0 m = amx_0.d;
    private BlockPos[] s;
    private FloatBuffer t;
    public static int renderChunksUpdated;
    private aH5[] n;
    private ReentrantLock v;
    private a5w_0[] d;

    public amx_0 l() {
        return this.m;
    }

    public void a(float f, float f2, float f3, lp_2 lp_22) {
        amx_0 amx_02 = lp_22.g();
        if (azb_1.a(amx_02) != null && !azb_1.a(amx_02, a5w_0.TRANSLUCENT)) {
            WorldRenderer worldRenderer = uf_0.a(aAI.b(lp_22), a5w_0.TRANSLUCENT);
            this.a(worldRenderer, this.e);
            WorldRendererInvoker.a(worldRenderer, azb_1.a(amx_02));
            this.a(a5w_0.TRANSLUCENT, f, f2, f3, worldRenderer, amx_02);
        }
    }

    public aH5 a(int n) {
        return this.n[n];
    }

    public boolean f() {
        return this.r;
    }

    public void a() {
        this.e();
        this.m = amx_0.d;
    }

    public lp_2 c() {
        akg_2.a(this.w);
        try {
            this.e();
            lp_2 lp_22 = this.p = new lp_2(this, ud_2.REBUILD_CHUNK);
            return lp_22;
        }
        finally {
            akg_2.b(this.w);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "koD\u000fs,f\u001a\u0017.\r".toCharArray();
        int n2 = 0;
        int n3 = 33;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 9));
            n3 = n3;
        }
    }

    public void a(BlockPos blockPos) {
        this.a();
        this.e = blockPos;
        this.l = new rm_2(blockPos, amv_2.a(blockPos, 16, 16, 16));
        this.k();
        for (int i = 0; i < this.s.length; ++i) {
            this.s[i] = null;
        }
    }

    public boolean b(int n) {
        if (this.k == n) {
            return false;
        }
        this.k = n;
        return true;
    }

    public boolean m() {
        return this.b;
    }

    protected void e() {
        akg_2.a(this.w);
        try {
            if (this.p != null && aAI.a(this.p) != a49.DONE) {
                aAI.f(this.p);
                this.p = null;
            }
            return;
        }
        finally {
            akg_2.b(this.w);
        }
    }

    private void k() {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.loadIdentity();
        float f = 1.000001f;
        GlStateManagerInvoker.translate(-8.0f, -8.0f, -8.0f);
        GlStateManagerInvoker.c(f, f, f);
        GlStateManagerInvoker.translate(8.0f, 8.0f, 8.0f);
        GlStateManagerInvoker.a(2982, this.t);
        GlStateManagerInvoker.popMatrix();
    }

    public lp_2 i() {
        akg_2.a(this.w);
        try {
            lp_2 lp_22;
            if (this.p != null && aAI.a(this.p) == a49.PENDING) {
                lp_2 lp_23;
                lp_2 lp_24 = lp_23 = null;
                return lp_24;
            }
            if (this.p != null && aAI.a(this.p) != a49.DONE) {
                aAI.f(this.p);
                this.p = null;
            }
            this.p = new lp_2(this, ud_2.RESORT_TRANSPARENCY);
            this.p.a(this.m);
            lp_2 lp_25 = lp_22 = this.p;
            return lp_25;
        }
        finally {
            akg_2.b(this.w);
        }
    }

    private boolean j() {
        if (this.g instanceof WorldClient) {
            WorldClient worldClient = (WorldClient)this.g;
            return worldClient.b();
        }
        return false;
    }

    public BlockPos b(EnumFacing enumFacing) {
        return this.a(enumFacing);
    }

    public BlockPos b() {
        return this.e;
    }

    public void h() {
        this.a();
        this.g = null;
        for (int i = 0; i < a5w_0.values().length; ++i) {
            if (this.n[i] == null) continue;
            dg_1.b(this.n[i]);
        }
    }

    public void d() {
        GlStateManagerInvoker.a(this.t);
    }

    public void b(float f, float f2, float f3, lp_2 lp_22) {
        Object object;
        Object object2;
        avo_0 avo_02;
        amx_0 amx_02 = new amx_0();
        BlockPos blockPos = this.e;
        BlockPos blockPos2 = amv_2.a(blockPos, 15, 15, 15);
        akg_2.a(aAI.h(lp_22));
        try {
            if (aAI.a(lp_22) != a49.COMPILING) {
                return;
            }
            if (this.g == null) {
                return;
            }
            avo_02 = this.a(this.g, amv_2.a(blockPos, -1, -1, -1), amv_2.a(blockPos2, 1, 1, 1), 1);
            if (ayy_0.d(ail_0.bH)) {
                aDb.f(ail_0.bH, new Object[]{this.g, this.e, avo_02});
            }
            lp_22.a(amx_02);
        }
        finally {
            akg_2.b(aAI.h(lp_22));
        }
        axc_1 axc_12 = new axc_1();
        HashSet hashSet = axe_2.a();
        if (!ar2_0.a(avo_02)) {
            ++renderChunksUpdated;
            object2 = new boolean[o.length];
            object = MCInvoker.Y(MCInvoker.f());
            Iterator iterator = OV.a(aut_1.a(blockPos, blockPos2));
            ayy_0.d(ail_0.bc);
            ayy_0.d(ail_0.a0);
            ayy_0.d(ail_0.b0);
            while (dz_0.c(iterator)) {
                a5w_0[] a5w_0Array;
                Object object3;
                zw_1 object5 = (zw_1)dz_0.b(iterator);
                IBlockState iBlockState = ar2_0.b(avo_02, object5);
                Block block = BlockStateInvoker.getBlock(iBlockState);
                if (BlocksInvoker.L(block) && !wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) && !Freecam.I) {
                    ayi_0.a(axc_12, object5);
                }
                if (K3.a(iBlockState)) {
                    TileEntity tileEntity = ar2_0.a(avo_02, new BlockPos(object5));
                    object3 = aFR.a(hq_0.d, tileEntity);
                    azb_1.a(amx_02, tileEntity);
                    if (qy_0.a((eg_0)object3)) {
                        yp_0.a(hashSet, tileEntity);
                    }
                }
                object3 = a5w_0Array = o;
                int n = ((a5w_0[])object3).length;
                for (int i = 0; i < n; ++i) {
                    a5w_0 a5w_02;
                    a5w_0 a5w_03 = a5w_02 = object3[i];
                    aDb.e(block, ail_0.a0, new Object[]{a5w_03});
                }
            }
            for (a5w_0 a5w_04 : o) {
                if (object2[a5w_04.ordinal()]) {
                    amx_02.b(a5w_04);
                }
                if (!azb_1.c(amx_02, a5w_04)) continue;
                if (ys_2.aC()) {
                    aav_0.e(uf_0.a(aAI.b(lp_22), a5w_04));
                }
                this.a(a5w_04, f, f2, f3, uf_0.a(aAI.b(lp_22), a5w_04), amx_02);
            }
        }
        azb_1.a(amx_02, ayi_0.a(axc_12));
        akg_2.a(this.w);
        try {
            object2 = axe_2.b(hashSet);
            object = axe_2.b(this.u);
            yp_0.a((HashSet)object2, this.u);
            yp_0.a((HashSet)object, hashSet);
            aS0.e(this.u);
            aS0.a(this.u, hashSet);
            jv_0.a(this.j, (Collection)object, (Collection)object2);
            return;
        }
        finally {
            akg_2.b(this.w);
        }
    }

    private void a(WorldRenderer worldRenderer, BlockPos blockPos) {
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.g);
        WorldRendererInvoker.b(worldRenderer, (double)(-amv_2.j(blockPos)), (double)(-amv_2.h(blockPos)), (double)(-amv_2.i(blockPos)));
    }

    private void a(a5w_0 a5w_02, float f, float f2, float f3, WorldRenderer worldRenderer, amx_0 amx_02) {
        if (a5w_02 == a5w_0.TRANSLUCENT && !azb_1.a(amx_02, a5w_02)) {
            WorldRendererInvoker.b(worldRenderer, f, f2, f3);
            azb_1.a(amx_02, WorldRendererInvoker.k(worldRenderer));
        }
        WorldRendererInvoker.a(worldRenderer);
    }

    public void a(boolean bl) {
        this.b = bl;
        if (this.b) {
            if (this.j()) {
                this.r = true;
            }
        } else {
            this.r = false;
        }
    }

    public ReentrantLock g() {
        return this.w;
    }

    public void a(amx_0 amx_02) {
        akg_2.a(this.v);
        try {
            this.m = amx_02;
            return;
        }
        finally {
            akg_2.b(this.v);
        }
    }

    private a5w_0 a(Block block, a5w_0 a5w_02) {
        if (this.c) {
            if (a5w_02 == a5w_0.CUTOUT) {
                if (block instanceof gs_1) {
                    return a5w_02;
                }
                if (block instanceof ff_1) {
                    return a5w_02;
                }
                return a5w_0.CUTOUT_MIPPED;
            }
        } else if (a5w_02 == a5w_0.CUTOUT_MIPPED) {
            return a5w_0.CUTOUT;
        }
        return a5w_02;
    }

    protected avo_0 a(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        return new avo_0(world, blockPos, blockPos2, n);
    }

    public RenderChunk(World world, RenderGlobal renderGlobal, BlockPos blockPos, int n) {
        this.w = new ReentrantLock();
        this.v = new ReentrantLock();
        this.u = axe_2.a();
        this.t = N4.d(16);
        this.n = new aH5[a5w_0.values().length];
        this.s = new BlockPos[EnumFacing.VALUES.length];
        this.d = new a5w_0[1];
        this.c = ys_2.aZ();
        this.a = !aC8.b(ail_0.b);
        this.g = world;
        this.j = renderGlobal;
        this.q = n;
        if (!blockPos.equals(this.b())) {
            this.a(blockPos);
        }
        if (OpenGlHelper.f()) {
            for (int i = 0; i < a5w_0.values().length; ++i) {
                this.n[i] = new aH5(DefaultVertexFormats.g);
            }
        }
    }

    public BlockPos a(EnumFacing enumFacing) {
        int n = SJ.i(enumFacing);
        BlockPos blockPos = this.s[n];
        this.s[n] = blockPos = amv_2.a(this.b(), enumFacing, 16);
        return blockPos;
    }
}

