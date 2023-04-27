/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.minecraft.auth.Account
 *  cc.novoline.auth.minecraft.user.MicrosoftOAuthToken
 */
package net;

import cc.novoline.auth.minecraft.auth.Account;
import cc.novoline.auth.minecraft.user.MicrosoftOAuthToken;

/*
 * Renamed from net.vK
 */
public class vk_1 {
    private static int b;

    public static MicrosoftOAuthToken b(Account account) {
        return account.getMicrosoftOAuthToken();
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        vk_1.b();
        return 123;
    }

    public static String a(Account account) {
        return account.getAccessToken();
    }

    public static void b(Account account, String string) {
        account.setUsername(string);
    }

    public static void a(Account account, String string) {
        account.setPassword(string);
    }

    public static int b() {
        return b;
    }

    static {
        if (vk_1.b() == 0) {
            vk_1.b(21);
        }
    }
}

