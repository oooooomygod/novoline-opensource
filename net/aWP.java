/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapsInvoker;
import java.util.Map;
import net.aef_1;
import net.apl_1;
import net.atP;

public enum aWP {
    VERTEX(aef_1.a, aef_1.e, apl_1.F),
    FRAGMENT(aef_1.b, aef_1.c, apl_1.e);

    private String c;
    private int d;
    private String a;
    private Map<String, atP> e = MapsInvoker.a();

    protected Map<String, atP> d() {
        return this.e;
    }

    protected String b() {
        return this.c;
    }

    protected int c() {
        return this.d;
    }

    private aWP(String string2, String string3, int n2) {
        this.a = string2;
        this.c = string3;
        this.d = n2;
    }

    public String a() {
        return this.a;
    }
}

