/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aI2;
import net.aL0;
import net.aP2;
import net.aVJ;
import net.aWR;
import net.ahy_1;
import net.ara_2;
import net.ys_2;

/*
 * Renamed from net.aRc
 */
public class arc_0 {
    private boolean b = false;
    private String a = null;
    private Class c = null;

    public Class b() {
        if (this.b) {
            return this.c;
        }
        this.b = true;
        try {
            try {
                this.c = ara_2.a(this.a);
            }
            catch (ClassNotFoundException classNotFoundException) {
                ys_2.e(aL0.a(aL0.a(new StringBuilder(), aI2.a), this.a).toString());
            }
        }
        catch (Throwable throwable) {
            aWR.c(throwable);
        }
        return this.c;
    }

    public aVJ a(String string, Class[] classArray) {
        return new aVJ(this, string, classArray);
    }

    public boolean c() {
        return this.b() != null;
    }

    public aVJ a(String string, Class[] classArray, boolean bl) {
        return new aVJ(this, string, classArray, bl);
    }

    public arc_0(String string, boolean bl) {
        this.a = string;
        this.b();
    }

    public String a() {
        return this.a;
    }

    public ahy_1 b(String string) {
        return new ahy_1(this, string);
    }

    private static ClassNotFoundException a(ClassNotFoundException classNotFoundException) {
        return classNotFoundException;
    }

    public arc_0(String string) {
        this(string, false);
    }

    public arc_0(Class clazz) {
        this.c = clazz;
        this.a = ara_2.b(clazz);
        this.b = true;
    }

    public aVJ a(String string) {
        return new aVJ(this, string);
    }

    public boolean a(Object object) {
        aP2.b();
        return this.b() == null ? false : this.b().isInstance(object);
    }
}

