/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import java.util.UUID;
import net.AttributeModifier;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.nU
 */
public abstract class nu_1
extends nl_1 {
    private BlockPos bD = BlockPos.m;
    private _v_0 bE = new _P(this, 1.0);
    private float bB = -1.0f;
    public static AttributeModifier bF;
    private boolean bG;
    public static UUID bC;

    protected void k(float f) {
    }

    public boolean a(BlockPos blockPos) {
        return this.bB == -1.0f || amv_2.c(this.bD, blockPos) < (double)(this.bB * this.bB);
    }

    public boolean k() {
        return this.a(new BlockPos(this));
    }

    static {
        bC = awc_1.a(GQ.b);
        bF = ow_0.a(new AttributeModifier(bC, GQ.a, 2.0, 2), false);
    }

    public boolean t() {
        return !tz_1.b(this.bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean B() {
        if (!super.B()) return false;
        BlockPos blockPos = new BlockPos(this.posX, this.getEntityBoundingBox().a, this.posZ);
        if (!(this.b(blockPos) >= 0.0f)) return false;
        return true;
    }

    public float b(BlockPos blockPos) {
        return 0.0f;
    }

    public void c() {
        this.bB = -1.0f;
    }

    public void a(BlockPos blockPos, int n) {
        this.bD = blockPos;
        this.bB = n;
    }

    public boolean a() {
        return this.bB != -1.0f;
    }

    public BlockPos u() {
        return this.bD;
    }

    public float d() {
        return this.bB;
    }

    public nu_1(World world) {
        super(world);
    }

    @Override
    protected void A() {
        super.A();
        if (this.O() && this.V() != null && this.V().worldObj == this.worldObj) {
            Entity entity = this.V();
            this.a(new BlockPos((int)entity.posX, (int)entity.posY, (int)entity.posZ), 5);
            float f = this.a(entity);
            if (this instanceof no_1 && aLD.a((no_1)this)) {
                if (f > 10.0f) {
                    this.a(true, true);
                }
                return;
            }
            if (!this.bG) {
                aMS.a(this.bx, 2, this.bE);
                if (this.Z() instanceof F_) {
                    afv_0.b((F_)this.Z(), false);
                }
                this.bG = true;
            }
            this.k(f);
            if (f > 4.0f) {
                tz_1.a(this.Z(), entity, 1.0);
            }
            if (f > 6.0f) {
                double d = (entity.posX - this.posX) / (double)f;
                double d2 = (entity.posY - this.posY) / (double)f;
                double d3 = (entity.posZ - this.posZ) / (double)f;
                this.motionX += d * MathInvoker.a(d) * 0.4;
                this.motionY += d2 * MathInvoker.a(d2) * 0.4;
                this.motionZ += d3 * MathInvoker.a(d3) * 0.4;
            }
            if (f > 10.0f) {
                this.a(true, true);
            }
        } else if (!this.O() && this.bG) {
            this.bG = false;
            aMS.a(this.bx, this.bE);
            if (this.Z() instanceof F_) {
                afv_0.b((F_)this.Z(), true);
            }
            this.c();
        }
    }
}

