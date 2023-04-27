/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.item.ItemStack;
import java.util.UUID;

/*
 * Renamed from net.n_
 */
public class n__0
extends n0_0 {
    private static UUID bP = awc_1.a(IG.k);
    private UUID bS;
    private int bQ;
    private int bR;
    private static AttributeModifier bT = ow_0.a(new AttributeModifier(bP, IG.i, 0.05, 0), false);

    @Override
    protected String C() {
        return IG.f;
    }

    @Override
    protected void f() {
        ahw_2 ahw_22 = this.a(abb_0.e);
        if (this.w()) {
            if (!this.j() && !Ma.c(ahw_22, bT)) {
                Ma.a(ahw_22, bT);
            }
            --this.bR;
        } else if (Ma.c(ahw_22, bT)) {
            Ma.b(ahw_22, bT);
        }
        if (this.bQ > 0 && --this.bQ == 0) {
            this.a(IG.l, this.f() * 2.0f, ((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.bR > 0 && this.bS != null && this.U() == null) {
            EntityPlayer entityPlayer = aV8.a(this.worldObj, this.bS);
            this.b((EntityLivingBase)entityPlayer);
            this.be = entityPlayer;
            this.a4 = this.aa();
        }
        super.f();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }

    private void a(Entity entity) {
        this.bR = 400 + a5_0.a(this.Q, 400);
        this.bQ = a5_0.a(this.Q, 40);
        if (entity instanceof EntityLivingBase) {
            this.b((EntityLivingBase)entity);
        }
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.bR = tn_0.o(nBTTagCompound, IG.a);
        String string = tn_0.m(nBTTagCompound, IG.h);
        if (!StringInvoker.g(string)) {
            this.bS = awc_1.a(string);
            EntityPlayer entityPlayer = aV8.a(this.worldObj, this.bS);
            this.b((EntityLivingBase)entityPlayer);
            this.be = entityPlayer;
            this.a4 = this.aa();
        }
    }

    @Override
    public void b(EntityLivingBase entityLivingBase) {
        super.b(entityLivingBase);
        this.bS = entityLivingBase.J();
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        super.a(ach_02, amk_02);
        this.m(false);
        return amk_02;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(bK), 0.0);
        Ma.a(this.a(abb_0.e), 0.23f);
        Ma.a(this.a(abb_0.f), 5.0);
    }

    @Override
    public boolean B() {
        return aV8.p(this.worldObj) != EnumDifficulty.PEACEFUL;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, IG.j, (short)this.bR);
        if (this.bS != null) {
            tn_0.a(nBTTagCompound, IG.d, this.bS.toString());
        } else {
            tn_0.a(nBTTagCompound, IG.e, IG.b);
        }
    }

    @Override
    public boolean Y() {
        return aV8.a(this.worldObj, this.getEntityBoundingBox(), this) && ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox())) && !aV8.b(this.worldObj, this.getEntityBoundingBox());
    }

    public n__0(World world) {
        super(world);
        this.S = true;
    }

    static void a(n__0 n__02, Entity entity) {
        n__02.a(entity);
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3 = a5_0.a(this.Q, 2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.rotten_flesh, 1);
        }
        n3 = a5_0.a(this.Q, 2 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.gold_nugget, 1);
        }
    }

    @Override
    protected void t() {
        this.a(Items.gold_ingot, 1);
    }

    public boolean w() {
        return this.bR > 0;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return false;
    }

    @Override
    protected void b(ach_0 ach_02) {
        this.c(0, new ItemStack(Items.golden_sword));
    }

    @Override
    protected String ac() {
        return IG.g;
    }

    @Override
    protected void P() {
        aMS.a(this.bv, 1, new _H(this));
        aMS.a(this.bv, 2, new _w_0(this));
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        Entity entity = aDJ.d(damageSource);
        if (entity instanceof EntityPlayer) {
            this.a(entity);
        }
        return super.a(damageSource, f);
    }

    @Override
    protected String d() {
        return IG.c;
    }
}

