/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import net.minecraft.network.packts.S38PacketPlayerListItem;

/*
 * Renamed from net.ayB
 */
public class ayb_1 {
    S38PacketPlayerListItem b;
    private GameProfile a;
    private int d;
    private IChatComponent e;
    private GameType c;

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(mg_2.a(aWU.a(this), aYt.d, this.d), aYt.a, (Object)this.c), aYt.c, this.a), aYt.b, this.e == null ? null : aGU.a(this.e)).toString();
    }

    public GameType c() {
        return this.c;
    }

    public ayb_1(S38PacketPlayerListItem s38PacketPlayerListItem, GameProfile gameProfile, int n, GameType gameType, IChatComponent iChatComponent) {
        this.b = s38PacketPlayerListItem;
        this.a = gameProfile;
        this.d = n;
        this.c = gameType;
        this.e = iChatComponent;
    }

    public GameProfile d() {
        return this.a;
    }

    public int b() {
        return this.d;
    }

    public IChatComponent a() {
        return this.e;
    }
}

