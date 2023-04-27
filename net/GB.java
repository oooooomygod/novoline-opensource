/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a0D;
import net.aH1;
import net.mk_0;

public class GB {
    public static boolean a(aH1 aH12, a0D[] a0DArray, boolean bl) {
        a0D.r();
        return false;
    }

    public static aH1 a(aH1[] aH1Array, a0D[] a0DArray, boolean bl) {
        aH1[] aH1Array2;
        int n;
        int n2;
        a0D.k();
        if (aH1Array != null && (n2 = 0) < (n = (aH1Array2 = aH1Array).length)) {
            aH1 aH12 = aH1Array2[n2];
            if (GB.a(aH12, a0DArray, bl)) {
                return aH12;
            }
            ++n2;
        }
        return null;
    }

    public static a0D a(String string, a0D[] a0DArray) {
        a0D[] a0DArray2;
        int n;
        int n2;
        a0D.k();
        if (a0DArray != null && (n2 = 0) < (n = (a0DArray2 = a0DArray).length)) {
            a0D a0D2 = a0DArray2[n2];
            if (mk_0.i(a0D2).equals(string)) {
                return a0D2;
            }
            ++n2;
        }
        return null;
    }
}

