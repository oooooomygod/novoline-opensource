/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.ajW;

/*
 * Renamed from net.aeh
 */
public enum aeh_2 implements ab9_0
{
    COMPARE(ajW.d),
    SUBTRACT(ajW.b);

    private String b;

    public String toString() {
        return this.b;
    }

    @Override
    public String a() {
        return this.b;
    }

    private aeh_2(String string2) {
        this.b = string2;
    }
}

