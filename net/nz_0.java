/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nZ
 */
public class nz_0
extends n4_0
implements a7K,
aHI {
    private boolean bM;
    private int b0;
    private int bU;
    private boolean bS;
    private wu_0 bR = new wu_0(oj_0.f, false, 8);
    private F8 bO;
    aym_1 b1;
    private EntityPlayer bV;
    private String bT;
    private boolean bQ;
    private boolean bX;
    private int bW;
    private boolean bY;
    private boolean bP;
    private int bN;
    private int b2;
    private static axr_0[][][][] bZ = new axr_0[][][][]{{{{new OI(Items.wheat, new a6C(18, 22)), new OI(Items.potato, new a6C(15, 19)), new OI(Items.carrot, new a6C(15, 19)), new a32(Items.bread, new a6C(-4, -2))}, {new OI(px_0.a(Blocks.ap), new a6C(8, 13)), new a32(Items.pumpkin_pie, new a6C(-3, -2))}, {new OI(px_0.a(Blocks.aQ), new a6C(7, 12)), new a32(Items.apple, new a6C(-5, -7))}, {new a32(Items.cookie, new a6C(-6, -10)), new a32(Items.cake, new a6C(1, 1))}}, {{new OI(Items.string, new a6C(15, 20)), new OI(Items.coal, new a6C(16, 24)), new vy_0(Items.fish, new a6C(6, 6), Items.cooked_fish, new a6C(6, 6))}, {new axl_2(Items.fishing_rod, new a6C(7, 8))}}, {{new OI(px_0.a(Blocks.b_), new a6C(16, 22)), new a32(Items.shears, new a6C(3, 4))}, {new a32(new ItemStack(px_0.a(Blocks.b_), 1, 0), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 1), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 2), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 3), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 4), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 5), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 6), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 7), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 8), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 9), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 10), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 11), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 12), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 13), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 14), new a6C(1, 2)), new a32(new ItemStack(px_0.a(Blocks.b_), 1, 15), new a6C(1, 2))}}, {{new OI(Items.string, new a6C(15, 20)), new a32(Items.arrow, new a6C(-12, -8))}, {new a32(Items.bow, new a6C(2, 3)), new vy_0(px_0.a(Blocks.gravel), new a6C(10, 10), Items.flint, new a6C(6, 10))}}}, {{{new OI(Items.paper, new a6C(24, 36)), new lo_1()}, {new OI(Items.book, new a6C(8, 10)), new a32(Items.compass, new a6C(10, 12)), new a32(px_0.a(Blocks.at), new a6C(3, 4))}, {new OI(Items.written_book, new a6C(2, 2)), new a32(Items.clock, new a6C(10, 12)), new a32(px_0.a(Blocks.a8), new a6C(-5, -3))}, {new lo_1()}, {new lo_1()}, {new a32(Items.name_tag, new a6C(20, 22))}}}, {{{new OI(Items.rotten_flesh, new a6C(36, 40)), new OI(Items.gold_ingot, new a6C(8, 10))}, {new a32(Items.redstone, new a6C(-4, -1)), new a32(new ItemStack(Items.dye, 1, my_2.c(YZ.BLUE)), new a6C(-2, -1))}, {new a32(Items.ender_eye, new a6C(7, 11)), new a32(px_0.a(Blocks.bs), new a6C(-3, -1))}, {new a32(Items.experience_bottle, new a6C(3, 11))}}}, {{{new OI(Items.coal, new a6C(16, 24)), new a32(Items.iron_helmet, new a6C(4, 6))}, {new OI(Items.iron_ingot, new a6C(7, 9)), new a32(Items.iron_chestplate, new a6C(10, 14))}, {new OI(Items.diamond, new a6C(3, 4)), new axl_2(Items.diamond_chestplate, new a6C(16, 19))}, {new a32(Items.chainmail_boots, new a6C(5, 7)), new a32(Items.chainmail_leggings, new a6C(9, 11)), new a32(Items.chainmail_helmet, new a6C(5, 7)), new a32(Items.chainmail_chestplate, new a6C(11, 15))}}, {{new OI(Items.coal, new a6C(16, 24)), new a32(Items.iron_axe, new a6C(6, 8))}, {new OI(Items.iron_ingot, new a6C(7, 9)), new axl_2(Items.iron_sword, new a6C(9, 10))}, {new OI(Items.diamond, new a6C(3, 4)), new axl_2(Items.diamond_sword, new a6C(12, 15)), new axl_2(Items.diamond_axe, new a6C(9, 12))}}, {{new OI(Items.coal, new a6C(16, 24)), new axl_2(Items.iron_shovel, new a6C(5, 7))}, {new OI(Items.iron_ingot, new a6C(7, 9)), new axl_2(Items.iron_pickaxe, new a6C(9, 11))}, {new OI(Items.diamond, new a6C(3, 4)), new axl_2(Items.diamond_pickaxe, new a6C(12, 15))}}}, {{{new OI(Items.porkchop, new a6C(14, 18)), new OI(Items.chicken, new a6C(14, 18))}, {new OI(Items.coal, new a6C(16, 24)), new a32(Items.cooked_porkchop, new a6C(-7, -5)), new a32(Items.cooked_chicken, new a6C(-8, -6))}}, {{new OI(Items.leather, new a6C(9, 12)), new a32(Items.leather_leggings, new a6C(2, 4))}, {new axl_2(Items.leather_chestplate, new a6C(7, 12))}, {new a32(Items.saddle, new a6C(8, 10))}}}};

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, oj_0.q, this.E());
        tn_0.b(nBTTagCompound, oj_0.m, this.b0);
        tn_0.b(nBTTagCompound, oj_0.I, this.b2);
        tn_0.b(nBTTagCompound, oj_0.b, this.bN);
        tn_0.a(nBTTagCompound, oj_0.c, this.bS);
        if (this.bO != null) {
            tn_0.a(nBTTagCompound, oj_0.l, (NBTBase)aG4.a(this.bO));
        }
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < ajs_0.a(this.bR); ++i) {
            ItemStack itemStack = ajs_0.a(this.bR, i);
            kv_0.a(nBTTagList, act_2.a(itemStack, new NBTTagCompound()));
        }
        tn_0.a(nBTTagCompound, oj_0.H, nBTTagList);
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        boolean bl = act_2.k(itemStack) == Items.spawn_egg;
        if (this.n() && !this.H() && !this.j()) {
            if (!(this.worldObj.isRemote || this.bO != null && this.bO.isEmpty())) {
                this.a(entityPlayer);
                a6w_0.a(entityPlayer, this);
            }
            a6w_0.a(entityPlayer, aop_1.T);
            return true;
        }
        return super.a(entityPlayer);
    }

    private void h() {
        int n;
        axr_0[][] axr_0Array;
        int n2;
        axr_0[][][] axr_0Array2 = bZ[this.E()];
        if (this.b2 != 0 && this.bN != 0) {
            ++this.bN;
        } else {
            this.b2 = a5_0.a(this.Q, axr_0Array2.length) + 1;
            this.bN = 1;
        }
        if (this.bO == null) {
            this.bO = new F8();
        }
        if ((n2 = this.bN - 1) < (axr_0Array = axr_0Array2[n = this.b2 - 1]).length) {
            axr_0[] axr_0Array3;
            for (axr_0 axr_02 : axr_0Array3 = axr_0Array[n2]) {
                axr_02.a(this.bO, this.Q);
            }
        }
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        amk_02 = super.a(ach_02, amk_02);
        this.l(a5_0.a(this.worldObj.o, 5));
        this.C();
        return amk_02;
    }

    @Override
    public void a(F8 f8) {
    }

    public boolean u() {
        for (int i = 0; i < ajs_0.a(this.bR); ++i) {
            ItemStack itemStack = ajs_0.a(this.bR, i);
            if (act_2.k(itemStack) != Items.wheat_seeds && act_2.k(itemStack) != Items.potato && act_2.k(itemStack) != Items.carrot) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(int n, ItemStack itemStack) {
        if (super.b(n, itemStack)) {
            return true;
        }
        int n2 = n - 300;
        if (n2 < ajs_0.a(this.bR)) {
            ajs_0.a(this.bR, n2, itemStack);
            return true;
        }
        return false;
    }

    private void a(B7 b7) {
        int n = 0;
        while (true) {
            double d = a5_0.f(this.Q) * 0.02;
            double d2 = a5_0.f(this.Q) * 0.02;
            double d3 = a5_0.f(this.Q) * 0.02;
            aV8.a(this.worldObj, b7, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 1.0 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
            ++n;
        }
    }

    public boolean D() {
        boolean bl = this.E() == 0;
        return !this.m(5);
    }

    public boolean F() {
        return this.m(2);
    }

    private boolean a(Item item) {
        return item == Items.bread || item == Items.potato || item == Items.carrot || item == Items.wheat || item == Items.wheat_seeds;
    }

    private boolean m(int n) {
        boolean bl = this.E() == 0;
        for (int i = 0; i < ajs_0.a(this.bR); ++i) {
            ItemStack itemStack = ajs_0.a(this.bR, i);
            if (act_2.k(itemStack) == Items.bread && itemStack.a >= 3 * n || act_2.k(itemStack) == Items.potato && itemStack.a >= 12 * n || act_2.k(itemStack) == Items.carrot && itemStack.a >= 12 * n) {
                return true;
            }
            if (act_2.k(itemStack) != Items.wheat || itemStack.a < 9 * n) continue;
            return true;
        }
        return false;
    }

    private void C() {
        if (!this.bM) {
            this.bM = true;
            if (this.j()) {
                aMS.a(this.bx, 8, new _t_0(this, 0.32));
            } else if (this.E() == 0) {
                aMS.a(this.bx, 6, new _B(this, 0.6));
            }
        }
    }

    public nz_0(World world, int n) {
        super(world);
        this.l(n);
        this.c(0.6f, 1.8f);
        afv_0.a((F_)this.Z(), true);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _x_0<n0_0>(this, n0_0.class, 8.0f, 0.6, 0.6));
        aMS.a(this.bx, 1, new _1(this));
        aMS.a(this.bx, 1, new al6_0(this));
        aMS.a(this.bx, 2, new _G(this));
        aMS.a(this.bx, 3, new _d_0(this));
        aMS.a(this.bx, 4, new _o_0(this, true));
        aMS.a(this.bx, 5, new _P(this, 0.6));
        aMS.a(this.bx, 6, new _T(this));
        aMS.a(this.bx, 7, new _4(this));
        aMS.a(this.bx, 9, new alj_2(this, EntityPlayer.class, 3.0f, 1.0f));
        aMS.a(this.bx, 9, new alp_2(this));
        aMS.a(this.bx, 9, new _J(this, 0.6));
        aMS.a(this.bx, 10, new aly_2(this, nl_1.class, 8.0f));
        this.i(true);
    }

    @Override
    public void a(ItemStack itemStack) {
        if (!this.worldObj.isRemote && this.bs > -this.Q() + 20) {
            this.bs = -this.Q();
            this.a(oj_0.G, this.f(), this.K());
        }
    }

    @Override
    protected String C() {
        return oj_0.i;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        NBTBase nBTBase;
        super.g(nBTTagCompound);
        this.l(tn_0.g(nBTTagCompound, oj_0.u));
        this.b0 = tn_0.g(nBTTagCompound, oj_0.B);
        this.b2 = tn_0.g(nBTTagCompound, oj_0.z);
        this.bN = tn_0.g(nBTTagCompound, oj_0.w);
        this.bS = tn_0.c(nBTTagCompound, oj_0.g);
        if (tn_0.a(nBTTagCompound, oj_0.h, 10)) {
            nBTBase = tn_0.d(nBTTagCompound, oj_0.o);
            this.bO = new F8((NBTTagCompound)nBTBase);
        }
        nBTBase = tn_0.c(nBTTagCompound, oj_0.D, 10);
        for (int i = 0; i < kv_0.c((NBTTagList)nBTBase); ++i) {
            ItemStack itemStack = act_2.a(kv_0.g((NBTTagList)nBTBase, i));
            ajs_0.a(this.bR, itemStack);
        }
        this.i(true);
        this.C();
    }

    @Override
    public void a(ahh_0 ahh_02) {
        aEU.d(ahh_02);
        this.bs = -this.Q();
        this.a(oj_0.k, this.f(), this.K());
        int n = 3 + a5_0.a(this.Q, 4);
        if (aEU.h(ahh_02) == 1 || a5_0.a(this.Q, 5) == 0) {
            this.bU = 40;
            this.bY = true;
            this.bS = true;
            this.bT = this.bV != null ? this.bV.getName() : null;
            n += 5;
        }
        if (act_2.k(aEU.e(ahh_02)) == Items.emerald) {
            this.b0 += aEU.e((ahh_0)ahh_02).a;
        }
        if (aEU.i(ahh_02)) {
            aV8.b(this.worldObj, new oa_2(this.worldObj, this.posX, this.posY + 0.5, this.posZ, n));
        }
    }

    public void i() {
        this.bP = true;
    }

    public boolean J() {
        return this.bQ;
    }

    @Override
    public EntityPlayer a() {
        return this.bV;
    }

    @Override
    protected void d() {
        if (this.E() == 0) {
            aMS.a(this.bx, 8, new _B(this, 0.6));
        }
        super.d();
    }

    public void m(boolean bl) {
        this.bX = bl;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.e), 0.5);
    }

    @Override
    protected void f() {
        Object object;
        Object object2;
        if (--this.bW <= 0) {
            object2 = new BlockPos(this);
            EX.a(aV8.o(this.worldObj), (BlockPos)object2);
            this.bW = 70 + a5_0.a(this.Q, 50);
            this.b1 = EX.a(aV8.o(this.worldObj), (BlockPos)object2, 32);
            if (this.b1 == null) {
                this.c();
            } else {
                object = xx_2.c(this.b1);
                this.a((BlockPos)object, (int)((float)xx_2.f(this.b1) * 1.0f));
                if (this.bP) {
                    this.bP = false;
                    xx_2.a(this.b1, 5);
                }
            }
        }
        if (!this.H() && this.bU > 0) {
            --this.bU;
            if (this.bU <= 0) {
                if (this.bY) {
                    object2 = this.bO.iterator();
                    while (dz_0.c((Iterator)object2)) {
                        object = (ahh_0)dz_0.b((Iterator)object2);
                        if (!aEU.c((ahh_0)object)) continue;
                        aEU.a((ahh_0)object, a5_0.a(this.Q, 6) + a5_0.a(this.Q, 6) + 2);
                    }
                    this.h();
                    this.bY = false;
                    if (this.b1 != null && this.bT != null) {
                        aV8.a(this.worldObj, (Entity)this, (byte)14);
                        xx_2.a(this.b1, this.bT, 1);
                    }
                }
                this.a(new a2l_0(ari_0.f(Potion.regeneration), 200, 0));
            }
        }
        super.f();
    }

    public void l(int n) {
        aom_0.b(this.l, 16, P8.d(n));
    }

    @Override
    public void a(byte by) {
        if (by == 12) {
            this.a(B7.HEART);
        } else if (by == 13) {
            this.a(B7.VILLAGER_ANGRY);
        } else if (by == 14) {
            this.a(B7.VILLAGER_HAPPY);
        } else {
            super.a(by);
        }
    }

    @Override
    public nz_0 a(n4_0 n4_02) {
        nz_0 nz_02 = new nz_0(this.worldObj);
        nz_02.a(aV8.b(this.worldObj, new BlockPos(nz_02)), (amk_0)null);
        return nz_02;
    }

    @Override
    protected String ac() {
        return this.H() ? oj_0.e : oj_0.A;
    }

    @Override
    public IChatComponent getDisplayName() {
        String string = this.y();
        if (!StringInvoker.g(string)) {
            ChatComponentText chatComponentText = new ChatComponentText(string);
            HX.a(axq_2.b(chatComponentText), this.h());
            HX.a(axq_2.b(chatComponentText), this.J().toString());
            return chatComponentText;
        }
        if (this.bO == null) {
            this.h();
        }
        String string2 = null;
        switch (this.E()) {
            case 0: {
                if (this.b2 == 1) {
                    string2 = oj_0.F;
                    break;
                }
                if (this.b2 == 2) {
                    string2 = oj_0.a;
                    break;
                }
                if (this.b2 == 3) {
                    string2 = oj_0.x;
                    break;
                }
                if (this.b2 != 4) break;
                string2 = oj_0.t;
                break;
            }
            case 1: {
                string2 = oj_0.E;
                break;
            }
            case 2: {
                string2 = oj_0.C;
                break;
            }
            case 3: {
                if (this.b2 == 1) {
                    string2 = oj_0.j;
                    break;
                }
                if (this.b2 == 2) {
                    string2 = oj_0.r;
                    break;
                }
                if (this.b2 != 3) break;
                string2 = oj_0.y;
                break;
            }
            case 4: {
                if (this.b2 == 1) {
                    string2 = oj_0.v;
                    break;
                }
                if (this.b2 != 2) break;
                string2 = oj_0.n;
            }
        }
        aoz_1 aoz_12 = new aoz_1(aL0.a(aL0.a(new StringBuilder(), oj_0.s), string2).toString(), new Object[0]);
        HX.a(aIW.a(aoz_12), this.h());
        HX.a(aIW.a(aoz_12), this.J().toString());
        return aoz_12;
    }

    @Override
    protected void a(og_0 og_02) {
        ItemStack itemStack = aec_0.k(og_02);
        Item item = act_2.k(itemStack);
        if (this.a(item)) {
            ajs_0.a(this.bR, itemStack);
            og_02.E();
        }
    }

    @Override
    public void b(EntityLivingBase entityLivingBase) {
        super.b(entityLivingBase);
        if (this.b1 != null) {
            xx_2.a(this.b1, entityLivingBase);
            if (entityLivingBase instanceof EntityPlayer) {
                int n = -1;
                if (this.j()) {
                    n = -3;
                }
                xx_2.a(this.b1, entityLivingBase.getName(), n);
                if (this.n()) {
                    aV8.a(this.worldObj, (Entity)this, (byte)13);
                }
            }
        }
    }

    @Override
    public void a(ou_2 ou_22) {
        if (!this.worldObj.isRemote && !this.isDead) {
            nm_0 nm_02 = new nm_0(this.worldObj);
            nm_02.c(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            nm_02.a(aV8.b(this.worldObj, new BlockPos(nm_02)), (amk_0)null);
            nm_02.j(this.aj());
            if (this.e()) {
                nm_02.a(this.y());
                nm_02.g(this.aA());
            }
            aV8.b(this.worldObj, nm_02);
            this.E();
        }
    }

    @Override
    public boolean ab() {
        return false;
    }

    @Override
    protected boolean s() {
        return false;
    }

    public boolean H() {
        return this.bV != null;
    }

    @Override
    public void a(EntityPlayer entityPlayer) {
        this.bV = entityPlayer;
    }

    public void l(boolean bl) {
        this.bS = bl;
    }

    @Override
    public float w() {
        float f = 1.62f;
        if (this.j()) {
            f = (float)((double)f - 0.81);
        }
        return f;
    }

    public void n(boolean bl) {
        this.bQ = bl;
    }

    public boolean o(boolean bl) {
        int n;
        if (!this.bS && this.G() && (n = 0) < ajs_0.a(this.bR)) {
            ItemStack itemStack = ajs_0.a(this.bR, n);
            if (act_2.k(itemStack) == Items.bread && itemStack.a >= 3) {
                ajs_0.a(this.bR, n, 3);
            } else if ((act_2.k(itemStack) == Items.potato || act_2.k(itemStack) == Items.carrot) && itemStack.a >= 12) {
                ajs_0.a(this.bR, n, 12);
            }
            aV8.a(this.worldObj, (Entity)this, (byte)18);
            this.bS = true;
        }
        return this.bS;
    }

    public boolean G() {
        return this.m(1);
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        if (this.b1 != null) {
            Entity entity = aDJ.d(damageSource);
            if (entity instanceof EntityPlayer) {
                xx_2.a(this.b1, entity.getName(), -2);
            } else if (entity instanceof ar0_0) {
                xx_2.b(this.b1);
            }
        }
        super.onDeath(damageSource);
    }

    @Override
    public F8 b(EntityPlayer entityPlayer) {
        if (this.bO == null) {
            this.h();
        }
        return this.bO;
    }

    public nz_0(World world) {
        this(world, 0);
    }

    public int E() {
        return MathInvoker.max(aom_0.h(this.l, 16) % 5, 0);
    }

    public wu_0 v() {
        return this.bR;
    }

    @Override
    protected String d() {
        return oj_0.d;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, P8.d(0));
    }

    public boolean I() {
        return this.bX;
    }
}

