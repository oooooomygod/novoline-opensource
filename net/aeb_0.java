/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import net.lm_1;

/*
 * Renamed from net.aEb
 */
public class aeb_0
implements Comparable<aeb_0> {
    private String d;
    private String c;
    private String b;
    private boolean a;

    public String toString() {
        return StringInvoker.a(lm_1.a, new Object[]{this.c, this.b});
    }

    public String b() {
        return this.d;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public boolean a() {
        return this.a;
    }

    public int a(aeb_0 aeb_02) {
        return StringInvoker.i(this.d, aeb_02.d);
    }

    public boolean equals(Object object) {
        return this == object || object instanceof aeb_0 && this.d.equals(((aeb_0)object).d);
    }

    public aeb_0(String string, String string2, String string3, boolean bl) {
        this.d = string;
        this.b = string2;
        this.c = string3;
        this.a = bl;
    }
}

