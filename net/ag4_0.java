/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
package net;

import org.apache.commons.lang3.Validate;

/*
 * Renamed from net.ag4
 */
public class ag4_0 {
    public static Object a(Object object, String string, Object[] objectArray) {
        return Validate.notNull((Object)object, (String)string, (Object[])objectArray);
    }

    public static void b(boolean bl, String string, Object[] objectArray) {
        Validate.validState((boolean)bl, (String)string, (Object[])objectArray);
    }

    public static void a(long l4, long l5, long l6, String string) {
        Validate.inclusiveBetween((long)l4, (long)l5, (long)l6, (String)string);
    }

    public static void a(boolean bl, String string, Object[] objectArray) {
        Validate.isTrue((boolean)bl, (String)string, (Object[])objectArray);
    }

    public static void a(double d, double d2, double d3, String string) {
        Validate.inclusiveBetween((double)d, (double)d2, (double)d3, (String)string);
    }

    public static Object a(Object object) {
        return Validate.notNull((Object)object);
    }

    public static void a(boolean bl) {
        Validate.isTrue((boolean)bl);
    }

    public static CharSequence a(CharSequence charSequence, String string, Object[] objectArray) {
        return Validate.notEmpty((CharSequence)charSequence, (String)string, (Object[])objectArray);
    }
}

