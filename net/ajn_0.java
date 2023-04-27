/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.PlayerInvoker;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.TimerUtil;

/*
 * Renamed from net.ajn
 */
public class ajn_0 {
    private boolean c;
    we_0 d;
    private int e;
    private Item[] f;
    private int a;
    private Item g;
    private String b;
    private boolean h;

    public boolean f() {
        return this.h;
    }

    public ajn_0(we_0 we_02, String string, Item item, int n, Item[] itemArray) {
        this.d = we_02;
        this.b = string;
        this.g = item;
        this.e = n;
        this.f = itemArray;
    }

    public void b(boolean bl) {
        this.c = bl;
    }

    public int a(Item item) {
        TimerUtil.e();
        int n = 0;
        aSK aSK2 = MCInvoker.f().player.inventory;
        int n2 = 9;
        ItemStack itemStack = InventoryInvoker.c(aSK2, n2);
        if (itemStack == null || act_2.k(itemStack) != null) {
            // empty if block
        }
        if (act_2.k(itemStack) == item) {
            n += itemStack.a;
        }
        ++n2;
        return n;
    }

    public boolean e() {
        Item[] itemArray = this.i();
        TimerUtil.e();
        int n = itemArray.length;
        int n2 = 0;
        if (n2 < n) {
            Item item = itemArray[n2];
            if (PlayerInvoker.b(we_0.a((we_0)this.d).player, item) < PlayerInvoker.a(we_0.a((we_0)this.d).player, this.i(), item)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public int a() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public int j() {
        return this.a;
    }

    public void d() {
        this.a(this.a + 1);
    }

    public void a(int n) {
        this.a = n;
    }

    public Item b() {
        return this.g;
    }

    public boolean h() {
        TimerUtil.e();
        return this.h && this.a < (this.c ? this.e + 1 : this.e);
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public boolean g() {
        return this.c;
    }

    public Item[] i() {
        return this.f;
    }
}

