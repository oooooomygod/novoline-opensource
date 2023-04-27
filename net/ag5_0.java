/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.minecraft.user.MicrosoftOAuthToken
 */
package net;

import cc.novoline.auth.minecraft.user.MicrosoftOAuthToken;

/*
 * Renamed from net.ag5
 */
public class ag5_0 {
    public static boolean a(MicrosoftOAuthToken microsoftOAuthToken) {
        return microsoftOAuthToken.isExpired();
    }

    public static String b(MicrosoftOAuthToken microsoftOAuthToken) {
        return microsoftOAuthToken.getRefreshToken();
    }
}

