/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import net.aB5;
import net.aG1;
import net.ab9_0;
import net.atA;
import net.ms_0;
import net.my_0;

/*
 * Renamed from net.dq
 */
public enum dq_1 implements ab9_0
{
    DANDELION(atA.YELLOW, 0, aB5.o),
    POPPY(atA.RED, 0, aB5.b),
    BLUE_ORCHID(atA.RED, 1, aB5.x, aB5.z),
    ALLIUM(atA.RED, 2, aB5.d),
    HOUSTONIA(atA.RED, 3, aB5.n),
    RED_TULIP(atA.RED, 4, aB5.m, aB5.i),
    ORANGE_TULIP(atA.RED, 5, aB5.t, aB5.y),
    WHITE_TULIP(atA.RED, 6, aB5.l, aB5.h),
    PINK_TULIP(atA.RED, 7, aB5.f, aB5.k),
    OXEYE_DAISY(atA.RED, 8, aB5.j, aB5.c);

    private atA a;
    private String e;
    private static dq_1[][] f;
    private int b;
    private String c;

    public atA d() {
        return this.a;
    }

    private dq_1(atA atA2, int n2, String string2, String string3) {
        this.a = atA2;
        this.b = n2;
        this.e = string2;
        this.c = string3;
    }

    public String b() {
        return this.c;
    }

    private dq_1(atA atA2, int n2, String string2) {
        this(atA2, n2, string2, string2);
    }

    private static boolean lambda$static$0(atA atA2, dq_1 dq_12) {
        return dq_12.d() == atA2;
    }

    public int c() {
        return this.b;
    }

    @Override
    public String a() {
        return this.e;
    }

    public String toString() {
        return this.e;
    }

    static {
        f = new dq_1[atA.values().length][];
        for (atA atA2 : atA.values()) {
            Collection collection = aG1.a((Collection)my_0.a(dq_1.values()), arg_0 -> dq_1.lambda$static$0(atA2, arg_0));
            dq_1.f[atA2.ordinal()] = (dq_1[])ms_0.a(collection, new dq_1[ms_0.d(collection)]);
        }
    }

    public static dq_1 a(atA atA2, int n) {
        dq_1[] dq_1Array = f[atA2.ordinal()];
        if (n >= dq_1Array.length) {
            n = 0;
        }
        return dq_1Array[n];
    }

    public static dq_1[] a(atA atA2) {
        return f[atA2.ordinal()];
    }
}

