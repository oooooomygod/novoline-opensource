/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.n4
 */
public abstract class n4_0
extends nu_1 {
    protected int bK;
    private float bI;
    protected int bL;
    protected int bH;
    private float bJ = -1.0f;

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.k(tn_0.g(nBTTagCompound, yf_0.a));
        this.bK = tn_0.g(nBTTagCompound, yf_0.d);
    }

    public n4_0(World world) {
        super(world);
    }

    public void j(int n) {
        this.b(n, false);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, yf_0.c, this.e());
        tn_0.b(nBTTagCompound, yf_0.b, this.bK);
    }

    public void k(boolean bl) {
        this.l(0.5f);
    }

    @Override
    public boolean j() {
        return this.e() < 0;
    }

    @Override
    protected void c(float f, float f2) {
        boolean bl = this.bJ > 0.0f;
        this.bJ = f;
        this.bI = f2;
        this.l(1.0f);
    }

    protected void l(float f) {
        super.c(this.bJ * f, this.bI * f);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (this.worldObj.isRemote) {
            if (this.bL > 0) {
                if (this.bL % 4 == 0) {
                    aV8.a(this.worldObj, B7.VILLAGER_HAPPY, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, 0.0, 0.0, 0.0, new int[0]);
                }
                --this.bL;
            }
            this.k(this.j());
        } else {
            int n = this.e();
            this.k(++n);
            this.d();
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.spawn_egg) {
            if (!this.worldObj.isRemote) {
                Class clazz = ub_1.b(act_2.c(itemStack));
                if (this.getClass() == clazz) {
                    n4_0 n4_02 = this.a(this);
                    n4_02.k(-24000);
                    n4_02.c(this.posX, this.posY, this.posZ, 0.0f, 0.0f);
                    aV8.b(this.worldObj, n4_02);
                    if (act_2.g(itemStack)) {
                        n4_02.a(act_2.w(itemStack));
                    }
                    if (!aSY.a(entityPlayer.abilities)) {
                        --itemStack.a;
                        if (itemStack.a <= 0) {
                            InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    protected void d() {
    }

    public void b(int n, boolean bl) {
        int n2;
        int n3 = n2 = this.e();
        n2 += n * 20;
        n2 = 0;
        this.d();
        int n4 = n2 - n3;
        this.k(n2);
        this.bK += n4;
        if (this.bL == 0) {
            this.bL = 40;
        }
        if (this.e() == 0) {
            this.k(this.bK);
        }
    }

    public void k(int n) {
        aom_0.b(this.l, 12, axt_2.a((byte)MathHelper.a(n, -1, 1)));
        this.bH = n;
        this.k(this.j());
    }

    public abstract n4_0 a(n4_0 var1);

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 12, axt_2.a((byte)0));
    }

    public int e() {
        return this.worldObj.isRemote ? (int)aom_0.g(this.l, 12) : this.bH;
    }
}

