/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;
import deobf.NBTTagList;
import net.minecraft.network.packts.S1BPacketEntityAttach;
import java.util.Iterator;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nL
 */
public abstract class nl_1
extends EntityLivingBase {
    private Entity bn;
    protected arv_0 bv;
    protected T0 bg;
    private boolean bm;
    protected float[] bz;
    protected F0 bl;
    public int bh = 0;
    private ana_1 bt;
    public BlockPos bu = null;
    private aX5 bo;
    protected int bk;
    protected arv_0 bx;
    private boolean bi;
    private NBTTagCompound bq;
    private ItemStack[] bA = new ItemStack[5];
    private EntityLivingBase by;
    protected py_0 br;
    public int bs;
    public il_0 bp = null;
    private boolean bw;
    private tj_0 bj;
    private static String bf = "CL_00001550";

    @Override
    public void c(int n, ItemStack itemStack) {
        this.bA[n] = itemStack;
    }

    @Override
    public ItemStack d(int n) {
        return this.bA[n];
    }

    protected boolean a(EntityPlayer entityPlayer) {
        return false;
    }

    public boolean B() {
        return true;
    }

    @Override
    public void a(float f) {
        super.a(f);
        this.j(f);
    }

    public void y() {
        this.bm = true;
    }

    private void aa() {
        if (this.bi && this.bq != null) {
            if (tn_0.a(this.bq, a4h_0.i, 4) && tn_0.a(this.bq, a4h_0.O, 4)) {
                UUID uUID = new UUID(tn_0.f(this.bq, a4h_0.o), tn_0.f(this.bq, a4h_0.S));
                Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, EntityLivingBase.class, h__0.d(this.getEntityBoundingBox(), 10.0, 10.0, 10.0)));
                while (dz_0.c(iterator)) {
                    EntityLivingBase entityLivingBase = (EntityLivingBase)dz_0.b(iterator);
                    if (!entityLivingBase.J().equals(uUID)) continue;
                    this.bn = entityLivingBase;
                    break;
                }
            } else if (tn_0.a(this.bq, a4h_0.E, 99) && tn_0.a(this.bq, a4h_0.C, 99) && tn_0.a(this.bq, a4h_0.h, 99)) {
                BlockPos blockPos = new BlockPos(tn_0.g(this.bq, a4h_0.n), tn_0.g(this.bq, a4h_0.u), tn_0.g(this.bq, a4h_0.m));
                nn_1 nn_12 = ala_2.a(this.worldObj, blockPos);
                nn_12 = ala_2.b(this.worldObj, blockPos);
                this.bn = nn_12;
            } else {
                this.a(false, true);
            }
        }
        this.bq = null;
    }

    public void x() {
        if (this.worldObj.isRemote) {
            int n = 0;
            while (true) {
                double d = a5_0.f(this.Q) * 0.02;
                double d2 = a5_0.f(this.Q) * 0.02;
                double d3 = a5_0.f(this.Q) * 0.02;
                double d4 = 10.0;
                aV8.a(this.worldObj, B7.EXPLOSION_NORMAL, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width - d * d4, this.posY + (double)(a5_0.e(this.Q) * this.n) - d2 * d4, this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width - d3 * d4, d, d2, d3, new int[0]);
                ++n;
            }
        }
        aV8.a(this.worldObj, (Entity)this, (byte)20);
    }

    private boolean ah() {
        if (this.j()) {
            return false;
        }
        if (this.a8 > 0) {
            return false;
        }
        if (this.ticksExisted < 20) {
            return false;
        }
        this.d();
        return false;
    }

    protected String ac() {
        return null;
    }

    @Override
    public void a(byte by) {
        if (by == 20) {
            this.x();
        } else {
            super.a(by);
        }
    }

    @Override
    public ItemStack ah() {
        return this.bA[0];
    }

    public ana_1 af() {
        return this.bt;
    }

    @Override
    public void onUpdate() {
        if (ys_2.Q() && this.ah()) {
            this.ai();
        } else {
            super.onUpdate();
            if (!this.worldObj.isRemote) {
                this.A();
            }
        }
    }

    public void a(Entity entity, float f, float f2) {
        double d;
        double d2 = entity.posX - this.posX;
        double d3 = entity.posZ - this.posZ;
        if (entity instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
            d = entityLivingBase.posY + (double)entityLivingBase.w() - (this.posY + (double)this.w());
        } else {
            d = (entity.getEntityBoundingBox().a + entity.getEntityBoundingBox().c) / 2.0 - (this.posY + (double)this.w());
        }
        double d4 = MathHelper.e(d2 * d2 + d3 * d3);
        float f3 = (float)(MathHelper.c(d3, d2) * 180.0 / Math.PI) - 90.0f;
        float f4 = (float)(-(MathHelper.c(d, d4) * 180.0 / Math.PI));
        this.rotationPitch = this.a(this.rotationPitch, f4, f2);
        this.rotationYaw = this.a(this.rotationYaw, f3, f);
    }

    public tj_0 C() {
        return this.bj;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "R|z~$\u001d0 \u0005\u0010~".toCharArray();
        int n2 = 0;
        int n3 = 81;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x40));
            n3 = n3;
        }
    }

    protected F0 a(World world) {
        return new F_(this, world);
    }

    protected void a(ach_0 ach_02) {
        float f = v8_0.b(ach_02);
        if (this.ah() != null && a5_0.e(this.Q) < 0.25f * f) {
            alf_0.b(this.Q, this.ah(), (int)(5.0f + f * (float)a5_0.a(this.Q, 18)));
        }
        int n = 0;
        while (true) {
            ItemStack itemStack = this.a(n);
            if (a5_0.e(this.Q) < 0.5f * f) {
                alf_0.b(this.Q, itemStack, (int)(5.0f + f * (float)a5_0.a(this.Q, 18)));
            }
            ++n;
        }
    }

    public int ag() {
        return 40;
    }

    public float c() {
        return 1.0f;
    }

    public Entity V() {
        return this.bn;
    }

    protected boolean a(ItemStack itemStack) {
        return true;
    }

    public int Q() {
        return 80;
    }

    public boolean aj() {
        return aom_0.g(this.l, 15) != 0;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, a4h_0.F, this.U());
        tn_0.a(nBTTagCompound, a4h_0.l, this.bm);
        NBTTagList nBTTagList = new NBTTagList();
        for (ItemStack itemStack : this.bA) {
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            act_2.a(itemStack, nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, a4h_0.U, nBTTagList);
        NBTTagList nBTTagList2 = new NBTTagList();
        for (float f : this.bz) {
            kv_0.a(nBTTagList2, new aDD(f));
        }
        tn_0.a(nBTTagCompound, a4h_0.J, nBTTagList2);
        tn_0.a(nBTTagCompound, a4h_0.c, this.bi);
        if (this.bn != null) {
            NBTTagCompound nBTTagCompound3 = new NBTTagCompound();
            if (this.bn instanceof EntityLivingBase) {
                tn_0.a(nBTTagCompound3, a4h_0.r, awc_1.b(this.bn.J()));
                tn_0.a(nBTTagCompound3, a4h_0.k, awc_1.a(this.bn.J()));
            } else if (this.bn instanceof nc_2) {
                BlockPos blockPos = m6_0.b((nc_2)this.bn);
                tn_0.b(nBTTagCompound3, a4h_0.s, amv_2.j(blockPos));
                tn_0.b(nBTTagCompound3, a4h_0.H, amv_2.h(blockPos));
                tn_0.b(nBTTagCompound3, a4h_0.p, amv_2.i(blockPos));
            }
            tn_0.a(nBTTagCompound, a4h_0.Q, (NBTBase)nBTTagCompound3);
        }
        if (this.aj()) {
            tn_0.a(nBTTagCompound, a4h_0.R, this.aj());
        }
    }

    public nl_1(World world) {
        super(world);
        this.bz = new float[5];
        this.bx = new arv_0(world.A != null ? world.A : null);
        this.bv = new arv_0(world.A != null ? world.A : null);
        this.bj = new tj_0(this);
        this.br = new py_0(this);
        this.bg = new T0(this);
        this.bo = new aX5(this);
        this.bl = this.a(world);
        this.bt = new ana_1(this);
        for (int i = 0; i < this.bz.length; ++i) {
            this.bz[i] = 0.085f;
        }
        UUID uUID = this.J();
        long l4 = awc_1.a(uUID);
        this.bh = (int)(l4 & Integer.MAX_VALUE);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 15, axt_2.a((byte)0));
    }

    @Override
    public void ak() {
        super.ak();
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.B);
        if (this.n() && a5_0.a(this.Q, 1000) < this.bs++) {
            this.bs = -this.Q();
            this.N();
        }
        ProfilerInvoker.endSection(this.worldObj.A);
    }

    public boolean Y() {
        return aV8.a(this.worldObj, this.getEntityBoundingBox(), this) && ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox())) && !aV8.b(this.worldObj, this.getEntityBoundingBox());
    }

    public T0 d() {
        return this.bg;
    }

    public void N() {
        String string = this.ac();
        this.a(string, this.f(), this.K());
    }

    public boolean U() {
        return this.bw;
    }

    public static int b(ItemStack itemStack) {
        if (act_2.k(itemStack) != px_0.a(Blocks.ap) && act_2.k(itemStack) != Items.skull) {
            if (act_2.k(itemStack) instanceof ItemArmor) {
                switch (((ItemArmor)act_2.k((ItemStack)itemStack)).n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 2;
                    }
                    case 3: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 4;
    }

    public void i(boolean bl) {
        this.bw = bl;
    }

    public boolean ae() {
        return false;
    }

    private float a(float f, float f2, float f3) {
        float f4 = MathHelper.a(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    private void ai() {
        float f;
        ++this.aF;
        if (this instanceof ne_2 && (f = this.b(1.0f)) > 0.5f) {
            this.aF += 2;
        }
        this.R();
    }

    public int al() {
        return 4;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (this.O() && this.V() == entityPlayer) {
            this.a(true, !aSY.a(entityPlayer.abilities));
            return true;
        }
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.lead && this.ab()) {
            if (!(this instanceof no_1) || !aLD.d((no_1)this)) {
                this.a((Entity)entityPlayer, true);
                --itemStack.a;
                return true;
            }
            if (aLD.a((no_1)this, entityPlayer)) {
                this.a((Entity)entityPlayer, true);
                --itemStack.a;
                return true;
            }
        }
        return this.a(entityPlayer) || super.b(entityPlayer);
    }

    protected void a(og_0 og_02) {
        ItemStack itemStack = aec_0.k(og_02);
        int n = nl_1.b(itemStack);
        if (n > -1) {
            Object object;
            ItemStack itemStack2 = this.d(n);
            if (!(act_2.k(itemStack) instanceof LC) || act_2.k(itemStack2) instanceof LC) {
                if (act_2.k(itemStack) instanceof LC && act_2.k(itemStack2) instanceof LC) {
                    object = (LC)act_2.k(itemStack);
                    LC lC = (LC)act_2.k(itemStack2);
                    if (QI.a((LC)object) != QI.a(lC)) {
                        boolean bl = QI.a((LC)object) > QI.a(lC);
                    } else {
                        boolean bl = act_2.c(itemStack) > act_2.c(itemStack2) || act_2.b(itemStack) && !act_2.b(itemStack2);
                    }
                } else if (act_2.k(itemStack) instanceof ItemBow && act_2.k(itemStack2) instanceof ItemBow) {
                    boolean bl = act_2.b(itemStack) && !act_2.b(itemStack2);
                }
            }
            if (this.a(itemStack)) {
                if (a5_0.e(this.Q) - 0.1f < this.bz[n]) {
                    this.a(itemStack2, 0.0f);
                }
                if (act_2.k(itemStack) == Items.diamond && aec_0.i(og_02) != null) {
                    object = aV8.b(this.worldObj, aec_0.i(og_02));
                    a6w_0.a((EntityPlayer)object, apf_0.e);
                }
                this.c(n, itemStack);
                this.bz[n] = 2.0f;
                this.bm = true;
                this.b(og_02, 1);
                og_02.E();
            }
        }
    }

    @Override
    public ItemStack[] ae() {
        return this.bA;
    }

    public py_0 a() {
        return this.br;
    }

    @Override
    public int ah() {
        if (this.ak() == null) {
            return 3;
        }
        int n = (int)(this.a() - this.b() * 0.33f);
        n -= (3 - aYj.a(aV8.p(this.worldObj))) * 4;
        n = 0;
        return n + 3;
    }

    public static Item a(int n, int n2) {
        switch (n) {
            case 4: {
                return Items.leather_helmet;
            }
            case 3: {
                return Items.leather_chestplate;
            }
            case 2: {
                return Items.leather_leggings;
            }
            case 1: {
                return Items.leather_boots;
            }
        }
        return null;
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        if (this.bk > 0) {
            int n = this.bk;
            ItemStack[] itemStackArray = this.ae();
            for (int i = 0; i < itemStackArray.length; ++i) {
                if (itemStackArray[i] == null || !(this.bz[i] <= 1.0f)) continue;
                n += 1 + a5_0.a(this.Q, 3);
            }
            return n;
        }
        return this.bk;
    }

    protected void b(ach_0 ach_02) {
        if (a5_0.e(this.Q) < 0.15f * v8_0.b(ach_02)) {
            int n = a5_0.a(this.Q, 2);
            float f = aV8.p(this.worldObj) == EnumDifficulty.HARD ? 0.1f : 0.25f;
            if (a5_0.e(this.Q) < 0.095f) {
                ++n;
            }
            if (a5_0.e(this.Q) < 0.095f) {
                ++n;
            }
            if (a5_0.e(this.Q) < 0.095f) {
                ++n;
            }
            int n2 = 3;
            while (true) {
                this.a(n2);
                Item item = nl_1.a(n2 + 1, n);
                this.c(n2 + 1, new ItemStack(item));
                --n2;
            }
        }
    }

    public boolean a(Class clazz) {
        return clazz != nw_1.class;
    }

    protected void R() {
        Object object = null;
        Object object2 = aDb.a(ail_0.cS);
        Object object3 = aDb.a(ail_0.h);
        if (this.bm) {
            this.aF = 0;
        } else if ((this.aF & 0x1F) == 31 && (object = aDb.f(ail_0.b3, new Object[]{this})) != object2) {
            if (object == object3) {
                this.aF = 0;
            } else {
                this.E();
            }
        } else {
            EntityPlayer entityPlayer = aV8.a(this.worldObj, (Entity)this, -1.0);
            double d = entityPlayer.posX - this.posX;
            double d2 = entityPlayer.posY - this.posY;
            double d3 = entityPlayer.posZ - this.posZ;
            double d4 = d * d + d2 * d2 + d3 * d3;
            if (this.s() && d4 > 16384.0) {
                this.E();
            }
            if (this.aF > 600 && a5_0.a(this.Q, 800) == 0 && d4 > 1024.0 && this.s()) {
                this.E();
            } else if (d4 < 1024.0) {
                this.aF = 0;
            }
        }
    }

    protected boolean s() {
        return true;
    }

    protected void f() {
    }

    public void n() {
    }

    @Override
    protected float a(float f, float f2) {
        wx_0.a(this.bo);
        return f2;
    }

    public void a(boolean bl, boolean bl2) {
        if (this.bi) {
            this.bi = false;
            this.bn = null;
            if (!this.worldObj.isRemote) {
                this.a(Items.lead, 1);
            }
            if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer) {
                a7Y.b(a3V.a((WorldServer)this.worldObj), this, new S1BPacketEntityAttach(1, this, null));
            }
        }
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(ht_0.b(this.N(), abb_0.c), 16.0);
    }

    public F0 Z() {
        return this.bl;
    }

    public void a(int n, float f) {
        this.bz[n] = f;
    }

    protected Item j() {
        return null;
    }

    protected void A() {
        if (this.bq != null) {
            this.aa();
        }
        if (this.bi) {
            if (!this.n()) {
                this.a(true, true);
            }
            if (this.bn == null || this.bn.isDead) {
                this.a(true, true);
            }
        }
    }

    @Override
    public boolean b(int n, ItemStack itemStack) {
        int n2;
        if (n == 99) {
            n2 = 0;
        } else {
            n2 = n - 100 + 1;
            if (n2 >= this.bA.length) {
                return false;
            }
        }
        if (nl_1.b(itemStack) == n2 || n2 == 4 && act_2.k(itemStack) instanceof ItemBlock) {
            this.c(n2, itemStack);
            return true;
        }
        return false;
    }

    public void j(float f) {
        this.moveForward = f;
    }

    public void j(boolean bl) {
        aom_0.b(this.l, 15, axt_2.a((byte)1));
    }

    @Override
    protected void updateEntityActionState() {
        ++this.aF;
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.A);
        this.R();
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.e);
        aCE.a(this.bt);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.q);
        aMS.a(this.bv);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.I);
        aMS.a(this.bx);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.z);
        tz_1.d(this.bl);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.v);
        this.f();
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.M);
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.x);
        MK.e(this.br);
        ProfilerInvoker.a(this.worldObj.A, a4h_0.L);
        abs_1.d(this.bj);
        ProfilerInvoker.a(this.worldObj.A, a4h_0.K);
        qo_2.b(this.bg);
        ProfilerInvoker.endSection(this.worldObj.A);
        ProfilerInvoker.endSection(this.worldObj.A);
    }

    @Override
    public boolean ad() {
        return super.ad() && !this.aj();
    }

    public void a(Entity entity, boolean bl) {
        this.bi = true;
        this.bn = entity;
        if (!this.worldObj.isRemote && this.worldObj instanceof WorldServer) {
            a7Y.b(a3V.a((WorldServer)this.worldObj), this, new S1BPacketEntityAttach(1, this, this.bn));
        }
    }

    @Override
    public ItemStack a(int n) {
        return this.bA[n + 1];
    }

    public void c(EntityLivingBase entityLivingBase) {
        this.by = entityLivingBase;
        aDb.c(ail_0.aD, new Object[]{this, entityLivingBase});
    }

    public boolean O() {
        return this.bi;
    }

    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        Ma.a(this.a(abb_0.c), new AttributeModifier(a4h_0.a, a5_0.f(this.Q) * 0.05, 1));
        return amk_02;
    }

    @Override
    public boolean at() {
        if (!this.H) {
            zw_1 zw_12 = new zw_1(0, 0, 0);
            int n = 0;
            while (true) {
                double d = this.posX + (double)(((float)((n >> 0) % 2) - 0.5f) * this.width * 0.8f);
                double d2 = this.posY + (double)(((float)((n >> 1) % 2) - 0.5f) * 0.1f);
                double d3 = this.posZ + (double)(((float)((n >> 2) % 2) - 0.5f) * this.width * 0.8f);
                aut_1.a(zw_12, d, d2 + (double)this.w(), d3);
                if (BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(this.worldObj, zw_12)))) {
                    return true;
                }
                ++n;
            }
        }
        return false;
    }

    public boolean ab() {
        return !this.O() && !(this instanceof ar0_0);
    }

    public EntityLivingBase ak() {
        return this.by;
    }

    @Override
    protected void a(boolean bl, int n) {
        for (int i = 0; i < this.ae().length; ++i) {
            ItemStack itemStack = this.d(i);
            boolean bl2 = this.bz[i] > 1.0f;
            if (!(a5_0.e(this.Q) - (float)n * 0.01f < this.bz[i])) continue;
            if (act_2.y(itemStack)) {
                int n2 = MathInvoker.max(act_2.u(itemStack) - 25, 1);
                int n3 = act_2.u(itemStack) - a5_0.a(this.Q, a5_0.a(this.Q, n2) + 1);
                if (n3 > n2) {
                    n3 = n2;
                }
                if (n3 < 1) {
                    n3 = 1;
                }
                act_2.a(itemStack, n3);
            }
            this.a(itemStack, 0.0f);
        }
    }

    @Override
    protected void b(boolean bl, int n) {
        Item item = this.j();
        int n2 = a5_0.a(this.Q, 3);
        n2 += a5_0.a(this.Q, n + 1);
        for (int i = 0; i < n2; ++i) {
            this.a(item, 1);
        }
    }

    public boolean i() {
        return this.bm;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        ProfilerInvoker.startSection(this.worldObj.A, a4h_0.j);
        if (!this.worldObj.isRemote && this.U() && !this.ak && J9.c(aV8.k(this.worldObj), a4h_0.T)) {
            Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, og_0.class, h__0.d(this.getEntityBoundingBox(), 1.0, 0.0, 1.0)));
            while (dz_0.c(iterator)) {
                og_0 og_02 = (og_0)dz_0.b(iterator);
                if (og_02.isDead || aec_0.k(og_02) == null || aec_0.a(og_02)) continue;
                this.a(og_02);
            }
        }
        ProfilerInvoker.endSection(this.worldObj.A);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        int n;
        NBTTagList nBTTagList;
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, a4h_0.t, 1)) {
            this.i(tn_0.c(nBTTagCompound, a4h_0.D));
        }
        this.bm = tn_0.c(nBTTagCompound, a4h_0.G);
        if (tn_0.a(nBTTagCompound, a4h_0.P, 9)) {
            nBTTagList = tn_0.c(nBTTagCompound, a4h_0.N, 10);
            for (n = 0; n < this.bA.length; ++n) {
                this.bA[n] = act_2.a(kv_0.g(nBTTagList, n));
            }
        }
        if (tn_0.a(nBTTagCompound, a4h_0.d, 9)) {
            nBTTagList = tn_0.c(nBTTagCompound, a4h_0.y, 5);
            for (n = 0; n < kv_0.c(nBTTagList); ++n) {
                this.bz[n] = kv_0.b(nBTTagList, n);
            }
        }
        this.bi = tn_0.c(nBTTagCompound, a4h_0.w);
        if (this.bi && tn_0.a(nBTTagCompound, a4h_0.g, 10)) {
            this.bq = tn_0.d(nBTTagCompound, a4h_0.b);
        }
        this.j(tn_0.c(nBTTagCompound, a4h_0.f));
    }
}

