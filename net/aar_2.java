/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Random;
import net.a5_0;
import net.aL0;
import net.ai_2;

/*
 * Renamed from net.aar
 */
public class aar_2 {
    private String[] a;
    private Random c = new Random();
    private static aar_2 b = new aar_2();

    public static aar_2 b() {
        return b;
    }

    public String a() {
        int n = a5_0.a(this.c, 2) + 3;
        String string = ai_2.d;
        for (int i = 0; i < n; ++i) {
            string = aL0.a(aL0.a(new StringBuilder(), string), ai_2.c).toString();
            string = aL0.a(aL0.a(new StringBuilder(), string), this.a[a5_0.a(this.c, this.a.length)]).toString();
        }
        return string;
    }

    public void a(long l4) {
        a5_0.a(this.c, l4);
    }

    public aar_2() {
        this.a = StringInvoker.g(ai_2.a, ai_2.b);
    }
}

