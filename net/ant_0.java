/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.awt.Color;
import net.a1V;
import net.a7l_0;
import net.aL0;
import net.aR6;
import net.aYW;
import net.acu_0;
import net.anw_0;
import net.aol_1;
import net.awc_2;
import net.et_1;
import net.fo_0;

/*
 * Renamed from net.aNt
 */
public class ant_0 {
    private int a;
    private static int[] c;
    private int d;
    private String e;
    private int b;

    static {
        if (ant_0.b() == null) {
            ant_0.b(new int[3]);
        }
    }

    public void a(int n, int n2, int n3, int n4) {
        ant_0.b();
        this.b = n;
        this.d = n2;
        a1V.a((float)n, (float)n2, 80.0f, 20.0f, 10.0f, aol_1.b(new Color(20, 20, 20, 255)));
        if (n3 >= n && n3 <= n + 80 && n4 >= n2 && n4 <= n2 + 20) {
            if (fo_0.a(fo_0.a()) == this.a) {
                a7l_0.a(aYW.a, (CharSequence)aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), et_1.a), (Object)anw_0.UNDERLINE), this.e).toString(), n + 40, (float)n2 + 6.5f, -1, false);
            }
            a7l_0.a(aYW.a, (CharSequence)this.e, n + 40, (float)n2 + 6.5f, -1, false);
        }
        if (fo_0.a(fo_0.a()) == this.a) {
            a7l_0.a(aR6.a, (CharSequence)aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), et_1.b), (Object)anw_0.UNDERLINE), this.e).toString(), n + 40, (float)n2 + 6.5f, -1, false);
        }
        a7l_0.a(aR6.a, (CharSequence)this.e, n + 40, (float)n2 + 6.5f, -1, false);
    }

    public int a() {
        return this.a;
    }

    public void a(int n, int n2) {
        ant_0.b();
        if (n >= this.b && n <= this.b + 80 && n2 >= this.d && n2 <= this.d + 20) {
            fo_0.a(fo_0.a(), this.a);
        }
    }

    public ant_0(int n) {
        this.a = n;
        this.e = awc_2.a(acu_0.a(n));
    }

    public static void b(int[] nArray) {
        c = nArray;
    }

    public static int[] b() {
        return c;
    }
}

