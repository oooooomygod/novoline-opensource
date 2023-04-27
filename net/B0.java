/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.codec.digest.DigestUtils
 */
package net;

import org.apache.commons.codec.digest.DigestUtils;

public class B0 {
    private static String b;

    static {
        if (B0.b() != null) {
            B0.c("OVKHIc");
        }
    }

    public static String b(String string) {
        return DigestUtils.sha256Hex((String)string);
    }

    public static void c(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static String a(String string) {
        return DigestUtils.md5Hex((String)string);
    }
}

