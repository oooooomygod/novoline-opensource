/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.MZ;
import net.W6;
import net.a0D;
import net.a0E;
import net.aL0;
import net.ow_1;
import net.wk_2;

public class a0O
extends a0E {
    private String n = null;
    private static Pattern o = ow_1.c(W6.d);

    public a0O(String string, String string2, String string3, String string4, String[] stringArray, String string5) {
        super(string, string3, string4, stringArray, string5);
        this.n = string2;
    }

    public static a0D a(String string, String string2) {
        a0D.r();
        Matcher matcher = ow_1.a(o, string);
        if (!wk_2.a(matcher)) {
            return null;
        }
        String string3 = wk_2.b(matcher, 1);
        String string4 = wk_2.b(matcher, 2);
        String string5 = wk_2.b(matcher, 3);
        String string6 = wk_2.b(matcher, 4);
        String string7 = MZ.a(string6, W6.c, W6.e);
        if (string7 != null && !StringInvoker.g(string7)) {
            string6 = StringInvoker.h(StringInvoker.a(string6, (CharSequence)string7, (CharSequence)W6.g));
        }
        String[] stringArray = a0O.a(string5, string7);
        if (string4 != null && !StringInvoker.g(string4)) {
            string2 = MZ.a(string2, W6.i);
            a0O a0O2 = new a0O(string4, string3, string6, string5, stringArray, string2);
            return a0O2;
        }
        return null;
    }

    @Override
    public String h() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), W6.b), this.n), W6.a), this.n()), W6.h), this.j()), W6.f), this.j()).toString();
    }

    @Override
    public boolean g(String string) {
        a0D.k();
        Matcher matcher = ow_1.a(o, string);
        if (!wk_2.a(matcher)) {
            return false;
        }
        String string2 = wk_2.b(matcher, 2);
        return StringInvoker.k(string2, this.n());
    }
}

