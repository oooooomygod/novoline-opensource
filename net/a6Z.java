/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ITickable;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;


public class a6Z
extends a6h_0
implements ITickable,
aej_2 {
    private String j;
    private int r;
    private int q;
    private static int[] k = new int[]{0};
    private ItemStack[] p = new ItemStack[3];
    private static int[] l = new int[]{2, 1};
    private int m;
    private int n;
    private static int[] o = new int[]{1};

    public static boolean b(ItemStack itemStack) {
        return a6Z.c(itemStack) > 0;
    }

    @Override
    public void a(int n, int n2) {
        switch (n) {
            case 0: {
                this.n = n2;
                break;
            }
            case 1: {
                this.q = n2;
                break;
            }
            case 2: {
                this.m = n2;
                break;
            }
            case 3: {
                this.r = n2;
            }
        }
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return n != 2 && (n != 1 || a6Z.b(itemStack) || AK.a(itemStack));
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.p[n] != null) {
            if (this.p[n].a <= n2) {
                ItemStack itemStack = this.p[n];
                this.p[n] = null;
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.p[n], n2);
            if (this.p[n].a == 0) {
                this.p[n] = null;
            }
            return itemStack;
        }
        return null;
    }

    private boolean f() {
        if (this.p[0] == null) {
            return false;
        }
        ItemStack itemStack = a3q_0.a(a3q_0.a(), this.p[0]);
        return this.p[2] == null || act_2.a(this.p[2], itemStack) && (this.p[2].a < this.b() && this.p[2].a < act_2.f(this.p[2]) || this.p[2].a < act_2.f(itemStack));
    }

    public int a(ItemStack itemStack) {
        return 200;
    }

    public static int c(ItemStack itemStack) {
        return 0;
    }

    @Override
    public boolean a(int n, ItemStack itemStack, EnumFacing enumFacing) {
        if (enumFacing == EnumFacing.DOWN && n == 1) {
            Item item = act_2.k(itemStack);
            return item == Items.water_bucket || item == Items.bucket;
        }
        return true;
    }

    @Override
    public ItemStack a(int n) {
        return this.p[n];
    }

    @Override
    public int[] a(EnumFacing enumFacing) {
        return enumFacing == EnumFacing.DOWN ? l : (enumFacing == EnumFacing.UP ? k : o);
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aG_.b, 10);
        this.p = new ItemStack[this.e()];
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            byte by = tn_0.e(nBTTagCompound2, aG_.d);
            if (by >= this.p.length) continue;
            this.p[by] = act_2.a(nBTTagCompound2);
        }
        this.n = tn_0.o(nBTTagCompound, aG_.m);
        this.m = tn_0.o(nBTTagCompound, aG_.i);
        this.r = tn_0.o(nBTTagCompound, aG_.k);
        this.q = a6Z.c(this.p[1]);
        if (tn_0.a(nBTTagCompound, aG_.p, 8)) {
            this.j = tn_0.m(nBTTagCompound, aG_.n);
        }
    }

    @Override
    public String getName() {
        return this.e() ? this.j : aG_.a;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.a(nBTTagCompound, aG_.q, (short)this.n);
        tn_0.a(nBTTagCompound, aG_.f, (short)this.m);
        tn_0.a(nBTTagCompound, aG_.c, (short)this.r);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.p.length; ++i) {
            if (this.p[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, aG_.o, (byte)i);
            act_2.a(this.p[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, aG_.h, nBTTagList);
        if (this.e()) {
            tn_0.a(nBTTagCompound, aG_.g, this.j);
        }
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aan_0(aSK2, this);
    }

    @Override
    public int c() {
        return 4;
    }

    public void g() {
        if (this.f()) {
            ItemStack itemStack = a3q_0.a(a3q_0.a(), this.p[0]);
            if (this.p[2] == null) {
                this.p[2] = act_2.C(itemStack);
            } else if (act_2.k(this.p[2]) == act_2.k(itemStack)) {
                ++this.p[2].a;
            }
            if (act_2.k(this.p[0]) == px_0.a(Blocks.aM) && act_2.c(this.p[0]) == 1 && this.p[1] != null && act_2.k(this.p[1]) == Items.bucket) {
                this.p[1] = new ItemStack(Items.water_bucket);
            }
            --this.p[0].a;
            if (this.p[0].a <= 0) {
                this.p[0] = null;
            }
        }
    }

    @Override
    public boolean b(int n, ItemStack itemStack, EnumFacing enumFacing) {
        return this.a(n, itemStack);
    }

    @Override
    public void a() {
        for (int i = 0; i < this.p.length; ++i) {
            this.p[i] = null;
        }
    }

    @Override
    public void b() {
        boolean bl = this.i();
        if (this.i()) {
            --this.n;
        }
        if (!this.e.isRemote) {
            if (this.i() || this.p[1] != null && this.p[0] != null) {
                if (!this.i() && this.f()) {
                    this.q = this.n = a6Z.c(this.p[1]);
                    if (this.i() && this.p[1] != null) {
                        --this.p[1].a;
                        if (this.p[1].a == 0) {
                            Item item = px_0.f(act_2.k(this.p[1]));
                            this.p[1] = new ItemStack(item);
                        }
                    }
                }
                if (this.i() && this.f()) {
                    ++this.m;
                    if (this.m == this.r) {
                        this.m = 0;
                        this.r = this.a(this.p[0]);
                        this.g();
                    }
                } else {
                    this.m = 0;
                }
            } else if (!this.i() && this.m > 0) {
                this.m = MathHelper.a(this.m - 2, 0, this.r);
            }
            if (bl != this.i()) {
                arl_2.a(this.i(), this.e, this.g);
            }
        }
        this.d();
    }

    public void a(String string) {
        this.j = string;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public ItemStack b(int n) {
        if (this.p[n] != null) {
            ItemStack itemStack = this.p[n];
            this.p[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public int e() {
        return this.p.length;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        boolean bl = act_2.a(itemStack, this.p[n]) && act_2.c(itemStack, this.p[n]);
        this.p[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
        this.r = this.a(itemStack);
        this.m = 0;
        this.d();
    }

    public boolean i() {
        return this.n > 0;
    }

    @Override
    public int c(int n) {
        switch (n) {
            case 0: {
                return this.n;
            }
            case 1: {
                return this.q;
            }
            case 2: {
                return this.m;
            }
            case 3: {
                return this.r;
            }
        }
        return 0;
    }

    public static boolean a(rs_1 rs_12) {
        return rs_12.c(0) > 0;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public boolean e() {
        return this.j != null && !StringInvoker.g(this.j);
    }

    @Override
    public String b() {
        return aG_.l;
    }
}

