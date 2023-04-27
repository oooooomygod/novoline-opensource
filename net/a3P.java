/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.init.Blocks;
import java.util.ArrayList;
import java.util.List;

public class a3P {
    private List<a9Z> a;
    private List<a9Z> b = new ArrayList<a9Z>();
    private List<IBlockState> c = new ArrayList<IBlockState>();

    public List<a9Z> a(a9Z a9Z2) {
        ListInvoker.set(this.a, 0, a9Z2);
        return this.a;
    }

    public IBlockState b(int n) {
        aP2.b();
        return n >= 0 && n < this.c.size() ? (IBlockState)ListInvoker.get(this.c, n) : BlocksInvoker.t(Blocks.air);
    }

    public a3P() {
        this.a = a7r_0.a(new a9Z[1]);
    }

    public int b() {
        return this.b.size();
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public a9Z a(int n) {
        return (a9Z)ListInvoker.get(this.b, n);
    }

    public void a(a9Z a9Z2, IBlockState iBlockState) {
        ListInvoker.add(this.b, a9Z2);
        ListInvoker.add(this.c, iBlockState);
    }
}

