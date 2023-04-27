/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import deobf.EntityPlayerMP;
import net.OV;
import net.PacketBuffer;
import net.Uf;
import net.VG;
import net.a4Z;
import net.aH7;
import net.aWU;
import net.aYN;
import net.ar3_0;
import net.aux__1;
import net.ayb_1;
import net.ayw_0;
import net.dz_0;
import net.mg_2;
import net.ms_0;
import net.my_0;
import net.po_1;

public class S38PacketPlayerListItem
implements Packet<INetHandlerPlayClient> {
    private List<ayb_1> b = my_0.c();
    private aux__1 a;

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = (aux__1)PacketBufferInvoker.a(packetBuffer, aux__1.class);
        int n = PacketBufferInvoker.b(packetBuffer);
        for (int i = 0; i < n; ++i) {
            GameProfile gameProfile = null;
            int n2 = 0;
            GameType gameType = null;
            IChatComponent iChatComponent = null;
            switch (this.a) {
                case ADD_PLAYER: {
                    gameProfile = new GameProfile(PacketBufferInvoker.h(packetBuffer), PacketBufferInvoker.d(packetBuffer, 16));
                    int n3 = PacketBufferInvoker.b(packetBuffer);
                    for (int j = 0; j < n3; ++j) {
                        String string = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
                        String string2 = PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE);
                        if (PacketBufferInvoker.i(packetBuffer)) {
                            ayw_0.a(a4Z.c(gameProfile), string, new Property(string, string2, PacketBufferInvoker.d(packetBuffer, Short.MAX_VALUE)));
                            continue;
                        }
                        ayw_0.a(a4Z.c(gameProfile), string, new Property(string, string2));
                    }
                    gameType = ar3_0.a(PacketBufferInvoker.b(packetBuffer));
                    n2 = PacketBufferInvoker.b(packetBuffer);
                    if (!PacketBufferInvoker.i(packetBuffer)) break;
                    iChatComponent = PacketBufferInvoker.q(packetBuffer);
                    break;
                }
                case UPDATE_GAME_MODE: {
                    gameProfile = new GameProfile(PacketBufferInvoker.h(packetBuffer), null);
                    gameType = ar3_0.a(PacketBufferInvoker.b(packetBuffer));
                    break;
                }
                case UPDATE_LATENCY: {
                    gameProfile = new GameProfile(PacketBufferInvoker.h(packetBuffer), null);
                    n2 = PacketBufferInvoker.b(packetBuffer);
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    gameProfile = new GameProfile(PacketBufferInvoker.h(packetBuffer), null);
                    if (!PacketBufferInvoker.i(packetBuffer)) break;
                    iChatComponent = PacketBufferInvoker.q(packetBuffer);
                    break;
                }
                case REMOVE_PLAYER: {
                    gameProfile = new GameProfile(PacketBufferInvoker.h(packetBuffer), null);
                }
            }
            ListInvoker.add(this.b, new ayb_1(this, gameProfile, n2, gameType, iChatComponent));
        }
    }

    public aux__1 b() {
        return this.a;
    }

    public String toString() {
        return mg_2.a(mg_2.a(aWU.a(this), aYN.b, (Object)this.a), aYN.a, this.b).toString();
    }

    public S38PacketPlayerListItem(aux__1 aux__12, Iterable<EntityPlayerMP> iterable) {
        this.a = aux__12;
        Iterator iterator = OV.a(iterable);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            ListInvoker.add(this.b, new ayb_1(this, EntityPlayerInvoker.I(entityPlayerMP), entityPlayerMP.b4, Uf.a(entityPlayerMP.bX), EntityPlayerInvoker.f(entityPlayerMP)));
        }
    }

    public List<ayb_1> a() {
        return this.b;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.b(packetBuffer, ListInvoker.size(this.b));
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            ayb_1 ayb_12 = (ayb_1)dz_0.b(iterator);
            switch (this.a) {
                case ADD_PLAYER: {
                    PacketBufferInvoker.a(packetBuffer, a4Z.a(aH7.d(ayb_12)));
                    PacketBufferInvoker.a(packetBuffer, a4Z.d(aH7.d(ayb_12)));
                    PacketBufferInvoker.b(packetBuffer, ayw_0.e(a4Z.c(aH7.d(ayb_12))));
                    Iterator iterator2 = ms_0.a(a4Z.c(aH7.d(ayb_12)).values());
                    while (dz_0.c(iterator2)) {
                        Property property = (Property)dz_0.b(iterator2);
                        PacketBufferInvoker.a(packetBuffer, po_1.c(property));
                        PacketBufferInvoker.a(packetBuffer, po_1.b(property));
                        if (po_1.a(property)) {
                            PacketBufferInvoker.a(packetBuffer, true);
                            PacketBufferInvoker.a(packetBuffer, po_1.d(property));
                            continue;
                        }
                        PacketBufferInvoker.a(packetBuffer, false);
                    }
                    PacketBufferInvoker.b(packetBuffer, ar3_0.a(aH7.b(ayb_12)));
                    PacketBufferInvoker.b(packetBuffer, aH7.c(ayb_12));
                    if (aH7.a(ayb_12) == null) {
                        PacketBufferInvoker.a(packetBuffer, false);
                        break;
                    }
                    PacketBufferInvoker.a(packetBuffer, true);
                    PacketBufferInvoker.a(packetBuffer, aH7.a(ayb_12));
                    break;
                }
                case UPDATE_GAME_MODE: {
                    PacketBufferInvoker.a(packetBuffer, a4Z.a(aH7.d(ayb_12)));
                    PacketBufferInvoker.b(packetBuffer, ar3_0.a(aH7.b(ayb_12)));
                    break;
                }
                case UPDATE_LATENCY: {
                    PacketBufferInvoker.a(packetBuffer, a4Z.a(aH7.d(ayb_12)));
                    PacketBufferInvoker.b(packetBuffer, aH7.c(ayb_12));
                    break;
                }
                case UPDATE_DISPLAY_NAME: {
                    PacketBufferInvoker.a(packetBuffer, a4Z.a(aH7.d(ayb_12)));
                    if (aH7.a(ayb_12) == null) {
                        PacketBufferInvoker.a(packetBuffer, false);
                        break;
                    }
                    PacketBufferInvoker.a(packetBuffer, true);
                    PacketBufferInvoker.a(packetBuffer, aH7.a(ayb_12));
                    break;
                }
                case REMOVE_PLAYER: {
                    PacketBufferInvoker.a(packetBuffer, a4Z.a(aH7.d(ayb_12)));
                }
            }
        }
    }

    public S38PacketPlayerListItem() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S38PacketPlayerListItem(aux__1 aux__12, EntityPlayerMP ... entityPlayerMPArray) {
        this.a = aux__12;
        for (EntityPlayerMP entityPlayerMP : entityPlayerMPArray) {
            ListInvoker.add(this.b, new ayb_1(this, EntityPlayerInvoker.I(entityPlayerMP), entityPlayerMP.b4, Uf.a(entityPlayerMP.bX), EntityPlayerInvoker.f(entityPlayerMP)));
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

