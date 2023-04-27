/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.lang.management.RuntimeMXBean;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import net.CrashReport;
import net.P8;
import net.aL0;
import net.auu_0;
import net.dz_0;
import net.r__0;
import net.yb_2;

/*
 * Renamed from net.ak_
 */
class ak__0
implements Callable {
    CrashReport b;
    private static String a = "CL_00001329";

    ak__0(CrashReport crashReport) {
        this.b = crashReport;
    }

    public String a() {
        RuntimeMXBean runtimeMXBean = yb_2.a();
        List list = auu_0.a(runtimeMXBean);
        int n = 0;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!StringInvoker.e((String)object, r__0.a)) continue;
            ++n;
            aL0.a(stringBuilder, object);
        }
        return StringInvoker.a(r__0.c, new Object[]{P8.d(n), stringBuilder.toString()});
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "fcQ+et*\u0014\u001c<\"".toCharArray();
        int n2 = 0;
        int n3 = 35;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 6));
            n3 = n3;
        }
    }
}

