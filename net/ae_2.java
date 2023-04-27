/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.*;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import net.minecraft.network.packts.S04PacketEntityEquipment;
import net.minecraft.network.packts.S0APacketUseBed;
import net.minecraft.network.packts.S0CPacketSpawnPlayer;
import net.minecraft.network.packts.S0EPacketSpawnObject;
import net.minecraft.network.packts.S0FPacketSpawnMob;
import net.minecraft.network.packts.S10PacketSpawnPainting;
import net.minecraft.network.packts.S11PacketSpawnExperienceOrb;
import net.minecraft.network.packts.S12PacketEntityVelocity;
import net.minecraft.network.packts.S15PacketEntityRelMove;
import net.minecraft.network.packts.S16PacketEntityLook;
import net.minecraft.network.packts.S17PacketEntityLookMove;
import net.minecraft.network.packts.S18PacketEntityTeleport;
import net.minecraft.network.packts.S19PacketEntityHeadLook;
import net.minecraft.network.packts.S1BPacketEntityAttach;
import net.minecraft.network.packts.S1CPacketEntityMetadata;
import net.minecraft.network.packts.S1DPacketEntityEffect;
import net.minecraft.network.packts.S20PacketEntityProperties;
import net.minecraft.network.packts.S49PacketUpdateEntityNBT;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.Logger;

/*
 * Renamed from net.ae
 */
public class ae_2 {
    public int j;
    public int m;
    public double h;
    private int x;
    public double c;
    private boolean u;
    public Set<EntityPlayerMP> e = axe_2.a();
    private boolean y;
    public int a;
    private Entity f;
    private double q;
    public int d;
    private boolean s;
    private double l;
    public Entity i;
    public int o;
    private boolean g;
    public boolean k;
    private static Logger n = LogManagerInvoker.c();
    public double p;
    public int r;
    public int v;
    private double w;
    public int t;
    public int b;

    public void b(Packet packet) {
        this.a(packet);
        if (this.i instanceof EntityPlayerMP) {
            qv_0.a(((EntityPlayerMP)this.i).playerNetServerHandler, packet);
        }
    }

    public void b(List<EntityPlayer> list) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            this.d((EntityPlayerMP)entityPlayer);
        }
    }

    public void a(List<EntityPlayer> list) {
        this.k = false;
        if (!this.y || ayj_0.a(this.i, this.w, this.q, this.l) > 16.0) {
            this.w = this.i.posX;
            this.q = this.i.posY;
            this.l = this.i.posZ;
            this.y = true;
            this.k = true;
            this.b(list);
        }
        if (this.f != this.i.r || this.i.r != null && this.j % 60 == 0) {
            this.f = this.i.r;
            this.a(new S1BPacketEntityAttach(0, this.i, this.i.r));
        }
        if (this.i instanceof no_2 && this.j % 10 == 0) {
            no_2 no_22 = (no_2)this.i;
            ItemStack itemStack = yd_1.e(no_22);
            if (act_2.k(itemStack) instanceof ItemMap) {
                wp_1 wp_12 = pt_1.a(Items.filled_map, itemStack, this.i.worldObj);
                Iterator iterator = ListInvoker.iterator(list);
                while (dz_0.c(iterator)) {
                    EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
                    EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
                    sl_2.a(wp_12, entityPlayerMP, itemStack);
                    Packet packet = pt_1.a(Items.filled_map, itemStack, this.i.worldObj, entityPlayerMP);
                    qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
                }
            }
            this.b();
        }
        if (this.j % this.t == 0 || this.i.p || aom_0.d(ayj_0.N(this.i))) {
            int n;
            if (this.i.r == null) {
                ++this.x;
                n = MathHelper.floor_double(this.i.posX * 32.0);
                int n2 = MathHelper.floor_double(this.i.posY * 32.0);
                int n3 = MathHelper.floor_double(this.i.posZ * 32.0);
                int n4 = MathHelper.f(this.i.rotationYaw * 256.0f / 360.0f);
                int n5 = MathHelper.f(this.i.rotationPitch * 256.0f / 360.0f);
                int n6 = n - this.v;
                int n7 = n2 - this.d;
                int n8 = n3 - this.a;
                Packet<INetHandlerPlayClient> packet = null;
                boolean bl = MathInvoker.a(n6) >= 4 || MathInvoker.a(n7) >= 4 || MathInvoker.a(n8) >= 4 || this.j % 60 == 0;
                boolean bl2 = MathInvoker.a(n4 - this.b) >= 4 || MathInvoker.a(n5 - this.r) >= 4;
                if (this.j > 0 || this.i instanceof EntityArrow) {
                    if (n6 >= -128 && n6 < 128 && n7 >= -128 && n7 < 128 && n8 >= -128 && n8 < 128 && this.x <= 400 && !this.u && this.s == this.i.onGround) {
                        packet = !(this.i instanceof EntityArrow) ? new S15PacketEntityRelMove(ayj_0.B(this.i), (byte)n6, (byte)n7, (byte)n8, this.i.onGround) : new S17PacketEntityLookMove(ayj_0.B(this.i), (byte)n6, (byte)n7, (byte)n8, (byte)n4, (byte)n5, this.i.onGround);
                    } else {
                        this.s = this.i.onGround;
                        this.x = 0;
                        packet = new S18PacketEntityTeleport(ayj_0.B(this.i), n, n2, n3, (byte)n4, (byte)n5, this.i.onGround);
                    }
                }
                if (this.g) {
                    double d = this.i.motionX - this.h;
                    double d2 = this.i.motionY - this.p;
                    double d3 = this.i.motionZ - this.c;
                    double d4 = d * d + d2 * d2 + d3 * d3;
                    if (d4 > 4.0E-4 || d4 > 0.0 && this.i.motionX == 0.0 && this.i.motionY == 0.0 && this.i.motionZ == 0.0) {
                        this.h = this.i.motionX;
                        this.p = this.i.motionY;
                        this.c = this.i.motionZ;
                        this.a(new S12PacketEntityVelocity(ayj_0.B(this.i), this.h, this.p, this.c));
                    }
                }
                this.a(packet);
                this.b();
                this.v = n;
                this.d = n2;
                this.a = n3;
                this.b = n4;
                this.r = n5;
                this.u = false;
            } else {
                n = MathHelper.f(this.i.rotationYaw * 256.0f / 360.0f);
                int n9 = MathHelper.f(this.i.rotationPitch * 256.0f / 360.0f);
                boolean bl = MathInvoker.a(n - this.b) >= 4 || MathInvoker.a(n9 - this.r) >= 4;
                this.a(new S16PacketEntityLook(ayj_0.B(this.i), (byte)n, (byte)n9, this.i.onGround));
                this.b = n;
                this.r = n9;
                this.v = MathHelper.floor_double(this.i.posX * 32.0);
                this.d = MathHelper.floor_double(this.i.posY * 32.0);
                this.a = MathHelper.floor_double(this.i.posZ * 32.0);
                this.b();
                this.u = true;
            }
            n = MathHelper.f(ayj_0.t(this.i) * 256.0f / 360.0f);
            if (MathInvoker.a(n - this.o) >= 4) {
                this.a(new S19PacketEntityHeadLook(this.i, (byte)n));
                this.o = n;
            }
            this.i.p = false;
        }
        ++this.j;
        if (this.i.aa) {
            this.b(new S12PacketEntityVelocity(this.i));
            this.i.aa = false;
        }
    }

    public ae_2(Entity entity, int n, int n2, boolean bl) {
        this.i = entity;
        this.m = n;
        this.t = n2;
        this.g = bl;
        this.v = MathHelper.floor_double(entity.posX * 32.0);
        this.d = MathHelper.floor_double(entity.posY * 32.0);
        this.a = MathHelper.floor_double(entity.posZ * 32.0);
        this.b = MathHelper.f(entity.rotationYaw * 256.0f / 360.0f);
        this.r = MathHelper.f(entity.rotationPitch * 256.0f / 360.0f);
        this.o = MathHelper.f(ayj_0.t(entity) * 256.0f / 360.0f);
        this.s = entity.onGround;
    }

    public void a(Packet packet) {
        Iterator iterator = aS0.f(this.e);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
        }
    }

    public boolean b(EntityPlayerMP entityPlayerMP) {
        double d = entityPlayerMP.posX - (double)(this.v / 32);
        double d2 = entityPlayerMP.posZ - (double)(this.a / 32);
        return d >= (double)(-this.m) && d <= (double)this.m && d2 >= (double)(-this.m) && d2 <= (double)this.m && ayj_0.a(this.i, entityPlayerMP);
    }

    private void b() {
        a96 a962 = ayj_0.N(this.i);
        if (aom_0.d(a962)) {
            this.b(new S1CPacketEntityMetadata(ayj_0.B(this.i), a962, false));
        }
        if (this.i instanceof EntityLivingBase) {
            VB vB = (VB)atn_0.l((EntityLivingBase)this.i);
            Set set = xb_2.a(vB);
            if (!aS0.b(set)) {
                this.b(new S20PacketEntityProperties(ayj_0.B(this.i), set));
            }
            aS0.e(set);
        }
    }

    public boolean equals(Object object) {
        return object instanceof ae_2 && ayj_0.B(((ae_2)object).i) == ayj_0.B(this.i);
    }

    private Packet c() {
        if (this.i.isDead) {
            LoggerInvoker.warn(n, avh_0.b);
        }
        if (this.i instanceof og_0) {
            return new S0EPacketSpawnObject(this.i, 2, 1);
        }
        if (this.i instanceof EntityPlayerMP) {
            return new S0CPacketSpawnPlayer((EntityPlayer)this.i);
        }
        if (this.i instanceof EntityMinecart) {
            EntityMinecart entityMinecart = (EntityMinecart)this.i;
            return new S0EPacketSpawnObject(this.i, 10, afh_0.a(yw_2.c(entityMinecart)));
        }
        if (this.i instanceof EntityBoat) {
            return new S0EPacketSpawnObject(this.i, 1);
        }
        if (this.i instanceof UH) {
            this.o = MathHelper.f(ayj_0.t(this.i) * 256.0f / 360.0f);
            return new S0FPacketSpawnMob((EntityLivingBase)this.i);
        }
        if (this.i instanceof oo_1) {
            EntityPlayer entityPlayer = ((oo_1)this.i).ax;
            return new S0EPacketSpawnObject(this.i, 90, ayj_0.B(entityPlayer));
        }
        if (this.i instanceof EntityArrow) {
            Entity entity = ((EntityArrow)this.i).ak;
            return new S0EPacketSpawnObject(this.i, 60, ayj_0.B(entity));
        }
        if (this.i instanceof oq_2) {
            return new S0EPacketSpawnObject(this.i, 61);
        }
        if (this.i instanceof of_2) {
            return new S0EPacketSpawnObject(this.i, 73, yd_0.a((of_2)this.i));
        }
        if (this.i instanceof oz_1) {
            return new S0EPacketSpawnObject(this.i, 75);
        }
        if (this.i instanceof of_1) {
            return new S0EPacketSpawnObject(this.i, 65);
        }
        if (this.i instanceof o7_0) {
            return new S0EPacketSpawnObject(this.i, 72);
        }
        if (this.i instanceof oi_1) {
            return new S0EPacketSpawnObject(this.i, 76);
        }
        if (this.i instanceof oa_1) {
            oa_1 oa_12 = (oa_1)this.i;
            S0EPacketSpawnObject s0EPacketSpawnObject = null;
            int n = 63;
            if (this.i instanceof oG) {
                n = 64;
            } else if (this.i instanceof oe_1) {
                n = 66;
            }
            s0EPacketSpawnObject = oa_12.ak != null ? new S0EPacketSpawnObject(this.i, n, atn_0.h(((oa_1)this.i).ak)) : new S0EPacketSpawnObject(this.i, n, 0);
            nq_0.f(s0EPacketSpawnObject, (int)(oa_12.al * 8000.0));
            nq_0.c(s0EPacketSpawnObject, (int)(oa_12.ao * 8000.0));
            nq_0.e(s0EPacketSpawnObject, (int)(oa_12.aj * 8000.0));
            return s0EPacketSpawnObject;
        }
        if (this.i instanceof op_1) {
            return new S0EPacketSpawnObject(this.i, 62);
        }
        if (this.i instanceof od_1) {
            return new S0EPacketSpawnObject(this.i, 50);
        }
        if (this.i instanceof ox_2) {
            return new S0EPacketSpawnObject(this.i, 51);
        }
        if (this.i instanceof oq_1) {
            oq_1 oq_12 = (oq_1)this.i;
            return new S0EPacketSpawnObject(this.i, 70, BlocksInvoker.a(aei_0.b(oq_12)));
        }
        if (this.i instanceof ol_2) {
            return new S0EPacketSpawnObject(this.i, 78);
        }
        if (this.i instanceof nk_2) {
            return new S10PacketSpawnPainting((nk_2)this.i);
        }
        if (this.i instanceof no_2) {
            no_2 no_22 = (no_2)this.i;
            S0EPacketSpawnObject s0EPacketSpawnObject = new S0EPacketSpawnObject(this.i, 71, SJ.j(no_22.aj));
            BlockPos blockPos = yd_1.c(no_22);
            nq_0.g(s0EPacketSpawnObject, MathHelper.f(amv_2.j(blockPos) * 32));
            nq_0.a(s0EPacketSpawnObject, MathHelper.f(amv_2.h(blockPos) * 32));
            nq_0.b(s0EPacketSpawnObject, MathHelper.f(amv_2.i(blockPos) * 32));
            return s0EPacketSpawnObject;
        }
        if (this.i instanceof nn_1) {
            nn_1 nn_12 = (nn_1)this.i;
            S0EPacketSpawnObject s0EPacketSpawnObject = new S0EPacketSpawnObject(this.i, 77);
            BlockPos blockPos = ala_2.a(nn_12);
            nq_0.g(s0EPacketSpawnObject, MathHelper.f(amv_2.j(blockPos) * 32));
            nq_0.a(s0EPacketSpawnObject, MathHelper.f(amv_2.h(blockPos) * 32));
            nq_0.b(s0EPacketSpawnObject, MathHelper.f(amv_2.i(blockPos) * 32));
            return s0EPacketSpawnObject;
        }
        if (this.i instanceof oa_2) {
            return new S11PacketSpawnExperienceOrb((oa_2)this.i);
        }
        throw new IllegalArgumentException(aL0.a(aL0.a(aL0.a(new StringBuilder(), avh_0.a), this.i.getClass()), avh_0.c).toString());
    }

    public void d(EntityPlayerMP entityPlayerMP) {
        if (entityPlayerMP != this.i) {
            if (this.b(entityPlayerMP)) {
                if (!aS0.c(this.e, entityPlayerMP) && (this.a(entityPlayerMP) || this.i.ah)) {
                    Object object;
                    Object object2;
                    aS0.b(this.e, entityPlayerMP);
                    Packet packet = this.c();
                    qv_0.a(entityPlayerMP.playerNetServerHandler, packet);
                    if (!aom_0.b(ayj_0.N(this.i))) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S1CPacketEntityMetadata(ayj_0.B(this.i), ayj_0.N(this.i), true));
                    }
                    NBTTagCompound nBTTagCompound = ayj_0.k(this.i);
                    qv_0.a(entityPlayerMP.playerNetServerHandler, new S49PacketUpdateEntityNBT(ayj_0.B(this.i), nBTTagCompound));
                    if (this.i instanceof EntityLivingBase && !ms_0.c((Collection)(object2 = xb_2.b((VB)(object = (VB)atn_0.l((EntityLivingBase)this.i)))))) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S20PacketEntityProperties(ayj_0.B(this.i), (Collection<ahw_2>)object2));
                    }
                    this.h = this.i.motionX;
                    this.p = this.i.motionY;
                    this.c = this.i.motionZ;
                    if (this.g && !(packet instanceof S0FPacketSpawnMob)) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S12PacketEntityVelocity(ayj_0.B(this.i), this.i.motionX, this.i.motionY, this.i.motionZ));
                    }
                    if (this.i.r != null) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S1BPacketEntityAttach(0, this.i, this.i.r));
                    }
                    if (this.i instanceof nl_1 && CG.j((nl_1)this.i) != null) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S1BPacketEntityAttach(1, this.i, CG.j((nl_1)this.i)));
                    }
                    if (this.i instanceof EntityLivingBase) {
                        int n = 0;
                        while (true) {
                            object2 = atn_0.f((EntityLivingBase)this.i, n);
                            qv_0.a(entityPlayerMP.playerNetServerHandler, new S04PacketEntityEquipment(ayj_0.B(this.i), n, (ItemStack)object2));
                            ++n;
                        }
                    }
                    if (this.i instanceof EntityPlayer && a6w_0.v((EntityPlayer)(object = (EntityPlayer)this.i))) {
                        qv_0.a(entityPlayerMP.playerNetServerHandler, new S0APacketUseBed((EntityPlayer)object, new BlockPos(this.i)));
                    }
                    if (this.i instanceof EntityLivingBase) {
                        object = (EntityLivingBase)this.i;
                        object2 = ms_0.a(atn_0.n((EntityLivingBase)object));
                        while (dz_0.c((Iterator)object2)) {
                            a2l_0 a2l_02 = (a2l_0)dz_0.b((Iterator)object2);
                            qv_0.a(entityPlayerMP.playerNetServerHandler, new S1DPacketEntityEffect(ayj_0.B(this.i), a2l_02));
                        }
                    }
                }
            } else if (aS0.c(this.e, entityPlayerMP)) {
                aS0.a(this.e, entityPlayerMP);
                EntityPlayerInvoker.a(entityPlayerMP, this.i);
            }
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void c(EntityPlayerMP entityPlayerMP) {
        if (aS0.c(this.e, entityPlayerMP)) {
            EntityPlayerInvoker.a(entityPlayerMP, this.i);
            aS0.a(this.e, entityPlayerMP);
        }
    }

    public int hashCode() {
        return ayj_0.B(this.i);
    }

    public void a() {
        Iterator iterator = aS0.f(this.e);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            EntityPlayerInvoker.a(entityPlayerMP, this.i);
        }
    }

    private boolean a(EntityPlayerMP entityPlayerMP) {
        return aoc_0.a(a3V.i(EntityPlayerInvoker.b(entityPlayerMP)), entityPlayerMP, this.i.V, this.i.s);
    }

    public void e(EntityPlayerMP entityPlayerMP) {
        if (aS0.c(this.e, entityPlayerMP)) {
            aS0.a(this.e, entityPlayerMP);
            EntityPlayerInvoker.a(entityPlayerMP, this.i);
        }
    }
}

