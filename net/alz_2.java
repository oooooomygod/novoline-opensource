/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.Iterator;
import java.util.List;
import net.aL0;
import net.aZL;
import net.aet_1;
import net.as9_0;
import net.dz_0;
import net.my_0;

/*
 * Renamed from net.alz
 */
public class alz_2 {
    private static String e = "CL_00001056";
    private List d;
    private aZL g;
    private int b;
    private int a;
    private int f;
    private int c;

    public aZL b() {
        return this.g;
    }

    public int a() {
        return this.a;
    }

    public int c() {
        return this.f;
    }

    public boolean a(aZL aZL2) {
        if (this.g != null) {
            return false;
        }
        int n = aet_1.a(aZL2);
        int n2 = aet_1.e(aZL2);
        if (n <= this.c && n2 <= this.b) {
            if (n == this.c && n2 == this.b) {
                this.g = aZL2;
                return true;
            }
            if (this.d == null) {
                this.d = my_0.b(1);
                ListInvoker.add(this.d, new alz_2(this.a, this.f, n, n2));
                int n3 = this.c - n;
                int n4 = this.b - n2;
                int n5 = MathInvoker.max(this.b, n3);
                int n6 = MathInvoker.max(this.c, n4);
                if (n5 >= n6) {
                    ListInvoker.add(this.d, new alz_2(this.a, this.f + n2, n, n4));
                    ListInvoker.add(this.d, new alz_2(this.a + n, this.f, n3, this.b));
                } else {
                    ListInvoker.add(this.d, new alz_2(this.a + n, this.f, n3, n2));
                    ListInvoker.add(this.d, new alz_2(this.a, this.f + n2, this.c, n4));
                }
            }
            Iterator iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                if (!((alz_2)object).a(aZL2)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "o_g:!D\u001a\u001d#\r<".toCharArray();
        int n2 = 0;
        int n3 = 90;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x76));
            n3 = n3;
        }
    }

    public void a(List list) {
        if (this.g != null) {
            ListInvoker.add(list, this);
        } else if (this.d != null) {
            Iterator iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                ((alz_2)object).a(list);
            }
        }
    }

    public alz_2(int n, int n2, int n3, int n4) {
        this.a = n;
        this.f = n2;
        this.c = n3;
        this.b = n4;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), as9_0.d), this.a), as9_0.e), this.f), as9_0.b), this.c), as9_0.f), this.b), as9_0.a), this.g), as9_0.c), this.d), '}').toString();
    }
}

