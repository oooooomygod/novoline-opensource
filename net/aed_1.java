/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aeD
 */
public class aed_1
extends DamageSource {
    protected Entity A;
    private boolean z = false;

    @Override
    public Entity h() {
        return this.A;
    }

    @Override
    public IChatComponent a(EntityLivingBase entityLivingBase) {
        ItemStack itemStack = this.A instanceof EntityLivingBase ? atn_0.z((EntityLivingBase)this.A) : null;
        String string = aL0.a(aL0.a(new StringBuilder(), a41.a), this.t).toString();
        String string2 = aL0.a(aL0.a(new StringBuilder(), string), a41.b).toString();
        return act_2.g(itemStack) && ahq_0.a(string2) ? new aoz_1(string2, atn_0.C(entityLivingBase), ayj_0.P(this.A), act_2.B(itemStack)) : new aoz_1(string, atn_0.C(entityLivingBase), ayj_0.P(this.A));
    }

    public boolean c() {
        return this.z;
    }

    @Override
    public boolean p() {
        return this.A != null && this.A instanceof EntityLivingBase && !(this.A instanceof EntityPlayer);
    }

    public aed_1(String string, Entity entity) {
        super(string);
        this.A = entity;
    }

    @Override
    public aed_1 a() {
        this.z = true;
        return this;
    }
}

