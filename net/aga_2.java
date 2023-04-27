/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aga
 */
public class aga_2
implements avh_2 {
    protected Minecraft b;
    private R5 a;
    protected dt_1 d;
    private long c = 0L;

    public dt_1 a() {
        return this.d;
    }

    protected aga_2(R5 r5, dt_1 dt_12) {
        this.a = r5;
        this.d = dt_12;
        this.b = MCInvoker.f();
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        aWJ.a(this.a, n);
        if (MCInvoker.a() - this.c < 250L) {
            aWJ.a(this.a);
        }
        this.c = MCInvoker.a();
        return false;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        FontRendererInvoker.a(this.b.fontRendererObj, I18n.format(aZJ.b, new Object[0]), n2 + 32 + 3, n3 + 1, 0xFFFFFF);
        FontRendererInvoker.a(this.b.fontRendererObj, apj_0.b(this.d), n2 + 32 + 3, n3 + 12, 0x808080);
        if (this.b.gameSettings.i) {
            FontRendererInvoker.a(this.b.fontRendererObj, I18n.format(aZJ.a, new Object[0]), n2 + 32 + 3, n3 + 12 + 11, 0x303030);
        } else {
            FontRendererInvoker.a(this.b.fontRendererObj, apj_0.c(this.d), n2 + 32 + 3, n3 + 12 + 11, 0x303030);
        }
    }
}

