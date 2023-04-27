/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 */
package net;

import com.google.common.base.Objects;

public class aWU {
    private static int[] b;

    public static Objects.ToStringHelper a(Object object) {
        return Objects.toStringHelper((Object)object);
    }

    public static int[] b() {
        return b;
    }

    static {
        if (aWU.b() == null) {
            aWU.b(new int[1]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static Object a(Object object, Object object2) {
        return Objects.firstNonNull((Object)object, (Object)object2);
    }
}

