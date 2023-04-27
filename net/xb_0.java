/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.XY;
import net.a0D;
import net.a3c_0;
import net.adk_2;

/*
 * Renamed from net.Xb
 */
public class xb_0
extends XY {
    private int d = -1;

    @Override
    protected void d() {
        this.d = -1;
    }

    public int a() {
        return this.d;
    }

    public xb_0(String string) {
        super(string);
    }

    public void b(int n) {
        a0D.k();
        if (this.b() >= 0 && this.d != n) {
            adk_2.e(this.b(), n);
            a3c_0.e(this.a());
            this.d = n;
        }
    }
}

