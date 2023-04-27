/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package net.minecraft.entity;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.modules.player.Scaffold;
import cc.novoline.modules.visual.Animations;
import net.minecraft.network.packts.S04PacketEntityEquipment;
import net.minecraft.network.packts.S0BPacketAnimation;
import net.minecraft.network.packts.S0DPacketCollectItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.AttributeModifier;
import net.B7;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EntityArrow;
import deobf.EntityPlayerMP;
import net.IBlockState;
import net.J9;
import net.Ma;
import net.Material;
import net.MathHelper;
import net.NBTTagCompound;
import net.P8;
import net.Potion;
import net.QV;
import net.TC;
import net.Team;
import net.VB;
import net.VM;
import net.VO;
import net.World;
import net.WorldServer;
import net.X5;
import net.Y5;
import net.a2l_0;
import net.a39;
import net.a3D;
import net.a3M;
import net.a3V;
import net.a5_0;
import net.a6w_0;
import net.a7Y;
import net.aDJ;
import net.aH2;
import net.aNE;
import net.aQT;
import net.aS0;
import net.aSY;
import net.aV8;
import net.abb_0;
import net.act_2;
import net.adt_2;
import net.ahw_2;
import net.ahy_2;
import net.ak9_0;
import net.alf_0;
import net.amv_2;
import net.an6_0;
import net.an7_0;
import net.anf_2;
import net.aom_0;
import net.aqp_2;
import net.ari_0;
import net.aum_1;
import net.aw1_0;
import net.awc_1;
import net.axt_2;
import net.axx_1;
import net.dz_0;
import net.e_0;
import net.h__0;
import net.ht_0;
import net.kv_0;
import net.ma_1;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.ms_0;
import net.nf_1;
import net.oa_2;
import net.od_2;
import net.og_0;
import net.ow_0;
import net.px_0;
import net.rm_2;
import net.tn_0;
import net.wc_1;
import net.z3_0;
import org.jetbrains.annotations.NotNull;


public abstract class EntityLivingBase
extends Entity {
    public int aB;
    private EntityLivingBase aj;
    protected double al;
    public int aS;
    public float aQ;
    public float ap;
    public float aD;
    public float moveStrafing;
    public float an;
    public float aC;
    private static AttributeModifier aV;
    public int a8;
    protected double bd;
    private float a1;
    protected float aH;
    protected float aY;
    public float aJ;
    public int aE;
    public float ay;
    private Map<Integer, a2l_0> ar;
    protected double aO;
    protected boolean au;
    protected float aX;
    protected double a0;
    protected int a4;
    protected double a6;
    private int as;
    public boolean a5;
    private EntityLivingBase aA;
    protected float aW;
    protected int aF;
    private VO bc;
    public float a3;
    private int aN;
    protected boolean ak;
    private float bb;
    public float aq;
    public float aI;
    public int az;
    public float a2;
    protected int aT;
    private ItemStack[] am;
    public float aZ = 0.02f;
    public float moveForward;
    private boolean a7 = true;
    protected boolean isJumping;
    public float aP;
    public float aR;
    protected EntityPlayer be;
    private Y5 aL = new Y5(this);
    public int aG;
    public float aM;
    public int ba = 20;
    private double jumpMotion = 0.42f;
    public float aU;
    protected int aK;
    protected float aw;
    private static UUID a_;
    private int ao;

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, e_0.B, this.a());
        tn_0.a(nBTTagCompound, e_0.f, (short)MathInvoker.j(this.a()));
        tn_0.a(nBTTagCompound, e_0.A, (short)this.a8);
        tn_0.b(nBTTagCompound, e_0.D, this.as);
        tn_0.a(nBTTagCompound, e_0.F, (short)this.aS);
        tn_0.a(nBTTagCompound, e_0.j, this.o());
        for (ItemStack itemStack : this.ae()) {
            ht_0.a(this.bc, act_2.d(itemStack));
        }
        tn_0.a(nBTTagCompound, e_0.l, ahy_2.a(this.N()));
        for (ItemStack itemStack : this.ae()) {
            ht_0.b(this.bc, act_2.d(itemStack));
        }
        if (!MapInvoker.e(this.ar)) {
            NBTTagList nBTTagList = new NBTTagList();
            Iterator iterator = ms_0.a(this.ar.values());
            while (dz_0.c(iterator)) {
                a2l_0 a2l_02 = (a2l_0)dz_0.b(iterator);
                kv_0.a(nBTTagList, a3M.a(a2l_02, new NBTTagCompound()));
            }
            tn_0.a(nBTTagCompound, e_0.i, nBTTagList);
        }
    }

    public boolean y() {
        return false;
    }

    protected String d() {
        return e_0.b;
    }

    @Override
    public abstract void c(int var1, ItemStack var2);

    public float e(float f) {
        float f2 = this.aQ - this.aI;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        return this.aI + f2 * f;
    }

    @Override
    public boolean R() {
        return false;
    }

    public int c(Potion potion) {
        return this.isPotionActive(potion) ? a3M.c((a2l_0)MapInvoker.c(this.ar, P8.d(ari_0.f(potion)))) : 0;
    }

    public boolean a(@NotNull Entity entity) {
        return aV8.a(this.worldObj, new Vec3(this.posX, this.posY + (double)this.w(), this.posZ), new Vec3(entity.posX, entity.posY + (double)entity.w(), entity.posZ)) == null;
    }

    public abstract ItemStack d(int var1);

    @Override
    public void b(float f, float f2) {
        super.b(f, f2);
        a2l_0 a2l_02 = this.getActivePotionEffect(Potion.jump);
        float f3 = a3M.g(a2l_02) + 1;
        int n = MathHelper.c((f - 3.0f - f3) * f2);
        this.a(this.e(n), 1.0f, 1.0f);
        this.a(DamageSource.n, (float)n);
        int n2 = MathHelper.floor_double(this.posX);
        int n3 = MathHelper.floor_double(this.posY - (double)0.2f);
        int n4 = MathHelper.floor_double(this.posZ);
        Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(n2, n3, n4)));
        if (BlocksInvoker.getBlockState(block) != Material.air) {
            aum_1 aum_12 = block.l;
            this.a(an6_0.c(aum_12), an6_0.d(aum_12) * 0.5f, an6_0.b(aum_12) * 0.75f);
        }
    }

    public EntityLivingBase U() {
        return this.aj;
    }

    protected void b(boolean bl, int n) {
    }

    @Override
    public void a(byte by) {
        if (by == 2) {
            this.aq = 1.5f;
            this.hurtResistantTime = this.ba;
            this.aB = 10;
            this.a8 = 10;
            this.aJ = 0.0f;
            this.d();
            this.a(this.d(), this.f(), (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            this.a(DamageSource.r, 0.0f);
        } else if (by == 3) {
            this.C();
            this.a(this.C(), this.f(), (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            this.i(0.0f);
            this.onDeath(DamageSource.r);
        } else {
            super.a(by);
        }
    }

    public EntityLivingBase(World world) {
        super(world);
        this.ar = MapsInvoker.a();
        this.aE = anf_2.c(anf_2.c());
        this.am = new ItemStack[5];
        this.H();
        this.i(this.b());
        this.P = true;
        this.j(this.posX, this.posY, this.posZ);
        this.aP = this.rotationYaw = (float)(MathInvoker.a() * Math.PI * 2.0);
        this.aC = this.rotationPitch;
        this.U = 0.6f;
    }

    @Override
    public void f(float f) {
        this.aP = f;
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 7, P8.d(0));
        aom_0.a(this.l, 8, axt_2.a((byte)0));
        aom_0.a(this.l, 9, axt_2.a((byte)0));
        aom_0.a(this.l, 6, axx_1.a(1.0f));
    }

    @Override
    protected void Y() {
        this.a(DamageSource.m, 4.0f);
    }

    protected void g(float f) {
    }

    protected void Q() {
        ++this.aS;
        if (this.aS == 20) {
            if (!this.worldObj.isRemote && (this.a4 > 0 || this.S()) && this.g() && J9.c(aV8.k(this.worldObj), e_0.z)) {
                int n = this.a(this.be);
                while (true) {
                    int n2 = TC.a(n);
                    n -= n2;
                    aV8.b(this.worldObj, new oa_2(this.worldObj, this.posX, this.posY, this.posZ, n2));
                }
            }
            this.E();
            int n = 0;
            while (true) {
                double d = a5_0.f(this.Q) * 0.02;
                double d2 = a5_0.f(this.Q) * 0.02;
                double d3 = a5_0.f(this.Q) * 0.02;
                aV8.a(this.worldObj, B7.EXPLOSION_NORMAL, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
                ++n;
            }
        }
    }

    public void h(int n) {
        aom_0.b(this.l, 9, axt_2.a((byte)n));
    }

    protected void b(Entity entity) {
        entity.e(this);
    }

    @Override
    public boolean W() {
        return !this.isDead;
    }

    public aH2 ae() {
        return aH2.UNDEFINED;
    }

    public void i(int n) {
        a2l_0 a2l_02 = (a2l_0)MapInvoker.a(this.ar, P8.d(n));
        this.b(a2l_02);
    }

    public void b(Entity entity, int n) {
        if (!entity.isDead && !this.worldObj.isRemote) {
            aQT aQT2 = a3V.a((WorldServer)this.worldObj);
            if (entity instanceof og_0) {
                a7Y.b(aQT2, entity, new S0DPacketCollectItem(entity.r(), this.r()));
            }
            if (entity instanceof EntityArrow) {
                a7Y.b(aQT2, entity, new S0DPacketCollectItem(entity.r(), this.r()));
            }
            if (entity instanceof oa_2) {
                a7Y.b(aQT2, entity, new S0DPacketCollectItem(entity.r(), this.r()));
            }
        }
    }

    public void a(float f) {
        this.a1 = f;
    }

    public boolean r() {
        int n;
        int n2;
        int n3 = MathHelper.floor_double(this.posX);
        Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(n3, n2 = MathHelper.floor_double(this.getEntityBoundingBox().a), n = MathHelper.floor_double(this.posZ))));
        return !(block != Blocks.bm && block != Blocks.as || this instanceof EntityPlayer && a6w_0.l((EntityPlayer)this));
    }

    public boolean b() {
        return this.ae() == aH2.UNDEAD;
    }

    protected void H() {
        ht_0.b(this.N(), abb_0.b);
        ht_0.b(this.N(), abb_0.d);
        ht_0.b(this.N(), abb_0.e);
    }

    public a2l_0 getActivePotionEffect(Potion potion) {
        return (a2l_0)MapInvoker.c(this.ar, P8.d(ari_0.f(potion)));
    }

    public Y5 A() {
        return this.aL;
    }

    protected float K() {
        return this.j() ? (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.5f : (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f;
    }

    public void Z() {
        if (!this.a5 || this.aG >= this.X() / 2 || this.aG < 0) {
            this.aG = -1;
            this.a5 = true;
            if (this.worldObj instanceof WorldServer) {
                a7Y.b(a3V.a((WorldServer)this.worldObj), this, new S0BPacketAnimation(this, 0));
            }
        }
    }

    protected int j(int n) {
        int n2 = alf_0.b((Entity)this);
        return a5_0.a(this.Q, n2 + 1) > 0 ? n : n - 1;
    }

    protected void updateEntityActionState() {
    }

    public void c(int n) {
        MapInvoker.a(this.ar, P8.d(n));
    }

    public int O() {
        int n = 0;
        for (ItemStack itemStack : this.ae()) {
            if (!(act_2.k(itemStack) instanceof ItemArmor)) continue;
            int n2 = ((ItemArmor)act_2.k((ItemStack)itemStack)).o;
            n += n2;
        }
        return n;
    }

    public Random E() {
        return this.Q;
    }

    public Team getTeam() {
        return VM.c(aV8.v(this.worldObj), this.J().toString());
    }

    public void g(Entity entity) {
        double cfr_ignored_0 = entity.posX;
        double cfr_ignored_1 = entity.getEntityBoundingBox().a + (double)entity.n;
        double cfr_ignored_2 = entity.posZ;
        int n = -1;
        int n2 = -1;
        while (true) {
            int n3 = (int)(this.posX + (double)n);
            int n4 = (int)(this.posZ + (double)n2);
            rm_2 rm_22 = h__0.b(this.getEntityBoundingBox(), n, 1.0, n2);
            if (ListInvoker.isEmpty(aV8.d(this.worldObj, rm_22))) {
                if (aV8.a((IBlockAccess)this.worldObj, new BlockPos(n3, (int)this.posY, n4))) {
                    this.a(this.posX + (double)n, this.posY + 1.0, this.posZ + (double)n2);
                    return;
                }
                if (aV8.a((IBlockAccess)this.worldObj, new BlockPos(n3, (int)this.posY - 1, n4)) || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(n3, (int)this.posY - 1, n4)))) == Material.M) {
                    double cfr_ignored_3 = this.posX + (double)n;
                    double cfr_ignored_4 = this.posY + 1.0;
                    double cfr_ignored_5 = this.posZ + (double)n2;
                }
            }
            ++n2;
        }
    }

    public void b(EntityLivingBase entityLivingBase) {
        this.aj = entityLivingBase;
        this.as = this.ticksExisted;
    }

    protected void c(DamageSource damageSource, float f) {
        if (!this.a(damageSource)) {
            f = this.b(damageSource, f);
            float f2 = f = this.a(damageSource, f);
            f = MathInvoker.b(f - this.o(), 0.0f);
            this.b(this.o() - (f2 - f));
            if (f != 0.0f) {
                float f3 = this.a();
                this.i(f3 - f);
                aw1_0.a(this.A(), damageSource, f3, f);
                this.b(this.o() - f);
            }
        }
    }

    public void h(boolean bl) {
        this.isJumping = bl;
    }

    protected void B() {
        if (MapInvoker.e(this.ar)) {
            this.w();
            this.b(false);
        } else {
            int n = a39.b(this.ar.values());
            aom_0.b(this.l, 8, axt_2.a((byte)(a39.a(this.ar.values()) ? 1 : 0)));
            aom_0.b(this.l, 7, P8.d(n));
            this.b(this.k(ari_0.f(Potion.invisibility)));
        }
    }

    public ahw_2 a(IAttribute iAttribute) {
        return ht_0.a(this.N(), iAttribute);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        NBTBase nBTBase;
        this.b(tn_0.k(nBTTagCompound, e_0.m));
        if (tn_0.a(nBTTagCompound, e_0.w, 9) && this.worldObj != null && !this.worldObj.isRemote) {
            ahy_2.a(this.N(), tn_0.c(nBTTagCompound, e_0.I, 10));
        }
        if (tn_0.a(nBTTagCompound, e_0.k, 9)) {
            nBTBase = tn_0.c(nBTTagCompound, e_0.h, 10);
            for (int i = 0; i < kv_0.c(nBTBase); ++i) {
                NBTTagCompound nBTTagCompound2 = kv_0.g(nBTBase, i);
                a2l_0 a2l_02 = a3M.a(nBTTagCompound2);
                MapInvoker.c(this.ar, P8.d(a3M.b(a2l_02)), a2l_02);
            }
        }
        if (tn_0.a(nBTTagCompound, e_0.n, 99)) {
            this.i(tn_0.k(nBTTagCompound, e_0.q));
        } else {
            nBTBase = tn_0.h(nBTTagCompound, e_0.p);
            this.i(this.b());
        }
        this.a8 = tn_0.o(nBTTagCompound, e_0.t);
        this.aS = tn_0.o(nBTTagCompound, e_0.o);
        this.as = tn_0.g(nBTTagCompound, e_0.C);
    }

    public static AttributeModifier i() {
        return aV;
    }

    public boolean ad() {
        return !this.worldObj.isRemote;
    }

    protected void L() {
        List list = aV8.a(this.worldObj, this, h__0.d(this.getEntityBoundingBox(), 0.2f, 0.0, 0.2f), an7_0.a(od_2.d, Entity::W));
        if (!ListInvoker.isEmpty(list)) {
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                this.b(entity);
            }
        }
    }

    protected boolean g() {
        return !this.j();
    }

    protected void a() {
        this.motionY += (double)0.04f;
    }

    public boolean j() {
        return false;
    }

    protected void a(double d) {
        this.motionY = d;
        if (this.isPotionActive(Potion.jump)) {
            d += (double)((float)(a3M.g(this.getActivePotionEffect(Potion.jump)) + 1) * 0.1f);
        }
        if (this.isSprinting()) {
            float f = (float)MathInvoker.o(this.rotationYaw);
            this.motionX -= (double)(MathHelper.sin(f) * 0.2f);
            this.motionZ += (double)(MathHelper.cos(f) * 0.2f);
        }
        this.p = true;
    }

    public VO N() {
        if (this.bc == null) {
            this.bc = new VB();
        }
        return this.bc;
    }

    public boolean m() {
        return false;
    }

    protected boolean h() {
        return this.a() <= 0.0f;
    }

    public void ag() {
    }

    protected float b(DamageSource damageSource, float f) {
        if (!aDJ.i(damageSource)) {
            int n = 25 - this.O();
            float f2 = f * (float)n;
            this.g(f);
            f = f2 / 25.0f;
        }
        return f;
    }

    public void b(ItemStack itemStack) {
        this.a(e_0.y, 0.8f, 0.8f + a5_0.e(this.worldObj.o) * 0.4f);
        int n = 0;
        while (true) {
            Vec3 vec3 = new Vec3(((double)a5_0.e(this.Q) - 0.5) * 0.1, MathInvoker.a() * 0.1 + 0.1, 0.0);
            vec3 = aNE.b(vec3, -this.rotationPitch * (float)Math.PI / 180.0f);
            vec3 = aNE.a(vec3, -this.rotationYaw * (float)Math.PI / 180.0f);
            double d = (double)(-a5_0.e(this.Q)) * 0.6 - 0.3;
            Vec3 vec32 = new Vec3(((double)a5_0.e(this.Q) - 0.5) * 0.3, d, 0.6);
            vec32 = aNE.b(vec32, -this.rotationPitch * (float)Math.PI / 180.0f);
            vec32 = aNE.a(vec32, -this.rotationYaw * (float)Math.PI / 180.0f);
            vec32 = aNE.a(vec32, this.posX, this.posY + (double)this.w(), this.posZ);
            aV8.a(this.worldObj, B7.ITEM_CRACK, vec32.xCoord, vec32.yCoord, vec32.zCoord, vec3.xCoord, vec3.yCoord + 0.05, vec3.zCoord, new int[]{px_0.a(act_2.k(itemStack))});
            ++n;
        }
    }

    public void onDeath(DamageSource damageSource) {
        Entity entity = aDJ.d(damageSource);
        EntityLivingBase entityLivingBase = this.I();
        if (this.aK >= 0) {
            entityLivingBase.a((Entity)this, this.aK);
        }
        entity.a(this);
        this.ak = true;
        aw1_0.c(this.A());
        if (!this.worldObj.isRemote) {
            int n = 0;
            if (entity instanceof EntityPlayer) {
                n = alf_0.b((EntityLivingBase)entity);
            }
            if (this.g() && J9.c(aV8.k(this.worldObj), e_0.e)) {
                this.b(this.a4 > 0, n);
                this.a(this.a4 > 0, n);
                if (this.a4 > 0 && a5_0.e(this.Q) < 0.025f + (float)n * 0.01f) {
                    this.t();
                }
            }
        }
        aV8.a(this.worldObj, (Entity)this, (byte)3);
    }

    public int W() {
        return aom_0.g(this.l, 9);
    }

    public float n() {
        return this.a1;
    }

    public void p() {
    }

    public void ac() {
        Iterator iterator = aS0.f(MapInvoker.c(this.ar));
        while (dz_0.c(iterator)) {
            Integer n = (Integer)dz_0.b(iterator);
            a2l_0 a2l_02 = (a2l_0)MapInvoker.c(this.ar, n);
            if (this.worldObj.isRemote) continue;
            dz_0.a(iterator);
            this.b(a2l_02);
        }
    }

    public EntityLivingBase I() {
        return aw1_0.a(this.aL) != null ? aw1_0.a(this.aL) : (this.be != null ? this.be : this.aj);
    }

    public boolean k(int n) {
        return MapInvoker.b(this.ar, P8.d(n));
    }

    @Override
    public void ak() {
        boolean bl;
        this.aI = this.aQ;
        super.ak();
        ProfilerInvoker.startSection(this.worldObj.A, e_0.E);
        boolean cfr_ignored_0 = this instanceof EntityPlayer;
        if (this.n()) {
            double d;
            if (this.at()) {
                this.a(DamageSource.c, 1.0f);
            } else if (!ak9_0.a(aV8.x(this.worldObj), this.getEntityBoundingBox()) && (d = ak9_0.a(aV8.x(this.worldObj), this) + ak9_0.b(aV8.x(this.worldObj))) < 0.0) {
                this.a(DamageSource.c, (float)MathInvoker.max(1, MathHelper.floor_double(-d * ak9_0.d(aV8.x(this.worldObj)))));
            }
        }
        if (this.q() || this.worldObj.isRemote) {
            this.ar();
        }
        boolean bl2 = bl = aSY.b(((EntityPlayer)this).abilities);
        if (this.n()) {
            if (this.isInsideOfMaterial(Material.M)) {
                if (!this.m() && !this.k(ari_0.f(Potion.waterBreathing))) {
                    this.d(this.j(this.av()));
                    if (this.av() == -20) {
                        this.d(0);
                        int n = 0;
                        while (true) {
                            float f = a5_0.e(this.Q) - a5_0.e(this.Q);
                            float f2 = a5_0.e(this.Q) - a5_0.e(this.Q);
                            float f3 = a5_0.e(this.Q) - a5_0.e(this.Q);
                            aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX + (double)f, this.posY + (double)f2, this.posZ + (double)f3, this.motionX, this.motionY, this.motionZ, new int[0]);
                            ++n;
                        }
                    }
                }
                if (!this.worldObj.isRemote && this.isRiding() && this.r instanceof EntityLivingBase) {
                    this.mountEntity(null);
                }
            } else {
                this.d(300);
            }
        }
        if (this.n() && this.am()) {
            this.ar();
        }
        this.a2 = this.ap;
        if (this.a8 > 0) {
            --this.a8;
        }
        if (this.hurtResistantTime > 0 && !(this instanceof EntityPlayerMP)) {
            --this.hurtResistantTime;
        }
        if (this.a() <= 0.0f) {
            this.Q();
        }
        if (this.a4 > 0) {
            --this.a4;
        } else {
            this.be = null;
        }
        if (this.aA != null && !this.aA.n()) {
            this.aA = null;
        }
        if (this.aj != null) {
            if (!this.aj.n()) {
                this.b((EntityLivingBase)null);
            } else if (this.ticksExisted - this.as > 100) {
                this.b((EntityLivingBase)null);
            }
        }
        this.J();
        this.aH = this.aY;
        this.ay = this.aD;
        this.aR = this.aP;
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.a3 = this.aC;
        ProfilerInvoker.endSection(this.worldObj.A);
        EventManagerInvoker.call(new X5(this));
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote) {
            int n = this.W();
            if (this.az <= 0) {
                this.az = 20 * (30 - n);
            }
            --this.az;
            if (this.az <= 0) {
                this.h(n - 1);
            }
            int n2 = 0;
            while (true) {
                ItemStack itemStack = this.am[n2];
                ItemStack itemStack2 = this.d(n2);
                if (!act_2.e(itemStack2, itemStack)) {
                    a7Y.b(a3V.a((WorldServer)this.worldObj), this, new S04PacketEntityEquipment(this.r(), n2, itemStack2));
                    ht_0.a(this.bc, act_2.d(itemStack));
                    ht_0.b(this.bc, act_2.d(itemStack2));
                    this.am[n2] = null;
                }
                ++n2;
            }
        }
        this.onLivingUpdate();
        double d = this.posX - this.prevPosX;
        double d2 = this.posZ - this.prevPosZ;
        float f = (float)(d * d + d2 * d2);
        float f2 = this.aD;
        float f3 = 0.0f;
        this.aw = this.aW;
        float f4 = 0.0f;
        if (f > 0.0025000002f) {
            f4 = 1.0f;
            f3 = (float)MathInvoker.d(f) * 3.0f;
            f2 = (float)MathHelper.c(d2, d) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (this.aQ > 0.0f) {
            f2 = this.rotationYaw;
        }
        if (!this.onGround) {
            f4 = 0.0f;
        }
        this.aW += (f4 - this.aW) * 0.3f;
        ProfilerInvoker.startSection(this.worldObj.A, e_0.a);
        f3 = this.a(f2, f3);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, e_0.r);
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        while (this.aD - this.ay < -180.0f) {
            this.ay -= 360.0f;
        }
        while (this.aD - this.ay >= 180.0f) {
            this.ay += 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.aP - this.aR < -180.0f) {
            this.aR -= 360.0f;
        }
        while (this.aP - this.aR >= 180.0f) {
            this.aR += 360.0f;
        }
        ProfilerInvoker.endSection(this.worldObj.A);
        this.aY += f3;
    }

    public abstract ItemStack ah();

    public float o() {
        return this.bb;
    }

    @Override
    public void e(float f) {
        this.aD = f;
    }

    public boolean d(a2l_0 a2l_02) {
        if (this.ae() == aH2.UNDEAD) {
            int n = a3M.b(a2l_02);
            return n != ari_0.f(Potion.regeneration) && n != ari_0.f(Potion.poison);
        }
        return true;
    }

    @Override
    public void mountEntity(Entity entity) {
        if (this.r != null) {
            if (!this.worldObj.isRemote) {
                this.g(this.r);
            }
            if (this.r != null) {
                this.r.h = null;
            }
            this.r = null;
        } else {
            super.mountEntity(entity);
        }
    }

    @Override
    protected void k() {
        this.aa = a5_0.c(this.Q) >= Ma.d(this.a(abb_0.d));
    }

    public int T() {
        return this.aN;
    }

    public void a(Entity entity, float f, double d, double d2) {
        if (a5_0.c(this.Q) >= Ma.d(this.a(abb_0.d))) {
            this.p = true;
            float f2 = MathHelper.e(d * d + d2 * d2);
            this.motionX /= 2.0;
            this.motionY /= 2.0;
            this.motionZ /= 2.0;
            this.motionX -= d / (double)f2 * (double)0.4f;
            this.motionY += (double)0.4f;
            this.motionZ -= d2 / (double)f2 * (double)0.4f;
            if (this.motionY > (double)0.4f) {
                this.motionY = 0.4f;
            }
        }
    }

    @Override
    public float C() {
        return this.aP;
    }

    public abstract ItemStack a(int var1);

    @Override
    public boolean n() {
        return !this.isDead && this.a() > 0.0f;
    }

    public int x() {
        return this.aF;
    }

    @Override
    public Vec3 a(float f) {
        return this.a(this.rotationPitch, this.aP);
    }

    public Map<Integer, a2l_0> k() {
        return this.ar;
    }

    protected void b(a2l_0 a2l_02) {
        this.a7 = true;
        if (!this.worldObj.isRemote) {
            ari_0.a(Potion.potionTypes[a3M.b(a2l_02)], this, this.N(), a3M.g(a2l_02));
        }
    }

    public void c(float f) {
        this.aD = f;
    }

    public int b(Potion potion) {
        return this.isPotionActive(potion) ? a3M.g((a2l_0)MapInvoker.c(this.ar, P8.d(ari_0.f(potion)))) + 1 : 0;
    }

    public EntityLivingBase D() {
        return this.aA;
    }

    @Override
    public void u() {
        this.aB = 10;
        this.a8 = 10;
        this.aJ = 0.0f;
    }

    public static UUID P() {
        return a_;
    }

    protected void t() {
    }

    public void c(Entity entity) {
        this.aA = entity instanceof EntityLivingBase ? (EntityLivingBase)entity : null;
        this.aN = this.ticksExisted;
    }

    protected void a(boolean bl, int n) {
    }

    protected float a(DamageSource damageSource, float f) {
        float f2;
        int n;
        int n2;
        if (aDJ.a(damageSource)) {
            return f;
        }
        if (this.isPotionActive(Potion.resistance) && damageSource != DamageSource.m) {
            n2 = (a3M.g(this.getActivePotionEffect(Potion.resistance)) + 1) * 5;
            n = 25 - n2;
            f2 = f * (float)n;
            f = f2 / 25.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        n2 = alf_0.a(this.ae(), damageSource);
        if (n2 > 20) {
            n2 = 20;
        }
        if (n2 <= 20) {
            n = 25 - n2;
            f2 = f * (float)n;
            f = f2 / 25.0f;
        }
        return f;
    }

    protected void V() {
        this.a7 = true;
    }

    protected void e() {
        int n = this.X();
        if (this.a5) {
            ++this.aG;
            if (this.aG >= n) {
                this.aG = 0;
                this.a5 = false;
            }
        } else {
            this.aG = 0;
        }
        this.aQ = (float)this.aG / (float)n;
    }

    public void b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.bb = f;
    }

    protected void J() {
        Iterator iterator = aS0.f(MapInvoker.c(this.ar));
        while (dz_0.c(iterator)) {
            Integer n = (Integer)dz_0.b(iterator);
            a2l_0 a2l_02 = (a2l_0)MapInvoker.c(this.ar, n);
            if (!a3M.a(a2l_02, this)) {
                if (this.worldObj.isRemote) continue;
                dz_0.a(iterator);
                this.b(a2l_02);
                continue;
            }
            if (a3M.c(a2l_02) % 600 != 0) continue;
            this.a(a2l_02, false);
        }
        if (this.a7) {
            if (!this.worldObj.isRemote) {
                this.B();
            }
            this.a7 = false;
        }
        int n = aom_0.h(this.l, 7);
        boolean bl = aom_0.g(this.l, 8) > 0;
        boolean bl2 = false;
        bl2 = !this.ac() ? a5_0.a(this.Q) : a5_0.a(this.Q, 15) == 0;
        bl2 &= a5_0.a(this.Q, 5) == 0;
        double d = (double)(n >> 16 & 0xFF) / 255.0;
        double d2 = (double)(n >> 8 & 0xFF) / 255.0;
        double d3 = (double)(n & 0xFF) / 255.0;
        aV8.a(this.worldObj, B7.SPELL_MOB_AMBIENT, this.posX + (a5_0.c(this.Q) - 0.5) * (double)this.width, this.posY + a5_0.c(this.Q) * (double)this.n, this.posZ + (a5_0.c(this.Q) - 0.5) * (double)this.width, d, d2, d3, new int[0]);
    }

    protected int a(EntityPlayer entityPlayer) {
        return 0;
    }

    private int X() {
        int n = 0;
        if (this instanceof EntityPlayerSP) {
            Animations animations = (Animations)ModuleInvoker.isEnable(ModuleRegistry.ANIMATIONS);
            Scaffold scaffold = (Scaffold)ModuleInvoker.isEnable(ModuleRegistry.SCAFFOLD);
            n = z3_0.g(animations) && !ma_1.c(scaffold) ? 6 + P8.b((Integer)adt_2.a(z3_0.d(animations))) : (this.isPotionActive(Potion.digSpeed) ? 6 - (1 + a3M.g(this.getActivePotionEffect(Potion.digSpeed))) : (this.isPotionActive(Potion.digSlowdown) ? 6 + (1 + a3M.g(this.getActivePotionEffect(Potion.digSlowdown))) * 2 : 6));
        } else {
            n = this.isPotionActive(Potion.digSpeed) ? 6 - (1 + a3M.g(this.getActivePotionEffect(Potion.digSpeed))) : (this.isPotionActive(Potion.digSlowdown) ? 6 + (1 + a3M.g(this.getActivePotionEffect(Potion.digSlowdown))) * 2 : 6);
        }
        return n;
    }

    public boolean a(Team team) {
        return this.getTeam() != null && a3D.a(this.getTeam(), team);
    }

    public float b() {
        return (float)Ma.d(this.a(abb_0.b));
    }

    protected String e(int n) {
        return n > 4 ? e_0.G : e_0.H;
    }

    public void a(a2l_0 a2l_02) {
        if (this.d(a2l_02)) {
            if (MapInvoker.b(this.ar, P8.d(a3M.b(a2l_02)))) {
                a3M.a((a2l_0)MapInvoker.c(this.ar, P8.d(a3M.b(a2l_02))), a2l_02);
                this.a((a2l_0)MapInvoker.c(this.ar, P8.d(a3M.b(a2l_02))), true);
            } else {
                MapInvoker.c(this.ar, P8.d(a3M.b(a2l_02)), a2l_02);
                this.c(a2l_02);
            }
        }
    }

    @Override
    public void ao() {
        this.a(DamageSource.m, Float.MAX_VALUE);
    }

    public void i(float f) {
        aom_0.b(this.l, 6, axx_1.a(MathHelper.b(f, 0.0f, this.b())));
    }

    @Override
    public boolean N() {
        return !this.isDead;
    }

    protected void M() {
        this.motionY += (double)0.04f;
    }

    public boolean a(@NotNull TileEntity tileEntity) {
        return aV8.a(this.worldObj, new Vec3(this.posX, this.posY + (double)this.w(), this.posZ), new Vec3(amv_2.j(NBTInvoker.g(tileEntity)), amv_2.h(NBTInvoker.g(tileEntity)), amv_2.i(NBTInvoker.g(tileEntity)))) == null;
    }

    protected void c(a2l_0 a2l_02) {
        this.a7 = true;
        if (!this.worldObj.isRemote) {
            ari_0.b(Potion.potionTypes[a3M.b(a2l_02)], this, this.N(), a3M.g(a2l_02));
        }
    }

    static {
        a_ = awc_1.a(e_0.x);
        aV = ow_0.a(new AttributeModifier(a_, e_0.J, 0.3f, 2), false);
    }

    public boolean isPotionActive(Potion potion) {
        return MapInvoker.b(this.ar, P8.d(ari_0.f(potion)));
    }

    protected float a(float f, float f2) {
        float f3 = MathHelper.a(f - this.aD);
        this.aD += f3 * 0.3f;
        float f4 = MathHelper.a(this.rotationYaw - this.aD);
        boolean bl = f4 < -90.0f || f4 >= 90.0f;
        if (f4 < -75.0f) {
            f4 = -75.0f;
        }
        if (f4 >= 75.0f) {
            f4 = 75.0f;
        }
        this.aD = this.rotationYaw - f4;
        if (f4 * f4 > 2500.0f) {
            this.aD += f4 * 0.2f;
        }
        return f2 *= -1.0f;
    }

    protected void a(a2l_0 a2l_02, boolean bl) {
        this.a7 = true;
        if (!this.worldObj.isRemote) {
            ari_0.a(Potion.potionTypes[a3M.b(a2l_02)], this, this.N(), a3M.g(a2l_02));
            ari_0.b(Potion.potionTypes[a3M.b(a2l_02)], this, this.N(), a3M.g(a2l_02));
        }
    }

    @Override
    public void K() {
        super.K();
        this.aw = this.aW;
        this.aW = 0.0f;
        this.fallDistance = 0.0f;
    }

    public Collection<a2l_0> G() {
        return this.ar.values();
    }

    public float a() {
        return aom_0.a(this.l, 6);
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.aO = d;
        this.a0 = d2;
        this.a6 = d3;
        this.bd = f;
        this.al = f2;
        this.aT = n;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        nf_1 nf_12;
        if (this.a(damageSource)) {
            return false;
        }
        if (this.worldObj.isRemote) {
            return false;
        }
        this.aF = 0;
        if (this.a() <= 0.0f) {
            return false;
        }
        if (aDJ.m(damageSource) && this.isPotionActive(Potion.fireResistance)) {
            return false;
        }
        if ((damageSource == DamageSource.u || damageSource == DamageSource.y) && this.d(4) != null) {
            act_2.damageItem(this.d(4), (int)(f * 4.0f + a5_0.e(this.Q) * f * 2.0f), this);
            f *= 0.75f;
        }
        this.aq = 1.5f;
        if ((float)this.hurtResistantTime > (float)this.ba / 2.0f) {
            if (f <= this.an) {
                return false;
            }
            this.c(damageSource, f - this.an);
            this.an = f;
        } else {
            this.an = f;
            this.hurtResistantTime = this.ba;
            this.c(damageSource, f);
            this.aB = 10;
            this.a8 = 10;
        }
        this.aJ = 0.0f;
        Entity entity = aDJ.d(damageSource);
        if (entity instanceof EntityLivingBase) {
            this.b((EntityLivingBase)entity);
        }
        if (entity instanceof EntityPlayer) {
            this.a4 = 100;
            this.be = (EntityPlayer)entity;
        } else if (entity instanceof nf_1 && QV.d(nf_12 = (nf_1)entity)) {
            this.a4 = 100;
            this.be = null;
        }
        aV8.a(this.worldObj, (Entity)this, (byte)2);
        if (damageSource != DamageSource.f) {
            this.k();
        }
        double d = entity.posX - this.posX;
        double d2 = entity.posZ - this.posZ;
        while (d * d + d2 * d2 < 1.0E-4) {
            d = (MathInvoker.a() - MathInvoker.a()) * 0.01;
            d2 = (MathInvoker.a() - MathInvoker.a()) * 0.01;
        }
        this.aJ = (float)(MathHelper.c(d2, d) * 180.0 / Math.PI - (double)this.rotationYaw);
        this.a(entity, f, d, d2);
        if (this.a() <= 0.0f) {
            String string = this.C();
            this.a(string, this.f(), this.K());
            this.onDeath(damageSource);
        } else {
            String string = this.d();
            this.a(string, this.f(), this.K());
        }
        return true;
    }

    public void d(float f) {
        float f2 = this.a();
        if (f2 > 0.0f) {
            this.i(f2 + f);
        }
    }

    protected String C() {
        return e_0.d;
    }

    @Override
    public Vec3 an() {
        return this.a(1.0f);
    }

    public void f(float f, float f2) {
        if (this.ad()) {
            float f3;
            if (!this.isInWater() || this instanceof EntityPlayer && aSY.d(((EntityPlayer)this).abilities)) {
                if (!this.o() || this instanceof EntityPlayer && aSY.d(((EntityPlayer)this).abilities)) {
                    float f4 = 0.91f;
                    if (this.onGround) {
                        f4 = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.91f;
                    }
                    float f5 = 0.16277136f / (f4 * f4 * f4);
                    f3 = this.onGround ? this.n() * f5 : this.aZ;
                    this.a(f, f2, f3);
                    f4 = 0.91f;
                    if (this.onGround) {
                        f4 = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.91f;
                    }
                    if (this.r()) {
                        boolean bl;
                        float f6 = 0.15f;
                        this.motionX = MathHelper.b(this.motionX, (double)-0.15f, (double)0.15f);
                        this.motionZ = MathHelper.b(this.motionZ, (double)-0.15f, (double)0.15f);
                        this.fallDistance = 0.0f;
                        if (this.motionY < -0.15) {
                            this.motionY = -0.15;
                        }
                        boolean bl2 = bl = this.isSneaking() && this instanceof EntityPlayer;
                        if (this.motionY < 0.0) {
                            this.motionY = 0.0;
                        }
                    }
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    if (this.g && this.r()) {
                        this.motionY = 0.2;
                    }
                    this.motionY = !(!this.worldObj.isRemote || aV8.isBlockLoaded(this.worldObj, new BlockPos((int)this.posX, 0, (int)this.posZ)) && aqp_2.a(aV8.x(this.worldObj, new BlockPos((int)this.posX, 0, (int)this.posZ)))) ? (this.posY > 0.0 ? -0.1 : 0.0) : (this.motionY -= 0.08);
                    this.motionY *= (double)0.98f;
                    this.motionX *= (double)f4;
                    this.motionZ *= (double)f4;
                } else {
                    double d = this.posY;
                    this.a(f, f2, 0.02f);
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    this.motionX *= 0.5;
                    this.motionY *= 0.5;
                    this.motionZ *= 0.5;
                    this.motionY -= 0.02;
                    if (this.g && this.c(this.motionX, this.motionY + (double)0.6f - this.posY + d, this.motionZ)) {
                        this.motionY = 0.3f;
                    }
                }
            } else {
                double d = this.posY;
                f3 = 0.8f;
                float f7 = 0.02f;
                float f8 = alf_0.a((Entity)this);
                if (f8 > 3.0f) {
                    f8 = 3.0f;
                }
                if (!this.onGround) {
                    f8 *= 0.5f;
                }
                if (f8 > 0.0f) {
                    f3 += (0.54600006f - f3) * f8 / 3.0f;
                    f7 += (this.n() - f7) * f8 / 3.0f;
                }
                this.a(f, f2, f7);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= (double)f3;
                this.motionY *= (double)0.8f;
                this.motionZ *= (double)f3;
                this.motionY -= 0.02;
                if (this.g && this.c(this.motionX, this.motionY + (double)0.6f - this.posY + d, this.motionZ)) {
                    this.motionY = 0.3f;
                }
            }
        }
        this.aM = this.aq;
        double d = this.posX - this.prevPosX;
        double d2 = this.posZ - this.prevPosZ;
        float f9 = MathHelper.e(d * d + d2 * d2) * 4.0f;
        if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        this.aq += (f9 - this.aq) * 0.4f;
        this.aU += this.aq;
    }

    public boolean c(EntityLivingBase entityLivingBase) {
        return this.a(entityLivingBase.getTeam());
    }

    protected float f() {
        return 1.0f;
    }

    @Override
    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
        if (!this.isInWater()) {
            this.G();
        }
        if (!this.worldObj.isRemote && this.fallDistance > 3.0f) {
            IBlockState iBlockState = aV8.q(this.worldObj, blockPos);
            Block block2 = BlockStateInvoker.getBlock(iBlockState);
            float f = MathHelper.c(this.fallDistance - 3.0f);
            if (BlocksInvoker.getBlockState(block2) != Material.air) {
                double d2 = MathInvoker.a(0.2f + f / 15.0f, 10.0f);
                if (d2 > 2.5) {
                    d2 = 2.5;
                }
                int n = (int)(150.0 * d2);
                a3V.a((WorldServer)this.worldObj, B7.BLOCK_DUST, this.posX, this.posY, this.posZ, n, 0.0, 0.0, 0.0, 0.15f, new int[]{BlocksInvoker.a(iBlockState)});
            }
        }
        super.a(d, bl, block, blockPos);
    }

    public int aa() {
        return this.as;
    }

    protected void l() {
        this.motionY = this.jumpMotion;
        if (this.isPotionActive(Potion.jump)) {
            this.motionY += (double)((float)(a3M.g(this.getActivePotionEffect(Potion.jump)) + 1) * 0.1f);
        }
        if (this.isSprinting()) {
            float f = (float)MathInvoker.o(this.rotationYaw);
            this.motionX -= (double)(MathHelper.sin(f) * 0.2f);
            this.motionZ += (double)(MathHelper.cos(f) * 0.2f);
        }
        this.p = true;
    }

    @Override
    public void setSprinting(boolean bl) {
        super.setSprinting(bl);
        ahw_2 ahw_22 = this.a(abb_0.e);
        if (Ma.a(ahw_22, a_) != null) {
            Ma.b(ahw_22, aV);
        }
        Ma.a(ahw_22, aV);
    }

    public void onLivingUpdate() {
        if (this.ao > 0) {
            --this.ao;
        }
        if (this.aT > 0) {
            double d = this.posX + (this.aO - this.posX) / (double)this.aT;
            double d2 = this.posY + (this.a0 - this.posY) / (double)this.aT;
            double d3 = this.posZ + (this.a6 - this.posZ) / (double)this.aT;
            double d4 = MathHelper.j(this.bd - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d4 / (double)this.aT);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.al - (double)this.rotationPitch) / (double)this.aT);
            --this.aT;
            this.j(d, d2, d3);
            this.d(this.rotationYaw, this.rotationPitch);
        } else if (!this.ad()) {
            this.motionX *= 0.98;
            this.motionY *= 0.98;
            this.motionZ *= 0.98;
        }
        if (MathInvoker.a(this.motionX) < 0.005) {
            this.motionX = 0.0;
        }
        if (MathInvoker.a(this.motionY) < 0.005) {
            this.motionY = 0.0;
        }
        if (MathInvoker.a(this.motionZ) < 0.005) {
            this.motionZ = 0.0;
        }
        ProfilerInvoker.startSection(this.worldObj.A, e_0.u);
        if (this.h()) {
            this.isJumping = false;
            this.moveStrafing = 0.0f;
            this.moveForward = 0.0f;
            this.aX = 0.0f;
        } else if (this.ad()) {
            ProfilerInvoker.startSection(this.worldObj.A, e_0.s);
            this.updateEntityActionState();
            ProfilerInvoker.endSection(this.worldObj.A);
        }
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, e_0.v);
        if (this.isJumping) {
            if (this.isInWater()) {
                this.M();
            } else if (this.o()) {
                this.a();
            } else if (this.onGround && this.ao == 0) {
                this.l();
                this.ao = wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.NOJUMPDELAY)) ? 0 : 10;
            }
        } else {
            this.ao = 0;
        }
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, e_0.c);
        this.moveStrafing *= 0.98f;
        this.moveForward *= 0.98f;
        this.aX *= 0.9f;
        this.f(this.moveStrafing, this.moveForward);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, e_0.g);
        if (!this.worldObj.isRemote) {
            this.L();
        }
        ProfilerInvoker.endSection(this.worldObj.A);
    }

    public boolean d(Entity entity) {
        this.c(entity);
        return false;
    }

    @Override
    public abstract ItemStack[] ae();

    protected void w() {
        aom_0.b(this.l, 8, axt_2.a((byte)0));
        aom_0.b(this.l, 7, P8.d(0));
    }

    protected boolean S() {
        return false;
    }

    public void h(float f) {
        this.aC = f;
    }
}

