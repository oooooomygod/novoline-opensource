/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityMinecart;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.ol
 */
public class ol_2
extends EntityLivingBase {
    private int bm;
    private anl_0 bs;
    private ItemStack[] bf = new ItemStack[5];
    private boolean bg;
    private anl_0 br;
    private static anl_0 bo;
    private static anl_0 bj;
    private static anl_0 bn;
    private anl_0 bv;
    private long bh;
    private anl_0 bl;
    private static anl_0 bp;
    private anl_0 bt;
    private static anl_0 bq;
    private anl_0 bk = bu;
    private static anl_0 bu;
    private boolean bi;

    @Override
    public boolean a(EntityPlayer entityPlayer, Vec3 vec3) {
        if (this.a()) {
            return false;
        }
        if (!this.worldObj.isRemote && !a6w_0.l(entityPlayer)) {
            int n = 0;
            ItemStack itemStack = a6w_0.n(entityPlayer);
            if (act_2.k(itemStack) instanceof ItemArmor) {
                ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
                if (itemArmor.n == 3) {
                    n = 1;
                } else if (itemArmor.n == 2) {
                    n = 2;
                } else if (itemArmor.n == 1) {
                    n = 3;
                } else if (itemArmor.n == 0) {
                    n = 4;
                }
            }
            if (act_2.k(itemStack) == Items.skull || act_2.k(itemStack) == px_0.a(Blocks.ap)) {
                n = 4;
            }
            double d = 0.1;
            int n2 = 0;
            this.z();
            double d2 = vec3.yCoord * 2.0;
            if (d2 >= 0.1 && d2 < 0.1 + 0.8 && this.bf[1] != null) {
                n2 = 1;
            } else if (d2 >= 0.9 + 0.3 && d2 < 0.9 + 1.0 && this.bf[3] != null) {
                n2 = 3;
            } else if (d2 >= 0.4 && d2 < 0.4 + 1.0 && this.bf[2] != null) {
                n2 = 2;
            } else if (d2 >= 1.6 && this.bf[4] != null) {
                n2 = 4;
            }
            boolean bl = this.bf[n2] != null;
            if ((this.bm & 1 << n2) != 0 || (this.bm & 1 << n) != 0) {
                n2 = n;
                if ((this.bm & 1 << n) != 0) {
                    if ((this.bm & 1) != 0) {
                        return true;
                    }
                    n2 = 0;
                }
            }
            if (!this.k()) {
                return true;
            }
            this.a(entityPlayer, n);
            return true;
        }
        return true;
    }

    public boolean k() {
        return (aom_0.g(this.l, 10) & 4) != 0;
    }

    public boolean z() {
        return (aom_0.g(this.l, 10) & 1) != 0;
    }

    public anl_0 q() {
        return this.bl;
    }

    @Override
    public boolean aa() {
        return this.ac();
    }

    @Override
    public ItemStack[] ae() {
        return this.bf;
    }

    private void l(boolean bl) {
        byte by = aom_0.g(this.l, 10);
        by = (byte)(by | 1);
        aom_0.b(this.l, 10, axt_2.a(by));
    }

    public anl_0 l() {
        return this.bt;
    }

    private void k(boolean bl) {
        byte by = aom_0.g(this.l, 10);
        by = (byte)(by | 4);
        aom_0.b(this.l, 10, axt_2.a(by));
    }

    private void a(NBTTagCompound nBTTagCompound) {
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, ac0_0.p, 5);
        if (kv_0.c(nBTTagList) > 0) {
            this.a(new anl_0(nBTTagList));
        } else {
            this.a(bu);
        }
        NBTTagList nBTTagList2 = tn_0.c(nBTTagCompound, ac0_0.d, 5);
        if (kv_0.c(nBTTagList2) > 0) {
            this.f(new anl_0(nBTTagList2));
        } else {
            this.f(bj);
        }
        NBTTagList nBTTagList3 = tn_0.c(nBTTagCompound, ac0_0.w, 5);
        if (kv_0.c(nBTTagList3) > 0) {
            this.b(new anl_0(nBTTagList3));
        } else {
            this.b(bq);
        }
        NBTTagList nBTTagList4 = tn_0.c(nBTTagCompound, ac0_0.q, 5);
        if (kv_0.c(nBTTagList4) > 0) {
            this.e(new anl_0(nBTTagList4));
        } else {
            this.e(bp);
        }
        NBTTagList nBTTagList5 = tn_0.c(nBTTagCompound, ac0_0.A, 5);
        if (kv_0.c(nBTTagList5) > 0) {
            this.d(new anl_0(nBTTagList5));
        } else {
            this.d(bo);
        }
        NBTTagList nBTTagList6 = tn_0.c(nBTTagCompound, ac0_0.E, 5);
        if (kv_0.c(nBTTagList6) > 0) {
            this.c(new anl_0(nBTTagList6));
        } else {
            this.c(bn);
        }
    }

    public boolean i() {
        return (aom_0.g(this.l, 10) & 2) != 0;
    }

    public boolean a() {
        return (aom_0.g(this.l, 10) & 0x10) != 0;
    }

    @Override
    public ItemStack ah() {
        return this.bf[0];
    }

    @Override
    public boolean N() {
        return super.N() && !this.a();
    }

    public void d(anl_0 anl_02) {
        this.bl = anl_02;
        aom_0.b(this.l, 15, anl_02);
    }

    @Override
    public ItemStack d(int n) {
        return this.bf[n];
    }

    @Override
    public boolean j() {
        return this.z();
    }

    @Override
    public void b(boolean bl) {
        this.bi = bl;
        super.b(bl);
    }

    private void i(boolean bl) {
        byte by = aom_0.g(this.l, 10);
        by = (byte)(by | 2);
        aom_0.b(this.l, 10, axt_2.a(by));
    }

    private NBTTagCompound o() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        if (!bu.equals(this.bk)) {
            tn_0.a(nBTTagCompound, ac0_0.s, C3.c(this.bk));
        }
        if (!bj.equals(this.bt)) {
            tn_0.a(nBTTagCompound, ac0_0.f, C3.c(this.bt));
        }
        if (!bq.equals(this.bv)) {
            tn_0.a(nBTTagCompound, ac0_0.H, C3.c(this.bv));
        }
        if (!bp.equals(this.br)) {
            tn_0.a(nBTTagCompound, ac0_0.D, C3.c(this.br));
        }
        if (!bo.equals(this.bl)) {
            tn_0.a(nBTTagCompound, ac0_0.k, C3.c(this.bl));
        }
        if (!bn.equals(this.bs)) {
            tn_0.a(nBTTagCompound, ac0_0.r, C3.c(this.bs));
        }
        return nBTTagCompound;
    }

    private void a(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = this.bf[n];
        if ((this.bm & 1 << n + 8) == 0 && (this.bm & 1 << n + 16) == 0) {
            int n2 = entityPlayer.inventory.a;
            ItemStack itemStack2 = InventoryInvoker.c(entityPlayer.inventory, n2);
            if (aSY.a(entityPlayer.abilities) && act_2.k(itemStack) == px_0.a(Blocks.air)) {
                ItemStack itemStack3 = act_2.C(itemStack2);
                itemStack3.a = 1;
                this.c(n, itemStack3);
            } else if (itemStack2.a > 1) {
                ItemStack itemStack4 = act_2.C(itemStack2);
                itemStack4.a = 1;
                this.c(n, itemStack4);
                --itemStack2.a;
            } else {
                this.c(n, itemStack2);
                InventoryInvoker.a(entityPlayer.inventory, n2, itemStack);
            }
        }
    }

    @Override
    protected float a(float f, float f2) {
        this.ay = this.prevRotationYaw;
        this.aD = this.rotationYaw;
        return 0.0f;
    }

    public void e(anl_0 anl_02) {
        this.br = anl_02;
        aom_0.b(this.l, 14, anl_02);
    }

    public void c(anl_0 anl_02) {
        this.bs = anl_02;
        aom_0.b(this.l, 16, anl_02);
    }

    public ol_2(World world, double d, double d2, double d3) {
        this(world);
        this.j(d, d2, d3);
    }

    public anl_0 p() {
        return this.br;
    }

    public anl_0 d() {
        return this.bk;
    }

    private void j(float f) {
        float f2 = this.a();
        if ((f2 -= f) <= 0.5f) {
            this.n();
            this.E();
        } else {
            this.i(f2);
        }
    }

    public anl_0 m() {
        return this.bv;
    }

    private void m(boolean bl) {
        byte by = aom_0.g(this.l, 10);
        by = (byte)(by | 8);
        aom_0.b(this.l, 10, axt_2.a(by));
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        for (ItemStack itemStack : this.bf) {
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            act_2.a(itemStack, nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, ac0_0.x, nBTTagList);
        if (this.aA() && (this.y() == null || StringInvoker.g(this.y()))) {
            tn_0.a(nBTTagCompound, ac0_0.o, this.aA());
        }
        tn_0.a(nBTTagCompound, ac0_0.F, this.ac());
        tn_0.a(nBTTagCompound, ac0_0.i, this.z());
        tn_0.a(nBTTagCompound, ac0_0.h, this.k());
        tn_0.b(nBTTagCompound, ac0_0.a, this.bm);
        tn_0.a(nBTTagCompound, ac0_0.B, this.i());
        tn_0.a(nBTTagCompound, ac0_0.t, this.s());
        if (this.a()) {
            tn_0.a(nBTTagCompound, ac0_0.u, this.a());
        }
        tn_0.a(nBTTagCompound, ac0_0.G, (NBTBase)this.o());
    }

    @Override
    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox()) * 4.0;
        if (db_0.f(d2) || d2 == 0.0) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void f(float f, float f2) {
        if (!this.i()) {
            super.f(f, f2);
        }
    }

    @Override
    public boolean W() {
        return false;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 10, axt_2.a((byte)0));
        aom_0.a(this.l, 11, bu);
        aom_0.a(this.l, 12, bj);
        aom_0.a(this.l, 13, bq);
        aom_0.a(this.l, 14, bp);
        aom_0.a(this.l, 15, bo);
        aom_0.a(this.l, 16, bn);
    }

    private void n(boolean bl) {
        byte by = aom_0.g(this.l, 10);
        by = (byte)(by | 0x10);
        aom_0.b(this.l, 10, axt_2.a(by));
    }

    private void c() {
        BlocksInvoker.a(this.worldObj, new BlockPos(this), new ItemStack(Items.armor_stand));
        this.n();
    }

    static {
        bu = new anl_0(0.0f, 0.0f, 0.0f);
        bj = new anl_0(0.0f, 0.0f, 0.0f);
        bq = new anl_0(-10.0f, 0.0f, -10.0f);
        bp = new anl_0(-15.0f, 0.0f, 10.0f);
        bo = new anl_0(-1.0f, 0.0f, -1.0f);
        bn = new anl_0(1.0f, 0.0f, 1.0f);
    }

    private void n() {
        for (int i = 0; i < this.bf.length; ++i) {
            if (this.bf[i] == null || this.bf[i].a <= 0) continue;
            if (this.bf[i] != null) {
                BlocksInvoker.a(this.worldObj, amv_2.e(new BlockPos(this)), this.bf[i]);
            }
            this.bf[i] = null;
        }
    }

    public ol_2(World world) {
        super(world);
        this.bt = bj;
        this.bv = bq;
        this.br = bp;
        this.bl = bo;
        this.bs = bn;
        this.c(true);
        this.H = this.i();
        this.c(0.5f, 1.975f);
    }

    public boolean s() {
        return (aom_0.g(this.l, 10) & 8) != 0;
    }

    @Override
    public void c(int n, ItemStack itemStack) {
        this.bf[n] = itemStack;
    }

    private void j(boolean bl) {
        double d = this.posX;
        double d2 = this.posY;
        double d3 = this.posZ;
        this.c(0.5f, 1.975f);
        this.j(d, d2, d3);
    }

    @Override
    public boolean b(int n, ItemStack itemStack) {
        int n2;
        if (n == 99) {
            n2 = 0;
        } else {
            n2 = n - 100 + 1;
            if (n2 >= this.bf.length) {
                return false;
            }
        }
        if (!(CG.a(itemStack) == n2 || n2 == 4 && act_2.k(itemStack) instanceof ItemBlock)) {
            return false;
        }
        this.c(n2, itemStack);
        return true;
    }

    @Override
    public ItemStack a(int n) {
        return this.bf[n + 1];
    }

    public anl_0 t() {
        return this.bs;
    }

    @Override
    public void onUpdate() {
        anl_0 anl_02;
        anl_0 anl_03;
        anl_0 anl_04;
        anl_0 anl_05;
        anl_0 anl_06;
        super.onUpdate();
        anl_0 anl_07 = aom_0.b(this.l, 11);
        if (!this.bk.equals(anl_07)) {
            this.a(anl_07);
        }
        if (!this.bt.equals(anl_06 = aom_0.b(this.l, 12))) {
            this.f(anl_06);
        }
        if (!this.bv.equals(anl_05 = aom_0.b(this.l, 13))) {
            this.b(anl_05);
        }
        if (!this.br.equals(anl_04 = aom_0.b(this.l, 14))) {
            this.e(anl_04);
        }
        if (!this.bl.equals(anl_03 = aom_0.b(this.l, 15))) {
            this.d(anl_03);
        }
        if (!this.bs.equals(anl_02 = aom_0.b(this.l, 16))) {
            this.c(anl_02);
        }
        boolean bl = this.a();
        if (!this.bg) {
            this.j(false);
            this.bg = bl;
            return;
        }
        if (this.bg) {
            // empty if block
        }
    }

    public void a(anl_0 anl_02) {
        this.bk = anl_02;
        aom_0.b(this.l, 11, anl_02);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        NBTBase nBTBase;
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, ac0_0.m, 9)) {
            nBTBase = tn_0.c(nBTTagCompound, ac0_0.v, 10);
            for (int i = 0; i < this.bf.length; ++i) {
                this.bf[i] = act_2.a(kv_0.g(nBTBase, i));
            }
        }
        this.b(tn_0.c(nBTTagCompound, ac0_0.e));
        this.l(tn_0.c(nBTTagCompound, ac0_0.j));
        this.k(tn_0.c(nBTTagCompound, ac0_0.y));
        this.bm = tn_0.g(nBTTagCompound, ac0_0.g);
        this.i(tn_0.c(nBTTagCompound, ac0_0.b));
        this.m(tn_0.c(nBTTagCompound, ac0_0.n));
        this.n(tn_0.c(nBTTagCompound, ac0_0.z));
        this.bg = !this.a();
        this.H = this.i();
        nBTBase = tn_0.d(nBTTagCompound, ac0_0.l);
        this.a((NBTTagCompound)nBTBase);
    }

    @Override
    public boolean ad() {
        return super.ad() && !this.i();
    }

    @Override
    protected void B() {
        this.b(this.bi);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.worldObj.isRemote) {
            return false;
        }
        if (DamageSource.m.equals(damageSource)) {
            this.E();
            return false;
        }
        if (!(this.a(damageSource) || this.bi || this.a())) {
            if (aDJ.h(damageSource)) {
                this.n();
                this.E();
                return false;
            }
            if (DamageSource.b.equals(damageSource)) {
                if (!this.ag()) {
                    this.a(5);
                } else {
                    this.j(0.15f);
                }
                return false;
            }
            if (DamageSource.d.equals(damageSource) && this.a() > 0.5f) {
                this.j(4.0f);
                return false;
            }
            ac0_0.C.equals(aDJ.k(damageSource));
            ac0_0.c.equals(aDJ.k(damageSource));
            return false;
        }
        return false;
    }

    @Override
    public float w() {
        return this.j() ? this.n * 0.5f : this.n * 0.9f;
    }

    private void x() {
        if (this.worldObj instanceof WorldServer) {
            a3V.a((WorldServer)this.worldObj, B7.BLOCK_DUST, this.posX, this.posY + (double)this.n / 1.5, this.posZ, 10, this.width / 4.0f, this.n / 4.0f, this.width / 4.0f, 0.05, new int[]{BlocksInvoker.a(BlocksInvoker.t(Blocks.planks))});
        }
    }

    @Override
    protected void L() {
        List list = aV8.a(this.worldObj, (Entity)this, this.getEntityBoundingBox());
        if (!ListInvoker.isEmpty(list)) {
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                Entity entity2 = entity;
                if (!(entity2 instanceof EntityMinecart) || yw_2.c((EntityMinecart)entity2) != anf_0.RIDEABLE || !(this.g(entity2) <= 0.2)) continue;
                entity2.e(this);
            }
        }
    }

    @Override
    public void ao() {
        this.E();
    }

    public void f(anl_0 anl_02) {
        this.bt = anl_02;
        aom_0.b(this.l, 12, anl_02);
    }

    @Override
    protected void b(Entity entity) {
    }

    public void b(anl_0 anl_02) {
        this.bv = anl_02;
        aom_0.b(this.l, 13, anl_02);
    }
}

