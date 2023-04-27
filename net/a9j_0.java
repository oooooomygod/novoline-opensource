/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import net.U;
import net.UY;
import net.Va;
import net.a68;
import net.aCN;
import net.aL0;
import net.aSS;
import net.akc_2;
import net.ap6_0;
import net.ara_2;
import net.ato_0;
import net.avx_0;
import net.axv_1;
import net.vu_1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from net.a9j
 */
public class a9j_0<T> {
    private Constructor<T> b;
    private Map<String, akc_2> a;
    protected Class<T> c;

    public boolean a() {
        return this.b != null;
    }

    public Class<T> d() {
        return this.c;
    }

    public vu_1 b(T t) {
        return new vu_1(this, t);
    }

    public static <T> vu_1 a(@NotNull T t) throws a68 {
        return a9j_0.a(UY.b(t).getClass()).b(t);
    }

    static Map a(a9j_0 a9j_02) {
        return a9j_02.a;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static <T> a9j_0<T> a(@NotNull Class<T> clazz) throws a68 {
        return aCN.a(U.a(), clazz);
    }

    public vu_1 e() throws a68 {
        return new vu_1(this, this.c());
    }

    protected T c() throws a68 {
        a68.b();
        if (this.b == null) {
            throw new a68(aL0.a(aL0.a(aL0.a(new StringBuilder(), axv_1.c), this.c), axv_1.a).toString());
        }
        try {
            return (T)ap6_0.a(this.b, new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException reflectiveOperationException) {
            throw new a68(aL0.a(aL0.a(new StringBuilder(), axv_1.b), this.c).toString(), reflectiveOperationException);
        }
    }

    protected void a(Map<String, akc_2> map, Class<? super T> clazz) throws a68 {
        a68.b();
        Field[] fieldArray = ara_2.e(clazz);
        int n = fieldArray.length;
        int n2 = 0;
        if (n2 < n) {
            Field field = fieldArray[n2];
            if (avx_0.a(field, ato_0.class)) {
                ato_0 ato_02 = (ato_0)avx_0.b(field, ato_0.class);
                String string = Va.a(ato_02);
                if (StringInvoker.g(string)) {
                    throw new a68(axv_1.d);
                }
                aSS aSS2 = new aSS(field, Va.b(ato_02));
                avx_0.a(field, true);
                if (!MapInvoker.b(map, string)) {
                    MapInvoker.c(map, string, aSS2);
                }
            }
            ++n2;
        }
    }

    protected a9j_0(Class<T> clazz) throws a68 {
        a68.b();
        this.a = new LinkedHashMap<String, akc_2>();
        this.c = clazz;
        Constructor constructor = null;
        try {
            constructor = ara_2.a(clazz, new Class[0]);
            ap6_0.a(constructor, true);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        this.b = constructor;
        Class clazz2 = clazz;
        do {
            this.a(this.a, clazz2);
        } while (!(clazz2 = ara_2.a(clazz2)).equals(Object.class));
        ListInvoker.b(new ListInvoker[4]);
    }

    public Class<T> b() {
        return this.c;
    }
}

