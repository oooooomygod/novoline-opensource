/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import net.VT;
import net.aC8;
import net.aDb;
import net.aP2;
import net.ara_2;
import net.arc_0;

public class aVJ {
    private boolean b = false;
    private arc_0 a = null;
    private String d = null;
    private Class[] e = null;
    private Method c = null;

    public aVJ(arc_0 arc_02, String string, Class[] classArray) {
        this(arc_02, string, classArray, false);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static Method a(Class clazz, String string, Class[] classArray) {
        Method[] methodArray = ara_2.f(clazz);
        for (int i = 0; i < methodArray.length; ++i) {
            Class[] classArray2;
            Method method = methodArray[i];
            if (!VT.a(method).equals(string) || !aDb.a(classArray, classArray2 = VT.b(method))) continue;
            return method;
        }
        return null;
    }

    public boolean b() {
        return this.b ? this.c != null : this.a() != null;
    }

    public Class d() {
        aP2.b();
        Method method = this.a();
        return method == null ? null : method.getReturnType();
    }

    public Method a() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        aC8.a(this.a);
        return null;
    }

    public static Method[] a(Class clazz, String string) {
        ArrayList arrayList = new ArrayList();
        Method[] methodArray = ara_2.f(clazz);
        for (int i = 0; i < methodArray.length; ++i) {
            Method method = methodArray[i];
            if (!VT.a(method).equals(string)) continue;
            ListInvoker.add(arrayList, method);
        }
        Method[] methodArray2 = (Method[])ListInvoker.toArray(arrayList, new Method[ListInvoker.size(arrayList)]);
        return methodArray2;
    }

    public void c() {
        this.b = true;
        this.c = null;
    }

    public aVJ(arc_0 arc_02, String string, Class[] classArray, boolean bl) {
        this.a = arc_02;
        this.d = string;
        this.e = classArray;
        this.a();
    }

    public aVJ(arc_0 arc_02, String string) {
        this(arc_02, string, null, false);
    }
}

