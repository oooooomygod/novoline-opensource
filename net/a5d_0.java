/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityPlayer;
import net.a6w_0;

/*
 * Renamed from net.a5d
 */
class a5d_0
implements Predicate<Entity> {
    a5d_0() {
    }

    public boolean a(Entity entity) {
        return !(entity instanceof EntityPlayer) || !a6w_0.l((EntityPlayer)entity);
    }
}

