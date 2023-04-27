/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;

/*
 * Renamed from net.iK
 */
public class ik_1 {
    public static void a(ProfileLookupCallback profileLookupCallback, GameProfile gameProfile) {
        profileLookupCallback.onProfileLookupSucceeded(gameProfile);
    }
}

