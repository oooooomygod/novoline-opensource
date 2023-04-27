/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aP2;
import net.act_0;
import net.adw_2;
import net.xq_0;
import net.ys_2;

public class a0W {
    private act_0[] a = new act_0[0];

    public void a(act_0 act_02) {
        this.a = (act_0[])ys_2.a((Object[])this.a, (Object)act_02);
    }

    public boolean a(int n) {
        aP2.b();
        int n2 = 0;
        if (n2 < this.a.length) {
            act_0 act_02 = this.a[n2];
            if (act_02.a(n)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public int a() {
        return this.a.length;
    }

    public String toString() {
        aP2.b();
        StringBuffer stringBuffer = new StringBuffer();
        adw_2.a(stringBuffer, xq_0.a);
        int n = 0;
        if (n < this.a.length) {
            act_0 act_02 = this.a[n];
            adw_2.a(stringBuffer, xq_0.b);
            adw_2.a(stringBuffer, act_02.toString());
            ++n;
        }
        adw_2.a(stringBuffer, xq_0.c);
        return stringBuffer.toString();
    }

    public act_0 b(int n) {
        return this.a[n];
    }
}

