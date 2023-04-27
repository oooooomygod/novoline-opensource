/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  fr.litarvan.openauth.microsoft.model.response.MinecraftProfile
 */
package net;

import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import fr.litarvan.openauth.microsoft.model.response.MinecraftProfile;

public class aAQ {
    public static String c(MicrosoftAuthResult microsoftAuthResult) {
        return microsoftAuthResult.getAccessToken();
    }

    public static String b(MicrosoftAuthResult microsoftAuthResult) {
        return microsoftAuthResult.getRefreshToken();
    }

    public static MinecraftProfile a(MicrosoftAuthResult microsoftAuthResult) {
        return microsoftAuthResult.getProfile();
    }
}

