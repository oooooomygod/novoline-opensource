/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S35PacketUpdateTileEntity;
import java.util.List;

public class a6L
extends TileEntity {
    private int n;
    private List<qv_2> l;
    private NBTTagList j;
    private boolean i;
    private String m;
    private List<YZ> k;

    public void c(ItemStack itemStack) {
        this.j = null;
        if (act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), aul_0.j, 10)) {
            NBTTagCompound nBTTagCompound = tn_0.d(act_2.a(itemStack), aul_0.q);
            if (tn_0.b(nBTTagCompound, aul_0.p)) {
                this.j = (NBTTagList)kv_0.b(tn_0.c(nBTTagCompound, aul_0.r, 10));
            }
            this.n = tn_0.a(nBTTagCompound, aul_0.f, 99) ? tn_0.g(nBTTagCompound, aul_0.l) : act_2.c(itemStack) & 0xF;
        } else {
            this.n = act_2.c(itemStack) & 0xF;
        }
        this.l = null;
        this.k = null;
        this.m = aul_0.w;
        this.i = true;
    }

    public static int a(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, aul_0.m, false);
        return tn_0.b(nBTTagCompound, aul_0.u) ? tn_0.g(nBTTagCompound, aul_0.k) : act_2.c(itemStack);
    }

    public List<YZ> c() {
        this.b();
        return this.k;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        a6L.a(nBTTagCompound, this.n, this.j);
    }

    @Override
    public Packet g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        this.c(nBTTagCompound);
        return new S35PacketUpdateTileEntity(this.g, 6, nBTTagCompound);
    }

    public static int b(ItemStack itemStack) {
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, aul_0.x, false);
        return tn_0.b(nBTTagCompound, aul_0.g) ? kv_0.c(tn_0.c(nBTTagCompound, aul_0.i, 10)) : 0;
    }

    public int d() {
        return this.n;
    }

    public String f() {
        this.b();
        return this.m;
    }

    public static void a(NBTTagCompound nBTTagCompound, int n, NBTTagList nBTTagList) {
        tn_0.b(nBTTagCompound, aul_0.t, n);
        tn_0.a(nBTTagCompound, aul_0.n, nBTTagList);
    }

    public List<qv_2> e() {
        this.b();
        return this.l;
    }

    public NBTTagList a() {
        return this.j;
    }

    public static void d(ItemStack itemStack) {
        NBTTagList nBTTagList;
        NBTTagCompound nBTTagCompound = act_2.a(itemStack, aul_0.a, false);
        if (tn_0.a(nBTTagCompound, aul_0.v, 9) && kv_0.c(nBTTagList = tn_0.c(nBTTagCompound, aul_0.b, 10)) > 0) {
            kv_0.e(nBTTagList, kv_0.c(nBTTagList) - 1);
            if (kv_0.a(nBTTagList)) {
                tn_0.a(act_2.a(itemStack), aul_0.d);
                if (tn_0.b(act_2.a(itemStack))) {
                    act_2.b(itemStack, (NBTTagCompound)null);
                }
            }
        }
    }

    private void b() {
        if (this.l == null || this.k == null || this.m == null) {
            if (!this.i) {
                this.m = aul_0.y;
            } else {
                this.l = my_0.c();
                this.k = my_0.c();
                ListInvoker.add(this.l, (Object)qv_2.BASE);
                ListInvoker.add(this.k, my_2.b(this.n));
                this.m = aL0.c(aL0.a(new StringBuilder(), aul_0.c), this.n).toString();
                if (this.j != null) {
                    for (int i = 0; i < kv_0.c(this.j); ++i) {
                        NBTTagCompound nBTTagCompound = kv_0.g(this.j, i);
                        qv_2 qv_22 = aib_0.a(tn_0.m(nBTTagCompound, aul_0.h));
                        ListInvoker.add(this.l, (Object)qv_22);
                        int n = tn_0.g(nBTTagCompound, aul_0.o);
                        ListInvoker.add(this.k, my_2.b(n));
                        this.m = aL0.c(aL0.a(aL0.a(new StringBuilder(), this.m), aib_0.a(qv_22)), n).toString();
                    }
                }
            }
        }
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        this.n = tn_0.g(nBTTagCompound, aul_0.e);
        this.j = tn_0.c(nBTTagCompound, aul_0.s, 10);
        this.l = null;
        this.k = null;
        this.m = null;
        this.i = true;
    }
}

