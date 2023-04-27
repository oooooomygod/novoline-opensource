/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.Type;
import net.WZ;
import net.aL0;
import net.aeh_1;
import net.t9;

public class Session {
    private Type b;
    private String d;
    private String c;
    private String a;

    public String a() {
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), t9.a), this.d), t9.b), this.c).toString();
    }

    public Session(String string, String string2, String string3, String string4) {
        this.a = string;
        this.c = string2;
        this.d = string3;
        this.b = aeh_1.a(string4);
    }

    public String b() {
        return this.d;
    }

    public Type f() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    public GameProfile d() {
        try {
            UUID uUID = WZ.a(this.c());
            return new GameProfile(uUID, this.a);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return new GameProfile(null, this.a);
        }
    }

    public String c() {
        return this.c;
    }
}

