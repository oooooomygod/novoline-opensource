/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import deobf.Packet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Renamed from net.wP
 */
public class wp_1
extends wo_0 {
    public List<aBN> i;
    private Map<EntityPlayer, aBN> h;
    public byte j;
    public byte[] d = new byte[16384];
    public Map<String, tc_2> e;
    public int f;
    public byte c;
    public int g;

    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        Object object;
        if (!MapInvoker.b(this.h, entityPlayer)) {
            aBN aBN2 = new aBN(this, entityPlayer);
            MapInvoker.c(this.h, entityPlayer, aBN2);
            ListInvoker.add(this.i, aBN2);
        }
        if (!InventoryInvoker.a(entityPlayer.inventory, itemStack)) {
            MapInvoker.a(this.e, a6w_0.C(entityPlayer));
        }
        for (int i = 0; i < ListInvoker.size(this.i); ++i) {
            object = (aBN)ListInvoker.get(this.i, i);
            if (!((aBN)object).c.isDead && (InventoryInvoker.a(((aBN)object).c.inventory, itemStack) || act_2.r(itemStack))) {
                if (act_2.r(itemStack) || ((aBN)object).c.dimension != this.j) continue;
                this.a(0, ((aBN)object).c.worldObj, a6w_0.C(((aBN)object).c), ((aBN)object).c.posX, ((aBN)object).c.posZ, ((aBN)object).c.rotationYaw);
                continue;
            }
            MapInvoker.a(this.h, ((aBN)object).c);
            ListInvoker.remove(this.i, object);
        }
        if (act_2.r(itemStack)) {
            no_2 no_22 = act_2.o(itemStack);
            object = yd_1.c(no_22);
            this.a(1, entityPlayer.worldObj, aL0.c(aL0.a(new StringBuilder(), up_2.q), yd_1.a(no_22)).toString(), amv_2.j((BlockPos)object), amv_2.i((BlockPos)object), SJ.j(no_22.aj) * 90);
        }
        if (act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), up_2.s, 9)) {
            NBTTagList nBTTagList = tn_0.c(act_2.a(itemStack), up_2.p, 10);
            for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
                NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
                if (MapInvoker.b(this.e, tn_0.m(nBTTagCompound, up_2.b))) continue;
                this.a(tn_0.e(nBTTagCompound, up_2.j), entityPlayer.worldObj, tn_0.m(nBTTagCompound, up_2.i), tn_0.n(nBTTagCompound, up_2.f), tn_0.n(nBTTagCompound, up_2.u), tn_0.n(nBTTagCompound, up_2.m));
            }
        }
    }

    public Packet a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        aBN cfr_ignored_0 = (aBN)MapInvoker.c(this.h, entityPlayer);
        return null;
    }

    private void a(int n, World world, String string, double d, double d2, double d3) {
        byte by;
        int n2 = 1 << this.c;
        float f = (float)(d - (double)this.g) / (float)n2;
        float f2 = (float)(d2 - (double)this.f) / (float)n2;
        byte by2 = (byte)((double)(f * 2.0f) + 0.5);
        byte by3 = (byte)((double)(f2 * 2.0f) + 0.5);
        int n3 = 63;
        if (f >= (float)(-n3) && f2 >= (float)(-n3) && f <= (float)n3 && f2 <= (float)n3) {
            by = (byte)((d3 += d3 < 0.0 ? -8.0 : 8.0) * 16.0 / 360.0);
            if (this.j < 0) {
                int n4 = (int)(uv_2.A(aV8.s(world)) / 10L);
                by = (byte)(n4 * n4 * 34187121 + n4 * 121 >> 15 & 0xF);
            }
        } else {
            if (MathInvoker.b(f) >= 320.0f || MathInvoker.b(f2) >= 320.0f) {
                MapInvoker.a(this.e, string);
                return;
            }
            n = 6;
            by = 0;
            if (f <= (float)(-n3)) {
                by2 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f2 <= (float)(-n3)) {
                by3 = (byte)((double)(n3 * 2) + 2.5);
            }
            if (f >= (float)n3) {
                by2 = (byte)(n3 * 2 + 1);
            }
            if (f2 >= (float)n3) {
                by3 = (byte)(n3 * 2 + 1);
            }
        }
        MapInvoker.c(this.e, string, new tc_2((byte)n, by2, by3, by));
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, up_2.g, this.j);
        tn_0.b(nBTTagCompound, up_2.w, this.g);
        tn_0.b(nBTTagCompound, up_2.a, this.f);
        tn_0.a(nBTTagCompound, up_2.t, this.c);
        tn_0.a(nBTTagCompound, up_2.e, (short)128);
        tn_0.a(nBTTagCompound, up_2.k, (short)128);
        tn_0.a(nBTTagCompound, up_2.o, this.d);
    }

    public wp_1(String string) {
        super(string);
        this.i = my_0.c();
        this.h = MapsInvoker.a();
        this.e = MapsInvoker.c();
    }

    public void a(double d, double d2, int n) {
        int n2 = 128 * (1 << n);
        int n3 = MathHelper.floor_double((d + 64.0) / (double)n2);
        int n4 = MathHelper.floor_double((d2 + 64.0) / (double)n2);
        this.g = n3 * n2 + n2 / 2 - 64;
        this.f = n4 * n2 + n2 / 2 - 64;
    }

    public void a(int n, int n2) {
        super.a();
        Iterator iterator = ListInvoker.iterator(this.i);
        while (dz_0.c(iterator)) {
            aBN aBN2 = (aBN)dz_0.b(iterator);
            UO.a(aBN2, n, n2);
        }
    }

    public aBN a(EntityPlayer entityPlayer) {
        aBN aBN2 = (aBN)MapInvoker.c(this.h, entityPlayer);
        aBN2 = new aBN(this, entityPlayer);
        MapInvoker.c(this.h, entityPlayer, aBN2);
        ListInvoker.add(this.i, aBN2);
        return aBN2;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        this.j = tn_0.e(nBTTagCompound, up_2.d);
        this.g = tn_0.g(nBTTagCompound, up_2.c);
        this.f = tn_0.g(nBTTagCompound, up_2.n);
        this.c = tn_0.e(nBTTagCompound, up_2.x);
        this.c = (byte)MathHelper.a(this.c, 0, 4);
        int n = tn_0.o(nBTTagCompound, up_2.v);
        int n2 = tn_0.o(nBTTagCompound, up_2.l);
        if (n == 128 && n2 == 128) {
            this.d = tn_0.j(nBTTagCompound, up_2.r);
        } else {
            byte[] byArray = tn_0.j(nBTTagCompound, up_2.h);
            this.d = new byte[16384];
            int n3 = (128 - n) / 2;
            int n4 = (128 - n2) / 2;
            for (int i = 0; i < n2; ++i) {
                int n5 = i + n4;
                if (n5 >= 128) continue;
                for (int j = 0; j < n; ++j) {
                    int n6 = j + n3;
                    if (n6 >= 128) continue;
                    this.d[n6 + n5 * 128] = byArray[j + i * n];
                }
            }
        }
    }
}

