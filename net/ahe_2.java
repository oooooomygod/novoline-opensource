/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import deobf.MCInvoker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import net.a5R;
import net.a7f_0;
import net.aL0;
import net.aP2;
import net.aS0;
import net.aYA;
import net.aZ6;
import net.adw_2;
import net.auq_0;
import net.dz_0;
import net.te_0;
import net.ys_2;

/*
 * Renamed from net.ahe
 */
public class ahe_2 {
    public static String a = "http://s.optifine.net";
    public static String b = "http://optifine.net";

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "v(&\u0000Q\n\u000bq,&\u0019\rLJ{r<\u0015\u001f\u0015v(&\u0000Q\n\u000bmr=\u0000\u001fLBw27^\u0005@P";
        int n2 = "v(&\u0000Q\n\u000bq,&\u0019\rLJ{r<\u0015\u001f\u0015v(&\u0000Q\n\u000bmr=\u0000\u001fLBw27^\u0005@P".length();
        int n3 = 19;
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
                    n6 = 83;
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
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x4D));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                b = stringArray2[0];
                a = stringArray2[1];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] a(String string) throws IOException {
        aP2.b();
        HttpURLConnection httpURLConnection = null;
        try {
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)a5R.a(uRL, MCInvoker.R(MCInvoker.f()));
            te_0.a(httpURLConnection, true);
            te_0.c(httpURLConnection, false);
            te_0.e(httpURLConnection);
            if (te_0.f(httpURLConnection) / 100 == 2) {
                InputStream inputStream = te_0.c(httpURLConnection);
                byte[] byArray = new byte[te_0.d(httpURLConnection)];
                int n = 0;
                aZ6.a(inputStream, byArray, n, byArray.length - n);
                throw new IOException(aL0.a(aL0.a(new StringBuilder(), a7f_0.k), string).toString());
            }
            if (te_0.g(httpURLConnection) != null) {
                ys_2.a(te_0.g(httpURLConnection));
            }
            throw new IOException(aL0.c(aL0.a(new StringBuilder(), a7f_0.d), te_0.f(httpURLConnection)).toString());
        }
        catch (Throwable throwable) {
            if (httpURLConnection != null) {
                te_0.a(httpURLConnection);
            }
            throw throwable;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, Map map, byte[] byArray) throws IOException {
        StringBuffer stringBuffer;
        BufferedReader bufferedReader;
        HttpURLConnection httpURLConnection;
        block6: {
            Object object;
            Object object2;
            Object object3;
            block5: {
                aP2.b();
                httpURLConnection = null;
                try {
                    URL uRL = new URL(string);
                    httpURLConnection = (HttpURLConnection)a5R.a(uRL, MCInvoker.R(MCInvoker.f()));
                    te_0.a(httpURLConnection, a7f_0.g);
                }
                catch (Throwable throwable) {
                    if (httpURLConnection == null) throw throwable;
                    te_0.a(httpURLConnection);
                    throw throwable;
                }
                object3 = aS0.f(MapInvoker.c(map));
                if (!dz_0.c((Iterator)object3)) break block5;
                object2 = dz_0.b((Iterator)object3);
                object = aL0.a(aL0.a(new StringBuilder(), a7f_0.h), MapInvoker.c(map, object2)).toString();
                te_0.b(httpURLConnection, (String)object2, (String)object);
            }
            te_0.b(httpURLConnection, a7f_0.b, a7f_0.f);
            te_0.b(httpURLConnection, a7f_0.i, aL0.c(aL0.a(new StringBuilder(), a7f_0.c), byArray.length).toString());
            te_0.b(httpURLConnection, a7f_0.a, a7f_0.j);
            te_0.b(httpURLConnection, false);
            te_0.a(httpURLConnection, true);
            te_0.c(httpURLConnection, true);
            object3 = te_0.b(httpURLConnection);
            aYA.a((OutputStream)object3, byArray);
            aYA.a((OutputStream)object3);
            aYA.b((OutputStream)object3);
            object2 = te_0.c(httpURLConnection);
            object = new InputStreamReader((InputStream)object2, a7f_0.e);
            bufferedReader = new BufferedReader((Reader)object);
            stringBuffer = new StringBuffer();
            String string2 = auq_0.c(bufferedReader);
            if (string2 == null) break block6;
            adw_2.a(stringBuffer, string2);
            adw_2.a(stringBuffer, '\r');
        }
        auq_0.a(bufferedReader);
        String string3 = stringBuffer.toString();
        if (httpURLConnection == null) return string3;
        te_0.a(httpURLConnection);
        return string3;
    }
}

