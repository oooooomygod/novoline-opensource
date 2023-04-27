/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.IChatComponent;

public class a5B
implements dv_1 {
    private IChatComponent b;
    private String a;

    @Override
    public String b() {
        return this.a;
    }

    public a5B(String string, IChatComponent iChatComponent) {
        this.a = string;
        this.b = iChatComponent;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public IChatComponent getDisplayName() {
        return this.b;
    }

    @Override
    public String getName() {
        return aBO.d(this.b);
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        throw new UnsupportedOperationException();
    }
}

