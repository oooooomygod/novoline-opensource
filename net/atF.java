/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ModelManagerInvoker;
import net.minecraft.block.*;
import net.minecraft.init.Blocks;
import java.util.Iterator;
import java.util.Map;

public class atF {
    private Map<IBlockState, JE> c = MapsInvoker.b();
    private ModelManager b;
    private df_0 a = new df_0();

    public df_0 d() {
        return this.a;
    }

    public ModelManager a() {
        return this.b;
    }

    private void c() {
        this.a(Blocks.air, Blocks.flowing_water, Blocks.water, Blocks.flowing_lava, Blocks.lava, Blocks.aR, Blocks.R, Blocks.g, Blocks.aA, Blocks.bp, Blocks.ck, Blocks.aS, Blocks.ao, Blocks.cj, Blocks.aH, Blocks.cs);
        this.a(Blocks.stone, Q.a(Q.a(new a4n(), BlockStone.P)));
        this.a(Blocks.aD, Q.a(Q.a(new a4n(), gs_0.S)));
        this.a((Block)Blocks.bP, Q.a(Q.a(Q.a(Q.a(new a4n(), gg_1.W), a3T.g), new a4_0[]{BlockLeaves.V, BlockLeaves.T})));
        this.a((Block)Blocks.bM, Q.a(Q.a(Q.a(Q.a(new a4n(), gh_2.W), a3T.d), new a4_0[]{BlockLeaves.V, BlockLeaves.T})));
        this.a((Block)Blocks.a9, Q.a(Q.a(new a4n(), new a4_0[]{ff_1.P})));
        this.a((Block)Blocks.P, Q.a(Q.a(new a4n(), new a4_0[]{gy_1.P})));
        this.a(Blocks.a5, Q.a(Q.a(new a4n(), new a4_0[]{fk_1.P})));
        this.a(Blocks.bz, Q.a(Q.a(new a4n(), new a4_0[]{fm_1.P})));
        this.a(Blocks.w, Q.a(Q.a(Q.a(new a4n(), hr_0.Q), a3T.l)));
        this.a((Block)Blocks.ai, Q.a(Q.a(Q.a(new a4n(), fl_1.Q), new a4_0[]{fl_1.P})));
        this.a(Blocks.ch, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.a4, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.aZ, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.S, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.cb, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.x, Q.a(Q.a(new a4n(), new a4_0[]{gv_2.R})));
        this.a(Blocks.b7, Q.a(Q.a(new a4n(), new a4_0[]{h5_0.V, h5_0.Q})));
        this.a((Block)Blocks.a_, Q.a(Q.a(Q.a(new a4n(), BlockPlanks.P), a3T.c)));
        this.a((Block)Blocks.e, Q.a(Q.a(Q.a(new a4n(), BlockPlanks.P), a3T.e)));
        this.a(Blocks.Y, Q.a(Q.a(new a4n(), new a4_0[]{h2_0.P})));
        this.a((Block)Blocks.c, Q.a(Q.a(new a4n(), new a4_0[]{gl_1.U})));
        this.a((Block)Blocks.af, Q.a(Q.a(new a4n(), new a4_0[]{gs_1.U})));
        this.a(Blocks.bh, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.o, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.aC, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.ax, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.aV, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.az, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.bb, Q.a(Q.a(new a4n(), new a4_0[]{g7_0.Q})));
        this.a(Blocks.b_, Q.a(Q.a(Q.a(new a4n(), fe_1.P), a3T.i)));
        this.a(Blocks.bl, Q.a(Q.a(Q.a(new a4n(), fe_1.P), a3T.v)));
        this.a(Blocks.cr, Q.a(Q.a(Q.a(new a4n(), fe_1.P), a3T.w)));
        this.a((Block)Blocks.ad, Q.a(Q.a(Q.a(new a4n(), fe_1.P), a3T.k)));
        this.a((Block)Blocks.am, Q.a(Q.a(Q.a(new a4n(), fe_1.P), a3T.o)));
        this.a(Blocks.bG, Q.a(Q.a(new a4n(), hl_2.P)));
        this.a(Blocks.r, Q.a(Q.a(new a4n(), g__0.P)));
        this.a((Block)Blocks.bN, Q.a(Q.a(new a4n(), fg_1.P)));
        this.a(Blocks.aw, Q.a(Q.a(new a4n(), new a4_0[]{gp_2.Q})));
        this.a((Block)Blocks.G, Q.a(Q.a(new a4n(), ye_1.c(Blocks.G))));
        this.a((Block)Blocks.bY, Q.a(Q.a(new a4n(), ye_1.c(Blocks.bY))));
        this.a((Block)Blocks.bA, Q.a(Q.a(Q.a(new a4n(), hp_2.Q), a3T.s)));
        this.a((Block)Blocks.bf, Q.a(Q.a(Q.a(new a4n(), hv_0.R), a3T.q)));
        this.a(Blocks.bV, Q.a(Q.a(Q.a(new a4n(), h6_0.P), a3T.a)));
        this.a(Blocks.z, Q.a(Q.a(new a4n(), hk_1.P)));
        this.a(Blocks.aB, Q.a(Q.a(new a4n(), new a4_0[]{BlockDispenser.P})));
        this.a(Blocks.ag, Q.a(Q.a(new a4n(), new a4_0[]{fm_2.P})));
        this.a(Blocks.b2, Q.a(Q.a(Q.a(new a4n(), gj_0.R), a3T.t)));
        this.a(Blocks.bO, Q.a(Q.a(Q.a(new a4n(), gt_1.R), a3T.b)));
        this.a(Blocks.planks, Q.a(Q.a(Q.a(new a4n(), BlockPlanks.P), a3T.u)));
        this.a(Blocks.sapling, Q.a(Q.a(Q.a(new a4n(), BlockSapling.P), a3T.p)));
        this.a((Block)Blocks.sand, Q.a(Q.a(new a4n(), BlockSand.Q)));
        this.a((Block)Blocks.t, Q.a(Q.a(new a4n(), new a4_0[]{fy_1.Q})));
        this.a(Blocks.N, Q.a(Q.a(new a4n(), new a4_0[]{fw_2.P})));
        this.a(Blocks.v, new a6u_0(this));
        this.a((Block)Blocks.ca, new a63(this));
        this.a(Blocks.aL, new a6x_0(this));
        this.a(Blocks.b9, new a67(this));
        this.a(Blocks.dirt, new a6Q(this));
        this.a((Block)Blocks.X, new a6I(this));
        this.a((Block)Blocks.ah, new a6g_0(this));
    }

    public KM a(IBlockState iBlockState) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        JE jE = this.b(iBlockState);
        if (jE == ModelManagerInvoker.a(this.b)) {
            if (block == Blocks.cj || block == Blocks.bp || block == Blocks.R || block == Blocks.aA || block == Blocks.cs || block == Blocks.aH) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.n);
            }
            if (block == Blocks.g) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.f);
            }
            if (block == Blocks.flowing_lava || block == Blocks.lava) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.h);
            }
            if (block == Blocks.flowing_water || block == Blocks.water) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.r);
            }
            if (block == Blocks.ck) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.m);
            }
            if (block == Blocks.ao) {
                return h9.b(ModelManagerInvoker.b(this.b), a3T.j);
            }
        }
        jE = ModelManagerInvoker.a(this.b);
        return aND.f(jE);
    }

    public void a(Block block, acf_0 acf_02) {
        awa_0.a(this.a, block, acf_02);
    }

    public void b() {
        MapInvoker.d(this.c);
        Iterator iterator = aS0.f(MapInvoker.b(awa_0.a(this.a)));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            MapInvoker.c(this.c, FG.b(entry), ModelManagerInvoker.a(this.b, (aRJ)FG.a(entry)));
        }
    }

    public atF(ModelManager modelManager) {
        this.b = modelManager;
        this.c();
    }

    public void a(Block ... blockArray) {
        this.a.a(blockArray);
    }

    public JE b(IBlockState iBlockState) {
        JE jE = (JE)MapInvoker.c(this.c, iBlockState);
        jE = ModelManagerInvoker.a(this.b);
        return jE;
    }
}

