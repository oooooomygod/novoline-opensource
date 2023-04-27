/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.MZ;
import net.UL;
import net.a3c_0;
import net.a7r_0;
import net.aL0;
import net.ys_2;

public abstract class a0D {
    private String i = null;
    private boolean j;
    private String[] a;
    private boolean d;
    private String g;
    private String l;
    private String[] c;
    private String f;
    public static String e;
    public static String b;
    public static String h;
    private static int k;

    public String[] f() {
        return (String[])this.c.clone();
    }

    public String b(String string) {
        return a3c_0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), UL.g), this.i), UL.f), string).toString(), string);
    }

    public static int r() {
        a0D.k();
        return 90;
    }

    public String n() {
        return this.i;
    }

    public String j() {
        return this.f;
    }

    public void b() {
        a0D.k();
        int n = a0D.a(this.f, this.c);
        if (n >= 0) {
            n = (n - 1 + this.c.length) % this.c.length;
            this.f = this.c[n];
        }
    }

    public String h() {
        return null;
    }

    public void b(boolean bl) {
        this.j = bl;
    }

    public a0D(String string, String string2, String string3, String[] stringArray, String string4, String string5) {
        a0D.k();
        this.l = null;
        this.f = null;
        this.c = null;
        this.g = null;
        this.a = null;
        this.d = true;
        this.j = true;
        this.i = string;
        this.l = string2;
        this.f = string3;
        this.c = stringArray;
        this.g = string4;
        this.a = new String[]{string5};
    }

    public String l() {
        return this.l;
    }

    public String[] g() {
        return this.a;
    }

    public boolean e() {
        return this.d;
    }

    public String i() {
        return a3c_0.a(aL0.a(aL0.a(new StringBuilder(), UL.d), this.i).toString(), this.i);
    }

    public void p() {
        a0D.r();
        int n = a0D.a(this.f, this.c);
        if (n >= 0) {
            n = (n + 1) % this.c.length;
            this.f = this.c[n];
        }
    }

    public String q() {
        return this.g;
    }

    public boolean e(String string) {
        a0D.k();
        int n = a0D.a(string, this.c);
        if (n < 0) {
            return false;
        }
        this.f = string;
        return true;
    }

    public String c(String string) {
        return UL.c;
    }

    public void f(String string) {
        this.l = string;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public String m() {
        String string = ys_2.b(this.l);
        string = MZ.a(string, UL.h);
        string = a3c_0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), UL.a), this.n()), UL.e).toString(), string);
        return string;
    }

    private static int a(String string, String[] stringArray) {
        a0D.k();
        int n = 0;
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            if (string2.equals(string)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    public boolean d(String string) {
        a0D.k();
        return a0D.a(string, this.c) >= 0;
    }

    public void a(String[] stringArray) {
        List list = a7r_0.a(this.a);
        a0D.k();
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        if (n2 < n) {
            String string = stringArray2[n2];
            if (!ListInvoker.contains(list, string)) {
                this.a = (String[])ys_2.a((Object[])this.a, (Object)string);
            }
            ++n2;
        }
    }

    public boolean a(String string) {
        return false;
    }

    public boolean o() {
        return this.j;
    }

    public boolean g(String string) {
        return false;
    }

    public boolean d() {
        a0D.k();
        return !ys_2.a((Object)this.f, (Object)this.g);
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), UL.i), this.i), UL.k), this.f), UL.j), this.g), UL.b), ys_2.a(this.a)).toString();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0090\u001f\u0002\u0090\u001d\u0002\u0090G";
        int n2 = "\u0090\u001f\u0002\u0090\u001d\u0002\u0090G".length();
        int n3 = 2;
        int n4 = -1;
        a0D.b(0);
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
                    n6 = 64;
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
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x77));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                h = stringArray2[2];
                b = stringArray2[0];
                e = stringArray2[1];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public boolean a() {
        return false;
    }

    public void c() {
        this.f = this.g;
    }

    public static void b(int n) {
        k = n;
    }

    public static int k() {
        return k;
    }
}

