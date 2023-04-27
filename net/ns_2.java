/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.Vec3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ns
 */
public class ns_2
extends nl_1
implements ay3_0,
aln_1,
ar0_0 {
    public boolean bU;
    public ov_1 bC;
    private Entity bD;
    public double bN;
    public ov_1 bL;
    public double bF;
    public double bI;
    public double[][] bM = new double[64][3];
    public int bE;
    public float bR;
    public ov_1 bT;
    public boolean bH;
    public ov_1 bJ;
    public ov_1 bO;
    public ov_1 bK;
    public ox_2 bQ;
    public float bB;
    public ov_1[] bG;
    public int bP = -1;
    public ov_1 bS;

    private boolean a(rm_2 rm_22) {
        int n = MathHelper.floor_double(rm_22.e);
        int n2 = MathHelper.floor_double(rm_22.a);
        int n3 = MathHelper.floor_double(rm_22.f);
        int n4 = MathHelper.floor_double(rm_22.b);
        int n5 = MathHelper.floor_double(rm_22.c);
        int n6 = MathHelper.floor_double(rm_22.d);
        boolean bl = false;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    BlockPos blockPos = new BlockPos(i, j, k);
                    Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos));
                    if (BlocksInvoker.getBlockState(block) == Material.air) continue;
                    if (block != Blocks.ao && block != Blocks.O && block != Blocks.H && block != Blocks.bedrock && block != Blocks.bz && J9.c(aV8.k(this.worldObj), jp_0.a)) {
                        if (aV8.j(this.worldObj, blockPos)) continue;
                    }
                    bl = true;
                }
            }
        }
        double d = rm_22.e + (rm_22.b - rm_22.e) * (double)a5_0.e(this.Q);
        double d2 = rm_22.a + (rm_22.c - rm_22.a) * (double)a5_0.e(this.Q);
        double d3 = rm_22.f + (rm_22.d - rm_22.f) * (double)a5_0.e(this.Q);
        aV8.a(this.worldObj, B7.EXPLOSION_LARGE, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        return bl;
    }

    public double[] a(int n, float f) {
        if (this.a() <= 0.0f) {
            f = 0.0f;
        }
        f = 1.0f - f;
        int n2 = this.bP - n * 1 & 0x3F;
        int n3 = this.bP - n * 1 - 1 & 0x3F;
        double[] dArray = new double[3];
        double d = this.bM[n2][0];
        double d2 = MathHelper.j(this.bM[n3][0] - d);
        dArray[0] = d + d2 * (double)f;
        d = this.bM[n2][1];
        d2 = this.bM[n3][1] - d;
        dArray[1] = d + d2 * (double)f;
        dArray[2] = this.bM[n2][2] + (this.bM[n3][2] - this.bM[n2][2]) * (double)f;
        return dArray;
    }

    @Override
    protected void R() {
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (damageSource instanceof aed_1 && alk_0.b((aed_1)damageSource)) {
            this.b(damageSource, f);
        }
        return false;
    }

    public ns_2(World world) {
        super(world);
        this.bC = new ov_1(this, jp_0.k, 6.0f, 6.0f);
        this.bS = new ov_1(this, jp_0.h, 8.0f, 8.0f);
        this.bJ = new ov_1(this, jp_0.c, 4.0f, 4.0f);
        this.bK = new ov_1(this, jp_0.d, 4.0f, 4.0f);
        this.bL = new ov_1(this, jp_0.b, 4.0f, 4.0f);
        this.bO = new ov_1(this, jp_0.e, 4.0f, 4.0f);
        this.bT = new ov_1(this, jp_0.i, 4.0f, 4.0f);
        this.bG = new ov_1[]{this.bC, this.bS, this.bJ, this.bK, this.bL, this.bO, this.bT};
        this.i(this.b());
        this.c(16.0f, 8.0f);
        this.H = true;
        this.S = true;
        this.bF = 100.0;
        this.G = true;
    }

    @Override
    public boolean a(ov_1 ov_12, DamageSource damageSource, float f) {
        if (ov_12 != this.bC) {
            f = f / 4.0f + 1.0f;
        }
        float f2 = this.rotationYaw * (float)Math.PI / 180.0f;
        float f3 = MathHelper.sin(f2);
        float f4 = MathHelper.cos(f2);
        this.bI = this.posX + (double)(f3 * 5.0f) + (double)((a5_0.e(this.Q) - 0.5f) * 2.0f);
        this.bF = this.posY + (double)(a5_0.e(this.Q) * 3.0f) + 1.0;
        this.bN = this.posZ - (double)(f4 * 5.0f) + (double)((a5_0.e(this.Q) - 0.5f) * 2.0f);
        this.bD = null;
        if (aDJ.d(damageSource) instanceof EntityPlayer || aDJ.h(damageSource)) {
            this.b(damageSource, f);
        }
        return true;
    }

    @Override
    protected float f() {
        return 5.0f;
    }

    @Override
    protected String ac() {
        return jp_0.l;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 200.0);
    }

    @Override
    public void ao() {
        this.E();
    }

    private void d() {
        this.bH = false;
        ArrayList arrayList = my_0.a((Iterable)aV8.e(this.worldObj));
        Iterator iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            if (!a6w_0.l((EntityPlayer)dz_0.b(iterator))) continue;
            dz_0.a(iterator);
        }
        if (a5_0.a(this.Q, 2) == 0 && !ListInvoker.isEmpty(arrayList)) {
            this.bD = (Entity)ListInvoker.get(arrayList, a5_0.a(this.Q, ListInvoker.size(arrayList)));
        } else {
            this.bI = 0.0;
            this.bF = 70.0f + a5_0.e(this.Q) * 50.0f;
            this.bN = 0.0;
            this.bI += (double)(a5_0.e(this.Q) * 120.0f - 60.0f);
            this.bN += (double)(a5_0.e(this.Q) * 120.0f - 60.0f);
            double d = this.posX - this.bI;
            double d2 = this.posY - this.bF;
            double d3 = this.posZ - this.bN;
            boolean bl = d * d + d2 * d2 + d3 * d3 > 100.0;
            this.bD = null;
        }
    }

    @Override
    protected void g() {
        super.g();
    }

    @Override
    public boolean N() {
        return false;
    }

    private void a(List<Entity> list) {
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            Entity entity2 = entity;
            if (!(entity2 instanceof EntityLivingBase)) continue;
            entity2.a(aDJ.a(this), 10.0f);
            this.a(this, entity2);
        }
    }

    private void b(List<Entity> list) {
        double d = (this.bS.getEntityBoundingBox().e + this.bS.getEntityBoundingBox().b) / 2.0;
        double d2 = (this.bS.getEntityBoundingBox().f + this.bS.getEntityBoundingBox().d) / 2.0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (!(entity instanceof EntityLivingBase)) continue;
            double d3 = entity.posX - d;
            double d4 = entity.posZ - d2;
            double d5 = d3 * d3 + d4 * d4;
            entity.b(d3 / d5 * 4.0, 0.2f, d4 / d5 * 4.0);
        }
    }

    private float a(double d) {
        return (float)MathHelper.j(d);
    }

    @Override
    public World a() {
        return this.worldObj;
    }

    private void c() {
        if (this.bQ != null) {
            if (this.bQ.isDead) {
                if (!this.worldObj.isRemote) {
                    this.a(this.bC, aDJ.a(null), 10.0f);
                }
                this.bQ = null;
            } else if (this.ticksExisted % 10 == 0 && this.a() < this.b()) {
                this.i(this.a() + 1.0f);
            }
        }
        if (a5_0.a(this.Q, 10) == 0) {
            float f = 32.0f;
            List list = aV8.a(this.worldObj, ox_2.class, h__0.d(this.getEntityBoundingBox(), f, f, f));
            ox_2 ox_22 = null;
            double d = Double.MAX_VALUE;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                ox_2 ox_23 = (ox_2)dz_0.b(iterator);
                double d2 = ox_23.g(this);
                if (!(d2 < d)) continue;
                d = d2;
                ox_22 = ox_23;
            }
            this.bQ = ox_22;
        }
    }

    private void a(BlockPos blockPos) {
        int n = -1;
        int n2 = -4;
        int n3 = -4;
        while (true) {
            double d = n2 * n2 + n3 * n3;
            double d2 = d - 12.25;
            int cfr_ignored_1 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
            ++n3;
        }
    }

    @Override
    protected String d() {
        return jp_0.g;
    }

    @Override
    protected void Q() {
        ++this.bE;
        if (this.bE >= 180 && this.bE <= 200) {
            float f = (a5_0.e(this.Q) - 0.5f) * 8.0f;
            float f2 = (a5_0.e(this.Q) - 0.5f) * 4.0f;
            float f3 = (a5_0.e(this.Q) - 0.5f) * 8.0f;
            aV8.a(this.worldObj, B7.EXPLOSION_HUGE, this.posX + (double)f, this.posY + 2.0 + (double)f2, this.posZ + (double)f3, 0.0, 0.0, 0.0, new int[0]);
        }
        boolean bl = J9.c(aV8.k(this.worldObj), jp_0.j);
        if (!this.worldObj.isRemote) {
            if (this.bE > 150 && this.bE % 5 == 0) {
                int n = 1000;
                while (true) {
                    int n2 = TC.a(n);
                    n -= n2;
                    aV8.b(this.worldObj, new oa_2(this.worldObj, this.posX, this.posY, this.posZ, n2));
                }
            }
            if (this.bE == 1) {
                aV8.a(this.worldObj, 1018, new BlockPos(this), 0);
            }
        }
        this.moveEntity(0.0, 0.1f, 0.0);
        this.aD = this.rotationYaw += 20.0f;
        if (this.bE == 200 && !this.worldObj.isRemote) {
            int n = 2000;
            while (true) {
                int n3 = TC.a(n);
                n -= n3;
                aV8.b(this.worldObj, new oa_2(this.worldObj, this.posX, this.posY, this.posZ, n3));
            }
        }
    }

    protected boolean b(DamageSource damageSource, float f) {
        return super.a(damageSource, f);
    }

    @Override
    public Entity[] aj() {
        return this.bG;
    }

    @Override
    public void onLivingUpdate() {
        float f;
        float f2;
        if (this.worldObj.isRemote) {
            f2 = MathHelper.cos(this.bR * (float)Math.PI * 2.0f);
            f = MathHelper.cos(this.bB * (float)Math.PI * 2.0f);
            if (f <= -0.3f && f2 >= -0.3f && !this.Q()) {
                aV8.a(this.worldObj, this.posX, this.posY, this.posZ, jp_0.f, 5.0f, 0.8f + a5_0.e(this.Q) * 0.3f, false);
            }
        }
        this.bB = this.bR;
        if (this.a() <= 0.0f) {
            f2 = (a5_0.e(this.Q) - 0.5f) * 8.0f;
            f = (a5_0.e(this.Q) - 0.5f) * 4.0f;
            float f3 = (a5_0.e(this.Q) - 0.5f) * 8.0f;
            aV8.a(this.worldObj, B7.EXPLOSION_LARGE, this.posX + (double)f2, this.posY + 2.0 + (double)f, this.posZ + (double)f3, 0.0, 0.0, 0.0, new int[0]);
        } else {
            this.c();
            f2 = 0.2f / (MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ) * 10.0f + 1.0f);
            this.bR = this.bU ? (this.bR += f2 * 0.5f) : (this.bR += (f2 *= (float)MathInvoker.b(2.0, this.motionY)));
            this.rotationYaw = MathHelper.a(this.rotationYaw);
            if (this.aj()) {
                this.bR = 0.5f;
            } else {
                float f4;
                float f5;
                double d;
                double d2;
                double d3;
                if (this.bP < 0) {
                    for (int i = 0; i < this.bM.length; ++i) {
                        this.bM[i][0] = this.rotationYaw;
                        this.bM[i][1] = this.posY;
                    }
                }
                if (++this.bP == this.bM.length) {
                    this.bP = 0;
                }
                this.bM[this.bP][0] = this.rotationYaw;
                this.bM[this.bP][1] = this.posY;
                if (this.worldObj.isRemote) {
                    if (this.aT > 0) {
                        double d4 = this.posX + (this.aO - this.posX) / (double)this.aT;
                        d3 = this.posY + (this.a0 - this.posY) / (double)this.aT;
                        d2 = this.posZ + (this.a6 - this.posZ) / (double)this.aT;
                        d = MathHelper.j(this.bd - (double)this.rotationYaw);
                        this.rotationYaw = (float)((double)this.rotationYaw + d / (double)this.aT);
                        this.rotationPitch = (float)((double)this.rotationPitch + (this.al - (double)this.rotationPitch) / (double)this.aT);
                        --this.aT;
                        this.j(d4, d3, d2);
                        this.d(this.rotationYaw, this.rotationPitch);
                    }
                } else {
                    double d5;
                    double d6 = this.bI - this.posX;
                    d3 = this.bF - this.posY;
                    d2 = this.bN - this.posZ;
                    d = d6 * d6 + d3 * d3 + d2 * d2;
                    if (this.bD != null) {
                        this.bI = this.bD.posX;
                        this.bN = this.bD.posZ;
                        double d7 = this.bI - this.posX;
                        double d8 = this.bN - this.posZ;
                        double d9 = MathInvoker.d(d7 * d7 + d8 * d8);
                        d5 = (double)0.4f + d9 / 80.0 - 1.0;
                        if (d5 > 10.0) {
                            d5 = 10.0;
                        }
                        this.bF = this.bD.getEntityBoundingBox().a + d5;
                    } else {
                        this.bI += a5_0.f(this.Q) * 2.0;
                        this.bN += a5_0.f(this.Q) * 2.0;
                    }
                    if (this.bH || d < 100.0 || d > 22500.0 || this.g || this.v) {
                        this.d();
                    }
                    d3 /= (double)MathHelper.e(d6 * d6 + d2 * d2);
                    f5 = 0.6f;
                    d3 = MathHelper.b(d3, (double)(-f5), (double)f5);
                    this.motionY += d3 * (double)0.1f;
                    this.rotationYaw = MathHelper.a(this.rotationYaw);
                    double d10 = 180.0 - MathHelper.c(d6, d2) * 180.0 / Math.PI;
                    double d11 = MathHelper.j(d10 - (double)this.rotationYaw);
                    if (d11 > 50.0) {
                        d11 = 50.0;
                    }
                    if (d11 < -50.0) {
                        d11 = -50.0;
                    }
                    Vec3 vec3 = aNE.b(new Vec3(this.bI - this.posX, this.bF - this.posY, this.bN - this.posZ));
                    d5 = -MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f);
                    Vec3 vec32 = aNE.b(new Vec3(MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f), this.motionY, d5));
                    f4 = ((float)aNE.c(vec32, vec3) + 0.5f) / 1.5f;
                    if (f4 < 0.0f) {
                        f4 = 0.0f;
                    }
                    this.aX *= 0.8f;
                    float f6 = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0f + 1.0f;
                    double d12 = MathInvoker.d(this.motionX * this.motionX + this.motionZ * this.motionZ) * 1.0 + 1.0;
                    if (d12 > 40.0) {
                        d12 = 40.0;
                    }
                    this.aX = (float)((double)this.aX + d11 * ((double)0.7f / d12 / (double)f6));
                    this.rotationYaw += this.aX * 0.1f;
                    float f7 = (float)(2.0 / (d12 + 1.0));
                    float f8 = 0.06f;
                    this.a(0.0f, -1.0f, f8 * (f4 * f7 + (1.0f - f7)));
                    if (this.bU) {
                        this.moveEntity(this.motionX * (double)0.8f, this.motionY * (double)0.8f, this.motionZ * (double)0.8f);
                    } else {
                        this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    }
                    Vec3 vec33 = aNE.b(new Vec3(this.motionX, this.motionY, this.motionZ));
                    float f9 = ((float)aNE.c(vec33, vec32) + 1.0f) / 2.0f;
                    f9 = 0.8f + 0.15f * f9;
                    this.motionX *= (double)f9;
                    this.motionZ *= (double)f9;
                    this.motionY *= (double)0.91f;
                }
                this.aD = this.rotationYaw;
                this.bC.n = 3.0f;
                this.bC.width = 3.0f;
                this.bJ.n = 2.0f;
                this.bJ.width = 2.0f;
                this.bK.n = 2.0f;
                this.bK.width = 2.0f;
                this.bL.n = 2.0f;
                this.bL.width = 2.0f;
                this.bS.n = 3.0f;
                this.bS.width = 5.0f;
                this.bO.n = 2.0f;
                this.bO.width = 4.0f;
                this.bT.n = 3.0f;
                this.bT.width = 4.0f;
                f = (float)(this.a(5, 1.0f)[1] - this.a(10, 1.0f)[1]) * 10.0f / 180.0f * (float)Math.PI;
                float f10 = MathHelper.cos(f);
                float f11 = -MathHelper.sin(f);
                float f12 = this.rotationYaw * (float)Math.PI / 180.0f;
                float f13 = MathHelper.sin(f12);
                float f14 = MathHelper.cos(f12);
                this.bS.onUpdate();
                this.bS.c(this.posX + (double)(f13 * 0.5f), this.posY, this.posZ - (double)(f14 * 0.5f), 0.0f, 0.0f);
                this.bO.onUpdate();
                this.bO.c(this.posX + (double)(f14 * 4.5f), this.posY + 2.0, this.posZ + (double)(f13 * 4.5f), 0.0f, 0.0f);
                this.bT.onUpdate();
                this.bT.c(this.posX - (double)(f14 * 4.5f), this.posY + 2.0, this.posZ - (double)(f13 * 4.5f), 0.0f, 0.0f);
                if (!this.worldObj.isRemote && this.a8 == 0) {
                    this.b(aV8.a(this.worldObj, (Entity)this, h__0.b(h__0.d(this.bO.getEntityBoundingBox(), 4.0, 2.0, 4.0), 0.0, -2.0, 0.0)));
                    this.b(aV8.a(this.worldObj, (Entity)this, h__0.b(h__0.d(this.bT.getEntityBoundingBox(), 4.0, 2.0, 4.0), 0.0, -2.0, 0.0)));
                    this.a(aV8.a(this.worldObj, (Entity)this, h__0.d(this.bC.getEntityBoundingBox(), 1.0, 1.0, 1.0)));
                }
                double[] dArray = this.a(5, 1.0f);
                double[] dArray2 = this.a(0, 1.0f);
                f5 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f - this.aX * 0.01f);
                float f15 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f - this.aX * 0.01f);
                this.bC.onUpdate();
                this.bC.c(this.posX + (double)(f5 * 5.5f * f10), this.posY + (dArray2[1] - dArray[1]) * 1.0 + (double)(f11 * 5.5f), this.posZ - (double)(f15 * 5.5f * f10), 0.0f, 0.0f);
                int n = 0;
                while (true) {
                    ov_1 ov_12 = null;
                    ov_12 = this.bJ;
                    double[] dArray3 = this.a(12 + n * 2, 1.0f);
                    float f16 = this.rotationYaw * (float)Math.PI / 180.0f + this.a(dArray3[0] - dArray[0]) * (float)Math.PI / 180.0f * 1.0f;
                    float f17 = MathHelper.sin(f16);
                    float f18 = MathHelper.cos(f16);
                    float f19 = 1.5f;
                    f4 = (float)(n + 1) * 2.0f;
                    ov_12.onUpdate();
                    ov_12.c(this.posX - (double)((f13 * f19 + f17 * f4) * f10), this.posY + (dArray3[1] - dArray[1]) * 1.0 - (double)((f4 + f19) * f11) + 1.5, this.posZ + (double)((f14 * f19 + f18 * f4) * f10), 0.0f, 0.0f);
                    ++n;
                }
            }
        }
    }
}

