/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from net.amh
 */
public class amh_1 {
    private static amh_1 a = new amh_1();
    private Map<ItemStack, Float> c;
    private Map<ItemStack, ItemStack> b = MapsInvoker.a();

    private amh_1() {
        this.c = MapsInvoker.a();
        this.a(Blocks.iron_ore, new ItemStack(Items.iron_ingot), 0.7f);
        this.a(Blocks.gold_ore, new ItemStack(Items.gold_ingot), 1.0f);
        this.a(Blocks.C, new ItemStack(Items.diamond), 1.0f);
        this.a(Blocks.sand, new ItemStack(Blocks.a8), 0.1f);
        this.a(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.35f);
        this.a(Items.beef, new ItemStack(Items.cooked_beef), 0.35f);
        this.a(Items.chicken, new ItemStack(Items.cooked_chicken), 0.35f);
        this.a(Items.rabbit, new ItemStack(Items.cooked_rabbit), 0.35f);
        this.a(Items.mutton, new ItemStack(Items.cooked_mutton), 0.35f);
        this.a(Blocks.cobblestone, new ItemStack(Blocks.stone), 0.1f);
        this.a(new ItemStack(Blocks.z, 1, hk_1.S), new ItemStack(Blocks.z, 1, hk_1.Q), 0.1f);
        this.a(Items.clay_ball, new ItemStack(Items.brick), 0.3f);
        this.a(Blocks.T, new ItemStack(Blocks.aJ), 0.35f);
        this.a(Blocks.a9, new ItemStack(Items.dye, 1, my_2.c(YZ.GREEN)), 0.2f);
        this.a(Blocks.b2, new ItemStack(Items.coal, 1, 1), 0.15f);
        this.a(Blocks.bO, new ItemStack(Items.coal, 1, 1), 0.15f);
        this.a(Blocks.K, new ItemStack(Items.emerald), 1.0f);
        this.a(Items.potato, new ItemStack(Items.baked_potato), 0.35f);
        this.a(Blocks.bu, new ItemStack(Items.netherbrick), 0.1f);
        this.a(new ItemStack(Blocks.aM, 1, 1), new ItemStack(Blocks.aM, 1, 0), 0.15f);
        for (Ky ky : Ky.values()) {
            if (!aC0.c(ky)) continue;
            this.a(new ItemStack(Items.fish, 1, aC0.e(ky)), new ItemStack(Items.cooked_fish, 1, aC0.e(ky)), 0.35f);
        }
        this.a(Blocks.coal_ore, new ItemStack(Items.coal), 0.1f);
        this.a(Blocks.b5, new ItemStack(Items.redstone), 0.7f);
        this.a(Blocks.bH, new ItemStack(Items.dye, 1, my_2.c(YZ.BLUE)), 0.2f);
        this.a(Blocks.cl, new ItemStack(Items.quartz), 0.2f);
    }

    public float a(ItemStack itemStack) {
        Iterator iterator = aS0.f(MapInvoker.b(this.c));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (!this.a(itemStack, (ItemStack)FG.b(entry))) continue;
            return axx_1.a((Float)FG.a(entry));
        }
        return 0.0f;
    }

    private boolean a(ItemStack itemStack, ItemStack itemStack2) {
        return act_2.k(itemStack2) == act_2.k(itemStack) && (act_2.c(itemStack2) == Short.MAX_VALUE || act_2.c(itemStack2) == act_2.c(itemStack));
    }

    public void a(Block block, ItemStack itemStack, float f) {
        this.a(px_0.a(block), itemStack, f);
    }

    public void a(Item item, ItemStack itemStack, float f) {
        this.a(new ItemStack(item, 1, Short.MAX_VALUE), itemStack, f);
    }

    public Map<ItemStack, ItemStack> b() {
        return this.b;
    }

    public static amh_1 a() {
        return a;
    }

    public ItemStack b(ItemStack itemStack) {
        Iterator iterator = aS0.f(MapInvoker.b(this.b));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (!this.a(itemStack, (ItemStack)FG.b(entry))) continue;
            return (ItemStack)FG.a(entry);
        }
        return null;
    }

    public void a(ItemStack itemStack, ItemStack itemStack2, float f) {
        MapInvoker.c(this.b, itemStack, itemStack2);
        MapInvoker.c(this.c, itemStack2, axx_1.a(f));
    }
}

