/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.alw
 */
public class alw_2 {
    public static String a = "Mo' Bends";
    public static String b = "0.21.4";
    public static String c = "mobends";

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[3];
        int n = 0;
        String string = "r;'~w\u0007\u0007/zw*7WU\t\u000fz2o\u001bVH&f";
        int n2 = "r;'~w\u0007\u0007/zw*7WU\t\u000fz2o\u001bVH&f".length();
        int n3 = 6;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 7;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x45));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                a = stringArray2[2];
                b = stringArray2[0];
                c = stringArray2[1];
                return;
            }
            n3 = string.charAt(n4);
        }
    }
}

