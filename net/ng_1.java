/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Vec3;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nG
 */
public class ng_1
extends n5_0 {
    private int bV = 0;
    private int bP = 0;
    private boolean bR = false;
    private _7<nf_1> bX;
    private wy_2 bT = wy_2.HOP;
    private int bQ = 0;
    private EntityPlayer bU = null;
    private int bW = 0;
    private boolean bS = false;

    public void b(double d) {
        tz_1.a(this.Z(), d);
        MK.a(this.br, MK.d(this.br), MK.a(this.br), MK.b(this.br), d);
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        amk_02 = super.a(ach_02, amk_02);
        int n = a5_0.a(this.Q, 6);
        if (amk_02 instanceof T) {
            n = ((T)amk_02).a;
        } else {
            amk_02 = new T(n);
        }
        this.l(n);
        this.k(-24000);
        return amk_02;
    }

    static boolean a(ng_1 ng_12) {
        return ng_12.v();
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
        Ma.a(this.a(abb_0.e), 0.3f);
    }

    public float a(float f) {
        return this.bP == 0 ? 0.0f : ((float)this.bQ + f) / (float)this.bP;
    }

    public void a(wy_2 wy_22) {
        this.a(true, wy_22);
        this.bP = wy_22.a();
        this.bQ = 0;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3 = a5_0.a(this.Q, 2) + a5_0.a(this.Q, 1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.rabbit_hide, 1);
        }
        n3 = a5_0.a(this.Q, 2);
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.ag()) {
                this.a(Items.cooked_rabbit, 1);
                continue;
            }
            this.a(Items.rabbit, 1);
        }
    }

    public void b(wy_2 wy_22) {
        this.bT = wy_22;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.bQ != this.bP) {
            if (this.bQ == 0 && !this.worldObj.isRemote) {
                aV8.a(this.worldObj, (Entity)this, (byte)1);
            }
            ++this.bQ;
        } else if (this.bP != 0) {
            this.bQ = 0;
            this.bP = 0;
        }
    }

    protected void o() {
        aV8.a(this.worldObj, B7.BLOCK_DUST, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, 0.0, 0.0, 0.0, new int[]{BlocksInvoker.a(BlocksInvoker.a(Blocks.aY, 7))});
        this.bV = 100;
    }

    @Override
    protected void t() {
        this.a(new ItemStack(Items.rabbit_foot, 1), 0.0f);
    }

    @Override
    public int O() {
        return this.y() == 99 ? 8 : super.O();
    }

    public void l(int n) {
        if (n == 99) {
            aMS.a(this.bx, this.bX);
            aMS.a(this.bx, 4, new _3(this));
            aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
            aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
            aMS.a(this.bv, 2, new _m_0<nf_1>((nu_1)this, nf_1.class, true));
            if (!this.e()) {
                this.a(ahq_0.b(auv_0.e));
            }
        }
        aom_0.b(this.l, 18, axt_2.a((byte)n));
    }

    @Override
    public void f() {
        if (MK.f(this.br) > 0.8) {
            this.b(wy_2.SPRINT);
        } else if (this.bT != wy_2.ATTACK) {
            this.b(wy_2.HOP);
        }
        if (this.bW > 0) {
            --this.bW;
        }
        if (this.bV > 0) {
            this.bV -= a5_0.a(this.Q, 3);
            if (this.bV < 0) {
                this.bV = 0;
            }
        }
        if (this.onGround) {
            Object object;
            if (!this.bS) {
                this.a(false, wy_2.NONE);
                this.P();
            }
            if (this.y() == 99 && this.bW == 0 && this.g((Entity)(object = this.ak())) < 16.0) {
                this.a(((EntityLivingBase)object).posX, ((EntityLivingBase)object).posZ);
                MK.a(this.br, ((EntityLivingBase)object).posX, ((EntityLivingBase)object).posY, ((EntityLivingBase)object).posZ, MK.f(this.br));
                this.a(wy_2.ATTACK);
                this.bS = true;
            }
            if (!xf_1.a((T_)(object = (T_)this.bg))) {
                if (MK.c(this.br) && this.bW == 0) {
                    aMH aMH2 = tz_1.c(this.bl);
                    Vec3 vec3 = new Vec3(MK.d(this.br), MK.a(this.br), MK.b(this.br));
                    if (afG.e(aMH2) < afG.c(aMH2)) {
                        vec3 = afG.a(aMH2, this);
                    }
                    this.a(vec3.xCoord, vec3.zCoord);
                    this.a(this.bT);
                }
            } else if (!xf_1.b((T_)object)) {
                this.i();
            }
        }
        this.bS = this.onGround;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, auv_0.b, this.y());
        tn_0.b(nBTTagCompound, auv_0.a, this.bV);
    }

    @Override
    public boolean d(Entity entity) {
        if (this.y() == 99) {
            this.a(auv_0.c, 1.0f, (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            return entity.a(aDJ.a(this), 8.0f);
        }
        return entity.a(aDJ.a(this), 3.0f);
    }

    private void q() {
        xf_1.a((T_)this.bg, false);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.l(tn_0.g(nBTTagCompound, auv_0.f));
        this.bV = tn_0.g(nBTTagCompound, auv_0.i);
    }

    private void C() {
        this.bW = this.s();
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return this.a(act_2.k(itemStack));
    }

    @Override
    public void ap() {
    }

    @Override
    public ng_1 a(n4_0 n4_02) {
        ng_1 ng_12 = new ng_1(this.worldObj);
        if (n4_02 instanceof ng_1) {
            ng_12.l(a5_0.a(this.Q) ? this.y() : ((ng_1)n4_02).y());
        }
        return ng_12;
    }

    @Override
    protected String ac() {
        return auv_0.g;
    }

    public ng_1(World world) {
        super(world);
        this.c(0.6f, 0.7f);
        this.bg = new T_(this, this);
        this.br = new PW(this);
        afv_0.b((F_)this.Z(), true);
        tz_1.a(this.bl, 2.5f);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 1, new _z_0(this, 1.33));
        aMS.a(this.bx, 2, new _b_0(this, 1.0, Items.carrot, false));
        aMS.a(this.bx, 2, new _b_0(this, 1.0, Items.golden_carrot, false));
        aMS.a(this.bx, 2, new _b_0(this, 1.0, px_0.a(Blocks.G), false));
        aMS.a(this.bx, 3, new _h_0(this, 0.8));
        aMS.a(this.bx, 5, new _Z(this));
        aMS.a(this.bx, 5, new _J(this, 0.6));
        aMS.a(this.bx, 11, new aly_2(this, EntityPlayer.class, 10.0f));
        this.bX = new _7<nf_1>(this, nf_1.class, 16.0f, 1.33, 1.33);
        aMS.a(this.bx, 4, this.bX);
        this.b(0.0);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 18, axt_2.a((byte)0));
    }

    protected String w() {
        return auv_0.h;
    }

    public boolean Z() {
        return this.bR;
    }

    public int y() {
        return aom_0.g(this.l, 18);
    }

    protected float x() {
        return MK.c(this.br) && MK.a(this.br) > this.posY + 0.5 ? 0.5f : this.bT.c();
    }

    private void i() {
        xf_1.a((T_)this.bg, true);
    }

    @Override
    public void a(byte by) {
        if (by == 1) {
            this.I();
            this.bP = 10;
            this.bQ = 0;
        } else {
            super.a(by);
        }
    }

    protected int s() {
        return this.bT.d();
    }

    @Override
    protected String d() {
        return auv_0.j;
    }

    public void a(boolean bl, wy_2 wy_22) {
        super.h(bl);
        if (this.bT == wy_2.ATTACK) {
            this.bT = wy_2.HOP;
        }
        this.bR = bl;
    }

    private void P() {
        this.C();
        this.q();
    }

    private void a(double d, double d2) {
        this.rotationYaw = (float)(MathHelper.c(d2 - this.posZ, d - this.posX) * 180.0 / Math.PI) - 90.0f;
    }

    private boolean v() {
        return this.bV == 0;
    }

    private boolean a(Item item) {
        return item == Items.carrot || item == Items.golden_carrot || item == px_0.a(Blocks.G);
    }

    @Override
    protected String C() {
        return auv_0.d;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return !this.a(damageSource) && super.a(damageSource, f);
    }
}

