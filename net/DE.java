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

class DE
implements ProfileLookupCallback {
    GameProfile[] a;

    public void onProfileLookupFailed(GameProfile gameProfile, Exception exception) {
        this.a[0] = null;
    }

    DE(GameProfile[] gameProfileArray) {
        this.a = gameProfileArray;
    }

    public void onProfileLookupSucceeded(GameProfile gameProfile) {
        this.a[0] = gameProfile;
    }
}

