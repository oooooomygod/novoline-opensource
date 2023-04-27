/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nh
 */
public class nh_1
extends n5_0 {
    private _I bP;

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.l(tn_0.c(nBTTagCompound, axk_2.b));
    }

    @Override
    public void b(float f, float f2) {
        super.b(f, f2);
        if (f > 5.0f && this.h instanceof EntityPlayer) {
            a6w_0.a((EntityPlayer)this.h, apf_0.b);
        }
    }

    @Override
    protected String d() {
        return axk_2.f;
    }

    public boolean d() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
        Ma.a(this.a(abb_0.e), 0.25);
    }

    public _I a() {
        return this.bP;
    }

    @Override
    public void a(ou_2 ou_22) {
        if (!this.worldObj.isRemote && !this.isDead) {
            n__0 n__02 = new n__0(this.worldObj);
            n__02.c(0, new ItemStack(Items.golden_sword));
            n__02.c(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            n__02.j(this.aj());
            if (this.e()) {
                n__02.a(this.y());
                n__02.g(this.aA());
            }
            aV8.b(this.worldObj, n__02);
            this.E();
        }
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.carrot;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, axk_2.d, this.d());
    }

    @Override
    public boolean ae() {
        ItemStack itemStack = ((EntityPlayer)this.h).ah();
        return act_2.k(itemStack) == Items.carrot_on_a_stick;
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(axk_2.e, 0.15f, 1.0f);
    }

    @Override
    protected String C() {
        return axk_2.a;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        if (super.a(entityPlayer)) {
            return true;
        }
        if (!this.d() || this.worldObj.isRemote || this.h != null && this.h != entityPlayer) {
            return false;
        }
        entityPlayer.mountEntity(this);
        return true;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 3) + 1 + a5_0.a(this.Q, 1 + n);
        for (int i = 0; i < n2; ++i) {
            if (this.ag()) {
                this.a(Items.cooked_porkchop, 1);
                continue;
            }
            this.a(Items.porkchop, 1);
        }
        if (this.d()) {
            this.a(Items.saddle, 1);
        }
    }

    public void l(boolean bl) {
        aom_0.b(this.l, 16, axt_2.a((byte)1));
    }

    @Override
    protected String ac() {
        return axk_2.c;
    }

    @Override
    protected Item j() {
        return this.ag() ? Items.cooked_porkchop : Items.porkchop;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    public nh_1(World world) {
        super(world);
        this.c(0.9f, 0.9f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _e_0(this, 1.25));
        this.bP = new _I(this, 0.3f);
        aMS.a(this.bx, 2, this.bP);
        aMS.a(this.bx, 3, new _h_0(this, 1.0));
        aMS.a(this.bx, 4, new _b_0(this, 1.2, Items.carrot_on_a_stick, false));
        aMS.a(this.bx, 4, new _b_0(this, 1.2, Items.carrot, false));
        aMS.a(this.bx, 5, new _D(this, 1.1));
        aMS.a(this.bx, 6, new _J(this, 1.0));
        aMS.a(this.bx, 7, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 8, new _A(this));
    }

    @Override
    public nh_1 a(n4_0 n4_02) {
        return new nh_1(this.worldObj);
    }
}

