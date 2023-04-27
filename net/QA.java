/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.awt.Color;
import net.minecraft.client.Minecraft;

public class QA
extends QR<Object> {
    private String r = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), api_2.a).toString();

    private static Object lambda$new$0() {
        return null;
    }

    @Override
    public void a(Minecraft minecraft, int n, int n2) {
        HZ.c();
        if (this.h) {
            return;
        }
        a1V.a((float)this.j, (float)(this.g - 1), (float)this.k, (float)(this.i + 2), (float)(this.m - 2), new Color(48, 49, 54));
        if (this.l != null) {
            a7l_0.a(this.f, (CharSequence)this.l, (float)this.j + (float)(this.k - a7l_0.a(this.f, this.l)) / 2.0f, this.g + 5, aol_1.b(new Color(198, 198, 198)));
        }
        this.b();
    }

    @Override
    protected void b() {
        HZ.c();
        String string = D9.a((ko_0)HU.a(this.o, 0), null);
        a7l_0.a(this.n, (CharSequence)string, (float)this.j + (float)(this.k - a7l_0.a(this.n, string)) / 2.0f, this.g + a7l_0.a(this.n) + 11, aol_1.b(new Color(198, 198, 198)));
        ListInvoker.b(new ListInvoker[3]);
    }

    private String lambda$new$1(Object object) {
        return this.r;
    }

    public QA(rl_0 rl_02, String string) {
        super(string, 0, 15, 200, 30, 15, QA::lambda$new$0, we_2.a, azo_0.a);
        HZ.b();
        this.j = (int)((float)(rl_02.n - this.k) / 2.0f);
        this.b(this::lambda$new$1);
        if (ListInvoker.b() != null) {
            HZ.b(false);
        }
    }

    public void b(String string) {
        this.r = string;
    }
}

