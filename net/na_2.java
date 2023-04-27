/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.na
 */
public class na_2
extends n5_0 {
    @Override
    protected Item j() {
        return Items.leather;
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(awy_0.d, 0.15f, 1.0f);
    }

    @Override
    public na_2 a(n4_0 n4_02) {
        return new na_2(this.worldObj);
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3 = a5_0.a(this.Q, 3) + a5_0.a(this.Q, 1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.leather, 1);
        }
        n3 = a5_0.a(this.Q, 3) + 1 + a5_0.a(this.Q, 1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            if (this.ag()) {
                this.a(Items.cooked_beef, 1);
                continue;
            }
            this.a(Items.beef, 1);
        }
    }

    @Override
    public float w() {
        return this.n;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (act_2.k(itemStack) == Items.bucket && !aSY.a(entityPlayer.abilities) && !this.j()) {
            if (itemStack.a-- == 1) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, new ItemStack(Items.milk_bucket));
            } else if (!InventoryInvoker.b(entityPlayer.inventory, new ItemStack(Items.milk_bucket))) {
                a6w_0.a(entityPlayer, new ItemStack(Items.milk_bucket, 1, 0), false);
            }
            return true;
        }
        return super.a(entityPlayer);
    }

    @Override
    protected float f() {
        return 0.4f;
    }

    @Override
    protected String d() {
        return awy_0.a;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
        Ma.a(this.a(abb_0.e), 0.2f);
    }

    @Override
    protected String ac() {
        return awy_0.b;
    }

    @Override
    protected String C() {
        return awy_0.c;
    }

    public na_2(World world) {
        super(world);
        this.c(0.9f, 1.3f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _e_0(this, 2.0));
        aMS.a(this.bx, 2, new _h_0(this, 1.0));
        aMS.a(this.bx, 3, new _b_0(this, 1.25, Items.wheat, false));
        aMS.a(this.bx, 4, new _D(this, 1.25));
        aMS.a(this.bx, 5, new _J(this, 1.0));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 7, new _A(this));
    }
}

