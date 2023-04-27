/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.P8;
import net.aps_2;
import net.auk_2;
import net.db_0;
import net.wb_2;

/*
 * Renamed from net.xG
 */
class xg_1 {
    private String c;
    private int b;
    private double a;
    private static String e;
    private boolean d;
    private wb_2 f;

    public String a() {
        return this.c;
    }

    public xg_1(String string, wb_2 wb_22) {
        this.f = wb_22;
        this.a(string);
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public wb_2 d() {
        return this.f;
    }

    public boolean c() {
        return this.d;
    }

    public void a(String string) {
        this.c = string;
        if (string.equals(aps_2.a)) {
            this.d = false;
            return;
        }
        if (string.equals(aps_2.b)) {
            this.d = true;
            return;
        }
        this.d = auk_2.b(string);
        this.b = this.d ? 1 : 0;
        try {
            this.b = P8.a(string);
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            this.a = db_0.c(string);
        }
        catch (NumberFormatException numberFormatException) {}
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "u\u0012^,OX\u0014\u0006o2+".toCharArray();
        int n2 = 0;
        int n3 = 8;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3E));
            n3 = n3;
        }
    }

    public int b() {
        return this.b;
    }
}

