/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.af6_0;

/*
 * Renamed from net.avB
 */
public enum avb_1 implements ab9_0
{
    UPPER,
    LOWER;


    @Override
    public String a() {
        return this == UPPER ? af6_0.c : af6_0.a;
    }

    public String toString() {
        return this.a();
    }
}

