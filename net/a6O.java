/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ITickable;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import deobf.TileEntity;
import java.util.Iterator;


public class a6O
extends a6h_0
implements ITickable,
rs_1 {
    private String s;
    private ItemStack[] n = new ItemStack[27];
    public a6O p;
    public int q;
    private int m;
    public a6O l;
    private int v;
    private boolean r;
    public float t;
    public a6O k;
    public a6O u;
    public boolean j;
    public float o;

    @Override
    public void b() {
        float f;
        this.g();
        int n = amv_2.j(this.g);
        int n2 = amv_2.h(this.g);
        int n3 = amv_2.i(this.g);
        ++this.m;
        if (!this.e.isRemote && this.q != 0 && (this.m + n + n2 + n3) % 200 == 0) {
            this.q = 0;
            f = 5.0f;
            Iterator iterator = ListInvoker.iterator(aV8.a(this.e, EntityPlayer.class, new rm_2((float)n - f, (float)n2 - f, (float)n3 - f, (float)(n + 1) + f, (float)(n2 + 1) + f, (float)(n3 + 1) + f)));
            while (dz_0.c(iterator)) {
                rs_1 rs_12;
                EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
                if (!(entityPlayer.bI instanceof aaz_0) || (rs_12 = ay2_0.a((aaz_0)entityPlayer.bI)) != this && (!(rs_12 instanceof adq_2) || !lp_1.a((adq_2)rs_12, this))) continue;
                ++this.q;
            }
        }
        this.o = this.t;
        f = 0.1f;
        if (this.q > 0 && this.t == 0.0f && this.u == null && this.l == null) {
            double d = (double)n + 0.5;
            double d2 = (double)n3 + 0.5;
            if (this.p != null) {
                d2 += 0.5;
            }
            if (this.k != null) {
                d += 0.5;
            }
            aV8.a(this.e, d, (double)n2 + 0.5, d2, aun_1.f, 0.5f, a5_0.e(this.e.o) * 0.1f + 0.9f);
        }
        if (this.q == 0 && this.t > 0.0f || this.q > 0 && this.t < 1.0f) {
            float f2;
            float f3 = this.t;
            this.t = this.q > 0 ? (this.t += f) : (this.t -= f);
            if (this.t > 1.0f) {
                this.t = 1.0f;
            }
            if (this.t < (f2 = 0.5f) && f3 >= f2 && this.u == null && this.l == null) {
                double d = (double)n + 0.5;
                double d3 = (double)n3 + 0.5;
                if (this.p != null) {
                    d3 += 0.5;
                }
                if (this.k != null) {
                    d += 0.5;
                }
                aV8.a(this.e, d, (double)n2 + 0.5, d3, aun_1.c, 0.5f, a5_0.e(this.e.o) * 0.1f + 0.9f);
            }
            if (this.t < 0.0f) {
                this.t = 0.0f;
            }
        }
    }

    @Override
    public boolean e() {
        return this.s != null && !StringInvoker.g(this.s);
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.n[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
        this.d();
    }

    private boolean a(BlockPos blockPos) {
        if (this.e == null) {
            return false;
        }
        Block block = BlockStateInvoker.getBlock(aV8.q(this.e, blockPos));
        return block instanceof fs_1 && ((fs_1)block).Q == this.h();
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public boolean a(int n, int n2) {
        if (n == 1) {
            this.q = n2;
            return true;
        }
        return super.a(n, n2);
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        if (!a6w_0.l(entityPlayer) && this.k() instanceof fs_1) {
            --this.q;
            aV8.b(this.e, this.g, this.k(), 1, this.q);
            aV8.c(this.e, this.g, this.k());
            aV8.c(this.e, amv_2.g(this.g), this.k());
        }
    }

    public a6O() {
        this.v = -1;
    }

    public void a(String string) {
        this.s = string;
    }

    public void a(boolean bl) {
        this.r = bl;
    }

    public int h() {
        if (this.v == -1) {
            if (this.e == null || !(this.k() instanceof fs_1)) {
                return 0;
            }
            this.v = ((fs_1)this.k()).Q;
        }
        return this.v;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aun_1.i, 10);
        this.n = new ItemStack[this.e()];
        if (tn_0.a(nBTTagCompound, aun_1.k, 8)) {
            this.s = tn_0.m(nBTTagCompound, aun_1.g);
        }
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            int n = tn_0.e(nBTTagCompound2, aun_1.e) & 0xFF;
            if (n >= this.n.length) continue;
            this.n[n] = act_2.a(nBTTagCompound2);
        }
    }

    public a6O(int n) {
        this.v = n;
    }

    @Override
    public void e() {
        super.e();
        this.j();
        this.g();
    }

    @Override
    public String b() {
        return aun_1.a;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.n[n] != null) {
            if (this.n[n].a <= n2) {
                ItemStack itemStack = this.n[n];
                this.n[n] = null;
                this.d();
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.n[n], n2);
            if (this.n[n].a == 0) {
                this.n[n] = null;
            }
            this.d();
            return itemStack;
        }
        return null;
    }

    @Override
    public void a() {
        for (int i = 0; i < this.n.length; ++i) {
            this.n[i] = null;
        }
    }

    private void a(a6O a6O2, EnumFacing enumFacing) {
        if (a6O2.c()) {
            this.j = false;
        } else if (this.j) {
            switch (enumFacing) {
                case NORTH: {
                    if (this.u == a6O2) break;
                    this.j = false;
                    break;
                }
                case SOUTH: {
                    if (this.p == a6O2) break;
                    this.j = false;
                    break;
                }
                case EAST: {
                    if (this.k == a6O2) break;
                    this.j = false;
                    break;
                }
                case WEST: {
                    if (this.l == a6O2) break;
                    this.j = false;
                }
            }
        }
    }

    @Override
    public void j() {
        super.j();
        this.j = false;
    }

    @Override
    public ItemStack a(int n) {
        return this.n[n];
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.n.length; ++i) {
            if (this.n[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, aun_1.d, (byte)i);
            act_2.a(this.n[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, aun_1.j, nBTTagList);
        if (this.e()) {
            tn_0.a(nBTTagCompound, aun_1.h, this.s);
        }
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    public void g() {
        if (!this.j) {
            this.j = true;
            this.l = this.a(EnumFacing.WEST);
            this.k = this.a(EnumFacing.EAST);
            this.u = this.a(EnumFacing.NORTH);
            this.p = this.a(EnumFacing.SOUTH);
        }
    }

    @Override
    public ItemStack b(int n) {
        if (this.n[n] != null) {
            ItemStack itemStack = this.n[n];
            this.n[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aaz_0(aSK2, this, entityPlayer);
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public int e() {
        return 27;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
        if (!a6w_0.l(entityPlayer)) {
            if (this.q < 0) {
                this.q = 0;
            }
            ++this.q;
            aV8.b(this.e, this.g, this.k(), 1, this.q);
            aV8.c(this.e, this.g, this.k());
            aV8.c(this.e, amv_2.g(this.g), this.k());
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public String getName() {
        return this.e() ? this.s : aun_1.b;
    }

    protected a6O a(EnumFacing enumFacing) {
        TileEntity tileEntity;
        BlockPos blockPos = amv_2.a(this.g, enumFacing);
        if (this.a(blockPos) && (tileEntity = aV8.z(this.e, blockPos)) instanceof a6O) {
            a6O a6O2 = (a6O)tileEntity;
            a6O2.a(this, SJ.b(enumFacing));
            return a6O2;
        }
        return null;
    }

    public boolean f() {
        return this.r;
    }
}

