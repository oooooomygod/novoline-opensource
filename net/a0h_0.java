/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.GM;
import net.IN;
import net.MZ;
import net.a0D;
import net.aL0;
import net.auk_2;
import net.ow_1;
import net.wk_2;
import net.ys_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a0h
 */
public class a0h_0
extends a0D {
    private static Pattern n = ow_1.c(GM.i);
    private static Pattern m = ow_1.c(GM.l);

    @Override
    public String b(String string) {
        a0D.k();
        return a0h_0.b(string) ? IN.d() : IN.b();
    }

    @Override
    public String h() {
        a0D.k();
        return a0h_0.b(this.j()) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), GM.g), this.n()), GM.j).toString() : aL0.a(aL0.a(aL0.a(new StringBuilder(), GM.e), this.n()), GM.k).toString();
    }

    @Override
    public boolean g(String string) {
        a0D.r();
        Matcher matcher = ow_1.a(n, string);
        if (!wk_2.a(matcher)) {
            return false;
        }
        String string2 = wk_2.b(matcher, 2);
        return StringInvoker.k(string2, this.n());
    }

    @Override
    public String c(String string) {
        a0D.k();
        return a0h_0.b(string) ? GM.f : GM.b;
    }

    public static boolean b(String string) {
        return auk_2.a(auk_2.a(string));
    }

    @Override
    public boolean a(String string) {
        a0D.r();
        Matcher matcher = ow_1.a(m, string);
        if (wk_2.a(matcher)) {
            String string2 = wk_2.b(matcher, 2);
            return string2.equals(this.n());
        }
        return false;
    }

    public a0h_0(String string, String string2, String string3, String string4) {
        super(string, string2, string3, new String[]{GM.a, GM.d}, string3, string4);
    }

    public static a0D a(String string, String string2) {
        a0D.k();
        Matcher matcher = ow_1.a(n, string);
        if (!wk_2.a(matcher)) {
            return null;
        }
        String string3 = wk_2.b(matcher, 1);
        String string4 = wk_2.b(matcher, 2);
        String string5 = wk_2.b(matcher, 3);
        if (string4 != null && !StringInvoker.g(string4)) {
            boolean bl = ys_2.a((Object)string3, (Object)GM.h);
            boolean bl2 = !bl;
            string2 = MZ.a(string2, GM.c);
            a0h_0 a0h_02 = new a0h_0(string4, string5, StringInvoker.a(bl2), string2);
            return a0h_02;
        }
        return null;
    }

    @Override
    public boolean a() {
        return true;
    }
}

