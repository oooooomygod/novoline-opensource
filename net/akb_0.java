/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ab9_0;
import net.lu_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aKb
 */
public enum akb_0 implements ab9_0
{
    NORMAL(0, lu_2.d, lu_2.e),
    MOSSY(1, lu_2.b, lu_2.f);

    private static akb_0[] d = new akb_0[akb_0.values().length];
    private String a;
    private String e;
    private int b;

    public int a() {
        return this.b;
    }

    public static akb_0 a(int n) {
        if (n >= d.length) {
            n = 0;
        }
        return d[n];
    }

    private akb_0(int n2, String string2, String string3) {
        this.b = n2;
        this.e = string2;
        this.a = string3;
    }

    static {
        akb_0[] akb_0Array = akb_0.values();
        int n = akb_0Array.length;
        for (int i = 0; i < n; ++i) {
            akb_0 akb_02;
            akb_0.d[akb_02.a()] = akb_02 = akb_0Array[i];
        }
    }

    public String toString() {
        return this.e;
    }

    @Override
    public String a() {
        return this.e;
    }

    public String b() {
        return this.a;
    }
}

