/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.E;
import net.FA;
import net.NE;
import net.a4m_0;
import net.a5R;
import net.aL0;
import net.aP2;
import net.aZ5;
import net.amn_1;
import net.anZ;
import net.at_2;
import net.cg_1;
import net.ch_2;
import net.dz_0;
import net.ju_2;
import net.ms_0;
import net.xy_2;

public class aZ3 {
    public static String g = "Host";
    public static String e = "Connection";
    public static String f = "Transfer-Encoding";
    public static String j = "chunked";
    public static String i = "Location";
    public static String a = "User-Agent";
    public static String c = "keep-alive";
    public static String h = "Accept";
    public static String b = "Keep-Alive";
    private static Map d;

    public static xy_2 a(String string, Proxy proxy) throws IOException {
        aP2.b();
        URL uRL = new URL(string);
        if (!a5R.c(uRL).equals(ju_2.a)) {
            throw new IOException(aL0.a(aL0.a(new StringBuilder(), ju_2.h), uRL).toString());
        }
        String string2 = a5R.a(uRL);
        String string3 = a5R.b(uRL);
        int n = a5R.d(uRL);
        if (n <= 0) {
            n = 80;
        }
        String string4 = ju_2.e;
        String string5 = ju_2.r;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        MapInvoker.c(linkedHashMap, ju_2.m, aL0.a(aL0.a(new StringBuilder(), ju_2.u), SystemInvoker.c(ju_2.c)).toString());
        MapInvoker.c(linkedHashMap, ju_2.f, string3);
        MapInvoker.c(linkedHashMap, ju_2.l, ju_2.t);
        MapInvoker.c(linkedHashMap, ju_2.d, ju_2.j);
        byte[] byArray = new byte[]{};
        xy_2 xy_22 = new xy_2(string3, n, proxy, string4, string2, string5, linkedHashMap, byArray);
        return xy_22;
    }

    public static void a(at_2 at_22) {
        aP2.b();
        xy_2 xy_22 = a4m_0.b(at_22);
        anZ anZ2 = aZ3.a(aZ5.b(xy_22), aZ5.g(xy_22), aZ5.e(xy_22));
        if (!cg_1.b(anZ2, at_22)) {
            aZ3.a(aZ5.b(xy_22), aZ5.g(xy_22), aZ5.e(xy_22), anZ2);
            anZ2 = aZ3.a(aZ5.b(xy_22), aZ5.g(xy_22), aZ5.e(xy_22));
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[9];
        int n = 0;
        String string = "Fgqz\n[{g|qx\u0002kfv\nEmg~qx\tg~g\u0011Zzc`/_\u0000|%G`?V\u0001gfe\nMgl`9Z\u0011ggl\u0007m`w`7\\\u0001\nemg~qX\tg~g";
        int n2 = "Fgqz\n[{g|qx\u0002kfv\nEmg~qx\tg~g\u0011Zzc`/_\u0000|%G`?V\u0001gfe\nMgl`9Z\u0011ggl\u0007m`w`7\\\u0001\nemg~qX\tg~g".length();
        int n3 = 4;
        int n4 = -1;
        while (true) {
            int n5 = 48;
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
                            string = "fBHB\u0005d\bkNHF\u0001y#I";
                            n2 = "fBHB\u0005d\bkNHF\u0001y#I".length();
                            n3 = 6;
                            n4 = -1;
                            n5 = 25;
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
                        cArray2[n13] = (char)(cArray2[n13] ^ (n9 ^ 0x3E));
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

    private static synchronized anZ a(String string, int n, Proxy proxy) {
        aP2.b();
        String string2 = aZ3.b(string, n, proxy);
        anZ anZ2 = (anZ)MapInvoker.c(d, string2);
        if (anZ2 == null) {
            anZ2 = new anZ(string, n, proxy);
            MapInvoker.c(d, string2, anZ2);
        }
        return anZ2;
    }

    public static boolean a() {
        Object object;
        aP2.b();
        Iterator iterator = ms_0.a(d.values());
        return dz_0.c(iterator) && ((anZ)(object = dz_0.b(iterator))).h();
    }

    private static synchronized void a(String string, int n, Proxy proxy, anZ anZ2) {
        aP2.b();
        String string2 = aZ3.b(string, n, proxy);
        anZ anZ3 = (anZ)MapInvoker.c(d, string2);
        if (anZ3 == anZ2) {
            MapInvoker.a(d, string2);
        }
    }

    public static void a(String string, amn_1 amn_12, Proxy proxy) throws IOException {
        xy_2 xy_22 = aZ3.a(string, proxy);
        at_2 at_22 = new at_2(xy_22, amn_12);
        aZ3.a(at_22);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(String string, int n, Proxy proxy) {
        String string2 = aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), ju_2.n), n), ju_2.q), proxy).toString();
        return string2;
    }

    public static byte[] a(String string) throws IOException {
        return aZ3.b(string, Proxy.NO_PROXY);
    }

    public static void a(String string, amn_1 amn_12) throws IOException {
        aZ3.a(string, amn_12, Proxy.NO_PROXY);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FA a(xy_2 xy_22) throws IOException {
        aP2.b();
        HashMap hashMap = new HashMap();
        E e = new E(hashMap);
        HashMap hashMap2 = hashMap;
        synchronized (hashMap2) {
            at_2 at_22 = new at_2(xy_22, e);
            aZ3.a(at_22);
            try {
                hashMap.wait();
            }
            catch (InterruptedException interruptedException) {
                throw new InterruptedIOException(ju_2.p);
            }
            Exception exception = (Exception)MapInvoker.c(hashMap, ju_2.o);
            if (exception != null) {
                if (exception instanceof IOException) {
                    throw (IOException)exception;
                }
                if (exception instanceof RuntimeException) {
                    throw (RuntimeException)exception;
                }
                throw new RuntimeException(ch_2.b(exception), exception);
            }
            FA fA = (FA)MapInvoker.c(hashMap, ju_2.b);
            if (fA == null) {
                throw new IOException(ju_2.k);
            }
            return fA;
        }
    }

    public static byte[] b(String string, Proxy proxy) throws IOException {
        aP2.b();
        xy_2 xy_22 = aZ3.a(string, proxy);
        FA fA = aZ3.a(xy_22);
        if (NE.b(fA) / 100 != 2) {
            throw new IOException(aL0.c(aL0.a(new StringBuilder(), ju_2.g), NE.b(fA)).toString());
        }
        return NE.a(fA);
    }
}

