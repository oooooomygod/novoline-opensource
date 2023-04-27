/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import java.util.Iterator;
import java.util.List;
import net.MathHelper;
import net.PL;
import net.a6w_0;
import net.dz_0;
import net.ye_0;

/*
 * Renamed from net.Yz
 */
public class yz_0
extends ye_0 {
    @Override
    public boolean c() {
        return true;
    }

    @Override
    public int a(List<EntityPlayer> list) {
        float f = 0.0f;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
            f += a6w_0.z(entityPlayer) + a6w_0.k(entityPlayer);
        }
        if (!ListInvoker.isEmpty(list)) {
            f /= (float)ListInvoker.size(list);
        }
        return MathHelper.c(f);
    }

    public yz_0(String string) {
        super(string);
    }

    @Override
    public PL b() {
        return PL.HEARTS;
    }
}

