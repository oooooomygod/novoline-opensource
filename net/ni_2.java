/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ni
 */
public class ni_2
extends ne_2 {
    private boolean bH = false;
    private int bI = 0;

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.isRemote) {
            int n = 0;
            while (true) {
                aV8.a(this.worldObj, B7.PORTAL, this.posX + (a5_0.c(this.Q) - 0.5) * (double)this.width, this.posY + a5_0.c(this.Q) * (double)this.n, this.posZ + (a5_0.c(this.Q) - 0.5) * (double)this.width, (a5_0.c(this.Q) - 0.5) * 2.0, -a5_0.c(this.Q), (a5_0.c(this.Q) - 0.5) * 2.0, new int[0]);
                ++n;
            }
        }
        if (!this.i()) {
            ++this.bI;
        }
        if (this.bI >= 2400) {
            this.E();
        }
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(lt_2.b, 0.15f, 1.0f);
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 8.0);
        Ma.a(this.a(abb_0.e), 0.25);
        Ma.a(this.a(abb_0.f), 2.0);
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    protected String C() {
        return lt_2.a;
    }

    public ni_2(World world) {
        super(world);
        this.bk = 3;
        this.c(0.4f, 0.3f);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, new _r_0(this, EntityPlayer.class, 1.0, false));
        aMS.a(this.bx, 3, new _J(this, 1.0));
        aMS.a(this.bx, 7, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 8, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, true, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, lt_2.c, this.bI);
        tn_0.a(nBTTagCompound, lt_2.h, this.bH);
    }

    @Override
    public aH2 ae() {
        return aH2.ARTHROPOD;
    }

    @Override
    protected String ac() {
        return lt_2.f;
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    public void onUpdate() {
        this.aD = this.rotationYaw;
        super.onUpdate();
    }

    public void k(boolean bl) {
        this.bH = bl;
    }

    @Override
    public float w() {
        return 0.1f;
    }

    @Override
    protected String d() {
        return lt_2.e;
    }

    public boolean u() {
        return this.bH;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.bI = tn_0.g(nBTTagCompound, lt_2.g);
        this.bH = tn_0.c(nBTTagCompound, lt_2.d);
    }

    @Override
    protected Item j() {
        return null;
    }

    @Override
    public boolean B() {
        if (super.B()) {
            aV8.a(this.worldObj, (Entity)this, 5.0);
            return true;
        }
        return false;
    }
}

