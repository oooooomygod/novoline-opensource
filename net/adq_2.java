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
 * Renamed from net.adq
 */
public class adq_2
implements aHP {
    private aHP b;
    private String a;
    private aHP c;

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aaz_0(aSK2, this, entityPlayer);
    }

    @Override
    public void a() {
        this.b.a();
        this.c.a();
    }

    @Override
    public ItemStack b(int n, int n2) {
        return n >= this.b.e() ? this.c.b(n - this.b.e(), n2) : this.b.b(n, n2);
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        this.b.c(entityPlayer);
        this.c.c(entityPlayer);
    }

    @Override
    public boolean d() {
        return this.b.d() || this.c.d();
    }

    @Override
    public ItemStack a(int n) {
        return n >= this.b.e() ? this.c.a(n - this.b.e()) : this.b.a(n);
    }

    @Override
    public boolean e() {
        return this.b.e() || this.c.e();
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.e() ? new ChatComponentText(this.getName()) : new aoz_1(this.getName(), new Object[0]);
    }

    public adq_2(String string, aHP aHP2, aHP aHP3) {
        this.a = string;
        aHP3 = aHP2 = aHP3;
        this.b = aHP2;
        this.c = aHP3;
        if (aHP2.d()) {
            aHP3.a(aHP2.e());
        } else if (aHP3.d()) {
            aHP2.a(aHP3.e());
        }
    }

    @Override
    public String getName() {
        return this.b.e() ? this.b.getName() : (this.c.e() ? this.c.getName() : this.a);
    }

    public boolean a(rs_1 rs_12) {
        return this.b == rs_12 || this.c == rs_12;
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        if (n >= this.b.e()) {
            this.c.b(n - this.b.e(), itemStack);
        } else {
            this.b.b(n, itemStack);
        }
    }

    @Override
    public void d() {
        this.b.d();
        this.c.d();
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
        this.b.b(entityPlayer);
        this.c.b(entityPlayer);
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public int e() {
        return this.b.e() + this.c.e();
    }

    @Override
    public String b() {
        return this.b.b();
    }

    @Override
    public void a(DD dD) {
        this.b.a(dD);
        this.c.a(dD);
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public ItemStack b(int n) {
        return n >= this.b.e() ? this.c.b(n - this.b.e()) : this.b.b(n);
    }

    @Override
    public int b() {
        return this.b.b();
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public DD e() {
        return this.b.e();
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return this.b.a(entityPlayer) && this.c.a(entityPlayer);
    }
}

