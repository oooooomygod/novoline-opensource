/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.multiplayer.WorldClient;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class aDP {
    private static long c;
    private static int d = 15;
    private static int b = 8;
    private static int a = 10;
    private static double h = 56.25;
    private static double j = 7.5;
    private static int f = 8;
    private static int i = 15;
    private static int k = 8;
    private static int g = 13;
    private static Map<Integer, wy_1> e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(RenderGlobal renderGlobal) {
        aP2.b();
        Map<Integer, wy_1> map = e;
        synchronized (map) {
            Collection<wy_1> collection = e.values();
            Iterator iterator = ms_0.a(collection);
            if (dz_0.c(iterator)) {
                wy_1 wy_12 = (wy_1)dz_0.b(iterator);
                dz_0.a(iterator);
                mo_2.a(wy_12, renderGlobal);
            }
            return;
        }
    }

    public static ItemStack a(og_0 og_02) {
        ItemStack itemStack = aom_0.c(aec_0.f(og_02), 10);
        return itemStack;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static int b() {
        Map<Integer, wy_1> map = e;
        // MONITORENTER : map
        // MONITOREXIT : map
        return MapInvoker.a(e);
    }

    public static int a(double d, int n) {
        int n2;
        int n3;
        aP2.b();
        if (d > 0.0 && (n3 = (int)(d * 16.0)) > (n2 = n & 0xFF)) {
            n &= 0xFFFFFF00;
            n |= n3;
        }
        return n;
    }

    public static int a(ItemStack itemStack) {
        aP2.b();
        if (itemStack == null) {
            return 0;
        }
        Item item = act_2.k(itemStack);
        if (item instanceof ItemBlock) {
            ItemBlock itemBlock = (ItemBlock)item;
            Block block = ItemBlockInvoker.a(itemBlock);
            return BlocksInvoker.G(block);
        }
        return item == Items.lava_bucket ? aBF.b(Blocks.lava) : (item != Items.blaze_rod && item != Items.blaze_powder ? (item == Items.glowstone_dust ? 8 : (item == Items.prismarine_crystals ? 8 : (item == Items.magma_cream ? 8 : (item == Items.nether_star ? DO.a(Blocks.d) / 2 : 0)))) : 10);
    }

    public static int a(Entity entity, int n) {
        double d = aDP.a(entity);
        n = aDP.a(d, n);
        return n;
    }

    public static int a(BlockPos blockPos, int n) {
        double d = aDP.a(blockPos);
        n = aDP.a(d, n);
        return n;
    }

    public static void b(Entity entity, RenderGlobal renderGlobal) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(RenderGlobal renderGlobal) {
        aP2.b();
        long l4 = SystemInvoker.f();
        if (l4 < c + 50L) return;
        c = l4;
        Map<Integer, wy_1> map = e;
        synchronized (map) {
            aDP.b(renderGlobal);
            if (MapInvoker.a(e) <= 0) return;
            Iterator iterator = ms_0.a(e.values());
            if (!dz_0.c(iterator)) return;
            wy_1 wy_12 = (wy_1)dz_0.b(iterator);
            wy_12.a(renderGlobal);
            return;
        }
    }

    public static int a(Entity entity) {
        Entity entity2;
        aP2.b();
        if (entity == MCInvoker.v(ys_2.at()) && !ys_2.i()) {
            return 0;
        }
        if (entity instanceof EntityPlayer && a6w_0.l(entity2 = (EntityPlayer)entity)) {
            return 0;
        }
        if (ayj_0.v(entity)) {
            return 15;
        }
        if (entity instanceof oa_1) {
            return 15;
        }
        if (entity instanceof od_1) {
            return 15;
        }
        if (entity instanceof nt_2) {
            entity2 = (nt_2)entity;
            return a6b_0.f((nt_2)entity2) ? 15 : 10;
        }
        if (entity instanceof nk_1) {
            entity2 = (nk_1)entity;
            return (double)((nk_1)entity2).bC > 0.6 ? 13 : 8;
        }
        if (entity instanceof nd_2 && (double)om_2.a((nd_2)(entity2 = (nd_2)entity), 0.0f) > 0.001) {
            return 15;
        }
        if (entity instanceof EntityLivingBase) {
            entity2 = (EntityLivingBase)entity;
            ItemStack itemStack = atn_0.z(entity2);
            int n = aDP.a(itemStack);
            ItemStack itemStack2 = atn_0.f(entity2, 4);
            int n2 = aDP.a(itemStack2);
            return MathInvoker.max(n, n2);
        }
        if (entity instanceof og_0) {
            entity2 = (og_0)entity;
            ItemStack itemStack = aDP.a((og_0)entity2);
            return aDP.a(itemStack);
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static double a(BlockPos blockPos) {
        aP2.b();
        double d = 0.0;
        Map<Integer, wy_1> map = e;
        synchronized (map) {
            Iterator iterator = ms_0.a(e.values());
            if (!dz_0.c(iterator)) return ys_2.a(d, 0.0, 15.0);
            wy_1 wy_12 = (wy_1)dz_0.b(iterator);
            int n = mo_2.c(wy_12);
            double d2 = mo_2.d(wy_12);
            double d3 = mo_2.a(wy_12);
            double d4 = mo_2.b(wy_12);
            double d5 = (double)amv_2.j(blockPos) - d2;
            double d6 = (double)amv_2.h(blockPos) - d3;
            double d7 = (double)amv_2.i(blockPos) - d4;
            double d8 = d5 * d5 + d6 * d6 + d7 * d7;
            if (mo_2.e(wy_12) && !ys_2.ae()) {
                n = ys_2.a(n - 2, 0, 15);
                d8 *= 2.0;
            }
            if (!(d8 <= 56.25)) return ys_2.a(d, 0.0, 15.0);
            double d9 = MathInvoker.d(d8);
            double d10 = 1.0 - d9 / 7.5;
            double d11 = d10 * (double)n;
            if (!(d11 > d)) return ys_2.a(d, 0.0, 15.0);
            d = d11;
            return ys_2.a(d, 0.0, 15.0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        Map<Integer, wy_1> map = e;
        synchronized (map) {
            e.clear();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Entity entity, RenderGlobal renderGlobal) {
        aP2.b();
        Map<Integer, wy_1> map = e;
        synchronized (map) {
            wy_1 wy_12 = (wy_1)MapInvoker.a(e, VN.a(ayj_0.B(entity)));
            if (wy_12 != null) {
                mo_2.a(wy_12, renderGlobal);
            }
            return;
        }
    }

    static {
        e = new HashMap<Integer, wy_1>();
        c = 0L;
    }

    private static void b(RenderGlobal renderGlobal) {
        Iterator iterator;
        aP2.b();
        WorldClient worldClient = jv_0.j(renderGlobal);
        if (worldClient != null && dz_0.c(iterator = ListInvoker.iterator(aV8.u(worldClient)))) {
            Integer n;
            wy_1 wy_12;
            Entity entity = (Entity)dz_0.b(iterator);
            int n2 = aDP.a(entity);
            if (n2 > 0 && (wy_12 = (wy_1)MapInvoker.c(e, n = VN.a(ayj_0.B(entity)))) == null) {
                wy_12 = new wy_1(entity);
                MapInvoker.c(e, n, wy_12);
            }
            if ((wy_12 = (wy_1)MapInvoker.a(e, n = VN.a(ayj_0.B(entity)))) != null) {
                mo_2.a(wy_12, renderGlobal);
            }
        }
    }
}

