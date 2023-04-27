/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import net.FG;
import net.TG;
import net.UY;
import net.a7r_0;
import net.a8Z;
import net.aS0;
import net.aXJ;
import net.ad__0;
import net.ajD;
import net.anz_0;
import net.arv_2;
import net.asg_0;
import net.azm_0;
import net.dz_0;
import net.ki_0;
import net.u4_0;
import net.ul_1;
import net.uu_0;
import net.w2_0;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.u2
 */
public abstract class u2_0 {
    public static u2_0 a;
    public static u2_0 c;
    public static u2_0 b;

    private static aXJ lambda$getChildren$1(Object[] objectArray, Map.Entry entry) {
        UY.b(entry);
        ad__0 ad__02 = (ad__0)FG.a(entry);
        Object[] objectArray2 = u2_0.a(objectArray, FG.b(entry));
        return new aXJ<ad__0>(objectArray2, ad__02);
    }

    private static aXJ lambda$getChildren$0(Object[] objectArray, ad__0 ad__02) {
        UY.b(ad__02);
        ad__0 ad__03 = ad__02;
        Object[] objectArray2 = u2_0.a(objectArray, ki_0.n(ad__02));
        return new aXJ<ad__0>(objectArray2, ad__03);
    }

    static Iterator a(aXJ aXJ2) {
        return u2_0.b(aXJ2);
    }

    private static Object[] a(Object[] objectArray, Object object) {
        w2_0.d();
        if (objectArray.length == 1 && objectArray[0] == null) {
            return new Object[]{object};
        }
        Object[] objectArray2 = a7r_0.a(objectArray, objectArray.length + 1);
        objectArray2[objectArray2.length - 1] = object;
        return objectArray2;
    }

    public <T extends ad__0> void a(@NonNull T t, @NonNull BiConsumer<? super azm_0, ? super T> biConsumer) {
        w2_0.d();
        Iterator<a8Z<T>> iterator = this.b(t);
        if (dz_0.c(iterator)) {
            a8Z a8Z2 = (a8Z)dz_0.b(iterator);
            arv_2.a(biConsumer, ajD.b(a8Z2), ajD.a(a8Z2));
        }
    }

    private static <T extends ad__0> Iterator<aXJ<T>> b(aXJ<T> aXJ2) {
        T t = aXJ2.b();
        switch (TG.a[ki_0.m(t).ordinal()]) {
            case 1: {
                Object[] objectArray = aXJ2.a();
                return anz_0.a(ListInvoker.iterator(ki_0.h(t)), arg_0 -> u2_0.lambda$getChildren$0(objectArray, arg_0));
            }
            case 2: {
                Object[] objectArray = aXJ2.a();
                return anz_0.a(aS0.f(MapInvoker.b(ki_0.g(t))), arg_0 -> u2_0.lambda$getChildren$1(objectArray, arg_0));
            }
        }
        return asg_0.a();
    }

    public abstract <T extends ad__0> @NonNull Iterator<a8Z<T>> b(@NonNull T var1);

    public <T extends ad__0> @NonNull Iterator<T> a(@NonNull T t) {
        return anz_0.a(this.b(t), a8Z::b);
    }

    static {
        b = new ul_1();
        a = new uu_0();
        c = new u4_0();
    }
}

