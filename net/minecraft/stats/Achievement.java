/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.stats;

import cc.novoline.invoke.ListInvoker;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.StatBase;
import net.minecraft.block.Block;
import net.HX;
import net.IStatStringFormat;
import net.Item;
import net.aBO;
import net.aL0;
import net.ac__0;
import net.ahq_0;
import net.anw_0;
import net.aoz_1;
import net.apf_0;
import net.ark_2;
import net.pd_0;

public class Achievement
extends StatBase {
    public Achievement n;
    public int o;
    private String s;
    private boolean m;
    public ItemStack theItemStack;
    private IStatStringFormat p;
    public int q;

    public Achievement c() {
        this.m = true;
        return this;
    }

    public Achievement e() {
        this.j = true;
        return this;
    }

    public boolean b() {
        return this.m;
    }

    @Override
    public Achievement a(Class<? extends ac__0> clazz) {
        return (Achievement)super.a(clazz);
    }

    public Achievement a(IStatStringFormat iStatStringFormat) {
        this.p = iStatStringFormat;
        return this;
    }

    public String d() {
        return this.p != null ? ark_2.a(this.p, ahq_0.b(this.s)) : ahq_0.b(this.s);
    }

    @Override
    public IChatComponent g() {
        IChatComponent iChatComponent = super.g();
        HX.a(aBO.f(iChatComponent), this.b() ? anw_0.DARK_PURPLE : anw_0.GREEN);
        return iChatComponent;
    }

    public Achievement(String string, String string2, int n, int n2, Block block, Achievement achievement) {
        this(string, string2, n, n2, new ItemStack(block), achievement);
    }

    public Achievement(String string, String string2, int n, int n2, ItemStack itemStack, Achievement achievement) {
        super(string, new aoz_1(aL0.a(aL0.a(new StringBuilder(), pd_0.c), string2).toString(), new Object[0]));
        this.theItemStack = itemStack;
        this.s = aL0.a(aL0.a(aL0.a(new StringBuilder(), pd_0.a), string2), pd_0.b).toString();
        this.o = n;
        this.q = n2;
        if (n < apf_0.A) {
            apf_0.A = n;
        }
        if (n2 < apf_0.F) {
            apf_0.F = n2;
        }
        if (n > apf_0.q) {
            apf_0.q = n;
        }
        if (n2 > apf_0.r) {
            apf_0.r = n2;
        }
        this.n = achievement;
    }

    public Achievement(String string, String string2, int n, int n2, Item item, Achievement achievement) {
        this(string, string2, n, n2, new ItemStack(item), achievement);
    }

    @Override
    public boolean a() {
        return true;
    }

    public Achievement f() {
        super.b();
        ListInvoker.add(apf_0.G, this);
        return this;
    }
}

