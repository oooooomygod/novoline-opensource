/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class C2 {
    private static String c = "Name cannot be null!";
    private static long b = a1c.a(-5184932028680040176L, 7783850161641169409L, null).a(23026019541209L);
    public static String a = "Name cannot be null!";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3340D4DF55C1L;
        long cfr_ignored_0 = l4 ^ 0x538FE59F41DDL;
        char[] cArray = "JGspoD+jHqaoE/$Hky#\u0006".toCharArray();
        int n = 0;
        int n2 = 78;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4A));
            n2 = n2;
        }
    }

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }
}

