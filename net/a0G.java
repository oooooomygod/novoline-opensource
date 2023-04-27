/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.MZ;
import net.a0D;
import net.a0h_0;
import net.aL0;
import net.atl_0;
import net.ow_1;
import net.wk_2;

public class a0G
extends a0h_0 {
    private static Pattern o = ow_1.c(atl_0.a);

    public static a0D b(String string, String string2) {
        a0D.k();
        Matcher matcher = ow_1.a(o, string);
        if (!wk_2.a(matcher)) {
            return null;
        }
        String string3 = wk_2.b(matcher, 1);
        String string4 = wk_2.b(matcher, 2);
        String string5 = wk_2.b(matcher, 3);
        if (string3 != null && !StringInvoker.g(string3)) {
            string2 = MZ.a(string2, atl_0.e);
            a0G a0G2 = new a0G(string3, string5, string4, string2);
            a0G2.b(false);
            return a0G2;
        }
        return null;
    }

    @Override
    public boolean a() {
        return false;
    }

    public a0G(String string, String string2, String string3, String string4) {
        super(string, string2, string3, string4);
    }

    @Override
    public boolean g(String string) {
        a0D.r();
        Matcher matcher = ow_1.a(o, string);
        if (!wk_2.a(matcher)) {
            return false;
        }
        String string2 = wk_2.b(matcher, 1);
        return StringInvoker.k(string2, this.n());
    }

    @Override
    public String h() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), atl_0.d), this.n()), atl_0.c), this.j()), atl_0.b), this.j()).toString();
    }
}

