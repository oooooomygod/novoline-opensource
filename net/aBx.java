/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import java.util.Hashtable;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;
import net.P1;
import net.P8;
import net.aIU;
import net.aL0;
import net.act_1;
import net.agc_0;
import net.aki_1;
import net.ara_2;
import net.hq_2;

public class aBx {
    private int b;
    private String a;

    private static int a(String string, int n) {
        try {
            return P8.a(StringInvoker.h(string));
        }
        catch (Exception exception) {
            return n;
        }
    }

    public int b() {
        return this.b;
    }

    public static aBx b(String string) {
        return null;
    }

    public String a() {
        return aIU.a(this.a);
    }

    private static String[] a(String string) {
        try {
            ara_2.a(P1.k);
            Hashtable hashtable = new Hashtable();
            act_1.a(hashtable, P1.g, P1.h);
            act_1.a(hashtable, P1.b, P1.p);
            act_1.a(hashtable, P1.d, P1.o);
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            Attributes attributes = aki_1.a(initialDirContext, aL0.a(aL0.a(new StringBuilder(), P1.j), string).toString(), new String[]{P1.f});
            String[] stringArray = StringInvoker.a(hq_2.a(agc_0.a(attributes, P1.a)).toString(), P1.l, 4);
            return new String[]{stringArray[3], stringArray[2]};
        }
        catch (Throwable throwable) {
            return new String[]{string, P8.g(25565)};
        }
    }

    private aBx(String string, int n) {
        this.a = string;
        this.b = n;
    }
}

