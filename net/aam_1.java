/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ICrafting;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aaM
 */
public class aam_1
extends Container {
    private EntityPlayer j;
    private rs_1 n = new JW();
    private rs_1 l = new wa_1(this, amy_1.a, true, 2);
    private World o;
    private BlockPos m;
    private int p;
    private String k;
    public int q;

    public aam_1(aSK aSK2, World world, EntityPlayer entityPlayer) {
        this(aSK2, world, BlockPos.m, entityPlayer);
    }

    @Override
    public void a(int n, int n2) {
        this.q = n2;
    }

    @Override
    public void b(rs_1 rs_12) {
        super.b(rs_12);
        if (rs_12 == this.l) {
            this.a();
        }
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n == 2) {
                if (!this.a(itemStack2, 3, 39, true)) {
                    return null;
                }
                ItemStackInvoker.a(slot, itemStack2, itemStack);
            } else if (n != 1 ? n >= 3 && n < 39 && !this.a(itemStack2, 0, 2, false) : !this.a(itemStack2, 3, 39, false)) {
                return null;
            }
            if (itemStack2.a == 0) {
                ItemStackInvoker.a(slot, null);
            } else {
                ItemStackInvoker.b(slot);
            }
            if (itemStack2.a == itemStack.a) {
                return null;
            }
            ItemStackInvoker.a(slot, entityPlayer, itemStack2);
        }
        return itemStack;
    }

    public aam_1(aSK aSK2, World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        this.m = blockPos;
        this.o = world;
        this.j = entityPlayer;
        this.a(new Slot(this.l, 0, 27, 47));
        this.a(new Slot(this.l, 1, 76, 47));
        this.a(new a7O(this, this.n, 2, 134, 47, world, blockPos));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(aSK2, n2 + n * 9 + 9, 8 + n2 * 18, 84 + n * 18));
            ++n2;
        }
    }

    static int a(aam_1 aam_12) {
        return aam_12.p;
    }

    public void a(String string) {
        this.k = string;
        if (ItemStackInvoker.e(this.c(2))) {
            ItemStack itemStack = ItemStackInvoker.a(this.c(2));
            if (aw__0.d(string)) {
                act_2.p(itemStack);
            } else {
                act_2.a(itemStack, this.k);
            }
        }
        this.a();
    }

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
        JQ.a(iCrafting, (Container)this, 0, this.q);
    }

    static rs_1 b(aam_1 aam_12) {
        return aam_12.l;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return BlockStateInvoker.getBlock(aV8.q(this.o, this.m)) == Blocks.J && a6w_0.b(entityPlayer, (double)amv_2.j(this.m) + 0.5, (double)amv_2.h(this.m) + 0.5, (double)amv_2.i(this.m) + 0.5) <= 64.0;
    }

    public void a() {
        apw_0.b(this.l, 0);
        this.q = 1;
        apw_0.a(this.n, 0, null);
        this.q = 0;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        if (!this.o.isRemote) {
            for (int i = 0; i < apw_0.c(this.l); ++i) {
                ItemStack itemStack = apw_0.c(this.l, i);
                a6w_0.a(entityPlayer, itemStack, false);
            }
        }
    }
}

