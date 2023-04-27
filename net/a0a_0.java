/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import net.IN;
import net.a0D;
import net.a3c_0;
import net.aH1;
import net.aL0;
import net.aLA;
import net.aNK;
import net.ai_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a0a
 */
public class a0a_0
extends a0D {
    private static String n = "<custom>";
    private a0D[] m = null;
    private static String o = "<profile>";
    private aH1[] p = null;

    private static String a(aH1[] aH1Array, a0D[] a0DArray) {
        return a0a_0.a(aH1Array, a0DArray, false);
    }

    private static String a(aH1[] aH1Array, a0D[] a0DArray, boolean bl) {
        a0D.r();
        aH1 aH12 = aNK.a(aH1Array, a0DArray, bl);
        return aH12 == null ? ai_1.j : aH12.a();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "3y#\u0002T^-j7\b3j$\u001eFX,1";
        int n2 = "3y#\u0002T^-j7\b3j$\u001eFX,1".length();
        int n3 = 9;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 86;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x59));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                o = stringArray2[0];
                a0a_0.n = stringArray2[1];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private a0D a(String string) {
        a0D.k();
        a0D[] a0DArray = this.m;
        int n = a0DArray.length;
        int n2 = 0;
        if (n2 < n) {
            a0D a0D2 = a0DArray[n2];
            if (a0D2.n().equals(string)) {
                return a0D2;
            }
            ++n2;
        }
        return null;
    }

    public void d() {
        aH1 aH12 = this.b(this.j());
        if (!aNK.a(aH12, this.m, false)) {
            String string = a0a_0.a(this.p, this.m);
            this.e(string);
        }
    }

    @Override
    public String i() {
        return IN.a(ai_1.m);
    }

    private void a() {
        String[] stringArray;
        String[] stringArray2;
        int n;
        int n2;
        a0D.k();
        aH1 aH12 = this.b(this.j());
        if (aH12 != null && (n2 = 0) < (n = (stringArray2 = (stringArray = aLA.b(aH12))).length)) {
            String string = stringArray2[n2];
            a0D a0D2 = this.a(string);
            String string2 = aLA.a(aH12, string);
            a0D2.e(string2);
            ++n2;
        }
    }

    @Override
    public String c(String string) {
        a0D.r();
        return string.equals(ai_1.k) ? ai_1.f : ai_1.l;
    }

    @Override
    public void p() {
        a0D.k();
        super.p();
        if (this.j().equals(ai_1.c)) {
            super.p();
        }
        this.a();
    }

    private static String[] a(aH1[] aH1Array) {
        ArrayList arrayList = new ArrayList();
        a0D.k();
        Object[] objectArray = aH1Array;
        int n = objectArray.length;
        int n2 = 0;
        if (n2 < n) {
            aH1 aH12 = objectArray[n2];
            ListInvoker.add(arrayList, aH12.a());
            ++n2;
        }
        ListInvoker.add(arrayList, ai_1.d);
        objectArray = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return objectArray;
    }

    public a0a_0(aH1[] aH1Array, a0D[] a0DArray) {
        super(ai_1.b, ai_1.h, a0a_0.a(aH1Array, a0DArray), a0a_0.a(aH1Array), a0a_0.a(aH1Array, a0DArray, true), null);
        this.p = aH1Array;
        this.m = a0DArray;
    }

    private aH1 b(String string) {
        a0D.r();
        aH1[] aH1Array = this.p;
        int n = aH1Array.length;
        int n2 = 0;
        if (n2 < n) {
            aH1 aH12 = aH1Array[n2];
            if (aH12.a().equals(string)) {
                return aH12;
            }
            ++n2;
        }
        return null;
    }

    @Override
    public String b(String string) {
        a0D.r();
        return string.equals(ai_1.e) ? IN.a(ai_1.i, ai_1.g) : a3c_0.a(aL0.a(aL0.a(new StringBuilder(), ai_1.a), string).toString(), string);
    }
}

