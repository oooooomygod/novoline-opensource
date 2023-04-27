/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a5z_0;
import net.ab9_0;

/*
 * Renamed from net.xQ
 */
public enum xq_1 implements ab9_0
{
    UPPER,
    LOWER;


    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this == UPPER ? a5z_0.b : a5z_0.c;
    }
}

