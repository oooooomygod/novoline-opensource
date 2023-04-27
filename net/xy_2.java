/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Renamed from net.xy
 */
public class xy_2 {
    private String n = null;
    private Proxy j = Proxy.NO_PROXY;
    private String g = null;
    private String a = null;
    public static String e;
    public static String b;
    private Map<String, String> f = new LinkedHashMap<String, String>();
    public static String m;
    private int k = 0;
    private byte[] h = null;
    public static String d;
    private int l = 0;
    public static String i;
    private String c = null;

    public String i() {
        return this.a;
    }

    public Proxy g() {
        return this.j;
    }

    public xy_2(String string, int n, Proxy proxy, String string2, String string3, String string4, Map<String, String> map, byte[] byArray) {
        this.a = string;
        this.l = n;
        this.j = proxy;
        this.n = string2;
        this.c = string3;
        this.g = string4;
        this.f = map;
        this.h = byArray;
    }

    public String h() {
        return this.n;
    }

    public String b() {
        return this.c;
    }

    public int c() {
        return this.l;
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[5];
        int n = 0;
        String string = "oK\u001d\u0004`K\bm\b`Z\u001dy\u0019M/\u0018";
        int n2 = "oK\u001d\u0004`K\bm\b`Z\u001dy\u0019M/\u0018".length();
        int n3 = 3;
        int n4 = -1;
        while (true) {
            int n5 = 56;
            int n6 = ++n4;
            String string2 = string.substring(n6, n6 + n3);
            int n7 = -1;
            boolean bl = true;
            do {
                char[] cArray;
                block7: {
                    int n8;
                    char[] cArray2;
                    int n9;
                    int n10;
                    block6: {
                        if (!bl || (bl = false) || !true) {
                            string = "9\u0000[<\b!\u001b\\8X\fnX";
                            n2 = "9\u0000[<\b!\u001b\\8X\fnX".length();
                            n3 = 4;
                            n4 = -1;
                            n5 = 121;
                            int n11 = ++n4;
                            string2 = string.substring(n11, n11 + n3);
                            n7 = 0;
                        }
                        char[] cArray3 = string2.toCharArray();
                        int n12 = cArray3.length;
                        n10 = 0;
                        n9 = n5;
                        cArray2 = cArray3;
                        n8 = n12;
                        if (n12 <= 1) break block6;
                        cArray = cArray2;
                        n8 = n8;
                        if (n8 <= n10) break block7;
                    }
                    do {
                        cArray2 = cArray2;
                        int n13 = n10;
                        int cfr_ignored_1 = n10 % 7;
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x10));
                        ++n10;
                        n9 = n9;
                        cArray = cArray2;
                        n8 = n8;
                    } while (n8 > n10);
                }
                stringArray[n++] = new String(cArray).intern();
            } while ((n4 += n3) >= n2);
            n3 = string.charAt(n4);
        }
    }

    public String e() {
        return this.g;
    }

    public void a(int n) {
        this.k = n;
    }

    public Map<String, String> d() {
        return this.f;
    }

    public int f() {
        return this.k;
    }

    public byte[] a() {
        return this.h;
    }
}

