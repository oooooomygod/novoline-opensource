/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.atN;

/*
 * Renamed from net.sV
 */
public enum sv_1 implements ab9_0
{
    STRAIGHT(atN.f),
    INNER_LEFT(atN.d),
    INNER_RIGHT(atN.a),
    OUTER_LEFT(atN.j),
    OUTER_RIGHT(atN.c);

    private String b;

    @Override
    public String a() {
        return this.b;
    }

    private sv_1(String string2) {
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }
}

