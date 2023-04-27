/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.C08PacketPlayerBlockPlacementInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.PacketThreadUtilInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.*;
import net.minecraft.block.BlockPos;
import net.minecraft.inventory.Container;
import net.minecraft.crash.CrashReportCategory;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.util.ReportedException;
import deobf.TileEntity;
import net.minecraft.network.packts.C00PacketKeepAlive;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;
import net.minecraft.network.packts.C03PacketPlayer;
import net.minecraft.network.packts.C07PacketPlayerDigging;
import net.minecraft.network.packts.C07PacketPlayerDigging$Action;
import net.minecraft.network.packts.C08PacketPlayerBlockPlacement;
import net.minecraft.network.packts.C09PacketHeldItemChange;
import net.minecraft.network.packts.C09PacketHeldItemChangeInvoker;
import net.minecraft.network.packts.C0APacketAnimation;
import net.minecraft.network.packts.C0BPacketEntityAction;
import net.minecraft.network.packts.C0CPacketInput;
import net.minecraft.network.packts.C0DPacketCloseWindow;
import net.minecraft.network.packts.C0EPacketClickWindow;
import net.minecraft.network.packts.C0FPacketConfirmTransaction;
import net.minecraft.network.packts.C10PacketCreativeInventoryAction;
import net.minecraft.network.packts.C11PacketEnchantItem;
import net.minecraft.network.packts.C12PacketUpdateSign;
import net.minecraft.network.packts.C13PacketPlayerAbilities;
import net.minecraft.network.packts.C14PacketTabComplete;
import net.minecraft.network.packts.C15PacketClientSettings;
import net.minecraft.network.packts.C16PacketClientStatus;
import net.minecraft.network.packts.C16PacketClientStatus$EnumState;
import net.minecraft.network.packts.C17PacketCustomPayload;
import net.minecraft.network.packts.C18PacketSpectate;
import net.minecraft.network.packts.C19PacketResourcePackStatus;
import net.minecraft.network.packts.CPacketVehicleMove;
import net.minecraft.network.packts.S00PacketKeepAlive;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S07PacketRespawn;
import net.minecraft.network.packts.S08PacketPlayerPosLook;
import net.minecraft.network.packts.S23PacketBlockChange;
import net.minecraft.network.packts.S2FPacketSetSlot;
import net.minecraft.network.packts.S32PacketConfirmTransaction;
import net.minecraft.network.packts.S3APacketTabComplete;
import net.minecraft.network.packts.S40PacketDisconnect;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Future;

import org.apache.logging.log4j.Logger;


public class NetHandlerPlayServer
implements INetHandlerPlayServer,
ITickable {
    public EntityPlayerMP playerEntity;
    private boolean g;
    private IntHashMap<Short> i = new IntHashMap();
    private double c;
    public NetworkManager netManager;
    private int l;
    private MinecraftServer serverController;
    private static Logger b = LogManagerInvoker.c();
    private boolean h = true;
    private int e;
    private int j;
    private int n;
    private long k;
    private double o;
    private long f;
    private double q;
    private int a;
    private int m;

    public void a(double d, double d2, double d3, float f, float f2) {
        this.a(d, d2, d3, f, f2, asg_0.d());
    }

    @Override
    public void processHeldItemChange(C09PacketHeldItemChange c09PacketHeldItemChange) {
        PacketThreadUtilInvoker.a(c09PacketHeldItemChange, this, EntityPlayerInvoker.b(this.playerEntity));
        if (C09PacketHeldItemChangeInvoker.a(c09PacketHeldItemChange) >= 0 && C09PacketHeldItemChangeInvoker.a(c09PacketHeldItemChange) < InventoryInvoker.a()) {
            this.playerEntity.inventory.a = C09PacketHeldItemChangeInvoker.a(c09PacketHeldItemChange);
            EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        } else {
            LoggerInvoker.warn(b, aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(this.playerEntity)), nf_0.l).toString());
        }
    }

    @Override
    public void a(C08PacketPlayerBlockPlacement c08PacketPlayerBlockPlacement) {
        Object object;
        PacketThreadUtilInvoker.a(c08PacketPlayerBlockPlacement, this, EntityPlayerInvoker.b(this.playerEntity));
        WorldServer worldServer = ServerInvoker.a(this.serverController, this.playerEntity.dimension);
        ItemStack itemStack = InventoryInvoker.g(this.playerEntity.inventory);
        BlockPos blockPos = C08PacketPlayerBlockPlacementInvoker.a(c08PacketPlayerBlockPlacement);
        EnumFacing enumFacing = SJ.a(C08PacketPlayerBlockPlacementInvoker.b(c08PacketPlayerBlockPlacement));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        if (C08PacketPlayerBlockPlacementInvoker.b(c08PacketPlayerBlockPlacement) == 255) {
            return;
        }
        if (amv_2.h(blockPos) < ServerInvoker.F(this.serverController) - 1 || enumFacing != EnumFacing.UP && amv_2.h(blockPos) < ServerInvoker.F(this.serverController)) {
            if (this.h && EntityPlayerInvoker.f(this.playerEntity, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5) < 64.0 && !ServerInvoker.a(this.serverController, worldServer, blockPos, this.playerEntity) && ak9_0.a(a3V.l(worldServer), blockPos)) {
                Uf.a(this.playerEntity.bX, this.playerEntity, worldServer, itemStack, blockPos, enumFacing, C08PacketPlayerBlockPlacementInvoker.d(c08PacketPlayerBlockPlacement), C08PacketPlayerBlockPlacementInvoker.c(c08PacketPlayerBlockPlacement), C08PacketPlayerBlockPlacementInvoker.f(c08PacketPlayerBlockPlacement));
            }
        } else {
            object = new aoz_1(nf_0.ar, P8.d(ServerInvoker.F(this.serverController)));
            HX.a(aIW.a((aoz_1)object), anw_0.RED);
            this.playerEntity.playerNetServerHandler.sendPacket(new S02PacketChat((IChatComponent)object));
        }
        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(worldServer, blockPos));
        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(worldServer, amv_2.a(blockPos, enumFacing)));
        itemStack = InventoryInvoker.g(this.playerEntity.inventory);
        if (itemStack.a == 0) {
            this.playerEntity.inventory.b[this.playerEntity.inventory.a] = null;
            itemStack = null;
        }
        if (act_2.A(itemStack) == 0) {
            this.playerEntity.ca = true;
            this.playerEntity.inventory.b[this.playerEntity.inventory.a] = act_2.e(this.playerEntity.inventory.b[this.playerEntity.inventory.a]);
            object = afy_2.a(this.playerEntity.bI, this.playerEntity.inventory, this.playerEntity.inventory.a);
            afy_2.b(this.playerEntity.bI);
            this.playerEntity.ca = false;
            if (!act_2.e(InventoryInvoker.g(this.playerEntity.inventory), C08PacketPlayerBlockPlacementInvoker.e(c08PacketPlayerBlockPlacement))) {
                this.sendPacket(new S2FPacketSetSlot(this.playerEntity.bI.f, ((Slot)object).b, InventoryInvoker.g(this.playerEntity.inventory)));
            }
        }
    }

    public NetworkManager b() {
        return this.netManager;
    }

    public NetHandlerPlayServer(MinecraftServer minecraftServer, NetworkManager networkManager, EntityPlayerMP entityPlayerMP) {
        this.serverController = minecraftServer;
        this.netManager = networkManager;
        NetworkManagerInvoker.setNetHandler(networkManager, this);
        this.playerEntity = entityPlayerMP;
        entityPlayerMP.playerNetServerHandler = this;
    }

    public void sendPacket(Packet packet) {
        Object object;
        if (packet instanceof S02PacketChat) {
            S02PacketChat s02PacketChat = (S02PacketChat)packet;
            object = EntityPlayerInvoker.q(this.playerEntity);
            if (object == EnumChatVisibility.HIDDEN) {
                return;
            }
            if (object == EnumChatVisibility.SYSTEM && !ue_2.b(s02PacketChat)) {
                return;
            }
        }
        try {
            this.netManager.sendPacket(packet);
            return;
        }
        catch (Throwable throwable) {
            object = CrashInvoker.makeCrashReport(throwable, nf_0.ao);
            CrashReportCategory crashReportCategory = CrashInvoker.a((CrashReport)object, nf_0.Y);
            CrashReportCategoryInvoker.a(crashReportCategory, nf_0.X, () -> NetHandlerPlayServer.lambda$sendPacket$0(packet));
            throw new ReportedException((CrashReport)object);
        }
    }

    @Override
    public void processConfirmTransaction(C0FPacketConfirmTransaction c0FPacketConfirmTransaction) {
        PacketThreadUtilInvoker.a(c0FPacketConfirmTransaction, this, EntityPlayerInvoker.b(this.playerEntity));
        Short s = (Short)a8a_0.c(this.i, this.playerEntity.bI.f);
        if (a2_0.a(c0FPacketConfirmTransaction) == aWT.a(s) && this.playerEntity.bI.f == a2_0.b(c0FPacketConfirmTransaction) && !afy_2.a(this.playerEntity.bI, this.playerEntity) && !EntityPlayerInvoker.C(this.playerEntity)) {
            afy_2.a(this.playerEntity.bI, (EntityPlayer)this.playerEntity, true);
        }
    }

    @Override
    public void a(C13PacketPlayerAbilities c13PacketPlayerAbilities) {
        PacketThreadUtilInvoker.a(c13PacketPlayerAbilities, this, EntityPlayerInvoker.b(this.playerEntity));
        aSY.e(this.playerEntity.abilities, tn_2.a(c13PacketPlayerAbilities) && aSY.f(this.playerEntity.abilities));
    }

    @Override
    public void a(C11PacketEnchantItem c11PacketEnchantItem) {
        PacketThreadUtilInvoker.a(c11PacketEnchantItem, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        if (this.playerEntity.bI.f == abu_1.b(c11PacketEnchantItem) && afy_2.a(this.playerEntity.bI, this.playerEntity) && !EntityPlayerInvoker.C(this.playerEntity)) {
            afy_2.a(this.playerEntity.bI, (EntityPlayer)this.playerEntity, abu_1.a(c11PacketEnchantItem));
            afy_2.b(this.playerEntity.bI);
        }
    }

    private long a() {
        return SystemInvoker.nanoTime() / 1000000L;
    }

    @Override
    public void a(C01PacketChatMessage c01PacketChatMessage) {
        PacketThreadUtilInvoker.a(c01PacketChatMessage, this, EntityPlayerInvoker.b(this.playerEntity));
        if (EntityPlayerInvoker.q(this.playerEntity) == EnumChatVisibility.HIDDEN) {
            aoz_1 aoz_12 = new aoz_1(nf_0.ae, new Object[0]);
            HX.a(aIW.a(aoz_12), anw_0.RED);
            this.sendPacket(new S02PacketChat(aoz_12));
        } else {
            EntityPlayerInvoker.markPlayerActive(this.playerEntity);
            String string = aco_0.a(c01PacketChatMessage);
            string = aw__0.c(string);
            for (int i = 0; i < StringInvoker.c(string); ++i) {
                if (KF.a(StringInvoker.b(string, i))) continue;
                this.b(nf_0.L);
                return;
            }
            if (StringInvoker.e(string, nf_0.p)) {
                this.a(string);
            } else {
                aoz_1 aoz_13 = new aoz_1(nf_0.au, EntityPlayerInvoker.n(this.playerEntity), string);
                aek_1.a(ServerInvoker.R(this.serverController), aoz_13, false);
            }
            this.n += 20;
            if (this.n > 200 && !aek_1.a(ServerInvoker.R(this.serverController), EntityPlayerInvoker.I(this.playerEntity))) {
                this.b(nf_0.ak);
            }
        }
    }

    @Override
    public void a(C03PacketPlayer c03PacketPlayer) {
        PacketThreadUtilInvoker.a(c03PacketPlayer, this, EntityPlayerInvoker.b(this.playerEntity));
        if (this.a(c03PacketPlayer)) {
            this.b(nf_0.g);
        } else {
            WorldServer worldServer = ServerInvoker.a(this.serverController, this.playerEntity.dimension);
            this.g = true;
            if (!this.playerEntity.b3) {
                double d = this.playerEntity.posX;
                double d2 = this.playerEntity.posY;
                double d3 = this.playerEntity.posZ;
                double d4 = 0.0;
                double d5 = ka_0.d(c03PacketPlayer) - this.q;
                double d6 = ka_0.a(c03PacketPlayer) - this.c;
                double d7 = ka_0.c(c03PacketPlayer) - this.o;
                if (ka_0.h(c03PacketPlayer)) {
                    d4 = d5 * d5 + d6 * d6 + d7 * d7;
                    if (!this.h && d4 < 0.25) {
                        this.h = true;
                    }
                }
                if (this.h) {
                    this.m = this.a;
                    if (this.playerEntity.r != null) {
                        float f = this.playerEntity.rotationYaw;
                        float f2 = this.playerEntity.rotationPitch;
                        ayj_0.h(this.playerEntity.r);
                        double d8 = this.playerEntity.posX;
                        double d9 = this.playerEntity.posY;
                        double d10 = this.playerEntity.posZ;
                        if (ka_0.b(c03PacketPlayer)) {
                            f = ka_0.e(c03PacketPlayer);
                            f2 = ka_0.f(c03PacketPlayer);
                        }
                        this.playerEntity.onGround = ka_0.g(c03PacketPlayer);
                        EntityPlayerInvoker.t(this.playerEntity);
                        EntityPlayerInvoker.a(this.playerEntity, d8, d9, d10, f, f2);
                        if (this.playerEntity.r != null) {
                            ayj_0.h(this.playerEntity.r);
                        }
                        aek_1.c(ServerInvoker.R(this.serverController), this.playerEntity);
                        if (this.playerEntity.r != null) {
                            double d11 = d4 - 4.0;
                            int cfr_ignored_2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                            this.playerEntity.r.p = true;
                        }
                        if (this.h) {
                            this.q = this.playerEntity.posX;
                            this.c = this.playerEntity.posY;
                            this.o = this.playerEntity.posZ;
                        }
                        a3V.a(worldServer, this.playerEntity);
                        return;
                    }
                    if (EntityPlayerInvoker.m(this.playerEntity)) {
                        EntityPlayerInvoker.t(this.playerEntity);
                        EntityPlayerInvoker.a(this.playerEntity, this.q, this.c, this.o, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                        a3V.a(worldServer, this.playerEntity);
                        return;
                    }
                    double d12 = this.playerEntity.posY;
                    this.q = this.playerEntity.posX;
                    this.c = this.playerEntity.posY;
                    this.o = this.playerEntity.posZ;
                    double d13 = this.playerEntity.posX;
                    double d14 = this.playerEntity.posY;
                    double d15 = this.playerEntity.posZ;
                    float f = this.playerEntity.rotationYaw;
                    float f3 = this.playerEntity.rotationPitch;
                    if (ka_0.h(c03PacketPlayer) && ka_0.a(c03PacketPlayer) == -999.0) {
                        ka_0.a(c03PacketPlayer, false);
                    }
                    if (ka_0.h(c03PacketPlayer)) {
                        d13 = ka_0.d(c03PacketPlayer);
                        d14 = ka_0.a(c03PacketPlayer);
                        d15 = ka_0.c(c03PacketPlayer);
                        if (MathInvoker.a(ka_0.d(c03PacketPlayer)) > 3.0E7 || MathInvoker.a(ka_0.c(c03PacketPlayer)) > 3.0E7) {
                            this.b(nf_0.s);
                            return;
                        }
                    }
                    if (ka_0.b(c03PacketPlayer)) {
                        f = ka_0.e(c03PacketPlayer);
                        f3 = ka_0.f(c03PacketPlayer);
                    }
                    EntityPlayerInvoker.t(this.playerEntity);
                    EntityPlayerInvoker.a(this.playerEntity, this.q, this.c, this.o, f, f3);
                    if (!this.h) {
                        return;
                    }
                    double d16 = d13 - this.playerEntity.posX;
                    double d17 = d14 - this.playerEntity.posY;
                    double d18 = d15 - this.playerEntity.posZ;
                    double d19 = d16 * d16 + d17 * d17 + d18 * d18;
                    double d20 = this.playerEntity.motionX * this.playerEntity.motionX + this.playerEntity.motionY * this.playerEntity.motionY + this.playerEntity.motionZ * this.playerEntity.motionZ;
                    if (!(!(d19 - d20 > 100.0) || ServerInvoker.T(this.serverController) && ServerInvoker.c(this.serverController).equals(EntityPlayerInvoker.s(this.playerEntity)))) {
                        LoggerInvoker.warn(b, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(this.playerEntity)), nf_0.aw), d16), nf_0.am), d17), nf_0.al), d18), nf_0.D), d16), nf_0.as), d17), nf_0.w), d18), nf_0.an).toString());
                        this.a(this.q, this.c, this.o, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                        return;
                    }
                    ListInvoker.isEmpty(a3V.a(worldServer, (Entity)this.playerEntity, h__0.c(EntityPlayerInvoker.j(this.playerEntity), 0.0625, 0.0625, 0.0625)));
                    if (this.playerEntity.onGround && !ka_0.g(c03PacketPlayer) && d17 > 0.0) {
                        EntityPlayerInvoker.y(this.playerEntity);
                    }
                    EntityPlayerInvoker.d(this.playerEntity, d16, d17, d18);
                    this.playerEntity.onGround = ka_0.g(c03PacketPlayer);
                    d16 = d13 - this.playerEntity.posX;
                    d17 = d14 - this.playerEntity.posY;
                    if (d17 > -0.5 || d17 < 0.5) {
                        d17 = 0.0;
                    }
                    if ((d19 = d16 * d16 + d17 * d17 + (d18 = d15 - this.playerEntity.posZ) * d18) > 0.0625 && !EntityPlayerInvoker.m(this.playerEntity) && !Uf.d(this.playerEntity.bX)) {
                        LoggerInvoker.warn(b, aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(this.playerEntity)), nf_0.q).toString());
                    }
                    EntityPlayerInvoker.a(this.playerEntity, d13, d14, d15, f, f3);
                    EntityPlayerInvoker.a(this.playerEntity, this.playerEntity.posX - d, this.playerEntity.posY - d2, this.playerEntity.posZ - d3);
                    if (!this.playerEntity.H) {
                        boolean bl = ListInvoker.isEmpty(a3V.a(worldServer, (Entity)this.playerEntity, h__0.c(EntityPlayerInvoker.j(this.playerEntity), 0.0625, 0.0625, 0.0625)));
                        if (!EntityPlayerInvoker.m(this.playerEntity)) {
                            this.a(this.q, this.c, this.o, f, f3);
                            return;
                        }
                    }
                    rm_2 rm_22 = h__0.a(h__0.d(EntityPlayerInvoker.j(this.playerEntity), 0.0625, 0.0625, 0.0625), 0.0, -0.55, 0.0);
                    if (!(ServerInvoker.S(this.serverController) || aSY.f(this.playerEntity.abilities) || a3V.a(worldServer, rm_22))) {
                        double d21 = d17 - -0.03125;
                        int cfr_ignored_3 = d21 == 0.0 ? 0 : (d21 > 0.0 ? 1 : -1);
                        ++this.e;
                        if (this.e > 80) {
                            LoggerInvoker.warn(b, aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(this.playerEntity)), nf_0.ai).toString());
                            this.b(nf_0.J);
                            return;
                        }
                    } else {
                        this.e = 0;
                    }
                    this.playerEntity.onGround = ka_0.g(c03PacketPlayer);
                    aek_1.c(ServerInvoker.R(this.serverController), this.playerEntity);
                    EntityPlayerInvoker.a(this.playerEntity, this.playerEntity.posY - d12, ka_0.g(c03PacketPlayer));
                } else if (this.a - this.m > 20) {
                    this.a(this.q, this.c, this.o, this.playerEntity.rotationYaw, this.playerEntity.rotationPitch);
                }
            }
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public void a(C14PacketTabComplete c14PacketTabComplete) {
        PacketThreadUtilInvoker.a(c14PacketTabComplete, this, EntityPlayerInvoker.b(this.playerEntity));
        ArrayList arrayList = my_0.c();
        ListInvoker.addAll(arrayList, ServerInvoker.a(this.serverController, this.playerEntity, aob_0.a(c14PacketTabComplete), aob_0.b(c14PacketTabComplete)));
        this.playerEntity.playerNetServerHandler.sendPacket(new S3APacketTabComplete((String[])ListInvoker.toArray(arrayList, new String[0])));
    }

    @Override
    public void a(CPacketVehicleMove cPacketVehicleMove) {
    }

    @Override
    public void a(C17PacketCustomPayload c17PacketCustomPayload) {
        PacketThreadUtilInvoker.a(c17PacketCustomPayload, this, EntityPlayerInvoker.b(this.playerEntity));
        if (nf_0.K.equals(art_1.a(c17PacketCustomPayload))) {
            PacketBuffer packetBuffer = new PacketBuffer(FH.a(art_1.b(c17PacketCustomPayload)));
            try {
                block48: {
                    try {
                        ItemStack itemStack = PacketBufferInvoker.g(packetBuffer);
                        if (aSD.a(act_2.a(itemStack))) break block48;
                    }
                    catch (Exception exception) {
                        LoggerInvoker.a(b, nf_0.t, exception);
                        return;
                    }
                    throw new IOException(nf_0.N);
                }
                ItemStack itemStack = InventoryInvoker.g(this.playerEntity.inventory);
                return;
            }
            finally {
                PacketBufferInvoker.t(packetBuffer);
            }
        }
        if (nf_0.A.equals(art_1.a(c17PacketCustomPayload))) {
            PacketBuffer packetBuffer = new PacketBuffer(FH.a(art_1.b(c17PacketCustomPayload)));
            try {
                block49: {
                    try {
                        ItemStack itemStack = PacketBufferInvoker.g(packetBuffer);
                        if (aK1.a(act_2.a(itemStack))) break block49;
                    }
                    catch (Exception exception) {
                        LoggerInvoker.a(b, nf_0.F, exception);
                        return;
                    }
                    throw new IOException(nf_0.f);
                }
                ItemStack itemStack = InventoryInvoker.g(this.playerEntity.inventory);
                return;
            }
            finally {
                PacketBufferInvoker.t(packetBuffer);
            }
        }
        if (nf_0.G.equals(art_1.a(c17PacketCustomPayload))) {
            try {
                int n = PacketBufferInvoker.p(art_1.b(c17PacketCustomPayload));
                Container container = this.playerEntity.bI;
                if (container instanceof aax_1) {
                    amk_1.a((aax_1)container, n);
                }
            }
            catch (Exception exception) {
                LoggerInvoker.a(b, nf_0.Q, exception);
            }
        } else if (nf_0.at.equals(art_1.a(c17PacketCustomPayload))) {
            if (!ServerInvoker.g(this.serverController)) {
                EntityPlayerInvoker.a(this.playerEntity, new aoz_1(nf_0.c, new Object[0]));
            } else if (EntityPlayerInvoker.a(this.playerEntity, 2, nf_0.af) && aSY.a(this.playerEntity.abilities)) {
                PacketBuffer packetBuffer = art_1.b(c17PacketCustomPayload);
                try {
                    byte by = PacketBufferInvoker.l(packetBuffer);
                    awn_1 awn_12 = null;
                    Object object = aV8.z(this.playerEntity.worldObj, new BlockPos(PacketBufferInvoker.p(packetBuffer), PacketBufferInvoker.p(packetBuffer), PacketBufferInvoker.p(packetBuffer)));
                    if (object instanceof a6U) {
                        awn_12 = anp_1.b((a6U)object);
                    }
                    object = PacketBufferInvoker.d(packetBuffer, PacketBufferInvoker.f(packetBuffer));
                    boolean bl = PacketBufferInvoker.i(packetBuffer);
                    awo_0.b(awn_12, (String)object);
                    awo_0.a(awn_12, bl);
                    awo_0.a(awn_12, null);
                    awo_0.e(awn_12);
                    EntityPlayerInvoker.a(this.playerEntity, new aoz_1(nf_0.W, object));
                }
                catch (Exception exception) {
                    LoggerInvoker.a(b, nf_0.b, exception);
                }
                finally {
                    PacketBufferInvoker.t(packetBuffer);
                }
            } else {
                EntityPlayerInvoker.a(this.playerEntity, new aoz_1(nf_0.m, new Object[0]));
            }
        } else if (nf_0.Z.equals(art_1.a(c17PacketCustomPayload))) {
            if (this.playerEntity.bI instanceof aaq_1) {
                try {
                    PacketBuffer packetBuffer = art_1.b(c17PacketCustomPayload);
                    int n = PacketBufferInvoker.p(packetBuffer);
                    int n2 = PacketBufferInvoker.p(packetBuffer);
                    aaq_1 aaq_12 = (aaq_1)this.playerEntity.bI;
                    Slot slot = avf_0.a(aaq_12, 0);
                    if (ItemStackInvoker.e(slot)) {
                        ItemStackInvoker.a(slot, 1);
                        rs_1 rs_12 = avf_0.a(aaq_12);
                        apw_0.a(rs_12, 1, n);
                        apw_0.a(rs_12, 2, n2);
                        apw_0.f(rs_12);
                    }
                }
                catch (Exception exception) {
                    LoggerInvoker.a(b, nf_0.d, exception);
                }
            }
        } else if (nf_0.P.equals(art_1.a(c17PacketCustomPayload)) && this.playerEntity.bI instanceof aam_1) {
            aam_1 aam_12 = (aam_1)this.playerEntity.bI;
            if (art_1.b(c17PacketCustomPayload) != null && PacketBufferInvoker.f(art_1.b(c17PacketCustomPayload)) >= 1) {
                String string = KF.a(PacketBufferInvoker.d(art_1.b(c17PacketCustomPayload), Short.MAX_VALUE));
                if (StringInvoker.c(string) <= 30) {
                    YA.a(aam_12, string);
                }
            } else {
                YA.a(aam_12, nf_0.r);
            }
        }
    }

    @Override
    public void a(C19PacketResourcePackStatus c19PacketResourcePackStatus) {
    }

    private static String lambda$sendPacket$0(Packet packet) throws Exception {
        return ara_2.k(packet.getClass());
    }

    @Override
    public void a(IChatComponent iChatComponent) {
        LoggerInvoker.info(b, aL0.a(aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(this.playerEntity)), nf_0.T), iChatComponent).toString());
        ServerInvoker.h(this.serverController);
        aoz_1 aoz_12 = new aoz_1(nf_0.ac, EntityPlayerInvoker.n(this.playerEntity));
        HX.a(aIW.a(aoz_12), anw_0.YELLOW);
        aek_1.a(ServerInvoker.R(this.serverController), aoz_12);
        EntityPlayerInvoker.z(this.playerEntity);
        aek_1.b(ServerInvoker.R(this.serverController), this.playerEntity);
        if (ServerInvoker.T(this.serverController) && EntityPlayerInvoker.s(this.playerEntity).equals(ServerInvoker.c(this.serverController))) {
            LoggerInvoker.info(b, nf_0.aj);
            ServerInvoker.n(this.serverController);
        }
    }

    @Override
    public void a(C18PacketSpectate c18PacketSpectate) {
        PacketThreadUtilInvoker.a(c18PacketSpectate, this, EntityPlayerInvoker.b(this.playerEntity));
        if (EntityPlayerInvoker.C(this.playerEntity)) {
            Entity entity = null;
            int n = 0;
            Object object = this.serverController.r;
            int n2 = ((WorldServer[])object).length;
            if (n < n2) {
                WorldServer worldServer = object[n];
                entity = ayd_0.a(c18PacketSpectate, worldServer);
            }
            EntityPlayerInvoker.e(this.playerEntity, this.playerEntity);
            EntityPlayerInvoker.h(this.playerEntity, null);
            if (entity.worldObj != this.playerEntity.worldObj) {
                object = EntityPlayerInvoker.b(this.playerEntity);
                WorldServer worldServer = (WorldServer)entity.worldObj;
                this.playerEntity.dimension = entity.dimension;
                this.sendPacket(new S07PacketRespawn(this.playerEntity.dimension, a3V.w((WorldServer)object), uv_2.r(a3V.d((WorldServer)object)), Uf.a(this.playerEntity.bX)));
                a3V.b((WorldServer)object, this.playerEntity);
                this.playerEntity.isDead = false;
                EntityPlayerInvoker.b(this.playerEntity, entity.posX, entity.posY, entity.posZ, entity.rotationYaw, entity.rotationPitch);
                if (EntityPlayerInvoker.r(this.playerEntity)) {
                    a3V.a((WorldServer)object, (Entity)this.playerEntity, false);
                    a3V.c(worldServer, this.playerEntity);
                    a3V.a(worldServer, (Entity)this.playerEntity, false);
                }
                EntityPlayerInvoker.a(this.playerEntity, worldServer);
                aek_1.a(ServerInvoker.R(this.serverController), this.playerEntity, (WorldServer)object);
                EntityPlayerInvoker.e(this.playerEntity, entity.posX, entity.posY, entity.posZ);
                Uf.a(this.playerEntity.bX, worldServer);
                aek_1.b(ServerInvoker.R(this.serverController), this.playerEntity, worldServer);
                aek_1.a(ServerInvoker.R(this.serverController), this.playerEntity);
            } else {
                EntityPlayerInvoker.e(this.playerEntity, entity.posX, entity.posY, entity.posZ);
            }
        }
    }

    @Override
    public void a(C0BPacketEntityAction c0BPacketEntityAction) {
        PacketThreadUtilInvoker.a(c0BPacketEntityAction, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        switch (VJ.a(c0BPacketEntityAction)) {
            case START_SNEAKING: {
                EntityPlayerInvoker.b(this.playerEntity, true);
                break;
            }
            case STOP_SNEAKING: {
                EntityPlayerInvoker.b(this.playerEntity, false);
                break;
            }
            case START_SPRINTING: {
                EntityPlayerInvoker.a(this.playerEntity, true);
                break;
            }
            case STOP_SPRINTING: {
                EntityPlayerInvoker.a(this.playerEntity, false);
                break;
            }
            case STOP_SLEEPING: {
                EntityPlayerInvoker.a(this.playerEntity, false, true, true);
                this.h = false;
                break;
            }
            case RIDING_JUMP: {
                if (!(this.playerEntity.r instanceof na_1)) break;
                avq_0.b((na_1)this.playerEntity.r, VJ.b(c0BPacketEntityAction));
                break;
            }
            case OPEN_INVENTORY: {
                if (!(this.playerEntity.r instanceof na_1)) break;
                avq_0.b((na_1)this.playerEntity.r, this.playerEntity);
                break;
            }
            default: {
                throw new IllegalArgumentException(nf_0.u);
            }
        }
    }

    @Override
    public void a(C16PacketClientStatus c16PacketClientStatus) {
        PacketThreadUtilInvoker.a(c16PacketClientStatus, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        C16PacketClientStatus$EnumState c16PacketClientStatus$EnumState = arp_2.a(c16PacketClientStatus);
        switch (c16PacketClientStatus$EnumState) {
            case PERFORM_RESPAWN: {
                if (this.playerEntity.b3) {
                    this.playerEntity = aek_1.a(ServerInvoker.R(this.serverController), this.playerEntity, 0, true);
                    break;
                }
                if (uv_2.t(a3V.d(EntityPlayerInvoker.b(this.playerEntity)))) {
                    if (ServerInvoker.T(this.serverController) && EntityPlayerInvoker.s(this.playerEntity).equals(ServerInvoker.c(this.serverController))) {
                        this.playerEntity.playerNetServerHandler.b(nf_0.aa);
                        ServerInvoker.C(this.serverController);
                        break;
                    }
                    a88 a882 = new a88(EntityPlayerInvoker.I(this.playerEntity), null, nf_0.S, null, nf_0.a);
                    aCY.a(aek_1.o(ServerInvoker.R(this.serverController)), a882);
                    this.playerEntity.playerNetServerHandler.b(nf_0.M);
                    break;
                }
                if (EntityPlayerInvoker.h(this.playerEntity) > 0.0f) {
                    return;
                }
                this.playerEntity = aek_1.a(ServerInvoker.R(this.serverController), this.playerEntity, 0, false);
                break;
            }
            case REQUEST_STATS: {
                Q3.a(EntityPlayerInvoker.D(this.playerEntity), this.playerEntity);
                break;
            }
            case OPEN_INVENTORY_ACHIEVEMENT: {
                EntityPlayerInvoker.a(this.playerEntity, apf_0.m);
            }
        }
    }

    @Override
    public void b() {
        this.g = false;
        ++this.a;
        ProfilerInvoker.startSection(this.serverController.m, nf_0.H);
        if ((long)this.a - this.f > 40L) {
            this.f = this.a;
            this.k = this.a();
            this.j = (int)this.k;
            this.sendPacket(new S00PacketKeepAlive(this.j));
        }
        ProfilerInvoker.endSection(this.serverController.m);
        if (this.n > 0) {
            --this.n;
        }
        if (this.l > 0) {
            --this.l;
        }
        if (EntityPlayerInvoker.A(this.playerEntity) > 0L && ServerInvoker.z(this.serverController) > 0 && ServerInvoker.c() - EntityPlayerInvoker.A(this.playerEntity) > (long)ServerInvoker.z(this.serverController) * 1000L * 60L) {
            this.b(nf_0.h);
        }
    }

    public void a(double d, double d2, double d3, float f, float f2, Set<adg_0> set) {
        this.h = false;
        this.q = d;
        this.c = d2;
        this.o = d3;
        if (aS0.c(set, (Object)adg_0.X)) {
            this.q += this.playerEntity.posX;
        }
        if (aS0.c(set, (Object)adg_0.Y)) {
            this.c += this.playerEntity.posY;
        }
        if (aS0.c(set, (Object)adg_0.Z)) {
            this.o += this.playerEntity.posZ;
        }
        float f3 = f;
        float f4 = f2;
        if (aS0.c(set, (Object)adg_0.Y_ROT)) {
            f3 = f + this.playerEntity.rotationYaw;
        }
        if (aS0.c(set, (Object)adg_0.X_ROT)) {
            f4 = f2 + this.playerEntity.rotationPitch;
        }
        EntityPlayerInvoker.a(this.playerEntity, this.q, this.c, this.o, f3, f4);
        this.playerEntity.playerNetServerHandler.sendPacket(new S08PacketPlayerPosLook(d, d2, d3, f, f2, set));
    }

    @Override
    public void a(C10PacketCreativeInventoryAction c10PacketCreativeInventoryAction) {
        PacketThreadUtilInvoker.a(c10PacketCreativeInventoryAction, this, EntityPlayerInvoker.b(this.playerEntity));
        if (Uf.d(this.playerEntity.bX)) {
            NBTTagCompound nBTTagCompound;
            boolean bl = PJ.b(c10PacketCreativeInventoryAction) < 0;
            ItemStack itemStack = PJ.a(c10PacketCreativeInventoryAction);
            if (act_2.b(itemStack) && tn_0.a(act_2.a(itemStack), nf_0.x, 10) && tn_0.b(nBTTagCompound = tn_0.d(act_2.a(itemStack), nf_0.o), nf_0.ad) && tn_0.b(nBTTagCompound, nf_0.R) && tn_0.b(nBTTagCompound, nf_0.i)) {
                BlockPos blockPos = new BlockPos(tn_0.g(nBTTagCompound, nf_0.y), tn_0.g(nBTTagCompound, nf_0.ap), tn_0.g(nBTTagCompound, nf_0.E));
                TileEntity tileEntity = aV8.z(this.playerEntity.worldObj, blockPos);
                NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
                NBTInvoker.a(tileEntity, nBTTagCompound2);
                tn_0.a(nBTTagCompound2, nf_0.ag);
                tn_0.a(nBTTagCompound2, nf_0.ab);
                tn_0.a(nBTTagCompound2, nf_0.U);
                act_2.a(itemStack, nf_0.V, nBTTagCompound2);
            }
            boolean bl2 = PJ.b(c10PacketCreativeInventoryAction) >= 1 && PJ.b(c10PacketCreativeInventoryAction) < 36 + InventoryInvoker.a();
            boolean bl3 = act_2.k(itemStack) != null;
            boolean bl4 = act_2.c(itemStack) >= 0 && itemStack.a <= 64 && itemStack.a > 0;
            afy_2.a(this.playerEntity.bp, PJ.b(c10PacketCreativeInventoryAction), itemStack);
            afy_2.a(this.playerEntity.bp, (EntityPlayer)this.playerEntity, true);
        }
    }

    @Override
    public void a(C0EPacketClickWindow c0EPacketClickWindow) {
        PacketThreadUtilInvoker.a(c0EPacketClickWindow, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        if (this.playerEntity.bI.f == aVZ.g(c0EPacketClickWindow) && afy_2.a(this.playerEntity.bI, this.playerEntity)) {
            if (EntityPlayerInvoker.C(this.playerEntity)) {
                ArrayList arrayList = my_0.c();
                for (int i = 0; i < ListInvoker.size(this.playerEntity.bI.b); ++i) {
                    ListInvoker.add(arrayList, ItemStackInvoker.a((Slot)ListInvoker.get(this.playerEntity.bI.b, i)));
                }
                EntityPlayerInvoker.a(this.playerEntity, this.playerEntity.bI, arrayList);
            } else {
                ItemStack itemStack = afy_2.a(this.playerEntity.bI, aVZ.f(c0EPacketClickWindow), aVZ.a(c0EPacketClickWindow), aVZ.b(c0EPacketClickWindow), this.playerEntity);
                if (act_2.e(aVZ.c(c0EPacketClickWindow), itemStack)) {
                    this.playerEntity.playerNetServerHandler.sendPacket(new S32PacketConfirmTransaction(aVZ.g(c0EPacketClickWindow), aVZ.e(c0EPacketClickWindow), true));
                    this.playerEntity.ca = true;
                    afy_2.b(this.playerEntity.bI);
                    EntityPlayerInvoker.o(this.playerEntity);
                    this.playerEntity.ca = false;
                } else {
                    a8a_0.a(this.i, this.playerEntity.bI.f, aWT.b(aVZ.e(c0EPacketClickWindow)));
                    this.playerEntity.playerNetServerHandler.sendPacket(new S32PacketConfirmTransaction(aVZ.g(c0EPacketClickWindow), aVZ.e(c0EPacketClickWindow), false));
                    afy_2.a(this.playerEntity.bI, (EntityPlayer)this.playerEntity, false);
                    ArrayList arrayList = my_0.c();
                    for (int i = 0; i < ListInvoker.size(this.playerEntity.bI.b); ++i) {
                        ListInvoker.add(arrayList, ItemStackInvoker.a((Slot)ListInvoker.get(this.playerEntity.bI.b, i)));
                    }
                    EntityPlayerInvoker.a(this.playerEntity, this.playerEntity.bI, arrayList);
                }
            }
        }
    }

    public void b(String string) {
        ChatComponentText chatComponentText = new ChatComponentText(string);
        NetworkManagerInvoker.a(this.netManager, new S40PacketDisconnect(chatComponentText), new G(this, chatComponentText), new GenericFutureListener[0]);
        NetworkManagerInvoker.e(this.netManager);
        aqo_2.a((Future)ServerInvoker.a(this.serverController, new aSR(this)));
    }

    @Override
    public void a(C02PacketUseEntity c02PacketUseEntity) {
        PacketThreadUtilInvoker.a(c02PacketUseEntity, this, EntityPlayerInvoker.b(this.playerEntity));
        WorldServer worldServer = ServerInvoker.a(this.serverController, this.playerEntity.dimension);
        Entity entity = Hr.a(c02PacketUseEntity, worldServer);
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        EntityPlayerInvoker.d(this.playerEntity, entity);
        double d = 36.0;
        d = 9.0;
        if (EntityPlayerInvoker.c(this.playerEntity, entity) < d) {
            if (Hr.a(c02PacketUseEntity) == C02PacketUseEntity$Action.INTERACT) {
                EntityPlayerInvoker.f(this.playerEntity, entity);
            } else if (Hr.a(c02PacketUseEntity) == C02PacketUseEntity$Action.INTERACT_AT) {
                ayj_0.a(entity, this.playerEntity, Hr.b(c02PacketUseEntity));
            } else if (Hr.a(c02PacketUseEntity) == C02PacketUseEntity$Action.ATTACK) {
                if (entity instanceof og_0 || entity instanceof oa_2 || entity instanceof EntityArrow || entity == this.playerEntity) {
                    this.b(nf_0.ah);
                    ServerInvoker.a(this.serverController, aL0.a(aL0.a(aL0.a(new StringBuilder(), nf_0.j), EntityPlayerInvoker.s(this.playerEntity)), nf_0.v).toString());
                    return;
                }
                EntityPlayerInvoker.b(this.playerEntity, entity);
            }
        }
    }

    @Override
    public void a(C12PacketUpdateSign c12PacketUpdateSign) {
        PacketThreadUtilInvoker.a(c12PacketUpdateSign, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        WorldServer worldServer = ServerInvoker.a(this.serverController, this.playerEntity.dimension);
        BlockPos blockPos = aun_2.b(c12PacketUpdateSign);
        if (a3V.a(worldServer, blockPos)) {
            TileEntity tileEntity = a3V.d(worldServer, blockPos);
            if (!(tileEntity instanceof a6z_0)) {
                return;
            }
            a6z_0 a6z_02 = (a6z_0)tileEntity;
            if (!aIE.f(a6z_02) || aIE.d(a6z_02) != this.playerEntity) {
                ServerInvoker.a(this.serverController, aL0.a(aL0.a(aL0.a(new StringBuilder(), nf_0.I), EntityPlayerInvoker.s(this.playerEntity)), nf_0.z).toString());
                return;
            }
            IChatComponent[] iChatComponentArray = aun_2.a(c12PacketUpdateSign);
            for (int i = 0; i < iChatComponentArray.length; ++i) {
                a6z_02.i[i] = new ChatComponentText(tc_0.b(aBO.d(iChatComponentArray[i])));
            }
            aIE.e(a6z_02);
            a3V.g(worldServer, blockPos);
        }
    }

    @Override
    public void a(C07PacketPlayerDigging c07PacketPlayerDigging) {
        PacketThreadUtilInvoker.a(c07PacketPlayerDigging, this, EntityPlayerInvoker.b(this.playerEntity));
        WorldServer worldServer = ServerInvoker.a(this.serverController, this.playerEntity.dimension);
        BlockPos blockPos = atq_0.a(c07PacketPlayerDigging);
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        switch (atq_0.b(c07PacketPlayerDigging)) {
            case DROP_ITEM: {
                if (!EntityPlayerInvoker.C(this.playerEntity)) {
                    EntityPlayerInvoker.c(this.playerEntity, false);
                }
                return;
            }
            case DROP_ALL_ITEMS: {
                if (!EntityPlayerInvoker.C(this.playerEntity)) {
                    EntityPlayerInvoker.c(this.playerEntity, true);
                }
                return;
            }
            case RELEASE_USE_ITEM: {
                EntityPlayerInvoker.E(this.playerEntity);
                return;
            }
            case START_DESTROY_BLOCK: 
            case ABORT_DESTROY_BLOCK: 
            case STOP_DESTROY_BLOCK: {
                double d = this.playerEntity.posX - ((double)amv_2.j(blockPos) + 0.5);
                double d2 = this.playerEntity.posY - ((double)amv_2.h(blockPos) + 0.5) + 1.5;
                double d3 = this.playerEntity.posZ - ((double)amv_2.i(blockPos) + 0.5);
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (d4 > 36.0) {
                    return;
                }
                if (amv_2.h(blockPos) >= ServerInvoker.F(this.serverController)) {
                    return;
                }
                if (atq_0.b(c07PacketPlayerDigging) == C07PacketPlayerDigging$Action.START_DESTROY_BLOCK) {
                    if (!ServerInvoker.a(this.serverController, worldServer, blockPos, this.playerEntity) && ak9_0.a(a3V.l(worldServer), blockPos)) {
                        Uf.a(this.playerEntity.bX, blockPos, atq_0.c(c07PacketPlayerDigging));
                    } else {
                        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(worldServer, blockPos));
                    }
                } else {
                    if (atq_0.b(c07PacketPlayerDigging) == C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK) {
                        Uf.a(this.playerEntity.bX, blockPos);
                    } else if (atq_0.b(c07PacketPlayerDigging) == C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK) {
                        Uf.b(this.playerEntity.bX);
                    }
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(a3V.f(worldServer, blockPos))) != Material.air) {
                        this.playerEntity.playerNetServerHandler.sendPacket(new S23PacketBlockChange(worldServer, blockPos));
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(nf_0.av);
    }

    private boolean a(C03PacketPlayer c03PacketPlayer) {
        return !uz_2.a(ka_0.d(c03PacketPlayer)) || !uz_2.a(ka_0.a(c03PacketPlayer)) || !uz_2.a(ka_0.c(c03PacketPlayer)) || !aNS.a(ka_0.f(c03PacketPlayer)) || !aNS.a(ka_0.e(c03PacketPlayer));
    }

    @Override
    public void a(C0CPacketInput c0CPacketInput) {
        PacketThreadUtilInvoker.a(c0CPacketInput, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.a(this.playerEntity, afn_1.c(c0CPacketInput), afn_1.a(c0CPacketInput), afn_1.b(c0CPacketInput), afn_1.d(c0CPacketInput));
    }

    @Override
    public void a(C0APacketAnimation c0APacketAnimation) {
        PacketThreadUtilInvoker.a(c0APacketAnimation, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.markPlayerActive(this.playerEntity);
        EntityPlayerInvoker.l(this.playerEntity);
    }

    private void a(String string) {
        yh_1.a(ServerInvoker.k(this.serverController), this.playerEntity, string);
    }

    @Override
    public void a(C0DPacketCloseWindow c0DPacketCloseWindow) {
        PacketThreadUtilInvoker.a(c0DPacketCloseWindow, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.c(this.playerEntity);
    }

    @Override
    public void a(C00PacketKeepAlive c00PacketKeepAlive) {
        if (aMG.a(c00PacketKeepAlive) == this.j) {
            int n = (int)(this.a() - this.k);
            this.playerEntity.b4 = (this.playerEntity.b4 * 3 + n) / 4;
        }
    }

    @Override
    public void a(C15PacketClientSettings c15PacketClientSettings) {
        PacketThreadUtilInvoker.a(c15PacketClientSettings, this, EntityPlayerInvoker.b(this.playerEntity));
        EntityPlayerInvoker.a(this.playerEntity, c15PacketClientSettings);
    }
}

