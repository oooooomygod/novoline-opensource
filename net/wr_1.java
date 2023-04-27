/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;

/*
 * Renamed from net.wR
 */
public class wr_1
extends wu_0 {
    private a6R f;

    @Override
    public void b(EntityPlayer entityPlayer) {
        if (this.f != null) {
            aDH.c(this.f);
        }
        super.b(entityPlayer);
    }

    public void a(a6R a6R2) {
        this.f = a6R2;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return (this.f == null || aDH.a(this.f, entityPlayer)) && super.a(entityPlayer);
    }

    public void a(NBTTagList nBTTagList) {
        int n;
        for (n = 0; n < this.e(); ++n) {
            this.b(n, null);
        }
        for (n = 0; n < kv_0.c(nBTTagList); ++n) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, n);
            int n2 = tn_0.e(nBTTagCompound, ald_1.b) & 0xFF;
            if (n2 >= this.e()) continue;
            this.b(n2, act_2.a(nBTTagCompound));
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        if (this.f != null) {
            aDH.d(this.f);
        }
        super.c(entityPlayer);
        this.f = null;
    }

    public NBTTagList a() {
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.e(); ++i) {
            ItemStack itemStack = this.a(i);
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, ald_1.a, (byte)i);
            act_2.a(itemStack, nBTTagCompound);
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        return nBTTagList;
    }

    public wr_1() {
        super(ald_1.c, false, 27);
    }
}

