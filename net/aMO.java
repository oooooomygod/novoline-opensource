/*
 * Decompiled with CFR 0.152.
 */
package net;

public class aMO {
    public static String c = "2.4.12";
    public static String b = "1.8.8";
    public static int a = 132108;
    public static int d = 83;

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "Md\u001cN]\u0006Nd\u0010NTz";
        int n2 = "Md\u001cN]\u0006Nd\u0010NTz".length();
        int n3 = 5;
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
                    n6 = 63;
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
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x43));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                c = stringArray2[1];
                b = stringArray2[0];
                return;
            }
            n3 = string.charAt(n4);
        }
    }
}

