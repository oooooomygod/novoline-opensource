/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;

class a8c
extends aiy_1 {
    private List<a9Q> x;
    R8 y;

    public a8c(R8 r8, Minecraft minecraft) {
        this.y = r8;
        super(minecraft, r8.n, r8.f, 32, r8.f - 64, FontRendererInvoker.d(R8.f(r8)) * 4);
        this.x = my_0.c();
        this.a(false);
        Iterator iterator = ms_0.a(ai7_0.d.values());
        while (dz_0.c(iterator)) {
            a9Q a9Q2 = (a9Q)dz_0.b(iterator);
            if (aQC.a(R8.k(r8), a9Q2.e) <= 0 && aQC.a(R8.k(r8), a9Q2.d) <= 0) continue;
            ListInvoker.add(this.x, a9Q2);
        }
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean c(int n) {
        return false;
    }

    @Override
    protected void a() {
        anj_1.a(this.y);
    }

    @Override
    protected int e() {
        return this.f() * FontRendererInvoker.d(R8.s(this.y)) * 4;
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.x);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        a9Q a9Q2 = (a9Q)ListInvoker.get(this.x, n);
        String string = I18n.format(aL0.a(aL0.a(aL0.a(new StringBuilder(), aFQ.c), ub_1.a(a9Q2.c)), aFQ.e).toString(), new Object[0]);
        int n7 = aQC.a(R8.k(this.y), a9Q2.e);
        int n8 = aQC.a(R8.k(this.y), a9Q2.d);
        String string2 = I18n.format(aFQ.b, new Object[]{P8.d(n7), string});
        String string3 = I18n.format(aFQ.d, new Object[]{string, P8.d(n8)});
        string2 = I18n.format(aFQ.a, new Object[]{string});
        string3 = I18n.format(aFQ.f, new Object[]{string});
        anj_1.a(this.y, R8.c(this.y), string, n2 + 2 - 10, n3 + 1, 0xFFFFFF);
        anj_1.a(this.y, R8.o(this.y), string2, n2 + 2, n3 + 1 + FontRendererInvoker.d(R8.i(this.y)), 0x606060);
        anj_1.a(this.y, R8.g(this.y), string3, n2 + 2, n3 + 1 + FontRendererInvoker.d(R8.l(this.y)) * 2, 0x606060);
    }
}

