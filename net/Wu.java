/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import net.aKQ;
import net.aL0;
import net.akt_0;
import net.apj_0;
import net.asg_0;
import net.ayw_2;
import net.dt_1;
import net.dz_0;
import net.my_0;

public class Wu {
    boolean a;
    private List<dt_1> b = my_0.c();

    public synchronized List<dt_1> b() {
        return asg_0.b(this.b);
    }

    public synchronized boolean a() {
        return this.a;
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = aKQ.a(string);
        String string3 = aKQ.b(string);
        string3 = aL0.a(aL0.a(aL0.a(new StringBuilder(), akt_0.b(inetAddress)), ayw_2.a), string3).toString();
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            dt_1 dt_12 = (dt_1)dz_0.b(iterator);
            if (!apj_0.c(dt_12).equals(string3)) continue;
            apj_0.a(dt_12);
            break;
        }
        ListInvoker.add(this.b, new dt_1(string2, string3));
        this.a = true;
    }

    public synchronized void c() {
        this.a = false;
    }
}

