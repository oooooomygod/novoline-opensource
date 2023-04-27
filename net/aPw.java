/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.EntityPlayerMP;
import net.minecraft.server.management.ServerConfigurationManager;
import java.net.SocketAddress;

public class aPw
extends ServerConfigurationManager {
    private NBTTagCompound v;

    @Override
    protected void e(EntityPlayerMP entityPlayerMP) {
        if (EntityPlayerInvoker.s(entityPlayerMP).equals(IntegratedServerInvoker.k(this.a()))) {
            this.v = new NBTTagCompound();
            EntityPlayerInvoker.a(entityPlayerMP, this.v);
        }
        super.e(entityPlayerMP);
    }

    public IntegratedServer a() {
        return (IntegratedServer)super.k();
    }

    public aPw(IntegratedServer integratedServer) {
        super(integratedServer);
        this.a(10);
    }

    @Override
    public NBTTagCompound d() {
        return this.v;
    }

    @Override
    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        return StringInvoker.d(a4Z.d(gameProfile), IntegratedServerInvoker.k(this.a())) && this.b(a4Z.d(gameProfile)) != null ? Y.a : super.a(socketAddress, gameProfile);
    }
}

