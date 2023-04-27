/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.SortedMap;
import java.util.TreeMap;
import net.P8;
import net.a7r_0;
import net.af3_0;
import net.afq_1;
import net.ahy_0;
import net.ff_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.ayi
 */
public class ayi_1 {
    private SortedMap<Integer, af3_0> a;
    private Object[] b;

    public @NonNull af3_0 a() {
        return new afq_1(this.b, this.a);
    }

    public @NonNull ayi_1 a(Object ... objectArray) {
        this.b = a7r_0.a(objectArray, objectArray.length, Object[].class);
        return this;
    }

    protected ayi_1() {
        af3_0.b();
        this.b = new Object[]{ff_0.a};
        this.a = new TreeMap<Integer, af3_0>();
        if (ListInvoker.b() != null) {
            af3_0.b(new ListInvoker[5]);
        }
    }

    public @NonNull ayi_1 a(int n, @NonNull af3_0 af3_02) {
        ahy_0.a(this.a, P8.d(n), af3_02);
        return this;
    }
}

