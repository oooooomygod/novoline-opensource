/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aab_2;

public class MapColor {
    public static MapColor C;
    public static MapColor E;
    public static MapColor G;
    public static MapColor d;
    public static MapColor L;
    public static MapColor b;
    public static MapColor H;
    public static MapColor v;
    public static MapColor c;
    public static MapColor J;
    public static MapColor D;
    public static MapColor t;
    public static MapColor w;
    public static MapColor K;
    public static MapColor i;
    public static MapColor o;
    public static MapColor q;
    public static MapColor[] u;
    public static MapColor n;
    public static MapColor m;
    public static MapColor a;
    public static MapColor N;
    public int p;
    public static MapColor l;
    private static String f = "CL_00000544";
    public static MapColor r;
    public static MapColor y;
    public static MapColor z;
    public static MapColor s;
    public static MapColor k;
    public static MapColor M;
    public int g;
    public static MapColor I;
    public static MapColor A;
    public static MapColor j;
    public static MapColor B;
    public static MapColor x;
    public static MapColor h;
    public static MapColor e;
    public static MapColor F;

    public int a(int n) {
        int n2 = 220;
        if (n == 3) {
            n2 = 135;
        }
        if (n == 2) {
            n2 = 255;
        }
        if (n == 1) {
            n2 = 220;
        }
        n2 = 180;
        int n3 = (this.g >> 16 & 0xFF) * n2 / 255;
        int n4 = (this.g >> 8 & 0xFF) * n2 / 255;
        int n5 = (this.g & 0xFF) * n2 / 255;
        return 0xFF000000 | n3 << 16 | n4 << 8 | n5;
    }

    private MapColor(int n, int n2) {
        if (n <= 63) {
            this.p = n;
            this.g = n2;
            MapColor.u[n] = this;
            return;
        }
        throw new IndexOutOfBoundsException(aab_2.a);
    }

    private static IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        return indexOutOfBoundsException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "&Af?\u0014ujU8\r;".toCharArray();
        int n2 = 0;
        int n3 = 1;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x64));
            n3 = n3;
        }
    }
}

