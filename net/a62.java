/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.TileEntity;

public class a62
extends TileEntity {
    private ItemStack i;

    public void a(ItemStack itemStack) {
        this.i = itemStack;
        this.d();
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, aKV.d, 10)) {
            this.a(act_2.a(tn_0.d(nBTTagCompound, aKV.e)));
        } else if (tn_0.g(nBTTagCompound, aKV.b) > 0) {
            this.a(new ItemStack(px_0.a(tn_0.g(nBTTagCompound, aKV.c)), 1, 0));
        }
    }

    public ItemStack a() {
        return this.i;
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        if (this.a() != null) {
            tn_0.a(nBTTagCompound, aKV.a, (NBTBase)act_2.a(this.a(), new NBTTagCompound()));
        }
    }
}

