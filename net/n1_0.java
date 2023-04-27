/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.Calendar;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.n1
 */
public class n1_0
extends nb_2 {
    private BlockPos bB;

    @Override
    protected float K() {
        return super.K() * 0.95f;
    }

    public n1_0(World world) {
        super(world);
        this.c(0.5f, 0.9f);
        this.k(true);
    }

    @Override
    protected void f() {
        super.f();
        BlockPos blockPos = new BlockPos(this);
        BlockPos blockPos2 = amv_2.e(blockPos);
        if (this.a()) {
            if (!BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos2)))) {
                this.k(false);
                aV8.a(this.worldObj, (EntityPlayer)null, 1015, blockPos, 0);
            } else {
                if (a5_0.a(this.Q, 200) == 0) {
                    this.aP = a5_0.a(this.Q, 360);
                }
                if (aV8.a(this.worldObj, (Entity)this, 4.0) != null) {
                    this.k(false);
                    aV8.a(this.worldObj, (EntityPlayer)null, 1015, blockPos, 0);
                }
            }
        } else {
            if (!(this.bB == null || aV8.k(this.worldObj, this.bB) && amv_2.h(this.bB) >= 1)) {
                this.bB = null;
            }
            if (this.bB == null || a5_0.a(this.Q, 30) == 0 || amv_2.c(this.bB, (int)this.posX, (int)this.posY, (int)this.posZ) < 4.0) {
                this.bB = new BlockPos((int)this.posX + a5_0.a(this.Q, 7) - a5_0.a(this.Q, 7), (int)this.posY + a5_0.a(this.Q, 6) - 2, (int)this.posZ + a5_0.a(this.Q, 7) - a5_0.a(this.Q, 7));
            }
            double d = (double)amv_2.j(this.bB) + 0.5 - this.posX;
            double d2 = (double)amv_2.h(this.bB) + 0.1 - this.posY;
            double d3 = (double)amv_2.i(this.bB) + 0.5 - this.posZ;
            this.motionX += (MathInvoker.g(d) * 0.5 - this.motionX) * (double)0.1f;
            this.motionY += (MathInvoker.g(d2) * (double)0.7f - this.motionY) * (double)0.1f;
            this.motionZ += (MathInvoker.g(d3) * 0.5 - this.motionZ) * (double)0.1f;
            float f = (float)(MathHelper.c(this.motionZ, this.motionX) * 180.0 / Math.PI) - 90.0f;
            float f2 = MathHelper.a(f - this.rotationYaw);
            this.moveForward = 0.5f;
            this.rotationYaw += f2;
            if (a5_0.a(this.Q, 100) == 0 && BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos2)))) {
                this.k(true);
            }
        }
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, asn_0.b, aom_0.g(this.l, 16));
    }

    @Override
    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
    }

    @Override
    public float w() {
        return this.n / 2.0f;
    }

    @Override
    protected void b(Entity entity) {
    }

    @Override
    protected void L() {
    }

    @Override
    public boolean B() {
        BlockPos blockPos = new BlockPos(this.posX, this.getEntityBoundingBox().a, this.posZ);
        if (amv_2.h(blockPos) >= aV8.c(this.worldObj)) {
            return false;
        }
        int n = aV8.l(this.worldObj, blockPos);
        int n2 = 4;
        if (this.a(aV8.r(this.worldObj))) {
            n2 = 7;
        } else if (a5_0.a(this.Q)) {
            return false;
        }
        return n <= a5_0.a(this.Q, n2) && super.B();
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (!this.worldObj.isRemote && this.a()) {
            this.k(false);
        }
        return super.a(damageSource, f);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        aom_0.b(this.l, 16, axt_2.a(tn_0.e(nBTTagCompound, asn_0.a)));
    }

    public void k(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 1)));
    }

    private boolean a(Calendar calendar) {
        return afv_2.a(calendar, 2) + 1 == 10 && afv_2.a(calendar, 5) >= 20 || afv_2.a(calendar, 2) + 1 == 11 && afv_2.a(calendar, 5) <= 3;
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.a()) {
            this.motionZ = 0.0;
            this.motionY = 0.0;
            this.motionX = 0.0;
            this.posY = (double)MathHelper.floor_double(this.posY) + 1.0 - (double)this.n;
        } else {
            this.motionY *= (double)0.6f;
        }
    }

    public boolean a() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    protected float f() {
        return 0.1f;
    }

    @Override
    protected String C() {
        return asn_0.e;
    }

    @Override
    public void b(float f, float f2) {
    }

    @Override
    protected String ac() {
        return this.a() && a5_0.a(this.Q, 4) != 0 ? null : asn_0.c;
    }

    @Override
    public boolean M() {
        return true;
    }

    @Override
    protected String d() {
        return asn_0.d;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 6.0);
    }

    @Override
    public boolean W() {
        return false;
    }
}

