/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.renderer.entity;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModelManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.modules.visual.Glint;

import java.util.List;

import deobf.*;
import net.minecraft.block.Block;
import net.CrashReport;
import deobf.EntityRenderer;
import deobf.EnumFacing;
import net.F3;
import net.FJ;
import net.HL;
import net.IResourceManagerReloadListener;
import net.Item;
import net.Items;
import net.JE;
import net.Ky;
import net.MQ;
import net.ModelManager;
import net.P8;
import net.ResourceLocation;
import net.SJ;
import net.SL;
import net.SX;
import net.TextureManager;
import net.UI;
import net.XR;
import net.YZ;
import net.a2y_0;
import net.a4b;
import net.a53;
import net.a5w_0;
import net.a6s_0;
import net.a6w_0;
import net.a7l_0;
import net.a8h_0;
import net.a9Z;
import net.aAB;
import net.aC0;
import net.aC8;
import net.aCq;
import net.aDb;
import net.aER;
import net.aI_;
import net.aL0;
import net.aND;
import net.aPL;
import net.aPM;
import net.aRJ;
import net.aSQ;
import net.aSZ;
import net.aVE;
import net.aVL;
import net.aW5;
import net.aX3;
import net.aar_0;
import net.act_2;
import net.acz_0;
import net.ad_0;
import net.aeo_1;
import net.afm_2;
import net.ahl_2;
import net.ahu_0;
import net.ail_0;
import net.aiv_2;
import net.aj4;
import net.ajF;
import net.ajT;
import net.akb_0;
import net.akv_1;
import net.am1_0;
import net.anw_0;
import net.aow_0;
import net.av4_0;
import net.axw_2;
import net.ayv_0;
import net.ayy_0;
import net.dq_1;
import net.en_2;
import net.go_0;
import net.h9;
import net.hb_2;
import net.le_1;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.util.ReportedException;
import net.mp_0;
import net.mr_0;
import net.my_2;
import net.pl_0;
import net.px_0;
import net.u3_0;
import net.vi_2;
import net.vx_0;
import net.ya_1;
import net.ys_2;
import net.zl_2;
import net.zq_1;

public class RenderItem
implements IResourceManagerReloadListener {
    private int a = 0;
    private a8h_0 f;
    public float e;
    private TextureManager c;
    private boolean i = false;
    public ModelManager h;
    private aRJ b = null;
    private static ResourceLocation d = new ResourceLocation(aow_0.fp);
    private boolean g = true;

    @Override
    public void b(aI_ aI_2) {
        aPL.b(this.f);
    }

    public RenderItem(TextureManager textureManager, ModelManager modelManager) {
        this.c = textureManager;
        this.h = modelManager;
        this.f = vi_2.a(ail_0.cW) ? (a8h_0)aDb.b(ail_0.cW, new Object[]{modelManager}) : new a8h_0(modelManager);
        this.c();
    }

    private void a(Block block, String string) {
        this.a(block, 0, string);
    }

    private static aRJ lambda$registerItems$14(ItemStack itemStack) {
        return new aRJ(aow_0.gP, aow_0.cI);
    }

    public void a(ItemStack itemStack, float f, float f2, double d) {
        if (act_2.k(itemStack) != null) {
            this.e += 50.0f;
            try {
                this.b(itemStack, f, f2, d);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aow_0.L);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aow_0.gc);
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.hX, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$8(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.dS, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$9(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.c3, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$10(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.e0, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$11(itemStack));
                throw new ReportedException(crashReport);
            }
            this.e -= 50.0f;
        }
    }

    private void c() {
        this.a(Blocks.J, aow_0.cC);
        this.a(Blocks.J, 1, aow_0.S);
        this.a(Blocks.J, 2, aow_0.ck);
        this.a(Blocks.bl, my_2.a(YZ.BLACK), aow_0.da);
        this.a(Blocks.bl, my_2.a(YZ.BLUE), aow_0.hn);
        this.a(Blocks.bl, my_2.a(YZ.BROWN), aow_0.c_);
        this.a(Blocks.bl, my_2.a(YZ.CYAN), aow_0.v);
        this.a(Blocks.bl, my_2.a(YZ.GRAY), aow_0.bF);
        this.a(Blocks.bl, my_2.a(YZ.GREEN), aow_0.dX);
        this.a(Blocks.bl, my_2.a(YZ.LIGHT_BLUE), aow_0.hB);
        this.a(Blocks.bl, my_2.a(YZ.LIME), aow_0.g8);
        this.a(Blocks.bl, my_2.a(YZ.MAGENTA), aow_0.cu);
        this.a(Blocks.bl, my_2.a(YZ.ORANGE), aow_0.hE);
        this.a(Blocks.bl, my_2.a(YZ.PINK), aow_0.bJ);
        this.a(Blocks.bl, my_2.a(YZ.PURPLE), aow_0.hw);
        this.a(Blocks.bl, my_2.a(YZ.RED), aow_0.hp);
        this.a(Blocks.bl, my_2.a(YZ.SILVER), aow_0.E);
        this.a(Blocks.bl, my_2.a(YZ.WHITE), aow_0.hV);
        this.a(Blocks.bl, my_2.a(YZ.YELLOW), aow_0.t);
        this.a(Blocks.w, ya_1.a(akb_0.MOSSY), aow_0.C);
        this.a(Blocks.w, ya_1.a(akb_0.NORMAL), aow_0.aN);
        this.a(Blocks.dirt, av4_0.b(a6s_0.COARSE_DIRT), aow_0.A);
        this.a(Blocks.dirt, av4_0.b(a6s_0.DIRT), aow_0.bb);
        this.a(Blocks.dirt, av4_0.b(a6s_0.PODZOL), aow_0.aB);
        this.a(Blocks.ai, ayv_0.a(aPM.FERN), aow_0.f6);
        this.a(Blocks.ai, ayv_0.a(aPM.GRASS), aow_0.e6);
        this.a(Blocks.ai, ayv_0.a(aPM.PAEONIA), aow_0.bZ);
        this.a(Blocks.ai, ayv_0.a(aPM.ROSE), aow_0.gW);
        this.a(Blocks.ai, ayv_0.a(aPM.SUNFLOWER), aow_0.gb);
        this.a(Blocks.ai, ayv_0.a(aPM.SYRINGA), aow_0.Q);
        this.a(Blocks.bP, aER.b(F3.BIRCH), aow_0.eD);
        this.a(Blocks.bP, aER.b(F3.JUNGLE), aow_0.ac);
        this.a(Blocks.bP, aER.b(F3.OAK), aow_0.f9);
        this.a(Blocks.bP, aER.b(F3.SPRUCE), aow_0.K);
        this.a(Blocks.bM, aER.b(F3.ACACIA) - 4, aow_0.d4);
        this.a(Blocks.bM, aER.b(F3.DARK_OAK) - 4, aow_0.b);
        this.a(Blocks.b2, aER.b(F3.BIRCH), aow_0.b_);
        this.a(Blocks.b2, aER.b(F3.JUNGLE), aow_0.x);
        this.a(Blocks.b2, aER.b(F3.OAK), aow_0.d6);
        this.a(Blocks.b2, aER.b(F3.SPRUCE), aow_0.gu);
        this.a(Blocks.bO, aER.b(F3.ACACIA) - 4, aow_0.bj);
        this.a(Blocks.bO, aER.b(F3.DARK_OAK) - 4, aow_0.cS);
        this.a(Blocks.bV, SL.a(vx_0.CHISELED_STONEBRICK), aow_0.ay);
        this.a(Blocks.bV, SL.a(vx_0.COBBLESTONE), aow_0.au);
        this.a(Blocks.bV, SL.a(vx_0.CRACKED_STONEBRICK), aow_0.hs);
        this.a(Blocks.bV, SL.a(vx_0.MOSSY_STONEBRICK), aow_0.dE);
        this.a(Blocks.bV, SL.a(vx_0.STONE), aow_0.eV);
        this.a(Blocks.bV, SL.a(vx_0.STONEBRICK), aow_0.a0);
        this.a(Blocks.planks, aER.b(F3.ACACIA), aow_0.hL);
        this.a(Blocks.planks, aER.b(F3.BIRCH), aow_0.hv);
        this.a(Blocks.planks, aER.b(F3.DARK_OAK), aow_0.g1);
        this.a(Blocks.planks, aER.b(F3.JUNGLE), aow_0.gk);
        this.a(Blocks.planks, aER.b(F3.OAK), aow_0.dx);
        this.a(Blocks.planks, aER.b(F3.SPRUCE), aow_0.aC);
        this.a(Blocks.aD, mr_0.a(a2y_0.BRICKS), aow_0.eG);
        this.a(Blocks.aD, mr_0.a(a2y_0.DARK), aow_0.e1);
        this.a(Blocks.aD, mr_0.a(a2y_0.ROUGH), aow_0.d_);
        this.a(Blocks.v, ad_0.a(MQ.CHISELED), aow_0.ea);
        this.a(Blocks.v, ad_0.a(MQ.DEFAULT), aow_0.k);
        this.a(Blocks.v, ad_0.a(MQ.LINES_Y), aow_0.cz);
        this.a(Blocks.bY, aj4.a(dq_1.ALLIUM), aow_0.f_);
        this.a(Blocks.bY, aj4.a(dq_1.BLUE_ORCHID), aow_0.ab);
        this.a(Blocks.bY, aj4.a(dq_1.HOUSTONIA), aow_0.dD);
        this.a(Blocks.bY, aj4.a(dq_1.ORANGE_TULIP), aow_0.bc);
        this.a(Blocks.bY, aj4.a(dq_1.OXEYE_DAISY), aow_0.hb);
        this.a(Blocks.bY, aj4.a(dq_1.PINK_TULIP), aow_0.dk);
        this.a(Blocks.bY, aj4.a(dq_1.POPPY), aow_0.d2);
        this.a(Blocks.bY, aj4.a(dq_1.RED_TULIP), aow_0.fP);
        this.a(Blocks.bY, aj4.a(dq_1.WHITE_TULIP), aow_0.cB);
        this.a(Blocks.sand, pl_0.a(aSQ.RED_SAND), aow_0.e3);
        this.a(Blocks.sand, pl_0.a(aSQ.SAND), aow_0.hP);
        this.a(Blocks.bG, le_1.a(aeo_1.CHISELED), aow_0.ey);
        this.a(Blocks.bG, le_1.a(aeo_1.DEFAULT), aow_0.hx);
        this.a(Blocks.bG, le_1.a(aeo_1.SMOOTH), aow_0.gv);
        this.a(Blocks.r, SX.a(akv_1.CHISELED), aow_0.gZ);
        this.a(Blocks.r, SX.a(akv_1.DEFAULT), aow_0.fL);
        this.a(Blocks.r, SX.a(akv_1.SMOOTH), aow_0.cU);
        this.a(Blocks.sapling, aER.b(F3.ACACIA), aow_0.cP);
        this.a(Blocks.sapling, aER.b(F3.BIRCH), aow_0.bH);
        this.a(Blocks.sapling, aER.b(F3.DARK_OAK), aow_0.cK);
        this.a(Blocks.sapling, aER.b(F3.JUNGLE), aow_0.bT);
        this.a(Blocks.sapling, aER.b(F3.OAK), aow_0.en);
        this.a(Blocks.sapling, aER.b(F3.SPRUCE), aow_0.dU);
        this.a(Blocks.aM, 0, aow_0.cD);
        this.a(Blocks.aM, 1, aow_0.cJ);
        this.a(Blocks.am, my_2.a(YZ.BLACK), aow_0.e_);
        this.a(Blocks.am, my_2.a(YZ.BLUE), aow_0.hc);
        this.a(Blocks.am, my_2.a(YZ.BROWN), aow_0.aw);
        this.a(Blocks.am, my_2.a(YZ.CYAN), aow_0.d3);
        this.a(Blocks.am, my_2.a(YZ.GRAY), aow_0.bl);
        this.a(Blocks.am, my_2.a(YZ.GREEN), aow_0.fn);
        this.a(Blocks.am, my_2.a(YZ.LIGHT_BLUE), aow_0.al);
        this.a(Blocks.am, my_2.a(YZ.LIME), aow_0.P);
        this.a(Blocks.am, my_2.a(YZ.MAGENTA), aow_0.gF);
        this.a(Blocks.am, my_2.a(YZ.ORANGE), aow_0.fc);
        this.a(Blocks.am, my_2.a(YZ.PINK), aow_0.fl);
        this.a(Blocks.am, my_2.a(YZ.PURPLE), aow_0.R);
        this.a(Blocks.am, my_2.a(YZ.RED), aow_0.a7);
        this.a(Blocks.am, my_2.a(YZ.SILVER), aow_0.dP);
        this.a(Blocks.am, my_2.a(YZ.WHITE), aow_0.d9);
        this.a(Blocks.am, my_2.a(YZ.YELLOW), aow_0.gR);
        this.a(Blocks.ad, my_2.a(YZ.BLACK), aow_0.b0);
        this.a(Blocks.ad, my_2.a(YZ.BLUE), aow_0.gp);
        this.a(Blocks.ad, my_2.a(YZ.BROWN), aow_0.D);
        this.a(Blocks.ad, my_2.a(YZ.CYAN), aow_0.cL);
        this.a(Blocks.ad, my_2.a(YZ.GRAY), aow_0.e);
        this.a(Blocks.ad, my_2.a(YZ.GREEN), aow_0.gi);
        this.a(Blocks.ad, my_2.a(YZ.LIGHT_BLUE), aow_0.gX);
        this.a(Blocks.ad, my_2.a(YZ.LIME), aow_0.fs);
        this.a(Blocks.ad, my_2.a(YZ.MAGENTA), aow_0.bX);
        this.a(Blocks.ad, my_2.a(YZ.ORANGE), aow_0.cY);
        this.a(Blocks.ad, my_2.a(YZ.PINK), aow_0.dH);
        this.a(Blocks.ad, my_2.a(YZ.PURPLE), aow_0.a6);
        this.a(Blocks.ad, my_2.a(YZ.RED), aow_0.bM);
        this.a(Blocks.ad, my_2.a(YZ.SILVER), aow_0.ee);
        this.a(Blocks.ad, my_2.a(YZ.WHITE), aow_0.gn);
        this.a(Blocks.ad, my_2.a(YZ.YELLOW), aow_0.bh);
        this.a(Blocks.cr, my_2.a(YZ.BLACK), aow_0.dI);
        this.a(Blocks.cr, my_2.a(YZ.BLUE), aow_0.bN);
        this.a(Blocks.cr, my_2.a(YZ.BROWN), aow_0.hh);
        this.a(Blocks.cr, my_2.a(YZ.CYAN), aow_0.bd);
        this.a(Blocks.cr, my_2.a(YZ.GRAY), aow_0.ba);
        this.a(Blocks.cr, my_2.a(YZ.GREEN), aow_0.bB);
        this.a(Blocks.cr, my_2.a(YZ.LIGHT_BLUE), aow_0.i);
        this.a(Blocks.cr, my_2.a(YZ.LIME), aow_0.eg);
        this.a(Blocks.cr, my_2.a(YZ.MAGENTA), aow_0.fN);
        this.a(Blocks.cr, my_2.a(YZ.ORANGE), aow_0.dJ);
        this.a(Blocks.cr, my_2.a(YZ.PINK), aow_0.fb);
        this.a(Blocks.cr, my_2.a(YZ.PURPLE), aow_0.cn);
        this.a(Blocks.cr, my_2.a(YZ.RED), aow_0.bv);
        this.a(Blocks.cr, my_2.a(YZ.SILVER), aow_0.ht);
        this.a(Blocks.cr, my_2.a(YZ.WHITE), aow_0.gH);
        this.a(Blocks.cr, my_2.a(YZ.YELLOW), aow_0.fW);
        this.a(Blocks.stone, XR.b(UI.ANDESITE), aow_0.fk);
        this.a(Blocks.stone, XR.b(UI.ANDESITE_SMOOTH), aow_0.eo);
        this.a(Blocks.stone, XR.b(UI.DIORITE), aow_0.gr);
        this.a(Blocks.stone, XR.b(UI.DIORITE_SMOOTH), aow_0.aq);
        this.a(Blocks.stone, XR.b(UI.GRANITE), aow_0.ef);
        this.a(Blocks.stone, XR.b(UI.GRANITE_SMOOTH), aow_0.af);
        this.a(Blocks.stone, XR.b(UI.STONE), aow_0.eb);
        this.a(Blocks.z, ahu_0.a(aCq.CRACKED), aow_0.fy);
        this.a(Blocks.z, ahu_0.a(aCq.DEFAULT), aow_0.e2);
        this.a(Blocks.z, ahu_0.a(aCq.CHISELED), aow_0.r);
        this.a(Blocks.z, ahu_0.a(aCq.MOSSY), aow_0.V);
        this.a(Blocks.bA, acz_0.a(aAB.BRICK), aow_0.hK);
        this.a(Blocks.bA, acz_0.a(aAB.COBBLESTONE), aow_0.cH);
        this.a(Blocks.bA, acz_0.a(aAB.WOOD), aow_0.ec);
        this.a(Blocks.bA, acz_0.a(aAB.NETHERBRICK), aow_0.di);
        this.a(Blocks.bA, acz_0.a(aAB.QUARTZ), aow_0.s);
        this.a(Blocks.bA, acz_0.a(aAB.SAND), aow_0.eJ);
        this.a(Blocks.bA, acz_0.a(aAB.SMOOTHBRICK), aow_0.dz);
        this.a(Blocks.bA, acz_0.a(aAB.STONE), aow_0.h3);
        this.a(Blocks.bf, ahl_2.b(mp_0.RED_SANDSTONE), aow_0.Z);
        this.a(Blocks.bN, aW5.a(a4b.DEAD_BUSH), aow_0.hG);
        this.a(Blocks.bN, aW5.a(a4b.FERN), aow_0.fq);
        this.a(Blocks.bN, aW5.a(a4b.GRASS), aow_0.d);
        this.a(Blocks.e, aER.b(F3.ACACIA), aow_0.a1);
        this.a(Blocks.e, aER.b(F3.BIRCH), aow_0.hu);
        this.a(Blocks.e, aER.b(F3.DARK_OAK), aow_0.M);
        this.a(Blocks.e, aER.b(F3.JUNGLE), aow_0.at);
        this.a(Blocks.e, aER.b(F3.OAK), aow_0.cA);
        this.a(Blocks.e, aER.b(F3.SPRUCE), aow_0.dp);
        this.a(Blocks.b_, my_2.a(YZ.BLACK), aow_0.aT);
        this.a(Blocks.b_, my_2.a(YZ.BLUE), aow_0.d5);
        this.a(Blocks.b_, my_2.a(YZ.BROWN), aow_0.bk);
        this.a(Blocks.b_, my_2.a(YZ.CYAN), aow_0.eM);
        this.a(Blocks.b_, my_2.a(YZ.GRAY), aow_0.cZ);
        this.a(Blocks.b_, my_2.a(YZ.GREEN), aow_0.fD);
        this.a(Blocks.b_, my_2.a(YZ.LIGHT_BLUE), aow_0.a2);
        this.a(Blocks.b_, my_2.a(YZ.LIME), aow_0.g7);
        this.a(Blocks.b_, my_2.a(YZ.MAGENTA), aow_0.q);
        this.a(Blocks.b_, my_2.a(YZ.ORANGE), aow_0.hI);
        this.a(Blocks.b_, my_2.a(YZ.PINK), aow_0.eX);
        this.a(Blocks.b_, my_2.a(YZ.PURPLE), aow_0.dm);
        this.a(Blocks.b_, my_2.a(YZ.RED), aow_0.eP);
        this.a(Blocks.b_, my_2.a(YZ.SILVER), aow_0.eL);
        this.a(Blocks.b_, my_2.a(YZ.WHITE), aow_0.d7);
        this.a(Blocks.b_, my_2.a(YZ.YELLOW), aow_0.Y);
        this.a(Blocks.bx, aow_0.fC);
        this.a(Blocks.bc, aow_0.dg);
        this.a(Blocks.d, aow_0.aH);
        this.a(Blocks.bedrock, aow_0.be);
        this.a(Blocks.F, aow_0.aS);
        this.a(Blocks.at, aow_0.u);
        this.a(Blocks.bL, aow_0.cg);
        this.a(Blocks.bL, aow_0.eW);
        this.a(Blocks.aU, aow_0.f8);
        this.a(Blocks.A, aow_0.a4);
        this.a(Blocks.a9, aow_0.hd);
        this.a(Blocks.T, aow_0.ha);
        this.a(Blocks.bK, aow_0.hr);
        this.a(Blocks.coal_ore, aow_0.g3);
        this.a(Blocks.cobblestone, aow_0.eO);
        this.a(Blocks.aq, aow_0.go);
        this.a(Blocks.cf, aow_0.ct);
        this.a(Blocks.u, aow_0.db);
        this.a(Blocks.ca, aow_0.gx);
        this.a(Blocks.bX, aow_0.f2);
        this.a(Blocks.ar, aow_0.es);
        this.a(Blocks.C, aow_0.cF);
        this.a(Blocks.aB, aow_0.dc);
        this.a(Blocks.ag, aow_0.p);
        this.a(Blocks.av, aow_0.f0);
        this.a(Blocks.K, aow_0.G);
        this.a(Blocks.bw, aow_0.cT);
        this.a(Blocks.aK, aow_0.hD);
        this.a(Blocks.H, aow_0.ho);
        this.a(Blocks.Z, aow_0.gw);
        this.a(Blocks.cg, aow_0.B);
        this.a(Blocks.n, aow_0.co);
        this.a(Blocks.m, aow_0.bi);
        this.a(Blocks.bo, aow_0.gl);
        this.a(Blocks.cp, aow_0.c);
        this.a(Blocks.ch, aow_0.b7);
        this.a(Blocks.a4, aow_0.hH);
        this.a(Blocks.aZ, aow_0.gh);
        this.a(Blocks.S, aow_0.dM);
        this.a(Blocks.cb, aow_0.J);
        this.a(Blocks.x, aow_0.dB);
        this.a(Blocks.ab, aow_0.ao);
        this.a(Blocks.a8, aow_0.l);
        this.a(Blocks.cd, aow_0.ap);
        this.a(Blocks.bs, aow_0.eB);
        this.a(Blocks.bg, aow_0.a5);
        this.a(Blocks.D, aow_0.gT);
        this.a(Blocks.gold_ore, aow_0.cO);
        this.a(Blocks.grass, aow_0.bE);
        this.a(Blocks.gravel, aow_0.bA);
        this.a(Blocks.aJ, aow_0.b6);
        this.a(Blocks.y, aow_0.aX);
        this.a(Blocks.aW, aow_0.cf);
        this.a(Blocks.t, aow_0.hl);
        this.a(Blocks.I, aow_0.gd);
        this.a(Blocks.by, aow_0.bL);
        this.a(Blocks.co, aow_0.g0);
        this.a(Blocks.iron_ore, aow_0.ak);
        this.a(Blocks.bt, aow_0.bt);
        this.a(Blocks.a5, aow_0.ej);
        this.a(Blocks.aa, aow_0.de);
        this.a(Blocks.bm, aow_0.H);
        this.a(Blocks.ba, aow_0.e4);
        this.a(Blocks.bH, aow_0.h0);
        this.a(Blocks.aG, aow_0.fJ);
        this.a(Blocks.bd, aow_0.ai);
        this.a(Blocks.a1, aow_0.cq);
        this.a(Blocks.aQ, aow_0.dl);
        this.a(Blocks.L, aow_0.X);
        this.a(Blocks.aE, aow_0.a_);
        this.a(Blocks.bu, aow_0.aR);
        this.a(Blocks.ak, aow_0.c9);
        this.a(Blocks.a6, aow_0.ed);
        this.a(Blocks.ct, aow_0.m);
        this.a(Blocks.q, aow_0.fH);
        this.a(Blocks.a7, aow_0.g9);
        this.a(Blocks.O, aow_0.eS);
        this.a(Blocks.bJ, aow_0.f5);
        this.a(Blocks.bB, aow_0.h4);
        this.a(Blocks.ap, aow_0.eh);
        this.a(Blocks.cl, aow_0.em);
        this.a(Blocks.a3, aow_0.el);
        this.a(Blocks.bQ, aow_0.j);
        this.a(Blocks.bT, aow_0.gq);
        this.a(Blocks.M, aow_0.fe);
        this.a(Blocks.b5, aow_0.fY);
        this.a(Blocks.br, aow_0.e5);
        this.a(Blocks.bn, aow_0.aD);
        this.a(Blocks.aO, aow_0.dQ);
        this.a(Blocks.b1, aow_0.aY);
        this.a(Blocks.b6, aow_0.bO);
        this.a(Blocks.b, aow_0.dt);
        this.a(Blocks.bq, aow_0.b5);
        this.a(Blocks.cm, aow_0.fi);
        this.a(Blocks.s, aow_0.fG);
        this.a(Blocks.aT, aow_0.N);
        this.a(Blocks.E, aow_0.fv);
        this.a(Blocks.bZ, aow_0.gU);
        this.a(Blocks.bF, aow_0.dd);
        this.a(Blocks.j, aow_0.fa);
        this.a(Blocks.U, aow_0.cb);
        this.a(Blocks.Y, aow_0.az);
        this.a(Blocks.bD, aow_0.h);
        this.a(Blocks.ac, aow_0.aV);
        this.a(Blocks.be, aow_0.ek);
        this.a(Blocks.as, aow_0.z);
        this.a(Blocks.an, aow_0.aK);
        this.a(Blocks.bI, aow_0.gD);
        this.a(Blocks.cq, aow_0.gY);
        this.a(Blocks.ae, aow_0.ft);
        this.a(Blocks.G, aj4.a(dq_1.DANDELION), aow_0.dR);
        this.a(Blocks.R, aow_0.aa);
        this.a(Blocks.aA, aow_0.ah);
        this.a(Blocks.g, aow_0.ce);
        this.a(Items.iron_shovel, aow_0.fd);
        this.a(Items.iron_pickaxe, aow_0.fE);
        this.a(Items.iron_axe, aow_0.aP);
        this.a(Items.flint_and_steel, aow_0.ds);
        this.a(Items.apple, aow_0.aW);
        this.a(Items.bow, 0, aow_0.fA);
        this.a(Items.bow, 1, aow_0.gK);
        this.a(Items.bow, 2, aow_0.as);
        this.a(Items.bow, 3, aow_0.ca);
        this.a(Items.arrow, aow_0.a8);
        this.a(Items.coal, 0, aow_0.hF);
        this.a(Items.coal, 1, aow_0.cd);
        this.a(Items.diamond, aow_0.fx);
        this.a(Items.iron_ingot, aow_0.I);
        this.a(Items.gold_ingot, aow_0.hU);
        this.a(Items.iron_sword, aow_0.gB);
        this.a(Items.wooden_sword, aow_0.hN);
        this.a(Items.wooden_shovel, aow_0.dF);
        this.a(Items.wooden_pickaxe, aow_0.bY);
        this.a(Items.wooden_axe, aow_0.g4);
        this.a(Items.stone_sword, aow_0.hZ);
        this.a(Items.stone_shovel, aow_0.fr);
        this.a(Items.stone_pickaxe, aow_0.ew);
        this.a(Items.stone_axe, aow_0.f4);
        this.a(Items.diamond_sword, aow_0.y);
        this.a(Items.diamond_shovel, aow_0.eU);
        this.a(Items.diamond_pickaxe, aow_0.gm);
        this.a(Items.diamond_axe, aow_0.b3);
        this.a(Items.stick, aow_0.gs);
        this.a(Items.bowl, aow_0.dY);
        this.a(Items.mushroom_stew, aow_0.fj);
        this.a(Items.golden_sword, aow_0.bw);
        this.a(Items.golden_shovel, aow_0.bG);
        this.a(Items.golden_pickaxe, aow_0.dh);
        this.a(Items.golden_axe, aow_0.fB);
        this.a(Items.string, aow_0.gE);
        this.a(Items.feather, aow_0.fQ);
        this.a(Items.gunpowder, aow_0.ge);
        this.a(Items.wooden_hoe, aow_0.b2);
        this.a(Items.stone_hoe, aow_0.ch);
        this.a(Items.iron_hoe, aow_0.aL);
        this.a(Items.diamond_hoe, aow_0.eF);
        this.a(Items.golden_hoe, aow_0.hT);
        this.a(Items.wheat_seeds, aow_0.g5);
        this.a(Items.wheat, aow_0.ep);
        this.a(Items.bread, aow_0.a9);
        this.a(Items.leather_helmet, aow_0.an);
        this.a(Items.leather_chestplate, aow_0.aI);
        this.a(Items.leather_leggings, aow_0.bI);
        this.a(Items.leather_boots, aow_0.du);
        this.a(Items.chainmail_helmet, aow_0.dL);
        this.a(Items.chainmail_chestplate, aow_0.ci);
        this.a(Items.chainmail_leggings, aow_0.g);
        this.a(Items.chainmail_boots, aow_0.fu);
        this.a(Items.iron_helmet, aow_0.hm);
        this.a(Items.iron_chestplate, aow_0.gj);
        this.a(Items.iron_leggings, aow_0.b9);
        this.a(Items.iron_boots, aow_0.aO);
        this.a(Items.diamond_helmet, aow_0.er);
        this.a(Items.diamond_chestplate, aow_0.cW);
        this.a(Items.diamond_leggings, aow_0.hq);
        this.a(Items.diamond_boots, aow_0.bn);
        this.a(Items.golden_helmet, aow_0.fV);
        this.a(Items.golden_chestplate, aow_0.fw);
        this.a(Items.golden_leggings, aow_0.fI);
        this.a(Items.golden_boots, aow_0.n);
        this.a(Items.flint, aow_0.by);
        this.a(Items.porkchop, aow_0.h2);
        this.a(Items.cooked_porkchop, aow_0.fO);
        this.a(Items.painting, aow_0.c1);
        this.a(Items.golden_apple, aow_0.aM);
        this.a(Items.golden_apple, 1, aow_0.e8);
        this.a(Items.sign, aow_0.eq);
        this.a(Items.oak_door, aow_0.f1);
        this.a(Items.spruce_door, aow_0.cl);
        this.a(Items.birch_door, aow_0.cQ);
        this.a(Items.jungle_door, aow_0.b4);
        this.a(Items.acacia_door, aow_0.dT);
        this.a(Items.dark_oak_door, aow_0.bQ);
        this.a(Items.bucket, aow_0.e9);
        this.a(Items.water_bucket, aow_0.bV);
        this.a(Items.lava_bucket, aow_0.o);
        this.a(Items.minecart, aow_0.eY);
        this.a(Items.saddle, aow_0.dw);
        this.a(Items.iron_door, aow_0.gM);
        this.a(Items.redstone, aow_0.eH);
        this.a(Items.snowball, aow_0.hQ);
        this.a(Items.boat, aow_0.gf);
        this.a(Items.leather, aow_0.fZ);
        this.a(Items.milk_bucket, aow_0.br);
        this.a(Items.brick, aow_0.dA);
        this.a(Items.clay_ball, aow_0.aG);
        this.a(Items.reeds, aow_0.fU);
        this.a(Items.paper, aow_0.eu);
        this.a(Items.book, aow_0.ev);
        this.a(Items.slime_ball, aow_0.F);
        this.a(Items.chest_minecart, aow_0.c0);
        this.a(Items.furnace_minecart, aow_0.hg);
        this.a(Items.egg, aow_0.bf);
        this.a(Items.compass, aow_0.ex);
        this.a(Items.fishing_rod, aow_0.fh);
        this.a(Items.fishing_rod, 1, aow_0.dN);
        this.a(Items.clock, aow_0.d1);
        this.a(Items.glowstone_dust, aow_0.a3);
        this.a(Items.fish, aC0.e(Ky.COD), aow_0.hz);
        this.a(Items.fish, aC0.e(Ky.SALMON), aow_0.gG);
        this.a(Items.fish, aC0.e(Ky.CLOWNFISH), aow_0.c5);
        this.a(Items.fish, aC0.e(Ky.PUFFERFISH), aow_0.dG);
        this.a(Items.cooked_fish, aC0.e(Ky.COD), aow_0.fm);
        this.a(Items.cooked_fish, aC0.e(Ky.SALMON), aow_0.bR);
        this.a(Items.dye, my_2.c(YZ.BLACK), aow_0.gI);
        this.a(Items.dye, my_2.c(YZ.RED), aow_0.fF);
        this.a(Items.dye, my_2.c(YZ.GREEN), aow_0.W);
        this.a(Items.dye, my_2.c(YZ.BROWN), aow_0.c6);
        this.a(Items.dye, my_2.c(YZ.BLUE), aow_0.cw);
        this.a(Items.dye, my_2.c(YZ.PURPLE), aow_0.c2);
        this.a(Items.dye, my_2.c(YZ.CYAN), aow_0.aF);
        this.a(Items.dye, my_2.c(YZ.SILVER), aow_0.ga);
        this.a(Items.dye, my_2.c(YZ.GRAY), aow_0.fM);
        this.a(Items.dye, my_2.c(YZ.PINK), aow_0.aU);
        this.a(Items.dye, my_2.c(YZ.LIME), aow_0.bp);
        this.a(Items.dye, my_2.c(YZ.YELLOW), aow_0.gJ);
        this.a(Items.dye, my_2.c(YZ.LIGHT_BLUE), aow_0.gS);
        this.a(Items.dye, my_2.c(YZ.MAGENTA), aow_0.cx);
        this.a(Items.dye, my_2.c(YZ.ORANGE), aow_0.d0);
        this.a(Items.dye, my_2.c(YZ.WHITE), aow_0.ad);
        this.a(Items.bone, aow_0.cs);
        this.a(Items.sugar, aow_0.aA);
        this.a(Items.cake, aow_0.hJ);
        this.a(Items.bed, aow_0.ff);
        this.a(Items.repeater, aow_0.fS);
        this.a(Items.cookie, aow_0.cp);
        this.a(Items.shears, aow_0.ar);
        this.a(Items.melon, aow_0.dn);
        this.a(Items.pumpkin_seeds, aow_0.aE);
        this.a(Items.melon_seeds, aow_0.cR);
        this.a(Items.beef, aow_0.f);
        this.a(Items.cooked_beef, aow_0.f3);
        this.a(Items.chicken, aow_0.ax);
        this.a(Items.cooked_chicken, aow_0.ag);
        this.a(Items.rabbit, aow_0.bz);
        this.a(Items.cooked_rabbit, aow_0.eT);
        this.a(Items.mutton, aow_0.gz);
        this.a(Items.cooked_mutton, aow_0.he);
        this.a(Items.rabbit_foot, aow_0.bo);
        this.a(Items.rabbit_hide, aow_0.gN);
        this.a(Items.rabbit_stew, aow_0.cV);
        this.a(Items.rotten_flesh, aow_0.w);
        this.a(Items.ender_pearl, aow_0.gC);
        this.a(Items.blaze_rod, aow_0.bg);
        this.a(Items.ghast_tear, aow_0.h1);
        this.a(Items.gold_nugget, aow_0.O);
        this.a(Items.nether_wart, aow_0.eN);
        aPL.a(this.f, (Item)Items.potionitem, RenderItem::lambda$registerItems$12);
        this.a(Items.glass_bottle, aow_0.dC);
        this.a(Items.spider_eye, aow_0.fK);
        this.a(Items.fermented_spider_eye, aow_0.fX);
        this.a(Items.blaze_powder, aow_0.ei);
        this.a(Items.magma_cream, aow_0.T);
        this.a(Items.brewing_stand, aow_0.et);
        this.a(Items.cauldron, aow_0.hy);
        this.a(Items.ender_eye, aow_0.dv);
        this.a(Items.speckled_melon, aow_0.bS);
        aPL.a(this.f, Items.spawn_egg, RenderItem::lambda$registerItems$13);
        this.a(Items.experience_bottle, aow_0.g_);
        this.a(Items.fire_charge, aow_0.dK);
        this.a(Items.writable_book, aow_0.dq);
        this.a(Items.emerald, aow_0.hO);
        this.a(Items.item_frame, aow_0.cv);
        this.a(Items.flower_pot, aow_0.dr);
        this.a(Items.carrot, aow_0.eK);
        this.a(Items.potato, aow_0.c4);
        this.a(Items.baked_potato, aow_0.hM);
        this.a(Items.poisonous_potato, aow_0.hj);
        this.a(Items.map, aow_0.bU);
        this.a(Items.golden_carrot, aow_0.cr);
        this.a(Items.skull, 0, aow_0.bm);
        this.a(Items.skull, 1, aow_0.bu);
        this.a(Items.skull, 2, aow_0.ez);
        this.a(Items.skull, 3, aow_0.hi);
        this.a(Items.skull, 4, aow_0.cy);
        this.a(Items.carrot_on_a_stick, aow_0.bq);
        this.a(Items.nether_star, aow_0.eI);
        this.a(Items.pumpkin_pie, aow_0.am);
        this.a(Items.firework_charge, aow_0.aJ);
        this.a(Items.comparator, aow_0.fz);
        this.a(Items.netherbrick, aow_0.eQ);
        this.a(Items.quartz, aow_0.b8);
        this.a(Items.tnt_minecart, aow_0.eA);
        this.a(Items.hopper_minecart, aow_0.ae);
        this.a(Items.armor_stand, aow_0.eC);
        this.a(Items.iron_horse_armor, aow_0.hA);
        this.a(Items.golden_horse_armor, aow_0.fo);
        this.a(Items.diamond_horse_armor, aow_0.bC);
        this.a(Items.lead, aow_0.hS);
        this.a(Items.name_tag, aow_0.dy);
        aPL.a(this.f, Items.banner, RenderItem::lambda$registerItems$14);
        this.a(Items.record_13, aow_0.g2);
        this.a(Items.record_cat, aow_0.g6);
        this.a(Items.record_blocks, aow_0.dV);
        this.a(Items.record_chirp, aow_0.U);
        this.a(Items.record_far, aow_0.hW);
        this.a(Items.record_mall, aow_0.cN);
        this.a(Items.record_mellohi, aow_0.hf);
        this.a(Items.record_stal, aow_0.eE);
        this.a(Items.record_strad, aow_0.bs);
        this.a(Items.record_ward, aow_0.hY);
        this.a(Items.record_11, aow_0.bP);
        this.a(Items.record_wait, aow_0.aQ);
        this.a(Items.prismarine_shard, aow_0.df);
        this.a(Items.prismarine_crystals, aow_0.bW);
        aPL.a(this.f, (Item)Items.enchanted_book, RenderItem::lambda$registerItems$15);
        aPL.a(this.f, (Item)Items.filled_map, RenderItem::lambda$registerItems$16);
        this.a(Blocks.bz, aow_0.bD);
        this.a(Items.fireworks, aow_0.gg);
        this.a(Items.command_block_minecart, aow_0.c8);
        this.a(Blocks.ao, aow_0.hk);
        this.a(Blocks.p, aow_0.cj);
        this.a(Items.written_book, aow_0.gy);
        this.a(Blocks.aj, aar_0.a(zq_1.ALL_INSIDE), aow_0.e7);
        this.a(Blocks.Q, aar_0.a(zq_1.ALL_INSIDE), aow_0.gt);
        this.a(Blocks.bW, aow_0.fg);
        if (ayy_0.d(ail_0.bb)) {
            aDb.f(ail_0.bb, new Object[]{this.f});
        }
    }

    public void a(ItemStack itemStack, EntityLivingBase entityLivingBase, go_0 go_02) {
        JE jE = aPL.a(this.f, itemStack);
        if (entityLivingBase instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)entityLivingBase;
            Item item = act_2.k(itemStack);
            aRJ aRJ2 = null;
            if (item == Items.fishing_rod && entityPlayer.bk != null) {
                aRJ2 = new aRJ(aow_0.gA, aow_0.hR);
            } else if (item == Items.bow && a6w_0.J(entityPlayer) != null) {
                int n = act_2.A(itemStack) - a6w_0.A(entityPlayer);
                aRJ2 = n >= 18 ? new aRJ(aow_0.hC, aow_0.cM) : (n > 13 ? new aRJ(aow_0.gV, aow_0.dZ) : new aRJ(aow_0.bK, aow_0.dO));
            } else if (ayy_0.d(ail_0.bD)) {
                aRJ2 = (aRJ)aDb.f(item, ail_0.bD, new Object[]{itemStack, entityPlayer, P8.d(a6w_0.A(entityPlayer))});
            }
            this.b = aRJ2;
            jE = ModelManagerInvoker.a(aPL.a(this.f), aRJ2);
        }
        this.a(itemStack, jE, go_02);
        this.b = null;
    }

    public void a(ItemStack itemStack, float f, float f2, int n) {
        if (act_2.k(itemStack) != null) {
            this.e += 50.0f;
            try {
                this.b(itemStack, f, f2, n);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aow_0.c7);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aow_0.eZ);
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.gO, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$4(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.eR, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$5(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.aj, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$6(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.d8, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$7(itemStack));
                throw new ReportedException(crashReport);
            }
            this.e -= 50.0f;
        }
    }

    public boolean c(ItemStack itemStack) {
        JE jE = aPL.a(this.f, itemStack);
        return aND.e(jE);
    }

    private void a(WorldRenderer worldRenderer, a9Z a9Z2) {
        zl_2 zl_22 = SJ.g(aX3.f(a9Z2));
        WorldRendererInvoker.a(worldRenderer, FJ.a(zl_22), FJ.b(zl_22), FJ.c(zl_22));
    }

    protected void a(Block block, int n, String string) {
        this.a(px_0.a(block), n, string);
    }

    private static String lambda$renderItemAndEffectIntoGUI$9(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.c(itemStack));
    }

    public void a(FontRenderer fontRenderer, ItemStack itemStack, int n, int n2) {
        this.a(fontRenderer, itemStack, n, n2, (String)null);
    }

    private static String lambda$renderItemAndEffectIntoGUI$3(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.z(itemStack));
    }

    private static aRJ lambda$registerItems$12(ItemStack itemStack) {
        return en_2.b(act_2.c(itemStack)) ? new aRJ(aow_0.cm, aow_0.cX) : new aRJ(aow_0.gQ, aow_0.gL);
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, ItemStack itemStack, int n, int n2) {
        this.a(fontRenderer, itemStack, (float)n, (float)n2, null);
    }

    private void a(Item item, String string) {
        this.a(item, 0, string);
    }

    private void a(WorldRenderer worldRenderer, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0), n5, n6, n7, n8));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n4, 0.0), n5, n6, n7, n8));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2 + n4, 0.0), n5, n6, n7, n8));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2, 0.0), n5, n6, n7, n8));
        TessellatorInvoker.draw(TessellatorInvoker.getInstance());
    }

    public static void a(WorldRenderer worldRenderer, a9Z a9Z2, int n) {
        float f = n & 0xFF;
        float f2 = n >>> 8 & 0xFF;
        float f3 = n >>> 16 & 0xFF;
        float f4 = n >>> 24 & 0xFF;
        int[] nArray = aX3.d(a9Z2);
        int n2 = nArray.length / 4;
        int n3 = 0;
        while (true) {
            int n4 = nArray[3 + n2 * n3];
            float f5 = n4 & 0xFF;
            float f6 = n4 >>> 8 & 0xFF;
            float f7 = n4 >>> 16 & 0xFF;
            float f8 = n4 >>> 24 & 0xFF;
            int n5 = MathInvoker.b(255, (int)(f * f5 / 255.0f));
            int n6 = MathInvoker.b(255, (int)(f2 * f6 / 255.0f));
            int n7 = MathInvoker.b(255, (int)(f3 * f7 / 255.0f));
            int n8 = MathInvoker.b(255, (int)(f4 * f8 / 255.0f));
            WorldRendererInvoker.a(worldRenderer, WorldRendererInvoker.b(worldRenderer, 4 - n3), n5, n6, n7, n8);
            ++n3;
        }
    }

    private static String lambda$renderItemAndEffectIntoGUI$11(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.z(itemStack));
    }

    private static String lambda$renderItemAndEffectIntoGUI$8(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.k(itemStack));
    }

    public void a(ItemStack itemStack, JE jE, int n) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        if (aND.c(jE)) {
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.c();
            ajF.a(a53.c, itemStack);
        } else {
            if (ys_2.b()) {
                jE = am1_0.a(itemStack, jE, this.b);
            }
            GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
            this.a(jE, hb_2.a(255, 255, 255, n), itemStack);
            if (!(!act_2.z(itemStack) || ys_2.b() && am1_0.a(this, itemStack, jE))) {
                this.a(jE);
            }
        }
        GlStateManagerInvoker.popMatrix();
    }

    protected void a(ItemStack itemStack, JE jE, go_0 go_02) {
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.a(TextureManagerInvoker.b(this.c, TextureMap.r), false, false);
        this.a(itemStack);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.pushMatrix();
        if (ayy_0.d(ail_0.I)) {
            jE = (JE)aDb.f(ail_0.I, new Object[]{jE, go_02});
        } else {
            HL hL = aND.a(jE);
            afm_2.c(hL, go_02);
            if (this.a(afm_2.a(hL, go_02))) {
                GlStateManagerInvoker.cullFace(1028);
            }
        }
        this.a(itemStack, jE);
        GlStateManagerInvoker.cullFace(1029);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableBlend();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.b(TextureManagerInvoker.b(this.c, TextureMap.r));
    }

    public void a(ItemStack itemStack, go_0 go_02) {
        JE jE = aPL.a(this.f, itemStack);
        this.a(itemStack, jE, go_02);
    }

    public void a(JE jE, int n) {
        this.a(jE, n, null);
    }

    public void a(ItemStack itemStack, float f, float f2) {
        if (act_2.k(itemStack) != null) {
            this.e += 50.0f;
            try {
                this.b(itemStack, f, f2);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aow_0.aZ);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aow_0.cE);
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.bx, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$0(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.a, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$1(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.fT, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$2(itemStack));
                CrashReportCategoryInvoker.a(crashReportCategory, aow_0.fR, () -> RenderItem.lambda$renderItemAndEffectIntoGUI$3(itemStack));
                throw new ReportedException(crashReport);
            }
            this.e -= 50.0f;
        }
    }

    private static String lambda$renderItemAndEffectIntoGUI$2(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.a(itemStack));
    }

    public void a(cc.novoline.utils.fonts.api.FontRenderer fontRenderer, ItemStack itemStack, float f, float f2, String string) {
        if (itemStack.a == 1) {
            // empty if block
        }
        String string2 = StringInvoker.a(itemStack.a);
        if (itemStack.a < 1) {
            string2 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), StringInvoker.a(itemStack.a)).toString();
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableBlend();
        a7l_0.b(fontRenderer, string2, f + 19.0f - 2.0f - (float)a7l_0.a(fontRenderer, string2), f2 + 6.0f + 3.0f, 0xFFFFFF, true);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
        boolean bl = act_2.j(itemStack);
        if (ayy_0.d(ail_0.y)) {
            bl = aDb.e(act_2.k(itemStack), ail_0.y, new Object[]{itemStack});
        }
        int n = (int)MathInvoker.f(13.0 - (double)act_2.s(itemStack) * 13.0 / (double)act_2.u(itemStack));
        int n2 = (int)MathInvoker.f(255.0 - (double)act_2.s(itemStack) * 255.0 / (double)act_2.u(itemStack));
        if (ayy_0.d(ail_0.dy)) {
            double d = aDb.c(act_2.k(itemStack), ail_0.dy, new Object[]{itemStack});
            n = (int)MathInvoker.f(13.0 - d * 13.0);
            n2 = (int)MathInvoker.f(255.0 - d * 255.0);
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.disableBlend();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        this.a(worldRenderer, f + 2.0f, f2 + 13.0f, 13, 2, 0, 0, 0, 255);
        this.a(worldRenderer, f + 2.0f, f2 + 13.0f, 12, 1, (255 - n2) / 4, 64, 0, 255);
        this.a(worldRenderer, f + 2.0f, f2 + 13.0f, n, 1, 255 - n2, n2, 0, 255);
        if (!aC8.b(ail_0.aW)) {
            GlStateManagerInvoker.enableBlend();
        }
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
    }

    private void b(WorldRenderer worldRenderer, a9Z a9Z2, int n) {
        if (WorldRendererInvoker.d(worldRenderer)) {
            WorldRendererInvoker.a(worldRenderer, aX3.c(a9Z2));
            WorldRendererInvoker.a(worldRenderer, aX3.a(a9Z2));
        } else {
            WorldRendererInvoker.a(worldRenderer, aX3.d(a9Z2));
        }
        if (aC8.b(ail_0.d) && aC8.a(ail_0.d, a9Z2)) {
            RenderItem.a(worldRenderer, a9Z2, n);
        } else {
            WorldRendererInvoker.a(worldRenderer, n);
        }
        this.a(worldRenderer, a9Z2);
    }

    private static String lambda$renderItemAndEffectIntoGUI$6(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.a(itemStack));
    }

    private void a(ItemStack itemStack) {
        JE jE = aPL.a(this.f, itemStack);
        act_2.k(itemStack);
        aND.e(jE);
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private int b() {
        Glint glint = (Glint)ModuleInvoker.isEnable(ModuleRegistry.GLINTCOLORIZE);
        if (aVL.a(glint)) {
            return aVL.b(glint);
        }
        return -8372020;
    }

    private static aRJ lambda$registerItems$16(ItemStack itemStack) {
        return new aRJ(aow_0.cG, aow_0.b1);
    }

    public void a(FontRenderer fontRenderer, ItemStack itemStack, int n, float f, String string) {
        if (itemStack.a == 1) {
            // empty if block
        }
        String string2 = StringInvoker.a(itemStack.a);
        if (itemStack.a < 1) {
            string2 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), StringInvoker.a(itemStack.a)).toString();
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableBlend();
        FontRendererInvoker.drawStringWithShadow(fontRenderer, string2, n + 19 - 2 - FontRendererInvoker.a(fontRenderer, string2), f + 6.0f + 3.0f, 0xFFFFFF);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
        boolean bl = act_2.j(itemStack);
        if (ayy_0.d(ail_0.y)) {
            bl = aDb.e(act_2.k(itemStack), ail_0.y, new Object[]{itemStack});
        }
        int n2 = (int)MathInvoker.f(13.0 - (double)act_2.s(itemStack) * 13.0 / (double)act_2.u(itemStack));
        int n3 = (int)MathInvoker.f(255.0 - (double)act_2.s(itemStack) * 255.0 / (double)act_2.u(itemStack));
        if (ayy_0.d(ail_0.dy)) {
            double d = aDb.c(act_2.k(itemStack), ail_0.dy, new Object[]{itemStack});
            n2 = (int)MathInvoker.f(13.0 - d * 13.0);
            n3 = (int)MathInvoker.f(255.0 - d * 255.0);
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.disableBlend();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        this.a(worldRenderer, (float)(n + 2), f + 13.0f, 13, 2, 0, 0, 0, 255);
        this.a(worldRenderer, (float)(n + 2), f + 13.0f, 12, 1, (255 - n3) / 4, 64, 0, 255);
        this.a(worldRenderer, (float)(n + 2), f + 13.0f, n2, 1, 255 - n3, n3, 0, 255);
        if (!aC8.b(ail_0.aW)) {
            GlStateManagerInvoker.enableBlend();
        }
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
    }

    public void a(ItemStack itemStack, JE jE) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        if (aND.c(jE)) {
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.c();
            ajF.a(a53.c, itemStack);
        } else {
            if (ys_2.b()) {
                jE = am1_0.a(itemStack, jE, this.b);
            }
            GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
            this.a(jE, itemStack);
            if (!(!act_2.z(itemStack) || ys_2.b() && am1_0.a(this, itemStack, jE))) {
                this.a(jE);
            }
        }
        GlStateManagerInvoker.popMatrix();
    }

    private static aRJ lambda$registerItems$13(ItemStack itemStack) {
        return new aRJ(aow_0.dW, aow_0.av);
    }

    private static String lambda$renderItemAndEffectIntoGUI$10(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.a(itemStack));
    }

    private static aRJ lambda$registerItems$15(ItemStack itemStack) {
        return new aRJ(aow_0.cc, aow_0.dj);
    }

    private boolean b(ItemStack itemStack) {
        ItemStack itemStack2 = InventoryInvoker.c(MCInvoker.f().player.inventory, MCInvoker.f().player.inventory.a);
        return itemStack2.equals(itemStack);
    }

    private void a(JE jE, int n, ItemStack itemStack) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        h9.d(MCInvoker.f(MCInvoker.f()));
        boolean bl = ys_2.O();
        WorldRendererInvoker.a(worldRenderer, a5w_0.SOLID);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.n);
        for (EnumFacing enumFacing : EnumFacing.VALUES) {
            this.a(worldRenderer, aND.a(jE, enumFacing), n, itemStack);
        }
        this.a(worldRenderer, aND.d(jE), n, itemStack);
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.a(worldRenderer, null);
        GlStateManagerInvoker.I();
    }

    private static String lambda$renderItemAndEffectIntoGUI$5(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.c(itemStack));
    }

    private boolean a(aSZ aSZ2) {
        return aSZ2.c.x < 0.0f ^ aSZ2.c.y < 0.0f ^ aSZ2.c.z < 0.0f;
    }

    private void a(float f, float f2, boolean bl) {
        GlStateManagerInvoker.translate(f, f2, 100.0f + this.e);
        GlStateManagerInvoker.translate(8.0f, 8.0f, 0.0f);
        GlStateManagerInvoker.c(1.0f, 1.0f, -1.0f);
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        GlStateManagerInvoker.c(40.0f, 40.0f, 40.0f);
        GlStateManagerInvoker.b(210.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.D();
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    private static String lambda$renderItemAndEffectIntoGUI$1(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.c(itemStack));
    }

    private static String lambda$renderItemAndEffectIntoGUI$7(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.z(itemStack));
    }

    private static String lambda$renderItemAndEffectIntoGUI$0(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.k(itemStack));
    }

    public void a(FontRenderer fontRenderer, ItemStack itemStack, int n, int n2, String string) {
        if (itemStack.a == 1) {
            // empty if block
        }
        String string2 = StringInvoker.a(itemStack.a);
        if (itemStack.a < 1) {
            string2 = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), StringInvoker.a(itemStack.a)).toString();
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableBlend();
        FontRendererInvoker.drawStringWithShadow(fontRenderer, string2, n + 19 - 2 - FontRendererInvoker.a(fontRenderer, string2), n2 + 6 + 3, 0xFFFFFF);
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
        boolean bl = act_2.j(itemStack);
        if (ayy_0.d(ail_0.y)) {
            bl = aDb.e(act_2.k(itemStack), ail_0.y, new Object[]{itemStack});
        }
        int n3 = (int)MathInvoker.f(13.0 - (double)act_2.s(itemStack) * 13.0 / (double)act_2.u(itemStack));
        int n4 = (int)MathInvoker.f(255.0 - (double)act_2.s(itemStack) * 255.0 / (double)act_2.u(itemStack));
        if (ayy_0.d(ail_0.dy)) {
            double d = aDb.c(act_2.k(itemStack), ail_0.dy, new Object[]{itemStack});
            n3 = (int)MathInvoker.f(13.0 - d * 13.0);
            n4 = (int)MathInvoker.f(255.0 - d * 255.0);
        }
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.disableBlend();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        this.a(worldRenderer, n + 2, n2 + 13, 13, 2, 0, 0, 0, 255);
        this.a(worldRenderer, n + 2, n2 + 13, 12, 1, (255 - n4) / 4, 64, 0, 255);
        this.a(worldRenderer, n + 2, n2 + 13, n3, 1, 255 - n4, n4, 0, 255);
        if (!aC8.b(ail_0.aW)) {
            GlStateManagerInvoker.enableBlend();
        }
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.enableDepth();
    }

    private void a(JE jE, ItemStack itemStack) {
        this.a(jE, -1, itemStack);
    }

    private void a(WorldRenderer worldRenderer, float f, float f2, int n, int n2, int n3, int n4, int n5, int n6) {
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f, f2, 0.0), n3, n4, n5, n6));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f, f2 + (float)n2, 0.0), n3, n4, n5, n6));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f + (float)n, f2 + (float)n2, 0.0), n3, n4, n5, n6));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f + (float)n, f2, 0.0), n3, n4, n5, n6));
        TessellatorInvoker.draw(TessellatorInvoker.getInstance());
    }

    public a8h_0 a() {
        return this.f;
    }

    public void a(ItemStack itemStack, JE jE, double d) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(d, d, d);
        if (aND.c(jE)) {
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.a(-0.5, -0.5, -0.5);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.c();
            ajF.a(a53.c, itemStack);
        } else {
            if (ys_2.b()) {
                jE = am1_0.a(itemStack, jE, this.b);
            }
            GlStateManagerInvoker.a(-0.5, -0.5, -0.5);
            this.a(jE, itemStack);
            if (!(!act_2.z(itemStack) || ys_2.b() && am1_0.a(this, itemStack, jE))) {
                this.a(jE);
            }
        }
        GlStateManagerInvoker.popMatrix();
    }

    private void a(JE jE) {
        if (!(ys_2.b() && !am1_0.b() || ys_2.aC() && aVE.ch)) {
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.depthFunc(514);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.b(768, 1);
            TextureManagerInvoker.bindTexture(this.c, d);
            if (ys_2.aC() && !this.i) {
                axw_2.f();
            }
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(8.0f, 8.0f, 8.0f);
            float f = (float)(MCInvoker.a() % 3000L) / 3000.0f / 8.0f;
            GlStateManagerInvoker.translate(f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-50.0f, 0.0f, 0.0f, 1.0f);
            this.a(jE, this.b());
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(8.0f, 8.0f, 8.0f);
            float f2 = (float)(MCInvoker.a() % 4873L) / 4873.0f / 8.0f;
            GlStateManagerInvoker.translate(-f2, 0.0f, 0.0f);
            GlStateManagerInvoker.b(10.0f, 0.0f, 0.0f, 1.0f);
            this.a(jE, this.b());
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.b(770, 771);
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.depthFunc(515);
            GlStateManagerInvoker.c(true);
            TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
            if (ys_2.aC() && !this.i) {
                axw_2.a();
            }
        }
    }

    public void b(ItemStack itemStack, float f, float f2, double d) {
        this.i = true;
        JE jE = aPL.a(this.f, itemStack);
        GlStateManagerInvoker.pushMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.a(TextureManagerInvoker.b(this.c, TextureMap.r), false, false);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(f, f2, aND.e(jE));
        if (ayy_0.d(ail_0.I)) {
            jE = (JE)aDb.f(ail_0.I, new Object[]{jE, go_0.GUI});
        } else {
            afm_2.c(aND.a(jE), go_0.GUI);
        }
        this.a(itemStack, jE, d);
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.popMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.b(TextureManagerInvoker.b(this.c, TextureMap.r));
        this.i = false;
    }

    public void b(ItemStack itemStack, float f, float f2, int n) {
        this.i = true;
        JE jE = aPL.a(this.f, itemStack);
        GlStateManagerInvoker.pushMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.a(TextureManagerInvoker.b(this.c, TextureMap.r), false, false);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(f, f2, aND.e(jE));
        if (ayy_0.d(ail_0.I)) {
            jE = (JE)aDb.f(ail_0.I, new Object[]{jE, go_0.GUI});
        } else {
            afm_2.c(aND.a(jE), go_0.GUI);
        }
        this.a(itemStack, jE, n);
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.popMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.b(TextureManagerInvoker.b(this.c, TextureMap.r));
        this.i = false;
    }

    protected void a(Item item, int n, String string) {
        aPL.a(this.f, item, n, new aRJ(string, aow_0.f7));
    }

    public void b(ItemStack itemStack, float f, float f2) {
        this.i = true;
        JE jE = aPL.a(this.f, itemStack);
        GlStateManagerInvoker.pushMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.a(TextureManagerInvoker.b(this.c, TextureMap.r), false, false);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.a(f, f2, aND.e(jE));
        if (ayy_0.d(ail_0.I)) {
            jE = (JE)aDb.f(ail_0.I, new Object[]{jE, go_0.GUI});
        } else {
            afm_2.c(aND.a(jE), go_0.GUI);
        }
        this.a(itemStack, jE);
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.popMatrix();
        TextureManagerInvoker.bindTexture(this.c, TextureMap.r);
        u3_0.b(TextureManagerInvoker.b(this.c, TextureMap.r));
        this.i = false;
    }

    public void a(FontRenderer fontRenderer, ItemStack itemStack, int n, float f) {
        this.a(fontRenderer, itemStack, n, f, null);
    }

    private static String lambda$renderItemAndEffectIntoGUI$4(ItemStack itemStack) throws Exception {
        return StringInvoker.a(act_2.k(itemStack));
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private void a(WorldRenderer worldRenderer, List<a9Z> list, int n, ItemStack itemStack) {
        boolean bl = n == -1;
        int n2 = ListInvoker.size(list);
        for (int i = 0; i < n2; ++i) {
            a9Z a9Z2 = (a9Z)ListInvoker.get(list, i);
            int n3 = n;
            if (aX3.b(a9Z2)) {
                n3 = px_0.a(act_2.k(itemStack), itemStack, aX3.e(a9Z2));
                if (ys_2.aF()) {
                    n3 = ajT.a(itemStack, aX3.e(a9Z2), n3);
                }
                if (EntityRenderer.c) {
                    n3 = aiv_2.b(n3);
                }
                n3 |= 0xFF000000;
            }
            this.b(worldRenderer, a9Z2, n3);
        }
    }
}

