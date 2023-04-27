/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from net.aV
 */
public class av_1 {
    private List<aiy_2> a = my_0.c();
    private static av_1 b = new av_1();

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static av_1 b() {
        return b;
    }

    private av_1() {
        ly_1.a(new a9O(), this);
        zz_2.a(new are_2(), this);
        PK.a(new aov_0(), this);
        a4p.a(new HG(), this);
        a6v_0.a(new arb_1(), this);
        adr_0.a(new aH9(), this);
        va_0.a(new amd_2(), this);
        ListInvoker.add(this.a, new awq_1());
        ListInvoker.add(this.a, new by_0());
        ListInvoker.add(this.a, new axf_2());
        ListInvoker.add(this.a, new azg_1());
        ListInvoker.add(this.a, new art_0());
        ListInvoker.add(this.a, new azt_1());
        new afv_1().a(this);
        this.a(new ItemStack(Items.paper, 3), Q4.bw, aze_0.c('#'), Items.reeds);
        this.b(new ItemStack(Items.book, 1), Items.paper, Items.paper, Items.paper, Items.leather);
        this.b(new ItemStack(Items.writable_book, 1), Items.book, new ItemStack(Items.dye, 1, my_2.c(YZ.BLACK)), Items.feather);
        this.a(new ItemStack(Blocks.Z, 3), Q4.w, Q4.aX, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Blocks.n, 3), Q4.G, Q4.c2, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Blocks.cg, 3), Q4.m, Q4.bi, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Blocks.m, 3), Q4.dl, Q4.bm, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Blocks.cp, 3), Q4.ab, Q4.bV, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.ACACIA) - 4));
        this.a(new ItemStack(Blocks.bo, 3), Q4.aw, Q4.cN, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.DARK_OAK) - 4));
        this.a(new ItemStack(Blocks.w, 6, ya_1.a(akb_0.NORMAL)), Q4.bu, Q4.aC, aze_0.c('#'), Blocks.cobblestone);
        this.a(new ItemStack(Blocks.w, 6, ya_1.a(akb_0.MOSSY)), Q4.cI, Q4.bd, aze_0.c('#'), Blocks.L);
        this.a(new ItemStack(Blocks.a6, 6), Q4.bL, Q4.z, aze_0.c('#'), Blocks.ak);
        this.a(new ItemStack(Blocks.ch, 1), Q4.aE, Q4.df, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Blocks.aZ, 1), Q4.y, Q4.cT, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Blocks.a4, 1), Q4.ay, Q4.bn, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Blocks.S, 1), Q4.cF, Q4.aN, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Blocks.x, 1), Q4.aV, Q4.bW, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.ACACIA) - 4));
        this.a(new ItemStack(Blocks.cb, 1), Q4.cH, Q4.ar, aze_0.c('#'), Items.stick, aze_0.c('W'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.DARK_OAK) - 4));
        this.a(new ItemStack(Blocks.a5, 1), Q4.b6, Q4.dE, Q4.db, aze_0.c('#'), Blocks.planks, aze_0.c('X'), Items.diamond);
        this.a(new ItemStack(Items.lead, 2), Q4.bb, Q4.c1, Q4.bE, aze_0.c('~'), Items.string, aze_0.c('O'), Items.slime_ball);
        this.a(new ItemStack(Blocks.q, 1), Q4.O, Q4.bh, Q4.aG, aze_0.c('#'), Blocks.planks, aze_0.c('X'), Items.redstone);
        this.a(new ItemStack(Blocks.at, 1), Q4.bz, Q4.cW, Q4.di, aze_0.c('#'), Blocks.planks, aze_0.c('X'), Items.book);
        this.a(new ItemStack(Blocks.bq, 1), Q4.dK, Q4.aB, aze_0.c('#'), Items.snowball);
        this.a(new ItemStack(Blocks.cm, 6), Q4.aM, aze_0.c('#'), Blocks.bq);
        this.a(new ItemStack(Blocks.T, 1), Q4.bK, Q4.bF, aze_0.c('#'), Items.clay_ball);
        this.a(new ItemStack(Blocks.bL, 1), Q4.c0, Q4.dG, aze_0.c('#'), Items.brick);
        this.a(new ItemStack(Blocks.bs, 1), Q4.bx, Q4.dB, aze_0.c('#'), Items.glowstone_dust);
        this.a(new ItemStack(Blocks.v, 1), Q4.c7, Q4.C, aze_0.c('#'), Items.quartz);
        this.a(new ItemStack(Blocks.b_, 1), Q4.ad, Q4.a5, aze_0.c('#'), Items.string);
        this.a(new ItemStack(Blocks.Y, 1), Q4.cl, Q4.an, Q4.cq, aze_0.c('X'), Items.gunpowder, aze_0.c('#'), Blocks.sand);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.COBBLESTONE)), Q4.c9, aze_0.c('#'), Blocks.cobblestone);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.STONE)), Q4.d, aze_0.c('#'), new ItemStack(Blocks.stone, XR.b(UI.STONE)));
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.SAND)), Q4.cv, aze_0.c('#'), Blocks.bG);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.BRICK)), Q4.bo, aze_0.c('#'), Blocks.bL);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.SMOOTHBRICK)), Q4.cM, aze_0.c('#'), Blocks.z);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.NETHERBRICK)), Q4.D, aze_0.c('#'), Blocks.ak);
        this.a(new ItemStack(Blocks.bA, 6, acz_0.a(aAB.QUARTZ)), Q4.cU, aze_0.c('#'), Blocks.v);
        this.a(new ItemStack(Blocks.bf, 6, ahl_2.b(mp_0.RED_SANDSTONE)), Q4.aQ, aze_0.c('#'), Blocks.r);
        this.a(new ItemStack(Blocks.e, 6, 0), Q4.cD, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Blocks.e, 6, aER.b(F3.BIRCH)), Q4.cO, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Blocks.e, 6, aER.b(F3.SPRUCE)), Q4.bZ, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Blocks.e, 6, aER.b(F3.JUNGLE)), Q4.ct, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Blocks.e, 6, 4 + aER.b(F3.ACACIA) - 4), Q4.bI, aze_0.c('#'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.ACACIA) - 4));
        this.a(new ItemStack(Blocks.e, 6, 4 + aER.b(F3.DARK_OAK) - 4), Q4.u, aze_0.c('#'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.DARK_OAK) - 4));
        this.a(new ItemStack(Blocks.bm, 3), Q4.bH, Q4.ca, Q4.ax, aze_0.c('#'), Items.stick);
        this.a(new ItemStack(Items.oak_door, 3), Q4.cS, Q4.cp, Q4.n, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Items.spruce_door, 3), Q4.bR, Q4.cx, Q4.b7, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Items.birch_door, 3), Q4.da, Q4.o, Q4.bD, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Items.jungle_door, 3), Q4.cw, Q4.ak, Q4.bG, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Items.acacia_door, 3), Q4.cs, Q4.c, Q4.dn, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.ACACIA)));
        this.a(new ItemStack(Items.dark_oak_door, 3), Q4.aI, Q4.cA, Q4.c5, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.DARK_OAK)));
        this.a(new ItemStack(Blocks.ac, 2), Q4.a0, Q4.cV, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Items.iron_door, 3), Q4.aZ, Q4.aj, Q4.dj, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Blocks.bt, 1), Q4.az, Q4.cR, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Items.sign, 3), Q4.dL, Q4.aA, Q4.al, aze_0.c('#'), Blocks.planks, aze_0.c('X'), Items.stick);
        this.a(new ItemStack(Items.cake, 1), Q4.by, Q4.aY, Q4.bP, aze_0.c('A'), Items.milk_bucket, aze_0.c('B'), Items.sugar, aze_0.c('C'), Items.wheat, aze_0.c('E'), Items.egg);
        this.a(new ItemStack(Items.sugar, 1), Q4.F, aze_0.c('#'), Items.reeds);
        this.a(new ItemStack(Blocks.planks, 4, aER.b(F3.OAK)), Q4.dw, aze_0.c('#'), new ItemStack(Blocks.b2, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Blocks.planks, 4, aER.b(F3.SPRUCE)), Q4.aO, aze_0.c('#'), new ItemStack(Blocks.b2, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Blocks.planks, 4, aER.b(F3.BIRCH)), Q4.bA, aze_0.c('#'), new ItemStack(Blocks.b2, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Blocks.planks, 4, aER.b(F3.JUNGLE)), Q4.a9, aze_0.c('#'), new ItemStack(Blocks.b2, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Blocks.planks, 4, 4 + aER.b(F3.ACACIA) - 4), Q4.dm, aze_0.c('#'), new ItemStack(Blocks.bO, 1, aER.b(F3.ACACIA) - 4));
        this.a(new ItemStack(Blocks.planks, 4, 4 + aER.b(F3.DARK_OAK) - 4), Q4.a_, aze_0.c('#'), new ItemStack(Blocks.bO, 1, aER.b(F3.DARK_OAK) - 4));
        this.a(new ItemStack(Items.stick, 4), Q4.l, Q4.a4, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Blocks.bD, 4), Q4.av, Q4.b2, aze_0.c('X'), Items.coal, aze_0.c('#'), Items.stick);
        this.a(new ItemStack(Blocks.bD, 4), Q4.dI, Q4.at, aze_0.c('X'), new ItemStack(Items.coal, 1, 1), aze_0.c('#'), Items.stick);
        this.a(new ItemStack(Items.bowl, 4), Q4.c3, Q4.cg, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Items.glass_bottle, 3), Q4.h, Q4.bj, aze_0.c('#'), Blocks.a8);
        this.a(new ItemStack(Blocks.bQ, 16), Q4.bS, Q4.Y, Q4.b_, aze_0.c('X'), Items.iron_ingot, aze_0.c('#'), Items.stick);
        this.a(new ItemStack(Blocks.bg, 6), Q4.Z, Q4.dq, Q4.b0, aze_0.c('X'), Items.gold_ingot, aze_0.c('R'), Items.redstone, aze_0.c('#'), Items.stick);
        this.a(new ItemStack(Blocks.bc, 6), Q4.ap, Q4.b1, Q4.bQ, aze_0.c('X'), Items.iron_ingot, aze_0.c('#'), Blocks.br, aze_0.c('S'), Items.stick);
        this.a(new ItemStack(Blocks.bX, 6), Q4.cc, Q4.ci, Q4.bc, aze_0.c('X'), Items.iron_ingot, aze_0.c('R'), Items.redstone, aze_0.c('#'), Blocks.j);
        this.a(new ItemStack(Items.minecart, 1), Q4.cZ, Q4.a6, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Items.cauldron, 1), Q4.B, Q4.j, Q4.am, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Items.brewing_stand, 1), Q4.k, Q4.ba, aze_0.c('#'), Blocks.cobblestone, aze_0.c('B'), Items.blaze_rod);
        this.a(new ItemStack(Blocks.a1, 1), Q4.de, Q4.bl, aze_0.c('A'), Blocks.ap, aze_0.c('B'), Blocks.bD);
        this.a(new ItemStack(Items.chest_minecart, 1), Q4.cQ, Q4.X, aze_0.c('A'), Blocks.R, aze_0.c('B'), Items.minecart);
        this.a(new ItemStack(Items.furnace_minecart, 1), Q4.aF, Q4.bN, aze_0.c('A'), Blocks.ab, aze_0.c('B'), Items.minecart);
        this.a(new ItemStack(Items.tnt_minecart, 1), Q4.cC, Q4.bM, aze_0.c('A'), Blocks.Y, aze_0.c('B'), Items.minecart);
        this.a(new ItemStack(Items.hopper_minecart, 1), Q4.b9, Q4.du, aze_0.c('A'), Blocks.t, aze_0.c('B'), Items.minecart);
        this.a(new ItemStack(Items.boat, 1), Q4.s, Q4.U, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Items.bucket, 1), Q4.bU, Q4.ao, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Items.flower_pot, 1), Q4.dz, Q4.bk, aze_0.c('#'), Items.brick);
        this.b(new ItemStack(Items.flint_and_steel, 1), new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.flint, 1));
        this.a(new ItemStack(Items.bread, 1), Q4.cX, aze_0.c('#'), Items.wheat);
        this.a(new ItemStack(Blocks.a7, 4), Q4.dH, Q4.cK, Q4.be, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.OAK)));
        this.a(new ItemStack(Blocks.F, 4), Q4.e, Q4.cY, Q4.cB, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.BIRCH)));
        this.a(new ItemStack(Blocks.aT, 4), Q4.aW, Q4.b, Q4.b8, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.SPRUCE)));
        this.a(new ItemStack(Blocks.aa, 4), Q4.dO, Q4.I, Q4.dp, aze_0.c('#'), new ItemStack(Blocks.planks, 1, aER.b(F3.JUNGLE)));
        this.a(new ItemStack(Blocks.bx, 4), Q4.bT, Q4.c_, Q4.cL, aze_0.c('#'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.ACACIA) - 4));
        this.a(new ItemStack(Blocks.cf, 4), Q4.aS, Q4.af, Q4.dM, aze_0.c('#'), new ItemStack(Blocks.planks, 1, 4 + aER.b(F3.DARK_OAK) - 4));
        this.a(new ItemStack(Items.fishing_rod, 1), Q4.ds, Q4.dv, Q4.dy, aze_0.c('#'), Items.stick, aze_0.c('X'), Items.string);
        this.a(new ItemStack(Items.carrot_on_a_stick, 1), Q4.dA, Q4.x, aze_0.c('#'), Items.fishing_rod, aze_0.c('X'), Items.carrot);
        this.a(new ItemStack(Blocks.U, 4), Q4.cP, Q4.ck, Q4.dr, aze_0.c('#'), Blocks.cobblestone);
        this.a(new ItemStack(Blocks.aU, 4), Q4.L, Q4.cu, Q4.t, aze_0.c('#'), Blocks.bL);
        this.a(new ItemStack(Blocks.bZ, 4), Q4.dJ, Q4.aT, Q4.br, aze_0.c('#'), Blocks.z);
        this.a(new ItemStack(Blocks.ct, 4), Q4.b4, Q4.dc, Q4.bB, aze_0.c('#'), Blocks.ak);
        this.a(new ItemStack(Blocks.aO, 4), Q4.c6, Q4.aU, Q4.E, aze_0.c('#'), Blocks.bG);
        this.a(new ItemStack(Blocks.b1, 4), Q4.v, Q4.H, Q4.bq, aze_0.c('#'), Blocks.r);
        this.a(new ItemStack(Blocks.a3, 4), Q4.cr, Q4.ah, Q4.c8, aze_0.c('#'), Blocks.v);
        this.a(new ItemStack(Items.painting, 1), Q4.dt, Q4.b3, Q4.J, aze_0.c('#'), Items.stick, aze_0.c('X'), Blocks.b_);
        this.a(new ItemStack(Items.item_frame, 1), Q4.ag, Q4.ae, Q4.bf, aze_0.c('#'), Items.stick, aze_0.c('X'), Items.leather);
        this.a(new ItemStack(Items.golden_apple, 1, 0), Q4.R, Q4.aL, Q4.cj, aze_0.c('#'), Items.gold_ingot, aze_0.c('X'), Items.apple);
        this.a(new ItemStack(Items.golden_apple, 1, 1), Q4.aH, Q4.bJ, Q4.K, aze_0.c('#'), Blocks.D, aze_0.c('X'), Items.apple);
        this.a(new ItemStack(Items.golden_carrot, 1, 0), Q4.aP, Q4.ch, Q4.cm, aze_0.c('#'), Items.gold_nugget, aze_0.c('X'), Items.carrot);
        this.a(new ItemStack(Items.speckled_melon, 1), Q4.aD, Q4.S, Q4.r, aze_0.c('#'), Items.gold_nugget, aze_0.c('X'), Items.melon);
        this.a(new ItemStack(Blocks.aG, 1), Q4.P, Q4.a1, aze_0.c('#'), Blocks.cobblestone, aze_0.c('X'), Items.stick);
        this.a(new ItemStack(Blocks.be, 2), Q4.f, Q4.c4, Q4.b5, aze_0.c('#'), Blocks.planks, aze_0.c('S'), Items.stick, aze_0.c('I'), Items.iron_ingot);
        this.a(new ItemStack(Blocks.br, 1), Q4.a8, Q4.a7, aze_0.c('#'), Items.stick, aze_0.c('X'), Items.redstone);
        this.a(new ItemStack(Items.repeater, 1), Q4.a2, Q4.cG, aze_0.c('#'), Blocks.br, aze_0.c('X'), Items.redstone, aze_0.c('I'), new ItemStack(Blocks.stone, 1, XR.b(UI.STONE)));
        this.a(new ItemStack(Items.comparator, 1), Q4.dC, Q4.ai, Q4.cb, aze_0.c('#'), Blocks.br, aze_0.c('X'), Items.quartz, aze_0.c('I'), new ItemStack(Blocks.stone, 1, XR.b(UI.STONE)));
        this.a(new ItemStack(Items.clock, 1), Q4.cn, Q4.a, Q4.cf, aze_0.c('#'), Items.gold_ingot, aze_0.c('X'), Items.redstone);
        this.a(new ItemStack(Items.compass, 1), Q4.A, Q4.dN, Q4.bs, aze_0.c('#'), Items.iron_ingot, aze_0.c('X'), Items.redstone);
        this.a(new ItemStack(Items.map, 1), Q4.T, Q4.as, Q4.co, aze_0.c('#'), Items.paper, aze_0.c('X'), Items.compass);
        this.a(new ItemStack(Blocks.bF, 1), Q4.dD, aze_0.c('#'), new ItemStack(Blocks.stone, 1, XR.b(UI.STONE)));
        this.a(new ItemStack(Blocks.cq, 1), Q4.p, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Blocks.j, 1), Q4.aa, aze_0.c('#'), new ItemStack(Blocks.stone, 1, XR.b(UI.STONE)));
        this.a(new ItemStack(Blocks.ae, 1), Q4.cd, aze_0.c('#'), Blocks.planks);
        this.a(new ItemStack(Blocks.aW, 1), Q4.Q, aze_0.c('#'), Items.iron_ingot);
        this.a(new ItemStack(Blocks.bd, 1), Q4.ce, aze_0.c('#'), Items.gold_ingot);
        this.a(new ItemStack(Blocks.aB, 1), Q4.cE, Q4.ac, Q4.bC, aze_0.c('#'), Blocks.cobblestone, aze_0.c('X'), Items.bow, aze_0.c('R'), Items.redstone);
        this.a(new ItemStack(Blocks.ag, 1), Q4.dk, Q4.aK, Q4.g, aze_0.c('#'), Blocks.cobblestone, aze_0.c('R'), Items.redstone);
        this.a(new ItemStack(Blocks.bB, 1), Q4.aJ, Q4.bt, Q4.dd, aze_0.c('#'), Blocks.cobblestone, aze_0.c('X'), Items.iron_ingot, aze_0.c('R'), Items.redstone, aze_0.c('T'), Blocks.planks);
        this.a(new ItemStack(Blocks.E, 1), Q4.bp, Q4.i, aze_0.c('S'), Items.slime_ball, aze_0.c('P'), Blocks.bB);
        this.a(new ItemStack(Items.bed, 1), Q4.dF, Q4.cy, aze_0.c('#'), Blocks.b_, aze_0.c('X'), Blocks.planks);
        this.a(new ItemStack(Blocks.bw, 1), Q4.N, Q4.dg, Q4.dh, aze_0.c('#'), Blocks.O, aze_0.c('B'), Items.book, aze_0.c('D'), Items.diamond);
        this.a(new ItemStack(Blocks.J, 1), Q4.cJ, Q4.dx, Q4.aR, aze_0.c('I'), Blocks.co, aze_0.c('i'), Items.iron_ingot);
        this.a(new ItemStack(Items.leather), Q4.aq, Q4.au, aze_0.c('#'), Items.rabbit_hide);
        this.b(new ItemStack(Items.ender_eye, 1), Items.ender_pearl, Items.blaze_powder);
        this.b(new ItemStack(Items.fire_charge, 3), Items.gunpowder, Items.blaze_powder, Items.coal);
        this.b(new ItemStack(Items.fire_charge, 3), Items.gunpowder, Items.blaze_powder, new ItemStack(Items.coal, 1, 1));
        this.a(new ItemStack(Blocks.u), Q4.V, Q4.W, Q4.bX, aze_0.c('G'), Blocks.a8, aze_0.c('Q'), Items.quartz, aze_0.c('W'), Blocks.e);
        this.a(new ItemStack(Blocks.t), Q4.cz, Q4.M, Q4.a3, aze_0.c('I'), Items.iron_ingot, aze_0.c('C'), Blocks.R);
        this.a(new ItemStack(Items.armor_stand, 1), Q4.bO, Q4.bg, Q4.bv, aze_0.c('/'), Items.stick, aze_0.c('_'), new ItemStack(Blocks.bA, 1, acz_0.a(aAB.STONE)));
        ListInvoker.sort(this.a, av_1::lambda$new$0);
    }

    public azh_2 a(ItemStack itemStack, Object ... objectArray) {
        Object object2;
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (objectArray[n] instanceof String[]) {
            for (String string : object2 = (String[])objectArray[n++]) {
                ++n3;
                n2 = StringInvoker.c(string);
                aL0.a(stringBuilder, string);
            }
        } else {
            while (objectArray[n] instanceof String) {
                object2 = (String)objectArray[n++];
                ++n3;
                n2 = StringInvoker.c((String)object2);
                aL0.a(stringBuilder, (String)object2);
            }
        }
        object2 = MapsInvoker.a();
        while (n < objectArray.length) {
            Character c = (Character)objectArray[n];
            ItemStack itemStack2 = null;
            if (objectArray[n + 1] instanceof Item) {
                itemStack2 = new ItemStack((Item)objectArray[n + 1]);
            } else if (objectArray[n + 1] instanceof Block) {
                itemStack2 = new ItemStack((Block)objectArray[n + 1], 1, Short.MAX_VALUE);
            } else if (objectArray[n + 1] instanceof ItemStack) {
                itemStack2 = (ItemStack)objectArray[n + 1];
            }
            MapInvoker.c((Map)object2, c, itemStack2);
            n += 2;
        }
        ItemStack[] itemStackArray = new ItemStack[n2 * n3];
        int n4 = 0;
        int cfr_ignored_0 = n2 * n3;
        azh_2 azh_22 = new azh_2(n2, n3, itemStackArray, itemStack);
        ListInvoker.add(this.a, azh_22);
        return azh_22;
    }

    public ItemStack b(adb_1 adb_12, World world) {
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            aiy_2 aiy_22 = (aiy_2)dz_0.b(iterator);
            if (!di_1.a(aiy_22, adb_12, world)) continue;
            return di_1.a(aiy_22, adb_12);
        }
        return null;
    }

    public void b(ItemStack itemStack, Object ... objectArray) {
        ArrayList arrayList = my_0.c();
        for (Object object : objectArray) {
            if (object instanceof ItemStack) {
                ListInvoker.add(arrayList, act_2.C((ItemStack)object));
                continue;
            }
            if (object instanceof Item) {
                ListInvoker.add(arrayList, new ItemStack((Item)object));
                continue;
            }
            if (!(object instanceof Block)) {
                throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), Q4.bY), ara_2.b(object.getClass())), Q4.q).toString());
            }
            ListInvoker.add(arrayList, new ItemStack((Block)object));
        }
        ListInvoker.add(this.a, new awz_2(itemStack, arrayList));
    }

    private static int lambda$new$0(aiy_2 aiy_22, aiy_2 aiy_23) {
        return P8.a(di_1.b(aiy_23), di_1.b(aiy_22));
    }

    public ItemStack[] a(adb_1 adb_12, World world) {
        ItemStack[] itemStackArray = ListInvoker.iterator(this.a);
        while (dz_0.c((Iterator)itemStackArray)) {
            aiy_2 aiy_22 = (aiy_2)dz_0.b((Iterator)itemStackArray);
            if (!di_1.a(aiy_22, adb_12, world)) continue;
            return di_1.b(aiy_22, adb_12);
        }
        itemStackArray = new ItemStack[aVF.c(adb_12)];
        for (int i = 0; i < itemStackArray.length; ++i) {
            itemStackArray[i] = aVF.b(adb_12, i);
        }
        return itemStackArray;
    }

    public List<aiy_2> a() {
        return this.a;
    }

    public void a(aiy_2 aiy_22) {
        ListInvoker.add(this.a, aiy_22);
    }
}

