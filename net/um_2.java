/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import net.ai2_0;
import net.asg_0;
import net.ua_1;
import net.ur_1;

/*
 * Renamed from net.um
 */
class um_2<T>
implements Iterable<T[]> {
    private Iterable<? extends T>[] b;
    private Class<T> a;

    private um_2(Class<T> clazz, Iterable<? extends T>[] iterableArray) {
        this.a = clazz;
        this.b = iterableArray;
    }

    um_2(Class clazz, Iterable[] iterableArray, ai2_0 ai2_02) {
        this(clazz, iterableArray);
    }

    @Override
    public Iterator<T[]> iterator() {
        return this.b.length <= 0 ? asg_0.b(ua_1.a(this.a, 0)).iterator() : new ur_1(this.a, this.b, null);
    }
}

