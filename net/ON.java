/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Constructor;
import net.aC8;
import net.aDb;
import net.aP2;
import net.ap6_0;
import net.ara_2;
import net.arc_0;

public class ON {
    private boolean c = false;
    private Class[] b = null;
    private arc_0 a = null;
    private Constructor d = null;

    public ON(arc_0 arc_02, Class[] classArray) {
        this.a = arc_02;
        this.b = classArray;
        this.a();
    }

    private static Constructor a(Class clazz, Class[] classArray) {
        Constructor[] constructorArray = ara_2.j(clazz);
        for (int i = 0; i < constructorArray.length; ++i) {
            Constructor constructor = constructorArray[i];
            Class[] classArray2 = ap6_0.a(constructor);
            if (!aDb.a(classArray, classArray2)) continue;
            return constructor;
        }
        return null;
    }

    public Constructor a() {
        if (this.c) {
            return this.d;
        }
        this.c = true;
        aC8.a(this.a);
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public boolean c() {
        aP2.b();
        return this.c ? this.d != null : this.a() != null;
    }

    public void b() {
        this.c = true;
        this.d = null;
    }
}

