/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a0D;
import net.aNN;
import net.awo_2;
import net.ys_2;

/*
 * Renamed from net.aNi
 */
public class ani_0
extends aNN {
    public static String[] i = new String[]{awo_2.a, awo_2.h, awo_2.g, awo_2.e};
    public static String[] h = new String[]{awo_2.b, awo_2.i, awo_2.c, awo_2.j};

    public boolean c() {
        a0D.k();
        return this.c() == 1;
    }

    public boolean b() {
        a0D.r();
        return this.c() == 0;
    }

    public ani_0(String string, String string2, int n) {
        super(string, i, string2, h, n);
    }

    public boolean d() {
        a0D.k();
        return this.c() == 2;
    }

    @Override
    public boolean a(String string) {
        a0D.k();
        if (ys_2.a((Object)string, (Object)awo_2.d)) {
            string = awo_2.f;
        }
        return super.a(string);
    }

    public boolean a() {
        a0D.k();
        return this.c() == 3;
    }
}

