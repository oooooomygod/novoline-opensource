/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import java.util.Iterator;
import net.a7r_0;
import net.anz_0;
import net.azm_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.cK
 */
public class ck_1
implements azm_0 {
    Object[] a;

    ck_1() {
    }

    @Override
    public int a() {
        return this.a.length;
    }

    @Override
    public @NonNull Iterator<Object> iterator() {
        return anz_0.a(this.a);
    }

    @Override
    public Object a(int n) {
        return this.a[n];
    }

    @Override
    public Object[] b() {
        return a7r_0.a(this.a, this.a.length);
    }
}

