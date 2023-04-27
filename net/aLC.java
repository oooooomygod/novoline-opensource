/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.util.List;
import net.a4o_0;
import net.aqf_2;
import net.asg_0;
import net.azq_0;
import net.k8_0;
import net.my_0;

public class aLC
implements Runnable {
    private volatile long e;
    private volatile boolean c;
    private List<a4o_0> d = asg_0.c(my_0.c());
    private volatile long b;
    private static aLC a = new aLC();

    private aLC() {
        Thread thread = new Thread((Runnable)this, k8_0.a);
        ThreadInvoker.a(thread, 1);
        ThreadInvoker.e(thread);
    }

    @Override
    public void run() {
        while (true) {
            this.c();
        }
    }

    public void a() throws InterruptedException {
        this.c = true;
        while (this.e != this.b) {
            ThreadInvoker.sleep(10L);
        }
        this.c = false;
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    private void c() {
        for (int i = 0; i < ListInvoker.size(this.d); ++i) {
            a4o_0 a4o_02 = (a4o_0)ListInvoker.get(this.d, i);
            aqf_2.a(a4o_02);
            ListInvoker.remove(this.d, i--);
            ++this.b;
            try {
                ThreadInvoker.sleep(this.c ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                azq_0.a(interruptedException);
            }
        }
        if (ListInvoker.isEmpty(this.d)) {
            try {
                ThreadInvoker.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                azq_0.a(interruptedException);
            }
        }
    }

    public void a(a4o_0 a4o_02) {
        if (!ListInvoker.contains(this.d, a4o_02)) {
            ++this.e;
            ListInvoker.add(this.d, a4o_02);
        }
    }

    public static aLC b() {
        return a;
    }
}

