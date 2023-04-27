/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import net.a5H;
import net.abi_1;
import net.ary_0;
import net.cs_0;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;

/*
 * Renamed from net.aqb
 */
public class aqb_2 {
    private static TrustManager[] g;
    private static HostnameVerifier a;
    static Logger d;
    private static int[] f;
    private @NonNull HostnameVerifier e;
    private @NonNull SSLSocketFactory c;
    private @NonNull SSLSocketFactory b;

    private void a(@NonNull SSLSocketFactory sSLSocketFactory, @NonNull HostnameVerifier hostnameVerifier) {
        a5H.a(sSLSocketFactory);
        a5H.a(hostnameVerifier);
    }

    public aqb_2() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sSLContext = cs_0.a(ary_0.c);
        cs_0.a(sSLContext, null, g, new SecureRandom());
        this.c = cs_0.a(sSLContext);
        this.b = a5H.b();
        this.e = a5H.a();
    }

    public static void b(int[] nArray) {
        f = nArray;
    }

    private static boolean lambda$static$0(String string, SSLSession sSLSession) {
        aqb_2.b();
        return string.equals(ary_0.a) || string.equals(ary_0.b);
    }

    public void c() {
        this.a(this.b, this.e);
    }

    public void d() {
        this.a(this.c, a);
    }

    static {
        d = LogManagerInvoker.c();
        aqb_2.b(null);
        g = new TrustManager[]{new abi_1()};
        a = aqb_2::lambda$static$0;
    }

    public static int[] b() {
        return f;
    }
}

