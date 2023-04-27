/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.Items;
import net.J9;
import net.Material;
import net.MathHelper;
import net.NBTTagCompound;
import net.P8;
import net.World;
import net.aDJ;
import net.aSY;
import net.aV8;
import net.acf_1;
import net.aea_2;
import net.aom_0;
import net.axx_1;
import net.minecraft.util.DamageSource;
import net.px_0;
import net.rm_2;

public class EntityBoat
extends Entity {
    private double an;
    private double as;
    private double ap;
    private double aq;
    private int al;
    private double aj;
    private double ak = 0.07;
    private double ar;
    private boolean am = true;
    private double ao;
    private double at;

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public double i() {
        return -0.3;
    }

    public void a(float f) {
        aom_0.b(this.l, 19, axx_1.a(f));
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 17, P8.d(0));
        aom_0.a(this.l, 18, P8.d(1));
        aom_0.a(this.l, 19, axx_1.a(0.0f));
    }

    public float c() {
        return aom_0.a(this.l, 19);
    }

    public int b() {
        return aom_0.h(this.l, 18);
    }

    public int a() {
        return aom_0.h(this.l, 17);
    }

    @Override
    public boolean W() {
        return true;
    }

    public void h(boolean bl) {
        this.am = bl;
    }

    @Override
    public void ab() {
        if (this.h != null) {
            double d = (double)MathHelper.b((double)this.rotationYaw * Math.PI / 180.0) * 0.4;
            double d2 = (double)MathHelper.h((double)this.rotationYaw * Math.PI / 180.0) * 0.4;
            this.h.j(this.posX + d, this.posY + this.i() + this.h.H(), this.posZ + d2);
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.a() > 0) {
            this.h(this.a() - 1);
        }
        if (this.c() > 0.0f) {
            this.a(this.c() - 1.0f);
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        int n = 5;
        double d = 0.0;
        int n2 = 0;
        while (true) {
            double d2;
            double d3;
            rm_2 rm_22;
            if (aV8.a(this.worldObj, rm_22 = new rm_2(this.getEntityBoundingBox().e, d3 = this.getEntityBoundingBox().a + (this.getEntityBoundingBox().c - this.getEntityBoundingBox().a) * (double)n2 / (double)n - 0.125, this.getEntityBoundingBox().f, this.getEntityBoundingBox().b, d2 = this.getEntityBoundingBox().a + (this.getEntityBoundingBox().c - this.getEntityBoundingBox().a) * (double)(n2 + 1) / (double)n - 0.125, this.getEntityBoundingBox().d), Material.M)) {
                d += 1.0 / (double)n;
            }
            ++n2;
        }
    }

    public EntityBoat(World world) {
        super(world);
        this.P = true;
        this.c(1.5f, 0.6f);
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        if (this.h != null) {
            this.prevPosX = this.posX = d;
            this.prevPosY = this.posY = d2;
            this.prevPosZ = this.posZ = d3;
            this.rotationYaw = f;
            this.rotationPitch = f2;
            this.al = 0;
            this.j(d, d2, d3);
            this.aj = 0.0;
            this.motionX = 0.0;
            this.as = 0.0;
            this.motionY = 0.0;
            this.aq = 0.0;
            this.motionZ = 0.0;
        } else {
            if (this.am) {
                this.al = n + 5;
            } else {
                double d4 = d - this.posX;
                double d5 = d2 - this.posY;
                double d6 = d3 - this.posZ;
                double d7 = d4 * d4 + d5 * d5 + d6 * d6;
                if (d7 <= 1.0) {
                    return;
                }
                this.al = 3;
            }
            this.an = d;
            this.ao = d2;
            this.ar = d3;
            this.at = f;
            this.ap = f2;
            this.motionX = this.aj;
            this.motionY = this.as;
            this.motionZ = this.aq;
        }
    }

    @Override
    public rm_2 l(Entity entity) {
        return entity.getEntityBoundingBox();
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (!this.worldObj.isRemote && !this.isDead) {
            if (this.h != null && this.h == aDJ.d(damageSource) && damageSource instanceof aea_2) {
                return false;
            }
            this.c(-this.b());
            this.h(10);
            this.a(this.c() + f * 10.0f);
            this.k();
            boolean bl = aDJ.d(damageSource) instanceof EntityPlayer && aSY.a(((EntityPlayer)aDJ.d((DamageSource)damageSource)).abilities);
            if (this.c() > 40.0f) {
                if (this.h != null) {
                    this.h.mountEntity(this);
                }
                if (J9.c(aV8.k(this.worldObj), acf_1.a)) {
                    this.a(Items.boat, 1, 0.0f);
                }
                this.E();
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (!(this.h != null && this.h instanceof EntityPlayer && this.h != entityPlayer || this.worldObj.isRemote)) {
            entityPlayer.mountEntity(this);
        }
        return true;
    }

    @Override
    public rm_2 as() {
        return this.getEntityBoundingBox();
    }

    public void c(int n) {
        aom_0.b(this.l, 18, P8.d(n));
    }

    @Override
    public void e(double d, double d2, double d3) {
        this.aj = this.motionX = d;
        this.as = this.motionY = d2;
        this.aq = this.motionZ = d3;
    }

    @Override
    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
        if (this.fallDistance > 3.0f) {
            this.b(this.fallDistance, 1.0f);
            if (!this.worldObj.isRemote && !this.isDead) {
                this.E();
                if (J9.c(aV8.k(this.worldObj), acf_1.c)) {
                    int n = 0;
                    while (true) {
                        this.a(px_0.a(Blocks.planks), 1, 0.0f);
                        ++n;
                    }
                }
            }
            this.fallDistance = 0.0f;
        }
    }

    public void h(int n) {
        aom_0.b(this.l, 17, P8.d(n));
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public void u() {
        this.c(-this.b());
        this.h(10);
        this.a(this.c() * 11.0f);
    }

    @Override
    public boolean N() {
        return !this.isDead;
    }

    @Override
    protected boolean p() {
        return false;
    }

    public EntityBoat(World world, double d, double d2, double d3) {
        this(world);
        this.j(d, d2, d3);
        this.motionX = 0.0;
        this.motionY = 0.0;
        this.motionZ = 0.0;
        this.prevPosX = d;
        this.prevPosY = d2;
        this.prevPosZ = d3;
    }
}

