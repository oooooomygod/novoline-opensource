/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aea
 */
public class aea_2
extends aed_1 {
    private Entity B;

    public aea_2(String string, Entity entity, Entity entity2) {
        super(string, entity);
        this.B = entity2;
    }

    @Override
    public Entity o() {
        return this.A;
    }

    @Override
    public IChatComponent a(EntityLivingBase entityLivingBase) {
        IChatComponent iChatComponent = this.B == null ? ayj_0.P(this.A) : ayj_0.P(this.B);
        ItemStack itemStack = this.B instanceof EntityLivingBase ? atn_0.z((EntityLivingBase)this.B) : null;
        String string = aL0.a(aL0.a(new StringBuilder(), kh_1.a), this.t).toString();
        String string2 = aL0.a(aL0.a(new StringBuilder(), string), kh_1.b).toString();
        return act_2.g(itemStack) && ahq_0.a(string2) ? new aoz_1(string2, atn_0.C(entityLivingBase), iChatComponent, act_2.B(itemStack)) : new aoz_1(string, atn_0.C(entityLivingBase), iChatComponent);
    }

    @Override
    public Entity h() {
        return this.B;
    }
}

