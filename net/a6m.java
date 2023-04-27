/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;

public class a6m {
    public static GameProfile a(YggdrasilUserAuthentication yggdrasilUserAuthentication) {
        return yggdrasilUserAuthentication.getSelectedProfile();
    }

    public static String c(YggdrasilUserAuthentication yggdrasilUserAuthentication) {
        return yggdrasilUserAuthentication.getAuthenticatedToken();
    }

    public static void a(YggdrasilUserAuthentication yggdrasilUserAuthentication, String string) {
        yggdrasilUserAuthentication.setUsername(string);
    }

    public static void b(YggdrasilUserAuthentication yggdrasilUserAuthentication) {
        yggdrasilUserAuthentication.logIn();
    }
}

