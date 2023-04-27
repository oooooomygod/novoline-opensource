/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.entity;

import cc.novoline.events.Event;
import cc.novoline.events.events.EntityBouondingEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.visual.Camera;
import net.minecraft.network.packts.C03PacketPlayer;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.B7;
import net.Ba;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.ChatComponentText;
import net.CrashReport;
import deobf.EntityPlayerMP;
import deobf.EnumFacing;
import net.Freecam;
import net.H6;
import net.HX;
import net.HitBox;
import net.IBlockState;
import net.ICommandSender;
import net.Item;
import net.Material;
import net.MathHelper;
import net.NBTTagCompound;
import net.P8;
import net.SD;
import net.SJ;
import net.World;
import net.WorldServer;
import net.a2n_0;
import net.a3V;
import net.a5_0;
import net.a5s_0;
import net.a6w_0;
import net.a96;
import net.a9N;
import net.a9V;
import net.aAO;
import net.aD5;
import net.aDD;
import net.aDJ;
import net.aL0;
import net.aLF;
import net.aNE;
import net.aV8;
import net.aW9;
import net.aWT;
import net.aX7;
import net.aau_1;
import net.ab1_0;
import net.abu_0;
import net.act_2;
import net.aec_0;
import net.aek_1;
import net.ahq_0;
import net.ain_1;
import net.akm_1;
import net.alf_0;
import net.alf_2;
import net.amn_0;
import net.amv_2;
import net.an6_0;
import net.aom_0;
import net.aqj_0;
import net.ara_2;
import net.asz_0;
import net.auk_2;
import net.aum_1;
import net.aw0_0;
import net.awc_1;
import net.axq_2;
import net.axt_2;
import net.axx_1;
import net.db_0;
import net.dz_0;
import net.e0_0;
import net.g2_0;
import net.gv_2;
import net.h__0;
import net.hr_0;
import net.ka_0;
import net.kl_1;
import net.kv_0;
import net.minecraft.block.BlockAir;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.mu_1;
import net.og_0;
import net.ol_2;
import net.ou_2;
import net.qq_2;
import net.rm_2;
import net.tn_0;
import net.ub_1;
import net.uv_2;
import net.x__0;
import net.z6_0;
import net.skidunion.annotations;


public abstract class Entity
implements ICommandSender {
    @annotations
    public int hurtResistantTime;
    public int dimension;
    public int o;
    public boolean G;
    public double I = 1.0;
    public int y;
    public boolean g;
    private boolean R;
    public float ad;
    public int V;
    public boolean H;
    public float c;
    public float n = 1.8f;
    @annotations
    public double posY;
    @annotations
    public double lastTickPosZ;
    public Entity h;
    private int d = af++;
    private int Z;
    @annotations
    public double motionY;
    public float K;
    public boolean i;
    protected BlockPos w;
    public int M;
    public int D;
    public float u;
    protected boolean inPortal;
    public int s;
    public Entity r;
    private ab1_0 ac;
    protected boolean S;
    @annotations
    public double motionX;
    @annotations
    public float prevRotationYaw;
    protected int F;
    public int timeUntilPortal;
    public int ticksOffground;
    public float x;
    private int f = 1;
    private rm_2 q = ag;
    @annotations
    public float rotationPitch;
    public int t = 1;
    @annotations
    public double posX;
    public int ai;
    protected Vec3 ae;
    protected boolean L = true;
    private UUID k;
    private boolean C;
    @annotations
    public float rotationYaw;
    public float U;
    public int b;
    public boolean v;
    @annotations
    public double prevPosX;
    public float N;
    @annotations
    public boolean isDead;
    private double e;
    public float width = 0.6f;
    @annotations
    public float fallDistance;
    @annotations
    public double prevPosY;
    @annotations
    public double lastTickPosX;
    public boolean ah;
    @annotations
    public double motionZ;
    public boolean a;
    private double E;
    public World worldObj;
    public boolean Y;
    @annotations
    public double lastTickPosY;
    public boolean p;
    @annotations
    public int ticksExisted;
    private static rm_2 ag = new rm_2(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    @annotations
    public double prevPosZ;
    @annotations
    public float prevRotationPitch;
    @annotations
    public double posZ;
    public boolean aa;
    public boolean P;
    protected EnumFacing ab;
    protected boolean A;
    private static int af;
    protected a96 l;
    public float O;
    protected Random Q = new Random();
    public float X;
    @annotations
    public boolean onGround;
    protected boolean W;

    public void a(BlockPos blockPos, float f, float f2) {
        this.c((double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.5, f, f2);
    }

    public void ab() {
        if (this.h != null) {
            this.h.j(this.posX, this.posY + this.i() + this.h.H(), this.posZ);
        }
    }

    public void ak() {
        ProfilerInvoker.startSection(this.worldObj.A, aX7.ai);
        if (this.r != null && this.r.isDead) {
            this.r = null;
        }
        this.c = this.u;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.prevRotationPitch = this.rotationPitch;
        this.prevRotationYaw = this.rotationYaw;
        if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer) {
            ProfilerInvoker.startSection(this.worldObj.A, aX7.y);
            MinecraftServer minecraftServer = a3V.m((WorldServer)this.worldObj);
            int n = this.P();
            if (this.inPortal) {
                if (ServerInvoker.M(minecraftServer)) {
                    if (this.r == null && this.F++ >= n) {
                        this.F = n;
                        this.timeUntilPortal = this.L();
                        int n2 = qq_2.j(this.worldObj.d) == -1 ? 0 : -1;
                        this.f(n2);
                    }
                    this.inPortal = false;
                }
            } else {
                if (this.F > 0) {
                    this.F -= 4;
                }
                if (this.F < 0) {
                    this.F = 0;
                }
            }
            if (this.timeUntilPortal > 0) {
                --this.timeUntilPortal;
            }
            ProfilerInvoker.endSection(this.worldObj.A);
        }
        this.ap();
        this.G();
        if (this.worldObj.isRemote) {
            this.Z = 0;
        } else if (this.Z > 0) {
            if (this.S) {
                this.Z -= 4;
                if (this.Z < 0) {
                    this.Z = 0;
                }
            } else {
                if (this.Z % 20 == 0) {
                    this.a(DamageSource.d, 1.0f);
                }
                --this.Z;
            }
        }
        if (this.o()) {
            this.v();
            this.fallDistance *= 0.5f;
        }
        if (this.posY < -64.0) {
            this.Y();
        }
        if (!this.worldObj.isRemote) {
            this.a(0, this.Z > 0);
        }
        this.L = false;
        ProfilerInvoker.endSection(this.worldObj.A);
    }

    public void a(rm_2 rm_22) {
        this.q = rm_22;
    }

    @Override
    public boolean c() {
        return false;
    }

    public void ap() {
        if (this.isSprinting() && !this.isInWater()) {
            this.I();
        }
    }

    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
        if (this.fallDistance > 0.0f) {
            BlocksInvoker.a(block, this.worldObj, blockPos, this, this.fallDistance);
            this.fallDistance = 0.0f;
        }
    }

    public void a(float f, float f2, float f3) {
        float f4 = f * f + f2 * f2;
        if (f4 >= 1.0E-4f) {
            if ((f4 = MathHelper.g(f4)) < 1.0f) {
                f4 = 1.0f;
            }
            f4 = f3 / f4;
            float f5 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f);
            float f6 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f);
            this.motionX += (double)((f *= f4) * f6 - (f2 *= f4) * f5);
            this.motionZ += (double)(f2 * f6 + f * f5);
        }
    }

    public void a(CrashReportCategory crashReportCategory) {
        CrashReportCategoryInvoker.a(crashReportCategory, aX7.ah, this::lambda$addEntityCrashInfo$0);
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aX7.ak, P8.d(this.d));
        CrashReportCategoryInvoker.a(crashReportCategory, aX7.R, this::getName);
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aX7.aq, StringInvoker.a(aX7.ap, new Object[]{db_0.a(this.posX), db_0.a(this.posY), db_0.a(this.posZ)}));
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aX7.I, CrashReportCategoryInvoker.a(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)));
        CrashReportCategoryInvoker.addCrashSection(crashReportCategory, aX7.q, StringInvoker.a(aX7.ad, new Object[]{db_0.a(this.motionX), db_0.a(this.motionY), db_0.a(this.motionZ)}));
        CrashReportCategoryInvoker.a(crashReportCategory, aX7.f, this::lambda$addEntityCrashInfo$1);
        CrashReportCategoryInvoker.a(crashReportCategory, aX7.ar, this::lambda$addEntityCrashInfo$2);
    }

    protected void a(int n, boolean bl) {
        byte by = aom_0.g(this.l, 0);
        aom_0.b(this.l, 0, axt_2.a((byte)(by | 1 << n)));
    }

    protected boolean p() {
        return true;
    }

    protected String ad() {
        return ub_1.a(this);
    }

    public double H() {
        return 0.0;
    }

    public void moveEntity(double d, double d2, double d3) {
        block37: {
            block39: {
                block38: {
                    Block block;
                    Object object;
                    double d4;
                    rm_2 rm_22;
                    Object object2;
                    block36: {
                        if (!this.H) break block36;
                        this.a(h__0.b(this.getEntityBoundingBox(), d, d2, d3));
                        this.s();
                        break block37;
                    }
                    ProfilerInvoker.startSection(this.worldObj.A, aX7.u);
                    double d5 = this.posX;
                    double d6 = this.posY;
                    double d7 = this.posZ;
                    if (this.A) {
                        this.A = false;
                        d *= 0.25;
                        d2 *= (double)0.05f;
                        d3 *= 0.25;
                        this.motionX = 0.0;
                        this.motionY = 0.0;
                        this.motionZ = 0.0;
                    }
                    double d8 = d;
                    double d9 = d2;
                    double d10 = d3;
                    SafeWalk safeWalk = (SafeWalk)ModuleInvoker.isEnable(ModuleRegistry.SAFEWALK);
                    boolean bl = this instanceof EntityPlayer && this.onGround && this.isSneaking();
                    boolean bl2 = this instanceof EntityPlayerSP && aau_1.c(safeWalk) && aau_1.a(safeWalk) && aau_1.b(safeWalk);
                    double d11 = 0.05;
                    while (d != 0.0 && ListInvoker.isEmpty(aV8.b(this.worldObj, this, h__0.b(this.getEntityBoundingBox(), d, -1.0, 0.0)))) {
                        d = d < d11 && d >= -d11 ? 0.0 : (d > 0.0 ? (d -= d11) : (d += d11));
                        d8 = d;
                    }
                    while (d3 != 0.0 && ListInvoker.isEmpty(aV8.b(this.worldObj, this, h__0.b(this.getEntityBoundingBox(), 0.0, -1.0, d3)))) {
                        d3 = d3 < d11 && d3 >= -d11 ? 0.0 : (d3 > 0.0 ? (d3 -= d11) : (d3 += d11));
                        d10 = d3;
                    }
                    while (d != 0.0 && d3 != 0.0 && ListInvoker.isEmpty(aV8.b(this.worldObj, this, h__0.b(this.getEntityBoundingBox(), d, -1.0, d3)))) {
                        d = d < d11 && d >= -d11 ? 0.0 : (d > 0.0 ? (d -= d11) : (d += d11));
                        d8 = d;
                        d3 = d3 < d11 && d3 >= -d11 ? 0.0 : (d3 > 0.0 ? (d3 -= d11) : (d3 += d11));
                        d10 = d3;
                    }
                    List list = aV8.b(this.worldObj, this, h__0.a(this.getEntityBoundingBox(), d, d2, d3));
                    rm_2 rm_23 = this.getEntityBoundingBox();
                    Iterator iterator = ListInvoker.iterator(list);
                    while (dz_0.c(iterator)) {
                        object2 = (rm_2)dz_0.b(iterator);
                        d2 = h__0.a((rm_2)object2, this.getEntityBoundingBox(), d2);
                    }
                    this.a(h__0.b(this.getEntityBoundingBox(), 0.0, d2, 0.0));
                    boolean bl3 = this.onGround || d9 != d2 && d9 < 0.0;
                    object2 = ListInvoker.iterator(list);
                    while (dz_0.c((Iterator)object2)) {
                        rm_22 = (rm_2)dz_0.b((Iterator)object2);
                        d = h__0.b(rm_22, this.getEntityBoundingBox(), d);
                    }
                    this.a(h__0.b(this.getEntityBoundingBox(), d, 0.0, 0.0));
                    object2 = ListInvoker.iterator(list);
                    while (dz_0.c((Iterator)object2)) {
                        rm_22 = (rm_2)dz_0.b((Iterator)object2);
                        d3 = h__0.c(rm_22, this.getEntityBoundingBox(), d3);
                    }
                    this.a(h__0.b(this.getEntityBoundingBox(), 0.0, 0.0, d3));
                    if (this.U > 0.0f && (d8 != d || d10 != d3)) {
                        object2 = new EntityBouondingEvent(aW9.PROCESS);
                        EventManagerInvoker.call((Event)object2);
                        if (!SD.a((EntityBouondingEvent)object2)) {
                            double d12 = d;
                            double d13 = d2;
                            d4 = d3;
                            object = this.getEntityBoundingBox();
                            this.a(rm_23);
                            d2 = this.U;
                            List list2 = aV8.b(this.worldObj, this, h__0.a(this.getEntityBoundingBox(), d8, d2, d10));
                            rm_2 rm_24 = this.getEntityBoundingBox();
                            rm_2 rm_25 = h__0.a(rm_24, d8, 0.0, d10);
                            double d14 = d2;
                            Iterator iterator2 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator2)) {
                                rm_2 rm_26 = (rm_2)dz_0.b(iterator2);
                                d14 = h__0.a(rm_26, rm_25, d14);
                            }
                            rm_24 = h__0.b(rm_24, 0.0, d14, 0.0);
                            double d15 = d8;
                            Iterator iterator3 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator3)) {
                                rm_2 rm_27 = (rm_2)dz_0.b(iterator3);
                                d15 = h__0.b(rm_27, rm_24, d15);
                            }
                            rm_24 = h__0.b(rm_24, d15, 0.0, 0.0);
                            double d16 = d10;
                            Object object3 = ListInvoker.iterator(list2);
                            while (dz_0.c((Iterator)object3)) {
                                rm_2 rm_28 = (rm_2)dz_0.b((Iterator)object3);
                                d16 = h__0.c(rm_28, rm_24, d16);
                            }
                            rm_24 = h__0.b(rm_24, 0.0, 0.0, d16);
                            object3 = this.getEntityBoundingBox();
                            double d17 = d2;
                            Iterator iterator4 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator4)) {
                                rm_2 rm_29 = (rm_2)dz_0.b(iterator4);
                                d17 = h__0.a(rm_29, (rm_2)object3, d17);
                            }
                            object3 = h__0.b((rm_2)object3, 0.0, d17, 0.0);
                            double d18 = d8;
                            Iterator iterator5 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator5)) {
                                rm_2 rm_210 = (rm_2)dz_0.b(iterator5);
                                d18 = h__0.b(rm_210, (rm_2)object3, d18);
                            }
                            object3 = h__0.b((rm_2)object3, d18, 0.0, 0.0);
                            double d19 = d10;
                            Iterator iterator6 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator6)) {
                                rm_2 rm_211 = (rm_2)dz_0.b(iterator6);
                                d19 = h__0.c(rm_211, (rm_2)object3, d19);
                            }
                            object3 = h__0.b((rm_2)object3, 0.0, 0.0, d19);
                            double d20 = d15 * d15 + d16 * d16;
                            double d21 = d18 * d18 + d19 * d19;
                            if (d20 > d21) {
                                d = d15;
                                d3 = d16;
                                d2 = -d14;
                                this.a(rm_24);
                            } else {
                                d = d18;
                                d3 = d19;
                                d2 = -d17;
                                this.a((rm_2)object3);
                            }
                            Iterator iterator7 = ListInvoker.iterator(list2);
                            while (dz_0.c(iterator7)) {
                                rm_2 rm_212 = (rm_2)dz_0.b(iterator7);
                                d2 = h__0.a(rm_212, this.getEntityBoundingBox(), d2);
                            }
                            this.a(h__0.b(this.getEntityBoundingBox(), 0.0, d2, 0.0));
                            if (d12 * d12 + d4 * d4 >= d * d + d3 * d3) {
                                d = d12;
                                d2 = d13;
                                d3 = d4;
                                this.a((rm_2)object);
                            } else if (this instanceof EntityPlayerSP) {
                                EventManagerInvoker.call(new EntityBouondingEvent(aW9.CONFIRM));
                            }
                        }
                    }
                    ProfilerInvoker.endSection(this.worldObj.A);
                    ProfilerInvoker.startSection(this.worldObj.A, aX7.B);
                    this.s();
                    this.g = d8 != d || d10 != d3;
                    this.v = d9 != d2;
                    this.Y = this.onGround;
                    this.onGround = this.v && d9 < 0.0;
                    this.b = this.onGround ? this.b + 1 : 0;
                    this.D = this.ticksOffground;
                    this.ticksOffground = this.onGround ? 0 : this.ticksOffground + 1;
                    this.i = this.g || this.v;
                    int n = MathHelper.floor_double(this.posX);
                    int n2 = MathHelper.floor_double(this.posY - (double)0.2f);
                    int n3 = MathHelper.floor_double(this.posZ);
                    BlockPos blockPos = new BlockPos(n, n2, n3);
                    Block block2 = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos));
                    if (BlocksInvoker.getBlockState(block2) == Material.air && ((block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos)))) instanceof g2_0 || block instanceof hr_0 || block instanceof gv_2)) {
                        block2 = block;
                        blockPos = amv_2.g(blockPos);
                    }
                    this.a(d2, this.onGround, block2, blockPos);
                    if (d8 != d) {
                        this.motionX = 0.0;
                    }
                    if (d10 != d3) {
                        this.motionZ = 0.0;
                    }
                    if (d9 != d2) {
                        BlocksInvoker.a(block2, this.worldObj, this);
                    }
                    if (this.p() && this.r == null || this instanceof EntityPlayerSP) {
                        d4 = this.posX - d5;
                        double d22 = this.posY - d6;
                        double d23 = this.posZ - d7;
                        if (block2 != Blocks.bm) {
                            d22 = 0.0;
                        }
                        if (this.onGround) {
                            BlocksInvoker.a(block2, this.worldObj, blockPos, this);
                        }
                        this.u = (float)((double)this.u + (double)MathHelper.e(d4 * d4 + d23 * d23) * 0.6);
                        this.x = (float)((double)this.x + (double)MathHelper.e(d4 * d4 + d22 * d22 + d23 * d23) * 0.6);
                        if (this.x > (float)this.f && BlocksInvoker.getBlockState(block2) != Material.air) {
                            this.f = (int)this.x + 1;
                            if (this.isInWater()) {
                                float f = MathHelper.e(this.motionX * this.motionX * (double)0.2f + this.motionY * this.motionY + this.motionZ * this.motionZ * (double)0.2f) * 0.35f;
                                if (f > 1.0f) {
                                    f = 1.0f;
                                }
                                this.a(this.c(), f, 1.0f + (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.4f);
                            }
                            this.a(blockPos, block2);
                        }
                    }
                    try {
                        this.U();
                        boolean bl4 = this.am();
                    }
                    catch (Throwable throwable) {
                        CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aX7.x);
                        object = CrashInvoker.a(crashReport, aX7.ag);
                        this.a((CrashReportCategory)object);
                        throw new ReportedException(crashReport);
                    }
                    if (!aV8.a(this.worldObj, h__0.c(this.getEntityBoundingBox(), 0.001, 0.001, 0.001))) break block38;
                    this.e(1);
                    ++this.Z;
                    if (this.Z == 0) {
                        this.a(8);
                    }
                    break block39;
                }
                if (this.Z <= 0) {
                    this.Z = -this.t;
                }
            }
            if (this.Z > 0) {
                this.a(aX7.l, 0.7f, 1.6f + (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.4f);
                this.Z = -this.t;
            }
            ProfilerInvoker.endSection(this.worldObj.A);
        }
    }

    public double a(double d) {
        double d2 = this.posY - d;
        return MathHelper.e(d2 * d2);
    }

    public ItemStack[] ae() {
        return null;
    }

    public rm_2 as() {
        return null;
    }

    public og_0 a(Item item, int n, float f) {
        return this.a(new ItemStack(item, n, 0), f);
    }

    public void c(boolean bl) {
        aom_0.b(this.l, 4, axt_2.a((byte)1));
    }

    @Override
    public void a(a9N a9N2, int n) {
        aqj_0.a(this.ac, this, a9N2, n);
    }

    @Override
    public World d() {
        return this.worldObj;
    }

    protected abstract void b(NBTTagCompound var1);

    public double c(BlockPos blockPos) {
        return amv_2.b(blockPos, this.posX, this.posY, this.posZ);
    }

    public void e(float f) {
    }

    public void a(EntityLivingBase entityLivingBase) {
    }

    public double g(Entity entity) {
        double d = this.posX - entity.posX;
        double d2 = this.posY - entity.posY;
        double d3 = this.posZ - entity.posZ;
        return d * d + d2 * d2 + d3 * d3;
    }

    public int d(float f) {
        BlockPos blockPos = new BlockPos(this.posX, this.posY + (double)this.w(), this.posZ);
        return aV8.isBlockLoaded(this.worldObj, blockPos) ? aV8.a(this.worldObj, blockPos, 0) : 0;
    }

    @Override
    public Entity a() {
        return this;
    }

    public boolean b(Entity entity) {
        return false;
    }

    public boolean isRiding() {
        return this.r != null;
    }

    public Vec3 B() {
        return this.ae;
    }

    public boolean isInWater() {
        return this.W;
    }

    public void G() {
        if (aV8.a(this.worldObj, h__0.c(h__0.d(this.getEntityBoundingBox(), 0.0, -0.4f, 0.0), 0.001, 0.001, 0.001), Material.M, this)) {
            if (!this.W && !this.L) {
                this.F();
            }
            this.fallDistance = 0.0f;
            this.W = true;
            this.Z = 0;
        } else {
            this.W = false;
        }
    }

    protected void F() {
        float f;
        float f2;
        float f3 = MathHelper.e(this.motionX * this.motionX * (double)0.2f + this.motionY * this.motionY + this.motionZ * this.motionZ * (double)0.2f) * 0.2f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.a(this.z(), f3, 1.0f + (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.4f);
        float f4 = MathHelper.floor_double(this.getEntityBoundingBox().a);
        int n = 0;
        while ((float)n < 1.0f + this.width * 20.0f) {
            f2 = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width;
            f = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width;
            aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX + (double)f2, f4 + 1.0f, this.posZ + (double)f, this.motionX, this.motionY - (double)(a5_0.e(this.Q) * 0.2f), this.motionZ, new int[0]);
            ++n;
        }
        n = 0;
        while ((float)n < 1.0f + this.width * 20.0f) {
            f2 = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width;
            f = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width;
            aV8.a(this.worldObj, B7.WATER_SPLASH, this.posX + (double)f2, f4 + 1.0f, this.posZ + (double)f, this.motionX, this.motionY, this.motionZ, new int[0]);
            ++n;
        }
    }

    protected void v() {
        if (!this.S) {
            this.a(DamageSource.k, 4.0f);
            this.a(15);
        }
    }

    @Override
    public void addChatComponentMessage(IChatComponent iChatComponent) {
    }

    public void a(String string) {
        aom_0.b(this.l, 2, string);
    }

    public float a(Entity entity) {
        float f = (float)(this.posX - entity.posX);
        float f2 = (float)(this.posY - entity.posY);
        float f3 = (float)(this.posZ - entity.posZ);
        return MathHelper.g(f * f + f2 * f2 + f3 * f3);
    }

    public int av() {
        return aom_0.e(this.l, 1);
    }

    public void f(int n) {
        if (!this.worldObj.isRemote && !this.isDead) {
            ProfilerInvoker.startSection(this.worldObj.A, aX7.F);
            MinecraftServer minecraftServer = ServerInvoker.d();
            int n2 = this.dimension;
            WorldServer worldServer = ServerInvoker.a(minecraftServer, n2);
            WorldServer worldServer2 = ServerInvoker.a(minecraftServer, n);
            this.dimension = n;
            if (n2 == 1 && n == 1) {
                worldServer2 = ServerInvoker.a(minecraftServer, 0);
                this.dimension = 0;
            }
            aV8.c(this.worldObj, this);
            this.isDead = false;
            ProfilerInvoker.startSection(this.worldObj.A, aX7.Q);
            aek_1.a(ServerInvoker.R(minecraftServer), this, n2, worldServer, worldServer2);
            ProfilerInvoker.a(this.worldObj.A, aX7.J);
            Entity entity = ub_1.a(ub_1.a(this), (World)worldServer2);
            entity.j(this);
            if (n2 == 1 && n == 1) {
                BlockPos blockPos = aV8.a(this.worldObj, a3V.c(worldServer2));
                entity.a(blockPos, entity.rotationYaw, entity.rotationPitch);
            }
            a3V.c(worldServer2, entity);
            this.isDead = true;
            ProfilerInvoker.endSection(this.worldObj.A);
            a3V.u(worldServer);
            a3V.u(worldServer2);
            ProfilerInvoker.endSection(this.worldObj.A);
        }
    }

    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox());
        if (db_0.f(d2)) {
            d2 = 1.0;
        }
        return d < (d2 = d2 * 64.0 * this.I) * d2;
    }

    public void D() {
        this.prevPosX = this.posX;
        this.prevPosZ = this.posZ;
    }

    public void a(int n) {
        int n2 = n * 20;
        if (this.Z < (n2 = e0_0.a(this, n2))) {
            this.Z = n2;
        }
    }

    @Override
    public boolean a(int n, String string) {
        return true;
    }

    public Vec3 an() {
        return null;
    }

    @Override
    @annotations
    public String getName() {
        if (this.e()) {
            return this.y();
        }
        String string = ub_1.a(this);
        string = aX7.ax;
        return ahq_0.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), aX7.j), string), aX7.d).toString());
    }

    public void g(int n) {
    }

    public boolean aq() {
        BlockPos blockPos;
        int n = (int)(this.posY - 1.0);
        while (BlockStateInvoker.getBlock(BlockInvoker.getMaterial(MCInvoker.f().world, blockPos = new BlockPos(this.posX, (double)n, this.posZ))) instanceof BlockAir) {
            --n;
        }
        return true;
    }

    public boolean a(aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState, float f) {
        return true;
    }

    public float A() {
        HitBox hitBox = (HitBox)ModuleInvoker.isEnable(ModuleRegistry.HITBOX);
        if (a5s_0.b(hitBox) && !(this instanceof ol_2)) {
            return axx_1.a((Float)a9V.a(a5s_0.a(hitBox)));
        }
        return 0.1f;
    }

    public boolean R() {
        return this.aA();
    }

    public boolean aa() {
        return false;
    }

    public double c(Entity entity) {
        double d = MathInvoker.a(entity.posX - this.posX);
        double d2 = MathInvoker.a(entity.posZ - this.posZ);
        return MathInvoker.d(d * d + d2 * d2);
    }

    public boolean af() {
        return true;
    }

    protected void I() {
        int n;
        int n2;
        int n3 = MathHelper.floor_double(this.posX);
        BlockPos blockPos = new BlockPos(n3, n2 = MathHelper.floor_double(this.posY - (double)0.2f), n = MathHelper.floor_double(this.posZ));
        IBlockState iBlockState = aV8.q(this.worldObj, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (BlocksInvoker.y(block) != -1) {
            aV8.a(this.worldObj, B7.BLOCK_CRACK, this.posX + ((double)a5_0.e(this.Q) - 0.5) * (double)this.width, this.getEntityBoundingBox().a + 0.1, this.posZ + ((double)a5_0.e(this.Q) - 0.5) * (double)this.width, -this.motionX * 4.0, 1.5, -this.motionZ * 4.0, new int[]{BlocksInvoker.a(iBlockState)});
        }
    }

    public void f(boolean bl) {
        this.R = bl;
    }

    public boolean aA() {
        return aom_0.g(this.l, 3) == 1;
    }

    public boolean c(double d, double d2, double d3) {
        rm_2 rm_22 = h__0.b(this.getEntityBoundingBox(), d, d2, d3);
        return this.b(rm_22);
    }

    protected void a(EntityLivingBase entityLivingBase, Entity entity) {
        if (entity instanceof EntityLivingBase) {
            alf_0.b((EntityLivingBase)entity, entityLivingBase);
        }
        alf_0.a(entityLivingBase, entity);
    }

    public void e(boolean bl) {
        this.a(1, bl);
    }

    public boolean a(DamageSource damageSource, float f) {
        if (!this.a(damageSource)) {
            this.k();
        }
        return false;
    }

    public boolean isSprinting() {
        return this.c(3);
    }

    public boolean o() {
        return aV8.b(this.worldObj, h__0.d(this.getEntityBoundingBox(), -0.1f, -0.4f, -0.1f), Material.e);
    }

    @Override
    @annotations
    public IChatComponent getDisplayName() {
        ChatComponentText chatComponentText = new ChatComponentText(this.getName());
        HX.a(axq_2.b(chatComponentText), this.h());
        HX.a(axq_2.b(chatComponentText), this.J().toString());
        return chatComponentText;
    }

    public void a(World world) {
        this.worldObj = world;
    }

    public void c(int n, ItemStack itemStack) {
    }

    protected String z() {
        return aX7.g;
    }

    public void b(double d, double d2, double d3, float f, float f2) {
        this.prevPosX = this.posX = d;
        this.prevPosY = this.posY = d2;
        this.prevPosZ = this.posZ = d3;
        this.prevRotationYaw = this.rotationYaw = f;
        this.prevRotationPitch = this.rotationPitch = f2;
        double d4 = this.prevRotationYaw - f;
        if (d4 < -180.0) {
            this.prevRotationYaw += 360.0f;
        }
        if (d4 >= 180.0) {
            this.prevRotationYaw -= 360.0f;
        }
        this.j(this.posX, this.posY, this.posZ);
        this.d(f, f2);
    }

    public double a(C03PacketPlayer c03PacketPlayer) {
        return MathInvoker.e(ka_0.d(c03PacketPlayer) - this.prevPosX, ka_0.c(c03PacketPlayer) - this.prevPosZ);
    }

    protected void e(int n) {
        if (!this.S) {
            this.a(DamageSource.b, (float)n);
        }
    }

    public void d(int n) {
        aom_0.b(this.l, 1, aWT.b((short)n));
    }

    public void b(float f, float f2) {
        if (this.h != null) {
            this.h.b(f, f2);
        }
    }

    public UUID az() {
        return this.k;
    }

    private String lambda$addEntityCrashInfo$2() throws Exception {
        return this.r.toString();
    }

    @Override
    public BlockPos e() {
        return new BlockPos(this.posX, this.posY + 0.5, this.posZ);
    }

    protected amn_0 h() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        String string = ub_1.a(this);
        tn_0.a(nBTTagCompound, aX7.at, this.J().toString());
        tn_0.a(nBTTagCompound, aX7.aa, string);
        tn_0.a(nBTTagCompound, aX7.U, this.getName());
        return new amn_0(H6.SHOW_ENTITY, new ChatComponentText(nBTTagCompound.toString()));
    }

    public double h(double d, double d2, double d3) {
        double d4 = this.posX - d;
        double d5 = this.posY - d2;
        double d6 = this.posZ - d3;
        return MathHelper.e(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public og_0 a(ItemStack itemStack, float f) {
        if (itemStack.a != 0 && act_2.k(itemStack) != null) {
            og_0 og_02 = new og_0(this.worldObj, this.posX, this.posY + (double)f, this.posZ, itemStack);
            aec_0.b(og_02);
            aV8.b(this.worldObj, og_02);
            return og_02;
        }
        return null;
    }

    public rm_2 l(Entity entity) {
        return null;
    }

    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.j(d, d2, d3);
        this.d(f, f2);
        List list = aV8.b(this.worldObj, this, h__0.c(this.getEntityBoundingBox(), 0.03125, 0.0, 0.03125));
        if (!ListInvoker.isEmpty(list)) {
            double d4 = 0.0;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                rm_2 rm_22 = (rm_2)dz_0.b(iterator);
                if (!(rm_22.c > d4)) continue;
                d4 = rm_22.c;
            }
            this.j(d, d2 += d4 - this.getEntityBoundingBox().a, d3);
        }
    }

    public boolean am() {
        return this.W || aV8.s(this.worldObj, new BlockPos(this.posX, this.posY, this.posZ)) || aV8.s(this.worldObj, new BlockPos(this.posX, this.posY + (double)this.n, this.posZ));
    }

    protected abstract void g();

    public boolean Q() {
        return aom_0.g(this.l, 4) == 1;
    }

    public void c(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2;
        block7: {
            block6: {
                try {
                    tn_0.a(nBTTagCompound, aX7.V, this.a(new double[]{this.posX, this.posY, this.posZ}));
                    tn_0.a(nBTTagCompound, aX7.N, this.a(new double[]{this.motionX, this.motionY, this.motionZ}));
                    tn_0.a(nBTTagCompound, aX7.ab, this.a(new float[]{this.rotationYaw, this.rotationPitch}));
                    tn_0.a(nBTTagCompound, aX7.as, this.fallDistance);
                    tn_0.a(nBTTagCompound, aX7.al, (short)this.Z);
                    tn_0.a(nBTTagCompound, aX7.p, (short)this.av());
                    tn_0.a(nBTTagCompound, aX7.M, this.onGround);
                    tn_0.b(nBTTagCompound, aX7.z, this.dimension);
                    tn_0.a(nBTTagCompound, aX7.av, this.C);
                    tn_0.b(nBTTagCompound, aX7.af, this.timeUntilPortal);
                    tn_0.a(nBTTagCompound, aX7.K, awc_1.b(this.J()));
                    tn_0.a(nBTTagCompound, aX7.A, awc_1.a(this.J()));
                    if (this.y() == null || StringInvoker.c(this.y()) <= 0) break block6;
                }
                catch (Throwable throwable) {
                    CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aX7.aw);
                    CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aX7.ae);
                    this.a(crashReportCategory);
                    throw new ReportedException(crashReport);
                }
                tn_0.a(nBTTagCompound, aX7.r, this.y());
                tn_0.a(nBTTagCompound, aX7.ac, this.aA());
            }
            aqj_0.b(this.ac, nBTTagCompound);
            if (!this.Q()) break block7;
            tn_0.a(nBTTagCompound, aX7.au, this.Q());
        }
        this.b(nBTTagCompound);
        if (this.r != null && this.r.a(nBTTagCompound2 = new NBTTagCompound())) {
            tn_0.a(nBTTagCompound, aX7.an, (NBTBase)nBTTagCompound2);
        }
    }

    public og_0 a(Item item, int n) {
        return this.a(item, n, 0.0f);
    }

    public double a(C03PacketPlayer c03PacketPlayer, double d, double d2) {
        return MathInvoker.e(ka_0.d(c03PacketPlayer) - d, ka_0.c(c03PacketPlayer) - d2);
    }

    public double d(double d, double d2, double d3) {
        double d4 = this.posX - d;
        double d5 = this.posY - d2;
        double d6 = this.posZ - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    @Override
    public Vec3 b() {
        return new Vec3(this.posX, this.posY, this.posZ);
    }

    public boolean n() {
        return !this.isDead;
    }

    public boolean b(EntityPlayer entityPlayer) {
        return false;
    }

    public boolean isInsideOfMaterial(Material material) {
        double d = this.posY + (double)this.w();
        BlockPos blockPos = new BlockPos(this.posX, d, this.posZ);
        IBlockState iBlockState = aV8.q(this.worldObj, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (BlocksInvoker.getBlockState(block) == material) {
            float f = mu_1.a(BlocksInvoker.c(BlockStateInvoker.getBlock(iBlockState), iBlockState)) - 0.11111111f;
            float f2 = (float)(amv_2.h(blockPos) + 1) - f;
            return d < (double)f2;
        }
        return false;
    }

    private void s() {
        this.posX = (this.getEntityBoundingBox().e + this.getEntityBoundingBox().b) / 2.0;
        this.posY = this.getEntityBoundingBox().a;
        this.posZ = (this.getEntityBoundingBox().f + this.getEntityBoundingBox().d) / 2.0;
    }

    public void a(ou_2 ou_22) {
        this.a(DamageSource.v, 5.0f);
        ++this.Z;
        if (this.Z == 0) {
            this.a(8);
        }
    }

    public float w() {
        return this.n * 0.85f;
    }

    public EnumFacing al() {
        return SJ.b(MathHelper.floor_double((double)(this.rotationYaw * 4.0f / 360.0f) + 0.5) & 3);
    }

    public boolean a(NBTTagCompound nBTTagCompound) {
        String string = this.ad();
        if (!this.isDead) {
            tn_0.a(nBTTagCompound, aX7.Y, string);
            this.c(nBTTagCompound);
            return true;
        }
        return false;
    }

    protected void k() {
        this.aa = true;
    }

    public boolean equals(Object object) {
        return object instanceof Entity && ((Entity)object).d == this.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void d(BlockPos blockPos) {
        if (this.timeUntilPortal > 0) {
            this.timeUntilPortal = this.L();
        } else {
            if (!this.worldObj.isRemote && !blockPos.equals(this.w)) {
                this.w = blockPos;
                x__0 x__02 = abu_0.b(Blocks.h, this.worldObj, blockPos);
                double d = SJ.h(a2n_0.d(x__02)) == kl_1.X ? (double)amv_2.i(a2n_0.c(x__02)) : (double)amv_2.j(a2n_0.c(x__02));
                double d2 = SJ.h(a2n_0.d(x__02)) == kl_1.X ? this.posZ : this.posX;
                d2 = MathInvoker.a(MathHelper.c(d2 - (double)(SJ.e(SJ.l(a2n_0.d(x__02))) == asz_0.NEGATIVE ? 1 : 0), d, d - (double)a2n_0.a(x__02)));
                double d3 = MathHelper.c(this.posY - 1.0, (double)amv_2.h(a2n_0.c(x__02)), (double)(amv_2.h(a2n_0.c(x__02)) - a2n_0.b(x__02)));
                this.ae = new Vec3(d2, d3, 0.0);
                this.ab = a2n_0.d(x__02);
            }
            this.inPortal = true;
        }
    }

    public double a(double d, double d2) {
        double d3 = this.posX - d;
        double d4 = this.posZ - d2;
        return MathHelper.e(d3 * d3 + d4 * d4);
    }

    public a96 t() {
        return this.l;
    }

    public Vec3 a(float f) {
        return this.a(this.rotationPitch, this.rotationYaw);
    }

    protected String c() {
        return aX7.az;
    }

    public void a(UUID uUID) {
        this.k = uUID;
    }

    protected boolean c(int n) {
        return (aom_0.g(this.l, 0) & 1 << n) != 0;
    }

    protected void U() {
        BlockPos blockPos = new BlockPos(this.getEntityBoundingBox().e + 0.001, this.getEntityBoundingBox().a + 0.001, this.getEntityBoundingBox().f + 0.001);
        BlockPos blockPos2 = new BlockPos(this.getEntityBoundingBox().b - 0.001, this.getEntityBoundingBox().c - 0.001, this.getEntityBoundingBox().d - 0.001);
        if (aV8.b(this.worldObj, blockPos, blockPos2)) {
            for (int i = amv_2.j(blockPos); i <= amv_2.j(blockPos2); ++i) {
                for (int j = amv_2.h(blockPos); j <= amv_2.h(blockPos2); ++j) {
                    for (int k = amv_2.i(blockPos); k <= amv_2.i(blockPos2); ++k) {
                        BlockPos blockPos3 = new BlockPos(i, j, k);
                        IBlockState iBlockState = aV8.q(this.worldObj, blockPos3);
                        try {
                            BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this.worldObj, blockPos3, iBlockState, this);
                            continue;
                        }
                        catch (Throwable throwable) {
                            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, aX7.m);
                            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, aX7.n);
                            CrashReportCategoryInvoker.a(crashReportCategory, blockPos3, iBlockState);
                            throw new ReportedException(crashReport);
                        }
                    }
                }
            }
        }
    }

    public void E() {
        this.isDead = true;
    }

    public void d(Entity entity) {
        this.c(entity.posX, entity.posY, entity.posZ, entity.rotationYaw, entity.rotationPitch);
    }

    public double b(BlockPos blockPos) {
        double d = this.posX - (double)amv_2.j(blockPos);
        double d2 = this.posY - (double)amv_2.h(blockPos);
        double d3 = this.posZ - (double)amv_2.i(blockPos);
        return MathHelper.e(d * d + d2 * d2 + d3 * d3);
    }

    public float a(aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState) {
        return BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), this);
    }

    public Vec3 c(float f) {
        if (f == 1.0f) {
            return new Vec3(this.posX, this.posY + (double)this.w(), this.posZ);
        }
        double d = this.prevPosX + (this.posX - this.prevPosX) * (double)f;
        double d2 = this.prevPosY + (this.posY - this.prevPosY) * (double)f + (double)this.w();
        double d3 = this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f;
        return new Vec3(d, d2, d3);
    }

    protected NBTTagList a(double ... dArray) {
        NBTTagList nBTTagList = new NBTTagList();
        for (double d : dArray) {
            kv_0.a(nBTTagList, new aD5(d));
        }
        return nBTTagList;
    }

    public boolean a(EntityPlayer entityPlayer, Vec3 vec3) {
        return false;
    }

    public boolean aw() {
        return this.R;
    }

    protected void m() {
        if (this.worldObj != null) {
            while (this.posY > 0.0 && this.posY < 256.0) {
                this.j(this.posX, this.posY, this.posZ);
                if (ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox()))) break;
                this.posY += 1.0;
            }
            this.motionZ = 0.0;
            this.motionY = 0.0;
            this.motionX = 0.0;
            this.rotationPitch = 0.0f;
        }
    }

    protected void c(float f, float f2) {
        if (f != this.width || f2 != this.n) {
            float f3 = this.width;
            this.width = f;
            this.n = f2;
            this.a(new rm_2(this.getEntityBoundingBox().e, this.getEntityBoundingBox().a, this.getEntityBoundingBox().f, this.getEntityBoundingBox().e + (double)this.width, this.getEntityBoundingBox().a + (double)this.n, this.getEntityBoundingBox().f + (double)this.width));
            if (this.width > f3 && !this.L && !this.worldObj.isRemote) {
                this.moveEntity(f3 - this.width, 0.0, f3 - this.width);
            }
        }
    }

    public boolean aC() {
        return this.c(4);
    }

    public boolean i(Entity entity) {
        return this == entity;
    }

    public boolean e() {
        return StringInvoker.c(aom_0.d(this.l, 2)) > 0;
    }

    private boolean b(rm_2 rm_22) {
        return ListInvoker.isEmpty(aV8.b(this.worldObj, this, rm_22)) && !aV8.b(this.worldObj, rm_22);
    }

    public void e(NBTTagCompound nBTTagCompound) {
        block16: {
            block15: {
                block14: {
                    Object object;
                    NBTTagList nBTTagList;
                    block13: {
                        block12: {
                            block11: {
                                Object object2;
                                try {
                                    nBTTagList = tn_0.c(nBTTagCompound, aX7.aj, 6);
                                    object2 = tn_0.c(nBTTagCompound, aX7.s, 6);
                                    object = tn_0.c(nBTTagCompound, aX7.am, 5);
                                    this.motionX = kv_0.d((NBTTagList)object2, 0);
                                    this.motionY = kv_0.d((NBTTagList)object2, 1);
                                    this.motionZ = kv_0.d((NBTTagList)object2, 2);
                                    if (!(MathInvoker.a(this.motionX) > 10.0)) break block11;
                                    this.motionX = 0.0;
                                }
                                catch (Throwable throwable) {
                                    object2 = CrashInvoker.makeCrashReport(throwable, aX7.S);
                                    object = CrashInvoker.a((CrashReport)object2, aX7.v);
                                    this.a((CrashReportCategory)object);
                                    throw new ReportedException((CrashReport)object2);
                                }
                            }
                            if (!(MathInvoker.a(this.motionY) > 10.0)) break block12;
                            this.motionY = 0.0;
                        }
                        if (!(MathInvoker.a(this.motionZ) > 10.0)) break block13;
                        this.motionZ = 0.0;
                    }
                    this.lastTickPosX = this.posX = kv_0.d(nBTTagList, 0);
                    this.prevPosX = this.posX;
                    this.lastTickPosY = this.posY = kv_0.d(nBTTagList, 1);
                    this.prevPosY = this.posY;
                    this.lastTickPosZ = this.posZ = kv_0.d(nBTTagList, 2);
                    this.prevPosZ = this.posZ;
                    this.prevRotationYaw = this.rotationYaw = kv_0.b((NBTTagList)object, 0);
                    this.prevRotationPitch = this.rotationPitch = kv_0.b((NBTTagList)object, 1);
                    this.f(this.rotationYaw);
                    this.e(this.rotationYaw);
                    this.fallDistance = tn_0.k(nBTTagCompound, aX7.i);
                    this.Z = tn_0.o(nBTTagCompound, aX7.a);
                    this.d(tn_0.o(nBTTagCompound, aX7.C));
                    this.onGround = tn_0.c(nBTTagCompound, aX7.T);
                    this.dimension = tn_0.g(nBTTagCompound, aX7.E);
                    this.C = tn_0.c(nBTTagCompound, aX7.c);
                    this.timeUntilPortal = tn_0.g(nBTTagCompound, aX7.D);
                    if (!tn_0.a(nBTTagCompound, aX7.X, 4) || !tn_0.a(nBTTagCompound, aX7.L, 4)) break block14;
                    this.a(new UUID(tn_0.f(nBTTagCompound, aX7.w), tn_0.f(nBTTagCompound, aX7.O)));
                    break block15;
                }
                if (!tn_0.a(nBTTagCompound, aX7.Z, 8)) break block15;
                this.a(awc_1.a(tn_0.m(nBTTagCompound, aX7.P)));
            }
            this.j(this.posX, this.posY, this.posZ);
            this.d(this.rotationYaw, this.rotationPitch);
            if (!tn_0.a(nBTTagCompound, aX7.H, 8) || StringInvoker.c(tn_0.m(nBTTagCompound, aX7.o)) <= 0) break block16;
            this.a(tn_0.m(nBTTagCompound, aX7.ay));
        }
        this.g(tn_0.c(nBTTagCompound, aX7.e));
        aqj_0.a(this.ac, nBTTagCompound);
        this.c(tn_0.c(nBTTagCompound, aX7.W));
        this.g(nBTTagCompound);
        if (this.X()) {
            this.j(this.posX, this.posY, this.posZ);
        }
    }

    protected boolean X() {
        return true;
    }

    private String lambda$addEntityCrashInfo$1() throws Exception {
        return this.h.toString();
    }

    public void u() {
    }

    public void j(Entity entity) {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        entity.c(nBTTagCompound);
        this.e(nBTTagCompound);
        this.timeUntilPortal = entity.timeUntilPortal;
        this.w = entity.w;
        this.ae = entity.ae;
        this.ab = entity.ab;
    }

    public rm_2 getEntityBoundingBox() {
        return this.q;
    }

    public EnumFacing ai() {
        return this.ab;
    }

    public void a(boolean bl) {
        this.a(4, bl);
    }

    public boolean ag() {
        boolean bl = this.worldObj != null && this.worldObj.isRemote;
        return !this.S && (this.Z > 0 || this.c(0));
    }

    public float h(Entity entity) {
        float f = (float)(this.posX - entity.posX);
        float f2 = (float)(this.posZ - entity.posZ);
        return MathHelper.g(f * f + f2 * f2);
    }

    public int L() {
        return 300;
    }

    public boolean e(EntityPlayer entityPlayer) {
        return !a6w_0.l(entityPlayer) && this.ac();
    }

    public double a(C03PacketPlayer c03PacketPlayer, int n) {
        return MathHelper.a(MathInvoker.e(ka_0.d(c03PacketPlayer) - this.prevPosX, ka_0.c(c03PacketPlayer) - this.prevPosZ) * 20.0, n);
    }

    public void f(float f) {
    }

    public boolean ac() {
        return this.c(5);
    }

    public void b(int n) {
        this.d = n;
    }

    public void k(Entity entity) {
        aqj_0.a(this.ac, entity.Z());
    }

    public void ao() {
        this.E();
    }

    public MovingObjectPosition a(double d, float f) {
        Vec3 vec3 = this.c(f);
        Vec3 vec32 = this.a(f);
        Vec3 vec33 = aNE.a(vec3, vec32.xCoord * d, vec32.yCoord * d, vec32.zCoord * d);
        return aV8.a(this.worldObj, vec3, vec33, false, false, true);
    }

    public ab1_0 Z() {
        return this.ac;
    }

    public double getLastTickDistance() {
        return MathInvoker.e(this.posX - this.prevPosX, this.posZ - this.prevPosZ);
    }

    public Entity[] aj() {
        return null;
    }

    public float a(TileEntity tileEntity) {
        BlockPos blockPos = NBTInvoker.g(tileEntity);
        double d = this.posX - (double)amv_2.j(blockPos) + 0.5;
        double d2 = this.posY - (double)amv_2.h(blockPos) + 0.5;
        double d3 = this.posZ - (double)amv_2.i(blockPos) + 0.5;
        return MathHelper.e(d * d + d2 * d2 + d3 * d3);
    }

    public String y() {
        return aom_0.d(this.l, 2);
    }

    public int P() {
        return 0;
    }

    public boolean a(DamageSource damageSource) {
        return this.C && damageSource != DamageSource.m && !aDJ.f(damageSource);
    }

    public double a(BlockPos blockPos) {
        return amv_2.c(blockPos, this.posX, this.posY, this.posZ);
    }

    public NBTTagCompound au() {
        return null;
    }

    protected boolean pushOutOfBlocks(double d, double d2, double d3) {
        BlockPos blockPos = new BlockPos(d, d2, d3);
        double d4 = d - (double)amv_2.j(blockPos);
        double d5 = d2 - (double)amv_2.h(blockPos);
        double d6 = d3 - (double)amv_2.i(blockPos);
        List list = aV8.d(this.worldObj, this.getEntityBoundingBox());
        if (ListInvoker.isEmpty(list) && !aV8.h(this.worldObj, blockPos)) {
            return false;
        }
        int n = 3;
        double d7 = 9999.0;
        if (!aV8.h(this.worldObj, amv_2.d(blockPos)) && d4 < d7) {
            d7 = d4;
            n = 0;
        }
        if (!aV8.h(this.worldObj, amv_2.f(blockPos)) && 1.0 - d4 < d7) {
            d7 = 1.0 - d4;
            n = 1;
        }
        if (!aV8.h(this.worldObj, amv_2.e(blockPos)) && 1.0 - d5 < d7) {
            d7 = 1.0 - d5;
            n = 3;
        }
        if (!aV8.h(this.worldObj, amv_2.a(blockPos)) && d6 < d7) {
            d7 = d6;
            n = 4;
        }
        if (!aV8.h(this.worldObj, amv_2.b(blockPos)) && 1.0 - d6 < d7) {
            d7 = 1.0 - d6;
            n = 5;
        }
        float f = a5_0.e(this.Q) * 0.2f + 0.1f;
        this.motionY = f;
        return true;
    }

    public boolean W() {
        return false;
    }

    public String toString() {
        return StringInvoker.a(aX7.k, new Object[]{ara_2.k(this.getClass()), this.getName(), P8.d(this.d), this.worldObj == null ? aX7.ao : uv_2.z(aV8.s(this.worldObj)), db_0.a(this.posX), db_0.a(this.posY), db_0.a(this.posZ)});
    }

    public double i() {
        return (double)this.n * 0.75;
    }

    public void mountEntity(Entity entity) {
        this.E = 0.0;
        this.e = 0.0;
        if (this.r != null) {
            this.c(this.r.posX, this.r.getEntityBoundingBox().a + (double)this.r.n, this.r.posZ, this.rotationYaw, this.rotationPitch);
            this.r.h = null;
        }
        this.r = null;
    }

    public void a(Entity entity, int n) {
    }

    public boolean q() {
        return this.S;
    }

    public void e(double d, double d2, double d3) {
        this.motionX = d;
        this.motionY = d2;
        this.motionZ = d3;
    }

    public void K() {
        if (this.r.isDead) {
            this.r = null;
        } else {
            this.motionX = 0.0;
            this.motionY = 0.0;
            this.motionZ = 0.0;
            this.onUpdate();
            if (this.r != null) {
                this.r.ab();
                this.e += (double)(this.r.rotationYaw - this.r.prevRotationYaw);
                this.E += (double)(this.r.rotationPitch - this.r.prevRotationPitch);
                while (this.e >= 180.0) {
                    this.e -= 360.0;
                }
                while (this.e < -180.0) {
                    this.e += 360.0;
                }
                while (this.E >= 180.0) {
                    this.E -= 360.0;
                }
                while (this.E < -180.0) {
                    this.E += 360.0;
                }
                double d = this.e * 0.5;
                double d2 = this.E * 0.5;
                float f = 10.0f;
                if (d > (double)f) {
                    d = f;
                }
                if (d < (double)(-f)) {
                    d = -f;
                }
                if (d2 > (double)f) {
                    d2 = f;
                }
                if (d2 < (double)(-f)) {
                    d2 = -f;
                }
                this.e -= d;
                this.E -= d2;
            }
        }
    }

    protected void a(BlockPos blockPos, Block block) {
        aum_1 aum_12 = block.l;
        if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.e(blockPos))) == Blocks.cm) {
            aum_12 = Blocks.cm.l;
            this.a(an6_0.c(aum_12), an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
        } else if (!akm_1.f(BlocksInvoker.getBlockState(block))) {
            this.a(an6_0.c(aum_12), an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
        }
    }

    public void d(NBTTagCompound nBTTagCompound) {
    }

    public boolean isSneaking() {
        return this.c(1);
    }

    public boolean aB() {
        return true;
    }

    public Entity x() {
        return null;
    }

    public boolean b(int n, ItemStack itemStack) {
        return false;
    }

    public void b() {
        this.A = true;
        this.fallDistance = 0.0f;
    }

    public boolean M() {
        return false;
    }

    protected Vec3 a(float f, float f2) {
        float f3 = MathHelper.cos(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = MathHelper.sin(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -MathHelper.cos(-f * ((float)Math.PI / 180));
        float f6 = MathHelper.sin(-f * ((float)Math.PI / 180));
        return new Vec3(f4 * f5, f6, f3 * f5);
    }

    public boolean f() {
        return this.ag();
    }

    public boolean i(double d, double d2, double d3) {
        double d4 = this.posX - d;
        double d5 = this.posY - d2;
        double d6 = this.posZ - d3;
        double d7 = d4 * d4 + d5 * d5 + d6 * d6;
        return this.b(d7);
    }

    public float b(float f) {
        if (aLF.c()) {
            int n;
            int n2;
            int n3 = MathHelper.floor_double(this.posX);
            return aV8.isBlockLoaded(this.worldObj, new BlockPos(n3, n2 = MathHelper.floor_double(this.posY + (double)this.w()), n = MathHelper.floor_double(this.posZ))) ? aV8.i(this.worldObj, new BlockPos(n3, n2, n)) : 0.0f;
        }
        BlockPos blockPos = new BlockPos(this.posX, this.posY + (double)this.w(), this.posZ);
        return aV8.isBlockLoaded(this.worldObj, blockPos) ? aV8.i(this.worldObj, blockPos) : 0.0f;
    }

    public double a(BlockPos blockPos, BlockPos blockPos2) {
        double d = amv_2.j(blockPos) - amv_2.j(blockPos2);
        double d2 = amv_2.h(blockPos) - amv_2.h(blockPos2);
        double d3 = amv_2.i(blockPos) - amv_2.i(blockPos2);
        return MathHelper.e(d * d + d2 * d2 + d3 * d3);
    }

    protected abstract void g(NBTTagCompound var1);

    public UUID J() {
        return this.az();
    }

    protected NBTTagList a(float ... fArray) {
        NBTTagList nBTTagList = new NBTTagList();
        for (float f : fArray) {
            kv_0.a(nBTTagList, new aDD(f));
        }
        return nBTTagList;
    }

    public boolean a(EntityPlayerMP entityPlayerMP) {
        return true;
    }

    public int ah() {
        return 3;
    }

    public int hashCode() {
        return this.d;
    }

    public void g(boolean bl) {
        aom_0.b(this.l, 3, axt_2.a((byte)1));
    }

    public void j(double d, double d2, double d3) {
        this.posX = d;
        this.posY = d2;
        this.posZ = d3;
        float f = this.width / 2.0f;
        float f2 = this.n;
        this.a(new rm_2(d - (double)f, d2, d3 - (double)f, d + (double)f, d2 + (double)f2, d3 + (double)f));
    }

    public int r() {
        return this.d;
    }

    public void a(double d, double d2, double d3) {
        this.c(d, d2, d3, this.rotationYaw, this.rotationPitch);
    }

    public void e(float f, float f2) {
        float f3 = this.rotationPitch;
        float f4 = this.rotationYaw;
        Camera camera = (Camera)ModuleInvoker.isEnable(ModuleRegistry.CAMERA);
        if (!alf_2.f(camera) || !alf_2.d(camera) || auk_2.a((Boolean)Ba.b(alf_2.b(camera)))) {
            this.rotationYaw = (float)((double)this.rotationYaw + (double)f * 0.15);
            this.rotationPitch = (float)((double)this.rotationPitch - (double)f2 * 0.15);
            this.rotationPitch = MathHelper.b(this.rotationPitch, -90.0f, 90.0f);
            this.prevRotationPitch += this.rotationPitch - f3;
            this.prevRotationYaw += this.rotationYaw - f4;
            this.ad = this.rotationYaw;
            this.K = this.rotationPitch;
        }
        this.K = (float)((double)this.K - (double)f2 * 0.15);
        this.K = MathHelper.b(this.K, -90.0f, 90.0f);
        this.ad = (float)((double)this.ad + (double)f * 0.15);
    }

    public void setSprinting(boolean bl) {
        this.a(3, bl);
    }

    public void c(double d, double d2, double d3, float f, float f2) {
        this.prevPosX = this.posX = d;
        this.lastTickPosX = this.posX;
        this.prevPosY = this.posY = d2;
        this.lastTickPosY = this.posY;
        this.prevPosZ = this.posZ = d3;
        this.lastTickPosZ = this.posZ;
        this.rotationYaw = f;
        this.rotationPitch = f2;
        this.j(this.posX, this.posY, this.posZ);
    }

    public void b(double d, double d2, double d3) {
        this.motionX += d;
        this.motionY += d2;
        this.motionZ += d3;
        this.p = true;
    }

    public void d(EntityPlayer entityPlayer) {
    }

    public void a(String string, float f, float f2) {
        if (!this.Q()) {
            aV8.a(this.worldObj, this, string, f, f2);
        }
    }

    public void ar() {
        this.Z = 0;
    }

    public boolean f(NBTTagCompound nBTTagCompound) {
        String string = this.ad();
        if (!this.isDead && this.h == null) {
            tn_0.a(nBTTagCompound, aX7.t, string);
            this.c(nBTTagCompound);
            return true;
        }
        return false;
    }

    public void O() {
    }

    public float C() {
        return 0.0f;
    }

    private String lambda$addEntityCrashInfo$0() throws Exception {
        return aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ub_1.a(this)), aX7.b), ara_2.k(this.getClass())), aX7.G).toString();
    }

    protected void d(float f, float f2) {
        this.rotationYaw = f % 360.0f;
        this.rotationPitch = f2 % 360.0f;
    }

    public Entity(World world) {
        this.a(MathHelper.a(this.Q));
        this.ac = new ab1_0();
        this.worldObj = world;
        this.j(0.0, 0.0, 0.0);
        this.dimension = qq_2.j(world.d);
        this.l = new a96(this);
        aom_0.a(this.l, 0, axt_2.a((byte)0));
        aom_0.a(this.l, 1, aWT.b((short)300));
        aom_0.a(this.l, 3, axt_2.a((byte)0));
        aom_0.a(this.l, 2, aX7.h);
        aom_0.a(this.l, 4, axt_2.a((byte)0));
        this.g();
    }

    public void b(boolean bl) {
        this.a(5, bl);
    }

    public void a(byte by) {
    }

    public void onUpdate() {
        this.ak();
    }

    public void e(Entity entity) {
        double d;
        double d2;
        double d3;
        if (entity.h != this && entity.r != this && !entity.H && !this.H && (d3 = MathHelper.b(d2 = entity.posX - this.posX, d = entity.posZ - this.posZ)) >= (double)0.01f) {
            d3 = MathHelper.e(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= (double)0.05f;
            d *= (double)0.05f;
            d2 *= (double)(1.0f - this.X);
            d *= (double)(1.0f - this.X);
            if (this.h == null) {
                this.b(-d2, 0.0, -d);
            }
            if (entity.h == null) {
                entity.b(d2, 0.0, d);
            }
        }
    }

    public boolean at() {
        Freecam freecam = (Freecam)ModuleInvoker.isEnable(ModuleRegistry.FREECAM);
        if (!this.H && !aAO.a(freecam)) {
            z6_0 z6_02 = new z6_0(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            int n = 0;
            while (true) {
                int n2 = MathHelper.floor_double(this.posY + (double)(((float)(n % 2) - 0.5f) * 0.1f) + (double)this.w());
                int n3 = MathHelper.floor_double(this.posX + (double)(((float)((n >> 1) % 2) - 0.5f) * this.width * 0.8f));
                int n4 = MathHelper.floor_double(this.posZ + (double)(((float)((n >> 2) % 2) - 0.5f) * this.width * 0.8f));
                if (ain_1.e(z6_02) != n3 || ain_1.g(z6_02) != n2 || ain_1.a(z6_02) != n4) {
                    ain_1.a(z6_02, n3, n2, n4);
                    if (BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(this.worldObj, z6_02)))) {
                        return true;
                    }
                }
                ++n;
            }
        }
        return false;
    }

    protected void Y() {
        this.E();
    }

    public boolean N() {
        return false;
    }
}

