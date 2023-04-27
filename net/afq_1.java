/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import net.FG;
import net.P8;
import net.aS0;
import net.ad__0;
import net.af3_0;
import net.ahy_0;
import net.dz_0;
import net.ki_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.afQ
 */
class afq_1
extends af3_0 {
    private SortedMap<Integer, af3_0> d;
    private Object[] c;

    @Override
    public void a(@NonNull ad__0 ad__02) {
        af3_0.b();
        ad__0 ad__03 = ki_0.a(ad__02, this.c);
        int n = ki_0.a(ad__03, -1);
        Iterator iterator = aS0.f(ahy_0.a(this.d));
        if (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (P8.b((Integer)FG.b(entry)) <= n) {
                ListInvoker.b(new ListInvoker[3]);
            }
            ((af3_0)FG.a(entry)).a(ad__02);
            n = P8.b((Integer)FG.b(entry));
        }
        ki_0.a(ad__03, P8.d(n));
    }

    afq_1(Object[] objectArray, SortedMap<Integer, af3_0> sortedMap) {
        this.c = objectArray;
        this.d = sortedMap;
    }
}

