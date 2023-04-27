/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import deobf.TimerUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.We
 */
public class we_0 {
    private air_1 b;
    private air_1 f;
    private air_1 p;
    private air_1 c;
    private air_1 k;
    private Item o = null;
    private air_1 h;
    private air_1 d;
    private air_1 g = new air_1(this, axv_0.k, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.H, Items.iron_sword, 3, new Item[]{this.o, Items.bone, this.o, this.o, Items.iron_sword, this.o, this.o, Items.rotten_flesh, this.o}), new ajn_0(this, axv_0.aa, Items.enchanted_book, 3, new Item[]{Items.flint, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.iron_sword}), new ajn_0(this, axv_0.al, Items.enchanted_book, 3, new Item[]{Items.flint, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.bone}), new ajn_0(this, axv_0.ao, Items.diamond_sword, 1, new Item[]{this.o, Items.blaze_powder, this.o, this.o, Items.diamond_sword, this.o, this.a(Blocks.O), Items.blaze_powder, this.a(Blocks.O)})}));
    private air_1 m;
    private List<air_1> e;
    private Minecraft i;
    private air_1 j;
    private air_1 n;
    private air_1 a;
    private air_1 q;
    private air_1 l;

    static Minecraft a(we_0 we_02) {
        return we_02.i;
    }

    public List<ajn_0> a() {
        TimerUtil.e();
        ArrayList<ajn_0> arrayList = new ArrayList<ajn_0>();
        Iterator iterator = ListInvoker.iterator(this.e);
        if (dz_0.c(iterator)) {
            air_1 air_12 = (air_1)dz_0.b(iterator);
            ListInvoker.addAll(arrayList, air_12.b());
        }
        return arrayList;
    }

    public List<ajn_0> e() {
        ajn_0 ajn_02;
        air_1 air_12;
        Iterator iterator;
        TimerUtil.e();
        ArrayList<ajn_0> arrayList = new ArrayList<ajn_0>();
        Iterator iterator2 = ListInvoker.iterator(this.e);
        if (dz_0.c(iterator2) && dz_0.c(iterator = ListInvoker.iterator((air_12 = (air_1)dz_0.b(iterator2)).b())) && a0k.h(ajn_02 = (ajn_0)dz_0.b(iterator))) {
            ListInvoker.add(arrayList, ajn_02);
        }
        return arrayList;
    }

    private static boolean lambda$getCategoryByName$0(String string, air_1 air_12) {
        return StringInvoker.d(aUT.a(air_12), string);
    }

    public air_1 a(String string) {
        return (air_1)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.e), arg_0 -> we_0.lambda$getCategoryByName$0(string, arg_0))), null);
    }

    public List<air_1> b() {
        return this.e;
    }

    public we_0(Minecraft minecraft) {
        this.c = new air_1(this, axv_0.f, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aC, Items.leather, 3, new Item[]{Items.stick, Items.leather, Items.stick, Items.stick, Items.leather, Items.stick, Items.stick, Items.leather, Items.stick}), new ajn_0(this, axv_0.as, Items.enchanted_book, 3, new Item[]{this.o, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.iron_ingot}), new ajn_0(this, axv_0.ax, Items.enchanted_book, 3, new Item[]{this.o, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.arrow}), new ajn_0(this, axv_0.E, Items.diamond_chestplate, 1, new Item[]{this.o, Items.magma_cream, this.o, this.o, Items.diamond_chestplate, this.o, this.a(Blocks.O), this.a(Blocks.J), this.a(Blocks.O)})}));
        this.b = new air_1(this, axv_0.af, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.W, Items.glowstone_dust, 3, new Item[]{Items.redstone, Items.redstone, Items.redstone, Items.redstone, Items.flint_and_steel, Items.redstone, Items.redstone, Items.redstone, Items.redstone}), new ajn_0(this, axv_0.ad, Items.nether_wart, 3, new Item[]{this.o, Items.wheat_seeds, this.o, Items.wheat_seeds, Items.fermented_spider_eye, Items.wheat_seeds, this.o, Items.wheat_seeds, this.o}), new ajn_0(this, axv_0.S, en_2.a(ari_0.f(Potion.regeneration)), 3, new Item[]{this.o, Items.emerald, this.o, Items.gold_ingot, Items.melon, Items.gold_ingot, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.e, Items.blaze_rod, 1, new Item[]{this.a(Blocks.am), Items.lava_bucket, this.a(Blocks.am), this.a(Blocks.am), Items.fireworks, this.a(Blocks.am), this.a(Blocks.am), Items.lava_bucket, this.a(Blocks.am)})}));
        this.j = new air_1(this, axv_0.ab, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.G, Items.cooked_beef, 3, new Item[]{Items.beef, Items.beef, Items.beef, Items.beef, Items.coal, Items.beef, Items.beef, Items.beef, Items.beef}), new ajn_0(this, axv_0.I, en_2.a(ari_0.f(Potion.resistance)), 3, new Item[]{this.o, Items.slime_ball, this.o, this.o, this.a(Blocks.bq), this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.g, Items.leather_chestplate, 3, new Item[]{this.o, this.a(Blocks.an), this.o, this.o, this.a(Blocks.a9), this.o, this.o, Items.leather_chestplate, this.o}), new ajn_0(this, axv_0.N, Items.diamond_boots, 1, new Item[]{Items.feather, Items.ender_pearl, Items.feather, Items.feather, Items.diamond_boots, Items.feather, Items.feather, Items.water_bucket, Items.feather})}));
        this.h = new air_1(this, axv_0.Y, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.Z, Items.iron_ingot, 3, new Item[]{this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), Items.coal, this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), this.a(Blocks.iron_ore)}), new ajn_0(this, axv_0.w, this.a(Blocks.O), 3, new Item[]{this.o, this.o, this.o, this.o, Items.water_bucket, this.o, this.o, Items.lava_bucket, this.o}), new ajn_0(this, axv_0.aE, Items.diamond_helmet, 3, new Item[]{Items.diamond, Items.iron_ingot, Items.diamond, Items.diamond, this.a(Blocks.bT), Items.diamond, this.o, this.o, this.o}), new ajn_0(this, axv_0.aw, Items.diamond_pickaxe, 1, new Item[]{this.a(Blocks.iron_ore), this.a(Blocks.gold_ore), this.a(Blocks.iron_ore), this.a(Blocks.ba), Items.stick, this.a(Blocks.ba), this.o, Items.stick, this.o})}));
        this.q = new air_1(this, axv_0.ar, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aH, Items.experience_bottle, 3, new Item[]{this.o, this.a(Blocks.bT), this.o, this.a(Blocks.bT), Items.glass_bottle, this.a(Blocks.bT), this.o, this.a(Blocks.bT), this.o}), new ajn_0(this, axv_0.ac, this.a(Blocks.J), 3, new Item[]{Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, this.o, this.a(Blocks.co), this.o, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot}), new ajn_0(this, axv_0.aS, this.a(Blocks.bw), 3, new Item[]{this.o, this.a(Blocks.at), this.o, this.a(Blocks.O), Items.diamond, this.a(Blocks.O), this.a(Blocks.O), Items.experience_bottle, this.a(Blocks.O)}), new ajn_0(this, axv_0.t, Items.enchanted_book, 1, new Item[]{Items.ender_pearl, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.fire_charge})}));
        this.d = new air_1(this, axv_0.av, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aJ, Items.apple, 3, new Item[]{this.o, this.o, this.o, this.o, Items.dye, this.o, this.o, Items.apple, this.o}), new ajn_0(this, axv_0.aM, this.a(Blocks.aQ), 3, new Item[]{Items.dye, Items.wheat_seeds, Items.dye, Items.wheat_seeds, Items.apple, Items.wheat_seeds, Items.dye, Items.wheat_seeds, Items.dye}), new ajn_0(this, axv_0.v, en_2.a(ari_0.f(Potion.absorption)), 3, new Item[]{Items.gold_ingot, this.a(Blocks.bT), Items.gold_ingot, this.o, Items.record_13, this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.aF, Items.golden_apple, 1, new Item[]{this.o, Items.gold_ingot, this.o, Items.gold_ingot, Items.apple, Items.gold_ingot, this.o, Items.gold_ingot, this.o})}));
        this.l = new air_1(this, axv_0.r, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.ay, Items.skull, 3, new Item[]{Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.skull, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot, Items.gold_ingot}), new ajn_0(this, axv_0.am, this.a(Blocks.R), 3, new Item[]{this.a(Blocks.R), this.a(Blocks.R), this.a(Blocks.R), this.a(Blocks.R), Items.skull, this.a(Blocks.R), this.a(Blocks.R), this.a(Blocks.R), this.a(Blocks.R)}), new ajn_0(this, axv_0.b, en_2.a(ari_0.f(Potion.healthBoost)), 3, new Item[]{this.o, this.o, this.o, Items.skull, Items.speckled_melon, Items.skull, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.u, Items.bow, 1, new Item[]{this.o, Items.blaze_rod, this.o, Items.skull, Items.bow, Items.skull, this.o, Items.lava_bucket, this.o})}));
        this.n = new air_1(this, axv_0.D, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aR, Items.arrow, 3, new Item[]{Items.flint, Items.flint, Items.flint, Items.stick, Items.stick, Items.stick, Items.feather, Items.feather, Items.feather}), new ajn_0(this, axv_0.m, Items.saddle, 3, new Item[]{Items.leather, Items.leather, Items.leather, Items.string, Items.leather, Items.string, Items.iron_ingot, this.o, Items.iron_ingot}), new ajn_0(this, axv_0.ag, en_2.a(ari_0.f(Potion.moveSpeed)), 3, new Item[]{this.o, Items.dye, this.o, this.o, Items.sugar, this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.l, Items.spawn_egg, 1, new Item[]{Items.leather, Items.leather, Items.leather, Items.bone, Items.experience_bottle, Items.bone, Items.leather, Items.leather, Items.leather})}));
        this.k = new air_1(this, axv_0.aI, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aN, this.a(Blocks.ab), 3, new Item[]{this.a(Blocks.cobblestone), this.a(Blocks.cobblestone), this.a(Blocks.cobblestone), this.a(Blocks.cobblestone), this.a(Blocks.O), this.a(Blocks.cobblestone), this.a(Blocks.cobblestone), this.a(Blocks.cobblestone), this.a(Blocks.cobblestone)}), new ajn_0(this, axv_0.s, Items.iron_pickaxe, 3, new Item[]{this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), this.a(Blocks.iron_ore), Items.coal, Items.stick, Items.coal, this.o, Items.stick, this.o}), new ajn_0(this, axv_0.n, Items.iron_axe, 3, new Item[]{Items.iron_ingot, Items.iron_ingot, Items.flint, Items.iron_ingot, Items.stick, this.o, this.o, Items.stick, this.o}), new ajn_0(this, axv_0.J, Items.enchanted_book, 1, new Item[]{Items.experience_bottle, Items.experience_bottle, Items.experience_bottle, Items.iron_pickaxe, this.a(Blocks.bw), Items.iron_axe, this.a(Blocks.at), this.a(Blocks.at), this.a(Blocks.at)})}));
        TimerUtil.e();
        this.m = new air_1(this, axv_0.B, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.au, Items.iron_helmet, 1, new Item[]{Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, Items.iron_ingot, this.a(Blocks.br), Items.iron_ingot, this.o, this.o, this.o}), new ajn_0(this, axv_0.p, Items.iron_sword, 1, new Item[]{this.o, this.o, this.o, this.o, this.o, this.o, this.o, this.o, this.o}), new ajn_0(this, axv_0.aD, Items.bow, 1, new Item[]{this.o, this.a(Blocks.br), Items.string, this.a(Blocks.br), this.o, Items.string, this.o, this.a(Blocks.br), Items.string}), new ajn_0(this, axv_0.d, Items.compass, 1, new Item[]{Items.redstone, this.a(Blocks.br), Items.redstone, Items.redstone, Items.compass, Items.redstone, Items.redstone, Items.redstone, Items.redstone})}));
        this.p = new air_1(this, axv_0.z, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aA, Items.gold_ingot, 3, new Item[]{this.a(Blocks.gold_ore), this.a(Blocks.gold_ore), this.a(Blocks.gold_ore), this.a(Blocks.gold_ore), Items.coal, this.a(Blocks.gold_ore), this.a(Blocks.gold_ore), this.a(Blocks.gold_ore), this.a(Blocks.gold_ore)}), new ajn_0(this, axv_0.aQ, Items.reeds, 3, new Item[]{this.o, this.a(Blocks.sapling), this.o, Items.wheat_seeds, Items.sugar, Items.wheat_seeds, this.o, this.o, this.o}), new ajn_0(this, axv_0.ak, this.a(Blocks.R), 1, new Item[]{Items.stick, Items.leather, Items.stick, Items.stick, this.a(Blocks.R), Items.stick, Items.stick, Items.leather, Items.stick}), new ajn_0(this, axv_0.aG, Items.diamond_chestplate, 1, new Item[]{Items.diamond_helmet, Items.diamond_chestplate, Items.diamond_leggings, Items.diamond_leggings, Items.diamond_boots, this.o, this.o, this.o, this.o})}));
        this.a = new air_1(this, axv_0.at, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.j, Items.shears, 3, new Item[]{this.a(Blocks.bP), this.a(Blocks.bP), this.a(Blocks.bP), this.a(Blocks.bP), Items.shears, this.a(Blocks.bP), this.a(Blocks.bP), this.a(Blocks.bP), this.a(Blocks.bP)}), new ajn_0(this, axv_0.x, Items.fishing_rod, 3, new Item[]{this.o, this.o, Items.bone, this.o, Items.bone, Items.string, Items.bone, this.o, Items.string}), new ajn_0(this, axv_0.L, Items.enchanted_book, 1, new Item[]{Items.feather, this.o, this.o, this.o, Items.paper, Items.paper, this.o, Items.paper, Items.record_13}), new ajn_0(this, axv_0.ap, Items.map, 1, new Item[]{this.o, this.a(Blocks.b_), this.o, this.a(Blocks.b_), this.a(Blocks.R), this.a(Blocks.b_), Items.string, this.o, Items.string}), new ajn_0(this, axv_0.q, this.o, 3, new Item[]{this.o, this.o, this.o, this.o, this.o, this.o, this.o, this.o, this.o})}));
        this.f = new air_1(this, axv_0.K, a7r_0.a(new ajn_0[]{new ajn_0(this, axv_0.aO, Items.bow, 1, new Item[]{Items.feather, Items.diamond, Items.feather, Items.feather, Items.bow, Items.feather, Items.feather, Items.ender_pearl, Items.feather}), new ajn_0(this, axv_0.c, en_2.a(ari_0.f(Potion.harm)), 1, new Item[]{this.o, Items.skull, this.o, this.a(Blocks.A), Items.glass_bottle, this.a(Blocks.A), this.o, Items.dye, this.o}), new ajn_0(this, axv_0.O, Items.diamond_helmet, 1, new Item[]{Items.diamond, Items.diamond, Items.diamond, Items.diamond, Items.skull, Items.diamond, Items.emerald, Items.golden_carrot, Items.emerald}), new ajn_0(this, axv_0.ah, Items.diamond_leggings, 1, new Item[]{this.a(Blocks.ba), Items.water_bucket, this.a(Blocks.ba), Items.diamond, Items.diamond_leggings, Items.diamond, this.a(Blocks.an), this.o, this.a(Blocks.an)}), new ajn_0(this, axv_0.A, Items.enchanted_book, 1, new Item[]{this.o, Items.magma_cream, this.o, Items.diamond_sword, Items.writable_book, Items.bow, Items.experience_bottle, Items.experience_bottle, Items.experience_bottle}), new ajn_0(this, axv_0.C, Items.diamond_axe, 1, new Item[]{Items.diamond, this.a(Blocks.Y), Items.fire_charge, Items.diamond, Items.stick, this.o, this.o, Items.stick, this.o}), new ajn_0(this, axv_0.V, Items.iron_sword, 1, new Item[]{Items.feather, this.a(Blocks.co), Items.feather, Items.feather, this.a(Blocks.co), Items.feather, Items.feather, Items.blaze_rod, Items.feather}), new ajn_0(this, axv_0.T, Items.iron_hoe, 1, new Item[]{this.o, Items.skull, Items.skull, this.o, Items.bone, Items.clock, Items.bone, this.o, this.o}), new ajn_0(this, axv_0.y, this.a(Blocks.R), 1, new Item[]{this.a(Blocks.planks), this.a(Blocks.planks), this.a(Blocks.planks), this.a(Blocks.planks), Items.skull, this.a(Blocks.planks), this.a(Blocks.planks), this.a(Blocks.planks), this.a(Blocks.planks)}), new ajn_0(this, axv_0.P, Items.golden_carrot, 1, new Item[]{Items.carrot, Items.carrot, Items.carrot, Items.carrot, Items.golden_apple, Items.carrot, Items.carrot, Items.carrot, Items.carrot}), new ajn_0(this, axv_0.i, Items.experience_bottle, 1, new Item[]{this.a(Blocks.bP), this.a(Blocks.bw), this.a(Blocks.bP), this.a(Blocks.bs), Items.glass_bottle, this.a(Blocks.bs), this.a(Blocks.bP), this.a(Blocks.bT), this.a(Blocks.bP)}), new ajn_0(this, axv_0.ae, this.a(Blocks.g), 1, new Item[]{this.a(Blocks.O), this.a(Blocks.a8), this.a(Blocks.O), this.a(Blocks.a8), Items.skull, this.a(Blocks.a8), this.a(Blocks.O), this.a(Blocks.a8), this.a(Blocks.O)}), new ajn_0(this, axv_0.F, en_2.a(ari_0.f(Potion.resistance)), 1, new Item[]{this.o, Items.emerald, this.o, this.o, Items.skull, this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.Q, this.a(Blocks.aK), 1, new Item[]{this.a(Blocks.L), Items.skull, this.a(Blocks.L), this.a(Blocks.L), this.a(Blocks.a5), this.a(Blocks.L), this.a(Blocks.L), this.a(Blocks.L), this.a(Blocks.L)}), new ajn_0(this, axv_0.R, Items.fishing_rod, 1, new Item[]{this.o, Items.fishing_rod, this.o, this.a(Blocks.an), Items.compass, this.a(Blocks.an), this.o, Items.water_bucket, this.o}), new ajn_0(this, axv_0.X, Items.spawn_egg, 1, new Item[]{Items.skull, Items.saddle, this.o, Items.bone, Items.bone, Items.bone, Items.bone, this.o, Items.bone}), new ajn_0(this, axv_0.o, Items.diamond_sword, 1, new Item[]{this.a(Blocks.s), Items.fire_charge, this.a(Blocks.s), this.a(Blocks.s), this.a(Blocks.Y), this.a(Blocks.s), this.a(Blocks.s), Items.diamond_sword, this.a(Blocks.s)}), new ajn_0(this, axv_0.U, en_2.a(ari_0.f(Potion.weakness)), 1, new Item[]{this.o, Items.skull, this.o, this.o, Items.milk_bucket, this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.h, Items.diamond_boots, 1, new Item[]{this.o, Items.fish, this.o, Items.potionitem, Items.diamond_boots, Items.potionitem, this.o, Items.fishing_rod, this.o}), new ajn_0(this, axv_0.an, en_2.a(ari_0.f(Potion.moveSpeed)), 1, new Item[]{this.o, Items.skull, this.o, this.o, Items.nether_wart, this.o, this.o, Items.glass_bottle, this.o}), new ajn_0(this, axv_0.aK, Items.diamond_pickaxe, 1, new Item[]{Items.experience_bottle, Items.iron_sword, Items.experience_bottle, Items.experience_bottle, Items.diamond_sword, Items.experience_bottle, this.a(Blocks.at), this.a(Blocks.at), this.a(Blocks.at)}), new ajn_0(this, axv_0.aq, Items.glowstone_dust, 1, new Item[]{Items.blaze_powder, Items.skull, Items.blaze_powder, this.a(Blocks.bs), Items.ghast_tear, this.a(Blocks.bs), this.a(Blocks.bs), this.a(Blocks.bs), this.a(Blocks.bs)}), new ajn_0(this, axv_0.a, Items.diamond_sword, 1, new Item[]{this.a(Blocks.bT), Items.diamond, this.a(Blocks.bT), this.a(Blocks.bT), Items.diamond_sword, this.a(Blocks.bT), this.a(Blocks.bT), Items.experience_bottle, this.a(Blocks.bT)}), new ajn_0(this, axv_0.aB, Items.bow, 1, new Item[]{this.o, Items.clock, this.o, Items.blaze_powder, Items.bow, Items.blaze_powder, Items.spider_eye, Items.slime_ball, Items.spider_eye}), new ajn_0(this, axv_0.M, Items.nether_star, 1, new Item[]{Items.experience_bottle, this.a(Blocks.co), Items.experience_bottle, this.a(Blocks.D), this.a(Blocks.ar), this.a(Blocks.D), Items.experience_bottle, this.a(Blocks.co), Items.experience_bottle}), new ajn_0(this, axv_0.aL, Items.diamond_boots, 1, new Item[]{Items.diamond, Items.skull, Items.diamond, Items.blaze_powder, Items.diamond_boots, Items.blaze_powder, Items.feather, this.o, Items.feather}), new ajn_0(this, axv_0.az, Items.diamond_chestplate, 1, new Item[]{Items.blaze_rod, Items.diamond_chestplate, Items.blaze_rod, this.a(Blocks.co), en_2.a(ari_0.f(Potion.heal)), this.a(Blocks.co), this.o, this.o, this.o}), new ajn_0(this, axv_0.aP, Items.flower_pot, 1, new Item[]{this.o, this.a(Blocks.M), this.o, this.a(Blocks.M), Items.firework_charge, this.a(Blocks.M), this.o, this.a(Blocks.M), this.o}), new ajn_0(this, axv_0.ai, Items.snowball, 1, new Item[]{this.a(Blocks.co), Items.blaze_powder, this.a(Blocks.co), Items.diamond, Items.clock, Items.diamond, this.a(Blocks.co), Items.blaze_powder, this.a(Blocks.co)}), new ajn_0(this, axv_0.aj, Items.diamond_leggings, 1, new Item[]{this.a(Blocks.by), this.a(Blocks.by), this.a(Blocks.by), this.a(Blocks.by), Items.diamond, this.a(Blocks.by), Items.blaze_powder, this.o, Items.blaze_powder})}));
        this.i = minecraft;
        this.e = a7r_0.a(new air_1[]{this.g, this.c, this.b, this.j, this.h, this.q, this.d, this.l, this.n, this.k, this.m, this.p, this.a, this.f});
        ListInvoker.b(new ListInvoker[4]);
    }

    public void c() {
        air_1 air_12;
        Iterator iterator;
        TimerUtil.e();
        Iterator iterator2 = ListInvoker.iterator(this.e);
        if (dz_0.c(iterator2) && dz_0.c(iterator = ListInvoker.iterator((air_12 = (air_1)dz_0.b(iterator2)).b()))) {
            ajn_0 ajn_02 = (ajn_0)dz_0.b(iterator);
            a0k.a(ajn_02, 0);
        }
    }

    public List<ajn_0> d() {
        ajn_0 ajn_02;
        air_1 air_12;
        Iterator iterator;
        TimerUtil.e();
        ArrayList<ajn_0> arrayList = new ArrayList<ajn_0>();
        Iterator iterator2 = ListInvoker.iterator(this.e);
        if (dz_0.c(iterator2) && dz_0.c(iterator = ListInvoker.iterator((air_12 = (air_1)dz_0.b(iterator2)).b())) && a0k.a(ajn_02 = (ajn_0)dz_0.b(iterator))) {
            ListInvoker.add(arrayList, ajn_02);
        }
        return arrayList;
    }

    public Item a(Block block) {
        return px_0.a(block);
    }
}

