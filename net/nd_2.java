/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nd
 */
public class nd_2
extends ne_2 {
    private int bH = 3;
    private int bK = 0;
    private int bL = 30;
    private int bI;
    private int bJ;

    public int a() {
        return aom_0.g(this.l, 16);
    }

    public nd_2(World world) {
        super(world);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, new _g_0(this));
        aMS.a(this.bx, 3, new _x_0<nb_1>(this, nb_1.class, 6.0f, 1.0, 1.2));
        aMS.a(this.bx, 4, new _r_0(this, 1.0, false));
        aMS.a(this.bx, 5, new _J(this, 0.8));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 6, new _A(this));
        aMS.a(this.bv, 1, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
        aMS.a(this.bv, 2, new _9((nu_1)this, false, new Class[0]));
    }

    @Override
    public boolean d(Entity entity) {
        return true;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)-1));
        aom_0.a(this.l, 17, axt_2.a((byte)0));
        aom_0.a(this.l, 18, axt_2.a((byte)0));
    }

    @Override
    protected Item j() {
        return Items.gunpowder;
    }

    public void S() {
        ++this.bK;
    }

    private void C() {
        if (!this.worldObj.isRemote) {
            boolean bl = J9.c(aV8.k(this.worldObj), ws_0.e);
            float f = this.u() ? 2.0f : 1.0f;
            aV8.a(this.worldObj, this, this.posX, this.posY, this.posZ, (float)this.bH * f, bl);
            this.E();
        }
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.e), 0.25);
    }

    @Override
    public void a(ou_2 ou_22) {
        super.a(ou_22);
        aom_0.b(this.l, 17, axt_2.a((byte)1));
    }

    @Override
    public void onUpdate() {
        if (this.n()) {
            this.bI = this.bJ;
            if (this.w()) {
                this.j(1);
            }
            int n = this.a();
            if (this.bJ == 0) {
                this.a(ws_0.h, 1.0f, 0.5f);
            }
            this.bJ += n;
            if (this.bJ < 0) {
                this.bJ = 0;
            }
            if (this.bJ >= this.bL) {
                this.bJ = this.bL;
                this.C();
            }
        }
        super.onUpdate();
    }

    @Override
    protected String d() {
        return ws_0.i;
    }

    @Override
    public void b(float f, float f2) {
        super.b(f, f2);
        this.bJ = (int)((float)this.bJ + f * 1.5f);
        if (this.bJ > this.bL - 5) {
            this.bJ = this.bL - 5;
        }
    }

    public float a(float f) {
        return ((float)this.bI + (float)(this.bJ - this.bI) * f) / (float)(this.bL - 2);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        if (aom_0.g(this.l, 17) == 1) {
            tn_0.a(nBTTagCompound, ws_0.j, true);
        }
        tn_0.a(nBTTagCompound, ws_0.n, (short)this.bL);
        tn_0.a(nBTTagCompound, ws_0.l, (byte)this.bH);
        tn_0.a(nBTTagCompound, ws_0.g, this.w());
    }

    @Override
    protected String C() {
        return ws_0.p;
    }

    @Override
    public int ah() {
        return this.ak() == null ? 3 : 3 + (int)(this.a() - 1.0f);
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (aDJ.d(damageSource) instanceof nM) {
            int n = px_0.a(Items.record_13);
            int n2 = px_0.a(Items.record_wait);
            int n3 = n + a5_0.a(this.Q, n2 - n + 1);
            this.a(px_0.a(n3), 1);
        } else if (aDJ.d(damageSource) instanceof nd_2 && aDJ.d(damageSource) != this && ((nd_2)aDJ.d(damageSource)).u() && ((nd_2)aDJ.d(damageSource)).v()) {
            ((nd_2)aDJ.d(damageSource)).S();
            this.a(new ItemStack(Items.skull, 1, 4), 0.0f);
        }
    }

    public boolean u() {
        return aom_0.g(this.l, 17) == 1;
    }

    public boolean v() {
        return this.bK < 1 && J9.c(aV8.k(this.worldObj), ws_0.b);
    }

    public void P() {
        aom_0.b(this.l, 18, axt_2.a((byte)1));
    }

    public boolean w() {
        return aom_0.g(this.l, 18) != 0;
    }

    @Override
    protected boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.flint_and_steel) {
            aV8.a(this.worldObj, this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, ws_0.c, 1.0f, a5_0.e(this.Q) * 0.4f + 0.8f);
            entityPlayer.Z();
            if (!this.worldObj.isRemote) {
                this.P();
                act_2.damageItem(itemStack, 1, entityPlayer);
                return true;
            }
        }
        return super.a(entityPlayer);
    }

    public void j(int n) {
        aom_0.b(this.l, 16, axt_2.a((byte)n));
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        aom_0.b(this.l, 17, axt_2.a((byte)(tn_0.c(nBTTagCompound, ws_0.o) ? 1 : 0)));
        if (tn_0.a(nBTTagCompound, ws_0.a, 99)) {
            this.bL = tn_0.o(nBTTagCompound, ws_0.f);
        }
        if (tn_0.a(nBTTagCompound, ws_0.d, 99)) {
            this.bH = tn_0.e(nBTTagCompound, ws_0.k);
        }
        if (tn_0.c(nBTTagCompound, ws_0.m)) {
            this.P();
        }
    }
}

