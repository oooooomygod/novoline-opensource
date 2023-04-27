/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.SessionInvoker;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import deobf.EnumConnectionState;
import deobf.GuiScreen;
import deobf.IChatComponent;
import deobf.INetHandlerLoginClient;
import deobf.MCInvoker;
import deobf.NetHandlerPlayClient;
import deobf.NetworkManager;
import net.minecraft.network.packts.C01PacketEncryptionResponse;
import net.minecraft.network.packts.S00PacketDisconnect;
import net.minecraft.network.packts.S01PacketEncryptionRequest;
import net.minecraft.network.packts.S02PacketLoginSuccess;
import net.minecraft.network.packts.S03PacketEnableCompression;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.Logger;

public class NetHandlerLoginClient
implements INetHandlerLoginClient {
    private NetworkManager e;
    private static Logger d = LogManagerInvoker.c();
    private GameProfile b;
    private GuiScreen a;
    private Minecraft c;

    public NetHandlerLoginClient(NetworkManager networkManager, Minecraft minecraft, GuiScreen guiScreen) {
        this.e = networkManager;
        this.c = minecraft;
        this.a = guiScreen;
    }

    @Override
    public void a(S00PacketDisconnect s00PacketDisconnect) {
        NetworkManagerInvoker.a(this.e, vj_2.a(s00PacketDisconnect));
    }

    @Override
    public void a(S01PacketEncryptionRequest s01PacketEncryptionRequest) {
        SecretKey secretKey = rk_1.a();
        String string = GI.b(s01PacketEncryptionRequest);
        PublicKey publicKey = GI.a(s01PacketEncryptionRequest);
        String string2 = apn_2.a(new BigInteger(rk_1.a(string, publicKey, secretKey)), 16);
        if (MCInvoker.W(this.c) != null && aKZ.e(MCInvoker.W(this.c))) {
            try {
                aSI.a(this.a(), SessionInvoker.a(MCInvoker.y(this.c)), SessionInvoker.c(MCInvoker.y(this.c)), string2);
            }
            catch (AuthenticationException authenticationException) {
                LoggerInvoker.warn(d, km_1.g);
            }
        } else {
            try {
                aSI.a(this.a(), SessionInvoker.a(MCInvoker.y(this.c)), SessionInvoker.c(MCInvoker.y(this.c)), string2);
            }
            catch (AuthenticationUnavailableException authenticationUnavailableException) {
                NetworkManagerInvoker.a(this.e, new aoz_1(km_1.e, new aoz_1(km_1.f, new Object[0])));
                return;
            }
            catch (InvalidCredentialsException invalidCredentialsException) {
                NetworkManagerInvoker.a(this.e, new aoz_1(km_1.c, new aoz_1(km_1.a, new Object[0])));
                return;
            }
            catch (AuthenticationException authenticationException) {
                NetworkManagerInvoker.a(this.e, new aoz_1(km_1.b, ex_0.a(authenticationException)));
                return;
            }
        }
        NetworkManagerInvoker.a(this.e, new C01PacketEncryptionResponse(secretKey, publicKey, GI.c(s01PacketEncryptionRequest)), arg_0 -> this.lambda$handleEncryptionRequest$0(secretKey, arg_0), new GenericFutureListener[0]);
    }

    @Override
    public void a(IChatComponent iChatComponent) {
        MCInvoker.displayGuiScreen(this.c, new rg_0(this.a, km_1.d, iChatComponent));
    }

    private static AuthenticationException a(AuthenticationException authenticationException) {
        return authenticationException;
    }

    private void lambda$handleEncryptionRequest$0(SecretKey secretKey, Future future) throws Exception {
        NetworkManagerInvoker.a(this.e, secretKey);
    }

    @Override
    public void a(S03PacketEnableCompression s03PacketEnableCompression) {
        if (!NetworkManagerInvoker.g(this.e)) {
            NetworkManagerInvoker.a(this.e, vv_1.a(s03PacketEnableCompression));
        }
    }

    @Override
    public void a(S02PacketLoginSuccess s02PacketLoginSuccess) {
        this.b = aUJ.a(s02PacketLoginSuccess);
        NetworkManagerInvoker.a(this.e, EnumConnectionState.PLAY);
        NetworkManagerInvoker.setNetHandler(this.e, new NetHandlerPlayClient(this.c, this.a, this.e, this.b));
    }

    private MinecraftSessionService a() {
        return this.c.getSessionService();
    }
}

