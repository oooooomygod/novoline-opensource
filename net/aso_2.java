/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.reflect.TypeToken
 */
package net;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.function.Predicate;
import net.VT;
import net.aPD;
import net.ara_2;
import net.auk_2;
import net.ch_2;

/*
 * Renamed from net.aso
 */
class aso_2
implements Predicate<TypeToken<?>> {
    private TypeToken<?> a;
    private static Method b;

    public boolean a(TypeToken<?> typeToken) {
        try {
            return auk_2.a((Boolean)VT.a(b, this.a, new Object[]{typeToken}));
        }
        catch (Exception exception) {
            ch_2.a(exception);
            return false;
        }
    }

    static {
        Method method;
        try {
            method = ara_2.a(TypeToken.class, aPD.a, new Class[]{TypeToken.class});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            try {
                method = ara_2.a(TypeToken.class, aPD.b, new Class[]{TypeToken.class});
            }
            catch (NoSuchMethodException noSuchMethodException2) {
                throw new RuntimeException(aPD.c);
            }
        }
        b = method;
    }

    aso_2(TypeToken<?> typeToken) {
        this.a = typeToken;
    }
}

