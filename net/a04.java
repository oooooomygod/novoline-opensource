/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.ad1_0;

public enum a04 implements ab9_0
{
    DEFAULT(ad1_0.d),
    STICKY(ad1_0.c);

    private String b;

    @Override
    public String a() {
        return this.b;
    }

    private a04(String string2) {
        this.b = string2;
    }

    public String toString() {
        return this.b;
    }
}

