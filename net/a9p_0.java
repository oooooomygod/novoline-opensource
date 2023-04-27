/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.modules.configurations.annotation.Property;
import java.lang.reflect.Field;
import java.util.Map;

import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.a9p
 */
public class a9p_0<T>
extends a9j_0<T> {
    private static String d;

    public static @NonNull String a(@NonNull Field field, @NonNull Property property) {
        return atz_0.b(atz_0.a(), amt_0.a(property));
    }

    static {
        if (a9p_0.b() != null) {
            a9p_0.b("gjVBY");
        }
    }

    @Override
    protected void a(Map<String, akc_2> map, @NonNull Class<? super T> clazz) throws a68 {
        boolean bl = false;
        a9p_0.b();
        Field[] fieldArray = ara_2.e(clazz);
        int n = fieldArray.length;
        int n2 = 0;
        if (n2 < n) {
            Field field = fieldArray[n2];
            if (ara_2.a(cc.novoline.modules.configurations.property.Property.class, avx_0.e(field)) && avx_0.a(field, Property.class)) {
                bl = true;
                avx_0.a(field, true);
                aSM aSM2 = new aSM(field, null);
                Property property = (Property)avx_0.b(field, Property.class);
                String string = a9p_0.a(field, property);
                if (!MapInvoker.b(map, string)) {
                    MapInvoker.c(map, string, aSM2);
                }
            }
            ++n2;
        }
        super.a(map, clazz);
        if (ListInvoker.b() != null) {
            a9p_0.b("bdQtZb");
        }
    }

    private static a68 a(a68 a682) {
        return a682;
    }

    protected a9p_0(Class<T> clazz) throws a68 {
        super(clazz);
    }

    public static void b(String string) {
        d = string;
    }

    public static String b() {
        return d;
    }
}

