/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.wU
 */
public class wu_0
implements rs_1 {
    private List<B2> b;
    private ItemStack[] d;
    private int c;
    private boolean e;
    private String a;

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public String getName() {
        return this.a;
    }

    @Override
    public boolean e() {
        return this.e;
    }

    public void a(String string) {
        this.e = true;
        this.a = string;
    }

    @Override
    public void a(int n, int n2) {
    }

    public ItemStack a(ItemStack itemStack) {
        ItemStack itemStack2 = act_2.C(itemStack);
        int n = 0;
        if (n < this.c) {
            this.a(n);
            this.b(n, itemStack2);
            this.d();
            return null;
        }
        if (itemStack2.a != itemStack.a) {
            this.d();
        }
        return itemStack2;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.d[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
        this.d();
    }

    public void b(B2 b2) {
        if (this.b == null) {
            this.b = my_0.c();
        }
        ListInvoker.add(this.b, b2);
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    public wu_0(IChatComponent iChatComponent, int n) {
        this(aBO.d(iChatComponent), true, n);
    }

    @Override
    public ItemStack a(int n) {
        return n < this.d.length ? this.d[n] : null;
    }

    public void a(B2 b2) {
        ListInvoker.remove(this.b, b2);
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.d[n] != null) {
            if (this.d[n].a <= n2) {
                ItemStack itemStack = this.d[n];
                this.d[n] = null;
                this.d();
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.d[n], n2);
            if (this.d[n].a == 0) {
                this.d[n] = null;
            }
            this.d();
            return itemStack;
        }
        return null;
    }

    public wu_0(String string, boolean bl, int n) {
        this.a = string;
        this.e = bl;
        this.c = n;
        this.d = new ItemStack[n];
    }

    @Override
    public int e() {
        return this.c;
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

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public void d() {
        if (this.b != null) {
            Iterator iterator = ListInvoker.iterator(this.b);
            while (dz_0.c(iterator)) {
                B2 b2 = (B2)dz_0.b(iterator);
                xs_1.a(b2, this);
            }
        }
    }

    @Override
    public void a() {
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i] = null;
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }
}

