/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.anh_0;

public enum a5E implements ab9_0
{
    HEAD(anh_0.b),
    FOOT(anh_0.c);

    private String a;

    @Override
    public String a() {
        return this.a;
    }

    private a5E(String string2) {
        this.a = string2;
    }

    public String toString() {
        return this.a;
    }
}

