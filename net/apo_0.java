/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import net.aP2;
import net.tb_0;

/*
 * Renamed from net.aPo
 */
public class apo_0 {
    public long b = 0L;
    public long a = 0L;

    public void c() {
        aP2.b();
        if (tb_0.D && this.b == 0L) {
            this.b = SystemInvoker.nanoTime();
        }
    }

    static void a(apo_0 apo_02) {
        apo_02.a();
    }

    public void b() {
        aP2.b();
        if (tb_0.D && this.b != 0L) {
            this.a += SystemInvoker.nanoTime() - this.b;
            this.b = 0L;
        }
    }

    private void a() {
        this.a = 0L;
        this.b = 0L;
    }
}

