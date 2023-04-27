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
import net.ih_0;
import net.ys_2;

/*
 * Renamed from net.abk
 */
public class abk_2
implements a30 {
    private String b = null;
    private arc_0 a = null;

    public abk_2(arc_0 arc_02, String string) {
        this.a = arc_02;
        this.b = string;
    }

    @Override
    public Field a() {
        aP2.b();
        Class clazz = aC8.a(this.a);
        if (clazz == null) {
            return null;
        }
        try {
            try {
                Field field = ara_2.a(clazz, this.b);
                avx_0.a(field, true);
                return field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                ys_2.e(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ih_0.a), ara_2.b(clazz)), ih_0.b), this.b).toString());
                return null;
            }
            catch (SecurityException securityException) {
                aDC.a(securityException);
                return null;
            }
        }
        catch (Throwable throwable) {
            aWR.c(throwable);
            return null;
        }
    }

    private static NoSuchFieldException a(NoSuchFieldException noSuchFieldException) {
        return noSuchFieldException;
    }
}

