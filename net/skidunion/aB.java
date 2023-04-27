/*
 * Decompiled with CFR 0.152.
 */
package net.skidunion;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.security.MessageDigest;
import java.util.Random;
import net.GP;
import net.a5_0;
import net.aHY;
import net.aL0;
import net.anu_2;
import net.auk_0;
import net.skidunion.aE;
import net.skidunion.aO;
import net.wc_0;

public class aB {
    private static Random b = new Random();
    static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private aO c;

    private static int a(long l4) {
        return (int)l4;
    }

    public void a() {
        aHY.a(this.c);
    }

    private static long a(int[] nArray, int n) {
        return (long)nArray[n] << 32 | (long)nArray[n + 1] & 0xFFFFFFFFL;
    }

    private static void a(long l4, byte[] byArray, int n) {
        byArray[n] = (byte)(l4 >>> 56);
        byArray[n + 1] = (byte)(l4 >>> 48 & 0xFFL);
        byArray[n + 2] = (byte)(l4 >>> 40 & 0xFFL);
        byArray[n + 3] = (byte)(l4 >>> 32 & 0xFFL);
        byArray[n + 4] = (byte)(l4 >>> 24 & 0xFFL);
        byArray[n + 5] = (byte)(l4 >>> 16 & 0xFFL);
        byArray[n + 6] = (byte)(l4 >>> 8 & 0xFFL);
        byArray[n + 7] = (byte)l4;
    }

    private static int a(String string, byte[] byArray, int n, int n2, int n3) {
        int n4;
        aE.c();
        int n5 = StringInvoker.c(string);
        int n6 = n5 - n >> 1;
        if (n6 < n3) {
            n3 = n6;
        }
        if (n3 > (n4 = byArray.length - n2)) {
            n3 = n4;
        }
        int n7 = 0;
        int n8 = 0;
        if (n8 < n3) {
            char c;
            int n9 = 0;
            int n10 = 0;
            n9 = (byte)(n9 << 4);
            if ((c = StringInvoker.b(string, n++)) >= 'a' && c <= 'f') {
                n9 = (byte)(n9 | (byte)(c - 97) + 10);
            }
            if (c >= '0' && c <= '9') {
                n9 = (byte)(n9 | (byte)(c - 48));
            }
            ++n10;
            byArray[n2++] = n9;
            ++n7;
            ++n8;
        }
        return n7;
    }

    public aB() {
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b(String string) {
        aE.c();
        int n = StringInvoker.c(string) >> 1 & 0xFFFFFFF8;
        if (n < 8) {
            return null;
        }
        byte[] byArray = new byte[8];
        int n2 = aB.a(string, byArray, 0, 0, 8);
        if (n2 < 8) {
            return null;
        }
        if ((n -= 8) == 0) {
            return auk_0.d;
        }
        byte[] byArray2 = new byte[n];
        n2 = aB.a(string, byArray2, 16, 0, n);
        if (n2 < n) {
            return null;
        }
        aO aO10 = this.c;
        synchronized (aO10) {
            aHY.b(this.c, byArray);
            aHY.a(this.c, byArray2);
        }
        int n3 = byArray2[byArray2.length - 1] & 0xFF;
        if (n3 > 8 || n3 < 0) {
            n3 = 0;
        }
        if ((n2 -= n3) < 0) {
            return auk_0.c;
        }
        return aB.a(byArray2, 0, n2);
    }

    private static String a(byte[] byArray, int n, int n2) {
        aE.d();
        int n3 = byArray.length - n;
        if (n3 < (n2 &= 0xFFFFFFFE)) {
            n2 = n3;
        }
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, n2 >> 1);
        int n4 = 0;
        aL0.b(stringBuilder, n4++, (char)(byArray[n] << 8 | byArray[n + 1] & 0xFF));
        n += 2;
        n2 -= 2;
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String a(String string, long l4) {
        char c;
        aE.c();
        int n = StringInvoker.c(string);
        byte[] byArray = new byte[(n << 1 & 0xFFFFFFF8) + 8];
        int n2 = 0;
        int n3 = 0;
        if (n3 < n) {
            c = StringInvoker.b(string, n3);
            byArray[n2++] = (byte)(c >> 8 & 0xFF);
            byArray[n2++] = (byte)(c & 0xFF);
            ++n3;
        }
        c = (char)(byArray.length - (n << 1));
        if (n2 < byArray.length) {
            byArray[n2++] = c;
        }
        Object object = this.c;
        synchronized (object) {
            aHY.a(this.c, l4);
            aHY.c(this.c, byArray);
        }
        object = new byte[8];
        aB.a(l4, (byte[])object, 0);
        return aL0.a(aL0.a(new StringBuilder(), aB.b((byte[])object, 0, 8)), aB.b(byArray, 0, byArray.length)).toString();
    }

    private static int b(long l4) {
        return (int)(l4 >>> 32);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a(String string) {
        Random random = b;
        synchronized (random) {
            long l4 = a5_0.b(b);
            return this.a(string, l4);
        }
    }

    private void b() {
        String string = SystemInvoker.c(auk_0.e);
        MessageDigest messageDigest = null;
        try {
            messageDigest = GP.a(auk_0.a);
            GP.b(messageDigest, StringInvoker.e(string));
        }
        catch (Exception exception) {}
        SystemInvoker.b(auk_0.b, wc_0.a(anu_2.b(), GP.b(messageDigest)));
        this.c = new aO(0L);
        GP.a(messageDigest);
    }

    private static void a(long l4, int[] nArray, int n) {
        nArray[n] = (int)(l4 >>> 32);
        nArray[n + 1] = (int)l4;
    }

    private static long a(int n, int n2) {
        return (long)n2 << 32 | (long)n & 0xFFFFFFFFL;
    }

    private static long a(byte[] byArray, int n) {
        return (long)byArray[n] << 56 | ((long)byArray[n + 1] & 0xFFL) << 48 | ((long)byArray[n + 2] & 0xFFL) << 40 | ((long)byArray[n + 3] & 0xFFL) << 32 | ((long)byArray[n + 4] & 0xFFL) << 24 | ((long)byArray[n + 5] & 0xFFL) << 16 | ((long)byArray[n + 6] & 0xFFL) << 8 | (long)byArray[n + 7] & 0xFFL;
    }

    private static String b(byte[] byArray, int n, int n2) {
        aE.d();
        StringBuilder stringBuilder = new StringBuilder();
        aL0.a(stringBuilder, n2 << 1);
        int n3 = 0;
        int n4 = 0;
        if (n4 < n2) {
            aL0.b(stringBuilder, n3++, a[byArray[n4 + n] >> 4 & 0xF]);
            aL0.b(stringBuilder, n3++, a[byArray[n4 + n] & 0xF]);
            ++n4;
        }
        return stringBuilder.toString();
    }
}

