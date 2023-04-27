/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a02;
import net.ab9_0;
import net.kl_1;

/*
 * Renamed from net.cs
 */
public enum cs_2 implements ab9_0
{
    X(a02.c),
    Y(a02.e),
    Z(a02.b),
    NONE(a02.d);

    private String a;

    public static cs_2 a(kl_1 kl_12) {
        switch (kl_12) {
            case X: {
                return X;
            }
            case Y: {
                return Y;
            }
            case Z: {
                return Z;
            }
        }
        return NONE;
    }

    @Override
    public String a() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    private cs_2(String string2) {
        this.a = string2;
    }
}

