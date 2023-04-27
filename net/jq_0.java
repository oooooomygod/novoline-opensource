/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.aL0;
import net.aVR;
import net.agz_2;
import net.aw__0;
import net.my_0;

/*
 * Renamed from net.Jq
 */
public class jq_0 {
    private String b = null;
    private List<String> a = my_0.c();

    public String toString() {
        return this.b != null ? (!ListInvoker.isEmpty(this.a) ? aL0.a(aL0.a(aL0.a(new StringBuilder(), this.b), agz_2.a), this.a()).toString() : this.b) : (!ListInvoker.isEmpty(this.a) ? aL0.a(aL0.a(new StringBuilder(), agz_2.c), this.a()).toString() : agz_2.b);
    }

    static void b(jq_0 jq_02, String string) {
        jq_02.a(string);
    }

    private jq_0() {
    }

    static String a(jq_0 jq_02, String string) {
        jq_02.b = string;
        return jq_02.b;
    }

    jq_0(aVR aVR2) {
        this();
    }

    public String a() {
        return aw__0.a(this.a, agz_2.d);
    }

    private void a(String string) {
        ListInvoker.add(this.a, 0, string);
    }
}

