/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import deobf.IChatComponent;
import deobf.ITickable;
import deobf.MinecraftServer;
import deobf.NetworkManager;
import net.minecraft.network.packts.C00PacketLoginStart;
import net.minecraft.network.packts.C01PacketEncryptionResponse;
import net.minecraft.network.packts.S00PacketDisconnect;
import net.minecraft.network.packts.S01PacketEncryptionRequest;
import java.security.PrivateKey;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.ChatComponentText;
import deobf.EntityPlayerMP;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Md
 */
public class md_0
implements INetHandlerLoginServer,
ITickable {
    private MinecraftServer g;
    private int c;
    private static Random b;
    private static Logger j;
    private byte[] k = new byte[4];
    private GameProfile e;
    private SecretKey h;
    private a8T i = a8T.HELLO;
    private EntityPlayerMP a;
    public NetworkManager d;
    private String f = ve_2.f;
    private static AtomicInteger l;

    @Override
    public void a(IChatComponent iChatComponent) {
        LoggerInvoker.info(j, aL0.a(aL0.a(aL0.a(new StringBuilder(), this.c()), ve_2.h), aBO.d(iChatComponent)).toString());
    }

    @Override
    public void b() {
        if (this.i == a8T.READY_TO_ACCEPT) {
            this.a();
        } else if (this.i == a8T.DELAY_ACCEPT) {
            aek_1.a(ServerInvoker.R(this.g), a4Z.a(this.e));
            this.i = a8T.READY_TO_ACCEPT;
            aek_1.a(ServerInvoker.R(this.g), this.d, this.a);
            this.a = null;
        }
        if (this.c++ == 600) {
            this.a(ve_2.a);
        }
    }

    static {
        j = LogManagerInvoker.c();
        l = new AtomicInteger(0);
        b = new Random();
    }

    public void a(String string) {
        try {
            LoggerInvoker.info(j, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ve_2.c), this.c()), ve_2.j), string).toString());
            ChatComponentText chatComponentText = new ChatComponentText(string);
            NetworkManagerInvoker.sendPacket(this.d, new S00PacketDisconnect(chatComponentText));
            NetworkManagerInvoker.a(this.d, chatComponentText);
        }
        catch (Exception exception) {
            LoggerInvoker.a(j, ve_2.k, exception);
        }
    }

    static SecretKey b(md_0 md_02) {
        return md_02.h;
    }

    public void a() {
        if (!a4Z.b(this.e)) {
            this.e = this.a(this.e);
        }
        String string = aek_1.a(ServerInvoker.R(this.g), NetworkManagerInvoker.b(this.d), this.e);
        this.a(string);
    }

    protected GameProfile a(GameProfile gameProfile) {
        UUID uUID = awc_1.a(StringInvoker.a(aL0.a(aL0.a(new StringBuilder(), ve_2.n), a4Z.d(gameProfile)).toString(), Charsets.UTF_8));
        return new GameProfile(uUID, a4Z.d(gameProfile));
    }

    static Logger b() {
        return j;
    }

    static GameProfile a(md_0 md_02, GameProfile gameProfile) {
        md_02.e = gameProfile;
        return md_02.e;
    }

    @Override
    public void a(C01PacketEncryptionResponse c01PacketEncryptionResponse) {
        ag4_0.b(this.i == a8T.KEY, ve_2.l, new Object[0]);
        PrivateKey privateKey = EE.a(ServerInvoker.D(this.g));
        if (!a7r_0.a(this.k, acr_1.b(c01PacketEncryptionResponse, privateKey))) {
            throw new IllegalStateException(ve_2.g);
        }
        this.h = acr_1.a(c01PacketEncryptionResponse, privateKey);
        this.i = a8T.AUTHENTICATING;
        NetworkManagerInvoker.a(this.d, this.h);
        new am6_0(this, aL0.c(aL0.a(new StringBuilder(), ve_2.e), ee_0.a(l)).toString()).start();
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    static MinecraftServer a(md_0 md_02) {
        return md_02.g;
    }

    static a8T a(md_0 md_02, a8T a8T2) {
        md_02.i = a8T2;
        return md_02.i;
    }

    public String c() {
        return this.e != null ? aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.e.toString()), ve_2.m), NetworkManagerInvoker.b(this.d).toString()), ve_2.b).toString() : StringInvoker.a(NetworkManagerInvoker.b(this.d));
    }

    @Override
    public void a(C00PacketLoginStart c00PacketLoginStart) {
        ag4_0.b(this.i == a8T.HELLO, ve_2.i, new Object[0]);
        this.e = YP.a(c00PacketLoginStart);
        if (ServerInvoker.e(this.g) && !NetworkManagerInvoker.g(this.d)) {
            this.i = a8T.KEY;
            this.getClass();
            NetworkManagerInvoker.sendPacket(this.d, new S01PacketEncryptionRequest(ve_2.d, EE.b(ServerInvoker.D(this.g)), this.k));
        } else {
            this.i = a8T.READY_TO_ACCEPT;
        }
    }

    static GameProfile c(md_0 md_02) {
        return md_02.e;
    }

    public md_0(MinecraftServer minecraftServer, NetworkManager networkManager) {
        this.g = minecraftServer;
        this.d = networkManager;
        a5_0.a(b, this.k);
    }
}

