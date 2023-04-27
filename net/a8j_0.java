/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.Tessellator;
import java.util.List;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8j
 */
public abstract class a8j_0
extends aij_1 {
    protected Minecraft x;
    protected List<sg_1> y;

    @Override
    public int d() {
        return this.r;
    }

    @Override
    public sg_1 a(int n) {
        return (sg_1)ListInvoker.get(this.a(), n);
    }

    @Override
    protected int f() {
        return ListInvoker.size(this.a());
    }

    @Override
    protected int h() {
        return this.a - 6;
    }

    @Override
    protected void a(int n, int n2, Tessellator tessellator) {
        String string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.UNDERLINE), aLv.a), (Object)anw_0.BOLD), this.b()).toString();
        FontRendererInvoker.a(this.x.fontRendererObj, string, n + this.r / 2 - FontRendererInvoker.a(this.x.fontRendererObj, string) / 2, MathInvoker.b(this.l + 3, n2), 0xFFFFFF);
    }

    protected abstract String b();

    public a8j_0(Minecraft minecraft, int n, int n2, List<sg_1> list) {
        super(minecraft, n, n2, 32, n2 - 55 + 4, 36);
        this.x = minecraft;
        this.y = list;
        this.f = false;
        this.a(true, (int)((float)FontRendererInvoker.d(minecraft.fontRendererObj) * 1.5f));
    }

    public List<sg_1> a() {
        return this.y;
    }
}

