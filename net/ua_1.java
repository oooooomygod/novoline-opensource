/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.DZ;
import net.JI;
import net.OV;
import net.aUR;
import net.dz_0;
import net.my_0;
import net.um_2;

/*
 * Renamed from net.uA
 */
public class ua_1 {
    private static <T> Iterable<List<T>> b(Iterable<Object[]> iterable) {
        return DZ.a(iterable, new aUR(null));
    }

    private static <T> T[] b(Class<? super T> clazz, int n) {
        return (Object[])JI.a(clazz, n);
    }

    private static <T> T[] b(Class<? super T> clazz, Iterable<? extends T> iterable) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = OV.a(iterable);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            ListInvoker.add(arrayList, object);
        }
        return ListInvoker.toArray(arrayList, ua_1.b(clazz, ListInvoker.size(arrayList)));
    }

    public static <T> Iterable<T[]> a(Class<T> clazz, Iterable<? extends Iterable<? extends T>> iterable) {
        return new um_2(clazz, ua_1.b(Iterable.class, iterable), null);
    }

    public static <T> Iterable<List<T>> a(Iterable<? extends Iterable<? extends T>> iterable) {
        return ua_1.b(ua_1.a(Object.class, iterable));
    }

    static Object[] a(Class clazz, int n) {
        return ua_1.b(clazz, n);
    }
}

