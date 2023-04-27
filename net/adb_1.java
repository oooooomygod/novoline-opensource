/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.adb
 */
public class adb_1
implements rs_1 {
    private int c;
    private ItemStack[] b;
    private Container d;
    private int a;

    @Override
    public String getName() {
        return fv_0.a;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.b[n] = itemStack;
        afy_2.a(this.d, this);
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public void a() {
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = null;
        }
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.b[n] != null) {
            if (this.b[n].a <= n2) {
                ItemStack itemStack = this.b[n];
                this.b[n] = null;
                afy_2.a(this.d, this);
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.b[n], n2);
            if (this.b[n].a == 0) {
                this.b[n] = null;
            }
            afy_2.a(this.d, this);
            return itemStack;
        }
        return null;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    public int a() {
        return this.c;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public ItemStack a(int n) {
        return n >= this.e() ? null : this.b[n];
    }

    public adb_1(Container container, int n, int n2) {
        int n3 = n * n2;
        this.b = new ItemStack[n3];
        this.d = container;
        this.a = n;
        this.c = n2;
    }

    @Override
    public void d() {
    }

    public int d() {
        return this.a;
    }

    public ItemStack a(int n, int n2) {
        return n < this.a && n2 <= this.c ? this.a(n + n2 * this.a) : null;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public int e() {
        return this.b.length;
    }

    @Override
    public ItemStack b(int n) {
        if (this.b[n] != null) {
            ItemStack itemStack = this.b[n];
            this.b[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public void a(int n, int n2) {
    }
}

