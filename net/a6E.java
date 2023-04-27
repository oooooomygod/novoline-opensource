/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ITickable;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.List;


public class a6E
extends a6h_0
implements ITickable,
aej_2 {
    private static int[] n;
    private String k;
    private Item l;
    private ItemStack[] o = new ItemStack[4];
    private static int[] j;
    private int m;
    private boolean[] p;

    @Override
    public boolean e() {
        return this.k != null && !StringInvoker.g(this.k);
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public void b() {
        boolean[] blArray;
        if (this.m > 0) {
            --this.m;
            if (this.m == 0) {
                this.g();
                this.d();
            } else if (!this.f()) {
                this.m = 0;
                this.d();
            } else if (this.l != act_2.k(this.o[3])) {
                this.m = 0;
                this.d();
            }
        } else if (this.f()) {
            this.m = 400;
            this.l = act_2.k(this.o[3]);
        }
        if (!this.e.isRemote && !a7r_0.a(blArray = this.a(), this.p)) {
            this.p = blArray;
            IBlockState iBlockState = aV8.q(this.e, this.i());
            if (!(BlockStateInvoker.getBlock(iBlockState) instanceof fx_1)) {
                return;
            }
            for (int i = 0; i < fx_1.P.length; ++i) {
                iBlockState = BlockStateInvoker.a(iBlockState, fx_1.P[i], auk_2.b(blArray[i]));
            }
            aV8.a(this.e, this.g, iBlockState, 2);
        }
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        if (n < this.o.length) {
            this.o[n] = itemStack;
        }
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return n == 3 ? px_0.c(act_2.k(itemStack), itemStack) : act_2.k(itemStack) == Items.potionitem || act_2.k(itemStack) == Items.glass_bottle;
    }

    @Override
    public String b() {
        return akz_2.c;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, akz_2.f, (short)this.m);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.o.length; ++i) {
            if (this.o[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, akz_2.i, (byte)i);
            act_2.a(this.o[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, akz_2.d, nBTTagList);
        if (this.e()) {
            tn_0.a(nBTTagCompound, akz_2.h, this.k);
        }
    }

    @Override
    public int c() {
        return 1;
    }

    @Override
    public int c(int n) {
        return this.m;
    }

    @Override
    public void a() {
        for (int i = 0; i < this.o.length; ++i) {
            this.o[i] = null;
        }
    }

    public void a(String string) {
        this.k = string;
    }

    @Override
    public boolean a(int n, ItemStack itemStack, EnumFacing enumFacing) {
        return true;
    }

    static {
        j = new int[]{3};
        n = new int[]{0, 1, 2};
    }

    private int a(int n, ItemStack itemStack) {
        return n;
    }

    private boolean f() {
        if (this.o[3] != null && this.o[3].a > 0) {
            ItemStack itemStack = this.o[3];
            if (!px_0.c(act_2.k(itemStack), itemStack)) {
                return false;
            }
            boolean bl = false;
            int n = 0;
            while (true) {
                if (this.o[n] != null && act_2.k(this.o[n]) == Items.potionitem) {
                    List list;
                    int n2 = act_2.c(this.o[n]);
                    int n3 = this.a(n2, itemStack);
                    if (!en_2.b(n2) && en_2.b(n3)) {
                        bl = true;
                        break;
                    }
                    List list2 = en_2.a(Items.potionitem, n2);
                    if (list2 != (list = en_2.a(Items.potionitem, n3)) && !list2.equals(list) && n2 != n3) {
                        bl = true;
                        break;
                    }
                }
                ++n;
            }
            return bl;
        }
        return false;
    }

    private void g() {
        if (this.f()) {
            ItemStack itemStack = this.o[3];
            int n = 0;
            while (true) {
                if (this.o[n] != null && act_2.k(this.o[n]) == Items.potionitem) {
                    List list;
                    int n2 = act_2.c(this.o[n]);
                    int n3 = this.a(n2, itemStack);
                    List list2 = en_2.a(Items.potionitem, n2);
                    if (list2 == (list = en_2.a(Items.potionitem, n3)) || !list2.equals(list)) {
                        // empty if block
                    }
                    if (!en_2.b(n2) && en_2.b(n3)) {
                        act_2.a(this.o[n], n3);
                    }
                }
                ++n;
            }
        }
    }

    @Override
    public ItemStack a(int n) {
        return n < this.o.length ? this.o[n] : null;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aae_1(aSK2, this);
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public int[] a(EnumFacing enumFacing) {
        return enumFacing == EnumFacing.UP ? j : n;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (n < this.o.length) {
            ItemStack itemStack = this.o[n];
            this.o[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    @Override
    public void a(int n, int n2) {
        this.m = n2;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, akz_2.e, 10);
        this.o = new ItemStack[this.e()];
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            byte by = tn_0.e(nBTTagCompound2, akz_2.b);
            if (by >= this.o.length) continue;
            this.o[by] = act_2.a(nBTTagCompound2);
        }
        this.m = tn_0.o(nBTTagCompound, akz_2.j);
        if (tn_0.a(nBTTagCompound, akz_2.g, 8)) {
            this.k = tn_0.m(nBTTagCompound, akz_2.a);
        }
    }

    public boolean[] a() {
        boolean[] blArray = new boolean[3];
        int n = 0;
        while (true) {
            if (this.o[n] != null) {
                blArray[n] = true;
            }
            ++n;
        }
    }

    @Override
    public String getName() {
        return this.e() ? this.k : akz_2.k;
    }

    @Override
    public ItemStack b(int n) {
        if (n < this.o.length) {
            ItemStack itemStack = this.o[n];
            this.o[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public boolean b(int n, ItemStack itemStack, EnumFacing enumFacing) {
        return this.a(n, itemStack);
    }

    @Override
    public int e() {
        return this.o.length;
    }
}

