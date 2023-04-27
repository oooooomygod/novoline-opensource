/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IAttribute;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nA
 */
public class na_1
extends n5_0
implements B2 {
    private int b7;
    private static int[] cg;
    private float b5;
    private boolean ch;
    private boolean cb;
    private static String[] cf;
    private static IAttribute b9;
    protected boolean bW;
    private int bR;
    private String[] bX = new String[3];
    protected float bU;
    private String bT;
    private float b3;
    private float b2;
    private float bV;
    private w5_0 cd;
    private float b4;
    private float b6;
    protected int b8;
    private static String[] b1;
    private static String[] b0;
    public int cc;
    public int bP;
    private boolean bY = false;
    private static Predicate<Entity> ca;
    private int bS;
    private static String[] ce;
    private static String[] bZ;
    private int bQ;
    private static String[] b_;

    public boolean d() {
        int n = this.y();
        return n == 2 || n == 1;
    }

    public double au() {
        return Ma.d(this.a(b9));
    }

    public String aA() {
        return aom_0.d(this.l, 21);
    }

    private void av() {
        this.bT = EA.P;
        this.bX[0] = null;
        this.bX[1] = null;
        this.bX[2] = null;
        this.y();
        int n = this.E();
        int n2 = n & 0xFF;
        int n3 = (n & 0xFF00) >> 8;
        if (n2 >= b1.length) {
            this.bY = false;
            return;
        }
        this.bX[0] = b1[n2];
        this.bT = aL0.a(aL0.a(new StringBuilder(), this.bT), bZ[n2]).toString();
        if (n3 >= cf.length) {
            this.bY = false;
            return;
        }
        this.bX[1] = cf[n3];
        this.bT = aL0.a(aL0.a(new StringBuilder(), this.bT), b0[n3]).toString();
        n2 = this.aO();
        if (n2 >= ce.length) {
            this.bY = false;
        } else {
            this.bX[2] = ce[n2];
            this.bT = aL0.a(aL0.a(new StringBuilder(), this.bT), b_[n2]).toString();
            this.bY = true;
        }
    }

    public boolean aP() {
        return this.n(64);
    }

    public boolean A() {
        return this.y() == 0;
    }

    @Override
    public n4_0 a(n4_0 n4_02) {
        na_1 na_12 = (na_1)n4_02;
        na_1 na_13 = new na_1(this.worldObj);
        int n = this.y();
        int n2 = na_12.y();
        int n3 = 0;
        if (n == n2) {
            n3 = n;
        } else if (n2 == 1 || n == 1) {
            n3 = 2;
        }
        int n4 = a5_0.a(this.Q, 9);
        int n5 = n4 < 4 ? this.E() & 0xFF : (n4 < 8 ? na_12.E() & 0xFF : a5_0.a(this.Q, 7));
        int n6 = a5_0.a(this.Q, 5);
        n5 = n6 < 2 ? (n5 |= this.E() & 0xFF00) : (n6 < 4 ? (n5 |= na_12.E() & 0xFF00) : (n5 |= a5_0.a(this.Q, 5) << 8 & 0xFF00));
        na_13.o(n5);
        na_13.q(n3);
        double d = Ma.b(this.a(abb_0.b)) + Ma.b(n4_02.a(abb_0.b)) + (double)this.z();
        Ma.a(na_13.a(abb_0.b), d / 3.0);
        double d2 = Ma.b(this.a(b9)) + Ma.b(n4_02.a(b9)) + this.ar();
        Ma.a(na_13.a(b9), d2 / 3.0);
        double d3 = Ma.b(this.a(abb_0.e)) + Ma.b(n4_02.a(abb_0.e)) + this.aa();
        Ma.a(na_13.a(abb_0.e), d3 / 3.0);
        return na_13;
    }

    public int E() {
        return aom_0.h(this.l, 20);
    }

    @Override
    protected float f() {
        return 0.8f;
    }

    public void q(boolean bl) {
        this.c(8, bl);
    }

    public float a(float f) {
        return this.b2 + (this.b4 - this.b2) * f;
    }

    public boolean ay() {
        return this.bY;
    }

    public boolean aD() {
        return this.n(16);
    }

    public void m(int n) {
        if (this.aH()) {
            n = 0;
            this.bU = 0.4f + 0.4f * (float)n / 90.0f;
        }
    }

    @Override
    protected Item j() {
        boolean bl = a5_0.a(this.Q, 4) == 0;
        int n = this.y();
        return n == 4 ? Items.bone : (n == 3 ? null : Items.leather);
    }

    private void C() {
        this.bT = null;
    }

    @Override
    protected boolean h() {
        return this.h != null && this.aH() || this.az() || this.aP();
    }

    public float ao() {
        return 0.5f;
    }

    @Override
    public boolean a(n5_0 n5_02) {
        if (n5_02 == this) {
            return false;
        }
        if (n5_02.getClass() != this.getClass()) {
            return false;
        }
        na_1 na_12 = (na_1)n5_02;
        if (this.aE() && na_12.aE()) {
            int n;
            int n2 = this.y();
            return n2 == (n = na_12.y()) || n == 1 || n2 == 1;
        }
        return false;
    }

    @Override
    public void f(float f, float f2) {
        if (this.h != null && this.h instanceof EntityLivingBase && this.aH()) {
            this.prevRotationYaw = this.rotationYaw = this.h.rotationYaw;
            this.rotationPitch = this.h.rotationPitch * 0.5f;
            this.d(this.rotationYaw, this.rotationPitch);
            this.aP = this.aD = this.rotationYaw;
            f = ((EntityLivingBase)this.h).moveStrafing * 0.5f;
            f2 = ((EntityLivingBase)this.h).moveForward;
            if (f2 <= 0.0f) {
                f2 *= 0.25f;
                this.bS = 0;
            }
            if (this.onGround && this.bU == 0.0f && this.aP() && !this.cb) {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.bU > 0.0f && !this.v() && this.onGround) {
                this.motionY = this.au() * (double)this.bU;
                if (this.isPotionActive(Potion.jump)) {
                    this.motionY += (double)((float)(a3M.g(this.getActivePotionEffect(Potion.jump)) + 1) * 0.1f);
                }
                this.m(true);
                this.p = true;
                if (f2 > 0.0f) {
                    float f3 = MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f);
                    float f4 = MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f);
                    this.motionX += (double)(-0.4f * f3 * this.bU);
                    this.motionZ += (double)(0.4f * f4 * this.bU);
                    this.a(EA.f, 0.4f, 1.0f);
                }
                this.bU = 0.0f;
            }
            this.U = 1.0f;
            this.aZ = this.n() * 0.1f;
            if (!this.worldObj.isRemote) {
                this.a((float)Ma.d(this.a(abb_0.e)));
                super.f(f, f2);
            }
            if (this.onGround) {
                this.bU = 0.0f;
                this.m(false);
            }
            this.aM = this.aq;
            double d = this.posX - this.prevPosX;
            double d2 = this.posZ - this.prevPosZ;
            float f5 = MathHelper.e(d * d + d2 * d2) * 4.0f;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            this.aq += (f5 - this.aq) * 0.4f;
            this.aU += this.aq;
        } else {
            this.U = 0.5f;
            this.aZ = 0.02f;
            super.f(f, f2);
        }
    }

    public void aj() {
        if (!this.worldObj.isRemote && this.x()) {
            this.a(px_0.a(Blocks.R), 1);
            this.q(false);
        }
    }

    public void l(boolean bl) {
        this.c(2, bl);
    }

    public void c(ItemStack itemStack) {
        aom_0.b(this.l, 22, P8.d(this.a(itemStack)));
        this.C();
    }

    static {
        ca = na_1::lambda$static$0;
        b9 = aHx.a(aHx.a(new S_(null, EA.aB, 0.7, 0.0, 2.0), EA.h), true);
        ce = new String[]{null, EA.aN, EA.aC, EA.K};
        b_ = new String[]{EA.av, EA.at, EA.aw, EA.aq};
        cg = new int[]{0, 5, 7, 11};
        b1 = new String[]{EA.ab, EA.aQ, EA.af, EA.ay, EA.ad, EA.ae, EA.n};
        bZ = new String[]{EA.o, EA.j, EA.A, EA.aH, EA.E, EA.N, EA.J};
        cf = new String[]{null, EA.as, EA.c, EA.aW, EA.Y};
        b0 = new String[]{EA.v, EA.aD, EA.aP, EA.U, EA.ac};
    }

    @Override
    public boolean ab() {
        return !this.ai() && super.ab();
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        Entity entity = aDJ.d(damageSource);
        return (this.h == null || !this.h.equals(entity)) && super.a(damageSource, f);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        Object object;
        Object object2;
        super.g(nBTTagCompound);
        this.o(tn_0.c(nBTTagCompound, EA.R));
        this.r(tn_0.c(nBTTagCompound, EA.D));
        this.q(tn_0.c(nBTTagCompound, EA.aX));
        this.p(tn_0.c(nBTTagCompound, EA.aT));
        this.q(tn_0.g(nBTTagCompound, EA.aK));
        this.o(tn_0.g(nBTTagCompound, EA.aM));
        this.l(tn_0.g(nBTTagCompound, EA.ap));
        this.l(tn_0.c(nBTTagCompound, EA.s));
        String string = EA.aE;
        if (tn_0.a(nBTTagCompound, EA.m, 8)) {
            string = tn_0.m(nBTTagCompound, EA.F);
        } else {
            object2 = tn_0.m(nBTTagCompound, EA.aa);
            string = TS.a((String)object2);
        }
        if (!StringInvoker.g(string)) {
            this.b(string);
        }
        object2 = ht_0.a(this.N(), EA.am);
        Ma.a(this.a(abb_0.e), Ma.b((ahw_2)object2) * 0.25);
        if (this.x()) {
            object = tn_0.c(nBTTagCompound, EA.aF, 10);
            this.P();
            for (int i = 0; i < kv_0.c((NBTTagList)object); ++i) {
                NBTTagCompound nBTTagCompound2 = kv_0.g((NBTTagList)object, i);
                int n = tn_0.e(nBTTagCompound2, EA.y) & 0xFF;
                if (n < 2 || n >= a7t.a(this.cd)) continue;
                a7t.a(this.cd, n, act_2.a(nBTTagCompound2));
            }
        }
        if (tn_0.a(nBTTagCompound, EA.aG, 10) && na_1.a(act_2.k((ItemStack)(object = act_2.a(tn_0.d(nBTTagCompound, EA.t)))))) {
            a7t.a(this.cd, 1, (ItemStack)object);
        }
        if (tn_0.a(nBTTagCompound, EA.ar, 10)) {
            object = act_2.a(tn_0.d(nBTTagCompound, EA.aR));
            if (act_2.k((ItemStack)object) == Items.saddle) {
                a7t.a(this.cd, 0, (ItemStack)object);
            }
        } else if (tn_0.c(nBTTagCompound, EA.az)) {
            a7t.a(this.cd, 0, new ItemStack(Items.saddle));
        }
        this.aM();
    }

    public boolean ai() {
        int n = this.y();
        return n == 3 || n == 4;
    }

    private void i() {
        if (!this.worldObj.isRemote) {
            this.bQ = 1;
            this.c(128, true);
        }
    }

    private void P() {
        w5_0 w5_02 = this.cd;
        this.cd = new w5_0(EA.ao, this.as());
        a7t.a(this.cd, this.getName());
        a7t.a(w5_02, this);
        int n = MathInvoker.b(a7t.a(w5_02), a7t.a(this.cd));
        for (int i = 0; i < n; ++i) {
            ItemStack itemStack = a7t.a(w5_02, i);
            a7t.a(this.cd, i, act_2.C(itemStack));
        }
        a7t.b(this.cd, this);
        this.aM();
    }

    public void aK() {
        this.a((Entity)this, this.cd);
        this.aj();
    }

    @Override
    public int Q() {
        return 400;
    }

    @Override
    public boolean B() {
        this.D();
        return super.B();
    }

    @Override
    public boolean W() {
        return this.h == null;
    }

    @Override
    protected void H() {
        super.H();
        ht_0.b(this.N(), b9);
        Ma.a(this.a(abb_0.b), 53.0);
        Ma.a(this.a(abb_0.e), 0.225f);
    }

    @Override
    public int O() {
        return cg[this.aO()];
    }

    public void t(boolean bl) {
        this.c(4, bl);
    }

    public void o(int n) {
        aom_0.b(this.l, 20, P8.d(n));
        this.C();
    }

    private void aM() {
        if (!this.worldObj.isRemote) {
            this.t(a7t.a(this.cd, 0) != null);
            if (this.A()) {
                this.c(a7t.a(this.cd, 1));
            }
        }
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return false;
    }

    public float c(float f) {
        return this.bV + (this.b5 - this.bV) * f;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.spawn_egg) {
            return super.a(entityPlayer);
        }
        if (!this.w() && this.ai()) {
            return false;
        }
        if (this.w() && this.aJ() && entityPlayer.isSneaking()) {
            this.e(entityPlayer);
            return true;
        }
        if (this.Z() && this.h != null) {
            return super.a(entityPlayer);
        }
        if (this.A()) {
            int n = -1;
            if (act_2.k(itemStack) == Items.iron_horse_armor) {
                n = 1;
            } else if (act_2.k(itemStack) == Items.golden_horse_armor) {
                n = 2;
            } else if (act_2.k(itemStack) == Items.diamond_horse_armor) {
                n = 3;
            }
            if (!this.w()) {
                this.aB();
                return true;
            }
            this.e(entityPlayer);
            return true;
        }
        if (!this.ai()) {
            float f = 0.0f;
            int n = 0;
            int n2 = 0;
            if (act_2.k(itemStack) == Items.wheat) {
                f = 2.0f;
                n = 20;
                n2 = 3;
            } else if (act_2.k(itemStack) == Items.sugar) {
                f = 1.0f;
                n = 30;
                n2 = 3;
            } else if (BlocksInvoker.a(act_2.k(itemStack)) == Blocks.y) {
                f = 20.0f;
                n = 180;
            } else if (act_2.k(itemStack) == Items.apple) {
                f = 3.0f;
                n = 60;
                n2 = 3;
            } else if (act_2.k(itemStack) == Items.golden_carrot) {
                f = 4.0f;
                n = 60;
                n2 = 5;
                if (this.w() && this.e() == 0) {
                    this.a(entityPlayer);
                }
            } else if (act_2.k(itemStack) == Items.golden_apple) {
                f = 10.0f;
                n = 240;
                n2 = 10;
                if (this.w() && this.e() == 0) {
                    this.a(entityPlayer);
                }
            }
            if (this.a() < this.b()) {
                float f2 = f - 0.0f;
                int cfr_ignored_1 = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
            }
            if (!this.aJ()) {
                this.j(n);
            }
            if (!this.w() && n2 < this.am()) {
                this.p(n2);
            }
            this.aq();
        }
        if (!this.w()) {
            if (act_2.a(itemStack, entityPlayer, this)) {
                return true;
            }
            this.aB();
            return true;
        }
        if (this.d() && !this.x() && act_2.k(itemStack) == px_0.a(Blocks.R)) {
            this.q(true);
            this.a(EA.q, 1.0f, (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            this.P();
        }
        if (this.Z() && !this.aH() && act_2.k(itemStack) == Items.saddle) {
            this.e(entityPlayer);
            return true;
        }
        if (!aSY.a(entityPlayer.abilities) && --itemStack.a == 0) {
            InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
        }
        return true;
    }

    public int y() {
        return aom_0.g(this.l, 19);
    }

    public boolean v() {
        return this.bW;
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        aum_1 aum_12 = block.l;
        if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.e(blockPos))) == Blocks.cm) {
            aum_12 = Blocks.cm.l;
        }
        if (!akm_1.f(BlocksInvoker.getBlockState(block))) {
            int n = this.y();
            if (this.h != null && n != 1 && n != 2) {
                ++this.bS;
                if (this.bS > 5 && this.bS % 3 == 0) {
                    this.a(EA.b, an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
                    if (a5_0.a(this.Q, 10) == 0) {
                        this.a(EA.X, an6_0.d(aum_12) * 0.6f, an6_0.b(aum_12));
                    }
                } else if (this.bS <= 5) {
                    this.a(EA.al, an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
                }
            } else if (aum_12 == Block.u) {
                this.a(EA.aJ, an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
            } else {
                this.a(EA.W, an6_0.d(aum_12) * 0.15f, an6_0.b(aum_12));
            }
        }
    }

    public int aI() {
        return this.b8;
    }

    public void o(boolean bl) {
        this.a(bl);
    }

    private double ar() {
        return (double)0.4f + a5_0.c(this.Q) * 0.2 + a5_0.c(this.Q) * 0.2 + a5_0.c(this.Q) * 0.2;
    }

    private void aq() {
        this.i();
        if (!this.Q()) {
            aV8.a(this.worldObj, this, EA.an, 1.0f, 1.0f + (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f);
        }
    }

    public void m(boolean bl) {
        this.bW = bl;
    }

    private void f(EntityPlayer entityPlayer) {
        entityPlayer.rotationYaw = this.rotationYaw;
        entityPlayer.rotationPitch = this.rotationPitch;
        this.o(false);
        this.n(false);
        if (!this.worldObj.isRemote) {
            entityPlayer.mountEntity(this);
        }
    }

    public int p(int n) {
        int n2 = MathHelper.a(this.aI() + n, 0, this.am());
        this.l(n2);
        return n2;
    }

    public void b(String string) {
        aom_0.b(this.l, 21, string);
    }

    protected String ak() {
        this.i();
        this.aF();
        int n = this.y();
        return n != 3 && n != 4 ? (n != 1 && n != 2 ? EA.aS : EA.S) : null;
    }

    @Override
    public float w() {
        return this.n;
    }

    private int a(ItemStack itemStack) {
        return 0;
    }

    public boolean c(EntityPlayer entityPlayer) {
        this.b(entityPlayer.J().toString());
        this.l(true);
        return true;
    }

    @Override
    public String getName() {
        if (this.e()) {
            return this.y();
        }
        int n = this.y();
        switch (n) {
            default: {
                return ahq_0.b(EA.O);
            }
            case 1: {
                return ahq_0.b(EA.aI);
            }
            case 2: {
                return ahq_0.b(EA.x);
            }
            case 3: {
                return ahq_0.b(EA.aj);
            }
            case 4: 
        }
        return ahq_0.b(EA.Q);
    }

    private void aF() {
        if (!this.worldObj.isRemote) {
            this.bR = 1;
            this.n(true);
        }
    }

    private double aa() {
        return ((double)0.45f + a5_0.c(this.Q) * 0.3 + a5_0.c(this.Q) * 0.3 + a5_0.c(this.Q) * 0.3) * 0.25;
    }

    public boolean an() {
        return this.ch;
    }

    public boolean aN() {
        return this.ai() || this.y() == 2;
    }

    private void aQ() {
        this.cc = 1;
    }

    public boolean aG() {
        return this.y() == 0 || this.aO() > 0;
    }

    public boolean aJ() {
        return !this.j();
    }

    public boolean w() {
        return this.n(2);
    }

    public boolean aH() {
        return this.n(4);
    }

    public int aO() {
        return aom_0.h(this.l, 22);
    }

    private void c(int n, boolean bl) {
        int n2 = aom_0.h(this.l, 16);
        aom_0.b(this.l, 16, P8.d(n2 | n));
    }

    @Override
    public void a(boolean bl) {
        this.c(32, bl);
    }

    @Override
    public void a(byte by) {
        if (by == 7) {
            this.s(true);
        } else if (by == 6) {
            this.s(false);
        } else {
            super.a(by);
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.worldObj.isRemote && aom_0.d(this.l)) {
            aom_0.e(this.l);
            this.C();
        }
        if (this.bQ > 0 && ++this.bQ > 30) {
            this.bQ = 0;
            this.c(128, false);
        }
        if (!this.worldObj.isRemote && this.bR > 0 && ++this.bR > 20) {
            this.bR = 0;
            this.n(false);
        }
        if (this.cc > 0 && ++this.cc > 8) {
            this.cc = 0;
        }
        if (this.bP > 0) {
            ++this.bP;
            if (this.bP > 300) {
                this.bP = 0;
            }
        }
        this.b2 = this.b4;
        if (this.az()) {
            this.b4 += (1.0f - this.b4) * 0.4f + 0.05f;
            if (this.b4 > 1.0f) {
                this.b4 = 1.0f;
            }
        } else {
            this.b4 += (0.0f - this.b4) * 0.4f - 0.05f;
            if (this.b4 < 0.0f) {
                this.b4 = 0.0f;
            }
        }
        this.bV = this.b5;
        if (this.aP()) {
            this.b4 = 0.0f;
            this.b2 = 0.0f;
            this.b5 += (1.0f - this.b5) * 0.4f + 0.05f;
            if (this.b5 > 1.0f) {
                this.b5 = 1.0f;
            }
        } else {
            this.cb = false;
            this.b5 += (0.8f * this.b5 * this.b5 * this.b5 - this.b5) * 0.6f - 0.05f;
            if (this.b5 < 0.0f) {
                this.b5 = 0.0f;
            }
        }
        this.b3 = this.b6;
        if (this.n(128)) {
            this.b6 += (1.0f - this.b6) * 0.7f + 0.05f;
            if (this.b6 > 1.0f) {
                this.b6 = 1.0f;
            }
        } else {
            this.b6 += (0.0f - this.b6) * 0.7f - 0.05f;
            if (this.b6 < 0.0f) {
                this.b6 = 0.0f;
            }
        }
    }

    @Override
    protected String d() {
        int n;
        this.i();
        if (a5_0.a(this.Q, 3) == 0) {
            this.aF();
        }
        return (n = this.y()) == 3 ? EA.au : (n == 4 ? EA.aO : (n != 1 && n != 2 ? EA.z : EA.aV));
    }

    @Override
    public boolean b(int n, ItemStack itemStack) {
        int n2;
        if (n == 499 && this.d()) {
            if (this.x()) {
                this.q(false);
                this.P();
                return true;
            }
            if (act_2.k(itemStack) == px_0.a(Blocks.R) && !this.x()) {
                this.q(true);
                this.P();
                return true;
            }
        }
        if ((n2 = n - 400) < 2 && n2 < a7t.a(this.cd)) {
            if (act_2.k(itemStack) != Items.saddle) {
                return false;
            }
            if (n2 != 1 || na_1.a(act_2.k(itemStack)) && this.A()) {
                a7t.a(this.cd, n2, itemStack);
                this.aM();
                return true;
            }
            return false;
        }
        int n3 = n - 500 + 2;
        if (n3 >= 2 && n3 < a7t.a(this.cd)) {
            a7t.a(this.cd, n3, itemStack);
            return true;
        }
        return false;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, P8.d(0));
        aom_0.a(this.l, 19, axt_2.a((byte)0));
        aom_0.a(this.l, 20, P8.d(0));
        aom_0.a(this.l, 21, EA.i);
        aom_0.a(this.l, 22, P8.d(0));
    }

    @Override
    protected String ac() {
        int n;
        this.i();
        if (a5_0.a(this.Q, 10) == 0 && !this.h()) {
            this.aF();
        }
        return (n = this.y()) == 3 ? EA.ag : (n == 4 ? EA.ah : (n != 1 && n != 2 ? EA.M : EA.l));
    }

    public void aB() {
        this.aF();
        String string = this.ak();
        this.a(string, this.f(), this.K());
    }

    @Override
    public void onLivingUpdate() {
        if (a5_0.a(this.Q, 200) == 0) {
            this.aQ();
        }
        super.onLivingUpdate();
        if (!this.worldObj.isRemote) {
            na_1 na_12;
            if (a5_0.a(this.Q, 900) == 0 && this.aS == 0) {
                this.d(1.0f);
            }
            if (!this.az() && this.h == null && a5_0.a(this.Q, 300) == 0 && BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) - 1, MathHelper.floor_double(this.posZ)))) == Blocks.grass) {
                this.o(true);
            }
            if (this.az() && ++this.b7 > 50) {
                this.b7 = 0;
                this.o(false);
            }
            if (this.aD() && !this.aJ() && !this.az() && this.g(na_12 = this.a((Entity)this, 16.0)) > 4.0) {
                tz_1.a(this.bl, na_12);
            }
        }
    }

    @Override
    public int al() {
        return 6;
    }

    private boolean n(int n) {
        return (aom_0.h(this.l, 16) & n) != 0;
    }

    private void a(Entity entity, w5_0 w5_02) {
        if (!this.worldObj.isRemote) {
            for (int i = 0; i < a7t.a(w5_02); ++i) {
                ItemStack itemStack = a7t.a(w5_02, i);
                this.a(itemStack, 0.0f);
            }
        }
    }

    public boolean x() {
        return this.n(8);
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (!this.worldObj.isRemote) {
            this.aK();
        }
    }

    @Override
    public void k(boolean bl) {
        this.l(this.ao());
    }

    private boolean aE() {
        return this.h == null && this.r == null && this.w() && this.aJ() && !this.aN() && this.a() >= this.b() && this.u();
    }

    @Override
    public void a(wu_0 wu_02) {
        int n = this.aO();
        this.aH();
        this.aM();
        if (this.ticksExisted > 20) {
            if (n != this.aO()) {
                this.a(EA.u, 0.5f, 1.0f);
            } else if (n != this.aO()) {
                this.a(EA.ak, 0.5f, 1.0f);
            }
            if (this.aH()) {
                this.a(EA.I, 0.5f, 1.0f);
            }
        }
    }

    private static boolean lambda$static$0(Entity entity) {
        return entity instanceof na_1 && ((na_1)entity).aD();
    }

    protected na_1 a(Entity entity, double d) {
        double d2 = Double.MAX_VALUE;
        Entity entity2 = null;
        Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, entity, h__0.a(entity.getEntityBoundingBox(), d, d, d), ca));
        while (dz_0.c(iterator)) {
            Entity entity3 = (Entity)dz_0.b(iterator);
            double d3 = entity3.d(entity.posX, entity.posY, entity.posZ);
            if (!(d3 < d2)) continue;
            entity2 = entity3;
            d2 = d3;
        }
        return (na_1)entity2;
    }

    public String[] aL() {
        if (this.bT == null) {
            this.av();
        }
        return this.bX;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, EA.p, this.az());
        tn_0.a(nBTTagCompound, EA.e, this.x());
        tn_0.a(nBTTagCompound, EA.V, this.an());
        tn_0.a(nBTTagCompound, EA.r, this.aD());
        tn_0.b(nBTTagCompound, EA.aA, this.y());
        tn_0.b(nBTTagCompound, EA.aL, this.E());
        tn_0.b(nBTTagCompound, EA.H, this.aI());
        tn_0.a(nBTTagCompound, EA.aU, this.w());
        tn_0.a(nBTTagCompound, EA.k, this.aA());
        if (this.x()) {
            NBTTagList nBTTagList = new NBTTagList();
            for (int i = 2; i < a7t.a(this.cd); ++i) {
                ItemStack itemStack = a7t.a(this.cd, i);
                NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
                tn_0.a(nBTTagCompound2, EA.T, (byte)i);
                act_2.a(itemStack, nBTTagCompound2);
                kv_0.a(nBTTagList, nBTTagCompound2);
            }
            tn_0.a(nBTTagCompound, EA.d, nBTTagList);
        }
        if (a7t.a(this.cd, 1) != null) {
            tn_0.a(nBTTagCompound, EA.G, (NBTBase)act_2.a(a7t.a(this.cd, 1), new NBTTagCompound()));
        }
        if (a7t.a(this.cd, 0) != null) {
            tn_0.a(nBTTagCompound, EA.a, (NBTBase)act_2.a(a7t.a(this.cd, 0), new NBTTagCompound()));
        }
    }

    private float z() {
        return 15.0f + (float)a5_0.a(this.Q, 8) + (float)a5_0.a(this.Q, 9);
    }

    private int as() {
        int n = this.y();
        return !this.x() || n != 1 && n != 2 ? 2 : 17;
    }

    public boolean az() {
        return this.n(32);
    }

    public void p(boolean bl) {
        this.ch = bl;
    }

    public na_1(World world) {
        super(world);
        this.c(1.4f, 1.6f);
        this.S = false;
        this.q(false);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _e_0(this, 1.2));
        aMS.a(this.bx, 1, new _i_0(this, 1.2));
        aMS.a(this.bx, 2, new _h_0(this, 1.0));
        aMS.a(this.bx, 4, new _D(this, 1.0));
        aMS.a(this.bx, 6, new _J(this, 0.7));
        aMS.a(this.bx, 7, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 8, new _A(this));
        this.P();
    }

    public static boolean a(Item item) {
        return item == Items.iron_horse_armor || item == Items.golden_horse_armor || item == Items.diamond_horse_armor;
    }

    public void r(boolean bl) {
        this.c(16, bl);
    }

    public boolean D() {
        int n = MathHelper.floor_double(this.posX);
        int n2 = MathHelper.floor_double(this.posZ);
        aV8.o(this.worldObj, new BlockPos(n, 0, n2));
        return true;
    }

    public void l(int n) {
        this.b8 = n;
    }

    @Override
    protected void k(float f) {
        if (f > 6.0f && this.az()) {
            this.o(false);
        }
    }

    @Override
    public boolean r() {
        return false;
    }

    @Override
    protected String C() {
        this.i();
        int n = this.y();
        return n == 3 ? EA.B : (n == 4 ? EA.C : (n != 1 && n != 2 ? EA.ai : EA.g));
    }

    public void n(boolean bl) {
        this.o(false);
        this.c(64, bl);
    }

    public float d(float f) {
        return this.b3 + (this.b6 - this.b3) * f;
    }

    @Override
    public void ab() {
        super.ab();
        if (this.bV > 0.0f) {
            float f = MathHelper.sin(this.aD * (float)Math.PI / 180.0f);
            float f2 = MathHelper.cos(this.aD * (float)Math.PI / 180.0f);
            float f3 = 0.7f * this.bV;
            float f4 = 0.15f * this.bV;
            this.h.j(this.posX + (double)(f3 * f), this.posY + this.i() + this.h.H() + (double)f4, this.posZ - (double)(f3 * f2));
            if (this.h instanceof EntityLivingBase) {
                ((EntityLivingBase)this.h).aD = this.aD;
            }
        }
    }

    public String at() {
        if (this.bT == null) {
            this.av();
        }
        return this.bT;
    }

    @Override
    public void b(float f, float f2) {
        Block block;
        if (f > 1.0f) {
            this.a(EA.w, 0.4f, 1.0f);
        }
        int n = MathHelper.c((f * 0.5f - 3.0f) * f2);
        this.a(DamageSource.n, (float)n);
        if (this.h != null) {
            this.h.a(DamageSource.n, (float)n);
        }
        if (BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this.posX, this.posY - 0.2 - (double)this.prevRotationYaw, this.posZ)))) != Material.air && !this.Q()) {
            aum_1 aum_12 = block.l;
            aV8.a(this.worldObj, this, an6_0.c(aum_12), an6_0.d(aum_12) * 0.5f, an6_0.b(aum_12) * 0.75f);
        }
    }

    public int am() {
        return 100;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        amk_02 = super.a(ach_02, amk_02);
        int n = 0;
        int n2 = 0;
        if (amk_02 instanceof dm_0) {
            n = ((dm_0)amk_02).b;
            n2 = ((dm_0)amk_02).a & 0xFF | a5_0.a(this.Q, 5) << 8;
        } else {
            if (a5_0.a(this.Q, 10) == 0) {
                n = 1;
            } else {
                int n3 = a5_0.a(this.Q, 7);
                int n4 = a5_0.a(this.Q, 5);
                n = 0;
                n2 = n3 | n4 << 8;
            }
            amk_02 = new dm_0(n, n2);
        }
        this.q(n);
        this.o(n2);
        if (a5_0.a(this.Q, 5) == 0) {
            this.k(-24000);
        }
        Ma.a(this.a(abb_0.b), this.z());
        Ma.a(this.a(abb_0.e), this.aa());
        Ma.a(this.a(b9), this.ar());
        this.i(this.b());
        return amk_02;
    }

    protected void s(boolean bl) {
        B7 b7 = B7.HEART;
        int n = 0;
        while (true) {
            double d = a5_0.f(this.Q) * 0.02;
            double d2 = a5_0.f(this.Q) * 0.02;
            double d3 = a5_0.f(this.Q) * 0.02;
            aV8.a(this.worldObj, b7, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
            ++n;
        }
    }

    public void e(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote && (this.h == null || this.h == entityPlayer) && this.w()) {
            a7t.a(this.cd, this.getName());
            a6w_0.a(entityPlayer, this, this.cd);
        }
    }

    public boolean Z() {
        return this.aJ();
    }

    public void q(int n) {
        aom_0.b(this.l, 19, axt_2.a((byte)n));
        this.C();
    }
}

