/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.exceptions.AuthenticationException
 */
package net;

import com.mojang.authlib.exceptions.AuthenticationException;

/*
 * Renamed from net.ex
 */
public class ex_0 {
    private static String b;

    public static void b(String string) {
        b = string;
    }

    static {
        if (ex_0.b() != null) {
            ex_0.b("dLYao");
        }
    }

    public static String b() {
        return b;
    }

    public static String a(AuthenticationException authenticationException) {
        return authenticationException.getMessage();
    }

    public static void b(AuthenticationException authenticationException) {
        authenticationException.printStackTrace();
    }
}

