/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.v3_0;

public enum JA implements ab9_0
{
    TOP(v3_0.d),
    BOTTOM(v3_0.c);

    private String b;

    private JA(String string2) {
        this.b = string2;
    }

    @Override
    public String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}

