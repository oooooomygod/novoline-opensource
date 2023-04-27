/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.a8k
 */
class a8k_0
extends aiy_1 {
    SI x;

    public a8k_0(SI sI, Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        this.x = sI;
        super(minecraft, n, n2, n3 + 30, n4, 18);
    }

    @Override
    protected void a() {
        uk_0.a(this.x);
    }

    @Override
    protected boolean c(int n) {
        return false;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        int n4 = awc_2.b(acu_0.a(ajP.values()[n]));
        fo_0.a(fo_0.a(), n4);
        akw_2.a(fo_0.a().d, n4);
    }

    @Override
    protected int f() {
        return ajP.values().length;
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        uk_0.a(this.x, this.n.fontRendererObj, aL0.a(aL0.a(new StringBuilder(), fo_0.a(fo_0.a()) == awc_2.b(acu_0.a(ajP.values()[n])) ? aL0.a(aL0.a(new StringBuilder(), anw_0.GREEN.toString()), (Object)anw_0.BOLD).toString() : anw_0.GRAY.toString()), awc_2.a(acu_0.a(awc_2.b(acu_0.a(ajP.values()[n]))))).toString(), this.r / 2, n3 + 2, -1);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(0.5, 0.5, 0.5);
        uk_0.a(this.x, this.n.fontRendererObj, aL0.c(aL0.a(new StringBuilder(), aab_0.a), awc_2.b(acu_0.a(awc_2.b(acu_0.a(ajP.values()[n]))))).toString(), this.r, (n3 + 2) * 2 + 20, -1);
        GlStateManagerInvoker.popMatrix();
    }
}

