/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package net;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import net.J0;
import net.a52;
import net.aL0;

/*
 * Renamed from net.Js
 */
public class js_0
extends J0<Integer> {
    private ImmutableSet<Integer> c;

    protected js_0(String string, int n, int n2) {
        super(string, Integer.class);
        throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), a52.e), string), a52.d).toString());
    }

    @Override
    public Collection<Integer> c() {
        return this.c;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + this.c.hashCode();
        return n;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            js_0 js_02 = (js_0)object;
            return this.c.equals(js_02.c);
        }
        return false;
    }

    @Override
    public String a(Integer n) {
        return n.toString();
    }

    public static js_0 a(String string, int n, int n2) {
        return new js_0(string, n, n2);
    }
}

