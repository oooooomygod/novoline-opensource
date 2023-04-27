/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.ThreadInvoker;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import net.FA;
import net.P8;
import net.a0o_0;
import net.a8U;
import net.aL0;
import net.aP2;
import net.aZ6;
import net.anZ;
import net.at_2;
import net.cg_1;
import net.ys_2;

public class WA
extends Thread {
    private static char e = '\n';
    private static String d = "Content-Length";
    private anZ b = null;
    private static Charset c;
    private static char a = '\r';

    private String c(InputStream inputStream) throws IOException {
        aP2.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = -1;
        int n2 = aZ6.a(inputStream);
        a0o_0.a(byteArrayOutputStream, n2);
        n = n2;
        byte[] byArray = a0o_0.a(byteArrayOutputStream);
        String string = new String(byArray, c);
        string = StringInvoker.b(string, 0, StringInvoker.c(string) - 2);
        return string;
    }

    @Override
    public void run() {
        aP2.b();
        if (!ThreadInvoker.f()) {
            at_2 at_22 = null;
            try {
                try {
                    at_22 = cg_1.a(this.b);
                    InputStream inputStream = cg_1.b(this.b);
                    FA fA = this.a(inputStream);
                    cg_1.a(this.b, at_22, fA);
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            catch (Exception exception) {
                cg_1.a(this.b, at_22, exception);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Xc 8T@\u007f6@+\"VZc".toCharArray();
        int n2 = 0;
        int n3 = 26;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 1));
            n3 = n3;
        }
    }

    private byte[] b(InputStream inputStream) throws IOException {
        aP2.b();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String string = this.c(inputStream);
        String[] stringArray = ys_2.a(string, a8U.b);
        int n = P8.a(stringArray[0], 16);
        byte[] byArray = new byte[n];
        this.a(byArray, inputStream);
        a0o_0.a(byteArrayOutputStream, byArray);
        this.c(inputStream);
        return a0o_0.a(byteArrayOutputStream);
    }

    private FA a(InputStream inputStream) throws IOException {
        aP2.b();
        String string = this.c(inputStream);
        String[] stringArray = ys_2.a(string, a8U.a);
        if (stringArray.length < 3) {
            throw new IOException(aL0.a(aL0.a(new StringBuilder(), a8U.i), string).toString());
        }
        String cfr_ignored_0 = stringArray[0];
        int n = ys_2.a(stringArray[1], 0);
        String cfr_ignored_1 = stringArray[2];
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            String string2;
            String string3;
            String string4;
            if (StringInvoker.c(string4 = this.c(inputStream)) <= 0) {
                byte[] byArray = null;
                string3 = (String)MapInvoker.c(linkedHashMap, a8U.g);
                if (string3 != null) {
                    int n2 = ys_2.a(string3, -1);
                    if (n2 > 0) {
                        byArray = new byte[n2];
                        this.a(byArray, inputStream);
                    }
                } else {
                    string2 = (String)MapInvoker.c(linkedHashMap, a8U.d);
                    if (ys_2.a((Object)string2, (Object)a8U.e)) {
                        byArray = this.b(inputStream);
                    }
                }
                return new FA(n, string, linkedHashMap, byArray);
            }
            int n3 = StringInvoker.b(string4, a8U.c);
            string3 = StringInvoker.h(StringInvoker.b(string4, 0, n3));
            string2 = StringInvoker.h(StringInvoker.a(string4, n3 + 1));
            MapInvoker.c(linkedHashMap, string3, string2);
        }
    }

    private void a(byte[] byArray, InputStream inputStream) throws IOException {
        aP2.b();
        int n = 0;
        if (n < byArray.length) {
            int n2 = aZ6.a(inputStream, byArray, n, byArray.length - n);
            if (n2 < 0) {
                throw new EOFException();
            }
            n += n2;
        }
    }

    public WA(anZ anZ2) {
        super(a8U.h);
        this.b = anZ2;
    }
}

