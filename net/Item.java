/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.common.collect.Multimap
 *  net.L2
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Function;
import com.google.common.collect.Multimap;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import net.L2;

public class Item {
    private int l;
    private CreativeTabs d;
    protected static Random j;
    private Item g;
    private String a;
    protected boolean e;
    protected boolean i;
    protected static UUID h;
    private static Map<Block, Item> b;
    public static zo_2<ResourceLocation, Item> k;
    private String f;
    protected int c = 64;

    protected Item a(boolean bl) {
        this.e = bl;
        return this;
    }

    public Item c() {
        return this.g;
    }

    public int m() {
        return this.c;
    }

    protected MovingObjectPosition a(World world, EntityPlayer entityPlayer, boolean bl) {
        float f = entityPlayer.rotationPitch;
        float f2 = entityPlayer.rotationYaw;
        double d = entityPlayer.posX;
        double d2 = entityPlayer.posY + (double)a6w_0.q(entityPlayer);
        double d3 = entityPlayer.posZ;
        Vec3 vec3 = new Vec3(d, d2, d3);
        float f3 = MathHelper.cos(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = MathHelper.sin(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -MathHelper.cos(-f * ((float)Math.PI / 180));
        float f6 = MathHelper.sin(-f * ((float)Math.PI / 180));
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d4 = 5.0;
        Vec3 vec32 = aNE.a(vec3, (double)f7 * d4, (double)f6 * d4, (double)f8 * d4);
        return aV8.a(world, vec3, vec32, bl, true, false);
    }

    static {
        k = new zo_2();
        b = MapsInvoker.a();
        h = awc_1.a(aK_.dL);
        j = new Random();
    }

    private static String lambda$registerItems$0(ItemStack itemStack) {
        return XR.a(act_2.c(itemStack)).b();
    }

    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        return false;
    }

    public Item a(Item item) {
        this.g = item;
        return this;
    }

    private static String lambda$registerItems$1(ItemStack itemStack) {
        return av4_0.a(act_2.c(itemStack)).b();
    }

    public int c(int n) {
        return 0;
    }

    public boolean a(ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        return false;
    }

    public boolean l() {
        return this.i;
    }

    public String e(ItemStack itemStack) {
        return StringInvoker.h(aL0.a(aL0.a(new StringBuilder(), aK_.d_), ahq_0.b(aL0.a(aL0.a(new StringBuilder(), this.j(itemStack)), aK_.p).toString())).toString());
    }

    private static String lambda$registerItems$4(ItemStack itemStack) {
        return pl_0.a(act_2.c(itemStack)).c();
    }

    public float a(ItemStack itemStack, Block block) {
        return 1.0f;
    }

    protected Item setMaxDamage(int n) {
        this.l = n;
        return this;
    }

    public boolean i() {
        return this.e;
    }

    protected Item c(String string) {
        this.a = string;
        return this;
    }

    private static void a(int n, String string, Item item) {
        Item.a(n, new ResourceLocation(string), item);
    }

    public Item a(int n) {
        this.c = n;
        return this;
    }

    public boolean a() {
        return false;
    }

    private static String lambda$registerItems$8(ItemStack itemStack) {
        return le_1.a(act_2.c(itemStack)).b();
    }

    private static void c(Block block) {
        Item.a(block, new ItemBlock(block));
    }

    public boolean b(Block block) {
        return false;
    }

    public int q() {
        return 0;
    }

    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer entityPlayer, int n) {
    }

    public int b() {
        return this.l;
    }

    public ti_1 c(ItemStack itemStack) {
        return ti_1.NONE;
    }

    public boolean h() {
        return this.g != null;
    }

    public static Item a(String string) {
        Item item = (Item)aLP.b(k, new ResourceLocation(string));
        try {
            return Item.d(P8.a(string));
        }
        catch (NumberFormatException numberFormatException) {
            return item;
        }
    }

    public Item k() {
        this.i = true;
        return this;
    }

    public boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return false;
    }

    public CreativeTabs g() {
        return this.d;
    }

    private static String lambda$registerItems$11(ItemStack itemStack) {
        return SL.a(act_2.c(itemStack)).b();
    }

    public void a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
    }

    public static void f() {
        Item.a(Blocks.stone, WM.a(new L6(Blocks.stone, Blocks.stone, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$0)), aK_.F));
        Item.a(Blocks.grass, new KJ(Blocks.grass, false));
        Item.a(Blocks.dirt, WM.a(new L6(Blocks.dirt, Blocks.dirt, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$1)), aK_.bW));
        Item.c(Blocks.cobblestone);
        Item.a(Blocks.planks, WM.a(new L6(Blocks.planks, Blocks.planks, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$2)), aK_.cW));
        Item.a(Blocks.sapling, WM.a(new L6(Blocks.sapling, Blocks.sapling, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$3)), aK_.bS));
        Item.c(Blocks.bedrock);
        Item.a(Blocks.sand, WM.a(new L6((Block)Blocks.sand, (Block)Blocks.sand, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$4)), aK_.aG));
        Item.c(Blocks.gravel);
        Item.c(Blocks.gold_ore);
        Item.c(Blocks.iron_ore);
        Item.c(Blocks.coal_ore);
        Item.a(Blocks.b2, WM.a(new L6(Blocks.b2, Blocks.b2, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$5)), aK_.bG));
        Item.a(Blocks.bO, WM.a(new L6(Blocks.bO, Blocks.bO, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$6)), aK_.di));
        Item.a(Blocks.bP, Aa.a(new ly_0(Blocks.bP), aK_.e3));
        Item.a(Blocks.bM, Aa.a(new ly_0(Blocks.bM), aK_.fE));
        Item.a(Blocks.aM, WM.a(new L6(Blocks.aM, Blocks.aM, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$7)), aK_.bv));
        Item.c(Blocks.a8);
        Item.c(Blocks.bH);
        Item.c(Blocks.ba);
        Item.c(Blocks.aB);
        Item.a(Blocks.bG, WM.a(new L6(Blocks.bG, Blocks.bG, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$8)), aK_.fN));
        Item.c(Blocks.q);
        Item.c(Blocks.bg);
        Item.c(Blocks.bX);
        Item.a(Blocks.E, new LW(Blocks.E));
        Item.c(Blocks.bI);
        Item.a(Blocks.bN, mr_2.a(new KJ(Blocks.bN, true), new String[]{aK_.fq, aK_.eo, aK_.bf}));
        Item.c(Blocks.ca);
        Item.a(Blocks.bB, new LW(Blocks.bB));
        Item.a(Blocks.b_, ads_2.a(new KT(Blocks.b_), aK_.fI));
        Item.a(Blocks.G, WM.a(new L6((Block)Blocks.G, (Block)Blocks.G, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$9)), aK_.fj));
        Item.a(Blocks.bY, WM.a(new L6((Block)Blocks.bY, (Block)Blocks.bY, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$10)), aK_.d3));
        Item.c(Blocks.A);
        Item.c(Blocks.bn);
        Item.c(Blocks.D);
        Item.c(Blocks.co);
        Item.a(Blocks.bA, aQ3.a(new lv_0(Blocks.bA, Blocks.bA, Blocks.X), aK_.cV));
        Item.c(Blocks.bL);
        Item.c(Blocks.Y);
        Item.c(Blocks.at);
        Item.c(Blocks.L);
        Item.c(Blocks.O);
        Item.c(Blocks.bD);
        Item.c(Blocks.p);
        Item.c(Blocks.a7);
        Item.c(Blocks.R);
        Item.c(Blocks.C);
        Item.c(Blocks.ar);
        Item.c(Blocks.aq);
        Item.c(Blocks.al);
        Item.c(Blocks.ab);
        Item.c(Blocks.a);
        Item.c(Blocks.bm);
        Item.c(Blocks.bQ);
        Item.c(Blocks.U);
        Item.c(Blocks.aG);
        Item.c(Blocks.j);
        Item.c(Blocks.ae);
        Item.c(Blocks.b5);
        Item.c(Blocks.br);
        Item.c(Blocks.bF);
        Item.a(Blocks.cm, new LV(Blocks.cm));
        Item.c(Blocks.I);
        Item.c(Blocks.bq);
        Item.c(Blocks.a9);
        Item.c(Blocks.T);
        Item.c(Blocks.a5);
        Item.c(Blocks.Z);
        Item.c(Blocks.cg);
        Item.c(Blocks.n);
        Item.c(Blocks.m);
        Item.c(Blocks.bo);
        Item.c(Blocks.cp);
        Item.c(Blocks.ap);
        Item.c(Blocks.bu);
        Item.c(Blocks.s);
        Item.c(Blocks.bs);
        Item.c(Blocks.a1);
        Item.c(Blocks.ac);
        Item.a(Blocks.bV, WM.a(new L6(Blocks.bV, Blocks.bV, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$11)), aK_.fn));
        Item.a(Blocks.z, WM.a(new L6(Blocks.z, Blocks.z, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$12)), aK_.c1));
        Item.c(Blocks.aj);
        Item.c(Blocks.Q);
        Item.c(Blocks.by);
        Item.c(Blocks.cd);
        Item.c(Blocks.aQ);
        Item.a(Blocks.as, new KJ(Blocks.as, false));
        Item.c(Blocks.ch);
        Item.c(Blocks.a4);
        Item.c(Blocks.aZ);
        Item.c(Blocks.S);
        Item.c(Blocks.cb);
        Item.c(Blocks.x);
        Item.c(Blocks.aU);
        Item.c(Blocks.bZ);
        Item.c(Blocks.aE);
        Item.a(Blocks.an, new ll_0(Blocks.an));
        Item.c(Blocks.ak);
        Item.c(Blocks.a6);
        Item.c(Blocks.ct);
        Item.c(Blocks.bw);
        Item.c(Blocks.aK);
        Item.c(Blocks.H);
        Item.c(Blocks.bW);
        Item.c(Blocks.M);
        Item.a(Blocks.e, aQ3.a(new lv_0(Blocks.e, Blocks.e, Blocks.a_), aK_.cQ));
        Item.c(Blocks.aO);
        Item.c(Blocks.K);
        Item.c(Blocks.g);
        Item.c(Blocks.be);
        Item.c(Blocks.av);
        Item.c(Blocks.aT);
        Item.c(Blocks.F);
        Item.c(Blocks.aa);
        Item.c(Blocks.bz);
        Item.c(Blocks.d);
        Item.a(Blocks.w, WM.a(new L6(Blocks.w, Blocks.w, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$13)), aK_.dB));
        Item.c(Blocks.cq);
        Item.a(Blocks.J, ady_0.a(new lj_0(Blocks.J), aK_.an));
        Item.c(Blocks.aA);
        Item.c(Blocks.bd);
        Item.c(Blocks.aW);
        Item.c(Blocks.u);
        Item.c(Blocks.bT);
        Item.c(Blocks.cl);
        Item.c(Blocks.t);
        Item.a(Blocks.v, WM.a(new L6(Blocks.v, Blocks.v, new String[]{aK_.K, aK_.bZ, aK_.ct}), aK_.bA));
        Item.c(Blocks.a3);
        Item.c(Blocks.bc);
        Item.c(Blocks.ag);
        Item.a(Blocks.cr, ads_2.a(new KT(Blocks.cr), aK_.cf));
        Item.c(Blocks.ao);
        Item.c(Blocks.bt);
        Item.c(Blocks.y);
        Item.a(Blocks.bl, ads_2.a(new KT(Blocks.bl), aK_.e0));
        Item.c(Blocks.aJ);
        Item.c(Blocks.bK);
        Item.c(Blocks.bJ);
        Item.c(Blocks.bx);
        Item.c(Blocks.cf);
        Item.c(Blocks.b);
        Item.a(Blocks.ai, UR.a(new lp_0((Block)Blocks.ai, (Block)Blocks.ai, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$14)), aK_.a1));
        Item.a(Blocks.am, ads_2.a(new KT(Blocks.am), aK_.C));
        Item.a(Blocks.ad, ads_2.a(new KT(Blocks.ad), aK_.c6));
        Item.a(Blocks.aD, WM.a(new L6(Blocks.aD, Blocks.aD, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$15)), aK_.ey));
        Item.c(Blocks.b6);
        Item.a(Blocks.r, WM.a(new L6(Blocks.r, Blocks.r, (Function<ItemStack, String>)((Function)Item::lambda$registerItems$16)), aK_.W));
        Item.c(Blocks.b1);
        Item.a(Blocks.bf, aQ3.a(new lv_0(Blocks.bf, Blocks.bf, Blocks.ah), aK_.cs));
        Item.a(256, aK_.gj, new LK(anh_2.IRON).b(aK_.cm));
        Item.a(257, aK_.f5, new LY(anh_2.IRON).b(aK_.fD));
        Item.a(258, aK_.aO, new ls_0(anh_2.IRON).b(aK_.gk));
        Item.a(259, aK_.dv, new LR().b(aK_.cE));
        Item.a(260, aK_.b_, new LA(4, 0.3f, false).b(aK_.fO));
        Item.a(261, aK_.aL, new ItemBow().b(aK_.I));
        Item.a(262, aK_.fp, new Item().b(aK_.eD).a(CreativeTabs.a));
        Item.a(263, aK_.dA, new LI().b(aK_.co));
        Item.a(264, aK_.dk, new Item().b(aK_.H).a(CreativeTabs.i));
        Item.a(265, aK_.ed, new Item().b(aK_.cA).a(CreativeTabs.i));
        Item.a(266, aK_.bM, new Item().b(aK_.ff).a(CreativeTabs.i));
        Item.a(267, aK_.dM, new LC(anh_2.IRON).b(aK_.eA));
        Item.a(268, aK_.cK, new LC(anh_2.WOOD).b(aK_.db));
        Item.a(269, aK_.bV, new LK(anh_2.WOOD).b(aK_.be));
        Item.a(270, aK_.fz, new LY(anh_2.WOOD).b(aK_.aX));
        Item.a(271, aK_.ea, new ls_0(anh_2.WOOD).b(aK_.df));
        Item.a(272, aK_.Y, new LC(anh_2.STONE).b(aK_.b5));
        Item.a(273, aK_.d0, new LK(anh_2.STONE).b(aK_.aR));
        Item.a(274, aK_.c4, new LY(anh_2.STONE).b(aK_.du));
        Item.a(275, aK_.aM, new ls_0(anh_2.STONE).b(aK_.fL));
        Item.a(276, aK_.bB, new LC(anh_2.EMERALD).b(aK_.bU));
        Item.a(277, aK_.aw, new LK(anh_2.EMERALD).b(aK_.bb));
        Item.a(278, aK_.d6, new LY(anh_2.EMERALD).b(aK_.f2));
        Item.a(279, aK_.c9, new ls_0(anh_2.EMERALD).b(aK_.cn));
        Item.a(280, aK_.cN, new Item().k().b(aK_.bj).a(CreativeTabs.i));
        Item.a(281, aK_.bI, new Item().b(aK_.aP).a(CreativeTabs.i));
        Item.a(282, aK_.ek, new LO(6).b(aK_.eO));
        Item.a(283, aK_.fw, new LC(anh_2.GOLD).b(aK_.g));
        Item.a(284, aK_.c_, new LK(anh_2.GOLD).b(aK_.c2));
        Item.a(285, aK_.fC, new LY(anh_2.GOLD).b(aK_.a3));
        Item.a(286, aK_.b7, new ls_0(anh_2.GOLD).b(aK_.bR));
        Item.a(287, aK_.aJ, new LX(Blocks.b7).b(aK_.x).a(CreativeTabs.i));
        Item.a(288, aK_.em, new Item().b(aK_.eC).a(CreativeTabs.i));
        Item.a(289, aK_.eF, new Item().b(aK_.b9).c(aK_.u).a(CreativeTabs.i));
        Item.a(290, aK_.X, new LZ(anh_2.WOOD).b(aK_.el));
        Item.a(291, aK_.gm, new LZ(anh_2.STONE).b(aK_.eK));
        Item.a(292, aK_.M, new LZ(anh_2.IRON).b(aK_.dR));
        Item.a(293, aK_.d1, new LZ(anh_2.EMERALD).b(aK_.dC));
        Item.a(294, aK_.aB, new LZ(anh_2.GOLD).b(aK_.fy));
        Item.a(295, aK_.e4, new LM(Blocks.ay, Blocks.al).b(aK_.cU));
        Item.a(296, aK_.eQ, new Item().b(aK_.ad).a(CreativeTabs.i));
        Item.a(297, aK_.dr, new LA(5, 0.6f, false).b(aK_.c3));
        Item.a(298, aK_.dO, new ItemArmor(ArmorMaterial.LEATHER, 0, 0).b(aK_.s));
        Item.a(299, aK_.by, new ItemArmor(ArmorMaterial.LEATHER, 0, 1).b(aK_.cO));
        Item.a(300, aK_.dy, new ItemArmor(ArmorMaterial.LEATHER, 0, 2).b(aK_.N));
        Item.a(301, aK_.am, new ItemArmor(ArmorMaterial.LEATHER, 0, 3).b(aK_.gc));
        Item.a(302, aK_.c0, new ItemArmor(ArmorMaterial.CHAIN, 1, 0).b(aK_.D));
        Item.a(303, aK_.d7, new ItemArmor(ArmorMaterial.CHAIN, 1, 1).b(aK_.B));
        Item.a(304, aK_.eu, new ItemArmor(ArmorMaterial.CHAIN, 1, 2).b(aK_.es));
        Item.a(305, aK_.bE, new ItemArmor(ArmorMaterial.CHAIN, 1, 3).b(aK_.b2));
        Item.a(306, aK_.e5, new ItemArmor(ArmorMaterial.IRON, 2, 0).b(aK_.P));
        Item.a(307, aK_.cT, new ItemArmor(ArmorMaterial.IRON, 2, 1).b(aK_.aE));
        Item.a(308, aK_.gb, new ItemArmor(ArmorMaterial.IRON, 2, 2).b(aK_.e));
        Item.a(309, aK_.eB, new ItemArmor(ArmorMaterial.IRON, 2, 3).b(aK_.gi));
        Item.a(310, aK_.fW, new ItemArmor(ArmorMaterial.DIAMOND, 3, 0).b(aK_.fx));
        Item.a(311, aK_.e9, new ItemArmor(ArmorMaterial.DIAMOND, 3, 1).b(aK_.cC));
        Item.a(312, aK_.b6, new ItemArmor(ArmorMaterial.DIAMOND, 3, 2).b(aK_.ck));
        Item.a(313, aK_.cR, new ItemArmor(ArmorMaterial.DIAMOND, 3, 3).b(aK_.cY));
        Item.a(314, aK_.d4, new ItemArmor(ArmorMaterial.GOLD, 4, 0).b(aK_.f4));
        Item.a(315, aK_.eH, new ItemArmor(ArmorMaterial.GOLD, 4, 1).b(aK_.aN));
        Item.a(316, aK_.aa, new ItemArmor(ArmorMaterial.GOLD, 4, 2).b(aK_.c8));
        Item.a(317, aK_.a2, new ItemArmor(ArmorMaterial.GOLD, 4, 3).b(aK_.gd));
        Item.a(318, aK_.bi, new Item().b(aK_.bX).a(CreativeTabs.i));
        Item.a(319, aK_.gg, new LA(3, 0.3f, true).b(aK_.cu));
        Item.a(320, aK_.ez, new LA(8, 0.8f, true).b(aK_.gh));
        Item.a(321, aK_.dZ, new LF(nk_2.class).b(aK_.dG));
        Item.a(322, aK_.b4, qe_1.a(aNB.a(new lh_0(4, 1.2f, false)), ari_0.f(Potion.regeneration), 5, 1, 1.0f).b(aK_.dt));
        Item.a(323, aK_.eh, new LH().b(aK_.cP));
        Item.a(324, aK_.A, new lg_0(Blocks.bh).b(aK_.bq));
        Item item = new lx_0(Blocks.air).b(aK_.fl).a(16);
        Item.a(325, aK_.cv, item);
        Item.a(326, aK_.bc, new lx_0(Blocks.flowing_water).b(aK_.eL).a(item));
        Item.a(327, aK_.eU, new lx_0(Blocks.flowing_lava).b(aK_.cB).a(item));
        Item.a(328, aK_.dh, new lz_0(anf_0.RIDEABLE).b(aK_.d5));
        Item.a(329, aK_.fZ, new LS().b(aK_.f3));
        Item.a(330, aK_.cd, new lg_0(Blocks.bb).b(aK_.ag));
        Item.a(331, aK_.cl, new L8().b(aK_.h).c(aK_.fX));
        Item.a(332, aK_.cx, new L_().b(aK_.bC));
        Item.a(333, aK_.bu, new lr_0().b(aK_.b3));
        Item.a(334, aK_.e8, new Item().b(aK_.ci).a(CreativeTabs.i));
        Item.a(335, aK_.c5, new L7().b(aK_.fA).a(item));
        Item.a(336, aK_.cj, new Item().b(aK_.da).a(CreativeTabs.i));
        Item.a(337, aK_.f8, new Item().b(aK_.eP).a(CreativeTabs.i));
        Item.a(338, aK_.cc, new LX(Blocks.P).b(aK_.Q).a(CreativeTabs.i));
        Item.a(339, aK_.dU, new Item().b(aK_.aY).a(CreativeTabs.b));
        Item.a(340, aK_.fi, new lu_0().b(aK_.cS).a(CreativeTabs.b));
        Item.a(341, aK_.ca, new Item().b(aK_.cJ).a(CreativeTabs.b));
        Item.a(342, aK_.cz, new lz_0(anf_0.CHEST).b(aK_.ba));
        Item.a(343, aK_.eV, new lz_0(anf_0.FURNACE).b(aK_.aV));
        Item.a(344, aK_.fk, new lo_0().b(aK_.eq));
        Item.a(345, aK_.n, new Item().b(aK_.f).a(CreativeTabs.c));
        Item.a(346, aK_.aT, new ItemFishingRod().b(aK_.dm));
        Item.a(347, aK_.i, new Item().b(aK_.bp).a(CreativeTabs.c));
        Item.a(348, aK_.at, new Item().b(aK_.dK).c(aK_.bd).a(CreativeTabs.i));
        Item.a(349, aK_.bo, new LG(false).b(aK_.eT).a(true));
        Item.a(350, aK_.fh, new LG(true).b(aK_.e2).a(true));
        Item.a(351, aK_.bO, new lc_0().b(aK_.ei));
        Item.a(352, aK_.fP, new Item().b(aK_.bJ).k().a(CreativeTabs.b));
        Item.a(353, aK_.cq, new Item().b(aK_.T).c(aK_.aI).a(CreativeTabs.i));
        Item.a(354, aK_.bs, new LX(Blocks.aX).a(1).b(aK_.dY).a(CreativeTabs.q));
        Item.a(355, aK_.J, new KK().a(1).b(aK_.ay));
        Item.a(356, aK_.ev, new LX(Blocks.aP).b(aK_.ds).a(CreativeTabs.j));
        Item.a(357, aK_.dX, new LA(2, 0.1f, false).b(aK_.en));
        Item.a(358, aK_.eb, new ItemMap().b(aK_.au));
        Item.a(359, aK_.j, new ItemShears().b(aK_.eR));
        Item.a(360, aK_.dg, new LA(2, 0.3f, false).b(aK_.eg));
        Item.a(361, aK_.eI, new LM(Blocks.aL, Blocks.al).b(aK_.cL));
        Item.a(362, aK_.R, new LM(Blocks.b9, Blocks.al).b(aK_.eG));
        Item.a(363, aK_.f1, new LA(3, 0.3f, true).b(aK_.ge));
        Item.a(364, aK_.dP, new LA(8, 0.8f, true).b(aK_.fe));
        Item.a(365, aK_.G, qe_1.a(new LA(2, 0.3f, true), ari_0.f(Potion.hunger), 30, 0, 0.3f).b(aK_.fv));
        Item.a(366, aK_.fs, new LA(6, 0.6f, true).b(aK_.dI));
        Item.a(367, aK_.t, qe_1.a(new LA(4, 0.1f, true), ari_0.f(Potion.hunger), 30, 0, 0.8f).b(aK_.bK));
        Item.a(368, aK_.d2, new LL().b(aK_.cg));
        Item.a(369, aK_.br, new Item().b(aK_.bt).a(CreativeTabs.i).k());
        Item.a(370, aK_.a4, new Item().b(aK_.aF).c(aK_.e7).a(CreativeTabs.h));
        Item.a(371, aK_.ej, new Item().b(aK_.bx).a(CreativeTabs.i));
        Item.a(372, aK_.et, new LM(Blocks.a2, Blocks.s).b(aK_.fS).c(aK_.dV));
        Item.a(373, aK_.dd, new ItemPotion().b(aK_.aC));
        Item.a(374, aK_.cy, new LB().b(aK_.ai));
        Item.a(375, aK_.d8, qe_1.a(new LA(2, 0.8f, false), ari_0.f(Potion.poison), 5, 0, 1.0f).b(aK_.bP).c(aK_.bQ));
        Item.a(376, aK_.bz, new Item().b(aK_.dH).c(aK_.d9).a(CreativeTabs.h));
        Item.a(377, aK_.fV, new Item().b(aK_.fU).c(aK_.aD).a(CreativeTabs.h));
        Item.a(378, aK_.eX, new Item().b(aK_.O).c(aK_.fd).a(CreativeTabs.h));
        Item.a(379, aK_.aq, new LX(Blocks.B).b(aK_.fR).a(CreativeTabs.h));
        Item.a(380, aK_.a_, new LX(Blocks.au).b(aK_.cZ).a(CreativeTabs.h));
        Item.a(381, aK_.gl, new L2().b(aK_.a6));
        Item.a(382, aK_.fa, new Item().b(aK_.ar).c(aK_.f9).a(CreativeTabs.h));
        Item.a(383, aK_.cM, new lt_0().b(aK_.bF));
        Item.a(384, aK_.fr, new LU().b(aK_.Z));
        Item.a(385, aK_.fb, new L4().b(aK_.eJ));
        Item.a(386, aK_.w, new lb_0().b(aK_.cw).a(CreativeTabs.b));
        Item.a(387, aK_.bL, new Ln().b(aK_.eM).a(16));
        Item.a(388, aK_.ch, new Item().b(aK_.cG).a(CreativeTabs.i));
        Item.a(389, aK_.fm, new LF(no_2.class).b(aK_.dQ));
        Item.a(390, aK_.a7, new LX(Blocks.N).b(aK_.a5).a(CreativeTabs.l));
        Item.a(391, aK_.dT, new LE(3, 0.6f, Blocks.aY, Blocks.al).b(aK_.dq));
        Item.a(392, aK_.bY, new LE(1, 0.3f, Blocks.b8, Blocks.al).b(aK_.fF));
        Item.a(393, aK_.aH, new LA(5, 0.6f, false).b(aK_.m));
        Item.a(394, aK_.bh, qe_1.a(new LA(2, 0.3f, false), ari_0.f(Potion.poison), 5, 0, 0.6f).b(aK_.b8));
        Item.a(395, aK_.eZ, new ItemEmptyMap().b(aK_.fM));
        Item.a(396, aK_.f7, new LA(6, 1.2f, false).b(aK_.cr).c(aK_.dz).a(CreativeTabs.h));
        Item.a(397, aK_.er, new L0().b(aK_.eW));
        Item.a(398, aK_.fu, new LQ().b(aK_.r));
        Item.a(399, aK_.aj, new lm_0().b(aK_.q).a(CreativeTabs.i));
        Item.a(400, aK_.ee, new LA(8, 0.3f, false).b(aK_.aK).a(CreativeTabs.q));
        Item.a(401, aK_.aU, new L5().b(aK_.az));
        Item.a(402, aK_.a9, new LD().b(aK_.a8).a(CreativeTabs.b));
        Item.a(403, aK_.dN, new ItemEnchantedBook().a(1).b(aK_.ab));
        Item.a(404, aK_.ak, new LX(Blocks.bR).b(aK_.fB).a(CreativeTabs.j));
        Item.a(405, aK_.L, new Item().b(aK_.e1).a(CreativeTabs.i));
        Item.a(406, aK_.dj, new Item().b(aK_.ep).a(CreativeTabs.i));
        Item.a(407, aK_.dE, new lz_0(anf_0.TNT).b(aK_.c));
        Item.a(408, aK_.y, new lz_0(anf_0.HOPPER).b(aK_.dS));
        Item.a(409, aK_.E, new Item().b(aK_.cX).a(CreativeTabs.i));
        Item.a(410, aK_.l, new Item().b(aK_.V).a(CreativeTabs.i));
        Item.a(411, aK_.aA, new LA(3, 0.3f, true).b(aK_.f0));
        Item.a(412, aK_.c7, new LA(5, 0.6f, true).b(aK_.fQ));
        Item.a(413, aK_.fY, new LO(10).b(aK_.a0));
        Item.a(414, aK_.z, new Item().b(aK_.fJ).c(aK_.e_).a(CreativeTabs.h));
        Item.a(415, aK_.eY, new Item().b(aK_.cI).a(CreativeTabs.i));
        Item.a(416, aK_.dp, new ItemArmorStand().b(aK_.as).a(16));
        Item.a(417, aK_.dJ, new Item().b(aK_.dn).a(1).a(CreativeTabs.b));
        Item.a(418, aK_.b1, new Item().b(aK_.fK).a(1).a(CreativeTabs.b));
        Item.a(419, aK_.dF, new Item().b(aK_.fG).a(1).a(CreativeTabs.b));
        Item.a(420, aK_.dD, new LP().b(aK_.a));
        Item.a(421, aK_.eE, new ld_0().b(aK_.fH));
        Item.a(422, aK_.bn, new lz_0(anf_0.COMMAND_BLOCK).b(aK_.dl).a((CreativeTabs)null));
        Item.a(423, aK_.f_, new LA(2, 0.3f, true).b(aK_.aQ));
        Item.a(424, aK_.bl, new LA(6, 0.8f, true).b(aK_.e6));
        Item.a(425, aK_.gf, (Item)aiz_1.a(new K1(), aK_.aW));
        Item.a(427, aK_.bH, new lg_0(Blocks.o).b(aK_.aZ));
        Item.a(428, aK_.b0, new lg_0(Blocks.aC).b(aK_.ce));
        Item.a(429, aK_.ah, new lg_0(Blocks.ax).b(aK_.eN));
        Item.a(430, aK_.de, new lg_0(Blocks.aV).b(aK_.bD));
        Item.a(431, aK_.ga, new lg_0(Blocks.az).b(aK_.bN));
        Item.a(2256, aK_.k, new li_0(aK_.av).b(aK_.al));
        Item.a(2257, aK_.f6, new li_0(aK_.b).b(aK_.fc));
        Item.a(2258, aK_.fo, new li_0(aK_.o).b(aK_.cp));
        Item.a(2259, aK_.fT, new li_0(aK_.dw).b(aK_.cD));
        Item.a(2260, aK_.bk, new li_0(aK_.cF).b(aK_.dW));
        Item.a(2261, aK_.aS, new li_0(aK_.ao).b(aK_.cb));
        Item.a(2262, aK_.ew, new li_0(aK_.ex).b(aK_.S));
        Item.a(2263, aK_.d, new li_0(aK_.bm).b(aK_.ac));
        Item.a(2264, aK_.dc, new li_0(aK_.bT).b(aK_.ax));
        Item.a(2265, aK_.bg, new li_0(aK_.cH).b(aK_.U));
        Item.a(2266, aK_.af, new li_0(aK_.v).b(aK_.ae));
        Item.a(2267, aK_.eS, new li_0(aK_.ec).b(aK_.ap));
    }

    private static void a(int n, ResourceLocation resourceLocation, Item item) {
        aLP.a(k, n, resourceLocation, item);
    }

    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 0;
    }

    public boolean j() {
        return true;
    }

    public Item b(String string) {
        this.f = string;
        return this;
    }

    private static String lambda$registerItems$14(ItemStack itemStack) {
        return ayv_0.a(act_2.c(itemStack)).b();
    }

    private static String lambda$registerItems$10(ItemStack itemStack) {
        return aj4.a(atA.RED, act_2.c(itemStack)).b();
    }

    public void a(ItemStack itemStack, World world, Entity entity, int n, boolean bl) {
    }

    public static Item a(Block block) {
        return (Item)MapInvoker.c(b, block);
    }

    public String d() {
        return aL0.a(aL0.a(new StringBuilder(), aK_.ef), this.f).toString();
    }

    public ry_1 a(EntityLivingBase entityLivingBase, ItemStack itemStack, int n) {
        return null;
    }

    private static String lambda$registerItems$2(ItemStack itemStack) {
        return aER.a(act_2.c(itemStack)).b();
    }

    public static int b(Item item) {
        return 0;
    }

    public boolean n() {
        return false;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String lambda$registerItems$13(ItemStack itemStack) {
        return ya_1.a(act_2.c(itemStack)).b();
    }

    public String j(ItemStack itemStack) {
        this.a(itemStack);
        return aK_.bw;
    }

    public int a(ItemStack itemStack, int n) {
        return 0xFFFFFF;
    }

    public boolean a(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        return false;
    }

    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack;
    }

    public static Item d(int n) {
        return (Item)aLP.a(k, n);
    }

    public void a(NBTTagCompound nBTTagCompound) {
    }

    private static String lambda$registerItems$3(ItemStack itemStack) {
        return aER.a(act_2.c(itemStack)).b();
    }

    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack;
    }

    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
    }

    private static String lambda$registerItems$9(ItemStack itemStack) {
        return aj4.a(atA.YELLOW, act_2.c(itemStack)).b();
    }

    public boolean p() {
        return this.l > 0 && !this.e;
    }

    private static String lambda$registerItems$12(ItemStack itemStack) {
        return ahu_0.a(act_2.c(itemStack)).b();
    }

    private static String lambda$registerItems$16(ItemStack itemStack) {
        return SX.a(act_2.c(itemStack)).b();
    }

    public boolean h(ItemStack itemStack) {
        return act_2.n(itemStack);
    }

    public String i(ItemStack itemStack) {
        return this.a;
    }

    public Item a(CreativeTabs creativeTabs) {
        this.d = creativeTabs;
        return this;
    }

    public Multimap<String, AttributeModifier> e() {
        return zi_2.a();
    }

    protected static void a(Block block, Item item) {
        Item.a(BlocksInvoker.v(block), (ResourceLocation)a82.b(Block.m, block), item);
        MapInvoker.c(b, block, item);
    }

    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
    }

    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        return false;
    }

    public boolean f(ItemStack itemStack) {
        return this.i(itemStack) != null;
    }

    public String a(ItemStack itemStack) {
        return aL0.a(aL0.a(new StringBuilder(), aK_.dx), this.f).toString();
    }

    private static String lambda$registerItems$6(ItemStack itemStack) {
        return aER.a(act_2.c(itemStack) + 4).b();
    }

    private static String lambda$registerItems$15(ItemStack itemStack) {
        return mr_0.a(act_2.c(itemStack)).b();
    }

    public arq_0 d(ItemStack itemStack) {
        return act_2.n(itemStack) ? arq_0.RARE : arq_0.COMMON;
    }

    public boolean o() {
        return false;
    }

    private static String lambda$registerItems$7(ItemStack itemStack) {
        return (act_2.c(itemStack) & 1) == 1 ? aK_.fg : aK_.ft;
    }

    private static String lambda$registerItems$5(ItemStack itemStack) {
        return aER.a(act_2.c(itemStack)).b();
    }

    public boolean b(ItemStack itemStack) {
        return this.m() == 1 && this.p();
    }
}

