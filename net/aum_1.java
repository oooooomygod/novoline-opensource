/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aE9;
import net.aL0;

/*
 * Renamed from net.auM
 */
public class aum_1 {
    public float a;
    public String b;
    public float c;

    public float c() {
        return this.a;
    }

    public float a() {
        return this.c;
    }

    public aum_1(String string, float f, float f2) {
        this.b = string;
        this.a = f;
        this.c = f2;
    }

    public String e() {
        return this.b();
    }

    public String d() {
        return aL0.a(aL0.a(new StringBuilder(), aE9.b), this.b).toString();
    }

    public String b() {
        return aL0.a(aL0.a(new StringBuilder(), aE9.a), this.b).toString();
    }
}

