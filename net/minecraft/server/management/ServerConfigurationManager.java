/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.server.management;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import com.mojang.authlib.GameProfile;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.world.GameType;
import deobf.IChatComponent;
import deobf.ItemInWorldManager;
import deobf.MinecraftServer;
import deobf.NetworkManager;
import deobf.Packet;
import deobf.PlayerProfileCache;
import net.minecraft.network.packts.S01PacketJoinGame;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S03PacketTimeUpdate;
import net.minecraft.network.packts.S05PacketSpawnPosition;
import net.minecraft.network.packts.S07PacketRespawn;
import net.minecraft.network.packts.S09PacketHeldItemChange;
import net.minecraft.network.packts.S1DPacketEntityEffect;
import net.minecraft.network.packts.S1FPacketSetExperience;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import net.minecraft.network.packts.S38PacketPlayerListItem;
import net.minecraft.network.packts.S39PacketPlayerAbilities;
import net.minecraft.network.packts.S3EPacketTeams;
import net.minecraft.network.packts.S3FPacketCustomPayload;
import net.minecraft.network.packts.S41PacketServerDifficulty;
import net.minecraft.network.packts.S44PacketWorldBorder;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import net.minecraft.block.BlockPos;
import deobf.EntityPlayerMP;
import net.FH;
import net.HX;
import net.J9;
import net.MathHelper;
import net.NBTTagCompound;
import net.NetHandlerPlayServer;
import net.PacketBuffer;
import net.Q3;
import net.Team;
import net.Uf;
import net.World;
import net.WorldInfo;
import net.WorldServer;
import net.a0N;
import net.a0d_0;
import net.a0i_0;
import net.a0t_0;
import net.a2l_0;
import net.a35;
import net.a3D;
import net.a3V;
import net.a4Z;
import net.a6w_0;
import net.a7Y;
import net.a88;
import net.a8G;
import net.a8S;
import net.a8X;
import net.a8i_0;
import net.aCY;
import net.aHN;
import net.aIW;
import net.aL0;
import net.aS0;
import net.aUu;
import net.aV8;
import net.aZ2;
import net.abo_1;
import net.acl_0;
import net.agl_1;
import net.ajV;
import net.ak9_0;
import net.amv_2;
import net.anw_0;
import net.aoc_0;
import net.aop_1;
import net.aoz_1;
import net.arx_1;
import net.as1_0;
import net.aux__1;
import net.axd_0;
import net.axe_2;
import net.axs_2;
import net.ayh_2;
import net.ayj_0;
import net.dz_0;
import net.e3_0;
import net.fr_0;
import net.l1_0;
import net.ms_0;
import net.my_0;
import net.qq_2;
import net.qv_0;
import net.rh_0;
import net.tn_0;
import net.ub_1;
import net.uv_2;
import net.uy_1;
import net.zb_0;
import net.zq_2;
import net.zr_1;
import org.apache.logging.log4j.Logger;

public abstract class ServerConfigurationManager {
    private Map<UUID, EntityPlayerMP> p;
    private int l;
    public static File r;
    private boolean i;
    private static SimpleDateFormat c;
    private ajV k;
    private boolean m;
    private MinecraftServer o;
    private a0t_0 q;
    protected int d;
    private a0N s;
    private List<EntityPlayerMP> g = my_0.a();
    private Map<UUID, l1_0> e;
    public static File u;
    private static Logger f;
    public static File t;
    private a0i_0 a;
    private GameType j;
    private int n;
    public static File h;
    private a0d_0 b;

    public void a(EntityPlayerMP entityPlayerMP) {
        aoc_0.c(a3V.i(EntityPlayerInvoker.b(entityPlayerMP)), entityPlayerMP);
    }

    public MinecraftServer k() {
        return this.o;
    }

    public int o() {
        return ListInvoker.size(this.g);
    }

    public boolean e(GameProfile gameProfile) {
        return false;
    }

    public void m() {
        if (++this.n > 600) {
            this.a(new S38PacketPlayerListItem(aux__1.UPDATE_LATENCY, this.g));
            this.n = 0;
        }
    }

    public GameProfile[] i() {
        GameProfile[] gameProfileArray = new GameProfile[ListInvoker.size(this.g)];
        for (int i = 0; i < ListInvoker.size(this.g); ++i) {
            gameProfileArray[i] = EntityPlayerInvoker.I((EntityPlayerMP)ListInvoker.get(this.g, i));
        }
        return gameProfileArray;
    }

    public void a(IChatComponent iChatComponent, boolean bl) {
        ServerInvoker.a(this.o, iChatComponent);
        byte by = (byte)1;
        this.a(new S02PacketChat(iChatComponent, by));
    }

    public void b(EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        a6w_0.j(entityPlayer);
        this.a(iChatComponent);
    }

    public void a(boolean bl) {
        this.i = bl;
    }

    public void a(EntityPlayerMP entityPlayerMP, int n) {
        int n2 = entityPlayerMP.dimension;
        WorldServer worldServer = ServerInvoker.a(this.o, entityPlayerMP.dimension);
        entityPlayerMP.dimension = n;
        WorldServer worldServer2 = ServerInvoker.a(this.o, entityPlayerMP.dimension);
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S07PacketRespawn(entityPlayerMP.dimension, aV8.p(entityPlayerMP.worldObj), uv_2.r(aV8.s(entityPlayerMP.worldObj)), Uf.a(entityPlayerMP.bX)));
        a3V.b(worldServer, entityPlayerMP);
        entityPlayerMP.isDead = false;
        this.a(entityPlayerMP, n2, worldServer, worldServer2);
        this.a(entityPlayerMP, worldServer);
        qv_0.a(entityPlayerMP.playerNetServerHandler, entityPlayerMP.posX, entityPlayerMP.posY, entityPlayerMP.posZ, entityPlayerMP.rotationYaw, entityPlayerMP.rotationPitch);
        Uf.a(entityPlayerMP.bX, worldServer2);
        this.b(entityPlayerMP, worldServer2);
        this.f(entityPlayerMP);
        Iterator iterator = ms_0.a(EntityPlayerInvoker.g(entityPlayerMP));
        while (dz_0.c(iterator)) {
            a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S1DPacketEntityEffect(EntityPlayerInvoker.B(entityPlayerMP), a2l_02));
        }
    }

    public void c(GameProfile gameProfile) {
        fr_0.a(this.s, new a8X(gameProfile, ServerInvoker.P(this.o), fr_0.a(this.s, gameProfile)));
    }

    public void c(EntityPlayerMP entityPlayerMP) {
        ListInvoker.add(this.g, entityPlayerMP);
        MapInvoker.c(this.p, EntityPlayerInvoker.v(entityPlayerMP), entityPlayerMP);
        this.a(new S38PacketPlayerListItem(aux__1.ADD_PLAYER, entityPlayerMP));
        WorldServer worldServer = ServerInvoker.a(this.o, entityPlayerMP.dimension);
        a3V.c(worldServer, entityPlayerMP);
        this.a(entityPlayerMP, null);
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP2;
            EntityPlayerMP entityPlayerMP3 = entityPlayerMP2 = (EntityPlayerMP)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S38PacketPlayerListItem(aux__1.ADD_PLAYER, entityPlayerMP3));
        }
    }

    public void s() {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            this.e(entityPlayerMP);
        }
    }

    public EntityPlayerMP a(UUID uUID) {
        return (EntityPlayerMP)MapInvoker.c(this.p, uUID);
    }

    public String[] r() {
        String[] stringArray = new String[ListInvoker.size(this.g)];
        for (int i = 0; i < ListInvoker.size(this.g); ++i) {
            stringArray[i] = EntityPlayerInvoker.s((EntityPlayerMP)ListInvoker.get(this.g, i));
        }
        return stringArray;
    }

    public int q() {
        return aoc_0.a(this.l());
    }

    public void a(EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        Team team = a6w_0.j(entityPlayer);
        Iterator iterator = ms_0.a(a3D.f(team));
        while (dz_0.c(iterator)) {
            String string = (String)dz_0.b(iterator);
            EntityPlayerMP entityPlayerMP = this.b(string);
            if (entityPlayerMP == entityPlayer) continue;
            EntityPlayerInvoker.a(entityPlayerMP, iChatComponent);
        }
    }

    public EntityPlayerMP b(String string) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            if (!StringInvoker.d(EntityPlayerInvoker.s(entityPlayerMP), string)) continue;
            return entityPlayerMP;
        }
        return null;
    }

    public void b(GameProfile gameProfile) {
        as1_0.a(this.a, new a8S(gameProfile));
    }

    public int a() {
        return this.d;
    }

    public void b(EntityPlayerMP entityPlayerMP, WorldServer worldServer) {
        agl_1 agl_12 = a3V.l(this.o.r[0]);
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S44PacketWorldBorder(agl_12, axs_2.INITIALIZE));
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S03PacketTimeUpdate(a3V.k(worldServer), a3V.y(worldServer), J9.c(a3V.z(worldServer), zb_0.q)));
        if (a3V.x(worldServer)) {
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S2BPacketChangeGameState(1, 0.0f));
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S2BPacketChangeGameState(7, a3V.b(worldServer, 1.0f)));
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S2BPacketChangeGameState(8, a3V.a(worldServer, 1.0f)));
        }
    }

    public void f(EntityPlayerMP entityPlayerMP) {
        EntityPlayerInvoker.a(entityPlayerMP, entityPlayerMP.bp);
        EntityPlayerInvoker.a(entityPlayerMP);
        qv_0.a(entityPlayerMP.playerNetServerHandler, new S09PacketHeldItemChange(entityPlayerMP.inventory.a));
    }

    public int l() {
        return this.l;
    }

    protected void e(EntityPlayerMP entityPlayerMP) {
        abo_1.a(this.k, entityPlayerMP);
        l1_0 l1_02 = (l1_0)MapInvoker.c(this.e, EntityPlayerInvoker.v(entityPlayerMP));
        Q3.a(l1_02);
    }

    public void t() {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, zb_0.t);
        }
    }

    public NBTTagCompound d(EntityPlayerMP entityPlayerMP) {
        NBTTagCompound nBTTagCompound;
        NBTTagCompound nBTTagCompound2 = uv_2.H(a3V.d(this.o.r[0]));
        if (EntityPlayerInvoker.s(entityPlayerMP).equals(ServerInvoker.c(this.o))) {
            EntityPlayerInvoker.b(entityPlayerMP, nBTTagCompound2);
            nBTTagCompound = nBTTagCompound2;
            LoggerInvoker.b(f, zb_0.u);
        } else {
            nBTTagCompound = abo_1.b(this.k, entityPlayerMP);
        }
        return nBTTagCompound;
    }

    public String[] e() {
        return as1_0.a(this.a);
    }

    public NBTTagCompound d() {
        return null;
    }

    static {
        f = LogManagerInvoker.c();
        r = new File(zb_0.y);
        t = new File(zb_0.x);
        u = new File(zb_0.r);
        h = new File(zb_0.I);
        c = new SimpleDateFormat(zb_0.w);
    }

    public void j() {
    }

    public void a(int n) {
        this.l = n;
        if (this.o.r != null) {
            for (WorldServer worldServer : this.o.r) {
                aoc_0.a(a3V.i(worldServer), n);
            }
        }
    }

    private void a(EntityPlayerMP entityPlayerMP, EntityPlayerMP entityPlayerMP2, World world) {
        entityPlayerMP.bX.b(Uf.a(entityPlayerMP2.bX));
        Uf.a(entityPlayerMP.bX, uv_2.C(aV8.s(world)));
    }

    public void a(IChatComponent iChatComponent) {
        this.a(iChatComponent, true);
    }

    public a0t_0 c() {
        return this.q;
    }

    public boolean a(GameProfile gameProfile) {
        return !this.i || this.s.a(gameProfile) || this.a.a(gameProfile);
    }

    public boolean f(GameProfile gameProfile) {
        return this.s.a(gameProfile) || ServerInvoker.T(this.o) && uv_2.g(a3V.d(this.o.r[0])) && StringInvoker.d(ServerInvoker.c(this.o), a4Z.d(gameProfile)) || this.m;
    }

    public void a(EntityPlayer entityPlayer, double d, double d2, double d3, double d4, int n, Packet packet) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            double d5;
            double d6;
            double d7;
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            EntityPlayerMP entityPlayerMP2 = entityPlayerMP;
            if (entityPlayerMP2 == entityPlayer || entityPlayerMP2.dimension != n || !((d7 = d - entityPlayerMP2.posX) * d7 + (d6 = d2 - entityPlayerMP2.posY) * d6 + (d5 = d3 - entityPlayerMP2.posZ) * d5 < d4 * d4)) continue;
            qv_0.a(entityPlayerMP2.playerNetServerHandler, packet);
        }
    }

    public String c(boolean bl) {
        String string = zb_0.L;
        ArrayList arrayList = my_0.a(this.g);
        for (int i = 0; i < ListInvoker.size(arrayList); ++i) {
            string = aL0.a(aL0.a(new StringBuilder(), string), zb_0.C).toString();
            string = aL0.a(aL0.a(new StringBuilder(), string), EntityPlayerInvoker.s((EntityPlayerMP)ListInvoker.get(arrayList, i))).toString();
            string = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), zb_0.z), EntityPlayerInvoker.v((EntityPlayerMP)ListInvoker.get(arrayList, i)).toString()), zb_0.E).toString();
        }
        return string;
    }

    public EntityPlayerMP g(GameProfile gameProfile) {
        Object object;
        Object object2;
        UUID uUID = a6w_0.a(gameProfile);
        ArrayList arrayList = my_0.c();
        Object object3 = ListInvoker.iterator(this.g);
        while (dz_0.c((Iterator)object3)) {
            object2 = (EntityPlayerMP)dz_0.b((Iterator)object3);
            object = object2;
            if (!EntityPlayerInvoker.v((EntityPlayerMP)object).equals(uUID)) continue;
            ListInvoker.add(arrayList, object);
        }
        object3 = (EntityPlayerMP)MapInvoker.c(this.p, a4Z.a(gameProfile));
        if (!ListInvoker.contains(arrayList, object3)) {
            ListInvoker.add(arrayList, object3);
        }
        object2 = ListInvoker.iterator(arrayList);
        while (dz_0.c((Iterator)object2)) {
            object = (EntityPlayerMP)dz_0.b((Iterator)object2);
            qv_0.a(((EntityPlayerMP)object).playerNetServerHandler, zb_0.s);
        }
        object2 = ServerInvoker.Q(this.o) ? new arx_1(ServerInvoker.a(this.o, 0)) : new ItemInWorldManager(ServerInvoker.a(this.o, 0));
        return new EntityPlayerMP(this.o, ServerInvoker.a(this.o, 0), gameProfile, (ItemInWorldManager)object2);
    }

    public void a(Packet packet, int n) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP;
            EntityPlayerMP entityPlayerMP2 = entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            if (entityPlayerMP2.dimension != n) continue;
            qv_0.a(entityPlayerMP2.playerNetServerHandler, packet);
        }
    }

    public void a(GameType gameType) {
        this.j = gameType;
    }

    public void h(GameProfile gameProfile) {
        as1_0.a(this.a, gameProfile);
    }

    public void d(GameProfile gameProfile) {
        fr_0.b(this.s, gameProfile);
    }

    public void a(EntityPlayerMP entityPlayerMP, WorldServer worldServer) {
        WorldServer worldServer2 = EntityPlayerInvoker.b(entityPlayerMP);
        aoc_0.b(a3V.i(worldServer), entityPlayerMP);
        aoc_0.a(a3V.i(worldServer2), entityPlayerMP);
        rh_0.a(worldServer2.Z, (int)entityPlayerMP.posX >> 4, (int)entityPlayerMP.posZ >> 4);
    }

    public String[] h() {
        return fr_0.a(this.s);
    }

    public ServerConfigurationManager(MinecraftServer minecraftServer) {
        this.p = MapsInvoker.a();
        this.b = new a0d_0(r);
        this.q = new a0t_0(t);
        this.s = new a0N(u);
        this.a = new a0i_0(h);
        this.e = MapsInvoker.a();
        this.o = minecraftServer;
        aCY.a(this.b, false);
        aHN.a(this.q, false);
        this.d = 8;
    }

    public List<EntityPlayerMP> a(String string) {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            if (!EntityPlayerInvoker.p(entityPlayerMP).equals(string)) continue;
            ListInvoker.add(arrayList, entityPlayerMP);
        }
        return arrayList;
    }

    protected void a(zr_1 zr_12, EntityPlayerMP entityPlayerMP) {
        Object object;
        HashSet hashSet = axe_2.a();
        Iterator iterator = ms_0.a(axd_0.a(zr_12));
        while (dz_0.c(iterator)) {
            object = (a35)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S3EPacketTeams((a35)object, 0));
        }
        int n = 0;
        while (true) {
            if (!aS0.c((Set)hashSet, object = axd_0.a(zr_12, n))) {
                Iterator iterator2 = ListInvoker.iterator(axd_0.a(zr_12, (acl_0)object));
                while (dz_0.c(iterator2)) {
                    Packet packet = (Packet)dz_0.b(iterator2);
                    qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
                }
                aS0.b((Set)hashSet, object);
            }
            ++n;
        }
    }

    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        if (aCY.a(this.b, gameProfile)) {
            a88 a882 = (a88)aCY.b(this.b, gameProfile);
            String string = aL0.a(aL0.a(new StringBuilder(), zb_0.k), a8G.b(a882)).toString();
            if (a8G.a(a882) != null) {
                string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), zb_0.i), aZ2.a(c, a8G.a(a882))).toString();
            }
            return string;
        }
        if (!this.a(gameProfile)) {
            return zb_0.e;
        }
        if (aHN.a(this.q, socketAddress)) {
            a8i_0 a8i_02 = aHN.b(this.q, socketAddress);
            String string = aL0.a(aL0.a(new StringBuilder(), zb_0.n), e3_0.a(a8i_02)).toString();
            if (e3_0.b(a8i_02) != null) {
                string = aL0.a(aL0.a(aL0.a(new StringBuilder(), string), zb_0.b), aZ2.a(c, e3_0.b(a8i_02))).toString();
            }
            return string;
        }
        return ListInvoker.size(this.g) >= this.d && !this.e(gameProfile) ? zb_0.g : null;
    }

    public void b(EntityPlayerMP entityPlayerMP) {
        EntityPlayerInvoker.a(entityPlayerMP, aop_1.J);
        this.e(entityPlayerMP);
        WorldServer worldServer = EntityPlayerInvoker.b(entityPlayerMP);
        if (entityPlayerMP.r != null) {
            a3V.b(worldServer, entityPlayerMP.r);
            LoggerInvoker.b(f, zb_0.c);
        }
        a3V.d(worldServer, entityPlayerMP);
        aoc_0.b(a3V.i(worldServer), entityPlayerMP);
        ListInvoker.remove(this.g, entityPlayerMP);
        UUID uUID = EntityPlayerInvoker.v(entityPlayerMP);
        EntityPlayerMP entityPlayerMP2 = (EntityPlayerMP)MapInvoker.c(this.p, uUID);
        if (entityPlayerMP2 == entityPlayerMP) {
            MapInvoker.a(this.p, uUID);
            MapInvoker.a(this.e, uUID);
        }
        this.a(new S38PacketPlayerListItem(aux__1.REMOVE_PLAYER, entityPlayerMP));
    }

    public l1_0 a(EntityPlayer entityPlayer) {
        File file;
        UUID uUID = a6w_0.g(entityPlayer);
        l1_0 l1_02 = null;
        File file2 = new File(SaveHandlerInvoker.c(a3V.h(ServerInvoker.a(this.o, 0))), zb_0.a);
        File file3 = new File(file2, aL0.a(aL0.a(new StringBuilder(), uUID.toString()), zb_0.A).toString());
        if (!zq_2.m(file3) && zq_2.m(file = new File(file2, aL0.a(aL0.a(new StringBuilder(), a6w_0.C(entityPlayer)), zb_0.j).toString())) && zq_2.d(file)) {
            zq_2.a(file, file3);
        }
        l1_02 = new l1_0(this.o, file3);
        Q3.d(l1_02);
        MapInvoker.c(this.e, uUID, l1_02);
        return l1_02;
    }

    public void a(Entity entity, int n, WorldServer worldServer, WorldServer worldServer2) {
        double d = entity.posX;
        double d2 = entity.posZ;
        float f = entity.rotationYaw;
        ProfilerInvoker.startSection(worldServer.A, zb_0.K);
        if (entity.dimension == -1) {
            d = MathHelper.b(d / 8.0, ak9_0.c(a3V.l(worldServer2)) + 16.0, ak9_0.p(a3V.l(worldServer2)) - 16.0);
            d2 = MathHelper.b(d2 / 8.0, ak9_0.j(a3V.l(worldServer2)) + 16.0, ak9_0.m(a3V.l(worldServer2)) - 16.0);
            ayj_0.b(entity, d, entity.posY, d2, entity.rotationYaw, entity.rotationPitch);
            if (ayj_0.a(entity)) {
                a3V.a(worldServer, entity, false);
            }
        } else if (entity.dimension == 0) {
            d = MathHelper.b(d * 8.0, ak9_0.c(a3V.l(worldServer2)) + 16.0, ak9_0.p(a3V.l(worldServer2)) - 16.0);
            d2 = MathHelper.b(d2 * 8.0, ak9_0.j(a3V.l(worldServer2)) + 16.0, ak9_0.m(a3V.l(worldServer2)) - 16.0);
            ayj_0.b(entity, d, entity.posY, d2, entity.rotationYaw, entity.rotationPitch);
            if (ayj_0.a(entity)) {
                a3V.a(worldServer, entity, false);
            }
        } else {
            BlockPos blockPos = n == 1 ? a3V.c(worldServer2) : a3V.p(worldServer2);
            d = amv_2.j(blockPos);
            entity.posY = amv_2.h(blockPos);
            d2 = amv_2.i(blockPos);
            ayj_0.b(entity, d, entity.posY, d2, 90.0f, 0.0f);
            if (ayj_0.a(entity)) {
                a3V.a(worldServer, entity, false);
            }
        }
        ProfilerInvoker.endSection(worldServer.A);
        if (n != 1) {
            ProfilerInvoker.startSection(worldServer.A, zb_0.D);
            d = MathHelper.a((int)d, -29999872, 29999872);
            d2 = MathHelper.a((int)d2, -29999872, 29999872);
            if (ayj_0.a(entity)) {
                ayj_0.b(entity, d, entity.posY, d2, entity.rotationYaw, entity.rotationPitch);
                uy_1.a(a3V.f(worldServer2), entity, f);
                a3V.c(worldServer2, entity);
                a3V.a(worldServer2, entity, false);
            }
            ProfilerInvoker.endSection(worldServer.A);
        }
        ayj_0.a(entity, worldServer2);
    }

    public EntityPlayerMP a(EntityPlayerMP entityPlayerMP, int n, boolean bl) {
        a7Y.b(a3V.a(EntityPlayerInvoker.b(entityPlayerMP)), entityPlayerMP);
        a7Y.b(a3V.a(EntityPlayerInvoker.b(entityPlayerMP)), (Entity)entityPlayerMP);
        aoc_0.b(a3V.i(EntityPlayerInvoker.b(entityPlayerMP)), entityPlayerMP);
        ListInvoker.remove(this.g, entityPlayerMP);
        a3V.b(ServerInvoker.a(this.o, entityPlayerMP.dimension), entityPlayerMP);
        BlockPos blockPos = EntityPlayerInvoker.d(entityPlayerMP);
        boolean bl2 = EntityPlayerInvoker.e(entityPlayerMP);
        entityPlayerMP.dimension = n;
        ItemInWorldManager itemInWorldManager = ServerInvoker.Q(this.o) ? new arx_1(ServerInvoker.a(this.o, entityPlayerMP.dimension)) : new ItemInWorldManager(ServerInvoker.a(this.o, entityPlayerMP.dimension));
        EntityPlayerMP entityPlayerMP2 = new EntityPlayerMP(this.o, ServerInvoker.a(this.o, entityPlayerMP.dimension), EntityPlayerInvoker.I(entityPlayerMP), itemInWorldManager);
        entityPlayerMP2.playerNetServerHandler = entityPlayerMP.playerNetServerHandler;
        EntityPlayerInvoker.a(entityPlayerMP2, entityPlayerMP, bl);
        EntityPlayerInvoker.a(entityPlayerMP2, EntityPlayerInvoker.B(entityPlayerMP));
        EntityPlayerInvoker.g(entityPlayerMP2, entityPlayerMP);
        WorldServer worldServer = ServerInvoker.a(this.o, entityPlayerMP.dimension);
        this.a(entityPlayerMP2, entityPlayerMP, worldServer);
        BlockPos blockPos2 = a6w_0.a(ServerInvoker.a(this.o, entityPlayerMP.dimension), blockPos, bl2);
        EntityPlayerInvoker.b(entityPlayerMP2, (float)amv_2.j(blockPos2) + 0.5f, (float)amv_2.h(blockPos2) + 0.1f, (float)amv_2.i(blockPos2) + 0.5f, 0.0f, 0.0f);
        EntityPlayerInvoker.a(entityPlayerMP2, blockPos, bl2);
        rh_0.a(worldServer.Z, (int)entityPlayerMP2.posX >> 4, (int)entityPlayerMP2.posZ >> 4);
        while (!ListInvoker.isEmpty(a3V.a(worldServer, (Entity)entityPlayerMP2, EntityPlayerInvoker.j(entityPlayerMP2))) && entityPlayerMP2.posY < 256.0) {
            EntityPlayerInvoker.b(entityPlayerMP2, entityPlayerMP2.posX, entityPlayerMP2.posY + 1.0, entityPlayerMP2.posZ);
        }
        qv_0.a(entityPlayerMP2.playerNetServerHandler, new S07PacketRespawn(entityPlayerMP2.dimension, aV8.p(entityPlayerMP2.worldObj), uv_2.r(aV8.s(entityPlayerMP2.worldObj)), Uf.a(entityPlayerMP2.bX)));
        blockPos2 = a3V.c(worldServer);
        qv_0.a(entityPlayerMP2.playerNetServerHandler, entityPlayerMP2.posX, entityPlayerMP2.posY, entityPlayerMP2.posZ, entityPlayerMP2.rotationYaw, entityPlayerMP2.rotationPitch);
        qv_0.a(entityPlayerMP2.playerNetServerHandler, new S05PacketSpawnPosition(blockPos2));
        qv_0.a(entityPlayerMP2.playerNetServerHandler, new S1FPacketSetExperience(entityPlayerMP2.bS, entityPlayerMP2.bi, entityPlayerMP2.bL));
        this.b(entityPlayerMP2, worldServer);
        aoc_0.a(a3V.i(worldServer), entityPlayerMP2);
        a3V.c(worldServer, entityPlayerMP2);
        ListInvoker.add(this.g, entityPlayerMP2);
        MapInvoker.c(this.p, EntityPlayerInvoker.v(entityPlayerMP2), entityPlayerMP2);
        EntityPlayerInvoker.F(entityPlayerMP2);
        EntityPlayerInvoker.a(entityPlayerMP2, EntityPlayerInvoker.h(entityPlayerMP2));
        return entityPlayerMP2;
    }

    public a0d_0 p() {
        return this.b;
    }

    public void a(double d, double d2, double d3, double d4, int n, Packet packet) {
        this.a(null, d, d2, d3, d4, n, packet);
    }

    public void a(NetworkManager networkManager, EntityPlayerMP entityPlayerMP) {
        GameProfile gameProfile = EntityPlayerInvoker.I(entityPlayerMP);
        PlayerProfileCache playerProfileCache = ServerInvoker.L(this.o);
        aUu.a(playerProfileCache, a4Z.a(gameProfile));
        String string = a4Z.d(gameProfile);
        aUu.a(playerProfileCache, gameProfile);
        NBTTagCompound nBTTagCompound = this.d(entityPlayerMP);
        EntityPlayerInvoker.a(entityPlayerMP, ServerInvoker.a(this.o, entityPlayerMP.dimension));
        Uf.a(entityPlayerMP.bX, (WorldServer)entityPlayerMP.worldObj);
        String string2 = zb_0.v;
        if (NetworkManagerInvoker.b(networkManager) != null) {
            string2 = NetworkManagerInvoker.b(networkManager).toString();
        }
        LoggerInvoker.info(f, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), EntityPlayerInvoker.s(entityPlayerMP)), zb_0.l), string2), zb_0.G), EntityPlayerInvoker.B(entityPlayerMP)), zb_0.p), entityPlayerMP.posX), zb_0.m), entityPlayerMP.posY), zb_0.B), entityPlayerMP.posZ), zb_0.F).toString());
        WorldServer worldServer = ServerInvoker.a(this.o, entityPlayerMP.dimension);
        WorldInfo worldInfo = a3V.d(worldServer);
        BlockPos blockPos = a3V.c(worldServer);
        this.a(entityPlayerMP, null, worldServer);
        NetHandlerPlayServer netHandlerPlayServer = new NetHandlerPlayServer(this.o, networkManager, entityPlayerMP);
        qv_0.a(netHandlerPlayServer, new S01PacketJoinGame(EntityPlayerInvoker.B(entityPlayerMP), Uf.a(entityPlayerMP.bX), uv_2.t(worldInfo), qq_2.j(worldServer.d), a3V.w(worldServer), this.a(), uv_2.r(worldInfo), J9.c(a3V.z(worldServer), zb_0.h)));
        qv_0.a(netHandlerPlayServer, new S3FPacketCustomPayload(zb_0.o, PacketBufferInvoker.a(new PacketBuffer(FH.d()), ServerInvoker.A(this.k()))));
        qv_0.a(netHandlerPlayServer, new S41PacketServerDifficulty(uv_2.m(worldInfo), uv_2.c(worldInfo)));
        qv_0.a(netHandlerPlayServer, new S05PacketSpawnPosition(blockPos));
        qv_0.a(netHandlerPlayServer, new S39PacketPlayerAbilities(entityPlayerMP.abilities));
        qv_0.a(netHandlerPlayServer, new S09PacketHeldItemChange(entityPlayerMP.inventory.a));
        Q3.b(EntityPlayerInvoker.D(entityPlayerMP));
        Q3.b(EntityPlayerInvoker.D(entityPlayerMP), entityPlayerMP);
        this.a((zr_1)a3V.b(worldServer), entityPlayerMP);
        ServerInvoker.h(this.o);
        aoz_1 aoz_12 = !StringInvoker.d(EntityPlayerInvoker.s(entityPlayerMP), string) ? new aoz_1(zb_0.d, EntityPlayerInvoker.n(entityPlayerMP), string) : new aoz_1(zb_0.H, EntityPlayerInvoker.n(entityPlayerMP));
        HX.a(aIW.a(aoz_12), anw_0.YELLOW);
        this.a(aoz_12);
        this.c(entityPlayerMP);
        qv_0.a(netHandlerPlayServer, entityPlayerMP.posX, entityPlayerMP.posY, entityPlayerMP.posZ, entityPlayerMP.rotationYaw, entityPlayerMP.rotationPitch);
        this.b(entityPlayerMP, worldServer);
        if (!StringInvoker.g(ServerInvoker.x(this.o))) {
            EntityPlayerInvoker.a(entityPlayerMP, ServerInvoker.x(this.o), ServerInvoker.d(this.o));
        }
        Object object = ms_0.a(EntityPlayerInvoker.g(entityPlayerMP));
        while (dz_0.c((Iterator)object)) {
            a2l_0 a2l_02 = (a2l_0)dz_0.b((Iterator)object);
            qv_0.a(netHandlerPlayServer, new S1DPacketEntityEffect(EntityPlayerInvoker.B(entityPlayerMP), a2l_02));
        }
        EntityPlayerInvoker.F(entityPlayerMP);
        if (tn_0.a(nBTTagCompound, zb_0.J, 10)) {
            object = ub_1.a(tn_0.d(nBTTagCompound, zb_0.f), (World)worldServer);
            ((Entity)object).ah = true;
            a3V.c(worldServer, (Entity)object);
            EntityPlayerInvoker.h(entityPlayerMP, (Entity)object);
            ((Entity)object).ah = false;
        }
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public List<EntityPlayerMP> g() {
        return this.g;
    }

    public a0N b() {
        return this.s;
    }

    public void a(WorldServer[] worldServerArray) {
        this.k = SaveHandlerInvoker.d(a3V.h(worldServerArray[0]));
        ak9_0.a(a3V.l(worldServerArray[0]), new ayh_2(this));
    }

    public a0i_0 n() {
        return this.a;
    }

    public String[] f() {
        return SaveHandlerInvoker.d(a3V.h(this.o.r[0])).a();
    }

    public void a(Packet packet) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
        }
    }
}

