/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.MZ;
import net.a0D;
import net.a7r_0;
import net.aL0;
import net.an_2;
import net.ow_1;
import net.wk_2;
import net.ys_2;

public class a0E
extends a0D {
    private static Pattern m = ow_1.c(an_2.j);

    @Override
    public String h() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), an_2.g), this.n()), an_2.l), this.j()), an_2.e), this.j()).toString();
    }

    @Override
    public boolean g(String string) {
        a0D.r();
        Matcher matcher = ow_1.a(m, string);
        if (!wk_2.a(matcher)) {
            return false;
        }
        String string2 = wk_2.b(matcher, 1);
        return StringInvoker.k(string2, this.n());
    }

    public a0E(String string, String string2, String string3, String[] stringArray, String string4) {
        a0D.r();
        super(string, string2, string3, stringArray, string3, string4);
        this.b(this.f().length > 1);
    }

    public static a0D b(String string, String string2) {
        a0D.r();
        Matcher matcher = ow_1.a(m, string);
        if (!wk_2.a(matcher)) {
            return null;
        }
        String string3 = wk_2.b(matcher, 1);
        String string4 = wk_2.b(matcher, 2);
        String string5 = wk_2.b(matcher, 3);
        String string6 = MZ.a(string5, an_2.d, an_2.h);
        if (string6 != null && !StringInvoker.g(string6)) {
            string5 = StringInvoker.h(StringInvoker.a(string5, (CharSequence)string6, (CharSequence)an_2.k));
        }
        String[] stringArray = a0E.a(string4, string6);
        if (string3 != null && !StringInvoker.g(string3)) {
            string2 = MZ.a(string2, an_2.a);
            a0E a0E2 = new a0E(string3, string5, string4, stringArray, string2);
            return a0E2;
        }
        return null;
    }

    public static String[] a(String string, String string2) {
        a0D.r();
        String[] stringArray = new String[]{string};
        if (string2 == null) {
            return stringArray;
        }
        string2 = StringInvoker.h(string2);
        string2 = MZ.a(string2, an_2.i);
        string2 = MZ.b(string2, an_2.c);
        if (StringInvoker.c(string2 = StringInvoker.h(string2)) <= 0) {
            return stringArray;
        }
        Object[] objectArray = ys_2.a(string2, an_2.f);
        if (objectArray.length <= 0) {
            return stringArray;
        }
        if (!ListInvoker.contains(a7r_0.a(objectArray), string)) {
            objectArray = (String[])ys_2.a(objectArray, string, 0);
        }
        return objectArray;
    }

    @Override
    public String c(String string) {
        return an_2.b;
    }
}

