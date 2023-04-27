/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ITickable;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;
import java.util.Iterator;
import java.util.List;


public class a6G
extends a6h_0
implements ITickable,
rs_1 {
    private float j;
    private int o;
    private long k;
    private int l;
    private List<adx_0> q = my_0.c();
    public static Potion[][] r = new Potion[][]{{Potion.moveSpeed, Potion.digSpeed}, {Potion.resistance, Potion.jump}, {Potion.damageBoost}, {Potion.regeneration}};
    private boolean s;
    private int n = -1;
    private String p;
    private ItemStack m;

    @Override
    public void a() {
        this.m = null;
    }

    public List<adx_0> h() {
        return this.q;
    }

    private void g() {
        Object object;
        int n;
        int n2 = this.n;
        int n3 = amv_2.j(this.g);
        int n4 = amv_2.h(this.g);
        int n5 = amv_2.i(this.g);
        this.n = 0;
        this.q.clear();
        this.s = true;
        adx_0 adx_02 = new adx_0(au_1.a(YZ.WHITE));
        ListInvoker.add(this.q, adx_02);
        z6_0 z6_02 = new z6_0();
        for (n = n4 + 1; n < 256; ++n) {
            float[] fArray;
            object = aV8.q(this.e, ain_1.a(z6_02, n3, n, n5));
            if (BlockStateInvoker.getBlock((IBlockState)object) == Blocks.am) {
                fArray = au_1.a((YZ)((Object)BlockStateInvoker.b((IBlockState)object, fg_2.Q)));
            } else {
                if (BlockStateInvoker.getBlock((IBlockState)object) != Blocks.ad) {
                    if (BlocksInvoker.b(BlockStateInvoker.getBlock((IBlockState)object)) >= 15 && BlockStateInvoker.getBlock((IBlockState)object) != Blocks.bedrock) {
                        this.s = false;
                        this.q.clear();
                        break;
                    }
                    adx_02.c();
                    continue;
                }
                fArray = au_1.a((YZ)((Object)BlockStateInvoker.b((IBlockState)object, gn_1.U)));
            }
            fArray = new float[]{(aUF.a(adx_02)[0] + fArray[0]) / 2.0f, (aUF.a(adx_02)[1] + fArray[1]) / 2.0f, (aUF.a(adx_02)[2] + fArray[2]) / 2.0f};
            if (a7r_0.a(fArray, aUF.a(adx_02))) {
                adx_02.c();
                continue;
            }
            adx_02 = new adx_0(fArray);
            ListInvoker.add(this.q, adx_02);
        }
        if (this.s) {
            n = 1;
            int n6 = n4 - n;
            if (this.n == 0) {
                this.s = false;
            }
        }
        if (!this.e.isRemote && this.n == 4 && n2 < this.n) {
            Iterator iterator = ListInvoker.iterator(aV8.a(this.e, EntityPlayer.class, h__0.d(new rm_2(n3, n4, n5, n3, n4 - 4, n5), 10.0, 5.0, 10.0)));
            while (dz_0.c(iterator)) {
                object = (EntityPlayer)dz_0.b(iterator);
                a6w_0.a((EntityPlayer)object, apf_0.E);
            }
        }
    }

    private int a(int n) {
        if (n < Potion.potionTypes.length && Potion.potionTypes[n] != null) {
            Potion potion = Potion.potionTypes[n];
            return potion != Potion.moveSpeed && potion != Potion.digSpeed && potion != Potion.resistance && potion != Potion.jump && potion != Potion.damageBoost && potion != Potion.regeneration ? 0 : n;
        }
        return 0;
    }

    public void f() {
        this.g();
        this.c();
    }

    @Override
    public int c() {
        return 3;
    }

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        return new S35PacketUpdateTileEntity(this.g, 3, nBTTagCompound);
    }

    public void a(String string) {
        this.p = string;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aaq_1(aSK2, this);
    }

    public float a() {
        if (!this.s) {
            return 0.0f;
        }
        int n = (int)(aV8.d(this.e) - this.k);
        this.k = aV8.d(this.e);
        if (n > 1) {
            this.j -= (float)n / 40.0f;
            if (this.j < 0.0f) {
                this.j = 0.0f;
            }
        }
        this.j += 0.025f;
        if (this.j > 1.0f) {
            this.j = 1.0f;
        }
        return this.j;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public ItemStack a(int n) {
        return this.m;
    }

    @Override
    public boolean e() {
        return this.p != null && !StringInvoker.g(this.p);
    }

    @Override
    public String getName() {
        return this.e() ? this.p : aXW.d;
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public void b() {
        if (aV8.d(this.e) % 80L == 0L) {
            this.f();
        }
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.m != null) {
            if (n2 >= this.m.a) {
                ItemStack itemStack = this.m;
                this.m = null;
                return itemStack;
            }
            this.m.a -= n2;
            return new ItemStack(act_2.k(this.m), n2, act_2.c(this.m));
        }
        return null;
    }

    @Override
    public void a(int n, int n2) {
        switch (n) {
            case 0: {
                this.n = n2;
                break;
            }
            case 1: {
                this.l = this.a(n2);
                break;
            }
            case 2: {
                this.o = this.a(n2);
            }
        }
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        tn_0.b(nBTTagCompound, aXW.e, this.l);
        tn_0.b(nBTTagCompound, aXW.a, this.o);
        tn_0.b(nBTTagCompound, aXW.h, this.n);
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.l = this.a(tn_0.g(nBTTagCompound, aXW.b));
        this.o = this.a(tn_0.g(nBTTagCompound, aXW.c));
        this.n = tn_0.g(nBTTagCompound, aXW.f);
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public int b() {
        return 1;
    }

    @Override
    public ItemStack b(int n) {
        if (this.m != null) {
            ItemStack itemStack = this.m;
            this.m = null;
            return itemStack;
        }
        return null;
    }

    private void c() {
        if (this.s && this.n > 0 && !this.e.isRemote && this.l > 0) {
            EntityPlayer entityPlayer;
            double d = this.n * 10 + 10;
            int n = 0;
            if (this.n >= 4 && this.l == this.o) {
                n = 1;
            }
            int n2 = amv_2.j(this.g);
            int n3 = amv_2.h(this.g);
            int n4 = amv_2.i(this.g);
            rm_2 rm_22 = h__0.a(h__0.d(new rm_2(n2, n3, n4, n2 + 1, n3 + 1, n4 + 1), d, d, d), 0.0, aV8.y(this.e), 0.0);
            List list = aV8.a(this.e, EntityPlayer.class, rm_22);
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                entityPlayer = (EntityPlayer)dz_0.b(iterator);
                a6w_0.a(entityPlayer, new a2l_0(this.l, 180, n, true, true));
            }
            if (this.n >= 4 && this.l != this.o && this.o > 0) {
                iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    entityPlayer = (EntityPlayer)dz_0.b(iterator);
                    a6w_0.a(entityPlayer, new a2l_0(this.o, 180, 0, true, true));
                }
            }
        }
    }

    @Override
    public String b() {
        return aXW.g;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return act_2.k(itemStack) == Items.emerald || act_2.k(itemStack) == Items.diamond || act_2.k(itemStack) == Items.gold_ingot || act_2.k(itemStack) == Items.iron_ingot;
    }

    @Override
    public double f() {
        return 65536.0;
    }

    @Override
    public boolean a(int n, int n2) {
        if (n == 1) {
            this.f();
            return true;
        }
        return super.a(n, n2);
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.m = itemStack;
    }

    @Override
    public int c(int n) {
        switch (n) {
            case 0: {
                return this.n;
            }
            case 1: {
                return this.l;
            }
            case 2: {
                return this.o;
            }
        }
        return 0;
    }
}

