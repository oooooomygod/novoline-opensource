/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import net.minecraft.block.Block;
import net.minecraft.crash.CrashReportCategory;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import net.minecraft.util.ReportedException;


public class aSK
implements rs_1 {
    public EntityPlayer f;
    public ItemStack[] b = new ItemStack[36];
    public ItemStack[] d = new ItemStack[4];
    private ItemStack c;
    public boolean e;
    public int a;

    @Override
    public void b(int n, ItemStack itemStack) {
        ItemStack[] itemStackArray = this.b;
        if (n >= itemStackArray.length) {
            n -= itemStackArray.length;
            itemStackArray = this.d;
        }
        itemStackArray[n] = itemStack;
    }

    public NBTTagList b(NBTTagList nBTTagList) {
        NBTTagCompound nBTTagCompound;
        int n;
        for (n = 0; n < this.b.length; ++n) {
            if (this.b[n] == null) continue;
            nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, aal_1.g, (byte)n);
            act_2.a(this.b[n], nBTTagCompound);
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        for (n = 0; n < this.d.length; ++n) {
            if (this.d[n] == null) continue;
            nBTTagCompound = new NBTTagCompound();
            tn_0.a(nBTTagCompound, aal_1.b, (byte)(n + 100));
            act_2.a(this.d[n], nBTTagCompound);
            kv_0.a(nBTTagList, nBTTagCompound);
        }
        return nBTTagList;
    }

    public void a(int n) {
        n = 1;
        n = -1;
        this.a -= n;
        while (this.a < 0) {
            this.a += 9;
        }
        while (this.a >= 9) {
            this.a -= 9;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(ItemStack itemStack) {
        if (itemStack.a == 0) return false;
        if (act_2.k(itemStack) == null) return false;
        try {
            int n;
            if (act_2.j(itemStack)) {
                int n2 = this.a();
                this.b[n2] = act_2.e(itemStack);
                this.b[n2].g = 5;
                itemStack.a = 0;
                return true;
            }
            do {
                n = itemStack.a;
                itemStack.a = this.d(itemStack);
            } while (itemStack.a > 0 && itemStack.a < n);
            if (itemStack.a == n && aSY.a(this.f.abilities)) {
                itemStack.a = 0;
                return true;
            }
            if (itemStack.a >= n) return false;
            return true;
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aal_1.d);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aal_1.e);
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aal_1.i, P8.d(px_0.a(act_2.k(itemStack))));
            CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aal_1.c, P8.d(act_2.c(itemStack)));
            CrashReportCategoryInvoker.a(crashReportCategory, aal_1.h, new cq_0(this, itemStack));
            throw new ReportedException(crashReport);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public ItemStack b(int n) {
        ItemStack[] itemStackArray = this.b;
        if (n >= this.b.length) {
            itemStackArray = this.d;
            n -= this.b.length;
        }
        if (itemStackArray[n] != null) {
            ItemStack itemStack = itemStackArray[n];
            itemStackArray[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public ItemStack a(int n) {
        ItemStack[] itemStackArray = this.b;
        if (n >= itemStackArray.length) {
            n -= itemStackArray.length;
            itemStackArray = this.d;
        }
        return itemStackArray[n];
    }

    @Override
    public void a() {
        a7r_0.b(this.b, null);
        a7r_0.b(this.d, null);
    }

    public ItemStack c(int n) {
        return this.d[n];
    }

    public ItemStack f() {
        return this.c;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    public float a(Block block) {
        float f = 1.0f;
        if (this.b[this.a] != null) {
            f *= this.b[this.a].a(block);
        }
        return f;
    }

    public void a(float f) {
        if ((f /= 4.0f) < 1.0f) {
            f = 1.0f;
        }
        for (int i = 0; i < this.d.length; ++i) {
            if (this.d[i] == null || !(act_2.k(this.d[i]) instanceof ItemArmor)) continue;
            act_2.damageItem(this.d[i], (int)f, this.f);
            if (this.d[i].a != 0) continue;
            this.d[i] = null;
        }
    }

    @Override
    public int c() {
        return 0;
    }

    public void e(ItemStack itemStack) {
        this.c = itemStack;
    }

    @Override
    public String getName() {
        return aal_1.a;
    }

    public void a(aSK aSK2) {
        int n;
        for (n = 0; n < this.b.length; ++n) {
            this.b[n] = act_2.e(aSK2.b[n]);
        }
        for (n = 0; n < this.d.length; ++n) {
            this.d[n] = act_2.e(aSK2.d[n]);
        }
        this.a = aSK2.a;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    public static int d() {
        return 9;
    }

    @Override
    public ItemStack b(int n, int n2) {
        ItemStack[] itemStackArray = this.b;
        if (n >= this.b.length) {
            itemStackArray = this.d;
            n -= this.b.length;
        }
        if (itemStackArray[n] != null) {
            if (itemStackArray[n].a <= n2) {
                ItemStack itemStack = itemStackArray[n];
                itemStackArray[n] = null;
                return itemStack;
            }
            ItemStack itemStack = act_2.b(itemStackArray[n], n2);
            if (itemStackArray[n].a == 0) {
                itemStackArray[n] = null;
            }
            return itemStack;
        }
        return null;
    }

    public int g() {
        int n = 0;
        for (int i = 0; i < this.d.length; ++i) {
            if (this.d[i] == null || !(act_2.k(this.d[i]) instanceof ItemArmor)) continue;
            int n2 = ((ItemArmor)act_2.k((ItemStack)this.d[i])).o;
            n += n2;
        }
        return n;
    }

    public boolean b(Item item) {
        this.a(item);
        return false;
    }

    private int d(ItemStack itemStack) {
        act_2.k(itemStack);
        int n = itemStack.a;
        this.b(itemStack);
        this.a();
        return n;
    }

    private int a(Item item, int n) {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] == null || act_2.k(this.b[i]) != item || act_2.c(this.b[i]) != n) continue;
            return i;
        }
        return -1;
    }

    public boolean b(Block block) {
        if (akm_1.a(BlocksInvoker.getBlockState(block))) {
            return true;
        }
        ItemStack itemStack = this.a(this.a);
        return act_2.b(itemStack, block);
    }

    private int b(ItemStack itemStack) {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] == null || act_2.k(this.b[i]) != act_2.k(itemStack) || !act_2.q(this.b[i]) || this.b[i].a >= act_2.f(this.b[i]) || this.b[i].a >= this.b() || act_2.t(this.b[i]) && act_2.c(this.b[i]) != act_2.c(itemStack) || !act_2.c(this.b[i], itemStack)) continue;
            return i;
        }
        return -1;
    }

    public boolean c(Item item) {
        this.a(item);
        return true;
    }

    private int a(Item item) {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] == null || act_2.k(this.b[i]) != item) continue;
            return i;
        }
        return -1;
    }

    public void e() {
        int n;
        for (n = 0; n < this.b.length; ++n) {
            if (this.b[n] == null) continue;
            a6w_0.a(this.f, this.b[n], true, false);
            this.b[n] = null;
        }
        for (n = 0; n < this.d.length; ++n) {
            if (this.d[n] == null) continue;
            a6w_0.a(this.f, this.d[n], true, false);
            this.d[n] = null;
        }
    }

    public void h() {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] == null) continue;
            act_2.a(this.b[i], this.f.worldObj, this.f, i, this.a == i);
        }
    }

    public void a(NBTTagList nBTTagList) {
        this.b = new ItemStack[36];
        this.d = new ItemStack[4];
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound = kv_0.g(nBTTagList, i);
            int n = tn_0.e(nBTTagCompound, aal_1.f) & 0xFF;
            ItemStack itemStack = act_2.a(nBTTagCompound);
            if (n < this.b.length) {
                this.b[n] = itemStack;
            }
            if (n < 100 || n >= this.d.length + 100) continue;
            this.d[n - 100] = itemStack;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return !this.f.isDead && a6w_0.b(entityPlayer, this.f) <= 64.0;
    }

    public ItemStack i() {
        return this.a < 9 && this.a >= 0 ? this.b[this.a] : null;
    }

    @Override
    public int e() {
        return this.b.length + 4;
    }

    @Override
    public void d() {
        this.e = true;
    }

    public void a(Item item, int n, boolean bl, boolean bl2) {
        ItemStack itemStack = this.i();
        int n2 = this.a(item, n);
        if (n2 < 9) {
            this.a = n2;
        } else {
            int n3 = this.a();
            if (n3 < 9) {
                this.a = n3;
            }
            if (!act_2.x(itemStack) || this.a(act_2.k(itemStack), act_2.s(itemStack)) != this.a) {
                int n4 = this.a(item, n);
                int n5 = this.b[n4].a;
                this.b[n4] = this.b[this.a];
                this.b[this.a] = new ItemStack(item, n5, n);
            }
        }
    }

    public int a() {
        for (int i = 0; i < this.b.length; ++i) {
            if (this.b[i] != null) continue;
            return i;
        }
        return -1;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    public aSK(EntityPlayer entityPlayer) {
        this.f = entityPlayer;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    public boolean c(ItemStack itemStack) {
        int n;
        for (n = 0; n < this.d.length; ++n) {
            if (this.d[n] == null || !act_2.a(this.d[n], itemStack)) continue;
            return true;
        }
        for (n = 0; n < this.b.length; ++n) {
            if (this.b[n] == null || !act_2.a(this.b[n], itemStack)) continue;
            return true;
        }
        return false;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    public int a(Item item, int n, int n2, NBTTagCompound nBTTagCompound) {
        int n3;
        ItemStack itemStack;
        int n4;
        int n5 = 0;
        for (n4 = 0; n4 < this.b.length; ++n4) {
            itemStack = this.b[n4];
            if (act_2.k(itemStack) != item || n > -1 && act_2.c(itemStack) != n || !S1.a(nBTTagCompound, act_2.a(itemStack), true)) continue;
            n3 = itemStack.a;
            n5 += n3;
            this.b[n4].a -= n3;
            if (this.b[n4].a == 0) {
                this.b[n4] = null;
            }
            if (n5 < n2) continue;
            return n5;
        }
        for (n4 = 0; n4 < this.d.length; ++n4) {
            itemStack = this.d[n4];
            if (act_2.k(itemStack) != item || n > -1 && act_2.c(itemStack) != n || !S1.a(nBTTagCompound, act_2.a(itemStack), false)) continue;
            n3 = itemStack.a;
            n5 += n3;
            this.d[n4].a -= n3;
            if (this.d[n4].a == 0) {
                this.d[n4] = null;
            }
            if (n5 < n2) continue;
            return n5;
        }
        if (this.c != null) {
            if (act_2.k(this.c) != item) {
                return n5;
            }
            if (n > -1 && act_2.c(this.c) != n) {
                return n5;
            }
            if (!S1.a(nBTTagCompound, act_2.a(this.c), false)) {
                return n5;
            }
            n4 = this.c.a;
            n5 += n4;
            this.c.a -= n4;
            if (this.c.a == 0) {
                this.c = null;
            }
            if (n5 >= n2) {
                return n5;
            }
        }
        return n5;
    }
}

