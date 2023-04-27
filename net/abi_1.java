/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/*
 * Renamed from net.abi
 */
class abi_1
implements X509TrustManager {
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string) {
    }

    abi_1() {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string) {
    }
}

