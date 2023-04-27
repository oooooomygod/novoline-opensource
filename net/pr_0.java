/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.security.PublicKey;
import java.security.cert.Certificate;

/*
 * Renamed from net.pr
 */
public class pr_0 {
    private static String b;

    public static String b() {
        return b;
    }

    public static void a(Certificate certificate, PublicKey publicKey) {
        certificate.verify(publicKey);
    }

    static {
        if (pr_0.b() != null) {
            pr_0.b("lcfWc");
        }
    }

    public static void b(String string) {
        b = string;
    }
}

