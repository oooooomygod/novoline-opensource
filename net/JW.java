/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;


public class JW
implements rs_1 {
    private ItemStack[] a = new ItemStack[1];

    @Override
    public int b() {
        return 64;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void a() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = null;
        }
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.a[0] = itemStack;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.a[0] != null) {
            ItemStack itemStack = this.a[0];
            this.a[0] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    @Override
    public void d() {
    }

    @Override
    public ItemStack a(int n) {
        return this.a[0];
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public String getName() {
        return FW.a;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public ItemStack b(int n) {
        if (this.a[0] != null) {
            ItemStack itemStack = this.a[0];
            this.a[0] = null;
            return itemStack;
        }
        return null;
    }
}

