/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class _Q
extends _v_0 {
    private EntityPlayer d;
    private float c;
    private World b;
    private int f;
    private nf_1 e;

    public _Q(nf_1 nf_12, float f) {
        this.e = nf_12;
        this.b = nf_12.worldObj;
        this.c = f;
        this.a(2);
    }

    @Override
    public void b() {
        QV.a(this.e, true);
        this.f = 40 + a5_0.a(QV.i(this.e), 40);
    }

    private boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        return !QV.d(this.e) && act_2.k(itemStack) == Items.bone || QV.a(this.e, itemStack);
    }

    @Override
    public void a() {
        QV.a(this.e, false);
        this.d = null;
    }

    @Override
    public void d() {
        abs_1.a(QV.g(this.e), this.d.posX, this.d.posY + (double)a6w_0.q(this.d), this.d.posZ, 10.0f, QV.a(this.e));
        --this.f;
    }

    @Override
    public boolean f() {
        return a6w_0.c(this.d) && !(QV.a(this.e, this.d) > (double)(this.c * this.c)) && this.f > 0 && this.a(this.d);
    }

    @Override
    public boolean g() {
        this.d = aV8.a(this.b, (Entity)this.e, this.c);
        return this.d != null && this.a(this.d);
    }
}

