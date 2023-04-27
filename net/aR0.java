/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.aof_0;

public enum aR0 implements ab9_0
{
    TOP(aof_0.b),
    BOTTOM(aof_0.a);

    private String b;

    @Override
    public String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }

    private aR0(String string2) {
        this.b = string2;
    }
}

