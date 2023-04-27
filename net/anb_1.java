/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.anB
 */
public class anb_1
implements rs_1 {
    private EntityPlayer a;
    private ahh_0 b;
    private ItemStack[] d = new ItemStack[3];
    private a7K e;
    private int c;

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.d[n] != null) {
            if (n == 2) {
                ItemStack itemStack = this.d[n];
                this.d[n] = null;
                return itemStack;
            }
            if (this.d[n].a <= n2) {
                ItemStack itemStack = this.d[n];
                this.d[n] = null;
                if (this.a(n)) {
                    this.b();
                }
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.d[n], n2);
            if (this.d[n].a == 0) {
                this.d[n] = null;
            }
            if (this.a(n)) {
                this.b();
            }
            return itemStack;
        }
        return null;
    }

    public void b() {
        this.b = null;
        ItemStack cfr_ignored_0 = this.d[0];
        ItemStack itemStack = this.d[1];
        itemStack = null;
        this.b(2, null);
        ze_1.a(this.e, this.a(2));
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    private boolean a(int n) {
        return n == 1;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public void d() {
        this.b();
    }

    @Override
    public ItemStack b(int n) {
        if (this.d[n] != null) {
            ItemStack itemStack = this.d[n];
            this.d[n] = null;
            return itemStack;
        }
        return null;
    }

    public ahh_0 a() {
        return this.b;
    }

    @Override
    public String getName() {
        return aKC.a;
    }

    @Override
    public void a() {
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i] = null;
        }
    }

    @Override
    public ItemStack a(int n) {
        return this.d[n];
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.d[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
        if (this.a(n)) {
            this.b();
        }
    }

    public void b(int n) {
        this.c = n;
        this.b();
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return ze_1.a(this.e) == entityPlayer;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    public anb_1(EntityPlayer entityPlayer, a7K a7K2) {
        this.a = entityPlayer;
        this.e = a7K2;
    }

    @Override
    public int e() {
        return this.d.length;
    }

    @Override
    public int c(int n) {
        return 0;
    }
}

