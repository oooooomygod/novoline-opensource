/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import net.I18n;
import net.a8l_0;
import net.avh_2;

public class aRY
implements avh_2 {
    a8l_0 c;
    private String b;
    private int a;

    @Override
    public void a(int n, int n2, int n3) {
    }

    public aRY(a8l_0 a8l_02, String string) {
        this.c = a8l_02;
        this.b = I18n.format(string, new Object[0]);
        this.a = FontRendererInvoker.a(a8l_0.c((a8l_0)a8l_02).fontRendererObj, this.b);
    }

    @Override
    public boolean a(int n, int n2, int n3, int n4, int n5, int n6) {
        return false;
    }

    @Override
    public void b(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        FontRendererInvoker.a(a8l_0.c((a8l_0)this.c).fontRendererObj, this.b, a8l_0.c((a8l_0)this.c).currentScreen.n / 2 - this.a / 2, n3 + n5 - FontRendererInvoker.d(a8l_0.c((a8l_0)this.c).fontRendererObj) - 1, 0xFFFFFF);
    }
}

