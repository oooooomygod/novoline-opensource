/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.StatBase;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8g
 */
class a8g_0
extends aiy_1 {
    R8 x;

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        StatBase statBase = (StatBase)ListInvoker.get(aop_1.g, n);
        anj_1.a(this.x, R8.q(this.x), aBO.d(NW.b(statBase)), n2 + 2, n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
        String string = NW.a(statBase, aQC.a(R8.k(this.x), statBase));
        anj_1.a(this.x, R8.b(this.x), string, n2 + 2 + 213 - FontRendererInvoker.a(R8.p(this.x), string), n3 + 1, n % 2 == 0 ? 0xFFFFFF : 0x909090);
    }

    public a8g_0(R8 r8, Minecraft minecraft) {
        this.x = r8;
        super(minecraft, r8.n, r8.f, 32, r8.f - 64, 10);
        this.a(false);
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected boolean c(int n) {
        return false;
    }

    @Override
    protected int f() {
        return ListInvoker.size(aop_1.g);
    }

    @Override
    protected void a() {
        anj_1.a(this.x);
    }

    @Override
    protected int e() {
        return this.f() * 10;
    }
}

