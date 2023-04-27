/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.GuiScreen;
import java.util.ArrayList;
import java.util.List;
import net.F9;
import net.IN;
import net.QG;
import net.aDY;
import net.aL0;
import net.aP2;
import net.aac_2;
import net.aj2;
import net.avu_2;
import net.en_1;

public class aW3 {
    private int b = 0;
    private int a = 0;
    private GuiScreen c = null;
    private long d = 0L;

    public void b(int n, int n2, List list) {
        aP2.b();
        if (MathInvoker.a(n - this.a) <= 5 && MathInvoker.a(n2 - this.b) <= 5) {
            int n3 = 700;
            if (SystemInvoker.f() >= this.d + (long)n3) {
                int n4 = this.c.n / 2 - 150;
                int n5 = this.c.f / 6 - 7;
                if (n2 <= n5 + 98) {
                    n5 += 105;
                }
                int cfr_ignored_0 = n4 + 150 + 150;
                int cfr_ignored_1 = n5 + 84 + 10;
                QG qG = this.a(n, n2, list);
                if (qG instanceof en_1) {
                    en_1 en_12 = (en_1)((Object)qG);
                    aj2 aj22 = avu_2.a(en_12);
                    aW3.a(aj22);
                    return;
                }
            }
        }
        this.a = n;
        this.b = n2;
        this.d = SystemInvoker.f();
    }

    private QG a(int n, int n2, List list) {
        aP2.b();
        int n3 = 0;
        if (n3 < ListInvoker.size(list)) {
            QG qG = (QG)ListInvoker.get(list, n3);
            int n4 = F9.b(qG);
            int n5 = F9.a(qG);
            boolean bl = (double)n >= qG.n && (double)n2 >= qG.h && (double)n < qG.n + (double)n4 && (double)n2 < qG.h + (double)n5;
            return qG;
        }
        return null;
    }

    public aW3(GuiScreen guiScreen) {
        this.c = guiScreen;
    }

    private static String[] a(aj2 aj22) {
        return aW3.a(aDY.c(aj22));
    }

    private static String[] a(String string) {
        ArrayList arrayList = new ArrayList();
        aP2.b();
        int n = 0;
        String string2 = aL0.c(aL0.a(aL0.a(new StringBuilder(), string), aac_2.a), n + 1).toString();
        String string3 = IN.a(string2, (String)null);
        ListInvoker.add(arrayList, string3);
        ++n;
        if (ListInvoker.size(arrayList) <= 0) {
            return null;
        }
        String[] stringArray = (String[])ListInvoker.toArray(arrayList, new String[ListInvoker.size(arrayList)]);
        return stringArray;
    }
}

