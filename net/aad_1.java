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
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.aad
 */
public class aad_1
extends Container {
    public int p;
    private Random l;
    public rs_1 o = new wd_0(this, aln_0.a, true, 2);
    private World j;
    public int[] m;
    public int[] n;
    private BlockPos k;

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
        JQ.a(iCrafting, (Container)this, 0, this.m[0]);
        JQ.a(iCrafting, (Container)this, 1, this.m[1]);
        JQ.a(iCrafting, (Container)this, 2, this.m[2]);
        JQ.a(iCrafting, (Container)this, 3, this.p & 0xFFFFFFF0);
        JQ.a(iCrafting, (Container)this, 4, this.n[0]);
        JQ.a(iCrafting, (Container)this, 5, this.n[1]);
        JQ.a(iCrafting, (Container)this, 6, this.n[2]);
    }

    public int b() {
        apw_0.b(this.o, 1);
        return 0;
    }

    public aad_1(aSK aSK2, World world, BlockPos blockPos) {
        this.l = new Random();
        this.m = new int[3];
        this.n = new int[]{-1, -1, -1};
        this.j = world;
        this.k = blockPos;
        this.p = a6w_0.F(aSK2.f);
        this.a(new a7R(this, this.o, 0, 15, 47));
        this.a(new a7A(this, this.o, 1, 35, 47));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(aSK2, n2 + n * 9 + 9, 8 + n2 * 18, 84 + n * 18));
            ++n2;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return BlockStateInvoker.getBlock(aV8.q(this.j, this.k)) == Blocks.bw && a6w_0.b(entityPlayer, (double)amv_2.j(this.k) + 0.5, (double)amv_2.h(this.k) + 0.5, (double)amv_2.i(this.k) + 0.5) <= 64.0;
    }

    private List<cl_0> a(ItemStack itemStack, int n, int n2) {
        a5_0.a(this.l, (long)(this.p + n));
        List list = alf_0.a(this.l, itemStack, n2);
        if (act_2.k(itemStack) == Items.book && ListInvoker.size(list) > 1) {
            ListInvoker.remove(list, a5_0.a(this.l, ListInvoker.size(list)));
        }
        return list;
    }

    @Override
    public void c() {
        super.c();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            ICrafting iCrafting;
            ICrafting iCrafting2 = iCrafting = (ICrafting)dz_0.b(iterator);
            JQ.a(iCrafting2, (Container)this, 0, this.m[0]);
            JQ.a(iCrafting2, (Container)this, 1, this.m[1]);
            JQ.a(iCrafting2, (Container)this, 2, this.m[2]);
            JQ.a(iCrafting2, (Container)this, 3, this.p & 0xFFFFFFF0);
            JQ.a(iCrafting2, (Container)this, 4, this.n[0]);
            JQ.a(iCrafting2, (Container)this, 5, this.n[1]);
            JQ.a(iCrafting2, (Container)this, 6, this.n[2]);
        }
    }

    @Override
    public void a(int n, int n2) {
        if (n <= 2) {
            this.m[n] = n2;
        } else if (n == 3) {
            this.p = n2;
        } else if (n >= 4 && n <= 6) {
            this.n[n - 4] = n2;
        } else {
            super.a(n, n2);
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        if (!this.j.isRemote) {
            for (int i = 0; i < apw_0.c(this.o); ++i) {
                ItemStack itemStack = apw_0.c(this.o, i);
                a6w_0.a(entityPlayer, itemStack, false);
            }
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = apw_0.b(this.o, 0);
        ItemStack itemStack2 = apw_0.b(this.o, 1);
        int n2 = n + 1;
        if (itemStack2.a < n2 && !aSY.a(entityPlayer.abilities)) {
            return false;
        }
        if (this.m[n] > 0 && (entityPlayer.bL >= n2 && entityPlayer.bL >= this.m[n] || aSY.a(entityPlayer.abilities))) {
            if (!this.j.isRemote) {
                List<cl_0> list = this.a(itemStack, n, this.m[n]);
                boolean bl = act_2.k(itemStack) == Items.book;
                a6w_0.c(entityPlayer, n2);
                act_2.a(itemStack, Items.enchanted_book);
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    cl_0 cl_02;
                    cl_0 cl_03 = cl_02 = (cl_0)dz_0.b(iterator);
                    arw_2.a(Items.enchanted_book, itemStack, cl_03);
                }
                if (!aSY.a(entityPlayer.abilities)) {
                    itemStack2.a -= n2;
                    if (itemStack2.a <= 0) {
                        apw_0.a(this.o, 1, null);
                    }
                }
                a6w_0.a(entityPlayer, aop_1.f);
                apw_0.f(this.o);
                this.p = a6w_0.F(entityPlayer);
                this.b(this.o);
            }
            return true;
        }
        return false;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (!this.a(itemStack2, 2, 38, true)) {
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

    public aad_1(aSK aSK2, World world) {
        this(aSK2, world, BlockPos.m);
    }

    @Override
    public void b(rs_1 rs_12) {
        if (rs_12 == this.o) {
            ItemStack itemStack = apw_0.b(rs_12, 0);
            if (act_2.x(itemStack)) {
                if (!this.j.isRemote) {
                    int n = 0;
                    int n2 = -1;
                    int n3 = -1;
                    while (true) {
                        if (aV8.k(this.j, amv_2.a(this.k, n3, 0, n2)) && aV8.k(this.j, amv_2.a(this.k, n3, 1, n2))) {
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3 * 2, 0, n2 * 2))) == Blocks.at) {
                                ++n;
                            }
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3 * 2, 1, n2 * 2))) == Blocks.at) {
                                ++n;
                            }
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3 * 2, 0, n2))) == Blocks.at) {
                                ++n;
                            }
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3 * 2, 1, n2))) == Blocks.at) {
                                ++n;
                            }
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3, 0, n2 * 2))) == Blocks.at) {
                                ++n;
                            }
                            if (BlockStateInvoker.getBlock(aV8.q(this.j, amv_2.a(this.k, n3, 1, n2 * 2))) == Blocks.at) {
                                ++n;
                            }
                        }
                        ++n3;
                    }
                }
            } else {
                int n = 0;
                while (true) {
                    this.m[n] = 0;
                    this.n[n] = -1;
                    ++n;
                }
            }
        }
    }
}

