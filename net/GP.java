/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.security.MessageDigest;

public class GP {
    private static ListInvoker[] b;

    public static byte[] b(MessageDigest messageDigest) {
        return messageDigest.digest();
    }

    static {
        if (GP.b() != null) {
            GP.b(new ListInvoker[5]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void b(MessageDigest messageDigest, byte[] byArray) {
        messageDigest.update(byArray);
    }

    public static byte[] a(MessageDigest messageDigest, byte[] byArray) {
        return messageDigest.digest(byArray);
    }

    public static void a(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    public static MessageDigest a(String string) {
        return MessageDigest.getInstance(string);
    }
}

