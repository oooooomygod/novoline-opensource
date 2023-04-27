/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Field;
import net.a30;
import net.aC8;
import net.aDC;
import net.aL0;
import net.aP2;
import net.aWR;
import net.ara_2;
import net.arc_0;
import net.avx_0;
import net.iv_2;
import net.ys_2;

/*
 * Renamed from net.aFj
 */
public class afj_0
implements a30 {
    private arc_0 a = null;
    private int c;
    private Class b = null;

    public afj_0(arc_0 arc_02, Class clazz, int n) {
        this.a = arc_02;
        this.b = clazz;
        this.c = n;
    }

    @Override
    public Field a() {
        Class clazz;
        block9: {
            int n;
            block10: {
                int n2;
                block11: {
                    aP2.b();
                    clazz = aC8.a(this.a);
                    if (clazz == null) {
                        return null;
                    }
                    Field[] fieldArray = ara_2.e(clazz);
                    n2 = 0;
                    n = 0;
                    if (n >= fieldArray.length) break block9;
                    Field field = fieldArray[n];
                    if (avx_0.e(field) != this.b) break block10;
                    try {
                        if (n2 != this.c) break block11;
                    }
                    catch (Throwable throwable) {
                        aWR.c(throwable);
                        return null;
                    }
                    avx_0.a(field, true);
                    return field;
                }
                ++n2;
            }
            ++n;
        }
        try {
            ys_2.e(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), iv_2.a), ara_2.b(clazz)), iv_2.d), this.b), iv_2.b), this.c), iv_2.c).toString());
            return null;
        }
        catch (SecurityException securityException) {
            aDC.a(securityException);
            return null;
        }
    }

    private static SecurityException a(SecurityException securityException) {
        return securityException;
    }

    public afj_0(arc_0 arc_02, Class clazz) {
        this(arc_02, clazz, 0);
    }
}

