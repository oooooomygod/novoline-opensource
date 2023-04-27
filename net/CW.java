/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.minecraft.user.MicrosoftOAuthExchangeCode
 *  cc.novoline.auth.minecraft.user.MinecraftOAuthAuthenticate
 *  cc.novoline.auth.minecraft.user.MinecraftUser
 */
package net;

import cc.novoline.auth.minecraft.user.MicrosoftOAuthExchangeCode;
import cc.novoline.auth.minecraft.user.MinecraftOAuthAuthenticate;
import cc.novoline.auth.minecraft.user.MinecraftUser;

public class CW {
    public static MinecraftUser a(MinecraftOAuthAuthenticate minecraftOAuthAuthenticate, MicrosoftOAuthExchangeCode microsoftOAuthExchangeCode) {
        return minecraftOAuthAuthenticate.authenticate(microsoftOAuthExchangeCode);
    }
}

