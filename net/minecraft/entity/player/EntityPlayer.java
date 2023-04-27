/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.entity.player;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ServerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.move.Sprint;
import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import net.minecraft.init.Blocks;
import net.minecraft.network.packts.S12PacketEntityVelocity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.B7;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CG;
import net.ChatComponentText;
import net.DD;
import deobf.EntityArrow;
import deobf.EntityMinecart;
import deobf.EntityPlayerMP;
import deobf.EnumFacing;
import net.HX;
import net.IBlockState;
import net.Items;
import net.J9;
import net.Ma;
import net.Material;
import net.MathHelper;
import net.NBTTagCompound;
import net.ND;
import net.P8;
import net.Potion;
import net.QU;
import net.TH;
import net.Team;
import net.VM;
import net.World;
import net.a35;
import net.a3D;
import net.a3M;
import net.a3V;
import net.a4Z;
import net.a5_0;
import net.a6z_0;
import net.a7K;
import net.a9Q;
import net.aBO;
import net.aDJ;
import net.aH2;
import net.aL0;
import net.aMA;
import net.aNE;
import net.aOA;
import net.aRW;
import net.aSK;
import net.aSY;
import net.aV8;
import net.aX4;
import net.aas_1;
import net.abb_0;
import net.acl_0;
import net.act_2;
import net.adk_0;
import net.aea_1;
import net.afy_2;
import net.ahw_2;
import net.ai7_0;
import net.ald_0;
import net.alf_0;
import net.aln_1;
import net.amv_2;
import net.aom_0;
import net.aop_1;
import net.aox_1;
import net.apf_0;
import net.ar0_0;
import net.aw1_0;
import net.awc_1;
import net.awn_1;
import net.awv_1;
import net.axt_2;
import net.axx_1;
import net.dv_1;
import net.dz_0;
import net.gj_1;
import net.gp_2;
import net.h__0;
import net.hs_0;
import net.ht_0;
import net.k_0;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.GameType;
import net.ms_0;
import net.my_0;
import net.na_1;
import net.ne_2;
import net.nh_1;
import net.og_0;
import net.oo_1;
import net.ov_1;
import net.px_0;
import net.qq_2;
import net.qv_0;
import net.rm_2;
import net.rs_1;
import net.sd_1;
import net.tc_0;
import net.ti_1;
import net.tn_0;
import net.tx_2;
import net.ub_1;
import net.wr_1;
import net.za_2;


public abstract class EntityPlayer
extends EntityLivingBase {
    protected GameProfile bl;
    private ItemStack bs;
    public float bO;
    private int br;
    public int bx;
    public tx_2 abilities;
    public Container bI;
    public double bj;
    protected boolean sleeping;
    public float bn;
    protected float bg = 0.02f;
    private BlockPos bh;
    public double bN;
    public double bq;
    protected float bt = 0.1f;
    protected int flyToggleTimer;
    private int bE;
    private boolean bH = false;
    private wr_1 bC;
    public int bi;
    private boolean bM;
    private int bR;
    public float bJ;
    public double bG;
    public float bz;
    private BlockPos bw;
    public double by;
    public boolean bv;
    public BlockPos bm;
    public int bB;
    public int bL;
    public Container bp;
    public float bS;
    public float bo;
    public double bF;
    public oo_1 bk;
    private int bP;
    protected aX4 bf;
    public aSK inventory = new aSK(this);
    public float bQ;

    @Override
    public double H() {
        return -0.35;
    }

    public void f() {
        this.bs = null;
        this.bE = 0;
        if (!this.worldObj.isRemote) {
            this.a(false);
        }
    }

    public boolean z() {
        return this.a() > 0.0f && this.a() < this.b();
    }

    public static UUID a(String string) {
        return awc_1.a(StringInvoker.a(aL0.a(aL0.a(new StringBuilder(), aRW.H), string).toString(), Charsets.UTF_8));
    }

    @Override
    public void c(int n, ItemStack itemStack) {
        this.inventory.d[n] = itemStack;
    }

    public boolean a(BlockPos blockPos, EnumFacing enumFacing, ItemStack itemStack) {
        return this.abilities.b();
    }

    public za_2 a() {
        return aV8.v(this.worldObj);
    }

    @Override
    public void b(float f, float f2) {
        if (!aSY.f(this.abilities)) {
            if (f >= 2.0f) {
                this.addStat(aop_1.Z, (int)MathInvoker.f((double)f * 100.0));
            }
            super.b(f, f2);
        }
    }

    public void a(awn_1 awn_12) {
    }

    @Override
    public float o() {
        return aom_0.a(this.t(), 17);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (aSY.b(this.abilities) && !aDJ.g(damageSource)) {
            return false;
        }
        this.aF = 0;
        if (this.a() <= 0.0f) {
            return false;
        }
        if (this.y() && !this.worldObj.isRemote) {
            this.a(true, true, false);
        }
        if (aDJ.c(damageSource)) {
            if (aV8.p(this.worldObj) == EnumDifficulty.PEACEFUL) {
                f = 0.0f;
            }
            if (aV8.p(this.worldObj) == EnumDifficulty.EASY) {
                f = f / 2.0f + 1.0f;
            }
            if (aV8.p(this.worldObj) == EnumDifficulty.HARD) {
                f = f * 3.0f / 2.0f;
            }
        }
        if (f == 0.0f) {
            return false;
        }
        Entity entity = aDJ.d(damageSource);
        if (entity instanceof EntityArrow && ((EntityArrow)entity).ak != null) {
            entity = ((EntityArrow)entity).ak;
        }
        return super.a(damageSource, f);
    }

    public boolean a(boolean bl) {
        return net.K.a(this.bf) && !aSY.b(this.abilities);
    }

    public void a(boolean bl, boolean bl2, boolean bl3) {
        this.c(0.6f, 1.8f);
        IBlockState iBlockState = aV8.q(this.worldObj, this.bm);
        if (this.bm != null && BlockStateInvoker.getBlock(iBlockState) == Blocks.aw) {
            aV8.a(this.worldObj, this.bm, BlockStateInvoker.a(iBlockState, gp_2.Q, Boolean.FALSE), 4);
            BlockPos blockPos = ND.a(this.worldObj, this.bm, 0);
            blockPos = amv_2.e(this.bm);
            this.j((float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.1f, (float)amv_2.i(blockPos) + 0.5f);
        }
        this.sleeping = false;
        if (!this.worldObj.isRemote) {
            aV8.b(this.worldObj);
        }
        this.br = 0;
        this.a(this.bm, false);
    }

    public int g() {
        return this.bP;
    }

    public boolean a(EntityPlayer entityPlayer) {
        Team team;
        Team team2 = this.getTeam();
        return !a3D.a(team2, team = entityPlayer.getTeam()) || a3D.e(team2);
    }

    @Override
    public void a(Entity entity, int n) {
        this.j(n);
        Collection collection = VM.a(this.a(), aOA.h);
        if (entity instanceof EntityPlayer) {
            this.b(aop_1.j);
            ms_0.a(collection, VM.a(this.a(), aOA.e));
            ms_0.a(collection, this.a(entity));
        } else {
            this.b(aop_1.y);
        }
        Iterator iterator = ms_0.a(collection);
        while (dz_0.c(iterator)) {
            acl_0 acl_02 = (acl_0)dz_0.b(iterator);
            QU qU = VM.c(this.a(), this.getName(), acl_02);
            hs_0.a(qU);
        }
    }

    public void i(boolean bl) {
        this.a(InventoryInvoker.a(this.inventory, this.inventory.a, InventoryInvoker.g(this.inventory) != null ? InventoryInvoker.g((aSK)this.inventory).a : 1), false, true);
    }

    @Override
    public ItemStack ah() {
        return InventoryInvoker.g(this.inventory);
    }

    @Override
    public String getName() {
        return this.bl.getName();
    }

    @Override
    protected boolean h() {
        return this.a() <= 0.0f || this.y();
    }

    @Override
    protected String C() {
        return aRW.m;
    }

    public int U() {
        return this.bL >= 30 ? 112 + (this.bL - 30) * 9 : (this.bL >= 15 ? 37 + (this.bL - 15) * 5 : 7 + this.bL * 2);
    }

    public void a(GameType gameType) {
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
        aom_0.a(this.l, 17, axx_1.a(0.0f));
        aom_0.a(this.l, 18, P8.d(0));
        aom_0.a(this.l, 10, axt_2.a((byte)0));
    }

    public void b(IChatComponent iChatComponent) {
    }

    public void a(rs_1 rs_12) {
    }

    @Override
    public boolean b(int n, ItemStack itemStack) {
        if (n < this.inventory.b.length) {
            InventoryInvoker.a(this.inventory, n, itemStack);
            return true;
        }
        int n2 = n - 100;
        if (n2 < this.inventory.d.length) {
            int n3 = n2 + 1;
            if (act_2.k(itemStack) != null && (act_2.k(itemStack) instanceof ItemArmor ? CG.a(itemStack) != n3 : n3 != 4 || act_2.k(itemStack) != Items.skull && !(act_2.k(itemStack) instanceof ItemBlock))) {
                return false;
            }
            InventoryInvoker.a(this.inventory, n2 + this.inventory.b.length, itemStack);
            return true;
        }
        int n4 = n - 200;
        if (n4 < ald_0.b(this.bC)) {
            ald_0.a(this.bC, n4, itemStack);
            return true;
        }
        return false;
    }

    @Override
    public ItemStack d(int n) {
        return InventoryInvoker.g(this.inventory);
    }

    public boolean A() {
        return this.abilities.b();
    }

    public abstract boolean k();

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase) {
        if (entityLivingBase instanceof ar0_0) {
            this.b(apf_0.C);
        }
        a9Q a9Q2 = (a9Q)MapInvoker.c(ai7_0.d, P8.d(ub_1.b(entityLivingBase)));
        this.b(a9Q2.e);
    }

    public void m(int n) {
        this.bL -= n;
        if (this.bL < 0) {
            this.bL = 0;
            this.bS = 0.0f;
            this.bi = 0;
        }
        this.bP = a5_0.d(this.Q);
    }

    @Override
    protected String c() {
        return aRW.h;
    }

    public void a(GameProfile gameProfile) {
        this.bl = gameProfile;
    }

    @Override
    public void K() {
        if (!this.worldObj.isRemote && this.isSneaking()) {
            this.mountEntity(null);
            this.e(false);
        } else {
            double d = this.posX;
            double d2 = this.posY;
            double d3 = this.posZ;
            float f = this.rotationYaw;
            float f2 = this.rotationPitch;
            super.K();
            this.bn = this.bO;
            this.bO = 0.0f;
            this.c(this.posX - d, this.posY - d2, this.posZ - d3);
            if (this.r instanceof nh_1) {
                this.rotationPitch = f2;
                this.rotationYaw = f;
                this.aD = ((nh_1)this.r).aD;
            }
        }
    }

    public void d(double d, double d2, double d3) {
        if (this.r == null) {
            if (this.isInsideOfMaterial(Material.M)) {
                int n = MathInvoker.a(MathHelper.e(d * d + d2 * d2 + d3 * d3) * 100.0f);
                this.addStat(aop_1.s, n);
                this.j(0.015f * (float)n * 0.01f);
            } else if (this.isInWater()) {
                int n = MathInvoker.a(MathHelper.e(d * d + d3 * d3) * 100.0f);
                this.addStat(aop_1.Y, n);
                this.j(0.015f * (float)n * 0.01f);
            } else if (this.r()) {
                if (d2 > 0.0) {
                    this.addStat(aop_1.C, (int)MathInvoker.f(d2 * 100.0));
                }
            } else if (this.onGround) {
                int n = MathInvoker.a(MathHelper.e(d * d + d3 * d3) * 100.0f);
                this.addStat(aop_1.d, n);
                if (this.isSprinting()) {
                    this.addStat(aop_1.a, n);
                    this.j(0.099999994f * (float)n * 0.01f);
                } else {
                    if (this.isSneaking()) {
                        this.addStat(aop_1.z, n);
                    }
                    this.j(0.01f * (float)n * 0.01f);
                }
            } else {
                int n = MathInvoker.a(MathHelper.e(d * d + d3 * d3) * 100.0f);
                if (n > 25) {
                    this.addStat(aop_1.D, n);
                }
            }
        }
    }

    public static UUID b(GameProfile gameProfile) {
        UUID uUID = a4Z.a(gameProfile);
        uUID = EntityPlayer.a(gameProfile.getName());
        return uUID;
    }

    public boolean ae() {
        return this.bM;
    }

    public boolean a(aea_1 aea_12) {
        return (aom_0.g(this.t(), 10) & aMA.c(aea_12)) == aMA.c(aea_12);
    }

    public void n() {
        if (this.bs != null) {
            act_2.b(this.bs, this.worldObj, this, this.bE);
        }
        this.f();
    }

    @Override
    protected boolean S() {
        return true;
    }

    @Override
    protected String e(int n) {
        return n > 4 ? aRW.r : aRW.Y;
    }

    protected void b(ItemStack itemStack, int n) {
        if (act_2.m(itemStack) == ti_1.DRINK) {
            this.a(aRW.o, 0.5f, a5_0.e(this.worldObj.o) * 0.1f + 0.9f);
        }
        if (act_2.m(itemStack) == ti_1.EAT) {
            for (int i = 0; i < n; ++i) {
                Vec3 vec3 = new Vec3(((double)a5_0.e(this.Q) - 0.5) * 0.1, MathInvoker.a() * 0.1 + 0.1, 0.0);
                vec3 = aNE.b(vec3, -this.rotationPitch * (float)Math.PI / 180.0f);
                vec3 = aNE.a(vec3, -this.rotationYaw * (float)Math.PI / 180.0f);
                double d = (double)(-a5_0.e(this.Q)) * 0.6 - 0.3;
                Vec3 vec32 = new Vec3(((double)a5_0.e(this.Q) - 0.5) * 0.3, d, 0.6);
                vec32 = aNE.b(vec32, -this.rotationPitch * (float)Math.PI / 180.0f);
                vec32 = aNE.a(vec32, -this.rotationYaw * (float)Math.PI / 180.0f);
                vec32 = aNE.a(vec32, this.posX, this.posY + (double)this.w(), this.posZ);
                if (act_2.t(itemStack)) {
                    aV8.a(this.worldObj, B7.ITEM_CRACK, vec32.xCoord, vec32.yCoord, vec32.zCoord, vec3.xCoord, vec3.yCoord + 0.05, vec3.zCoord, new int[]{px_0.a(act_2.k(itemStack)), act_2.c(itemStack)});
                    continue;
                }
                aV8.a(this.worldObj, B7.ITEM_CRACK, vec32.xCoord, vec32.yCoord, vec32.zCoord, vec3.xCoord, vec3.yCoord + 0.05, vec3.zCoord, new int[]{px_0.a(act_2.k(itemStack))});
            }
            this.a(aRW.A, 0.5f + 0.5f * (float)a5_0.a(this.Q, 2), (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
        }
    }

    @Override
    protected String z() {
        return aRW.z;
    }

    @Override
    public void b() {
        if (!aSY.d(this.abilities)) {
            super.b();
        }
    }

    @Override
    public boolean y() {
        return this.sleeping;
    }

    public aox_1 a(BlockPos blockPos) {
        if (!this.worldObj.isRemote) {
            if (this.y() || !this.n()) {
                return aox_1.OTHER_PROBLEM;
            }
            if (!qq_2.d(this.worldObj.d)) {
                return aox_1.NOT_POSSIBLE_HERE;
            }
            if (aV8.t(this.worldObj)) {
                return aox_1.NOT_POSSIBLE_NOW;
            }
            if (MathInvoker.a(this.posX - (double)amv_2.j(blockPos)) > 3.0 || MathInvoker.a(this.posY - (double)amv_2.h(blockPos)) > 2.0 || MathInvoker.a(this.posZ - (double)amv_2.i(blockPos)) > 3.0) {
                return aox_1.TOO_FAR_AWAY;
            }
            double d = 8.0;
            double d2 = 5.0;
            List list = aV8.a(this.worldObj, ne_2.class, new rm_2((double)amv_2.j(blockPos) - d, (double)amv_2.h(blockPos) - d2, (double)amv_2.i(blockPos) - d, (double)amv_2.j(blockPos) + d, (double)amv_2.h(blockPos) + d2, (double)amv_2.i(blockPos) + d));
            if (!ListInvoker.isEmpty(list)) {
                return aox_1.NOT_SAFE;
            }
        }
        if (this.isRiding()) {
            this.mountEntity(null);
        }
        this.c(0.2f, 0.2f);
        if (aV8.isBlockLoaded(this.worldObj, blockPos)) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aV8.q(this.worldObj, blockPos), gj_1.P));
            float f = 0.5f;
            float f2 = 0.5f;
            switch (enumFacing) {
                case SOUTH: {
                    f2 = 0.9f;
                    break;
                }
                case NORTH: {
                    f2 = 0.1f;
                    break;
                }
                case WEST: {
                    f = 0.1f;
                    break;
                }
                case EAST: {
                    f = 0.9f;
                }
            }
            this.a(enumFacing);
            this.j((float)amv_2.j(blockPos) + f, (float)amv_2.h(blockPos) + 0.6875f, (float)amv_2.i(blockPos) + f2);
        } else {
            this.j((float)amv_2.j(blockPos) + 0.5f, (float)amv_2.h(blockPos) + 0.6875f, (float)amv_2.i(blockPos) + 0.5f);
        }
        this.sleeping = true;
        this.br = 0;
        this.bm = blockPos;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.motionX = 0.0;
        if (!this.worldObj.isRemote) {
            aV8.b(this.worldObj);
        }
        return aox_1.OK;
    }

    protected void o() {
        if (this.bs != null) {
            this.b(this.bs, 16);
            int n = this.bs.a;
            ItemStack itemStack = act_2.b(this.bs, this.worldObj, this);
            if (itemStack != this.bs || itemStack.a != n) {
                this.inventory.b[this.inventory.a] = itemStack;
                if (itemStack.a == 0) {
                    this.inventory.b[this.inventory.a] = null;
                }
            }
            this.f();
        }
    }

    public EntityPlayer(World world, GameProfile gameProfile) {
        super(world);
        this.bC = new wr_1();
        this.bf = new aX4();
        this.abilities = new tx_2();
        this.a(EntityPlayer.b(gameProfile));
        this.bl = gameProfile;
        this.bI = this.bp = new aas_1(this.inventory, !world.isRemote, this);
        BlockPos blockPos = aV8.m(world);
        this.c((double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos) + 1, (double)amv_2.i(blockPos) + 0.5, 0.0f, 0.0f);
        this.t = 20;
        this.bv = true;
    }

    private boolean Z() {
        return BlockStateInvoker.getBlock(aV8.q(this.worldObj, this.bm)) == Blocks.aw;
    }

    public void C() {
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(ht_0.b(this.N(), abb_0.f), 1.0);
        Ma.a(this.a(abb_0.e), 0.1f);
    }

    public void k(int n) {
        this.bL += n;
        if (this.bL < 0) {
            this.bL = 0;
            this.bS = 0.0f;
            this.bi = 0;
        }
        if (this.bL % 5 == 0 && (float)this.bR < (float)this.ticksExisted - 100.0f) {
            float f = this.bL > 30 ? 1.0f : (float)this.bL / 30.0f;
            aV8.a(this.worldObj, (Entity)this, aRW.F, f * 0.75f, 1.0f);
            this.bR = this.ticksExisted;
        }
    }

    @Override
    protected void F() {
        if (!this.k()) {
            super.F();
        }
    }

    public aX4 O() {
        return this.bf;
    }

    public boolean n(Entity entity) {
        if (this.k()) {
            if (entity instanceof rs_1) {
                this.a((rs_1)((Object)entity));
            }
            return false;
        }
        ItemStack itemStack = this.S();
        ItemStack itemStack2 = act_2.C(itemStack);
        if (!entity.b(this)) {
            if (entity instanceof EntityLivingBase) {
                if (aSY.a(this.abilities)) {
                    itemStack = itemStack2;
                }
                if (act_2.a(itemStack, this, (EntityLivingBase)entity)) {
                    if (itemStack.a <= 0 && !aSY.a(this.abilities)) {
                        this.W();
                    }
                    return true;
                }
            }
            return false;
        }
        if (itemStack == this.S()) {
            if (itemStack.a <= 0 && !aSY.a(this.abilities)) {
                this.W();
            } else if (itemStack.a < itemStack2.a && aSY.a(this.abilities)) {
                itemStack.a = itemStack2.a;
            }
        }
        return true;
    }

    @Override
    public Team getTeam() {
        return VM.c(this.a(), this.getName());
    }

    private void c(double d, double d2, double d3) {
        if (this.r != null) {
            int n = MathInvoker.a(MathHelper.e(d * d + d2 * d2 + d3 * d3) * 100.0f);
            if (this.r instanceof EntityMinecart) {
                this.addStat(aop_1.K, n);
                if (this.bh == null) {
                    this.bh = new BlockPos(this);
                } else if (amv_2.c(this.bh, MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) >= 1000000.0) {
                    this.b(apf_0.B);
                }
            } else if (this.r instanceof EntityBoat) {
                this.addStat(aop_1.e, n);
            } else if (this.r instanceof nh_1) {
                this.addStat(aop_1.m, n);
            } else if (this.r instanceof na_1) {
                this.addStat(aop_1.X, n);
            }
        }
    }

    public void j(float f) {
        if (!aSY.b(this.abilities) && !this.worldObj.isRemote) {
            this.bf.b(f);
        }
    }

    @Override
    protected void g(float f) {
        this.inventory.a(f);
    }

    @Override
    public float w() {
        float f = 1.62f;
        if (this.y()) {
            f = 0.2f;
        }
        if (this.isSneaking()) {
            f -= 0.08f;
        }
        return f;
    }

    public static BlockPos a(World world, BlockPos blockPos, boolean bl) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (block != Blocks.aw) {
            return null;
        }
        return ND.a(world, blockPos, 0);
    }

    public void n(int n) {
        this.j(n);
        int n2 = Integer.MAX_VALUE - this.bi;
        if (n > n2) {
            n = n2;
        }
        this.bS += (float)n / (float)this.U();
        this.bi += n;
        while (this.bS >= 1.0f) {
            this.bS = (this.bS - 1.0f) * (float)this.U();
            this.k(1);
            this.bS /= (float)this.U();
        }
    }

    public float af() {
        if (this.bm != null) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aV8.q(this.worldObj, this.bm), gj_1.P));
            switch (enumFacing) {
                case SOUTH: {
                    return 90.0f;
                }
                case NORTH: {
                    return 270.0f;
                }
                case WEST: {
                    return 0.0f;
                }
                case EAST: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }

    @Override
    protected void c(DamageSource damageSource, float f) {
        if (!this.a(damageSource)) {
            if (!aDJ.i(damageSource) && this.ah() && f > 0.0f) {
                f = (1.0f + f) * 0.5f;
            }
            f = this.b(damageSource, f);
            float f2 = f = this.a(damageSource, f);
            f = MathInvoker.b(f - this.o(), 0.0f);
            this.b(this.o() - (f2 - f));
            if (f != 0.0f) {
                this.j(aDJ.j(damageSource));
                float f3 = this.a();
                this.i(this.a() - f);
                aw1_0.a(this.A(), damageSource, f3, f);
                if (f < 3.4028235E37f) {
                    this.addStat(aop_1.O, MathInvoker.a(f * 10.0f));
                }
            }
        }
    }

    public int R() {
        return this.bE;
    }

    @Override
    public void a(double d) {
        super.a(d);
        this.b(aop_1.k);
        if (this.isSprinting()) {
            this.j(0.8f);
        } else {
            this.j(0.2f);
        }
    }

    @Override
    public ItemStack a(int n) {
        return InventoryInvoker.a(this.inventory, n);
    }

    public void a(StatBase statBase) {
    }

    public void l(int n) {
        aom_0.b(this.l, 18, P8.d(n));
    }

    @Override
    public int L() {
        return 10;
    }

    public void a(ItemStack itemStack) {
    }

    public GameProfile X() {
        return this.bl;
    }

    public boolean ah() {
        return this.isUsingItem() && px_0.d(act_2.k(this.bs), this.bs) == ti_1.BLOCK;
    }

    @Override
    public void a(String string, float f, float f2) {
        aV8.a(this.worldObj, this, string, f, f2);
    }

    public boolean ab() {
        return false;
    }

    public void l(Entity entity) {
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        this.c(0.2f, 0.2f);
        this.j(this.posX, this.posY, this.posZ);
        this.motionY = 0.1f;
        if (this.getName().equals(aRW.q)) {
            this.a(new ItemStack(Items.apple, 1), true, false);
        }
        if (!J9.c(aV8.k(this.worldObj), aRW.l)) {
            InventoryInvoker.a(this.inventory);
        }
        this.motionX = -MathHelper.cos((this.aJ + this.rotationYaw) * (float)Math.PI / 180.0f) * 0.1f;
        this.motionZ = -MathHelper.sin((this.aJ + this.rotationYaw) * (float)Math.PI / 180.0f) * 0.1f;
        this.b(aop_1.ac);
        this.a(aop_1.w);
    }

    public ItemStack S() {
        return InventoryInvoker.g(this.inventory);
    }

    @Override
    public void a(byte by) {
        if (by == 9) {
            this.o();
        } else if (by == 23) {
            this.bH = false;
        } else if (by == 22) {
            this.bH = true;
        } else {
            super.a(by);
        }
    }

    public void b(StatBase statBase) {
        this.addStat(statBase, 1);
    }

    public void a(na_1 na_12, rs_1 rs_12) {
    }

    public void addStat(StatBase statBase, int n) {
    }

    @Override
    protected String d() {
        return aRW.i;
    }

    @Override
    public IChatComponent getDisplayName() {
        ChatComponentText chatComponentText = new ChatComponentText(sd_1.a(this.getTeam(), this.getName()));
        HX.a(aBO.f(chatComponentText), new awv_1(k_0.SUGGEST_COMMAND, aL0.a(aL0.a(aL0.a(new StringBuilder(), aRW.Q), this.getName()), aRW.c).toString()));
        HX.a(aBO.f(chatComponentText), this.h());
        HX.a(aBO.f(chatComponentText), this.getName());
        return chatComponentText;
    }

    public boolean isUsingItem() {
        return this.bs != null;
    }

    public void a(BlockPos blockPos, boolean bl) {
        this.bw = blockPos;
        this.bM = bl;
    }

    @Override
    public boolean c() {
        return J9.c(a3V.z(ServerInvoker.d().r[0]), aRW.U);
    }

    public void m(Entity entity) {
        if (entity.aB() && !entity.b((Entity)this)) {
            float f = (float)Ma.d(this.a(abb_0.f));
            int n = 0;
            float f2 = 0.0f;
            f2 = entity instanceof EntityLivingBase ? alf_0.a(this.ah(), ((EntityLivingBase)entity).ae()) : alf_0.a(this.ah(), aH2.UNDEFINED);
            n += alf_0.e(this);
            if (this.isSprinting()) {
                ++n;
            }
            if (f > 0.0f || f2 > 0.0f) {
                aln_1 aln_12;
                boolean bl = this.fallDistance > 0.0f && !this.onGround && !this.r() && !this.isInWater() && !this.isPotionActive(Potion.blindness) && this.r == null && entity instanceof EntityLivingBase;
                if (f > 0.0f) {
                    f *= 1.5f;
                }
                f += f2;
                int n2 = alf_0.a(this);
                if (entity instanceof EntityLivingBase && !entity.ag()) {
                    entity.a(1);
                }
                double d = entity.motionX;
                double d2 = entity.motionY;
                double d3 = entity.motionZ;
                entity.a(aDJ.a(this), f);
                entity.b(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f) * (float)n * 0.5f, 0.1, MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f) * (float)n * 0.5f);
                Object object = (Sprint)ModuleInvoker.isEnable(ModuleRegistry.SPRINT);
                if (!adk_0.a((Sprint)object) || !adk_0.b((Sprint)object)) {
                    this.motionX *= 0.6;
                    this.motionZ *= 0.6;
                    this.setSprinting(false);
                }
                if (entity instanceof EntityPlayerMP && entity.aa) {
                    qv_0.a(((EntityPlayerMP)entity).playerNetServerHandler, new S12PacketEntityVelocity(entity));
                    entity.aa = false;
                    entity.motionX = d;
                    entity.motionY = d2;
                    entity.motionZ = d3;
                }
                this.h(entity);
                if (f2 > 0.0f) {
                    this.l(entity);
                }
                if (f >= 18.0f) {
                    this.b(apf_0.I);
                }
                this.c(entity);
                if (entity instanceof EntityLivingBase) {
                    alf_0.b((EntityLivingBase)entity, this);
                }
                alf_0.a(this, entity);
                object = this.S();
                Entity entity2 = entity;
                if (entity instanceof ov_1 && (aln_12 = ((ov_1)entity).aj) instanceof EntityLivingBase) {
                    entity2 = (EntityLivingBase)((Object)aln_12);
                }
                if (entity2 instanceof EntityLivingBase) {
                    act_2.a((ItemStack)object, (EntityLivingBase)entity2, this);
                    if (((ItemStack)object).a <= 0) {
                        this.W();
                    }
                }
                if (entity instanceof EntityLivingBase) {
                    this.addStat(aop_1.i, MathInvoker.a(f * 10.0f));
                    entity.a(n2 * 4);
                }
                this.j(0.3f);
            }
        }
    }

    @Override
    public void onUpdate() {
        this.H = this.k();
        if (this.k()) {
            this.onGround = false;
        }
        if (this.bs != null) {
            ItemStack itemStack = InventoryInvoker.g(this.inventory);
            if (itemStack == this.bs) {
                if (this.bE <= 25 && this.bE % 4 == 0) {
                    this.b(itemStack, 5);
                }
                if (--this.bE == 0 && !this.worldObj.isRemote) {
                    this.o();
                }
            } else {
                this.f();
            }
        }
        if (this.bB > 0) {
            --this.bB;
        }
        if (this.y()) {
            ++this.br;
            if (this.br > 100) {
                this.br = 100;
            }
            if (!this.worldObj.isRemote) {
                if (!this.Z()) {
                    this.a(true, true, false);
                } else if (aV8.t(this.worldObj)) {
                    this.a(false, true, true);
                }
            }
        } else if (this.br > 0) {
            ++this.br;
            if (this.br >= 110) {
                this.br = 0;
            }
        }
        super.onUpdate();
        if (!this.worldObj.isRemote && this.bI != null && !afy_2.c(this.bI, this)) {
            this.N();
            this.bI = this.bp;
        }
        if (this.ag() && aSY.b(this.abilities)) {
            this.ar();
        }
        this.bq = this.bF;
        this.bG = this.bj;
        this.by = this.bN;
        double d = this.posX - this.bF;
        double d2 = this.posY - this.bj;
        double d3 = this.posZ - this.bN;
        double d4 = 10.0;
        if (d > d4) {
            this.bq = this.bF = this.posX;
        }
        if (d3 > d4) {
            this.by = this.bN = this.posZ;
        }
        if (d2 > d4) {
            this.bG = this.bj = this.posY;
        }
        if (d < -d4) {
            this.bq = this.bF = this.posX;
        }
        if (d3 < -d4) {
            this.by = this.bN = this.posZ;
        }
        if (d2 < -d4) {
            this.bG = this.bj = this.posY;
        }
        this.bF += d * 0.25;
        this.bN += d3 * 0.25;
        this.bj += d2 * 0.25;
        if (this.r == null) {
            this.bh = null;
        }
        if (!this.worldObj.isRemote) {
            net.K.a(this.bf, this);
            this.b(aop_1.ad);
            if (this.n()) {
                this.b(aop_1.w);
            }
        }
        double d5 = MathHelper.b(this.posX, -2.9999999E7, 2.9999999E7);
        double d6 = MathHelper.b(this.posZ, -2.9999999E7, 2.9999999E7);
        if (d5 != this.posX || d6 != this.posZ) {
            this.j(d5, this.posY, d6);
        }
    }

    public boolean i() {
        return this.bH;
    }

    @Override
    public void onLivingUpdate() {
        if (this.flyToggleTimer > 0) {
            --this.flyToggleTimer;
        }
        if (aV8.p(this.worldObj) == EnumDifficulty.PEACEFUL && J9.c(aV8.k(this.worldObj), aRW.u)) {
            if (this.a() < this.b() && this.ticksExisted % 20 == 0) {
                this.d(1.0f);
            }
            if (net.K.a(this.bf) && this.ticksExisted % 10 == 0) {
                net.K.a(this.bf, net.K.b(this.bf) + 1);
            }
        }
        InventoryInvoker.c(this.inventory);
        this.bn = this.bO;
        super.onLivingUpdate();
        ahw_2 ahw_22 = this.a(abb_0.e);
        if (!this.worldObj.isRemote) {
            Ma.a(ahw_22, aSY.c(this.abilities));
        }
        this.aZ = this.bg;
        if (this.isSprinting()) {
            this.aZ = (float)((double)this.aZ + (double)this.bg * 0.3);
        }
        this.a((float)Ma.d(ahw_22));
        float f = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
        float f2 = (float)(MathInvoker.b(-this.motionY * (double)0.2f) * 15.0);
        if (f > 0.1f) {
            f = 0.1f;
        }
        if (!this.onGround || this.a() <= 0.0f) {
            f = 0.0f;
        }
        if (this.onGround || this.a() <= 0.0f) {
            f2 = 0.0f;
        }
        this.bO += (f - this.bO) * 0.4f;
        this.ap += (f2 - this.ap) * 0.8f;
        if (this.a() > 0.0f && !this.k()) {
            rm_2 rm_22 = null;
            rm_22 = this.r != null && !this.r.isDead ? h__0.d(h__0.a(this.getEntityBoundingBox(), this.r.getEntityBoundingBox()), 1.0, 0.0, 1.0) : h__0.d(this.getEntityBoundingBox(), 1.0, 0.5, 1.0);
            List list = aV8.a(this.worldObj, (Entity)this, rm_22);
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (entity.isDead) continue;
                this.i(entity);
            }
        }
    }

    public void j(int n) {
        int n2 = this.Y();
        aom_0.b(this.l, 18, P8.d(n2 + n));
    }

    public void h(Entity entity) {
    }

    public og_0 a(ItemStack itemStack, boolean bl, boolean bl2) {
        return null;
    }

    public void j(boolean bl) {
        this.bH = bl;
    }

    @Override
    public int O() {
        return this.inventory.g();
    }

    @Override
    public boolean at() {
        return !this.sleeping && super.at();
    }

    @Override
    public ItemStack[] ae() {
        return this.inventory.d;
    }

    private void i(Entity entity) {
        entity.d(this);
    }

    public void a(ItemStack itemStack, int n) {
        if (itemStack != this.bs) {
            this.bs = itemStack;
            this.bE = n;
            if (!this.worldObj.isRemote) {
                this.a(true);
            }
        }
    }

    @Override
    public float n() {
        return (float)Ma.d(this.a(abb_0.e));
    }

    @Override
    public boolean e(EntityPlayer entityPlayer) {
        if (!this.ac()) {
            return false;
        }
        if (entityPlayer.k()) {
            return false;
        }
        Team team = this.getTeam();
        return entityPlayer.getTeam() != team || !a3D.d(team);
    }

    public ItemStack ai() {
        return this.bs;
    }

    private Collection<acl_0> a(Entity entity) {
        a35 a352;
        int n;
        a35 a353 = VM.c(this.a(), this.getName());
        int n2 = tc_0.a(sd_1.i(a353));
        if (n2 < aOA.f.length) {
            Iterator iterator = ms_0.a(VM.a(this.a(), aOA.f[n2]));
            while (dz_0.c(iterator)) {
                acl_0 acl_02 = (acl_0)dz_0.b(iterator);
                QU qU = VM.c(this.a(), entity.getName(), acl_02);
                hs_0.a(qU);
            }
        }
        if ((n = tc_0.a(sd_1.i(a352 = VM.c(this.a(), entity.getName())))) < aOA.i.length) {
            return VM.a(this.a(), aOA.i[n]);
        }
        return my_0.c();
    }

    @Override
    public void l() {
        super.l();
        this.b(aop_1.k);
        if (this.isSprinting()) {
            this.j(0.8f);
        } else {
            this.j(0.2f);
        }
    }

    public boolean d() {
        return this.sleeping && this.br >= 100;
    }

    public float getToolDigEfficiency(Block block) {
        float f = InventoryInvoker.a(this.inventory, block);
        if (f > 1.0f) {
            int n = alf_0.getEfficiencyModifier(this);
            InventoryInvoker.g(this.inventory);
            f += (float)(n * n + 1);
        }
        if (this.isPotionActive(Potion.digSpeed)) {
            f *= 1.0f + (float)(a3M.g(this.getActivePotionEffect(Potion.digSpeed)) + 1) * 0.2f;
        }
        if (this.isPotionActive(Potion.digSlowdown)) {
            float f2 = 1.0f;
            switch (a3M.g(this.getActivePotionEffect(Potion.digSlowdown))) {
                case 0: {
                    f2 = 0.3f;
                    break;
                }
                case 1: {
                    f2 = 0.09f;
                    break;
                }
                case 2: {
                    f2 = 0.0027f;
                    break;
                }
                default: {
                    f2 = 8.1E-4f;
                }
            }
            f *= f2;
        }
        if (this.isInsideOfMaterial(Material.M) && !alf_0.c(this)) {
            f /= 5.0f;
        }
        if (!this.onGround) {
            f /= 5.0f;
        }
        return f;
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        if (J9.c(aV8.k(this.worldObj), aRW.g)) {
            return 0;
        }
        int n = this.bL * 7;
        return MathInvoker.b(n, 100);
    }

    @Override
    protected boolean p() {
        return !aSY.d(this.abilities);
    }

    @Override
    protected void updateEntityActionState() {
        super.updateEntityActionState();
        this.e();
        this.aP = this.rotationYaw;
    }

    public og_0 a(ItemStack itemStack, boolean bl) {
        return this.a(itemStack, false, false);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, aRW.n, InventoryInvoker.b(this.inventory, new NBTTagList()));
        tn_0.b(nBTTagCompound, aRW.k, this.inventory.a);
        tn_0.a(nBTTagCompound, aRW.I, this.sleeping);
        tn_0.a(nBTTagCompound, aRW.t, (short)this.br);
        tn_0.a(nBTTagCompound, aRW.W, this.bS);
        tn_0.b(nBTTagCompound, aRW.S, this.bL);
        tn_0.b(nBTTagCompound, aRW.d, this.bi);
        tn_0.b(nBTTagCompound, aRW.s, this.bP);
        tn_0.b(nBTTagCompound, aRW.L, this.Y());
        if (this.bw != null) {
            tn_0.b(nBTTagCompound, aRW.w, amv_2.j(this.bw));
            tn_0.b(nBTTagCompound, aRW.P, amv_2.h(this.bw));
            tn_0.b(nBTTagCompound, aRW.e, amv_2.i(this.bw));
            tn_0.a(nBTTagCompound, aRW.X, this.bM);
        }
        net.K.a(this.bf, nBTTagCompound);
        aSY.a(this.abilities, nBTTagCompound);
        tn_0.a(nBTTagCompound, aRW.K, ald_0.a(this.bC));
        ItemStack itemStack = InventoryInvoker.g(this.inventory);
        if (act_2.k(itemStack) != null) {
            tn_0.a(nBTTagCompound, aRW.p, (NBTBase)act_2.a(itemStack, new NBTTagCompound()));
        }
    }

    public void a(EntityPlayer entityPlayer, boolean bl) {
        InventoryInvoker.a(this.inventory, entityPlayer.inventory);
        this.i(entityPlayer.a());
        this.bf = entityPlayer.bf;
        this.bL = entityPlayer.bL;
        this.bi = entityPlayer.bi;
        this.bS = entityPlayer.bS;
        this.l(entityPlayer.Y());
        this.w = entityPlayer.w;
        this.ae = entityPlayer.ae;
        this.ab = entityPlayer.ab;
        this.bP = entityPlayer.bP;
        this.bC = entityPlayer.bC;
        aom_0.b(this.t(), 10, axt_2.a(aom_0.g(entityPlayer.t(), 10)));
    }

    @Override
    public void f(float f, float f2) {
        double d = this.posX;
        double d2 = this.posY;
        double d3 = this.posZ;
        if (aSY.d(this.abilities) && this.r == null) {
            double d4 = this.motionY;
            float f3 = this.aZ;
            this.aZ = aSY.e(this.abilities) * (float)(this.isSprinting() ? 2 : 1);
            super.f(f, f2);
            this.motionY = d4 * 0.6;
            this.aZ = f3;
        } else {
            super.f(f, f2);
        }
        this.d(this.posX - d, this.posY - d2, this.posZ - d3);
    }

    private void a(EnumFacing enumFacing) {
        this.bQ = 0.0f;
        this.bz = 0.0f;
        switch (enumFacing) {
            case SOUTH: {
                this.bz = -1.8f;
                break;
            }
            case NORTH: {
                this.bz = 1.8f;
                break;
            }
            case WEST: {
                this.bQ = 1.8f;
                break;
            }
            case EAST: {
                this.bQ = -1.8f;
            }
        }
    }

    public int ag() {
        return this.br;
    }

    protected void N() {
        this.bI = this.bp;
    }

    public wr_1 b() {
        return this.bC;
    }

    @Override
    public int P() {
        return aSY.b(this.abilities) ? 0 : 80;
    }

    @Override
    public void b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        aom_0.b(this.t(), 17, axx_1.a(f));
    }

    public BlockPos T() {
        return this.bw;
    }

    protected void a(og_0 og_02) {
        aV8.b(this.worldObj, og_02);
    }

    public void W() {
        InventoryInvoker.a(this.inventory, this.inventory.a, null);
    }

    public void displayGui(dv_1 dv_12) {
    }

    public boolean b(Block block) {
        return InventoryInvoker.b(this.inventory, block);
    }

    public void sendPlayerAbilities() {
    }

    public boolean a(DD dD) {
        if (TH.a(dD)) {
            return true;
        }
        ItemStack itemStack = this.S();
        return act_2.g(itemStack) && act_2.w(itemStack).equals(TH.b(dD));
    }

    @Override
    public void E() {
        super.E();
        afy_2.b(this.bp, this);
        if (this.bI != null) {
            afy_2.b(this.bI, this);
        }
    }

    public int Q() {
        return this.isUsingItem() ? act_2.A(this.bs) - this.bE : 0;
    }

    @Override
    public boolean af() {
        return !aSY.d(this.abilities);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.a(EntityPlayer.b(this.bl));
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aRW.M, 10);
        InventoryInvoker.a(this.inventory, nBTTagList);
        this.inventory.a = tn_0.g(nBTTagCompound, aRW.D);
        this.sleeping = tn_0.c(nBTTagCompound, aRW.B);
        this.br = tn_0.o(nBTTagCompound, aRW.v);
        this.bS = tn_0.k(nBTTagCompound, aRW.V);
        this.bL = tn_0.g(nBTTagCompound, aRW.E);
        this.bi = tn_0.g(nBTTagCompound, aRW.x);
        this.bP = tn_0.g(nBTTagCompound, aRW.a);
        if (this.bP == 0) {
            this.bP = a5_0.d(this.Q);
        }
        this.l(tn_0.g(nBTTagCompound, aRW.O));
        if (this.sleeping) {
            this.bm = new BlockPos(this);
            this.a(true, true, false);
        }
        if (tn_0.a(nBTTagCompound, aRW.T, 99) && tn_0.a(nBTTagCompound, aRW.G, 99) && tn_0.a(nBTTagCompound, aRW.j, 99)) {
            this.bw = new BlockPos(tn_0.g(nBTTagCompound, aRW.C), tn_0.g(nBTTagCompound, aRW.b), tn_0.g(nBTTagCompound, aRW.f));
            this.bM = tn_0.c(nBTTagCompound, aRW.N);
        }
        net.K.b(this.bf, nBTTagCompound);
        aSY.b(this.abilities, nBTTagCompound);
        if (tn_0.a(nBTTagCompound, aRW.y, 9)) {
            NBTTagList nBTTagList2 = tn_0.c(nBTTagCompound, aRW.J, 10);
            ald_0.a(this.bC, nBTTagList2);
        }
    }

    public int Y() {
        return aom_0.h(this.l, 18);
    }

    public void a(a6z_0 a6z_02) {
    }

    public void a(a7K a7K2) {
    }

    @Override
    public void m() {
        this.c(0.6f, 1.8f);
        super.m();
        this.i(this.b());
        this.aS = 0;
    }

    public float V() {
        int n = 0;
        ItemStack[] itemStackArray = this.inventory.d;
        int n2 = itemStackArray.length;
        for (int i = 0; i < n2; ++i) {
            ItemStack cfr_ignored_0 = itemStackArray[i];
            ++n;
        }
        return (float)n / (float)this.inventory.d.length;
    }
}

