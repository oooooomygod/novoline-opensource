/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package deobf;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.NetworkManagerInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.mojang.authlib.GameProfile;
import deobf.Chunk;
import net.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.inventory.Container;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.util.ReportedException;
import deobf.StatBase;
import deobf.TileEntity;
import net.minecraft.network.packts.C15PacketClientSettings;
import net.minecraft.network.packts.S02PacketChat;
import net.minecraft.network.packts.S06PacketUpdateHealth;
import net.minecraft.network.packts.S0APacketUseBed;
import net.minecraft.network.packts.S0BPacketAnimation;
import net.minecraft.network.packts.S13PacketDestroyEntities;
import net.minecraft.network.packts.S19PacketEntityStatus;
import net.minecraft.network.packts.S1BPacketEntityAttach;
import net.minecraft.network.packts.S1DPacketEntityEffect;
import net.minecraft.network.packts.S1EPacketRemoveEntityEffect;
import net.minecraft.network.packts.S1FPacketSetExperience;
import net.minecraft.network.packts.S21PacketChunkData;
import net.minecraft.network.packts.S26PacketMapChunkBulk;
import net.minecraft.network.packts.S29PacketSoundEffect;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import net.minecraft.network.packts.S2DPacketOpenWindow;
import net.minecraft.network.packts.S2EPacketCloseWindow;
import net.minecraft.network.packts.S2FPacketSetSlot;
import net.minecraft.network.packts.S30PacketWindowItems;
import net.minecraft.network.packts.S31PacketWindowProperty;
import net.minecraft.network.packts.S36PacketSignEditorOpen;
import net.minecraft.network.packts.S39PacketPlayerAbilities;
import net.minecraft.network.packts.S3FPacketCustomPayload;
import net.minecraft.network.packts.S42PacketCombatEvent;
import net.minecraft.network.packts.S43PacketCamera;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EntityPlayerMP
extends EntityPlayer
implements ICrafting {
    private boolean b9 = true;
    private Entity bT = null;
    public List<ChunkCoordIntPair> b2;
    private int cc = -99999999;
    private boolean ce = true;
    private EnumChatVisibility bU;
    private float bV;
    private int cd = -99999999;
    private l1_0 bZ;
    public boolean b3;
    private long bY;
    public int b4;
    public double b5;
    public ItemInWorldManager bX;
    private int b6 = 60;
    private int b1;
    public double cb;
    public NetHandlerPlayServer playerNetServerHandler;
    private float b0 = -1.0E8f;
    public MinecraftServer b7;
    private List<Integer> bW;
    public boolean ca;
    private String b8 = UG.r;

    @Override
    public void onDeath(DamageSource damageSource) {
        Object object;
        Object object2;
        if (J9.c(aV8.k(this.worldObj), UG.n)) {
            object2 = this.getTeam();
            if (a3D.c((Team)object2) != aFJ.ALWAYS) {
                if (a3D.c((Team)object2) == aFJ.HIDE_FOR_OTHER_TEAMS) {
                    aek_1.b(ServerInvoker.R(this.b7), (EntityPlayer)this, aw1_0.e(this.A()));
                } else if (a3D.c((Team)object2) == aFJ.HIDE_FOR_OWN_TEAM) {
                    aek_1.a(ServerInvoker.R(this.b7), (EntityPlayer)this, aw1_0.e(this.A()));
                }
            } else {
                aek_1.a(ServerInvoker.R(this.b7), aw1_0.e(this.A()));
            }
        }
        if (!J9.c(aV8.k(this.worldObj), UG.c)) {
            InventoryInvoker.a(this.inventory);
        }
        object2 = ms_0.a(VM.a(aV8.v(this.worldObj), aOA.d));
        while (dz_0.c((Iterator)object2)) {
            object = (acl_0)dz_0.b((Iterator)object2);
            QU qU = VM.c(this.a(), this.getName(), (acl_0)object);
            hs_0.a(qU);
        }
        object2 = this.I();
        object = (a9Q)MapInvoker.c(ai7_0.d, P8.d(ub_1.b((Entity)object2)));
        this.b(((a9Q)object).d);
        ((Entity)object2).a((Entity)this, this.aK);
        this.b(aop_1.ac);
        this.a(aop_1.w);
        aw1_0.c(this.A());
    }

    public void R() {
        this.b0 = -1.0E8f;
    }

    public void a(String string, String string2) {
        qv_0.a(this.playerNetServerHandler, new S48PacketResourcePackSend(string, string2));
    }

    private boolean t() {
        return ServerInvoker.G(this.b7);
    }

    private void q() {
        this.b1 = this.b1 % 100 + 1;
    }

    @Override
    public aox_1 a(BlockPos blockPos) {
        aox_1 aox_12 = super.a(blockPos);
        if (aox_12 == aox_1.OK) {
            S0APacketUseBed s0APacketUseBed = new S0APacketUseBed(this, blockPos);
            a7Y.b(a3V.a(this.W()), this, s0APacketUseBed);
            qv_0.a(this.playerNetServerHandler, this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            qv_0.a(this.playerNetServerHandler, s0APacketUseBed);
        }
        return aox_12;
    }

    public void y() {
        this.bY = ServerInvoker.c();
    }

    @Override
    public void addStat(StatBase statBase, int n) {
        Q3.a(this.bZ, this, statBase, n);
        Iterator iterator = ms_0.a(VM.a(this.a(), NW.e(statBase)));
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            hs_0.c(VM.c(this.a(), this.getName(), acl_02), n);
        }
        if (Q3.c(this.bZ)) {
            Q3.a(this.bZ, this);
        }
    }

    public void a(C15PacketClientSettings c15PacketClientSettings) {
        this.b8 = axe_0.c(c15PacketClientSettings);
        this.bU = c15PacketClientSettings.a();
        this.ce = axe_0.a(c15PacketClientSettings);
        aom_0.b(this.t(), 10, axt_2.a((byte)axe_0.b(c15PacketClientSettings)));
    }

    @Override
    public void a(Container container, int n, ItemStack itemStack) {
        if (!(afy_2.a(container, n) instanceof a7B) && !this.ca) {
            qv_0.a(this.playerNetServerHandler, new S2FPacketSetSlot(container.f, n, itemStack));
        }
    }

    protected void h() {
        il_0 il_02 = aV8.o(this.worldObj, new BlockPos(MathHelper.floor_double(this.posX), 0, MathHelper.floor_double(this.posZ)));
        String string = il_02.Y;
        vg_2 vg_22 = (vg_2)Q3.a(this.S(), (StatBase)apf_0.l);
        vg_22 = (vg_2)Q3.a(this.S(), apf_0.l, new vg_2());
        vg_22.add(string);
        if (Q3.a(this.S(), apf_0.l) && vg_22.size() >= aS0.d(il_0.U)) {
            HashSet hashSet = axe_2.b(il_0.U);
            Iterator iterator = vg_22.iterator();
            while (dz_0.c(iterator)) {
                String string2 = (String)dz_0.b(iterator);
                aS0.a((Set)hashSet, arg_0 -> EntityPlayerMP.lambda$updateBiomesExplored$0(string2, arg_0));
                if (!aS0.b(hashSet)) continue;
                break;
            }
            if (aS0.b(hashSet)) {
                this.b(apf_0.l);
            }
        }
    }

    @Override
    public void sendPlayerAbilities() {
        if (this.playerNetServerHandler != null) {
            qv_0.a(this.playerNetServerHandler, new S39PacketPlayerAbilities(this.abilities));
            this.B();
        }
    }

    @Override
    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void A() {
        Object object;
        Object object2;
        try {
            super.onUpdate();
            for (int i = 0; i < InventoryInvoker.b(this.inventory); ++i) {
                object2 = InventoryInvoker.c(this.inventory, i);
                if (!px_0.n(act_2.k((ItemStack)object2))) continue;
                object = aS3.a((lf_0)act_2.k((ItemStack)object2), (ItemStack)object2, this.worldObj, this);
                qv_0.a(this.playerNetServerHandler, (Packet)object);
            }
        }
        catch (Throwable throwable) {
            object2 = CrashInvoker.makeCrashReport(throwable, UG.p);
            object = CrashInvoker.a((CrashReport)object2, UG.j);
            this.a((CrashReportCategory)object);
            throw new ReportedException((CrashReport)object2);
        }
        {
            if (this.a() != this.b0 || this.cc != net.K.b(this.bf) || net.K.c(this.bf) == 0.0f != this.b9) {
                qv_0.a(this.playerNetServerHandler, new S06PacketUpdateHealth(this.a(), net.K.b(this.bf), net.K.c(this.bf)));
                this.b0 = this.a();
                this.cc = net.K.b(this.bf);
                boolean bl = this.b9 = net.K.c(this.bf) == 0.0f;
            }
            if (this.a() + this.o() != this.bV) {
                this.bV = this.a() + this.o();
                Iterator iterator = ms_0.a(VM.a(this.a(), aOA.a));
                while (dz_0.c(iterator)) {
                    object2 = (acl_0)dz_0.b(iterator);
                    hs_0.a(VM.c(this.a(), this.getName(), (acl_0)object2), asg_0.b(this));
                }
            }
            if (this.bi != this.cd) {
                this.cd = this.bi;
                qv_0.a(this.playerNetServerHandler, new S1FPacketSetExperience(this.bS, this.bi, this.bL));
            }
            if (this.ticksExisted % 20 * 5 == 0 && !Q3.b(this.S(), apf_0.l)) {
                this.h();
            }
            return;
        }
    }

    public long i() {
        return this.bY;
    }

    @Override
    public boolean a(int n, String string) {
        if (UG.k.equals(string) && !ServerInvoker.i(this.b7)) {
            return true;
        }
        if (!(UG.u.equals(string) || UG.v.equals(string) || UG.l.equals(string) || UG.i.equals(string))) {
            if (aek_1.a(ServerInvoker.R(this.b7), this.X())) {
                a8X a8X2 = (a8X)fr_0.a(aek_1.p(ServerInvoker.R(this.b7)), (Object)this.X());
                return SN.b(a8X2) >= n;
            }
            return false;
        }
        return true;
    }

    @Override
    public void a(Container container, rs_1 rs_12) {
        for (int i = 0; i < apw_0.a(rs_12); ++i) {
            qv_0.a(this.playerNetServerHandler, new S31PacketWindowProperty(container.f, i, apw_0.a(rs_12, i)));
        }
    }

    public l1_0 S() {
        return this.bZ;
    }

    @Override
    public void m(Entity entity) {
        if (Uf.a(this.bX) == GameType.SPECTATOR) {
            this.a(entity);
        } else {
            super.m(entity);
        }
    }

    @Override
    public void mountEntity(Entity entity) {
        Entity entity2 = this.r;
        super.mountEntity(entity);
        if (entity != entity2) {
            qv_0.a(this.playerNetServerHandler, new S1BPacketEntityAttach(0, this, this.r));
            qv_0.a(this.playerNetServerHandler, this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }

    public void c() {
        afy_2.a(this.bI, this);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        boolean bl = ServerInvoker.i(this.b7) && this.t() && UG.a.equals(damageSource.t);
        if (this.b6 > 0 && damageSource != DamageSource.m) {
            return false;
        }
        if (damageSource instanceof aed_1) {
            Entity entity = aDJ.d(damageSource);
            if (entity instanceof EntityPlayer && !this.a((EntityPlayer)entity)) {
                return false;
            }
            if (entity instanceof EntityArrow) {
                EntityArrow entityArrow = (EntityArrow)entity;
                if (entityArrow.ak instanceof EntityPlayer && !this.a((EntityPlayer)entityArrow.ak)) {
                    return false;
                }
            }
        }
        return super.a(damageSource, f);
    }

    public void a(Container container) {
        this.a(container, afy_2.a(container));
    }

    @Override
    public void a(a7K a7K2) {
        this.q();
        this.bI = new aax_1(this.inventory, a7K2, this.worldObj);
        this.bI.f = this.b1;
        afy_2.a(this.bI, this);
        anb_1 anb_12 = amk_1.a((aax_1)this.bI);
        IChatComponent iChatComponent = a7K2.getDisplayName();
        qv_0.a(this.playerNetServerHandler, new S2DPacketOpenWindow(this.b1, UG.q, iChatComponent, apw_0.c(anb_12)));
        F8 f8 = ze_1.b(a7K2, this);
        PacketBuffer packetBuffer = new PacketBuffer(FH.d());
        PacketBufferInvoker.e(packetBuffer, this.b1);
        aG4.a(f8, packetBuffer);
        qv_0.a(this.playerNetServerHandler, new S3FPacketCustomPayload(UG.f, packetBuffer));
    }

    @Override
    public void a(rs_1 rs_12) {
        aHP aHP2;
        if (this.bI != this.bp) {
            this.N();
        }
        if (rs_12 instanceof aHP && aqb_1.a(aHP2 = (aHP)rs_12) && !this.a(aqb_1.b(aHP2)) && !this.k()) {
            qv_0.a(this.playerNetServerHandler, new S02PacketChat(new aoz_1(UG.m, rs_12.getDisplayName()), 2));
            qv_0.a(this.playerNetServerHandler, new S29PacketSoundEffect(UG.t, this.posX, this.posY, this.posZ, 1.0f, 1.0f));
            return;
        }
        this.q();
        if (rs_12 instanceof dv_1) {
            qv_0.a(this.playerNetServerHandler, new S2DPacketOpenWindow(this.b1, dy_0.a((dv_1)((Object)rs_12)), rs_12.getDisplayName(), apw_0.c(rs_12)));
            this.bI = dy_0.a((dv_1)((Object)rs_12), this.inventory, this);
        } else {
            qv_0.a(this.playerNetServerHandler, new S2DPacketOpenWindow(this.b1, UG.w, rs_12.getDisplayName(), apw_0.c(rs_12)));
            this.bI = new aaz_0(this.inventory, rs_12, this);
        }
        this.bI.f = this.b1;
        afy_2.a(this.bI, this);
    }

    @Override
    public void a(StatBase statBase) {
        Q3.b(this.bZ, this, statBase, 0);
        Iterator iterator = ms_0.a(VM.a(this.a(), NW.e(statBase)));
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            hs_0.a(VM.c(this.a(), this.getName(), acl_02), 0);
        }
        if (Q3.c(this.bZ)) {
            Q3.a(this.bZ, this);
        }
    }

    @Override
    public boolean a(EntityPlayerMP entityPlayerMP) {
        return entityPlayerMP.k() ? this.U() == this : !this.k() && super.a(entityPlayerMP);
    }

    @Override
    public void N() {
        qv_0.a(this.playerNetServerHandler, new S2EPacketCloseWindow(this.bI.f));
        this.d();
    }

    @Override
    public void a(boolean bl, boolean bl2, boolean bl3) {
        if (this.y()) {
            a7Y.a(a3V.a(this.W()), (Entity)this, new S0BPacketAnimation(this, 2));
        }
        super.a(bl, bl2, bl3);
        if (this.playerNetServerHandler != null) {
            qv_0.a(this.playerNetServerHandler, this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }

    @Override
    public void p() {
        super.p();
        qv_0.a(this.playerNetServerHandler, new S42PacketCombatEvent(this.A(), adf_0.ENTER_COMBAT));
    }

    public void P() {
        if (this.h != null) {
            this.h.mountEntity(this);
        }
        if (this.sleeping) {
            this.a(true, false, false);
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, UG.o, ar3_0.a(Uf.a(this.bX)));
    }

    @Override
    public void ag() {
        super.ag();
        qv_0.a(this.playerNetServerHandler, new S42PacketCombatEvent(this.A(), adf_0.END_COMBAT));
    }

    @Override
    public BlockPos e() {
        return new BlockPos(this.posX, this.posY + 0.5, this.posZ);
    }

    @Override
    public void a(na_1 na_12, rs_1 rs_12) {
        if (this.bI != this.bp) {
            this.N();
        }
        this.q();
        qv_0.a(this.playerNetServerHandler, new S2DPacketOpenWindow(this.b1, UG.d, rs_12.getDisplayName(), apw_0.c(rs_12), na_12.r()));
        this.bI = new aa8_0(this.inventory, rs_12, na_12, this);
        this.bI.f = this.b1;
        afy_2.a(this.bI, this);
    }

    @Override
    public void h(Entity entity) {
        a7Y.a(a3V.a(this.W()), (Entity)this, new S0BPacketAnimation(entity, 4));
    }

    @Override
    public void displayGui(dv_1 dv_12) {
        this.q();
        qv_0.a(this.playerNetServerHandler, new S2DPacketOpenWindow(this.b1, dy_0.a(dv_12), dv_12.getDisplayName()));
        this.bI = dy_0.a(dv_12, this.inventory, this);
        this.bI.f = this.b1;
        afy_2.a(this.bI, this);
    }

    public void T() {
        if (!this.ca) {
            qv_0.a(this.playerNetServerHandler, new S2FPacketSetSlot(-1, -1, InventoryInvoker.f(this.inventory)));
        }
    }

    public EntityPlayerMP(MinecraftServer minecraftServer, WorldServer worldServer, GameProfile gameProfile, ItemInWorldManager itemInWorldManager) {
        super(worldServer, gameProfile);
        this.b2 = my_0.b();
        this.bW = my_0.b();
        this.bV = Float.MIN_VALUE;
        this.bY = SystemInvoker.f();
        itemInWorldManager.e = this;
        this.bX = itemInWorldManager;
        BlockPos blockPos = a3V.c(worldServer);
        if (!qq_2.e(worldServer.d) && uv_2.C(a3V.d(worldServer)) != GameType.ADVENTURE) {
            int n = MathInvoker.max(5, ServerInvoker.y(minecraftServer) - 6);
            int n2 = MathHelper.floor_double(ak9_0.a(a3V.l(worldServer), amv_2.j(blockPos), amv_2.i(blockPos)));
            if (n2 < n) {
                n = n2;
            }
            if (n2 <= 1) {
                n = 1;
            }
            blockPos = a3V.e(worldServer, amv_2.a(blockPos, a5_0.a(this.Q, n * 2) - n, 0, a5_0.a(this.Q, n * 2) - n));
        }
        this.b7 = minecraftServer;
        this.bZ = aek_1.a(ServerInvoker.R(minecraftServer), (EntityPlayer)this);
        this.U = 0.0f;
        this.a(blockPos, 0.0f, 0.0f);
        while (!ListInvoker.isEmpty(a3V.a(worldServer, (Entity)this, this.getEntityBoundingBox())) && this.posY < 255.0) {
            this.j(this.posX, this.posY + 1.0, this.posZ);
        }
    }

    public void a(float f, float f2, boolean bl, boolean bl2) {
        if (this.r != null) {
            if (f >= -1.0f && f <= 1.0f) {
                this.moveStrafing = f;
            }
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.moveForward = f2;
            }
            this.isJumping = bl;
            this.e(bl2);
        }
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, UG.s, 99)) {
            if (ServerInvoker.K(ServerInvoker.d())) {
                this.bX.b(ServerInvoker.l(ServerInvoker.d()));
            } else {
                this.bX.b(ar3_0.a(tn_0.g(nBTTagCompound, UG.h)));
            }
        }
    }

    private static boolean lambda$updateBiomesExplored$0(String string, il_0 il_02) {
        return il_02.Y.equals(string);
    }

    private void a(TileEntity tileEntity) {
        Packet packet = NBTInvoker.c(tileEntity);
        qv_0.a(this.playerNetServerHandler, packet);
    }

    @Override
    public void a(Container container, List<ItemStack> list) {
        qv_0.a(this.playerNetServerHandler, new S30PacketWindowItems(container.f, list));
        qv_0.a(this.playerNetServerHandler, new S2FPacketSetSlot(-1, -1, InventoryInvoker.f(this.inventory)));
    }

    @Override
    public void a(ItemStack itemStack) {
        Item item = act_2.k(itemStack);
        if (item == Items.written_book) {
            qv_0.a(this.playerNetServerHandler, new S3FPacketCustomPayload(UG.b, new PacketBuffer(FH.d())));
        }
    }

    @Override
    public void a(double d, double d2, double d3) {
        qv_0.a(this.playerNetServerHandler, d, d2, d3, this.rotationYaw, this.rotationPitch);
    }

    @Override
    public void b(Entity entity, int n) {
        super.b(entity, n);
        afy_2.b(this.bI);
    }

    @Override
    public void a(EntityPlayer entityPlayer, boolean bl) {
        super.a(entityPlayer, bl);
        this.cd = -1;
        this.b0 = -1.0f;
        this.cc = -1;
        ListInvoker.addAll(this.bW, ((EntityPlayerMP)entityPlayer).bW);
    }

    public String j() {
        String string = NetworkManagerInvoker.b(this.playerNetServerHandler.netManager).toString();
        string = StringInvoker.a(string, StringInvoker.b(string, UG.g) + 1);
        string = StringInvoker.b(string, 0, StringInvoker.b(string, UG.e));
        return string;
    }

    @Override
    public void m(int n) {
        super.m(n);
        this.cd = -1;
    }

    @Override
    public void k(int n) {
        super.k(n);
        this.cd = -1;
    }

    public Entity U() {
        return this.bT == null ? this : this.bT;
    }

    @Override
    protected void b(a2l_0 a2l_02) {
        super.b(a2l_02);
        qv_0.a(this.playerNetServerHandler, new S1EPacketRemoveEntityEffect(this.r(), a2l_02));
    }

    @Override
    public void a(Container container, int n, int n2) {
        qv_0.a(this.playerNetServerHandler, new S31PacketWindowProperty(container.f, n, n2));
    }

    public void c(IChatComponent iChatComponent) {
        qv_0.a(this.playerNetServerHandler, new S02PacketChat(iChatComponent));
    }

    @Override
    protected void c(a2l_0 a2l_02) {
        super.c(a2l_02);
        qv_0.a(this.playerNetServerHandler, new S1DPacketEntityEffect(this.r(), a2l_02));
    }

    @Override
    protected void a(a2l_0 a2l_02, boolean bl) {
        super.a(a2l_02, bl);
        qv_0.a(this.playerNetServerHandler, new S1DPacketEntityEffect(this.r(), a2l_02));
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return this.t() && super.a(entityPlayer);
    }

    public WorldServer W() {
        return (WorldServer)this.worldObj;
    }

    public void a(double d, boolean bl) {
        Block block;
        int n;
        int n2;
        int n3 = MathHelper.floor_double(this.posX);
        BlockPos blockPos = new BlockPos(n3, n2 = MathHelper.floor_double(this.posY - (double)0.2f), n = MathHelper.floor_double(this.posZ));
        Block block2 = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos));
        if (BlocksInvoker.getBlockState(block2) == Material.air && ((block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos)))) instanceof g2_0 || block instanceof hr_0 || block instanceof gv_2)) {
            blockPos = amv_2.g(blockPos);
            block2 = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos));
        }
        super.a(d, bl, block2, blockPos);
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public void onUpdate() {
        Entity entity;
        Object object;
        Object object2;
        Uf.c(this.bX);
        --this.b6;
        if (this.hurtResistantTime > 0) {
            --this.hurtResistantTime;
        }
        afy_2.b(this.bI);
        if (!this.worldObj.isRemote && !afy_2.c(this.bI, this)) {
            this.N();
            this.bI = this.bp;
        }
        while (!ListInvoker.isEmpty(this.bW)) {
            int n = MathInvoker.b(ListInvoker.size(this.bW), Integer.MAX_VALUE);
            object2 = new int[n];
            object = ListInvoker.iterator(this.bW);
            int n2 = 0;
            while (dz_0.c((Iterator)object) && n2 < n) {
                object2[n2++] = P8.b((Integer)dz_0.b((Iterator)object));
                dz_0.a((Iterator)object);
            }
            qv_0.a(this.playerNetServerHandler, new S13PacketDestroyEntities((int)object2));
        }
        if (!ListInvoker.isEmpty(this.b2)) {
            Object object3;
            ArrayList arrayList = my_0.c();
            object2 = ListInvoker.iterator(this.b2);
            object = my_0.c();
            while (dz_0.c((Iterator)object2) && ListInvoker.size(arrayList) < 10) {
                ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)dz_0.b((Iterator)object2);
                if (!aV8.isBlockLoaded(this.worldObj, new BlockPos(chunkCoordIntPair.b << 4, 0, chunkCoordIntPair.a << 4)) || !aqp_2.n((Chunk)(object3 = aV8.a(this.worldObj, chunkCoordIntPair.b, chunkCoordIntPair.a)))) continue;
                ListInvoker.add(arrayList, object3);
                ListInvoker.addAll((List)object, a3V.a((WorldServer)this.worldObj, chunkCoordIntPair.b * 16, 0, chunkCoordIntPair.a * 16, chunkCoordIntPair.b * 16 + 16, 256, chunkCoordIntPair.a * 16 + 16));
                dz_0.a((Iterator)object2);
            }
            if (!ListInvoker.isEmpty(arrayList)) {
                if (ListInvoker.size(arrayList) == 1) {
                    qv_0.a(this.playerNetServerHandler, new S21PacketChunkData((Chunk)ListInvoker.get(arrayList, 0), true, 65535));
                } else {
                    qv_0.a(this.playerNetServerHandler, new S26PacketMapChunkBulk(arrayList));
                }
                Iterator iterator = ListInvoker.iterator((List)object);
                while (dz_0.c(iterator)) {
                    object3 = (TileEntity)dz_0.b(iterator);
                    this.a((TileEntity)object3);
                }
                iterator = ListInvoker.iterator(arrayList);
                while (dz_0.c(iterator)) {
                    object3 = (Chunk)dz_0.b(iterator);
                    a7Y.a(a3V.a(this.W()), this, (Chunk)object3);
                }
            }
        }
        if ((entity = this.U()) != this) {
            if (!entity.n()) {
                this.a((Entity)this);
            } else {
                this.b(entity.posX, entity.posY, entity.posZ, entity.rotationYaw, entity.rotationPitch);
                aek_1.c(ServerInvoker.R(this.b7), this);
                if (this.isSneaking()) {
                    this.a((Entity)this);
                }
            }
        }
    }

    public void n(Entity entity) {
        if (entity instanceof EntityPlayer) {
            qv_0.a(this.playerNetServerHandler, new S13PacketDestroyEntities(entity.r()));
        } else {
            ListInvoker.add(this.bW, P8.d(entity.r()));
        }
    }

    @Override
    protected void o() {
        qv_0.a(this.playerNetServerHandler, new S19PacketEntityStatus(this, 9));
        super.o();
    }

    public void d() {
        afy_2.b(this.bI, this);
        this.bI = this.bp;
    }

    @Override
    public boolean k() {
        return Uf.a(this.bX) == GameType.SPECTATOR;
    }

    @Override
    public void f(int n) {
        if (this.dimension == 1 && n == 1) {
            this.b(apf_0.h);
            this.worldObj.c(this);
            this.b3 = true;
            qv_0.a(this.playerNetServerHandler, new S2BPacketChangeGameState(4, 0.0f));
        } else {
            if (this.dimension == 0 && n == 1) {
                this.b(apf_0.v);
                BlockPos blockPos = a3V.p(ServerInvoker.a(this.b7, n));
                qv_0.a(this.playerNetServerHandler, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), 0.0f, 0.0f);
                n = 1;
            } else {
                this.b(apf_0.p);
            }
            aek_1.a(ServerInvoker.R(this.b7), this, n);
            this.cd = -1;
            this.b0 = -1.0f;
            this.cc = -1;
        }
    }

    public void a(Entity entity) {
        Entity entity2 = this.U();
        this.bT = this;
        if (entity2 != this.bT) {
            qv_0.a(this.playerNetServerHandler, new S43PacketCamera(this.bT));
            this.a(this.bT.posX, this.bT.posY, this.bT.posZ);
        }
    }

    @Override
    public void l(Entity entity) {
        a7Y.a(a3V.a(this.W()), (Entity)this, new S0BPacketAnimation(entity, 5));
    }

    public EnumChatVisibility V() {
        return this.bU;
    }

    @Override
    public void a(GameType gameType) {
        this.bX.b(gameType);
        qv_0.a(this.playerNetServerHandler, new S2BPacketChangeGameState(3, ar3_0.a(gameType)));
        if (gameType == GameType.SPECTATOR) {
            this.mountEntity(null);
        } else {
            this.a((Entity)this);
        }
        this.sendPlayerAbilities();
        this.V();
    }

    @Override
    public void a(ItemStack itemStack, int n) {
        super.a(itemStack, n);
        if (act_2.k(itemStack) != null && px_0.d(act_2.k(itemStack), itemStack) == ti_1.EAT) {
            a7Y.a(a3V.a(this.W()), (Entity)this, new S0BPacketAnimation(this, 3));
        }
    }

    @Override
    public void a(a6z_0 a6z_02) {
        aIE.b(a6z_02, this);
        qv_0.a(this.playerNetServerHandler, new S36PacketSignEditorOpen(aIE.c(a6z_02)));
    }

    public IChatComponent a() {
        return null;
    }

    @Override
    protected void B() {
        if (this.k()) {
            this.w();
            this.b(true);
        } else {
            super.B();
        }
        a7Y.a(a3V.a(this.W()), this);
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
        qv_0.a(this.playerNetServerHandler, new S02PacketChat(iChatComponent));
    }
}

