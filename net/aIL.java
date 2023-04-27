/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthenticator
 */
package net;

import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.MicrosoftAuthenticator;
import java.util.concurrent.CompletableFuture;

public class aIL {
    private static String[] b;

    static {
        if (aIL.b() == null) {
            aIL.b(new String[3]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static MicrosoftAuthResult a(MicrosoftAuthenticator microsoftAuthenticator, String string) {
        return microsoftAuthenticator.loginWithRefreshToken(string);
    }

    public static CompletableFuture b(MicrosoftAuthenticator microsoftAuthenticator, String string) {
        return microsoftAuthenticator.loginWithAsyncWebview(string);
    }

    public static CompletableFuture a(MicrosoftAuthenticator microsoftAuthenticator) {
        return microsoftAuthenticator.loginWithAsyncWebview();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

