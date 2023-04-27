/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.gm_0;

/*
 * Renamed from net.Az
 */
public enum az_0 implements ab9_0
{
    LEFT,
    RIGHT;


    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this == LEFT ? gm_0.d : gm_0.b;
    }
}

