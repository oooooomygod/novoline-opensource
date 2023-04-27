/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Cw
 */
public class cw_0
implements a7K {
    private IChatComponent b;
    private anb_1 a;
    private F8 d;
    private EntityPlayer c;

    @Override
    public EntityPlayer a() {
        return this.c;
    }

    public cw_0(EntityPlayer entityPlayer, IChatComponent iChatComponent) {
        this.c = entityPlayer;
        this.b = iChatComponent;
        this.a = new anb_1(entityPlayer, this);
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.b != null ? this.b : new aoz_1(aoj_2.a, new Object[0]);
    }

    @Override
    public void a(F8 f8) {
        this.d = f8;
    }

    @Override
    public void a(ahh_0 ahh_02) {
        aEU.d(ahh_02);
    }

    @Override
    public F8 b(EntityPlayer entityPlayer) {
        return this.d;
    }

    @Override
    public void a(EntityPlayer entityPlayer) {
    }

    @Override
    public void a(ItemStack itemStack) {
    }
}

